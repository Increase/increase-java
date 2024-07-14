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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Entities are the legal entities that own accounts. They can be people, corporations,
 * partnerships, government authorities, or trusts.
 */
@JsonDeserialize(builder = Entity.Builder::class)
@NoAutoDetect
class Entity
private constructor(
    private val corporation: JsonField<Corporation>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val detailsConfirmedAt: JsonField<OffsetDateTime>,
    private val governmentAuthority: JsonField<GovernmentAuthority>,
    private val id: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val joint: JsonField<Joint>,
    private val naturalPerson: JsonField<NaturalPerson>,
    private val status: JsonField<Status>,
    private val structure: JsonField<Structure>,
    private val supplementalDocuments: JsonField<List<EntitySupplementalDocument>>,
    private val trust: JsonField<Trust>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * Details of the corporation entity. Will be present if `structure` is equal to `corporation`.
     */
    fun corporation(): Optional<Corporation> =
        Optional.ofNullable(corporation.getNullable("corporation"))

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Entity was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The entity's description for display purposes. */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Entity's details
     * were most recently confirmed.
     */
    fun detailsConfirmedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(detailsConfirmedAt.getNullable("details_confirmed_at"))

    /**
     * Details of the government authority entity. Will be present if `structure` is equal to
     * `government_authority`.
     */
    fun governmentAuthority(): Optional<GovernmentAuthority> =
        Optional.ofNullable(governmentAuthority.getNullable("government_authority"))

    /** The entity's identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /** Details of the joint entity. Will be present if `structure` is equal to `joint`. */
    fun joint(): Optional<Joint> = Optional.ofNullable(joint.getNullable("joint"))

    /**
     * Details of the natural person entity. Will be present if `structure` is equal to
     * `natural_person`.
     */
    fun naturalPerson(): Optional<NaturalPerson> =
        Optional.ofNullable(naturalPerson.getNullable("natural_person"))

    /** The status of the entity. */
    fun status(): Status = status.getRequired("status")

    /** The entity's legal structure. */
    fun structure(): Structure = structure.getRequired("structure")

    /**
     * Additional documentation associated with the entity. This is limited to the first 10
     * documents for an entity. If an entity has more than 10 documents, use the GET
     * /entity_supplemental_documents list endpoint to retrieve them.
     */
    fun supplementalDocuments(): List<EntitySupplementalDocument> =
        supplementalDocuments.getRequired("supplemental_documents")

    /** Details of the trust entity. Will be present if `structure` is equal to `trust`. */
    fun trust(): Optional<Trust> = Optional.ofNullable(trust.getNullable("trust"))

    /** A constant representing the object's type. For this resource it will always be `entity`. */
    fun type(): Type = type.getRequired("type")

    /**
     * Details of the corporation entity. Will be present if `structure` is equal to `corporation`.
     */
    @JsonProperty("corporation") @ExcludeMissing fun _corporation() = corporation

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Entity was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The entity's description for display purposes. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Entity's details
     * were most recently confirmed.
     */
    @JsonProperty("details_confirmed_at")
    @ExcludeMissing
    fun _detailsConfirmedAt() = detailsConfirmedAt

    /**
     * Details of the government authority entity. Will be present if `structure` is equal to
     * `government_authority`.
     */
    @JsonProperty("government_authority")
    @ExcludeMissing
    fun _governmentAuthority() = governmentAuthority

    /** The entity's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /** Details of the joint entity. Will be present if `structure` is equal to `joint`. */
    @JsonProperty("joint") @ExcludeMissing fun _joint() = joint

    /**
     * Details of the natural person entity. Will be present if `structure` is equal to
     * `natural_person`.
     */
    @JsonProperty("natural_person") @ExcludeMissing fun _naturalPerson() = naturalPerson

    /** The status of the entity. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The entity's legal structure. */
    @JsonProperty("structure") @ExcludeMissing fun _structure() = structure

    /**
     * Additional documentation associated with the entity. This is limited to the first 10
     * documents for an entity. If an entity has more than 10 documents, use the GET
     * /entity_supplemental_documents list endpoint to retrieve them.
     */
    @JsonProperty("supplemental_documents")
    @ExcludeMissing
    fun _supplementalDocuments() = supplementalDocuments

    /** Details of the trust entity. Will be present if `structure` is equal to `trust`. */
    @JsonProperty("trust") @ExcludeMissing fun _trust() = trust

    /** A constant representing the object's type. For this resource it will always be `entity`. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Entity = apply {
        if (!validated) {
            corporation().map { it.validate() }
            createdAt()
            description()
            detailsConfirmedAt()
            governmentAuthority().map { it.validate() }
            id()
            idempotencyKey()
            joint().map { it.validate() }
            naturalPerson().map { it.validate() }
            status()
            structure()
            supplementalDocuments().forEach { it.validate() }
            trust().map { it.validate() }
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Entity &&
            this.corporation == other.corporation &&
            this.createdAt == other.createdAt &&
            this.description == other.description &&
            this.detailsConfirmedAt == other.detailsConfirmedAt &&
            this.governmentAuthority == other.governmentAuthority &&
            this.id == other.id &&
            this.idempotencyKey == other.idempotencyKey &&
            this.joint == other.joint &&
            this.naturalPerson == other.naturalPerson &&
            this.status == other.status &&
            this.structure == other.structure &&
            this.supplementalDocuments == other.supplementalDocuments &&
            this.trust == other.trust &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    corporation,
                    createdAt,
                    description,
                    detailsConfirmedAt,
                    governmentAuthority,
                    id,
                    idempotencyKey,
                    joint,
                    naturalPerson,
                    status,
                    structure,
                    supplementalDocuments,
                    trust,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Entity{corporation=$corporation, createdAt=$createdAt, description=$description, detailsConfirmedAt=$detailsConfirmedAt, governmentAuthority=$governmentAuthority, id=$id, idempotencyKey=$idempotencyKey, joint=$joint, naturalPerson=$naturalPerson, status=$status, structure=$structure, supplementalDocuments=$supplementalDocuments, trust=$trust, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var corporation: JsonField<Corporation> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var detailsConfirmedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var governmentAuthority: JsonField<GovernmentAuthority> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var joint: JsonField<Joint> = JsonMissing.of()
        private var naturalPerson: JsonField<NaturalPerson> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var structure: JsonField<Structure> = JsonMissing.of()
        private var supplementalDocuments: JsonField<List<EntitySupplementalDocument>> =
            JsonMissing.of()
        private var trust: JsonField<Trust> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(entity: Entity) = apply {
            this.corporation = entity.corporation
            this.createdAt = entity.createdAt
            this.description = entity.description
            this.detailsConfirmedAt = entity.detailsConfirmedAt
            this.governmentAuthority = entity.governmentAuthority
            this.id = entity.id
            this.idempotencyKey = entity.idempotencyKey
            this.joint = entity.joint
            this.naturalPerson = entity.naturalPerson
            this.status = entity.status
            this.structure = entity.structure
            this.supplementalDocuments = entity.supplementalDocuments
            this.trust = entity.trust
            this.type = entity.type
            additionalProperties(entity.additionalProperties)
        }

        /**
         * Details of the corporation entity. Will be present if `structure` is equal to
         * `corporation`.
         */
        fun corporation(corporation: Corporation) = corporation(JsonField.of(corporation))

        /**
         * Details of the corporation entity. Will be present if `structure` is equal to
         * `corporation`.
         */
        @JsonProperty("corporation")
        @ExcludeMissing
        fun corporation(corporation: JsonField<Corporation>) = apply {
            this.corporation = corporation
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Entity was
         * created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Entity was
         * created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The entity's description for display purposes. */
        fun description(description: String) = description(JsonField.of(description))

        /** The entity's description for display purposes. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Entity's details
         * were most recently confirmed.
         */
        fun detailsConfirmedAt(detailsConfirmedAt: OffsetDateTime) =
            detailsConfirmedAt(JsonField.of(detailsConfirmedAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Entity's details
         * were most recently confirmed.
         */
        @JsonProperty("details_confirmed_at")
        @ExcludeMissing
        fun detailsConfirmedAt(detailsConfirmedAt: JsonField<OffsetDateTime>) = apply {
            this.detailsConfirmedAt = detailsConfirmedAt
        }

        /**
         * Details of the government authority entity. Will be present if `structure` is equal to
         * `government_authority`.
         */
        fun governmentAuthority(governmentAuthority: GovernmentAuthority) =
            governmentAuthority(JsonField.of(governmentAuthority))

        /**
         * Details of the government authority entity. Will be present if `structure` is equal to
         * `government_authority`.
         */
        @JsonProperty("government_authority")
        @ExcludeMissing
        fun governmentAuthority(governmentAuthority: JsonField<GovernmentAuthority>) = apply {
            this.governmentAuthority = governmentAuthority
        }

        /** The entity's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The entity's identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String) = idempotencyKey(JsonField.of(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /** Details of the joint entity. Will be present if `structure` is equal to `joint`. */
        fun joint(joint: Joint) = joint(JsonField.of(joint))

        /** Details of the joint entity. Will be present if `structure` is equal to `joint`. */
        @JsonProperty("joint")
        @ExcludeMissing
        fun joint(joint: JsonField<Joint>) = apply { this.joint = joint }

        /**
         * Details of the natural person entity. Will be present if `structure` is equal to
         * `natural_person`.
         */
        fun naturalPerson(naturalPerson: NaturalPerson) = naturalPerson(JsonField.of(naturalPerson))

        /**
         * Details of the natural person entity. Will be present if `structure` is equal to
         * `natural_person`.
         */
        @JsonProperty("natural_person")
        @ExcludeMissing
        fun naturalPerson(naturalPerson: JsonField<NaturalPerson>) = apply {
            this.naturalPerson = naturalPerson
        }

        /** The status of the entity. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the entity. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The entity's legal structure. */
        fun structure(structure: Structure) = structure(JsonField.of(structure))

        /** The entity's legal structure. */
        @JsonProperty("structure")
        @ExcludeMissing
        fun structure(structure: JsonField<Structure>) = apply { this.structure = structure }

        /**
         * Additional documentation associated with the entity. This is limited to the first 10
         * documents for an entity. If an entity has more than 10 documents, use the GET
         * /entity_supplemental_documents list endpoint to retrieve them.
         */
        fun supplementalDocuments(supplementalDocuments: List<EntitySupplementalDocument>) =
            supplementalDocuments(JsonField.of(supplementalDocuments))

        /**
         * Additional documentation associated with the entity. This is limited to the first 10
         * documents for an entity. If an entity has more than 10 documents, use the GET
         * /entity_supplemental_documents list endpoint to retrieve them.
         */
        @JsonProperty("supplemental_documents")
        @ExcludeMissing
        fun supplementalDocuments(
            supplementalDocuments: JsonField<List<EntitySupplementalDocument>>
        ) = apply { this.supplementalDocuments = supplementalDocuments }

        /** Details of the trust entity. Will be present if `structure` is equal to `trust`. */
        fun trust(trust: Trust) = trust(JsonField.of(trust))

        /** Details of the trust entity. Will be present if `structure` is equal to `trust`. */
        @JsonProperty("trust")
        @ExcludeMissing
        fun trust(trust: JsonField<Trust>) = apply { this.trust = trust }

        /**
         * A constant representing the object's type. For this resource it will always be `entity`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be `entity`.
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

        fun build(): Entity =
            Entity(
                corporation,
                createdAt,
                description,
                detailsConfirmedAt,
                governmentAuthority,
                id,
                idempotencyKey,
                joint,
                naturalPerson,
                status,
                structure,
                supplementalDocuments.map { it.toUnmodifiable() },
                trust,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    /**
     * Details of the corporation entity. Will be present if `structure` is equal to `corporation`.
     */
    @JsonDeserialize(builder = Corporation.Builder::class)
    @NoAutoDetect
    class Corporation
    private constructor(
        private val name: JsonField<String>,
        private val website: JsonField<String>,
        private val taxIdentifier: JsonField<String>,
        private val incorporationState: JsonField<String>,
        private val industryCode: JsonField<String>,
        private val address: JsonField<Address>,
        private val beneficialOwners: JsonField<List<BeneficialOwner>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The legal name of the corporation. */
        fun name(): String = name.getRequired("name")

        /** The website of the corporation. */
        fun website(): Optional<String> = Optional.ofNullable(website.getNullable("website"))

        /** The Employer Identification Number (EIN) for the corporation. */
        fun taxIdentifier(): Optional<String> =
            Optional.ofNullable(taxIdentifier.getNullable("tax_identifier"))

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the corporation's
         * state of incorporation.
         */
        fun incorporationState(): Optional<String> =
            Optional.ofNullable(incorporationState.getNullable("incorporation_state"))

        /**
         * The numeric North American Industry Classification System (NAICS) code submitted for the
         * corporation.
         */
        fun industryCode(): Optional<String> =
            Optional.ofNullable(industryCode.getNullable("industry_code"))

        /** The corporation's address. */
        fun address(): Address = address.getRequired("address")

        /**
         * The identifying details of anyone controlling or owning 25% or more of the corporation.
         */
        fun beneficialOwners(): List<BeneficialOwner> =
            beneficialOwners.getRequired("beneficial_owners")

        /** The legal name of the corporation. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** The website of the corporation. */
        @JsonProperty("website") @ExcludeMissing fun _website() = website

        /** The Employer Identification Number (EIN) for the corporation. */
        @JsonProperty("tax_identifier") @ExcludeMissing fun _taxIdentifier() = taxIdentifier

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the corporation's
         * state of incorporation.
         */
        @JsonProperty("incorporation_state")
        @ExcludeMissing
        fun _incorporationState() = incorporationState

        /**
         * The numeric North American Industry Classification System (NAICS) code submitted for the
         * corporation.
         */
        @JsonProperty("industry_code") @ExcludeMissing fun _industryCode() = industryCode

        /** The corporation's address. */
        @JsonProperty("address") @ExcludeMissing fun _address() = address

        /**
         * The identifying details of anyone controlling or owning 25% or more of the corporation.
         */
        @JsonProperty("beneficial_owners")
        @ExcludeMissing
        fun _beneficialOwners() = beneficialOwners

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Corporation = apply {
            if (!validated) {
                name()
                website()
                taxIdentifier()
                incorporationState()
                industryCode()
                address().validate()
                beneficialOwners().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Corporation &&
                this.name == other.name &&
                this.website == other.website &&
                this.taxIdentifier == other.taxIdentifier &&
                this.incorporationState == other.incorporationState &&
                this.industryCode == other.industryCode &&
                this.address == other.address &&
                this.beneficialOwners == other.beneficialOwners &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        website,
                        taxIdentifier,
                        incorporationState,
                        industryCode,
                        address,
                        beneficialOwners,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Corporation{name=$name, website=$website, taxIdentifier=$taxIdentifier, incorporationState=$incorporationState, industryCode=$industryCode, address=$address, beneficialOwners=$beneficialOwners, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var website: JsonField<String> = JsonMissing.of()
            private var taxIdentifier: JsonField<String> = JsonMissing.of()
            private var incorporationState: JsonField<String> = JsonMissing.of()
            private var industryCode: JsonField<String> = JsonMissing.of()
            private var address: JsonField<Address> = JsonMissing.of()
            private var beneficialOwners: JsonField<List<BeneficialOwner>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(corporation: Corporation) = apply {
                this.name = corporation.name
                this.website = corporation.website
                this.taxIdentifier = corporation.taxIdentifier
                this.incorporationState = corporation.incorporationState
                this.industryCode = corporation.industryCode
                this.address = corporation.address
                this.beneficialOwners = corporation.beneficialOwners
                additionalProperties(corporation.additionalProperties)
            }

            /** The legal name of the corporation. */
            fun name(name: String) = name(JsonField.of(name))

            /** The legal name of the corporation. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The website of the corporation. */
            fun website(website: String) = website(JsonField.of(website))

            /** The website of the corporation. */
            @JsonProperty("website")
            @ExcludeMissing
            fun website(website: JsonField<String>) = apply { this.website = website }

            /** The Employer Identification Number (EIN) for the corporation. */
            fun taxIdentifier(taxIdentifier: String) = taxIdentifier(JsonField.of(taxIdentifier))

            /** The Employer Identification Number (EIN) for the corporation. */
            @JsonProperty("tax_identifier")
            @ExcludeMissing
            fun taxIdentifier(taxIdentifier: JsonField<String>) = apply {
                this.taxIdentifier = taxIdentifier
            }

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the corporation's
             * state of incorporation.
             */
            fun incorporationState(incorporationState: String) =
                incorporationState(JsonField.of(incorporationState))

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the corporation's
             * state of incorporation.
             */
            @JsonProperty("incorporation_state")
            @ExcludeMissing
            fun incorporationState(incorporationState: JsonField<String>) = apply {
                this.incorporationState = incorporationState
            }

            /**
             * The numeric North American Industry Classification System (NAICS) code submitted for
             * the corporation.
             */
            fun industryCode(industryCode: String) = industryCode(JsonField.of(industryCode))

            /**
             * The numeric North American Industry Classification System (NAICS) code submitted for
             * the corporation.
             */
            @JsonProperty("industry_code")
            @ExcludeMissing
            fun industryCode(industryCode: JsonField<String>) = apply {
                this.industryCode = industryCode
            }

            /** The corporation's address. */
            fun address(address: Address) = address(JsonField.of(address))

            /** The corporation's address. */
            @JsonProperty("address")
            @ExcludeMissing
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /**
             * The identifying details of anyone controlling or owning 25% or more of the
             * corporation.
             */
            fun beneficialOwners(beneficialOwners: List<BeneficialOwner>) =
                beneficialOwners(JsonField.of(beneficialOwners))

            /**
             * The identifying details of anyone controlling or owning 25% or more of the
             * corporation.
             */
            @JsonProperty("beneficial_owners")
            @ExcludeMissing
            fun beneficialOwners(beneficialOwners: JsonField<List<BeneficialOwner>>) = apply {
                this.beneficialOwners = beneficialOwners
            }

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

            fun build(): Corporation =
                Corporation(
                    name,
                    website,
                    taxIdentifier,
                    incorporationState,
                    industryCode,
                    address,
                    beneficialOwners.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** The corporation's address. */
        @JsonDeserialize(builder = Address.Builder::class)
        @NoAutoDetect
        class Address
        private constructor(
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val city: JsonField<String>,
            private val state: JsonField<String>,
            private val zip: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The first line of the address. */
            fun line1(): String = line1.getRequired("line1")

            /** The second line of the address. */
            fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

            /** The city of the address. */
            fun city(): String = city.getRequired("city")

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            fun state(): String = state.getRequired("state")

            /** The ZIP code of the address. */
            fun zip(): String = zip.getRequired("zip")

            /** The first line of the address. */
            @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

            /** The second line of the address. */
            @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

            /** The city of the address. */
            @JsonProperty("city") @ExcludeMissing fun _city() = city

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") @ExcludeMissing fun _state() = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") @ExcludeMissing fun _zip() = zip

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Address = apply {
                if (!validated) {
                    line1()
                    line2()
                    city()
                    state()
                    zip()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Address &&
                    this.line1 == other.line1 &&
                    this.line2 == other.line2 &&
                    this.city == other.city &&
                    this.state == other.state &&
                    this.zip == other.zip &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            line1,
                            line2,
                            city,
                            state,
                            zip,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Address{line1=$line1, line2=$line2, city=$city, state=$state, zip=$zip, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var line1: JsonField<String> = JsonMissing.of()
                private var line2: JsonField<String> = JsonMissing.of()
                private var city: JsonField<String> = JsonMissing.of()
                private var state: JsonField<String> = JsonMissing.of()
                private var zip: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    this.line1 = address.line1
                    this.line2 = address.line2
                    this.city = address.city
                    this.state = address.state
                    this.zip = address.zip
                    additionalProperties(address.additionalProperties)
                }

                /** The first line of the address. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /** The first line of the address. */
                @JsonProperty("line1")
                @ExcludeMissing
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The second line of the address. */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /** The second line of the address. */
                @JsonProperty("line2")
                @ExcludeMissing
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                /** The city of the address. */
                fun city(city: String) = city(JsonField.of(city))

                /** The city of the address. */
                @JsonProperty("city")
                @ExcludeMissing
                fun city(city: JsonField<String>) = apply { this.city = city }

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                fun state(state: String) = state(JsonField.of(state))

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                @JsonProperty("state")
                @ExcludeMissing
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The ZIP code of the address. */
                fun zip(zip: String) = zip(JsonField.of(zip))

                /** The ZIP code of the address. */
                @JsonProperty("zip")
                @ExcludeMissing
                fun zip(zip: JsonField<String>) = apply { this.zip = zip }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Address =
                    Address(
                        line1,
                        line2,
                        city,
                        state,
                        zip,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = BeneficialOwner.Builder::class)
        @NoAutoDetect
        class BeneficialOwner
        private constructor(
            private val individual: JsonField<Individual>,
            private val companyTitle: JsonField<String>,
            private val prong: JsonField<Prong>,
            private val beneficialOwnerId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Personal details for the beneficial owner. */
            fun individual(): Individual = individual.getRequired("individual")

            /** This person's role or title within the entity. */
            fun companyTitle(): Optional<String> =
                Optional.ofNullable(companyTitle.getNullable("company_title"))

            /** Why this person is considered a beneficial owner of the entity. */
            fun prong(): Prong = prong.getRequired("prong")

            /** The identifier of this beneficial owner. */
            fun beneficialOwnerId(): String = beneficialOwnerId.getRequired("beneficial_owner_id")

            /** Personal details for the beneficial owner. */
            @JsonProperty("individual") @ExcludeMissing fun _individual() = individual

            /** This person's role or title within the entity. */
            @JsonProperty("company_title") @ExcludeMissing fun _companyTitle() = companyTitle

            /** Why this person is considered a beneficial owner of the entity. */
            @JsonProperty("prong") @ExcludeMissing fun _prong() = prong

            /** The identifier of this beneficial owner. */
            @JsonProperty("beneficial_owner_id")
            @ExcludeMissing
            fun _beneficialOwnerId() = beneficialOwnerId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BeneficialOwner = apply {
                if (!validated) {
                    individual().validate()
                    companyTitle()
                    prong()
                    beneficialOwnerId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BeneficialOwner &&
                    this.individual == other.individual &&
                    this.companyTitle == other.companyTitle &&
                    this.prong == other.prong &&
                    this.beneficialOwnerId == other.beneficialOwnerId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            individual,
                            companyTitle,
                            prong,
                            beneficialOwnerId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "BeneficialOwner{individual=$individual, companyTitle=$companyTitle, prong=$prong, beneficialOwnerId=$beneficialOwnerId, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var individual: JsonField<Individual> = JsonMissing.of()
                private var companyTitle: JsonField<String> = JsonMissing.of()
                private var prong: JsonField<Prong> = JsonMissing.of()
                private var beneficialOwnerId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(beneficialOwner: BeneficialOwner) = apply {
                    this.individual = beneficialOwner.individual
                    this.companyTitle = beneficialOwner.companyTitle
                    this.prong = beneficialOwner.prong
                    this.beneficialOwnerId = beneficialOwner.beneficialOwnerId
                    additionalProperties(beneficialOwner.additionalProperties)
                }

                /** Personal details for the beneficial owner. */
                fun individual(individual: Individual) = individual(JsonField.of(individual))

                /** Personal details for the beneficial owner. */
                @JsonProperty("individual")
                @ExcludeMissing
                fun individual(individual: JsonField<Individual>) = apply {
                    this.individual = individual
                }

                /** This person's role or title within the entity. */
                fun companyTitle(companyTitle: String) = companyTitle(JsonField.of(companyTitle))

                /** This person's role or title within the entity. */
                @JsonProperty("company_title")
                @ExcludeMissing
                fun companyTitle(companyTitle: JsonField<String>) = apply {
                    this.companyTitle = companyTitle
                }

                /** Why this person is considered a beneficial owner of the entity. */
                fun prong(prong: Prong) = prong(JsonField.of(prong))

                /** Why this person is considered a beneficial owner of the entity. */
                @JsonProperty("prong")
                @ExcludeMissing
                fun prong(prong: JsonField<Prong>) = apply { this.prong = prong }

                /** The identifier of this beneficial owner. */
                fun beneficialOwnerId(beneficialOwnerId: String) =
                    beneficialOwnerId(JsonField.of(beneficialOwnerId))

                /** The identifier of this beneficial owner. */
                @JsonProperty("beneficial_owner_id")
                @ExcludeMissing
                fun beneficialOwnerId(beneficialOwnerId: JsonField<String>) = apply {
                    this.beneficialOwnerId = beneficialOwnerId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BeneficialOwner =
                    BeneficialOwner(
                        individual,
                        companyTitle,
                        prong,
                        beneficialOwnerId,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /** Personal details for the beneficial owner. */
            @JsonDeserialize(builder = Individual.Builder::class)
            @NoAutoDetect
            class Individual
            private constructor(
                private val name: JsonField<String>,
                private val dateOfBirth: JsonField<LocalDate>,
                private val address: JsonField<Address>,
                private val identification: JsonField<Identification>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The person's legal name. */
                fun name(): String = name.getRequired("name")

                /** The person's date of birth in YYYY-MM-DD format. */
                fun dateOfBirth(): LocalDate = dateOfBirth.getRequired("date_of_birth")

                /** The person's address. */
                fun address(): Address = address.getRequired("address")

                /** A means of verifying the person's identity. */
                fun identification(): Identification = identification.getRequired("identification")

                /** The person's legal name. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                /** The person's date of birth in YYYY-MM-DD format. */
                @JsonProperty("date_of_birth") @ExcludeMissing fun _dateOfBirth() = dateOfBirth

                /** The person's address. */
                @JsonProperty("address") @ExcludeMissing fun _address() = address

                /** A means of verifying the person's identity. */
                @JsonProperty("identification")
                @ExcludeMissing
                fun _identification() = identification

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Individual = apply {
                    if (!validated) {
                        name()
                        dateOfBirth()
                        address().validate()
                        identification().validate()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        this.name == other.name &&
                        this.dateOfBirth == other.dateOfBirth &&
                        this.address == other.address &&
                        this.identification == other.identification &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                name,
                                dateOfBirth,
                                address,
                                identification,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Individual{name=$name, dateOfBirth=$dateOfBirth, address=$address, identification=$identification, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var name: JsonField<String> = JsonMissing.of()
                    private var dateOfBirth: JsonField<LocalDate> = JsonMissing.of()
                    private var address: JsonField<Address> = JsonMissing.of()
                    private var identification: JsonField<Identification> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(individual: Individual) = apply {
                        this.name = individual.name
                        this.dateOfBirth = individual.dateOfBirth
                        this.address = individual.address
                        this.identification = individual.identification
                        additionalProperties(individual.additionalProperties)
                    }

                    /** The person's legal name. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The person's legal name. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /** The person's date of birth in YYYY-MM-DD format. */
                    fun dateOfBirth(dateOfBirth: LocalDate) = dateOfBirth(JsonField.of(dateOfBirth))

                    /** The person's date of birth in YYYY-MM-DD format. */
                    @JsonProperty("date_of_birth")
                    @ExcludeMissing
                    fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                        this.dateOfBirth = dateOfBirth
                    }

                    /** The person's address. */
                    fun address(address: Address) = address(JsonField.of(address))

                    /** The person's address. */
                    @JsonProperty("address")
                    @ExcludeMissing
                    fun address(address: JsonField<Address>) = apply { this.address = address }

                    /** A means of verifying the person's identity. */
                    fun identification(identification: Identification) =
                        identification(JsonField.of(identification))

                    /** A means of verifying the person's identity. */
                    @JsonProperty("identification")
                    @ExcludeMissing
                    fun identification(identification: JsonField<Identification>) = apply {
                        this.identification = identification
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Individual =
                        Individual(
                            name,
                            dateOfBirth,
                            address,
                            identification,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /** The person's address. */
                @JsonDeserialize(builder = Address.Builder::class)
                @NoAutoDetect
                class Address
                private constructor(
                    private val line1: JsonField<String>,
                    private val line2: JsonField<String>,
                    private val city: JsonField<String>,
                    private val state: JsonField<String>,
                    private val zip: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** The first line of the address. */
                    fun line1(): String = line1.getRequired("line1")

                    /** The second line of the address. */
                    fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

                    /** The city of the address. */
                    fun city(): String = city.getRequired("city")

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    fun state(): String = state.getRequired("state")

                    /** The ZIP code of the address. */
                    fun zip(): String = zip.getRequired("zip")

                    /** The first line of the address. */
                    @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

                    /** The second line of the address. */
                    @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

                    /** The city of the address. */
                    @JsonProperty("city") @ExcludeMissing fun _city() = city

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    @JsonProperty("state") @ExcludeMissing fun _state() = state

                    /** The ZIP code of the address. */
                    @JsonProperty("zip") @ExcludeMissing fun _zip() = zip

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Address = apply {
                        if (!validated) {
                            line1()
                            line2()
                            city()
                            state()
                            zip()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Address &&
                            this.line1 == other.line1 &&
                            this.line2 == other.line2 &&
                            this.city == other.city &&
                            this.state == other.state &&
                            this.zip == other.zip &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    line1,
                                    line2,
                                    city,
                                    state,
                                    zip,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Address{line1=$line1, line2=$line2, city=$city, state=$state, zip=$zip, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var line1: JsonField<String> = JsonMissing.of()
                        private var line2: JsonField<String> = JsonMissing.of()
                        private var city: JsonField<String> = JsonMissing.of()
                        private var state: JsonField<String> = JsonMissing.of()
                        private var zip: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(address: Address) = apply {
                            this.line1 = address.line1
                            this.line2 = address.line2
                            this.city = address.city
                            this.state = address.state
                            this.zip = address.zip
                            additionalProperties(address.additionalProperties)
                        }

                        /** The first line of the address. */
                        fun line1(line1: String) = line1(JsonField.of(line1))

                        /** The first line of the address. */
                        @JsonProperty("line1")
                        @ExcludeMissing
                        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                        /** The second line of the address. */
                        fun line2(line2: String) = line2(JsonField.of(line2))

                        /** The second line of the address. */
                        @JsonProperty("line2")
                        @ExcludeMissing
                        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                        /** The city of the address. */
                        fun city(city: String) = city(JsonField.of(city))

                        /** The city of the address. */
                        @JsonProperty("city")
                        @ExcludeMissing
                        fun city(city: JsonField<String>) = apply { this.city = city }

                        /**
                         * The two-letter United States Postal Service (USPS) abbreviation for the
                         * state of the address.
                         */
                        fun state(state: String) = state(JsonField.of(state))

                        /**
                         * The two-letter United States Postal Service (USPS) abbreviation for the
                         * state of the address.
                         */
                        @JsonProperty("state")
                        @ExcludeMissing
                        fun state(state: JsonField<String>) = apply { this.state = state }

                        /** The ZIP code of the address. */
                        fun zip(zip: String) = zip(JsonField.of(zip))

                        /** The ZIP code of the address. */
                        @JsonProperty("zip")
                        @ExcludeMissing
                        fun zip(zip: JsonField<String>) = apply { this.zip = zip }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Address =
                            Address(
                                line1,
                                line2,
                                city,
                                state,
                                zip,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }

                /** A means of verifying the person's identity. */
                @JsonDeserialize(builder = Identification.Builder::class)
                @NoAutoDetect
                class Identification
                private constructor(
                    private val method: JsonField<Method>,
                    private val numberLast4: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** A method that can be used to verify the individual's identity. */
                    fun method(): Method = method.getRequired("method")

                    /**
                     * The last 4 digits of the identification number that can be used to verify the
                     * individual's identity.
                     */
                    fun numberLast4(): String = numberLast4.getRequired("number_last4")

                    /** A method that can be used to verify the individual's identity. */
                    @JsonProperty("method") @ExcludeMissing fun _method() = method

                    /**
                     * The last 4 digits of the identification number that can be used to verify the
                     * individual's identity.
                     */
                    @JsonProperty("number_last4") @ExcludeMissing fun _numberLast4() = numberLast4

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Identification = apply {
                        if (!validated) {
                            method()
                            numberLast4()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Identification &&
                            this.method == other.method &&
                            this.numberLast4 == other.numberLast4 &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    method,
                                    numberLast4,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Identification{method=$method, numberLast4=$numberLast4, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var method: JsonField<Method> = JsonMissing.of()
                        private var numberLast4: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(identification: Identification) = apply {
                            this.method = identification.method
                            this.numberLast4 = identification.numberLast4
                            additionalProperties(identification.additionalProperties)
                        }

                        /** A method that can be used to verify the individual's identity. */
                        fun method(method: Method) = method(JsonField.of(method))

                        /** A method that can be used to verify the individual's identity. */
                        @JsonProperty("method")
                        @ExcludeMissing
                        fun method(method: JsonField<Method>) = apply { this.method = method }

                        /**
                         * The last 4 digits of the identification number that can be used to verify
                         * the individual's identity.
                         */
                        fun numberLast4(numberLast4: String) =
                            numberLast4(JsonField.of(numberLast4))

                        /**
                         * The last 4 digits of the identification number that can be used to verify
                         * the individual's identity.
                         */
                        @JsonProperty("number_last4")
                        @ExcludeMissing
                        fun numberLast4(numberLast4: JsonField<String>) = apply {
                            this.numberLast4 = numberLast4
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Identification =
                            Identification(
                                method,
                                numberLast4,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class Method
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Method && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField
                            val SOCIAL_SECURITY_NUMBER =
                                Method(JsonField.of("social_security_number"))

                            @JvmField
                            val INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER =
                                Method(JsonField.of("individual_taxpayer_identification_number"))

                            @JvmField val PASSPORT = Method(JsonField.of("passport"))

                            @JvmField val DRIVERS_LICENSE = Method(JsonField.of("drivers_license"))

                            @JvmField val OTHER = Method(JsonField.of("other"))

                            @JvmStatic fun of(value: String) = Method(JsonField.of(value))
                        }

                        enum class Known {
                            SOCIAL_SECURITY_NUMBER,
                            INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER,
                            PASSPORT,
                            DRIVERS_LICENSE,
                            OTHER,
                        }

                        enum class Value {
                            SOCIAL_SECURITY_NUMBER,
                            INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER,
                            PASSPORT,
                            DRIVERS_LICENSE,
                            OTHER,
                            _UNKNOWN,
                        }

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

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }
            }

            class Prong
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Prong && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val OWNERSHIP = Prong(JsonField.of("ownership"))

                    @JvmField val CONTROL = Prong(JsonField.of("control"))

                    @JvmStatic fun of(value: String) = Prong(JsonField.of(value))
                }

                enum class Known {
                    OWNERSHIP,
                    CONTROL,
                }

                enum class Value {
                    OWNERSHIP,
                    CONTROL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        OWNERSHIP -> Value.OWNERSHIP
                        CONTROL -> Value.CONTROL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        OWNERSHIP -> Known.OWNERSHIP
                        CONTROL -> Known.CONTROL
                        else -> throw IncreaseInvalidDataException("Unknown Prong: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }
    }

    /**
     * Details of the government authority entity. Will be present if `structure` is equal to
     * `government_authority`.
     */
    @JsonDeserialize(builder = GovernmentAuthority.Builder::class)
    @NoAutoDetect
    class GovernmentAuthority
    private constructor(
        private val name: JsonField<String>,
        private val category: JsonField<Category>,
        private val address: JsonField<Address>,
        private val website: JsonField<String>,
        private val taxIdentifier: JsonField<String>,
        private val authorizedPersons: JsonField<List<AuthorizedPerson>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The government authority's name. */
        fun name(): String = name.getRequired("name")

        /** The category of the government authority. */
        fun category(): Category = category.getRequired("category")

        /** The government authority's address. */
        fun address(): Address = address.getRequired("address")

        /** The government authority's website. */
        fun website(): Optional<String> = Optional.ofNullable(website.getNullable("website"))

        /** The Employer Identification Number (EIN) of the government authority. */
        fun taxIdentifier(): Optional<String> =
            Optional.ofNullable(taxIdentifier.getNullable("tax_identifier"))

        /** The identifying details of authorized persons of the government authority. */
        fun authorizedPersons(): List<AuthorizedPerson> =
            authorizedPersons.getRequired("authorized_persons")

        /** The government authority's name. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** The category of the government authority. */
        @JsonProperty("category") @ExcludeMissing fun _category() = category

        /** The government authority's address. */
        @JsonProperty("address") @ExcludeMissing fun _address() = address

        /** The government authority's website. */
        @JsonProperty("website") @ExcludeMissing fun _website() = website

        /** The Employer Identification Number (EIN) of the government authority. */
        @JsonProperty("tax_identifier") @ExcludeMissing fun _taxIdentifier() = taxIdentifier

        /** The identifying details of authorized persons of the government authority. */
        @JsonProperty("authorized_persons")
        @ExcludeMissing
        fun _authorizedPersons() = authorizedPersons

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): GovernmentAuthority = apply {
            if (!validated) {
                name()
                category()
                address().validate()
                website()
                taxIdentifier()
                authorizedPersons().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is GovernmentAuthority &&
                this.name == other.name &&
                this.category == other.category &&
                this.address == other.address &&
                this.website == other.website &&
                this.taxIdentifier == other.taxIdentifier &&
                this.authorizedPersons == other.authorizedPersons &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        category,
                        address,
                        website,
                        taxIdentifier,
                        authorizedPersons,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "GovernmentAuthority{name=$name, category=$category, address=$address, website=$website, taxIdentifier=$taxIdentifier, authorizedPersons=$authorizedPersons, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var category: JsonField<Category> = JsonMissing.of()
            private var address: JsonField<Address> = JsonMissing.of()
            private var website: JsonField<String> = JsonMissing.of()
            private var taxIdentifier: JsonField<String> = JsonMissing.of()
            private var authorizedPersons: JsonField<List<AuthorizedPerson>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(governmentAuthority: GovernmentAuthority) = apply {
                this.name = governmentAuthority.name
                this.category = governmentAuthority.category
                this.address = governmentAuthority.address
                this.website = governmentAuthority.website
                this.taxIdentifier = governmentAuthority.taxIdentifier
                this.authorizedPersons = governmentAuthority.authorizedPersons
                additionalProperties(governmentAuthority.additionalProperties)
            }

            /** The government authority's name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The government authority's name. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The category of the government authority. */
            fun category(category: Category) = category(JsonField.of(category))

            /** The category of the government authority. */
            @JsonProperty("category")
            @ExcludeMissing
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** The government authority's address. */
            fun address(address: Address) = address(JsonField.of(address))

            /** The government authority's address. */
            @JsonProperty("address")
            @ExcludeMissing
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** The government authority's website. */
            fun website(website: String) = website(JsonField.of(website))

            /** The government authority's website. */
            @JsonProperty("website")
            @ExcludeMissing
            fun website(website: JsonField<String>) = apply { this.website = website }

            /** The Employer Identification Number (EIN) of the government authority. */
            fun taxIdentifier(taxIdentifier: String) = taxIdentifier(JsonField.of(taxIdentifier))

            /** The Employer Identification Number (EIN) of the government authority. */
            @JsonProperty("tax_identifier")
            @ExcludeMissing
            fun taxIdentifier(taxIdentifier: JsonField<String>) = apply {
                this.taxIdentifier = taxIdentifier
            }

            /** The identifying details of authorized persons of the government authority. */
            fun authorizedPersons(authorizedPersons: List<AuthorizedPerson>) =
                authorizedPersons(JsonField.of(authorizedPersons))

            /** The identifying details of authorized persons of the government authority. */
            @JsonProperty("authorized_persons")
            @ExcludeMissing
            fun authorizedPersons(authorizedPersons: JsonField<List<AuthorizedPerson>>) = apply {
                this.authorizedPersons = authorizedPersons
            }

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

            fun build(): GovernmentAuthority =
                GovernmentAuthority(
                    name,
                    category,
                    address,
                    website,
                    taxIdentifier,
                    authorizedPersons.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** The government authority's address. */
        @JsonDeserialize(builder = Address.Builder::class)
        @NoAutoDetect
        class Address
        private constructor(
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val city: JsonField<String>,
            private val state: JsonField<String>,
            private val zip: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The first line of the address. */
            fun line1(): String = line1.getRequired("line1")

            /** The second line of the address. */
            fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

            /** The city of the address. */
            fun city(): String = city.getRequired("city")

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            fun state(): String = state.getRequired("state")

            /** The ZIP code of the address. */
            fun zip(): String = zip.getRequired("zip")

            /** The first line of the address. */
            @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

            /** The second line of the address. */
            @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

            /** The city of the address. */
            @JsonProperty("city") @ExcludeMissing fun _city() = city

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") @ExcludeMissing fun _state() = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") @ExcludeMissing fun _zip() = zip

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Address = apply {
                if (!validated) {
                    line1()
                    line2()
                    city()
                    state()
                    zip()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Address &&
                    this.line1 == other.line1 &&
                    this.line2 == other.line2 &&
                    this.city == other.city &&
                    this.state == other.state &&
                    this.zip == other.zip &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            line1,
                            line2,
                            city,
                            state,
                            zip,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Address{line1=$line1, line2=$line2, city=$city, state=$state, zip=$zip, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var line1: JsonField<String> = JsonMissing.of()
                private var line2: JsonField<String> = JsonMissing.of()
                private var city: JsonField<String> = JsonMissing.of()
                private var state: JsonField<String> = JsonMissing.of()
                private var zip: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    this.line1 = address.line1
                    this.line2 = address.line2
                    this.city = address.city
                    this.state = address.state
                    this.zip = address.zip
                    additionalProperties(address.additionalProperties)
                }

                /** The first line of the address. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /** The first line of the address. */
                @JsonProperty("line1")
                @ExcludeMissing
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The second line of the address. */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /** The second line of the address. */
                @JsonProperty("line2")
                @ExcludeMissing
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                /** The city of the address. */
                fun city(city: String) = city(JsonField.of(city))

                /** The city of the address. */
                @JsonProperty("city")
                @ExcludeMissing
                fun city(city: JsonField<String>) = apply { this.city = city }

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                fun state(state: String) = state(JsonField.of(state))

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                @JsonProperty("state")
                @ExcludeMissing
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The ZIP code of the address. */
                fun zip(zip: String) = zip(JsonField.of(zip))

                /** The ZIP code of the address. */
                @JsonProperty("zip")
                @ExcludeMissing
                fun zip(zip: JsonField<String>) = apply { this.zip = zip }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Address =
                    Address(
                        line1,
                        line2,
                        city,
                        state,
                        zip,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = AuthorizedPerson.Builder::class)
        @NoAutoDetect
        class AuthorizedPerson
        private constructor(
            private val name: JsonField<String>,
            private val authorizedPersonId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The person's legal name. */
            fun name(): String = name.getRequired("name")

            /** The identifier of this authorized person. */
            fun authorizedPersonId(): String =
                authorizedPersonId.getRequired("authorized_person_id")

            /** The person's legal name. */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            /** The identifier of this authorized person. */
            @JsonProperty("authorized_person_id")
            @ExcludeMissing
            fun _authorizedPersonId() = authorizedPersonId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AuthorizedPerson = apply {
                if (!validated) {
                    name()
                    authorizedPersonId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AuthorizedPerson &&
                    this.name == other.name &&
                    this.authorizedPersonId == other.authorizedPersonId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            name,
                            authorizedPersonId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "AuthorizedPerson{name=$name, authorizedPersonId=$authorizedPersonId, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: JsonField<String> = JsonMissing.of()
                private var authorizedPersonId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(authorizedPerson: AuthorizedPerson) = apply {
                    this.name = authorizedPerson.name
                    this.authorizedPersonId = authorizedPerson.authorizedPersonId
                    additionalProperties(authorizedPerson.additionalProperties)
                }

                /** The person's legal name. */
                fun name(name: String) = name(JsonField.of(name))

                /** The person's legal name. */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The identifier of this authorized person. */
                fun authorizedPersonId(authorizedPersonId: String) =
                    authorizedPersonId(JsonField.of(authorizedPersonId))

                /** The identifier of this authorized person. */
                @JsonProperty("authorized_person_id")
                @ExcludeMissing
                fun authorizedPersonId(authorizedPersonId: JsonField<String>) = apply {
                    this.authorizedPersonId = authorizedPersonId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): AuthorizedPerson =
                    AuthorizedPerson(
                        name,
                        authorizedPersonId,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class Category
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Category && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val MUNICIPALITY = Category(JsonField.of("municipality"))

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            enum class Known {
                MUNICIPALITY,
            }

            enum class Value {
                MUNICIPALITY,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    MUNICIPALITY -> Value.MUNICIPALITY
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    MUNICIPALITY -> Known.MUNICIPALITY
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    /** Details of the joint entity. Will be present if `structure` is equal to `joint`. */
    @JsonDeserialize(builder = Joint.Builder::class)
    @NoAutoDetect
    class Joint
    private constructor(
        private val name: JsonField<String>,
        private val individuals: JsonField<List<Individual>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The entity's name. */
        fun name(): String = name.getRequired("name")

        /** The two individuals that share control of the entity. */
        fun individuals(): List<Individual> = individuals.getRequired("individuals")

        /** The entity's name. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** The two individuals that share control of the entity. */
        @JsonProperty("individuals") @ExcludeMissing fun _individuals() = individuals

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Joint = apply {
            if (!validated) {
                name()
                individuals().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Joint &&
                this.name == other.name &&
                this.individuals == other.individuals &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        individuals,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Joint{name=$name, individuals=$individuals, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var individuals: JsonField<List<Individual>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(joint: Joint) = apply {
                this.name = joint.name
                this.individuals = joint.individuals
                additionalProperties(joint.additionalProperties)
            }

            /** The entity's name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The entity's name. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The two individuals that share control of the entity. */
            fun individuals(individuals: List<Individual>) = individuals(JsonField.of(individuals))

            /** The two individuals that share control of the entity. */
            @JsonProperty("individuals")
            @ExcludeMissing
            fun individuals(individuals: JsonField<List<Individual>>) = apply {
                this.individuals = individuals
            }

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

            fun build(): Joint =
                Joint(
                    name,
                    individuals.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = Individual.Builder::class)
        @NoAutoDetect
        class Individual
        private constructor(
            private val name: JsonField<String>,
            private val dateOfBirth: JsonField<LocalDate>,
            private val address: JsonField<Address>,
            private val identification: JsonField<Identification>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The person's legal name. */
            fun name(): String = name.getRequired("name")

            /** The person's date of birth in YYYY-MM-DD format. */
            fun dateOfBirth(): LocalDate = dateOfBirth.getRequired("date_of_birth")

            /** The person's address. */
            fun address(): Address = address.getRequired("address")

            /** A means of verifying the person's identity. */
            fun identification(): Identification = identification.getRequired("identification")

            /** The person's legal name. */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            /** The person's date of birth in YYYY-MM-DD format. */
            @JsonProperty("date_of_birth") @ExcludeMissing fun _dateOfBirth() = dateOfBirth

            /** The person's address. */
            @JsonProperty("address") @ExcludeMissing fun _address() = address

            /** A means of verifying the person's identity. */
            @JsonProperty("identification") @ExcludeMissing fun _identification() = identification

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Individual = apply {
                if (!validated) {
                    name()
                    dateOfBirth()
                    address().validate()
                    identification().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Individual &&
                    this.name == other.name &&
                    this.dateOfBirth == other.dateOfBirth &&
                    this.address == other.address &&
                    this.identification == other.identification &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            name,
                            dateOfBirth,
                            address,
                            identification,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Individual{name=$name, dateOfBirth=$dateOfBirth, address=$address, identification=$identification, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: JsonField<String> = JsonMissing.of()
                private var dateOfBirth: JsonField<LocalDate> = JsonMissing.of()
                private var address: JsonField<Address> = JsonMissing.of()
                private var identification: JsonField<Identification> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(individual: Individual) = apply {
                    this.name = individual.name
                    this.dateOfBirth = individual.dateOfBirth
                    this.address = individual.address
                    this.identification = individual.identification
                    additionalProperties(individual.additionalProperties)
                }

                /** The person's legal name. */
                fun name(name: String) = name(JsonField.of(name))

                /** The person's legal name. */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The person's date of birth in YYYY-MM-DD format. */
                fun dateOfBirth(dateOfBirth: LocalDate) = dateOfBirth(JsonField.of(dateOfBirth))

                /** The person's date of birth in YYYY-MM-DD format. */
                @JsonProperty("date_of_birth")
                @ExcludeMissing
                fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                    this.dateOfBirth = dateOfBirth
                }

                /** The person's address. */
                fun address(address: Address) = address(JsonField.of(address))

                /** The person's address. */
                @JsonProperty("address")
                @ExcludeMissing
                fun address(address: JsonField<Address>) = apply { this.address = address }

                /** A means of verifying the person's identity. */
                fun identification(identification: Identification) =
                    identification(JsonField.of(identification))

                /** A means of verifying the person's identity. */
                @JsonProperty("identification")
                @ExcludeMissing
                fun identification(identification: JsonField<Identification>) = apply {
                    this.identification = identification
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Individual =
                    Individual(
                        name,
                        dateOfBirth,
                        address,
                        identification,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /** The person's address. */
            @JsonDeserialize(builder = Address.Builder::class)
            @NoAutoDetect
            class Address
            private constructor(
                private val line1: JsonField<String>,
                private val line2: JsonField<String>,
                private val city: JsonField<String>,
                private val state: JsonField<String>,
                private val zip: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The first line of the address. */
                fun line1(): String = line1.getRequired("line1")

                /** The second line of the address. */
                fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

                /** The city of the address. */
                fun city(): String = city.getRequired("city")

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                fun state(): String = state.getRequired("state")

                /** The ZIP code of the address. */
                fun zip(): String = zip.getRequired("zip")

                /** The first line of the address. */
                @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

                /** The second line of the address. */
                @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

                /** The city of the address. */
                @JsonProperty("city") @ExcludeMissing fun _city() = city

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                @JsonProperty("state") @ExcludeMissing fun _state() = state

                /** The ZIP code of the address. */
                @JsonProperty("zip") @ExcludeMissing fun _zip() = zip

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Address = apply {
                    if (!validated) {
                        line1()
                        line2()
                        city()
                        state()
                        zip()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Address &&
                        this.line1 == other.line1 &&
                        this.line2 == other.line2 &&
                        this.city == other.city &&
                        this.state == other.state &&
                        this.zip == other.zip &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                line1,
                                line2,
                                city,
                                state,
                                zip,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Address{line1=$line1, line2=$line2, city=$city, state=$state, zip=$zip, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var line1: JsonField<String> = JsonMissing.of()
                    private var line2: JsonField<String> = JsonMissing.of()
                    private var city: JsonField<String> = JsonMissing.of()
                    private var state: JsonField<String> = JsonMissing.of()
                    private var zip: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(address: Address) = apply {
                        this.line1 = address.line1
                        this.line2 = address.line2
                        this.city = address.city
                        this.state = address.state
                        this.zip = address.zip
                        additionalProperties(address.additionalProperties)
                    }

                    /** The first line of the address. */
                    fun line1(line1: String) = line1(JsonField.of(line1))

                    /** The first line of the address. */
                    @JsonProperty("line1")
                    @ExcludeMissing
                    fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                    /** The second line of the address. */
                    fun line2(line2: String) = line2(JsonField.of(line2))

                    /** The second line of the address. */
                    @JsonProperty("line2")
                    @ExcludeMissing
                    fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                    /** The city of the address. */
                    fun city(city: String) = city(JsonField.of(city))

                    /** The city of the address. */
                    @JsonProperty("city")
                    @ExcludeMissing
                    fun city(city: JsonField<String>) = apply { this.city = city }

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    fun state(state: String) = state(JsonField.of(state))

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    @JsonProperty("state")
                    @ExcludeMissing
                    fun state(state: JsonField<String>) = apply { this.state = state }

                    /** The ZIP code of the address. */
                    fun zip(zip: String) = zip(JsonField.of(zip))

                    /** The ZIP code of the address. */
                    @JsonProperty("zip")
                    @ExcludeMissing
                    fun zip(zip: JsonField<String>) = apply { this.zip = zip }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Address =
                        Address(
                            line1,
                            line2,
                            city,
                            state,
                            zip,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /** A means of verifying the person's identity. */
            @JsonDeserialize(builder = Identification.Builder::class)
            @NoAutoDetect
            class Identification
            private constructor(
                private val method: JsonField<Method>,
                private val numberLast4: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** A method that can be used to verify the individual's identity. */
                fun method(): Method = method.getRequired("method")

                /**
                 * The last 4 digits of the identification number that can be used to verify the
                 * individual's identity.
                 */
                fun numberLast4(): String = numberLast4.getRequired("number_last4")

                /** A method that can be used to verify the individual's identity. */
                @JsonProperty("method") @ExcludeMissing fun _method() = method

                /**
                 * The last 4 digits of the identification number that can be used to verify the
                 * individual's identity.
                 */
                @JsonProperty("number_last4") @ExcludeMissing fun _numberLast4() = numberLast4

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Identification = apply {
                    if (!validated) {
                        method()
                        numberLast4()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Identification &&
                        this.method == other.method &&
                        this.numberLast4 == other.numberLast4 &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                method,
                                numberLast4,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Identification{method=$method, numberLast4=$numberLast4, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var method: JsonField<Method> = JsonMissing.of()
                    private var numberLast4: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(identification: Identification) = apply {
                        this.method = identification.method
                        this.numberLast4 = identification.numberLast4
                        additionalProperties(identification.additionalProperties)
                    }

                    /** A method that can be used to verify the individual's identity. */
                    fun method(method: Method) = method(JsonField.of(method))

                    /** A method that can be used to verify the individual's identity. */
                    @JsonProperty("method")
                    @ExcludeMissing
                    fun method(method: JsonField<Method>) = apply { this.method = method }

                    /**
                     * The last 4 digits of the identification number that can be used to verify the
                     * individual's identity.
                     */
                    fun numberLast4(numberLast4: String) = numberLast4(JsonField.of(numberLast4))

                    /**
                     * The last 4 digits of the identification number that can be used to verify the
                     * individual's identity.
                     */
                    @JsonProperty("number_last4")
                    @ExcludeMissing
                    fun numberLast4(numberLast4: JsonField<String>) = apply {
                        this.numberLast4 = numberLast4
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Identification =
                        Identification(
                            method,
                            numberLast4,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Method
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Method && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField
                        val SOCIAL_SECURITY_NUMBER = Method(JsonField.of("social_security_number"))

                        @JvmField
                        val INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER =
                            Method(JsonField.of("individual_taxpayer_identification_number"))

                        @JvmField val PASSPORT = Method(JsonField.of("passport"))

                        @JvmField val DRIVERS_LICENSE = Method(JsonField.of("drivers_license"))

                        @JvmField val OTHER = Method(JsonField.of("other"))

                        @JvmStatic fun of(value: String) = Method(JsonField.of(value))
                    }

                    enum class Known {
                        SOCIAL_SECURITY_NUMBER,
                        INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER,
                        PASSPORT,
                        DRIVERS_LICENSE,
                        OTHER,
                    }

                    enum class Value {
                        SOCIAL_SECURITY_NUMBER,
                        INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER,
                        PASSPORT,
                        DRIVERS_LICENSE,
                        OTHER,
                        _UNKNOWN,
                    }

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

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }
    }

    /**
     * Details of the natural person entity. Will be present if `structure` is equal to
     * `natural_person`.
     */
    @JsonDeserialize(builder = NaturalPerson.Builder::class)
    @NoAutoDetect
    class NaturalPerson
    private constructor(
        private val name: JsonField<String>,
        private val dateOfBirth: JsonField<LocalDate>,
        private val address: JsonField<Address>,
        private val identification: JsonField<Identification>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The person's legal name. */
        fun name(): String = name.getRequired("name")

        /** The person's date of birth in YYYY-MM-DD format. */
        fun dateOfBirth(): LocalDate = dateOfBirth.getRequired("date_of_birth")

        /** The person's address. */
        fun address(): Address = address.getRequired("address")

        /** A means of verifying the person's identity. */
        fun identification(): Identification = identification.getRequired("identification")

        /** The person's legal name. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** The person's date of birth in YYYY-MM-DD format. */
        @JsonProperty("date_of_birth") @ExcludeMissing fun _dateOfBirth() = dateOfBirth

        /** The person's address. */
        @JsonProperty("address") @ExcludeMissing fun _address() = address

        /** A means of verifying the person's identity. */
        @JsonProperty("identification") @ExcludeMissing fun _identification() = identification

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): NaturalPerson = apply {
            if (!validated) {
                name()
                dateOfBirth()
                address().validate()
                identification().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is NaturalPerson &&
                this.name == other.name &&
                this.dateOfBirth == other.dateOfBirth &&
                this.address == other.address &&
                this.identification == other.identification &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        dateOfBirth,
                        address,
                        identification,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "NaturalPerson{name=$name, dateOfBirth=$dateOfBirth, address=$address, identification=$identification, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var dateOfBirth: JsonField<LocalDate> = JsonMissing.of()
            private var address: JsonField<Address> = JsonMissing.of()
            private var identification: JsonField<Identification> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(naturalPerson: NaturalPerson) = apply {
                this.name = naturalPerson.name
                this.dateOfBirth = naturalPerson.dateOfBirth
                this.address = naturalPerson.address
                this.identification = naturalPerson.identification
                additionalProperties(naturalPerson.additionalProperties)
            }

            /** The person's legal name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The person's legal name. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The person's date of birth in YYYY-MM-DD format. */
            fun dateOfBirth(dateOfBirth: LocalDate) = dateOfBirth(JsonField.of(dateOfBirth))

            /** The person's date of birth in YYYY-MM-DD format. */
            @JsonProperty("date_of_birth")
            @ExcludeMissing
            fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                this.dateOfBirth = dateOfBirth
            }

            /** The person's address. */
            fun address(address: Address) = address(JsonField.of(address))

            /** The person's address. */
            @JsonProperty("address")
            @ExcludeMissing
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** A means of verifying the person's identity. */
            fun identification(identification: Identification) =
                identification(JsonField.of(identification))

            /** A means of verifying the person's identity. */
            @JsonProperty("identification")
            @ExcludeMissing
            fun identification(identification: JsonField<Identification>) = apply {
                this.identification = identification
            }

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

            fun build(): NaturalPerson =
                NaturalPerson(
                    name,
                    dateOfBirth,
                    address,
                    identification,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** The person's address. */
        @JsonDeserialize(builder = Address.Builder::class)
        @NoAutoDetect
        class Address
        private constructor(
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val city: JsonField<String>,
            private val state: JsonField<String>,
            private val zip: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The first line of the address. */
            fun line1(): String = line1.getRequired("line1")

            /** The second line of the address. */
            fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

            /** The city of the address. */
            fun city(): String = city.getRequired("city")

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            fun state(): String = state.getRequired("state")

            /** The ZIP code of the address. */
            fun zip(): String = zip.getRequired("zip")

            /** The first line of the address. */
            @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

            /** The second line of the address. */
            @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

            /** The city of the address. */
            @JsonProperty("city") @ExcludeMissing fun _city() = city

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") @ExcludeMissing fun _state() = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") @ExcludeMissing fun _zip() = zip

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Address = apply {
                if (!validated) {
                    line1()
                    line2()
                    city()
                    state()
                    zip()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Address &&
                    this.line1 == other.line1 &&
                    this.line2 == other.line2 &&
                    this.city == other.city &&
                    this.state == other.state &&
                    this.zip == other.zip &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            line1,
                            line2,
                            city,
                            state,
                            zip,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Address{line1=$line1, line2=$line2, city=$city, state=$state, zip=$zip, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var line1: JsonField<String> = JsonMissing.of()
                private var line2: JsonField<String> = JsonMissing.of()
                private var city: JsonField<String> = JsonMissing.of()
                private var state: JsonField<String> = JsonMissing.of()
                private var zip: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    this.line1 = address.line1
                    this.line2 = address.line2
                    this.city = address.city
                    this.state = address.state
                    this.zip = address.zip
                    additionalProperties(address.additionalProperties)
                }

                /** The first line of the address. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /** The first line of the address. */
                @JsonProperty("line1")
                @ExcludeMissing
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The second line of the address. */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /** The second line of the address. */
                @JsonProperty("line2")
                @ExcludeMissing
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                /** The city of the address. */
                fun city(city: String) = city(JsonField.of(city))

                /** The city of the address. */
                @JsonProperty("city")
                @ExcludeMissing
                fun city(city: JsonField<String>) = apply { this.city = city }

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                fun state(state: String) = state(JsonField.of(state))

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                @JsonProperty("state")
                @ExcludeMissing
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The ZIP code of the address. */
                fun zip(zip: String) = zip(JsonField.of(zip))

                /** The ZIP code of the address. */
                @JsonProperty("zip")
                @ExcludeMissing
                fun zip(zip: JsonField<String>) = apply { this.zip = zip }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Address =
                    Address(
                        line1,
                        line2,
                        city,
                        state,
                        zip,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /** A means of verifying the person's identity. */
        @JsonDeserialize(builder = Identification.Builder::class)
        @NoAutoDetect
        class Identification
        private constructor(
            private val method: JsonField<Method>,
            private val numberLast4: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** A method that can be used to verify the individual's identity. */
            fun method(): Method = method.getRequired("method")

            /**
             * The last 4 digits of the identification number that can be used to verify the
             * individual's identity.
             */
            fun numberLast4(): String = numberLast4.getRequired("number_last4")

            /** A method that can be used to verify the individual's identity. */
            @JsonProperty("method") @ExcludeMissing fun _method() = method

            /**
             * The last 4 digits of the identification number that can be used to verify the
             * individual's identity.
             */
            @JsonProperty("number_last4") @ExcludeMissing fun _numberLast4() = numberLast4

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Identification = apply {
                if (!validated) {
                    method()
                    numberLast4()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Identification &&
                    this.method == other.method &&
                    this.numberLast4 == other.numberLast4 &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            method,
                            numberLast4,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Identification{method=$method, numberLast4=$numberLast4, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var method: JsonField<Method> = JsonMissing.of()
                private var numberLast4: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(identification: Identification) = apply {
                    this.method = identification.method
                    this.numberLast4 = identification.numberLast4
                    additionalProperties(identification.additionalProperties)
                }

                /** A method that can be used to verify the individual's identity. */
                fun method(method: Method) = method(JsonField.of(method))

                /** A method that can be used to verify the individual's identity. */
                @JsonProperty("method")
                @ExcludeMissing
                fun method(method: JsonField<Method>) = apply { this.method = method }

                /**
                 * The last 4 digits of the identification number that can be used to verify the
                 * individual's identity.
                 */
                fun numberLast4(numberLast4: String) = numberLast4(JsonField.of(numberLast4))

                /**
                 * The last 4 digits of the identification number that can be used to verify the
                 * individual's identity.
                 */
                @JsonProperty("number_last4")
                @ExcludeMissing
                fun numberLast4(numberLast4: JsonField<String>) = apply {
                    this.numberLast4 = numberLast4
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Identification =
                    Identification(
                        method,
                        numberLast4,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Method
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Method && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField
                    val SOCIAL_SECURITY_NUMBER = Method(JsonField.of("social_security_number"))

                    @JvmField
                    val INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER =
                        Method(JsonField.of("individual_taxpayer_identification_number"))

                    @JvmField val PASSPORT = Method(JsonField.of("passport"))

                    @JvmField val DRIVERS_LICENSE = Method(JsonField.of("drivers_license"))

                    @JvmField val OTHER = Method(JsonField.of("other"))

                    @JvmStatic fun of(value: String) = Method(JsonField.of(value))
                }

                enum class Known {
                    SOCIAL_SECURITY_NUMBER,
                    INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER,
                    PASSPORT,
                    DRIVERS_LICENSE,
                    OTHER,
                }

                enum class Value {
                    SOCIAL_SECURITY_NUMBER,
                    INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER,
                    PASSPORT,
                    DRIVERS_LICENSE,
                    OTHER,
                    _UNKNOWN,
                }

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

                fun asString(): String = _value().asStringOrThrow()
            }
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

            @JvmField val ACTIVE = Status(JsonField.of("active"))

            @JvmField val ARCHIVED = Status(JsonField.of("archived"))

            @JvmField val DISABLED = Status(JsonField.of("disabled"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            ARCHIVED,
            DISABLED,
        }

        enum class Value {
            ACTIVE,
            ARCHIVED,
            DISABLED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                ARCHIVED -> Value.ARCHIVED
                DISABLED -> Value.DISABLED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                ARCHIVED -> Known.ARCHIVED
                DISABLED -> Known.DISABLED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Structure
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Structure && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CORPORATION = Structure(JsonField.of("corporation"))

            @JvmField val NATURAL_PERSON = Structure(JsonField.of("natural_person"))

            @JvmField val JOINT = Structure(JsonField.of("joint"))

            @JvmField val TRUST = Structure(JsonField.of("trust"))

            @JvmField val GOVERNMENT_AUTHORITY = Structure(JsonField.of("government_authority"))

            @JvmStatic fun of(value: String) = Structure(JsonField.of(value))
        }

        enum class Known {
            CORPORATION,
            NATURAL_PERSON,
            JOINT,
            TRUST,
            GOVERNMENT_AUTHORITY,
        }

        enum class Value {
            CORPORATION,
            NATURAL_PERSON,
            JOINT,
            TRUST,
            GOVERNMENT_AUTHORITY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CORPORATION -> Value.CORPORATION
                NATURAL_PERSON -> Value.NATURAL_PERSON
                JOINT -> Value.JOINT
                TRUST -> Value.TRUST
                GOVERNMENT_AUTHORITY -> Value.GOVERNMENT_AUTHORITY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CORPORATION -> Known.CORPORATION
                NATURAL_PERSON -> Known.NATURAL_PERSON
                JOINT -> Known.JOINT
                TRUST -> Known.TRUST
                GOVERNMENT_AUTHORITY -> Known.GOVERNMENT_AUTHORITY
                else -> throw IncreaseInvalidDataException("Unknown Structure: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** Details of the trust entity. Will be present if `structure` is equal to `trust`. */
    @JsonDeserialize(builder = Trust.Builder::class)
    @NoAutoDetect
    class Trust
    private constructor(
        private val name: JsonField<String>,
        private val category: JsonField<Category>,
        private val address: JsonField<Address>,
        private val formationState: JsonField<String>,
        private val taxIdentifier: JsonField<String>,
        private val trustees: JsonField<List<Trustee>>,
        private val grantor: JsonField<Grantor>,
        private val formationDocumentFileId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The trust's name. */
        fun name(): String = name.getRequired("name")

        /** Whether the trust is `revocable` or `irrevocable`. */
        fun category(): Category = category.getRequired("category")

        /** The trust's address. */
        fun address(): Address = address.getRequired("address")

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the state in which
         * the trust was formed.
         */
        fun formationState(): Optional<String> =
            Optional.ofNullable(formationState.getNullable("formation_state"))

        /** The Employer Identification Number (EIN) of the trust itself. */
        fun taxIdentifier(): Optional<String> =
            Optional.ofNullable(taxIdentifier.getNullable("tax_identifier"))

        /** The trustees of the trust. */
        fun trustees(): List<Trustee> = trustees.getRequired("trustees")

        /** The grantor of the trust. Will be present if the `category` is `revocable`. */
        fun grantor(): Optional<Grantor> = Optional.ofNullable(grantor.getNullable("grantor"))

        /** The ID for the File containing the formation document of the trust. */
        fun formationDocumentFileId(): Optional<String> =
            Optional.ofNullable(formationDocumentFileId.getNullable("formation_document_file_id"))

        /** The trust's name. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** Whether the trust is `revocable` or `irrevocable`. */
        @JsonProperty("category") @ExcludeMissing fun _category() = category

        /** The trust's address. */
        @JsonProperty("address") @ExcludeMissing fun _address() = address

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the state in which
         * the trust was formed.
         */
        @JsonProperty("formation_state") @ExcludeMissing fun _formationState() = formationState

        /** The Employer Identification Number (EIN) of the trust itself. */
        @JsonProperty("tax_identifier") @ExcludeMissing fun _taxIdentifier() = taxIdentifier

        /** The trustees of the trust. */
        @JsonProperty("trustees") @ExcludeMissing fun _trustees() = trustees

        /** The grantor of the trust. Will be present if the `category` is `revocable`. */
        @JsonProperty("grantor") @ExcludeMissing fun _grantor() = grantor

        /** The ID for the File containing the formation document of the trust. */
        @JsonProperty("formation_document_file_id")
        @ExcludeMissing
        fun _formationDocumentFileId() = formationDocumentFileId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Trust = apply {
            if (!validated) {
                name()
                category()
                address().validate()
                formationState()
                taxIdentifier()
                trustees().forEach { it.validate() }
                grantor().map { it.validate() }
                formationDocumentFileId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Trust &&
                this.name == other.name &&
                this.category == other.category &&
                this.address == other.address &&
                this.formationState == other.formationState &&
                this.taxIdentifier == other.taxIdentifier &&
                this.trustees == other.trustees &&
                this.grantor == other.grantor &&
                this.formationDocumentFileId == other.formationDocumentFileId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        category,
                        address,
                        formationState,
                        taxIdentifier,
                        trustees,
                        grantor,
                        formationDocumentFileId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Trust{name=$name, category=$category, address=$address, formationState=$formationState, taxIdentifier=$taxIdentifier, trustees=$trustees, grantor=$grantor, formationDocumentFileId=$formationDocumentFileId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var category: JsonField<Category> = JsonMissing.of()
            private var address: JsonField<Address> = JsonMissing.of()
            private var formationState: JsonField<String> = JsonMissing.of()
            private var taxIdentifier: JsonField<String> = JsonMissing.of()
            private var trustees: JsonField<List<Trustee>> = JsonMissing.of()
            private var grantor: JsonField<Grantor> = JsonMissing.of()
            private var formationDocumentFileId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trust: Trust) = apply {
                this.name = trust.name
                this.category = trust.category
                this.address = trust.address
                this.formationState = trust.formationState
                this.taxIdentifier = trust.taxIdentifier
                this.trustees = trust.trustees
                this.grantor = trust.grantor
                this.formationDocumentFileId = trust.formationDocumentFileId
                additionalProperties(trust.additionalProperties)
            }

            /** The trust's name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The trust's name. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Whether the trust is `revocable` or `irrevocable`. */
            fun category(category: Category) = category(JsonField.of(category))

            /** Whether the trust is `revocable` or `irrevocable`. */
            @JsonProperty("category")
            @ExcludeMissing
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** The trust's address. */
            fun address(address: Address) = address(JsonField.of(address))

            /** The trust's address. */
            @JsonProperty("address")
            @ExcludeMissing
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state in
             * which the trust was formed.
             */
            fun formationState(formationState: String) =
                formationState(JsonField.of(formationState))

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state in
             * which the trust was formed.
             */
            @JsonProperty("formation_state")
            @ExcludeMissing
            fun formationState(formationState: JsonField<String>) = apply {
                this.formationState = formationState
            }

            /** The Employer Identification Number (EIN) of the trust itself. */
            fun taxIdentifier(taxIdentifier: String) = taxIdentifier(JsonField.of(taxIdentifier))

            /** The Employer Identification Number (EIN) of the trust itself. */
            @JsonProperty("tax_identifier")
            @ExcludeMissing
            fun taxIdentifier(taxIdentifier: JsonField<String>) = apply {
                this.taxIdentifier = taxIdentifier
            }

            /** The trustees of the trust. */
            fun trustees(trustees: List<Trustee>) = trustees(JsonField.of(trustees))

            /** The trustees of the trust. */
            @JsonProperty("trustees")
            @ExcludeMissing
            fun trustees(trustees: JsonField<List<Trustee>>) = apply { this.trustees = trustees }

            /** The grantor of the trust. Will be present if the `category` is `revocable`. */
            fun grantor(grantor: Grantor) = grantor(JsonField.of(grantor))

            /** The grantor of the trust. Will be present if the `category` is `revocable`. */
            @JsonProperty("grantor")
            @ExcludeMissing
            fun grantor(grantor: JsonField<Grantor>) = apply { this.grantor = grantor }

            /** The ID for the File containing the formation document of the trust. */
            fun formationDocumentFileId(formationDocumentFileId: String) =
                formationDocumentFileId(JsonField.of(formationDocumentFileId))

            /** The ID for the File containing the formation document of the trust. */
            @JsonProperty("formation_document_file_id")
            @ExcludeMissing
            fun formationDocumentFileId(formationDocumentFileId: JsonField<String>) = apply {
                this.formationDocumentFileId = formationDocumentFileId
            }

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

            fun build(): Trust =
                Trust(
                    name,
                    category,
                    address,
                    formationState,
                    taxIdentifier,
                    trustees.map { it.toUnmodifiable() },
                    grantor,
                    formationDocumentFileId,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** The trust's address. */
        @JsonDeserialize(builder = Address.Builder::class)
        @NoAutoDetect
        class Address
        private constructor(
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val city: JsonField<String>,
            private val state: JsonField<String>,
            private val zip: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The first line of the address. */
            fun line1(): String = line1.getRequired("line1")

            /** The second line of the address. */
            fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

            /** The city of the address. */
            fun city(): String = city.getRequired("city")

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            fun state(): String = state.getRequired("state")

            /** The ZIP code of the address. */
            fun zip(): String = zip.getRequired("zip")

            /** The first line of the address. */
            @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

            /** The second line of the address. */
            @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

            /** The city of the address. */
            @JsonProperty("city") @ExcludeMissing fun _city() = city

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") @ExcludeMissing fun _state() = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") @ExcludeMissing fun _zip() = zip

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Address = apply {
                if (!validated) {
                    line1()
                    line2()
                    city()
                    state()
                    zip()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Address &&
                    this.line1 == other.line1 &&
                    this.line2 == other.line2 &&
                    this.city == other.city &&
                    this.state == other.state &&
                    this.zip == other.zip &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            line1,
                            line2,
                            city,
                            state,
                            zip,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Address{line1=$line1, line2=$line2, city=$city, state=$state, zip=$zip, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var line1: JsonField<String> = JsonMissing.of()
                private var line2: JsonField<String> = JsonMissing.of()
                private var city: JsonField<String> = JsonMissing.of()
                private var state: JsonField<String> = JsonMissing.of()
                private var zip: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    this.line1 = address.line1
                    this.line2 = address.line2
                    this.city = address.city
                    this.state = address.state
                    this.zip = address.zip
                    additionalProperties(address.additionalProperties)
                }

                /** The first line of the address. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /** The first line of the address. */
                @JsonProperty("line1")
                @ExcludeMissing
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The second line of the address. */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /** The second line of the address. */
                @JsonProperty("line2")
                @ExcludeMissing
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                /** The city of the address. */
                fun city(city: String) = city(JsonField.of(city))

                /** The city of the address. */
                @JsonProperty("city")
                @ExcludeMissing
                fun city(city: JsonField<String>) = apply { this.city = city }

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                fun state(state: String) = state(JsonField.of(state))

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                @JsonProperty("state")
                @ExcludeMissing
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The ZIP code of the address. */
                fun zip(zip: String) = zip(JsonField.of(zip))

                /** The ZIP code of the address. */
                @JsonProperty("zip")
                @ExcludeMissing
                fun zip(zip: JsonField<String>) = apply { this.zip = zip }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Address =
                    Address(
                        line1,
                        line2,
                        city,
                        state,
                        zip,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class Category
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Category && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val REVOCABLE = Category(JsonField.of("revocable"))

                @JvmField val IRREVOCABLE = Category(JsonField.of("irrevocable"))

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            enum class Known {
                REVOCABLE,
                IRREVOCABLE,
            }

            enum class Value {
                REVOCABLE,
                IRREVOCABLE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    REVOCABLE -> Value.REVOCABLE
                    IRREVOCABLE -> Value.IRREVOCABLE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    REVOCABLE -> Known.REVOCABLE
                    IRREVOCABLE -> Known.IRREVOCABLE
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /** The grantor of the trust. Will be present if the `category` is `revocable`. */
        @JsonDeserialize(builder = Grantor.Builder::class)
        @NoAutoDetect
        class Grantor
        private constructor(
            private val name: JsonField<String>,
            private val dateOfBirth: JsonField<LocalDate>,
            private val address: JsonField<Address>,
            private val identification: JsonField<Identification>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The person's legal name. */
            fun name(): String = name.getRequired("name")

            /** The person's date of birth in YYYY-MM-DD format. */
            fun dateOfBirth(): LocalDate = dateOfBirth.getRequired("date_of_birth")

            /** The person's address. */
            fun address(): Address = address.getRequired("address")

            /** A means of verifying the person's identity. */
            fun identification(): Identification = identification.getRequired("identification")

            /** The person's legal name. */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            /** The person's date of birth in YYYY-MM-DD format. */
            @JsonProperty("date_of_birth") @ExcludeMissing fun _dateOfBirth() = dateOfBirth

            /** The person's address. */
            @JsonProperty("address") @ExcludeMissing fun _address() = address

            /** A means of verifying the person's identity. */
            @JsonProperty("identification") @ExcludeMissing fun _identification() = identification

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Grantor = apply {
                if (!validated) {
                    name()
                    dateOfBirth()
                    address().validate()
                    identification().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Grantor &&
                    this.name == other.name &&
                    this.dateOfBirth == other.dateOfBirth &&
                    this.address == other.address &&
                    this.identification == other.identification &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            name,
                            dateOfBirth,
                            address,
                            identification,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Grantor{name=$name, dateOfBirth=$dateOfBirth, address=$address, identification=$identification, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: JsonField<String> = JsonMissing.of()
                private var dateOfBirth: JsonField<LocalDate> = JsonMissing.of()
                private var address: JsonField<Address> = JsonMissing.of()
                private var identification: JsonField<Identification> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(grantor: Grantor) = apply {
                    this.name = grantor.name
                    this.dateOfBirth = grantor.dateOfBirth
                    this.address = grantor.address
                    this.identification = grantor.identification
                    additionalProperties(grantor.additionalProperties)
                }

                /** The person's legal name. */
                fun name(name: String) = name(JsonField.of(name))

                /** The person's legal name. */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The person's date of birth in YYYY-MM-DD format. */
                fun dateOfBirth(dateOfBirth: LocalDate) = dateOfBirth(JsonField.of(dateOfBirth))

                /** The person's date of birth in YYYY-MM-DD format. */
                @JsonProperty("date_of_birth")
                @ExcludeMissing
                fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                    this.dateOfBirth = dateOfBirth
                }

                /** The person's address. */
                fun address(address: Address) = address(JsonField.of(address))

                /** The person's address. */
                @JsonProperty("address")
                @ExcludeMissing
                fun address(address: JsonField<Address>) = apply { this.address = address }

                /** A means of verifying the person's identity. */
                fun identification(identification: Identification) =
                    identification(JsonField.of(identification))

                /** A means of verifying the person's identity. */
                @JsonProperty("identification")
                @ExcludeMissing
                fun identification(identification: JsonField<Identification>) = apply {
                    this.identification = identification
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Grantor =
                    Grantor(
                        name,
                        dateOfBirth,
                        address,
                        identification,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /** The person's address. */
            @JsonDeserialize(builder = Address.Builder::class)
            @NoAutoDetect
            class Address
            private constructor(
                private val line1: JsonField<String>,
                private val line2: JsonField<String>,
                private val city: JsonField<String>,
                private val state: JsonField<String>,
                private val zip: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The first line of the address. */
                fun line1(): String = line1.getRequired("line1")

                /** The second line of the address. */
                fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

                /** The city of the address. */
                fun city(): String = city.getRequired("city")

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                fun state(): String = state.getRequired("state")

                /** The ZIP code of the address. */
                fun zip(): String = zip.getRequired("zip")

                /** The first line of the address. */
                @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

                /** The second line of the address. */
                @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

                /** The city of the address. */
                @JsonProperty("city") @ExcludeMissing fun _city() = city

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                @JsonProperty("state") @ExcludeMissing fun _state() = state

                /** The ZIP code of the address. */
                @JsonProperty("zip") @ExcludeMissing fun _zip() = zip

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Address = apply {
                    if (!validated) {
                        line1()
                        line2()
                        city()
                        state()
                        zip()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Address &&
                        this.line1 == other.line1 &&
                        this.line2 == other.line2 &&
                        this.city == other.city &&
                        this.state == other.state &&
                        this.zip == other.zip &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                line1,
                                line2,
                                city,
                                state,
                                zip,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Address{line1=$line1, line2=$line2, city=$city, state=$state, zip=$zip, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var line1: JsonField<String> = JsonMissing.of()
                    private var line2: JsonField<String> = JsonMissing.of()
                    private var city: JsonField<String> = JsonMissing.of()
                    private var state: JsonField<String> = JsonMissing.of()
                    private var zip: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(address: Address) = apply {
                        this.line1 = address.line1
                        this.line2 = address.line2
                        this.city = address.city
                        this.state = address.state
                        this.zip = address.zip
                        additionalProperties(address.additionalProperties)
                    }

                    /** The first line of the address. */
                    fun line1(line1: String) = line1(JsonField.of(line1))

                    /** The first line of the address. */
                    @JsonProperty("line1")
                    @ExcludeMissing
                    fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                    /** The second line of the address. */
                    fun line2(line2: String) = line2(JsonField.of(line2))

                    /** The second line of the address. */
                    @JsonProperty("line2")
                    @ExcludeMissing
                    fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                    /** The city of the address. */
                    fun city(city: String) = city(JsonField.of(city))

                    /** The city of the address. */
                    @JsonProperty("city")
                    @ExcludeMissing
                    fun city(city: JsonField<String>) = apply { this.city = city }

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    fun state(state: String) = state(JsonField.of(state))

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    @JsonProperty("state")
                    @ExcludeMissing
                    fun state(state: JsonField<String>) = apply { this.state = state }

                    /** The ZIP code of the address. */
                    fun zip(zip: String) = zip(JsonField.of(zip))

                    /** The ZIP code of the address. */
                    @JsonProperty("zip")
                    @ExcludeMissing
                    fun zip(zip: JsonField<String>) = apply { this.zip = zip }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Address =
                        Address(
                            line1,
                            line2,
                            city,
                            state,
                            zip,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /** A means of verifying the person's identity. */
            @JsonDeserialize(builder = Identification.Builder::class)
            @NoAutoDetect
            class Identification
            private constructor(
                private val method: JsonField<Method>,
                private val numberLast4: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** A method that can be used to verify the individual's identity. */
                fun method(): Method = method.getRequired("method")

                /**
                 * The last 4 digits of the identification number that can be used to verify the
                 * individual's identity.
                 */
                fun numberLast4(): String = numberLast4.getRequired("number_last4")

                /** A method that can be used to verify the individual's identity. */
                @JsonProperty("method") @ExcludeMissing fun _method() = method

                /**
                 * The last 4 digits of the identification number that can be used to verify the
                 * individual's identity.
                 */
                @JsonProperty("number_last4") @ExcludeMissing fun _numberLast4() = numberLast4

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Identification = apply {
                    if (!validated) {
                        method()
                        numberLast4()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Identification &&
                        this.method == other.method &&
                        this.numberLast4 == other.numberLast4 &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                method,
                                numberLast4,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Identification{method=$method, numberLast4=$numberLast4, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var method: JsonField<Method> = JsonMissing.of()
                    private var numberLast4: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(identification: Identification) = apply {
                        this.method = identification.method
                        this.numberLast4 = identification.numberLast4
                        additionalProperties(identification.additionalProperties)
                    }

                    /** A method that can be used to verify the individual's identity. */
                    fun method(method: Method) = method(JsonField.of(method))

                    /** A method that can be used to verify the individual's identity. */
                    @JsonProperty("method")
                    @ExcludeMissing
                    fun method(method: JsonField<Method>) = apply { this.method = method }

                    /**
                     * The last 4 digits of the identification number that can be used to verify the
                     * individual's identity.
                     */
                    fun numberLast4(numberLast4: String) = numberLast4(JsonField.of(numberLast4))

                    /**
                     * The last 4 digits of the identification number that can be used to verify the
                     * individual's identity.
                     */
                    @JsonProperty("number_last4")
                    @ExcludeMissing
                    fun numberLast4(numberLast4: JsonField<String>) = apply {
                        this.numberLast4 = numberLast4
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Identification =
                        Identification(
                            method,
                            numberLast4,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Method
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Method && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField
                        val SOCIAL_SECURITY_NUMBER = Method(JsonField.of("social_security_number"))

                        @JvmField
                        val INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER =
                            Method(JsonField.of("individual_taxpayer_identification_number"))

                        @JvmField val PASSPORT = Method(JsonField.of("passport"))

                        @JvmField val DRIVERS_LICENSE = Method(JsonField.of("drivers_license"))

                        @JvmField val OTHER = Method(JsonField.of("other"))

                        @JvmStatic fun of(value: String) = Method(JsonField.of(value))
                    }

                    enum class Known {
                        SOCIAL_SECURITY_NUMBER,
                        INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER,
                        PASSPORT,
                        DRIVERS_LICENSE,
                        OTHER,
                    }

                    enum class Value {
                        SOCIAL_SECURITY_NUMBER,
                        INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER,
                        PASSPORT,
                        DRIVERS_LICENSE,
                        OTHER,
                        _UNKNOWN,
                    }

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

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }

        @JsonDeserialize(builder = Trustee.Builder::class)
        @NoAutoDetect
        class Trustee
        private constructor(
            private val structure: JsonField<Structure>,
            private val individual: JsonField<Individual>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The structure of the trustee. Will always be equal to `individual`. */
            fun structure(): Structure = structure.getRequired("structure")

            /**
             * The individual trustee of the trust. Will be present if the trustee's `structure` is
             * equal to `individual`.
             */
            fun individual(): Optional<Individual> =
                Optional.ofNullable(individual.getNullable("individual"))

            /** The structure of the trustee. Will always be equal to `individual`. */
            @JsonProperty("structure") @ExcludeMissing fun _structure() = structure

            /**
             * The individual trustee of the trust. Will be present if the trustee's `structure` is
             * equal to `individual`.
             */
            @JsonProperty("individual") @ExcludeMissing fun _individual() = individual

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Trustee = apply {
                if (!validated) {
                    structure()
                    individual().map { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Trustee &&
                    this.structure == other.structure &&
                    this.individual == other.individual &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            structure,
                            individual,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Trustee{structure=$structure, individual=$individual, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var structure: JsonField<Structure> = JsonMissing.of()
                private var individual: JsonField<Individual> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(trustee: Trustee) = apply {
                    this.structure = trustee.structure
                    this.individual = trustee.individual
                    additionalProperties(trustee.additionalProperties)
                }

                /** The structure of the trustee. Will always be equal to `individual`. */
                fun structure(structure: Structure) = structure(JsonField.of(structure))

                /** The structure of the trustee. Will always be equal to `individual`. */
                @JsonProperty("structure")
                @ExcludeMissing
                fun structure(structure: JsonField<Structure>) = apply {
                    this.structure = structure
                }

                /**
                 * The individual trustee of the trust. Will be present if the trustee's `structure`
                 * is equal to `individual`.
                 */
                fun individual(individual: Individual) = individual(JsonField.of(individual))

                /**
                 * The individual trustee of the trust. Will be present if the trustee's `structure`
                 * is equal to `individual`.
                 */
                @JsonProperty("individual")
                @ExcludeMissing
                fun individual(individual: JsonField<Individual>) = apply {
                    this.individual = individual
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Trustee =
                    Trustee(
                        structure,
                        individual,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /**
             * The individual trustee of the trust. Will be present if the trustee's `structure` is
             * equal to `individual`.
             */
            @JsonDeserialize(builder = Individual.Builder::class)
            @NoAutoDetect
            class Individual
            private constructor(
                private val name: JsonField<String>,
                private val dateOfBirth: JsonField<LocalDate>,
                private val address: JsonField<Address>,
                private val identification: JsonField<Identification>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The person's legal name. */
                fun name(): String = name.getRequired("name")

                /** The person's date of birth in YYYY-MM-DD format. */
                fun dateOfBirth(): LocalDate = dateOfBirth.getRequired("date_of_birth")

                /** The person's address. */
                fun address(): Address = address.getRequired("address")

                /** A means of verifying the person's identity. */
                fun identification(): Identification = identification.getRequired("identification")

                /** The person's legal name. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                /** The person's date of birth in YYYY-MM-DD format. */
                @JsonProperty("date_of_birth") @ExcludeMissing fun _dateOfBirth() = dateOfBirth

                /** The person's address. */
                @JsonProperty("address") @ExcludeMissing fun _address() = address

                /** A means of verifying the person's identity. */
                @JsonProperty("identification")
                @ExcludeMissing
                fun _identification() = identification

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Individual = apply {
                    if (!validated) {
                        name()
                        dateOfBirth()
                        address().validate()
                        identification().validate()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        this.name == other.name &&
                        this.dateOfBirth == other.dateOfBirth &&
                        this.address == other.address &&
                        this.identification == other.identification &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                name,
                                dateOfBirth,
                                address,
                                identification,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Individual{name=$name, dateOfBirth=$dateOfBirth, address=$address, identification=$identification, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var name: JsonField<String> = JsonMissing.of()
                    private var dateOfBirth: JsonField<LocalDate> = JsonMissing.of()
                    private var address: JsonField<Address> = JsonMissing.of()
                    private var identification: JsonField<Identification> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(individual: Individual) = apply {
                        this.name = individual.name
                        this.dateOfBirth = individual.dateOfBirth
                        this.address = individual.address
                        this.identification = individual.identification
                        additionalProperties(individual.additionalProperties)
                    }

                    /** The person's legal name. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The person's legal name. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /** The person's date of birth in YYYY-MM-DD format. */
                    fun dateOfBirth(dateOfBirth: LocalDate) = dateOfBirth(JsonField.of(dateOfBirth))

                    /** The person's date of birth in YYYY-MM-DD format. */
                    @JsonProperty("date_of_birth")
                    @ExcludeMissing
                    fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                        this.dateOfBirth = dateOfBirth
                    }

                    /** The person's address. */
                    fun address(address: Address) = address(JsonField.of(address))

                    /** The person's address. */
                    @JsonProperty("address")
                    @ExcludeMissing
                    fun address(address: JsonField<Address>) = apply { this.address = address }

                    /** A means of verifying the person's identity. */
                    fun identification(identification: Identification) =
                        identification(JsonField.of(identification))

                    /** A means of verifying the person's identity. */
                    @JsonProperty("identification")
                    @ExcludeMissing
                    fun identification(identification: JsonField<Identification>) = apply {
                        this.identification = identification
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Individual =
                        Individual(
                            name,
                            dateOfBirth,
                            address,
                            identification,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /** The person's address. */
                @JsonDeserialize(builder = Address.Builder::class)
                @NoAutoDetect
                class Address
                private constructor(
                    private val line1: JsonField<String>,
                    private val line2: JsonField<String>,
                    private val city: JsonField<String>,
                    private val state: JsonField<String>,
                    private val zip: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** The first line of the address. */
                    fun line1(): String = line1.getRequired("line1")

                    /** The second line of the address. */
                    fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

                    /** The city of the address. */
                    fun city(): String = city.getRequired("city")

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    fun state(): String = state.getRequired("state")

                    /** The ZIP code of the address. */
                    fun zip(): String = zip.getRequired("zip")

                    /** The first line of the address. */
                    @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

                    /** The second line of the address. */
                    @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

                    /** The city of the address. */
                    @JsonProperty("city") @ExcludeMissing fun _city() = city

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    @JsonProperty("state") @ExcludeMissing fun _state() = state

                    /** The ZIP code of the address. */
                    @JsonProperty("zip") @ExcludeMissing fun _zip() = zip

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Address = apply {
                        if (!validated) {
                            line1()
                            line2()
                            city()
                            state()
                            zip()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Address &&
                            this.line1 == other.line1 &&
                            this.line2 == other.line2 &&
                            this.city == other.city &&
                            this.state == other.state &&
                            this.zip == other.zip &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    line1,
                                    line2,
                                    city,
                                    state,
                                    zip,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Address{line1=$line1, line2=$line2, city=$city, state=$state, zip=$zip, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var line1: JsonField<String> = JsonMissing.of()
                        private var line2: JsonField<String> = JsonMissing.of()
                        private var city: JsonField<String> = JsonMissing.of()
                        private var state: JsonField<String> = JsonMissing.of()
                        private var zip: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(address: Address) = apply {
                            this.line1 = address.line1
                            this.line2 = address.line2
                            this.city = address.city
                            this.state = address.state
                            this.zip = address.zip
                            additionalProperties(address.additionalProperties)
                        }

                        /** The first line of the address. */
                        fun line1(line1: String) = line1(JsonField.of(line1))

                        /** The first line of the address. */
                        @JsonProperty("line1")
                        @ExcludeMissing
                        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                        /** The second line of the address. */
                        fun line2(line2: String) = line2(JsonField.of(line2))

                        /** The second line of the address. */
                        @JsonProperty("line2")
                        @ExcludeMissing
                        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                        /** The city of the address. */
                        fun city(city: String) = city(JsonField.of(city))

                        /** The city of the address. */
                        @JsonProperty("city")
                        @ExcludeMissing
                        fun city(city: JsonField<String>) = apply { this.city = city }

                        /**
                         * The two-letter United States Postal Service (USPS) abbreviation for the
                         * state of the address.
                         */
                        fun state(state: String) = state(JsonField.of(state))

                        /**
                         * The two-letter United States Postal Service (USPS) abbreviation for the
                         * state of the address.
                         */
                        @JsonProperty("state")
                        @ExcludeMissing
                        fun state(state: JsonField<String>) = apply { this.state = state }

                        /** The ZIP code of the address. */
                        fun zip(zip: String) = zip(JsonField.of(zip))

                        /** The ZIP code of the address. */
                        @JsonProperty("zip")
                        @ExcludeMissing
                        fun zip(zip: JsonField<String>) = apply { this.zip = zip }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Address =
                            Address(
                                line1,
                                line2,
                                city,
                                state,
                                zip,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }

                /** A means of verifying the person's identity. */
                @JsonDeserialize(builder = Identification.Builder::class)
                @NoAutoDetect
                class Identification
                private constructor(
                    private val method: JsonField<Method>,
                    private val numberLast4: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** A method that can be used to verify the individual's identity. */
                    fun method(): Method = method.getRequired("method")

                    /**
                     * The last 4 digits of the identification number that can be used to verify the
                     * individual's identity.
                     */
                    fun numberLast4(): String = numberLast4.getRequired("number_last4")

                    /** A method that can be used to verify the individual's identity. */
                    @JsonProperty("method") @ExcludeMissing fun _method() = method

                    /**
                     * The last 4 digits of the identification number that can be used to verify the
                     * individual's identity.
                     */
                    @JsonProperty("number_last4") @ExcludeMissing fun _numberLast4() = numberLast4

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Identification = apply {
                        if (!validated) {
                            method()
                            numberLast4()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Identification &&
                            this.method == other.method &&
                            this.numberLast4 == other.numberLast4 &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    method,
                                    numberLast4,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Identification{method=$method, numberLast4=$numberLast4, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var method: JsonField<Method> = JsonMissing.of()
                        private var numberLast4: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(identification: Identification) = apply {
                            this.method = identification.method
                            this.numberLast4 = identification.numberLast4
                            additionalProperties(identification.additionalProperties)
                        }

                        /** A method that can be used to verify the individual's identity. */
                        fun method(method: Method) = method(JsonField.of(method))

                        /** A method that can be used to verify the individual's identity. */
                        @JsonProperty("method")
                        @ExcludeMissing
                        fun method(method: JsonField<Method>) = apply { this.method = method }

                        /**
                         * The last 4 digits of the identification number that can be used to verify
                         * the individual's identity.
                         */
                        fun numberLast4(numberLast4: String) =
                            numberLast4(JsonField.of(numberLast4))

                        /**
                         * The last 4 digits of the identification number that can be used to verify
                         * the individual's identity.
                         */
                        @JsonProperty("number_last4")
                        @ExcludeMissing
                        fun numberLast4(numberLast4: JsonField<String>) = apply {
                            this.numberLast4 = numberLast4
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Identification =
                            Identification(
                                method,
                                numberLast4,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class Method
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Method && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField
                            val SOCIAL_SECURITY_NUMBER =
                                Method(JsonField.of("social_security_number"))

                            @JvmField
                            val INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER =
                                Method(JsonField.of("individual_taxpayer_identification_number"))

                            @JvmField val PASSPORT = Method(JsonField.of("passport"))

                            @JvmField val DRIVERS_LICENSE = Method(JsonField.of("drivers_license"))

                            @JvmField val OTHER = Method(JsonField.of("other"))

                            @JvmStatic fun of(value: String) = Method(JsonField.of(value))
                        }

                        enum class Known {
                            SOCIAL_SECURITY_NUMBER,
                            INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER,
                            PASSPORT,
                            DRIVERS_LICENSE,
                            OTHER,
                        }

                        enum class Value {
                            SOCIAL_SECURITY_NUMBER,
                            INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER,
                            PASSPORT,
                            DRIVERS_LICENSE,
                            OTHER,
                            _UNKNOWN,
                        }

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

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }
            }

            class Structure
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Structure && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val INDIVIDUAL = Structure(JsonField.of("individual"))

                    @JvmStatic fun of(value: String) = Structure(JsonField.of(value))
                }

                enum class Known {
                    INDIVIDUAL,
                }

                enum class Value {
                    INDIVIDUAL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        INDIVIDUAL -> Value.INDIVIDUAL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        INDIVIDUAL -> Known.INDIVIDUAL
                        else -> throw IncreaseInvalidDataException("Unknown Structure: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }
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

            @JvmField val ENTITY = Type(JsonField.of("entity"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            ENTITY,
        }

        enum class Value {
            ENTITY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ENTITY -> Value.ENTITY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ENTITY -> Known.ENTITY
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
