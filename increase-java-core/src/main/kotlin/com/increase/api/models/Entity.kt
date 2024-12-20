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
    private val thirdPartyVerification: JsonField<ThirdPartyVerification>,
    private val trust: JsonField<Trust>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

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

    /**
     * A reference to data stored in a third-party verification service. Your integration may or may
     * not use this field.
     */
    fun thirdPartyVerification(): Optional<ThirdPartyVerification> =
        Optional.ofNullable(thirdPartyVerification.getNullable("third_party_verification"))

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

    /**
     * A reference to data stored in a third-party verification service. Your integration may or may
     * not use this field.
     */
    @JsonProperty("third_party_verification")
    @ExcludeMissing
    fun _thirdPartyVerification() = thirdPartyVerification

    /** Details of the trust entity. Will be present if `structure` is equal to `trust`. */
    @JsonProperty("trust") @ExcludeMissing fun _trust() = trust

    /** A constant representing the object's type. For this resource it will always be `entity`. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

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
            thirdPartyVerification().map { it.validate() }
            trust().map { it.validate() }
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

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
        private var thirdPartyVerification: JsonField<ThirdPartyVerification> = JsonMissing.of()
        private var trust: JsonField<Trust> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(entity: Entity) = apply {
            corporation = entity.corporation
            createdAt = entity.createdAt
            description = entity.description
            detailsConfirmedAt = entity.detailsConfirmedAt
            governmentAuthority = entity.governmentAuthority
            id = entity.id
            idempotencyKey = entity.idempotencyKey
            joint = entity.joint
            naturalPerson = entity.naturalPerson
            status = entity.status
            structure = entity.structure
            supplementalDocuments = entity.supplementalDocuments
            thirdPartyVerification = entity.thirdPartyVerification
            trust = entity.trust
            type = entity.type
            additionalProperties = entity.additionalProperties.toMutableMap()
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

        /**
         * A reference to data stored in a third-party verification service. Your integration may or
         * may not use this field.
         */
        fun thirdPartyVerification(thirdPartyVerification: ThirdPartyVerification) =
            thirdPartyVerification(JsonField.of(thirdPartyVerification))

        /**
         * A reference to data stored in a third-party verification service. Your integration may or
         * may not use this field.
         */
        @JsonProperty("third_party_verification")
        @ExcludeMissing
        fun thirdPartyVerification(thirdPartyVerification: JsonField<ThirdPartyVerification>) =
            apply {
                this.thirdPartyVerification = thirdPartyVerification
            }

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
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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
                supplementalDocuments.map { it.toImmutable() },
                thirdPartyVerification,
                trust,
                type,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * Details of the corporation entity. Will be present if `structure` is equal to `corporation`.
     */
    @JsonDeserialize(builder = Corporation.Builder::class)
    @NoAutoDetect
    class Corporation
    private constructor(
        private val address: JsonField<Address>,
        private val beneficialOwners: JsonField<List<BeneficialOwner>>,
        private val incorporationState: JsonField<String>,
        private val industryCode: JsonField<String>,
        private val name: JsonField<String>,
        private val taxIdentifier: JsonField<String>,
        private val website: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The corporation's address. */
        fun address(): Address = address.getRequired("address")

        /**
         * The identifying details of anyone controlling or owning 25% or more of the corporation.
         */
        fun beneficialOwners(): List<BeneficialOwner> =
            beneficialOwners.getRequired("beneficial_owners")

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

        /** The legal name of the corporation. */
        fun name(): String = name.getRequired("name")

        /** The Employer Identification Number (EIN) for the corporation. */
        fun taxIdentifier(): Optional<String> =
            Optional.ofNullable(taxIdentifier.getNullable("tax_identifier"))

        /** The website of the corporation. */
        fun website(): Optional<String> = Optional.ofNullable(website.getNullable("website"))

        /** The corporation's address. */
        @JsonProperty("address") @ExcludeMissing fun _address() = address

        /**
         * The identifying details of anyone controlling or owning 25% or more of the corporation.
         */
        @JsonProperty("beneficial_owners")
        @ExcludeMissing
        fun _beneficialOwners() = beneficialOwners

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

        /** The legal name of the corporation. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** The Employer Identification Number (EIN) for the corporation. */
        @JsonProperty("tax_identifier") @ExcludeMissing fun _taxIdentifier() = taxIdentifier

        /** The website of the corporation. */
        @JsonProperty("website") @ExcludeMissing fun _website() = website

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Corporation = apply {
            if (!validated) {
                address().validate()
                beneficialOwners().forEach { it.validate() }
                incorporationState()
                industryCode()
                name()
                taxIdentifier()
                website()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address: JsonField<Address> = JsonMissing.of()
            private var beneficialOwners: JsonField<List<BeneficialOwner>> = JsonMissing.of()
            private var incorporationState: JsonField<String> = JsonMissing.of()
            private var industryCode: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var taxIdentifier: JsonField<String> = JsonMissing.of()
            private var website: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(corporation: Corporation) = apply {
                address = corporation.address
                beneficialOwners = corporation.beneficialOwners
                incorporationState = corporation.incorporationState
                industryCode = corporation.industryCode
                name = corporation.name
                taxIdentifier = corporation.taxIdentifier
                website = corporation.website
                additionalProperties = corporation.additionalProperties.toMutableMap()
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

            /** The legal name of the corporation. */
            fun name(name: String) = name(JsonField.of(name))

            /** The legal name of the corporation. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The Employer Identification Number (EIN) for the corporation. */
            fun taxIdentifier(taxIdentifier: String) = taxIdentifier(JsonField.of(taxIdentifier))

            /** The Employer Identification Number (EIN) for the corporation. */
            @JsonProperty("tax_identifier")
            @ExcludeMissing
            fun taxIdentifier(taxIdentifier: JsonField<String>) = apply {
                this.taxIdentifier = taxIdentifier
            }

            /** The website of the corporation. */
            fun website(website: String) = website(JsonField.of(website))

            /** The website of the corporation. */
            @JsonProperty("website")
            @ExcludeMissing
            fun website(website: JsonField<String>) = apply { this.website = website }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): Corporation =
                Corporation(
                    address,
                    beneficialOwners.map { it.toImmutable() },
                    incorporationState,
                    industryCode,
                    name,
                    taxIdentifier,
                    website,
                    additionalProperties.toImmutable(),
                )
        }

        /** The corporation's address. */
        @JsonDeserialize(builder = Address.Builder::class)
        @NoAutoDetect
        class Address
        private constructor(
            private val city: JsonField<String>,
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val state: JsonField<String>,
            private val zip: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The city of the address. */
            fun city(): String = city.getRequired("city")

            /** The first line of the address. */
            fun line1(): String = line1.getRequired("line1")

            /** The second line of the address. */
            fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            fun state(): String = state.getRequired("state")

            /** The ZIP code of the address. */
            fun zip(): String = zip.getRequired("zip")

            /** The city of the address. */
            @JsonProperty("city") @ExcludeMissing fun _city() = city

            /** The first line of the address. */
            @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

            /** The second line of the address. */
            @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

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

            private var validated: Boolean = false

            fun validate(): Address = apply {
                if (!validated) {
                    city()
                    line1()
                    line2()
                    state()
                    zip()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var city: JsonField<String> = JsonMissing.of()
                private var line1: JsonField<String> = JsonMissing.of()
                private var line2: JsonField<String> = JsonMissing.of()
                private var state: JsonField<String> = JsonMissing.of()
                private var zip: JsonField<String> = JsonMissing.of()
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

                /** The city of the address. */
                @JsonProperty("city")
                @ExcludeMissing
                fun city(city: JsonField<String>) = apply { this.city = city }

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
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): Address =
                    Address(
                        city,
                        line1,
                        line2,
                        state,
                        zip,
                        additionalProperties.toImmutable(),
                    )
            }

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

        @JsonDeserialize(builder = BeneficialOwner.Builder::class)
        @NoAutoDetect
        class BeneficialOwner
        private constructor(
            private val beneficialOwnerId: JsonField<String>,
            private val companyTitle: JsonField<String>,
            private val individual: JsonField<Individual>,
            private val prong: JsonField<Prong>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The identifier of this beneficial owner. */
            fun beneficialOwnerId(): String = beneficialOwnerId.getRequired("beneficial_owner_id")

            /** This person's role or title within the entity. */
            fun companyTitle(): Optional<String> =
                Optional.ofNullable(companyTitle.getNullable("company_title"))

            /** Personal details for the beneficial owner. */
            fun individual(): Individual = individual.getRequired("individual")

            /** Why this person is considered a beneficial owner of the entity. */
            fun prong(): Prong = prong.getRequired("prong")

            /** The identifier of this beneficial owner. */
            @JsonProperty("beneficial_owner_id")
            @ExcludeMissing
            fun _beneficialOwnerId() = beneficialOwnerId

            /** This person's role or title within the entity. */
            @JsonProperty("company_title") @ExcludeMissing fun _companyTitle() = companyTitle

            /** Personal details for the beneficial owner. */
            @JsonProperty("individual") @ExcludeMissing fun _individual() = individual

            /** Why this person is considered a beneficial owner of the entity. */
            @JsonProperty("prong") @ExcludeMissing fun _prong() = prong

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): BeneficialOwner = apply {
                if (!validated) {
                    beneficialOwnerId()
                    companyTitle()
                    individual().validate()
                    prong()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var beneficialOwnerId: JsonField<String> = JsonMissing.of()
                private var companyTitle: JsonField<String> = JsonMissing.of()
                private var individual: JsonField<Individual> = JsonMissing.of()
                private var prong: JsonField<Prong> = JsonMissing.of()
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

                /** The identifier of this beneficial owner. */
                @JsonProperty("beneficial_owner_id")
                @ExcludeMissing
                fun beneficialOwnerId(beneficialOwnerId: JsonField<String>) = apply {
                    this.beneficialOwnerId = beneficialOwnerId
                }

                /** This person's role or title within the entity. */
                fun companyTitle(companyTitle: String) = companyTitle(JsonField.of(companyTitle))

                /** This person's role or title within the entity. */
                @JsonProperty("company_title")
                @ExcludeMissing
                fun companyTitle(companyTitle: JsonField<String>) = apply {
                    this.companyTitle = companyTitle
                }

                /** Personal details for the beneficial owner. */
                fun individual(individual: Individual) = individual(JsonField.of(individual))

                /** Personal details for the beneficial owner. */
                @JsonProperty("individual")
                @ExcludeMissing
                fun individual(individual: JsonField<Individual>) = apply {
                    this.individual = individual
                }

                /** Why this person is considered a beneficial owner of the entity. */
                fun prong(prong: Prong) = prong(JsonField.of(prong))

                /** Why this person is considered a beneficial owner of the entity. */
                @JsonProperty("prong")
                @ExcludeMissing
                fun prong(prong: JsonField<Prong>) = apply { this.prong = prong }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): BeneficialOwner =
                    BeneficialOwner(
                        beneficialOwnerId,
                        companyTitle,
                        individual,
                        prong,
                        additionalProperties.toImmutable(),
                    )
            }

            /** Personal details for the beneficial owner. */
            @JsonDeserialize(builder = Individual.Builder::class)
            @NoAutoDetect
            class Individual
            private constructor(
                private val address: JsonField<Address>,
                private val dateOfBirth: JsonField<LocalDate>,
                private val identification: JsonField<Identification>,
                private val name: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** The person's address. */
                fun address(): Address = address.getRequired("address")

                /** The person's date of birth in YYYY-MM-DD format. */
                fun dateOfBirth(): LocalDate = dateOfBirth.getRequired("date_of_birth")

                /** A means of verifying the person's identity. */
                fun identification(): Identification = identification.getRequired("identification")

                /** The person's legal name. */
                fun name(): String = name.getRequired("name")

                /** The person's address. */
                @JsonProperty("address") @ExcludeMissing fun _address() = address

                /** The person's date of birth in YYYY-MM-DD format. */
                @JsonProperty("date_of_birth") @ExcludeMissing fun _dateOfBirth() = dateOfBirth

                /** A means of verifying the person's identity. */
                @JsonProperty("identification")
                @ExcludeMissing
                fun _identification() = identification

                /** The person's legal name. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Individual = apply {
                    if (!validated) {
                        address().validate()
                        dateOfBirth()
                        identification().validate()
                        name()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var address: JsonField<Address> = JsonMissing.of()
                    private var dateOfBirth: JsonField<LocalDate> = JsonMissing.of()
                    private var identification: JsonField<Identification> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
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

                    /** The person's address. */
                    @JsonProperty("address")
                    @ExcludeMissing
                    fun address(address: JsonField<Address>) = apply { this.address = address }

                    /** The person's date of birth in YYYY-MM-DD format. */
                    fun dateOfBirth(dateOfBirth: LocalDate) = dateOfBirth(JsonField.of(dateOfBirth))

                    /** The person's date of birth in YYYY-MM-DD format. */
                    @JsonProperty("date_of_birth")
                    @ExcludeMissing
                    fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                        this.dateOfBirth = dateOfBirth
                    }

                    /** A means of verifying the person's identity. */
                    fun identification(identification: Identification) =
                        identification(JsonField.of(identification))

                    /** A means of verifying the person's identity. */
                    @JsonProperty("identification")
                    @ExcludeMissing
                    fun identification(identification: JsonField<Identification>) = apply {
                        this.identification = identification
                    }

                    /** The person's legal name. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The person's legal name. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
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

                    fun build(): Individual =
                        Individual(
                            address,
                            dateOfBirth,
                            identification,
                            name,
                            additionalProperties.toImmutable(),
                        )
                }

                /** The person's address. */
                @JsonDeserialize(builder = Address.Builder::class)
                @NoAutoDetect
                class Address
                private constructor(
                    private val city: JsonField<String>,
                    private val line1: JsonField<String>,
                    private val line2: JsonField<String>,
                    private val state: JsonField<String>,
                    private val zip: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /** The city of the address. */
                    fun city(): String = city.getRequired("city")

                    /** The first line of the address. */
                    fun line1(): String = line1.getRequired("line1")

                    /** The second line of the address. */
                    fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    fun state(): String = state.getRequired("state")

                    /** The ZIP code of the address. */
                    fun zip(): String = zip.getRequired("zip")

                    /** The city of the address. */
                    @JsonProperty("city") @ExcludeMissing fun _city() = city

                    /** The first line of the address. */
                    @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

                    /** The second line of the address. */
                    @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

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

                    private var validated: Boolean = false

                    fun validate(): Address = apply {
                        if (!validated) {
                            city()
                            line1()
                            line2()
                            state()
                            zip()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var city: JsonField<String> = JsonMissing.of()
                        private var line1: JsonField<String> = JsonMissing.of()
                        private var line2: JsonField<String> = JsonMissing.of()
                        private var state: JsonField<String> = JsonMissing.of()
                        private var zip: JsonField<String> = JsonMissing.of()
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

                        /** The city of the address. */
                        @JsonProperty("city")
                        @ExcludeMissing
                        fun city(city: JsonField<String>) = apply { this.city = city }

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
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
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

                        fun build(): Address =
                            Address(
                                city,
                                line1,
                                line2,
                                state,
                                zip,
                                additionalProperties.toImmutable(),
                            )
                    }

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
                @JsonDeserialize(builder = Identification.Builder::class)
                @NoAutoDetect
                class Identification
                private constructor(
                    private val method: JsonField<Method>,
                    private val numberLast4: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

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

                    private var validated: Boolean = false

                    fun validate(): Identification = apply {
                        if (!validated) {
                            method()
                            numberLast4()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

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
                            method = identification.method
                            numberLast4 = identification.numberLast4
                            additionalProperties =
                                identification.additionalProperties.toMutableMap()
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
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
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

                        fun build(): Identification =
                            Identification(
                                method,
                                numberLast4,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class Method
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val SOCIAL_SECURITY_NUMBER = of("social_security_number")

                            @JvmField
                            val INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER =
                                of("individual_taxpayer_identification_number")

                            @JvmField val PASSPORT = of("passport")

                            @JvmField val DRIVERS_LICENSE = of("drivers_license")

                            @JvmField val OTHER = of("other")

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

            class Prong
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val OWNERSHIP = of("ownership")

                    @JvmField val CONTROL = of("control")

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
    @JsonDeserialize(builder = GovernmentAuthority.Builder::class)
    @NoAutoDetect
    class GovernmentAuthority
    private constructor(
        private val address: JsonField<Address>,
        private val authorizedPersons: JsonField<List<AuthorizedPerson>>,
        private val category: JsonField<Category>,
        private val name: JsonField<String>,
        private val taxIdentifier: JsonField<String>,
        private val website: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The government authority's address. */
        fun address(): Address = address.getRequired("address")

        /** The identifying details of authorized persons of the government authority. */
        fun authorizedPersons(): List<AuthorizedPerson> =
            authorizedPersons.getRequired("authorized_persons")

        /** The category of the government authority. */
        fun category(): Category = category.getRequired("category")

        /** The government authority's name. */
        fun name(): String = name.getRequired("name")

        /** The Employer Identification Number (EIN) of the government authority. */
        fun taxIdentifier(): Optional<String> =
            Optional.ofNullable(taxIdentifier.getNullable("tax_identifier"))

        /** The government authority's website. */
        fun website(): Optional<String> = Optional.ofNullable(website.getNullable("website"))

        /** The government authority's address. */
        @JsonProperty("address") @ExcludeMissing fun _address() = address

        /** The identifying details of authorized persons of the government authority. */
        @JsonProperty("authorized_persons")
        @ExcludeMissing
        fun _authorizedPersons() = authorizedPersons

        /** The category of the government authority. */
        @JsonProperty("category") @ExcludeMissing fun _category() = category

        /** The government authority's name. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** The Employer Identification Number (EIN) of the government authority. */
        @JsonProperty("tax_identifier") @ExcludeMissing fun _taxIdentifier() = taxIdentifier

        /** The government authority's website. */
        @JsonProperty("website") @ExcludeMissing fun _website() = website

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): GovernmentAuthority = apply {
            if (!validated) {
                address().validate()
                authorizedPersons().forEach { it.validate() }
                category()
                name()
                taxIdentifier()
                website()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address: JsonField<Address> = JsonMissing.of()
            private var authorizedPersons: JsonField<List<AuthorizedPerson>> = JsonMissing.of()
            private var category: JsonField<Category> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var taxIdentifier: JsonField<String> = JsonMissing.of()
            private var website: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(governmentAuthority: GovernmentAuthority) = apply {
                address = governmentAuthority.address
                authorizedPersons = governmentAuthority.authorizedPersons
                category = governmentAuthority.category
                name = governmentAuthority.name
                taxIdentifier = governmentAuthority.taxIdentifier
                website = governmentAuthority.website
                additionalProperties = governmentAuthority.additionalProperties.toMutableMap()
            }

            /** The government authority's address. */
            fun address(address: Address) = address(JsonField.of(address))

            /** The government authority's address. */
            @JsonProperty("address")
            @ExcludeMissing
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** The identifying details of authorized persons of the government authority. */
            fun authorizedPersons(authorizedPersons: List<AuthorizedPerson>) =
                authorizedPersons(JsonField.of(authorizedPersons))

            /** The identifying details of authorized persons of the government authority. */
            @JsonProperty("authorized_persons")
            @ExcludeMissing
            fun authorizedPersons(authorizedPersons: JsonField<List<AuthorizedPerson>>) = apply {
                this.authorizedPersons = authorizedPersons
            }

            /** The category of the government authority. */
            fun category(category: Category) = category(JsonField.of(category))

            /** The category of the government authority. */
            @JsonProperty("category")
            @ExcludeMissing
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** The government authority's name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The government authority's name. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The Employer Identification Number (EIN) of the government authority. */
            fun taxIdentifier(taxIdentifier: String) = taxIdentifier(JsonField.of(taxIdentifier))

            /** The Employer Identification Number (EIN) of the government authority. */
            @JsonProperty("tax_identifier")
            @ExcludeMissing
            fun taxIdentifier(taxIdentifier: JsonField<String>) = apply {
                this.taxIdentifier = taxIdentifier
            }

            /** The government authority's website. */
            fun website(website: String) = website(JsonField.of(website))

            /** The government authority's website. */
            @JsonProperty("website")
            @ExcludeMissing
            fun website(website: JsonField<String>) = apply { this.website = website }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): GovernmentAuthority =
                GovernmentAuthority(
                    address,
                    authorizedPersons.map { it.toImmutable() },
                    category,
                    name,
                    taxIdentifier,
                    website,
                    additionalProperties.toImmutable(),
                )
        }

        /** The government authority's address. */
        @JsonDeserialize(builder = Address.Builder::class)
        @NoAutoDetect
        class Address
        private constructor(
            private val city: JsonField<String>,
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val state: JsonField<String>,
            private val zip: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The city of the address. */
            fun city(): String = city.getRequired("city")

            /** The first line of the address. */
            fun line1(): String = line1.getRequired("line1")

            /** The second line of the address. */
            fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            fun state(): String = state.getRequired("state")

            /** The ZIP code of the address. */
            fun zip(): String = zip.getRequired("zip")

            /** The city of the address. */
            @JsonProperty("city") @ExcludeMissing fun _city() = city

            /** The first line of the address. */
            @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

            /** The second line of the address. */
            @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

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

            private var validated: Boolean = false

            fun validate(): Address = apply {
                if (!validated) {
                    city()
                    line1()
                    line2()
                    state()
                    zip()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var city: JsonField<String> = JsonMissing.of()
                private var line1: JsonField<String> = JsonMissing.of()
                private var line2: JsonField<String> = JsonMissing.of()
                private var state: JsonField<String> = JsonMissing.of()
                private var zip: JsonField<String> = JsonMissing.of()
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

                /** The city of the address. */
                @JsonProperty("city")
                @ExcludeMissing
                fun city(city: JsonField<String>) = apply { this.city = city }

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
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): Address =
                    Address(
                        city,
                        line1,
                        line2,
                        state,
                        zip,
                        additionalProperties.toImmutable(),
                    )
            }

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

        @JsonDeserialize(builder = AuthorizedPerson.Builder::class)
        @NoAutoDetect
        class AuthorizedPerson
        private constructor(
            private val authorizedPersonId: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The identifier of this authorized person. */
            fun authorizedPersonId(): String =
                authorizedPersonId.getRequired("authorized_person_id")

            /** The person's legal name. */
            fun name(): String = name.getRequired("name")

            /** The identifier of this authorized person. */
            @JsonProperty("authorized_person_id")
            @ExcludeMissing
            fun _authorizedPersonId() = authorizedPersonId

            /** The person's legal name. */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AuthorizedPerson = apply {
                if (!validated) {
                    authorizedPersonId()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var authorizedPersonId: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
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

                /** The identifier of this authorized person. */
                @JsonProperty("authorized_person_id")
                @ExcludeMissing
                fun authorizedPersonId(authorizedPersonId: JsonField<String>) = apply {
                    this.authorizedPersonId = authorizedPersonId
                }

                /** The person's legal name. */
                fun name(name: String) = name(JsonField.of(name))

                /** The person's legal name. */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): AuthorizedPerson =
                    AuthorizedPerson(
                        authorizedPersonId,
                        name,
                        additionalProperties.toImmutable(),
                    )
            }

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

        class Category
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val MUNICIPALITY = of("municipality")

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
    @JsonDeserialize(builder = Joint.Builder::class)
    @NoAutoDetect
    class Joint
    private constructor(
        private val individuals: JsonField<List<Individual>>,
        private val name: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The two individuals that share control of the entity. */
        fun individuals(): List<Individual> = individuals.getRequired("individuals")

        /** The entity's name. */
        fun name(): String = name.getRequired("name")

        /** The two individuals that share control of the entity. */
        @JsonProperty("individuals") @ExcludeMissing fun _individuals() = individuals

        /** The entity's name. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Joint = apply {
            if (!validated) {
                individuals().forEach { it.validate() }
                name()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var individuals: JsonField<List<Individual>> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(joint: Joint) = apply {
                individuals = joint.individuals
                name = joint.name
                additionalProperties = joint.additionalProperties.toMutableMap()
            }

            /** The two individuals that share control of the entity. */
            fun individuals(individuals: List<Individual>) = individuals(JsonField.of(individuals))

            /** The two individuals that share control of the entity. */
            @JsonProperty("individuals")
            @ExcludeMissing
            fun individuals(individuals: JsonField<List<Individual>>) = apply {
                this.individuals = individuals
            }

            /** The entity's name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The entity's name. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): Joint =
                Joint(
                    individuals.map { it.toImmutable() },
                    name,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = Individual.Builder::class)
        @NoAutoDetect
        class Individual
        private constructor(
            private val address: JsonField<Address>,
            private val dateOfBirth: JsonField<LocalDate>,
            private val identification: JsonField<Identification>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The person's address. */
            fun address(): Address = address.getRequired("address")

            /** The person's date of birth in YYYY-MM-DD format. */
            fun dateOfBirth(): LocalDate = dateOfBirth.getRequired("date_of_birth")

            /** A means of verifying the person's identity. */
            fun identification(): Identification = identification.getRequired("identification")

            /** The person's legal name. */
            fun name(): String = name.getRequired("name")

            /** The person's address. */
            @JsonProperty("address") @ExcludeMissing fun _address() = address

            /** The person's date of birth in YYYY-MM-DD format. */
            @JsonProperty("date_of_birth") @ExcludeMissing fun _dateOfBirth() = dateOfBirth

            /** A means of verifying the person's identity. */
            @JsonProperty("identification") @ExcludeMissing fun _identification() = identification

            /** The person's legal name. */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Individual = apply {
                if (!validated) {
                    address().validate()
                    dateOfBirth()
                    identification().validate()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var address: JsonField<Address> = JsonMissing.of()
                private var dateOfBirth: JsonField<LocalDate> = JsonMissing.of()
                private var identification: JsonField<Identification> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
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

                /** The person's address. */
                @JsonProperty("address")
                @ExcludeMissing
                fun address(address: JsonField<Address>) = apply { this.address = address }

                /** The person's date of birth in YYYY-MM-DD format. */
                fun dateOfBirth(dateOfBirth: LocalDate) = dateOfBirth(JsonField.of(dateOfBirth))

                /** The person's date of birth in YYYY-MM-DD format. */
                @JsonProperty("date_of_birth")
                @ExcludeMissing
                fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                    this.dateOfBirth = dateOfBirth
                }

                /** A means of verifying the person's identity. */
                fun identification(identification: Identification) =
                    identification(JsonField.of(identification))

                /** A means of verifying the person's identity. */
                @JsonProperty("identification")
                @ExcludeMissing
                fun identification(identification: JsonField<Identification>) = apply {
                    this.identification = identification
                }

                /** The person's legal name. */
                fun name(name: String) = name(JsonField.of(name))

                /** The person's legal name. */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): Individual =
                    Individual(
                        address,
                        dateOfBirth,
                        identification,
                        name,
                        additionalProperties.toImmutable(),
                    )
            }

            /** The person's address. */
            @JsonDeserialize(builder = Address.Builder::class)
            @NoAutoDetect
            class Address
            private constructor(
                private val city: JsonField<String>,
                private val line1: JsonField<String>,
                private val line2: JsonField<String>,
                private val state: JsonField<String>,
                private val zip: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** The city of the address. */
                fun city(): String = city.getRequired("city")

                /** The first line of the address. */
                fun line1(): String = line1.getRequired("line1")

                /** The second line of the address. */
                fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                fun state(): String = state.getRequired("state")

                /** The ZIP code of the address. */
                fun zip(): String = zip.getRequired("zip")

                /** The city of the address. */
                @JsonProperty("city") @ExcludeMissing fun _city() = city

                /** The first line of the address. */
                @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

                /** The second line of the address. */
                @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

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

                private var validated: Boolean = false

                fun validate(): Address = apply {
                    if (!validated) {
                        city()
                        line1()
                        line2()
                        state()
                        zip()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var city: JsonField<String> = JsonMissing.of()
                    private var line1: JsonField<String> = JsonMissing.of()
                    private var line2: JsonField<String> = JsonMissing.of()
                    private var state: JsonField<String> = JsonMissing.of()
                    private var zip: JsonField<String> = JsonMissing.of()
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

                    /** The city of the address. */
                    @JsonProperty("city")
                    @ExcludeMissing
                    fun city(city: JsonField<String>) = apply { this.city = city }

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
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
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

                    fun build(): Address =
                        Address(
                            city,
                            line1,
                            line2,
                            state,
                            zip,
                            additionalProperties.toImmutable(),
                        )
                }

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
            @JsonDeserialize(builder = Identification.Builder::class)
            @NoAutoDetect
            class Identification
            private constructor(
                private val method: JsonField<Method>,
                private val numberLast4: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

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

                private var validated: Boolean = false

                fun validate(): Identification = apply {
                    if (!validated) {
                        method()
                        numberLast4()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var method: JsonField<Method> = JsonMissing.of()
                    private var numberLast4: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(identification: Identification) = apply {
                        method = identification.method
                        numberLast4 = identification.numberLast4
                        additionalProperties = identification.additionalProperties.toMutableMap()
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
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
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

                    fun build(): Identification =
                        Identification(
                            method,
                            numberLast4,
                            additionalProperties.toImmutable(),
                        )
                }

                class Method
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val SOCIAL_SECURITY_NUMBER = of("social_security_number")

                        @JvmField
                        val INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER =
                            of("individual_taxpayer_identification_number")

                        @JvmField val PASSPORT = of("passport")

                        @JvmField val DRIVERS_LICENSE = of("drivers_license")

                        @JvmField val OTHER = of("other")

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
    @JsonDeserialize(builder = NaturalPerson.Builder::class)
    @NoAutoDetect
    class NaturalPerson
    private constructor(
        private val address: JsonField<Address>,
        private val dateOfBirth: JsonField<LocalDate>,
        private val identification: JsonField<Identification>,
        private val name: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The person's address. */
        fun address(): Address = address.getRequired("address")

        /** The person's date of birth in YYYY-MM-DD format. */
        fun dateOfBirth(): LocalDate = dateOfBirth.getRequired("date_of_birth")

        /** A means of verifying the person's identity. */
        fun identification(): Identification = identification.getRequired("identification")

        /** The person's legal name. */
        fun name(): String = name.getRequired("name")

        /** The person's address. */
        @JsonProperty("address") @ExcludeMissing fun _address() = address

        /** The person's date of birth in YYYY-MM-DD format. */
        @JsonProperty("date_of_birth") @ExcludeMissing fun _dateOfBirth() = dateOfBirth

        /** A means of verifying the person's identity. */
        @JsonProperty("identification") @ExcludeMissing fun _identification() = identification

        /** The person's legal name. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): NaturalPerson = apply {
            if (!validated) {
                address().validate()
                dateOfBirth()
                identification().validate()
                name()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address: JsonField<Address> = JsonMissing.of()
            private var dateOfBirth: JsonField<LocalDate> = JsonMissing.of()
            private var identification: JsonField<Identification> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
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

            /** The person's address. */
            @JsonProperty("address")
            @ExcludeMissing
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** The person's date of birth in YYYY-MM-DD format. */
            fun dateOfBirth(dateOfBirth: LocalDate) = dateOfBirth(JsonField.of(dateOfBirth))

            /** The person's date of birth in YYYY-MM-DD format. */
            @JsonProperty("date_of_birth")
            @ExcludeMissing
            fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                this.dateOfBirth = dateOfBirth
            }

            /** A means of verifying the person's identity. */
            fun identification(identification: Identification) =
                identification(JsonField.of(identification))

            /** A means of verifying the person's identity. */
            @JsonProperty("identification")
            @ExcludeMissing
            fun identification(identification: JsonField<Identification>) = apply {
                this.identification = identification
            }

            /** The person's legal name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The person's legal name. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): NaturalPerson =
                NaturalPerson(
                    address,
                    dateOfBirth,
                    identification,
                    name,
                    additionalProperties.toImmutable(),
                )
        }

        /** The person's address. */
        @JsonDeserialize(builder = Address.Builder::class)
        @NoAutoDetect
        class Address
        private constructor(
            private val city: JsonField<String>,
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val state: JsonField<String>,
            private val zip: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The city of the address. */
            fun city(): String = city.getRequired("city")

            /** The first line of the address. */
            fun line1(): String = line1.getRequired("line1")

            /** The second line of the address. */
            fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            fun state(): String = state.getRequired("state")

            /** The ZIP code of the address. */
            fun zip(): String = zip.getRequired("zip")

            /** The city of the address. */
            @JsonProperty("city") @ExcludeMissing fun _city() = city

            /** The first line of the address. */
            @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

            /** The second line of the address. */
            @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

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

            private var validated: Boolean = false

            fun validate(): Address = apply {
                if (!validated) {
                    city()
                    line1()
                    line2()
                    state()
                    zip()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var city: JsonField<String> = JsonMissing.of()
                private var line1: JsonField<String> = JsonMissing.of()
                private var line2: JsonField<String> = JsonMissing.of()
                private var state: JsonField<String> = JsonMissing.of()
                private var zip: JsonField<String> = JsonMissing.of()
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

                /** The city of the address. */
                @JsonProperty("city")
                @ExcludeMissing
                fun city(city: JsonField<String>) = apply { this.city = city }

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
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): Address =
                    Address(
                        city,
                        line1,
                        line2,
                        state,
                        zip,
                        additionalProperties.toImmutable(),
                    )
            }

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
        @JsonDeserialize(builder = Identification.Builder::class)
        @NoAutoDetect
        class Identification
        private constructor(
            private val method: JsonField<Method>,
            private val numberLast4: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

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

            private var validated: Boolean = false

            fun validate(): Identification = apply {
                if (!validated) {
                    method()
                    numberLast4()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var method: JsonField<Method> = JsonMissing.of()
                private var numberLast4: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(identification: Identification) = apply {
                    method = identification.method
                    numberLast4 = identification.numberLast4
                    additionalProperties = identification.additionalProperties.toMutableMap()
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
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): Identification =
                    Identification(
                        method,
                        numberLast4,
                        additionalProperties.toImmutable(),
                    )
            }

            class Method
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SOCIAL_SECURITY_NUMBER = of("social_security_number")

                    @JvmField
                    val INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER =
                        of("individual_taxpayer_identification_number")

                    @JvmField val PASSPORT = of("passport")

                    @JvmField val DRIVERS_LICENSE = of("drivers_license")

                    @JvmField val OTHER = of("other")

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

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACTIVE = of("active")

            @JvmField val ARCHIVED = of("archived")

            @JvmField val DISABLED = of("disabled")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Structure
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CORPORATION = of("corporation")

            @JvmField val NATURAL_PERSON = of("natural_person")

            @JvmField val JOINT = of("joint")

            @JvmField val TRUST = of("trust")

            @JvmField val GOVERNMENT_AUTHORITY = of("government_authority")

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
    @JsonDeserialize(builder = ThirdPartyVerification.Builder::class)
    @NoAutoDetect
    class ThirdPartyVerification
    private constructor(
        private val reference: JsonField<String>,
        private val vendor: JsonField<Vendor>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The reference identifier for the third party verification. */
        fun reference(): String = reference.getRequired("reference")

        /** The vendor that was used to perform the verification. */
        fun vendor(): Vendor = vendor.getRequired("vendor")

        /** The reference identifier for the third party verification. */
        @JsonProperty("reference") @ExcludeMissing fun _reference() = reference

        /** The vendor that was used to perform the verification. */
        @JsonProperty("vendor") @ExcludeMissing fun _vendor() = vendor

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ThirdPartyVerification = apply {
            if (!validated) {
                reference()
                vendor()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var reference: JsonField<String> = JsonMissing.of()
            private var vendor: JsonField<Vendor> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(thirdPartyVerification: ThirdPartyVerification) = apply {
                reference = thirdPartyVerification.reference
                vendor = thirdPartyVerification.vendor
                additionalProperties = thirdPartyVerification.additionalProperties.toMutableMap()
            }

            /** The reference identifier for the third party verification. */
            fun reference(reference: String) = reference(JsonField.of(reference))

            /** The reference identifier for the third party verification. */
            @JsonProperty("reference")
            @ExcludeMissing
            fun reference(reference: JsonField<String>) = apply { this.reference = reference }

            /** The vendor that was used to perform the verification. */
            fun vendor(vendor: Vendor) = vendor(JsonField.of(vendor))

            /** The vendor that was used to perform the verification. */
            @JsonProperty("vendor")
            @ExcludeMissing
            fun vendor(vendor: JsonField<Vendor>) = apply { this.vendor = vendor }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): ThirdPartyVerification =
                ThirdPartyVerification(
                    reference,
                    vendor,
                    additionalProperties.toImmutable(),
                )
        }

        class Vendor
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ALLOY = of("alloy")

                @JvmField val MIDDESK = of("middesk")

                @JvmStatic fun of(value: String) = Vendor(JsonField.of(value))
            }

            enum class Known {
                ALLOY,
                MIDDESK,
            }

            enum class Value {
                ALLOY,
                MIDDESK,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ALLOY -> Value.ALLOY
                    MIDDESK -> Value.MIDDESK
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ALLOY -> Known.ALLOY
                    MIDDESK -> Known.MIDDESK
                    else -> throw IncreaseInvalidDataException("Unknown Vendor: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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
    @JsonDeserialize(builder = Trust.Builder::class)
    @NoAutoDetect
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
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The trust's address. */
        fun address(): Address = address.getRequired("address")

        /** Whether the trust is `revocable` or `irrevocable`. */
        fun category(): Category = category.getRequired("category")

        /** The ID for the File containing the formation document of the trust. */
        fun formationDocumentFileId(): Optional<String> =
            Optional.ofNullable(formationDocumentFileId.getNullable("formation_document_file_id"))

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the state in which
         * the trust was formed.
         */
        fun formationState(): Optional<String> =
            Optional.ofNullable(formationState.getNullable("formation_state"))

        /** The grantor of the trust. Will be present if the `category` is `revocable`. */
        fun grantor(): Optional<Grantor> = Optional.ofNullable(grantor.getNullable("grantor"))

        /** The trust's name. */
        fun name(): String = name.getRequired("name")

        /** The Employer Identification Number (EIN) of the trust itself. */
        fun taxIdentifier(): Optional<String> =
            Optional.ofNullable(taxIdentifier.getNullable("tax_identifier"))

        /** The trustees of the trust. */
        fun trustees(): List<Trustee> = trustees.getRequired("trustees")

        /** The trust's address. */
        @JsonProperty("address") @ExcludeMissing fun _address() = address

        /** Whether the trust is `revocable` or `irrevocable`. */
        @JsonProperty("category") @ExcludeMissing fun _category() = category

        /** The ID for the File containing the formation document of the trust. */
        @JsonProperty("formation_document_file_id")
        @ExcludeMissing
        fun _formationDocumentFileId() = formationDocumentFileId

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the state in which
         * the trust was formed.
         */
        @JsonProperty("formation_state") @ExcludeMissing fun _formationState() = formationState

        /** The grantor of the trust. Will be present if the `category` is `revocable`. */
        @JsonProperty("grantor") @ExcludeMissing fun _grantor() = grantor

        /** The trust's name. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** The Employer Identification Number (EIN) of the trust itself. */
        @JsonProperty("tax_identifier") @ExcludeMissing fun _taxIdentifier() = taxIdentifier

        /** The trustees of the trust. */
        @JsonProperty("trustees") @ExcludeMissing fun _trustees() = trustees

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Trust = apply {
            if (!validated) {
                address().validate()
                category()
                formationDocumentFileId()
                formationState()
                grantor().map { it.validate() }
                name()
                taxIdentifier()
                trustees().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address: JsonField<Address> = JsonMissing.of()
            private var category: JsonField<Category> = JsonMissing.of()
            private var formationDocumentFileId: JsonField<String> = JsonMissing.of()
            private var formationState: JsonField<String> = JsonMissing.of()
            private var grantor: JsonField<Grantor> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var taxIdentifier: JsonField<String> = JsonMissing.of()
            private var trustees: JsonField<List<Trustee>> = JsonMissing.of()
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
                trustees = trust.trustees
                additionalProperties = trust.additionalProperties.toMutableMap()
            }

            /** The trust's address. */
            fun address(address: Address) = address(JsonField.of(address))

            /** The trust's address. */
            @JsonProperty("address")
            @ExcludeMissing
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** Whether the trust is `revocable` or `irrevocable`. */
            fun category(category: Category) = category(JsonField.of(category))

            /** Whether the trust is `revocable` or `irrevocable`. */
            @JsonProperty("category")
            @ExcludeMissing
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** The ID for the File containing the formation document of the trust. */
            fun formationDocumentFileId(formationDocumentFileId: String) =
                formationDocumentFileId(JsonField.of(formationDocumentFileId))

            /** The ID for the File containing the formation document of the trust. */
            @JsonProperty("formation_document_file_id")
            @ExcludeMissing
            fun formationDocumentFileId(formationDocumentFileId: JsonField<String>) = apply {
                this.formationDocumentFileId = formationDocumentFileId
            }

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

            /** The grantor of the trust. Will be present if the `category` is `revocable`. */
            fun grantor(grantor: Grantor) = grantor(JsonField.of(grantor))

            /** The grantor of the trust. Will be present if the `category` is `revocable`. */
            @JsonProperty("grantor")
            @ExcludeMissing
            fun grantor(grantor: JsonField<Grantor>) = apply { this.grantor = grantor }

            /** The trust's name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The trust's name. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

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

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): Trust =
                Trust(
                    address,
                    category,
                    formationDocumentFileId,
                    formationState,
                    grantor,
                    name,
                    taxIdentifier,
                    trustees.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        /** The trust's address. */
        @JsonDeserialize(builder = Address.Builder::class)
        @NoAutoDetect
        class Address
        private constructor(
            private val city: JsonField<String>,
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val state: JsonField<String>,
            private val zip: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The city of the address. */
            fun city(): String = city.getRequired("city")

            /** The first line of the address. */
            fun line1(): String = line1.getRequired("line1")

            /** The second line of the address. */
            fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            fun state(): String = state.getRequired("state")

            /** The ZIP code of the address. */
            fun zip(): String = zip.getRequired("zip")

            /** The city of the address. */
            @JsonProperty("city") @ExcludeMissing fun _city() = city

            /** The first line of the address. */
            @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

            /** The second line of the address. */
            @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

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

            private var validated: Boolean = false

            fun validate(): Address = apply {
                if (!validated) {
                    city()
                    line1()
                    line2()
                    state()
                    zip()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var city: JsonField<String> = JsonMissing.of()
                private var line1: JsonField<String> = JsonMissing.of()
                private var line2: JsonField<String> = JsonMissing.of()
                private var state: JsonField<String> = JsonMissing.of()
                private var zip: JsonField<String> = JsonMissing.of()
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

                /** The city of the address. */
                @JsonProperty("city")
                @ExcludeMissing
                fun city(city: JsonField<String>) = apply { this.city = city }

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
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): Address =
                    Address(
                        city,
                        line1,
                        line2,
                        state,
                        zip,
                        additionalProperties.toImmutable(),
                    )
            }

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

        class Category
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val REVOCABLE = of("revocable")

                @JvmField val IRREVOCABLE = of("irrevocable")

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
        @JsonDeserialize(builder = Grantor.Builder::class)
        @NoAutoDetect
        class Grantor
        private constructor(
            private val address: JsonField<Address>,
            private val dateOfBirth: JsonField<LocalDate>,
            private val identification: JsonField<Identification>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The person's address. */
            fun address(): Address = address.getRequired("address")

            /** The person's date of birth in YYYY-MM-DD format. */
            fun dateOfBirth(): LocalDate = dateOfBirth.getRequired("date_of_birth")

            /** A means of verifying the person's identity. */
            fun identification(): Identification = identification.getRequired("identification")

            /** The person's legal name. */
            fun name(): String = name.getRequired("name")

            /** The person's address. */
            @JsonProperty("address") @ExcludeMissing fun _address() = address

            /** The person's date of birth in YYYY-MM-DD format. */
            @JsonProperty("date_of_birth") @ExcludeMissing fun _dateOfBirth() = dateOfBirth

            /** A means of verifying the person's identity. */
            @JsonProperty("identification") @ExcludeMissing fun _identification() = identification

            /** The person's legal name. */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Grantor = apply {
                if (!validated) {
                    address().validate()
                    dateOfBirth()
                    identification().validate()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var address: JsonField<Address> = JsonMissing.of()
                private var dateOfBirth: JsonField<LocalDate> = JsonMissing.of()
                private var identification: JsonField<Identification> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
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

                /** The person's address. */
                @JsonProperty("address")
                @ExcludeMissing
                fun address(address: JsonField<Address>) = apply { this.address = address }

                /** The person's date of birth in YYYY-MM-DD format. */
                fun dateOfBirth(dateOfBirth: LocalDate) = dateOfBirth(JsonField.of(dateOfBirth))

                /** The person's date of birth in YYYY-MM-DD format. */
                @JsonProperty("date_of_birth")
                @ExcludeMissing
                fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                    this.dateOfBirth = dateOfBirth
                }

                /** A means of verifying the person's identity. */
                fun identification(identification: Identification) =
                    identification(JsonField.of(identification))

                /** A means of verifying the person's identity. */
                @JsonProperty("identification")
                @ExcludeMissing
                fun identification(identification: JsonField<Identification>) = apply {
                    this.identification = identification
                }

                /** The person's legal name. */
                fun name(name: String) = name(JsonField.of(name))

                /** The person's legal name. */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): Grantor =
                    Grantor(
                        address,
                        dateOfBirth,
                        identification,
                        name,
                        additionalProperties.toImmutable(),
                    )
            }

            /** The person's address. */
            @JsonDeserialize(builder = Address.Builder::class)
            @NoAutoDetect
            class Address
            private constructor(
                private val city: JsonField<String>,
                private val line1: JsonField<String>,
                private val line2: JsonField<String>,
                private val state: JsonField<String>,
                private val zip: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** The city of the address. */
                fun city(): String = city.getRequired("city")

                /** The first line of the address. */
                fun line1(): String = line1.getRequired("line1")

                /** The second line of the address. */
                fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                fun state(): String = state.getRequired("state")

                /** The ZIP code of the address. */
                fun zip(): String = zip.getRequired("zip")

                /** The city of the address. */
                @JsonProperty("city") @ExcludeMissing fun _city() = city

                /** The first line of the address. */
                @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

                /** The second line of the address. */
                @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

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

                private var validated: Boolean = false

                fun validate(): Address = apply {
                    if (!validated) {
                        city()
                        line1()
                        line2()
                        state()
                        zip()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var city: JsonField<String> = JsonMissing.of()
                    private var line1: JsonField<String> = JsonMissing.of()
                    private var line2: JsonField<String> = JsonMissing.of()
                    private var state: JsonField<String> = JsonMissing.of()
                    private var zip: JsonField<String> = JsonMissing.of()
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

                    /** The city of the address. */
                    @JsonProperty("city")
                    @ExcludeMissing
                    fun city(city: JsonField<String>) = apply { this.city = city }

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
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
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

                    fun build(): Address =
                        Address(
                            city,
                            line1,
                            line2,
                            state,
                            zip,
                            additionalProperties.toImmutable(),
                        )
                }

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
            @JsonDeserialize(builder = Identification.Builder::class)
            @NoAutoDetect
            class Identification
            private constructor(
                private val method: JsonField<Method>,
                private val numberLast4: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

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

                private var validated: Boolean = false

                fun validate(): Identification = apply {
                    if (!validated) {
                        method()
                        numberLast4()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var method: JsonField<Method> = JsonMissing.of()
                    private var numberLast4: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(identification: Identification) = apply {
                        method = identification.method
                        numberLast4 = identification.numberLast4
                        additionalProperties = identification.additionalProperties.toMutableMap()
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
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
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

                    fun build(): Identification =
                        Identification(
                            method,
                            numberLast4,
                            additionalProperties.toImmutable(),
                        )
                }

                class Method
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val SOCIAL_SECURITY_NUMBER = of("social_security_number")

                        @JvmField
                        val INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER =
                            of("individual_taxpayer_identification_number")

                        @JvmField val PASSPORT = of("passport")

                        @JvmField val DRIVERS_LICENSE = of("drivers_license")

                        @JvmField val OTHER = of("other")

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

        @JsonDeserialize(builder = Trustee.Builder::class)
        @NoAutoDetect
        class Trustee
        private constructor(
            private val individual: JsonField<Individual>,
            private val structure: JsonField<Structure>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * The individual trustee of the trust. Will be present if the trustee's `structure` is
             * equal to `individual`.
             */
            fun individual(): Optional<Individual> =
                Optional.ofNullable(individual.getNullable("individual"))

            /** The structure of the trustee. Will always be equal to `individual`. */
            fun structure(): Structure = structure.getRequired("structure")

            /**
             * The individual trustee of the trust. Will be present if the trustee's `structure` is
             * equal to `individual`.
             */
            @JsonProperty("individual") @ExcludeMissing fun _individual() = individual

            /** The structure of the trustee. Will always be equal to `individual`. */
            @JsonProperty("structure") @ExcludeMissing fun _structure() = structure

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Trustee = apply {
                if (!validated) {
                    individual().map { it.validate() }
                    structure()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var individual: JsonField<Individual> = JsonMissing.of()
                private var structure: JsonField<Structure> = JsonMissing.of()
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

                /** The structure of the trustee. Will always be equal to `individual`. */
                fun structure(structure: Structure) = structure(JsonField.of(structure))

                /** The structure of the trustee. Will always be equal to `individual`. */
                @JsonProperty("structure")
                @ExcludeMissing
                fun structure(structure: JsonField<Structure>) = apply {
                    this.structure = structure
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): Trustee =
                    Trustee(
                        individual,
                        structure,
                        additionalProperties.toImmutable(),
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
                private val address: JsonField<Address>,
                private val dateOfBirth: JsonField<LocalDate>,
                private val identification: JsonField<Identification>,
                private val name: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** The person's address. */
                fun address(): Address = address.getRequired("address")

                /** The person's date of birth in YYYY-MM-DD format. */
                fun dateOfBirth(): LocalDate = dateOfBirth.getRequired("date_of_birth")

                /** A means of verifying the person's identity. */
                fun identification(): Identification = identification.getRequired("identification")

                /** The person's legal name. */
                fun name(): String = name.getRequired("name")

                /** The person's address. */
                @JsonProperty("address") @ExcludeMissing fun _address() = address

                /** The person's date of birth in YYYY-MM-DD format. */
                @JsonProperty("date_of_birth") @ExcludeMissing fun _dateOfBirth() = dateOfBirth

                /** A means of verifying the person's identity. */
                @JsonProperty("identification")
                @ExcludeMissing
                fun _identification() = identification

                /** The person's legal name. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Individual = apply {
                    if (!validated) {
                        address().validate()
                        dateOfBirth()
                        identification().validate()
                        name()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var address: JsonField<Address> = JsonMissing.of()
                    private var dateOfBirth: JsonField<LocalDate> = JsonMissing.of()
                    private var identification: JsonField<Identification> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
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

                    /** The person's address. */
                    @JsonProperty("address")
                    @ExcludeMissing
                    fun address(address: JsonField<Address>) = apply { this.address = address }

                    /** The person's date of birth in YYYY-MM-DD format. */
                    fun dateOfBirth(dateOfBirth: LocalDate) = dateOfBirth(JsonField.of(dateOfBirth))

                    /** The person's date of birth in YYYY-MM-DD format. */
                    @JsonProperty("date_of_birth")
                    @ExcludeMissing
                    fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                        this.dateOfBirth = dateOfBirth
                    }

                    /** A means of verifying the person's identity. */
                    fun identification(identification: Identification) =
                        identification(JsonField.of(identification))

                    /** A means of verifying the person's identity. */
                    @JsonProperty("identification")
                    @ExcludeMissing
                    fun identification(identification: JsonField<Identification>) = apply {
                        this.identification = identification
                    }

                    /** The person's legal name. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The person's legal name. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
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

                    fun build(): Individual =
                        Individual(
                            address,
                            dateOfBirth,
                            identification,
                            name,
                            additionalProperties.toImmutable(),
                        )
                }

                /** The person's address. */
                @JsonDeserialize(builder = Address.Builder::class)
                @NoAutoDetect
                class Address
                private constructor(
                    private val city: JsonField<String>,
                    private val line1: JsonField<String>,
                    private val line2: JsonField<String>,
                    private val state: JsonField<String>,
                    private val zip: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /** The city of the address. */
                    fun city(): String = city.getRequired("city")

                    /** The first line of the address. */
                    fun line1(): String = line1.getRequired("line1")

                    /** The second line of the address. */
                    fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    fun state(): String = state.getRequired("state")

                    /** The ZIP code of the address. */
                    fun zip(): String = zip.getRequired("zip")

                    /** The city of the address. */
                    @JsonProperty("city") @ExcludeMissing fun _city() = city

                    /** The first line of the address. */
                    @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

                    /** The second line of the address. */
                    @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

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

                    private var validated: Boolean = false

                    fun validate(): Address = apply {
                        if (!validated) {
                            city()
                            line1()
                            line2()
                            state()
                            zip()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var city: JsonField<String> = JsonMissing.of()
                        private var line1: JsonField<String> = JsonMissing.of()
                        private var line2: JsonField<String> = JsonMissing.of()
                        private var state: JsonField<String> = JsonMissing.of()
                        private var zip: JsonField<String> = JsonMissing.of()
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

                        /** The city of the address. */
                        @JsonProperty("city")
                        @ExcludeMissing
                        fun city(city: JsonField<String>) = apply { this.city = city }

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
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
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

                        fun build(): Address =
                            Address(
                                city,
                                line1,
                                line2,
                                state,
                                zip,
                                additionalProperties.toImmutable(),
                            )
                    }

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
                @JsonDeserialize(builder = Identification.Builder::class)
                @NoAutoDetect
                class Identification
                private constructor(
                    private val method: JsonField<Method>,
                    private val numberLast4: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

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

                    private var validated: Boolean = false

                    fun validate(): Identification = apply {
                        if (!validated) {
                            method()
                            numberLast4()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

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
                            method = identification.method
                            numberLast4 = identification.numberLast4
                            additionalProperties =
                                identification.additionalProperties.toMutableMap()
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
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
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

                        fun build(): Identification =
                            Identification(
                                method,
                                numberLast4,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class Method
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val SOCIAL_SECURITY_NUMBER = of("social_security_number")

                            @JvmField
                            val INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER =
                                of("individual_taxpayer_identification_number")

                            @JvmField val PASSPORT = of("passport")

                            @JvmField val DRIVERS_LICENSE = of("drivers_license")

                            @JvmField val OTHER = of("other")

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

            class Structure
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val INDIVIDUAL = of("individual")

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

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ENTITY = of("entity")

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

        return /* spotless:off */ other is Entity && corporation == other.corporation && createdAt == other.createdAt && description == other.description && detailsConfirmedAt == other.detailsConfirmedAt && governmentAuthority == other.governmentAuthority && id == other.id && idempotencyKey == other.idempotencyKey && joint == other.joint && naturalPerson == other.naturalPerson && status == other.status && structure == other.structure && supplementalDocuments == other.supplementalDocuments && thirdPartyVerification == other.thirdPartyVerification && trust == other.trust && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(corporation, createdAt, description, detailsConfirmedAt, governmentAuthority, id, idempotencyKey, joint, naturalPerson, status, structure, supplementalDocuments, thirdPartyVerification, trust, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Entity{corporation=$corporation, createdAt=$createdAt, description=$description, detailsConfirmedAt=$detailsConfirmedAt, governmentAuthority=$governmentAuthority, id=$id, idempotencyKey=$idempotencyKey, joint=$joint, naturalPerson=$naturalPerson, status=$status, structure=$structure, supplementalDocuments=$supplementalDocuments, thirdPartyVerification=$thirdPartyVerification, trust=$trust, type=$type, additionalProperties=$additionalProperties}"
}
