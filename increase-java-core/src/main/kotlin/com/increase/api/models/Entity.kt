// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.checkRequired
import com.increase.api.core.immutableEmptyMap
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
@NoAutoDetect
class Entity
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("corporation")
    @ExcludeMissing
    private val corporation: JsonField<Corporation> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("details_confirmed_at")
    @ExcludeMissing
    private val detailsConfirmedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("government_authority")
    @ExcludeMissing
    private val governmentAuthority: JsonField<GovernmentAuthority> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("joint") @ExcludeMissing private val joint: JsonField<Joint> = JsonMissing.of(),
    @JsonProperty("natural_person")
    @ExcludeMissing
    private val naturalPerson: JsonField<NaturalPerson> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("structure")
    @ExcludeMissing
    private val structure: JsonField<Structure> = JsonMissing.of(),
    @JsonProperty("supplemental_documents")
    @ExcludeMissing
    private val supplementalDocuments: JsonField<List<EntitySupplementalDocument>> =
        JsonMissing.of(),
    @JsonProperty("third_party_verification")
    @ExcludeMissing
    private val thirdPartyVerification: JsonField<ThirdPartyVerification> = JsonMissing.of(),
    @JsonProperty("trust") @ExcludeMissing private val trust: JsonField<Trust> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The entity's identifier. */
    fun id(): String = id.getRequired("id")

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

    /** The entity's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Details of the corporation entity. Will be present if `structure` is equal to `corporation`.
     */
    @JsonProperty("corporation")
    @ExcludeMissing
    fun _corporation(): JsonField<Corporation> = corporation

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Entity was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The entity's description for display purposes. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Entity's details
     * were most recently confirmed.
     */
    @JsonProperty("details_confirmed_at")
    @ExcludeMissing
    fun _detailsConfirmedAt(): JsonField<OffsetDateTime> = detailsConfirmedAt

    /**
     * Details of the government authority entity. Will be present if `structure` is equal to
     * `government_authority`.
     */
    @JsonProperty("government_authority")
    @ExcludeMissing
    fun _governmentAuthority(): JsonField<GovernmentAuthority> = governmentAuthority

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /** Details of the joint entity. Will be present if `structure` is equal to `joint`. */
    @JsonProperty("joint") @ExcludeMissing fun _joint(): JsonField<Joint> = joint

    /**
     * Details of the natural person entity. Will be present if `structure` is equal to
     * `natural_person`.
     */
    @JsonProperty("natural_person")
    @ExcludeMissing
    fun _naturalPerson(): JsonField<NaturalPerson> = naturalPerson

    /** The status of the entity. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /** The entity's legal structure. */
    @JsonProperty("structure") @ExcludeMissing fun _structure(): JsonField<Structure> = structure

    /**
     * Additional documentation associated with the entity. This is limited to the first 10
     * documents for an entity. If an entity has more than 10 documents, use the GET
     * /entity_supplemental_documents list endpoint to retrieve them.
     */
    @JsonProperty("supplemental_documents")
    @ExcludeMissing
    fun _supplementalDocuments(): JsonField<List<EntitySupplementalDocument>> =
        supplementalDocuments

    /**
     * A reference to data stored in a third-party verification service. Your integration may or may
     * not use this field.
     */
    @JsonProperty("third_party_verification")
    @ExcludeMissing
    fun _thirdPartyVerification(): JsonField<ThirdPartyVerification> = thirdPartyVerification

    /** Details of the trust entity. Will be present if `structure` is equal to `trust`. */
    @JsonProperty("trust") @ExcludeMissing fun _trust(): JsonField<Trust> = trust

    /** A constant representing the object's type. For this resource it will always be `entity`. */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
        status()
        structure()
        supplementalDocuments().forEach { it.validate() }
        thirdPartyVerification().ifPresent { it.validate() }
        trust().ifPresent { it.validate() }
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

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

        /** The entity's identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Details of the corporation entity. Will be present if `structure` is equal to
         * `corporation`.
         */
        fun corporation(corporation: Corporation?) = corporation(JsonField.ofNullable(corporation))

        /**
         * Details of the corporation entity. Will be present if `structure` is equal to
         * `corporation`.
         */
        fun corporation(corporation: Optional<Corporation>) = corporation(corporation.orElse(null))

        /**
         * Details of the corporation entity. Will be present if `structure` is equal to
         * `corporation`.
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
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Entity was
         * created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The entity's description for display purposes. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** The entity's description for display purposes. */
        fun description(description: Optional<String>) = description(description.orElse(null))

        /** The entity's description for display purposes. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Entity's details
         * were most recently confirmed.
         */
        fun detailsConfirmedAt(detailsConfirmedAt: OffsetDateTime?) =
            detailsConfirmedAt(JsonField.ofNullable(detailsConfirmedAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Entity's details
         * were most recently confirmed.
         */
        fun detailsConfirmedAt(detailsConfirmedAt: Optional<OffsetDateTime>) =
            detailsConfirmedAt(detailsConfirmedAt.orElse(null))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Entity's details
         * were most recently confirmed.
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
         * Details of the government authority entity. Will be present if `structure` is equal to
         * `government_authority`.
         */
        fun governmentAuthority(governmentAuthority: Optional<GovernmentAuthority>) =
            governmentAuthority(governmentAuthority.orElse(null))

        /**
         * Details of the government authority entity. Will be present if `structure` is equal to
         * `government_authority`.
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

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.orElse(null))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /** Details of the joint entity. Will be present if `structure` is equal to `joint`. */
        fun joint(joint: Joint?) = joint(JsonField.ofNullable(joint))

        /** Details of the joint entity. Will be present if `structure` is equal to `joint`. */
        fun joint(joint: Optional<Joint>) = joint(joint.orElse(null))

        /** Details of the joint entity. Will be present if `structure` is equal to `joint`. */
        fun joint(joint: JsonField<Joint>) = apply { this.joint = joint }

        /**
         * Details of the natural person entity. Will be present if `structure` is equal to
         * `natural_person`.
         */
        fun naturalPerson(naturalPerson: NaturalPerson?) =
            naturalPerson(JsonField.ofNullable(naturalPerson))

        /**
         * Details of the natural person entity. Will be present if `structure` is equal to
         * `natural_person`.
         */
        fun naturalPerson(naturalPerson: Optional<NaturalPerson>) =
            naturalPerson(naturalPerson.orElse(null))

        /**
         * Details of the natural person entity. Will be present if `structure` is equal to
         * `natural_person`.
         */
        fun naturalPerson(naturalPerson: JsonField<NaturalPerson>) = apply {
            this.naturalPerson = naturalPerson
        }

        /** The status of the entity. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the entity. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The entity's legal structure. */
        fun structure(structure: Structure) = structure(JsonField.of(structure))

        /** The entity's legal structure. */
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
        fun supplementalDocuments(
            supplementalDocuments: JsonField<List<EntitySupplementalDocument>>
        ) = apply { this.supplementalDocuments = supplementalDocuments.map { it.toMutableList() } }

        /**
         * Additional documentation associated with the entity. This is limited to the first 10
         * documents for an entity. If an entity has more than 10 documents, use the GET
         * /entity_supplemental_documents list endpoint to retrieve them.
         */
        fun addSupplementalDocument(supplementalDocument: EntitySupplementalDocument) = apply {
            supplementalDocuments =
                (supplementalDocuments ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(supplementalDocument)
                }
        }

        /**
         * A reference to data stored in a third-party verification service. Your integration may or
         * may not use this field.
         */
        fun thirdPartyVerification(thirdPartyVerification: ThirdPartyVerification?) =
            thirdPartyVerification(JsonField.ofNullable(thirdPartyVerification))

        /**
         * A reference to data stored in a third-party verification service. Your integration may or
         * may not use this field.
         */
        fun thirdPartyVerification(thirdPartyVerification: Optional<ThirdPartyVerification>) =
            thirdPartyVerification(thirdPartyVerification.orElse(null))

        /**
         * A reference to data stored in a third-party verification service. Your integration may or
         * may not use this field.
         */
        fun thirdPartyVerification(thirdPartyVerification: JsonField<ThirdPartyVerification>) =
            apply {
                this.thirdPartyVerification = thirdPartyVerification
            }

        /** Details of the trust entity. Will be present if `structure` is equal to `trust`. */
        fun trust(trust: Trust?) = trust(JsonField.ofNullable(trust))

        /** Details of the trust entity. Will be present if `structure` is equal to `trust`. */
        fun trust(trust: Optional<Trust>) = trust(trust.orElse(null))

        /** Details of the trust entity. Will be present if `structure` is equal to `trust`. */
        fun trust(trust: JsonField<Trust>) = apply { this.trust = trust }

        /**
         * A constant representing the object's type. For this resource it will always be `entity`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be `entity`.
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
                additionalProperties.toImmutable(),
            )
    }

    /**
     * Details of the corporation entity. Will be present if `structure` is equal to `corporation`.
     */
    @NoAutoDetect
    class Corporation
    @JsonCreator
    private constructor(
        @JsonProperty("address")
        @ExcludeMissing
        private val address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("beneficial_owners")
        @ExcludeMissing
        private val beneficialOwners: JsonField<List<BeneficialOwner>> = JsonMissing.of(),
        @JsonProperty("incorporation_state")
        @ExcludeMissing
        private val incorporationState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("industry_code")
        @ExcludeMissing
        private val industryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_identifier")
        @ExcludeMissing
        private val taxIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("website")
        @ExcludeMissing
        private val website: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /**
         * The identifying details of anyone controlling or owning 25% or more of the corporation.
         */
        @JsonProperty("beneficial_owners")
        @ExcludeMissing
        fun _beneficialOwners(): JsonField<List<BeneficialOwner>> = beneficialOwners

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the corporation's
         * state of incorporation.
         */
        @JsonProperty("incorporation_state")
        @ExcludeMissing
        fun _incorporationState(): JsonField<String> = incorporationState

        /**
         * The numeric North American Industry Classification System (NAICS) code submitted for the
         * corporation.
         */
        @JsonProperty("industry_code")
        @ExcludeMissing
        fun _industryCode(): JsonField<String> = industryCode

        /** The legal name of the corporation. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** The Employer Identification Number (EIN) for the corporation. */
        @JsonProperty("tax_identifier")
        @ExcludeMissing
        fun _taxIdentifier(): JsonField<String> = taxIdentifier

        /** The website of the corporation. */
        @JsonProperty("website") @ExcludeMissing fun _website(): JsonField<String> = website

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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

            /** The corporation's address. */
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
            fun beneficialOwners(beneficialOwners: JsonField<List<BeneficialOwner>>) = apply {
                this.beneficialOwners = beneficialOwners.map { it.toMutableList() }
            }

            /**
             * The identifying details of anyone controlling or owning 25% or more of the
             * corporation.
             */
            fun addBeneficialOwner(beneficialOwner: BeneficialOwner) = apply {
                beneficialOwners =
                    (beneficialOwners ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(beneficialOwner)
                    }
            }

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the corporation's
             * state of incorporation.
             */
            fun incorporationState(incorporationState: String?) =
                incorporationState(JsonField.ofNullable(incorporationState))

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the corporation's
             * state of incorporation.
             */
            fun incorporationState(incorporationState: Optional<String>) =
                incorporationState(incorporationState.orElse(null))

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the corporation's
             * state of incorporation.
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

            /**
             * The numeric North American Industry Classification System (NAICS) code submitted for
             * the corporation.
             */
            fun industryCode(industryCode: Optional<String>) =
                industryCode(industryCode.orElse(null))

            /**
             * The numeric North American Industry Classification System (NAICS) code submitted for
             * the corporation.
             */
            fun industryCode(industryCode: JsonField<String>) = apply {
                this.industryCode = industryCode
            }

            /** The legal name of the corporation. */
            fun name(name: String) = name(JsonField.of(name))

            /** The legal name of the corporation. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The Employer Identification Number (EIN) for the corporation. */
            fun taxIdentifier(taxIdentifier: String?) =
                taxIdentifier(JsonField.ofNullable(taxIdentifier))

            /** The Employer Identification Number (EIN) for the corporation. */
            fun taxIdentifier(taxIdentifier: Optional<String>) =
                taxIdentifier(taxIdentifier.orElse(null))

            /** The Employer Identification Number (EIN) for the corporation. */
            fun taxIdentifier(taxIdentifier: JsonField<String>) = apply {
                this.taxIdentifier = taxIdentifier
            }

            /** The website of the corporation. */
            fun website(website: String?) = website(JsonField.ofNullable(website))

            /** The website of the corporation. */
            fun website(website: Optional<String>) = website(website.orElse(null))

            /** The website of the corporation. */
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

            fun build(): Corporation =
                Corporation(
                    checkRequired("address", address),
                    checkRequired("beneficialOwners", beneficialOwners).map { it.toImmutable() },
                    checkRequired("incorporationState", incorporationState),
                    checkRequired("industryCode", industryCode),
                    checkRequired("name", name),
                    checkRequired("taxIdentifier", taxIdentifier),
                    checkRequired("website", website),
                    additionalProperties.toImmutable(),
                )
        }

        /** The corporation's address. */
        @NoAutoDetect
        class Address
        @JsonCreator
        private constructor(
            @JsonProperty("city")
            @ExcludeMissing
            private val city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1")
            @ExcludeMissing
            private val line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2")
            @ExcludeMissing
            private val line2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state")
            @ExcludeMissing
            private val state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("zip")
            @ExcludeMissing
            private val zip: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /** The first line of the address. */
            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /** The second line of the address. */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

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

                /** The city of the address. */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The first line of the address. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /** The first line of the address. */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The second line of the address. */
                fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                /** The second line of the address. */
                fun line2(line2: Optional<String>) = line2(line2.orElse(null))

                /** The second line of the address. */
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
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The ZIP code of the address. */
                fun zip(zip: String) = zip(JsonField.of(zip))

                /** The ZIP code of the address. */
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

                fun build(): Address =
                    Address(
                        checkRequired("city", city),
                        checkRequired("line1", line1),
                        checkRequired("line2", line2),
                        checkRequired("state", state),
                        checkRequired("zip", zip),
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

        @NoAutoDetect
        class BeneficialOwner
        @JsonCreator
        private constructor(
            @JsonProperty("beneficial_owner_id")
            @ExcludeMissing
            private val beneficialOwnerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("company_title")
            @ExcludeMissing
            private val companyTitle: JsonField<String> = JsonMissing.of(),
            @JsonProperty("individual")
            @ExcludeMissing
            private val individual: JsonField<Individual> = JsonMissing.of(),
            @JsonProperty("prong")
            @ExcludeMissing
            private val prong: JsonField<Prong> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
            fun _beneficialOwnerId(): JsonField<String> = beneficialOwnerId

            /** This person's role or title within the entity. */
            @JsonProperty("company_title")
            @ExcludeMissing
            fun _companyTitle(): JsonField<String> = companyTitle

            /** Personal details for the beneficial owner. */
            @JsonProperty("individual")
            @ExcludeMissing
            fun _individual(): JsonField<Individual> = individual

            /** Why this person is considered a beneficial owner of the entity. */
            @JsonProperty("prong") @ExcludeMissing fun _prong(): JsonField<Prong> = prong

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): BeneficialOwner = apply {
                if (validated) {
                    return@apply
                }

                beneficialOwnerId()
                companyTitle()
                individual().validate()
                prong()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

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

                /** The identifier of this beneficial owner. */
                fun beneficialOwnerId(beneficialOwnerId: JsonField<String>) = apply {
                    this.beneficialOwnerId = beneficialOwnerId
                }

                /** This person's role or title within the entity. */
                fun companyTitle(companyTitle: String?) =
                    companyTitle(JsonField.ofNullable(companyTitle))

                /** This person's role or title within the entity. */
                fun companyTitle(companyTitle: Optional<String>) =
                    companyTitle(companyTitle.orElse(null))

                /** This person's role or title within the entity. */
                fun companyTitle(companyTitle: JsonField<String>) = apply {
                    this.companyTitle = companyTitle
                }

                /** Personal details for the beneficial owner. */
                fun individual(individual: Individual) = individual(JsonField.of(individual))

                /** Personal details for the beneficial owner. */
                fun individual(individual: JsonField<Individual>) = apply {
                    this.individual = individual
                }

                /** Why this person is considered a beneficial owner of the entity. */
                fun prong(prong: Prong) = prong(JsonField.of(prong))

                /** Why this person is considered a beneficial owner of the entity. */
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

                fun build(): BeneficialOwner =
                    BeneficialOwner(
                        checkRequired("beneficialOwnerId", beneficialOwnerId),
                        checkRequired("companyTitle", companyTitle),
                        checkRequired("individual", individual),
                        checkRequired("prong", prong),
                        additionalProperties.toImmutable(),
                    )
            }

            /** Personal details for the beneficial owner. */
            @NoAutoDetect
            class Individual
            @JsonCreator
            private constructor(
                @JsonProperty("address")
                @ExcludeMissing
                private val address: JsonField<Address> = JsonMissing.of(),
                @JsonProperty("date_of_birth")
                @ExcludeMissing
                private val dateOfBirth: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("identification")
                @ExcludeMissing
                private val identification: JsonField<Identification> = JsonMissing.of(),
                @JsonProperty("name")
                @ExcludeMissing
                private val name: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

                /** The person's date of birth in YYYY-MM-DD format. */
                @JsonProperty("date_of_birth")
                @ExcludeMissing
                fun _dateOfBirth(): JsonField<LocalDate> = dateOfBirth

                /** A means of verifying the person's identity. */
                @JsonProperty("identification")
                @ExcludeMissing
                fun _identification(): JsonField<Identification> = identification

                /** The person's legal name. */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

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

                    /** The person's address. */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

                    /** The person's date of birth in YYYY-MM-DD format. */
                    fun dateOfBirth(dateOfBirth: LocalDate) = dateOfBirth(JsonField.of(dateOfBirth))

                    /** The person's date of birth in YYYY-MM-DD format. */
                    fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                        this.dateOfBirth = dateOfBirth
                    }

                    /** A means of verifying the person's identity. */
                    fun identification(identification: Identification) =
                        identification(JsonField.of(identification))

                    /** A means of verifying the person's identity. */
                    fun identification(identification: JsonField<Identification>) = apply {
                        this.identification = identification
                    }

                    /** The person's legal name. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The person's legal name. */
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

                    fun build(): Individual =
                        Individual(
                            checkRequired("address", address),
                            checkRequired("dateOfBirth", dateOfBirth),
                            checkRequired("identification", identification),
                            checkRequired("name", name),
                            additionalProperties.toImmutable(),
                        )
                }

                /** The person's address. */
                @NoAutoDetect
                class Address
                @JsonCreator
                private constructor(
                    @JsonProperty("city")
                    @ExcludeMissing
                    private val city: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line1")
                    @ExcludeMissing
                    private val line1: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line2")
                    @ExcludeMissing
                    private val line2: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("state")
                    @ExcludeMissing
                    private val state: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("zip")
                    @ExcludeMissing
                    private val zip: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
                    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

                    /** The first line of the address. */
                    @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

                    /** The second line of the address. */
                    @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

                    /** The ZIP code of the address. */
                    @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

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

                        /** The city of the address. */
                        fun city(city: JsonField<String>) = apply { this.city = city }

                        /** The first line of the address. */
                        fun line1(line1: String) = line1(JsonField.of(line1))

                        /** The first line of the address. */
                        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                        /** The second line of the address. */
                        fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                        /** The second line of the address. */
                        fun line2(line2: Optional<String>) = line2(line2.orElse(null))

                        /** The second line of the address. */
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
                        fun state(state: JsonField<String>) = apply { this.state = state }

                        /** The ZIP code of the address. */
                        fun zip(zip: String) = zip(JsonField.of(zip))

                        /** The ZIP code of the address. */
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

                        fun build(): Address =
                            Address(
                                checkRequired("city", city),
                                checkRequired("line1", line1),
                                checkRequired("line2", line2),
                                checkRequired("state", state),
                                checkRequired("zip", zip),
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
                @NoAutoDetect
                class Identification
                @JsonCreator
                private constructor(
                    @JsonProperty("method")
                    @ExcludeMissing
                    private val method: JsonField<Method> = JsonMissing.of(),
                    @JsonProperty("number_last4")
                    @ExcludeMissing
                    private val numberLast4: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** A method that can be used to verify the individual's identity. */
                    fun method(): Method = method.getRequired("method")

                    /**
                     * The last 4 digits of the identification number that can be used to verify the
                     * individual's identity.
                     */
                    fun numberLast4(): String = numberLast4.getRequired("number_last4")

                    /** A method that can be used to verify the individual's identity. */
                    @JsonProperty("method")
                    @ExcludeMissing
                    fun _method(): JsonField<Method> = method

                    /**
                     * The last 4 digits of the identification number that can be used to verify the
                     * individual's identity.
                     */
                    @JsonProperty("number_last4")
                    @ExcludeMissing
                    fun _numberLast4(): JsonField<String> = numberLast4

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Identification = apply {
                        if (validated) {
                            return@apply
                        }

                        method()
                        numberLast4()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

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

                        /** A method that can be used to verify the individual's identity. */
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

                        fun build(): Identification =
                            Identification(
                                checkRequired("method", method),
                                checkRequired("numberLast4", numberLast4),
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
    @NoAutoDetect
    class GovernmentAuthority
    @JsonCreator
    private constructor(
        @JsonProperty("address")
        @ExcludeMissing
        private val address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("authorized_persons")
        @ExcludeMissing
        private val authorizedPersons: JsonField<List<AuthorizedPerson>> = JsonMissing.of(),
        @JsonProperty("category")
        @ExcludeMissing
        private val category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_identifier")
        @ExcludeMissing
        private val taxIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("website")
        @ExcludeMissing
        private val website: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /** The identifying details of authorized persons of the government authority. */
        @JsonProperty("authorized_persons")
        @ExcludeMissing
        fun _authorizedPersons(): JsonField<List<AuthorizedPerson>> = authorizedPersons

        /** The category of the government authority. */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /** The government authority's name. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** The Employer Identification Number (EIN) of the government authority. */
        @JsonProperty("tax_identifier")
        @ExcludeMissing
        fun _taxIdentifier(): JsonField<String> = taxIdentifier

        /** The government authority's website. */
        @JsonProperty("website") @ExcludeMissing fun _website(): JsonField<String> = website

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): GovernmentAuthority = apply {
            if (validated) {
                return@apply
            }

            address().validate()
            authorizedPersons().forEach { it.validate() }
            category()
            name()
            taxIdentifier()
            website()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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

            /** The government authority's address. */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** The identifying details of authorized persons of the government authority. */
            fun authorizedPersons(authorizedPersons: List<AuthorizedPerson>) =
                authorizedPersons(JsonField.of(authorizedPersons))

            /** The identifying details of authorized persons of the government authority. */
            fun authorizedPersons(authorizedPersons: JsonField<List<AuthorizedPerson>>) = apply {
                this.authorizedPersons = authorizedPersons.map { it.toMutableList() }
            }

            /** The identifying details of authorized persons of the government authority. */
            fun addAuthorizedPerson(authorizedPerson: AuthorizedPerson) = apply {
                authorizedPersons =
                    (authorizedPersons ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(authorizedPerson)
                    }
            }

            /** The category of the government authority. */
            fun category(category: Category) = category(JsonField.of(category))

            /** The category of the government authority. */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** The government authority's name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The government authority's name. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The Employer Identification Number (EIN) of the government authority. */
            fun taxIdentifier(taxIdentifier: String?) =
                taxIdentifier(JsonField.ofNullable(taxIdentifier))

            /** The Employer Identification Number (EIN) of the government authority. */
            fun taxIdentifier(taxIdentifier: Optional<String>) =
                taxIdentifier(taxIdentifier.orElse(null))

            /** The Employer Identification Number (EIN) of the government authority. */
            fun taxIdentifier(taxIdentifier: JsonField<String>) = apply {
                this.taxIdentifier = taxIdentifier
            }

            /** The government authority's website. */
            fun website(website: String?) = website(JsonField.ofNullable(website))

            /** The government authority's website. */
            fun website(website: Optional<String>) = website(website.orElse(null))

            /** The government authority's website. */
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

            fun build(): GovernmentAuthority =
                GovernmentAuthority(
                    checkRequired("address", address),
                    checkRequired("authorizedPersons", authorizedPersons).map { it.toImmutable() },
                    checkRequired("category", category),
                    checkRequired("name", name),
                    checkRequired("taxIdentifier", taxIdentifier),
                    checkRequired("website", website),
                    additionalProperties.toImmutable(),
                )
        }

        /** The government authority's address. */
        @NoAutoDetect
        class Address
        @JsonCreator
        private constructor(
            @JsonProperty("city")
            @ExcludeMissing
            private val city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1")
            @ExcludeMissing
            private val line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2")
            @ExcludeMissing
            private val line2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state")
            @ExcludeMissing
            private val state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("zip")
            @ExcludeMissing
            private val zip: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /** The first line of the address. */
            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /** The second line of the address. */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

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

                /** The city of the address. */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The first line of the address. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /** The first line of the address. */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The second line of the address. */
                fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                /** The second line of the address. */
                fun line2(line2: Optional<String>) = line2(line2.orElse(null))

                /** The second line of the address. */
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
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The ZIP code of the address. */
                fun zip(zip: String) = zip(JsonField.of(zip))

                /** The ZIP code of the address. */
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

                fun build(): Address =
                    Address(
                        checkRequired("city", city),
                        checkRequired("line1", line1),
                        checkRequired("line2", line2),
                        checkRequired("state", state),
                        checkRequired("zip", zip),
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

        @NoAutoDetect
        class AuthorizedPerson
        @JsonCreator
        private constructor(
            @JsonProperty("authorized_person_id")
            @ExcludeMissing
            private val authorizedPersonId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The identifier of this authorized person. */
            fun authorizedPersonId(): String =
                authorizedPersonId.getRequired("authorized_person_id")

            /** The person's legal name. */
            fun name(): String = name.getRequired("name")

            /** The identifier of this authorized person. */
            @JsonProperty("authorized_person_id")
            @ExcludeMissing
            fun _authorizedPersonId(): JsonField<String> = authorizedPersonId

            /** The person's legal name. */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AuthorizedPerson = apply {
                if (validated) {
                    return@apply
                }

                authorizedPersonId()
                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

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

                /** The identifier of this authorized person. */
                fun authorizedPersonId(authorizedPersonId: JsonField<String>) = apply {
                    this.authorizedPersonId = authorizedPersonId
                }

                /** The person's legal name. */
                fun name(name: String) = name(JsonField.of(name))

                /** The person's legal name. */
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

                fun build(): AuthorizedPerson =
                    AuthorizedPerson(
                        checkRequired("authorizedPersonId", authorizedPersonId),
                        checkRequired("name", name),
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
    @NoAutoDetect
    class Joint
    @JsonCreator
    private constructor(
        @JsonProperty("individuals")
        @ExcludeMissing
        private val individuals: JsonField<List<Individual>> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The two individuals that share control of the entity. */
        fun individuals(): List<Individual> = individuals.getRequired("individuals")

        /** The entity's name. */
        fun name(): String = name.getRequired("name")

        /** The two individuals that share control of the entity. */
        @JsonProperty("individuals")
        @ExcludeMissing
        fun _individuals(): JsonField<List<Individual>> = individuals

        /** The entity's name. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Joint = apply {
            if (validated) {
                return@apply
            }

            individuals().forEach { it.validate() }
            name()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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

            /** The two individuals that share control of the entity. */
            fun individuals(individuals: JsonField<List<Individual>>) = apply {
                this.individuals = individuals.map { it.toMutableList() }
            }

            /** The two individuals that share control of the entity. */
            fun addIndividual(individual: Individual) = apply {
                individuals =
                    (individuals ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(individual)
                    }
            }

            /** The entity's name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The entity's name. */
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

            fun build(): Joint =
                Joint(
                    checkRequired("individuals", individuals).map { it.toImmutable() },
                    checkRequired("name", name),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Individual
        @JsonCreator
        private constructor(
            @JsonProperty("address")
            @ExcludeMissing
            private val address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("date_of_birth")
            @ExcludeMissing
            private val dateOfBirth: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("identification")
            @ExcludeMissing
            private val identification: JsonField<Identification> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
            @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

            /** The person's date of birth in YYYY-MM-DD format. */
            @JsonProperty("date_of_birth")
            @ExcludeMissing
            fun _dateOfBirth(): JsonField<LocalDate> = dateOfBirth

            /** A means of verifying the person's identity. */
            @JsonProperty("identification")
            @ExcludeMissing
            fun _identification(): JsonField<Identification> = identification

            /** The person's legal name. */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

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

                /** The person's address. */
                fun address(address: JsonField<Address>) = apply { this.address = address }

                /** The person's date of birth in YYYY-MM-DD format. */
                fun dateOfBirth(dateOfBirth: LocalDate) = dateOfBirth(JsonField.of(dateOfBirth))

                /** The person's date of birth in YYYY-MM-DD format. */
                fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                    this.dateOfBirth = dateOfBirth
                }

                /** A means of verifying the person's identity. */
                fun identification(identification: Identification) =
                    identification(JsonField.of(identification))

                /** A means of verifying the person's identity. */
                fun identification(identification: JsonField<Identification>) = apply {
                    this.identification = identification
                }

                /** The person's legal name. */
                fun name(name: String) = name(JsonField.of(name))

                /** The person's legal name. */
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

                fun build(): Individual =
                    Individual(
                        checkRequired("address", address),
                        checkRequired("dateOfBirth", dateOfBirth),
                        checkRequired("identification", identification),
                        checkRequired("name", name),
                        additionalProperties.toImmutable(),
                    )
            }

            /** The person's address. */
            @NoAutoDetect
            class Address
            @JsonCreator
            private constructor(
                @JsonProperty("city")
                @ExcludeMissing
                private val city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line1")
                @ExcludeMissing
                private val line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2")
                @ExcludeMissing
                private val line2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state")
                @ExcludeMissing
                private val state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("zip")
                @ExcludeMissing
                private val zip: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
                @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

                /** The first line of the address. */
                @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

                /** The second line of the address. */
                @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

                /** The ZIP code of the address. */
                @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

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

                    /** The city of the address. */
                    fun city(city: JsonField<String>) = apply { this.city = city }

                    /** The first line of the address. */
                    fun line1(line1: String) = line1(JsonField.of(line1))

                    /** The first line of the address. */
                    fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                    /** The second line of the address. */
                    fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                    /** The second line of the address. */
                    fun line2(line2: Optional<String>) = line2(line2.orElse(null))

                    /** The second line of the address. */
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
                    fun state(state: JsonField<String>) = apply { this.state = state }

                    /** The ZIP code of the address. */
                    fun zip(zip: String) = zip(JsonField.of(zip))

                    /** The ZIP code of the address. */
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

                    fun build(): Address =
                        Address(
                            checkRequired("city", city),
                            checkRequired("line1", line1),
                            checkRequired("line2", line2),
                            checkRequired("state", state),
                            checkRequired("zip", zip),
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
            @NoAutoDetect
            class Identification
            @JsonCreator
            private constructor(
                @JsonProperty("method")
                @ExcludeMissing
                private val method: JsonField<Method> = JsonMissing.of(),
                @JsonProperty("number_last4")
                @ExcludeMissing
                private val numberLast4: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** A method that can be used to verify the individual's identity. */
                fun method(): Method = method.getRequired("method")

                /**
                 * The last 4 digits of the identification number that can be used to verify the
                 * individual's identity.
                 */
                fun numberLast4(): String = numberLast4.getRequired("number_last4")

                /** A method that can be used to verify the individual's identity. */
                @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

                /**
                 * The last 4 digits of the identification number that can be used to verify the
                 * individual's identity.
                 */
                @JsonProperty("number_last4")
                @ExcludeMissing
                fun _numberLast4(): JsonField<String> = numberLast4

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Identification = apply {
                    if (validated) {
                        return@apply
                    }

                    method()
                    numberLast4()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

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

                    /** A method that can be used to verify the individual's identity. */
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

                    fun build(): Identification =
                        Identification(
                            checkRequired("method", method),
                            checkRequired("numberLast4", numberLast4),
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
    @NoAutoDetect
    class NaturalPerson
    @JsonCreator
    private constructor(
        @JsonProperty("address")
        @ExcludeMissing
        private val address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("date_of_birth")
        @ExcludeMissing
        private val dateOfBirth: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("identification")
        @ExcludeMissing
        private val identification: JsonField<Identification> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /** The person's date of birth in YYYY-MM-DD format. */
        @JsonProperty("date_of_birth")
        @ExcludeMissing
        fun _dateOfBirth(): JsonField<LocalDate> = dateOfBirth

        /** A means of verifying the person's identity. */
        @JsonProperty("identification")
        @ExcludeMissing
        fun _identification(): JsonField<Identification> = identification

        /** The person's legal name. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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

            /** The person's address. */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** The person's date of birth in YYYY-MM-DD format. */
            fun dateOfBirth(dateOfBirth: LocalDate) = dateOfBirth(JsonField.of(dateOfBirth))

            /** The person's date of birth in YYYY-MM-DD format. */
            fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                this.dateOfBirth = dateOfBirth
            }

            /** A means of verifying the person's identity. */
            fun identification(identification: Identification) =
                identification(JsonField.of(identification))

            /** A means of verifying the person's identity. */
            fun identification(identification: JsonField<Identification>) = apply {
                this.identification = identification
            }

            /** The person's legal name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The person's legal name. */
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

            fun build(): NaturalPerson =
                NaturalPerson(
                    checkRequired("address", address),
                    checkRequired("dateOfBirth", dateOfBirth),
                    checkRequired("identification", identification),
                    checkRequired("name", name),
                    additionalProperties.toImmutable(),
                )
        }

        /** The person's address. */
        @NoAutoDetect
        class Address
        @JsonCreator
        private constructor(
            @JsonProperty("city")
            @ExcludeMissing
            private val city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1")
            @ExcludeMissing
            private val line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2")
            @ExcludeMissing
            private val line2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state")
            @ExcludeMissing
            private val state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("zip")
            @ExcludeMissing
            private val zip: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /** The first line of the address. */
            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /** The second line of the address. */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

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

                /** The city of the address. */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The first line of the address. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /** The first line of the address. */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The second line of the address. */
                fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                /** The second line of the address. */
                fun line2(line2: Optional<String>) = line2(line2.orElse(null))

                /** The second line of the address. */
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
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The ZIP code of the address. */
                fun zip(zip: String) = zip(JsonField.of(zip))

                /** The ZIP code of the address. */
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

                fun build(): Address =
                    Address(
                        checkRequired("city", city),
                        checkRequired("line1", line1),
                        checkRequired("line2", line2),
                        checkRequired("state", state),
                        checkRequired("zip", zip),
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
        @NoAutoDetect
        class Identification
        @JsonCreator
        private constructor(
            @JsonProperty("method")
            @ExcludeMissing
            private val method: JsonField<Method> = JsonMissing.of(),
            @JsonProperty("number_last4")
            @ExcludeMissing
            private val numberLast4: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** A method that can be used to verify the individual's identity. */
            fun method(): Method = method.getRequired("method")

            /**
             * The last 4 digits of the identification number that can be used to verify the
             * individual's identity.
             */
            fun numberLast4(): String = numberLast4.getRequired("number_last4")

            /** A method that can be used to verify the individual's identity. */
            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

            /**
             * The last 4 digits of the identification number that can be used to verify the
             * individual's identity.
             */
            @JsonProperty("number_last4")
            @ExcludeMissing
            fun _numberLast4(): JsonField<String> = numberLast4

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Identification = apply {
                if (validated) {
                    return@apply
                }

                method()
                numberLast4()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

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

                /** A method that can be used to verify the individual's identity. */
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

                fun build(): Identification =
                    Identification(
                        checkRequired("method", method),
                        checkRequired("numberLast4", numberLast4),
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
    @NoAutoDetect
    class ThirdPartyVerification
    @JsonCreator
    private constructor(
        @JsonProperty("reference")
        @ExcludeMissing
        private val reference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vendor")
        @ExcludeMissing
        private val vendor: JsonField<Vendor> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The reference identifier for the third party verification. */
        fun reference(): String = reference.getRequired("reference")

        /** The vendor that was used to perform the verification. */
        fun vendor(): Vendor = vendor.getRequired("vendor")

        /** The reference identifier for the third party verification. */
        @JsonProperty("reference") @ExcludeMissing fun _reference(): JsonField<String> = reference

        /** The vendor that was used to perform the verification. */
        @JsonProperty("vendor") @ExcludeMissing fun _vendor(): JsonField<Vendor> = vendor

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ThirdPartyVerification = apply {
            if (validated) {
                return@apply
            }

            reference()
            vendor()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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

            /** The reference identifier for the third party verification. */
            fun reference(reference: JsonField<String>) = apply { this.reference = reference }

            /** The vendor that was used to perform the verification. */
            fun vendor(vendor: Vendor) = vendor(JsonField.of(vendor))

            /** The vendor that was used to perform the verification. */
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

            fun build(): ThirdPartyVerification =
                ThirdPartyVerification(
                    checkRequired("reference", reference),
                    checkRequired("vendor", vendor),
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
    @NoAutoDetect
    class Trust
    @JsonCreator
    private constructor(
        @JsonProperty("address")
        @ExcludeMissing
        private val address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("category")
        @ExcludeMissing
        private val category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("formation_document_file_id")
        @ExcludeMissing
        private val formationDocumentFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("formation_state")
        @ExcludeMissing
        private val formationState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("grantor")
        @ExcludeMissing
        private val grantor: JsonField<Grantor> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_identifier")
        @ExcludeMissing
        private val taxIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trustees")
        @ExcludeMissing
        private val trustees: JsonField<List<Trustee>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /** Whether the trust is `revocable` or `irrevocable`. */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /** The ID for the File containing the formation document of the trust. */
        @JsonProperty("formation_document_file_id")
        @ExcludeMissing
        fun _formationDocumentFileId(): JsonField<String> = formationDocumentFileId

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the state in which
         * the trust was formed.
         */
        @JsonProperty("formation_state")
        @ExcludeMissing
        fun _formationState(): JsonField<String> = formationState

        /** The grantor of the trust. Will be present if the `category` is `revocable`. */
        @JsonProperty("grantor") @ExcludeMissing fun _grantor(): JsonField<Grantor> = grantor

        /** The trust's name. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** The Employer Identification Number (EIN) of the trust itself. */
        @JsonProperty("tax_identifier")
        @ExcludeMissing
        fun _taxIdentifier(): JsonField<String> = taxIdentifier

        /** The trustees of the trust. */
        @JsonProperty("trustees")
        @ExcludeMissing
        fun _trustees(): JsonField<List<Trustee>> = trustees

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Trust = apply {
            if (validated) {
                return@apply
            }

            address().validate()
            category()
            formationDocumentFileId()
            formationState()
            grantor().ifPresent { it.validate() }
            name()
            taxIdentifier()
            trustees().forEach { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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

            /** The trust's address. */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** Whether the trust is `revocable` or `irrevocable`. */
            fun category(category: Category) = category(JsonField.of(category))

            /** Whether the trust is `revocable` or `irrevocable`. */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** The ID for the File containing the formation document of the trust. */
            fun formationDocumentFileId(formationDocumentFileId: String?) =
                formationDocumentFileId(JsonField.ofNullable(formationDocumentFileId))

            /** The ID for the File containing the formation document of the trust. */
            fun formationDocumentFileId(formationDocumentFileId: Optional<String>) =
                formationDocumentFileId(formationDocumentFileId.orElse(null))

            /** The ID for the File containing the formation document of the trust. */
            fun formationDocumentFileId(formationDocumentFileId: JsonField<String>) = apply {
                this.formationDocumentFileId = formationDocumentFileId
            }

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state in
             * which the trust was formed.
             */
            fun formationState(formationState: String?) =
                formationState(JsonField.ofNullable(formationState))

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state in
             * which the trust was formed.
             */
            fun formationState(formationState: Optional<String>) =
                formationState(formationState.orElse(null))

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state in
             * which the trust was formed.
             */
            fun formationState(formationState: JsonField<String>) = apply {
                this.formationState = formationState
            }

            /** The grantor of the trust. Will be present if the `category` is `revocable`. */
            fun grantor(grantor: Grantor?) = grantor(JsonField.ofNullable(grantor))

            /** The grantor of the trust. Will be present if the `category` is `revocable`. */
            fun grantor(grantor: Optional<Grantor>) = grantor(grantor.orElse(null))

            /** The grantor of the trust. Will be present if the `category` is `revocable`. */
            fun grantor(grantor: JsonField<Grantor>) = apply { this.grantor = grantor }

            /** The trust's name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The trust's name. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The Employer Identification Number (EIN) of the trust itself. */
            fun taxIdentifier(taxIdentifier: String?) =
                taxIdentifier(JsonField.ofNullable(taxIdentifier))

            /** The Employer Identification Number (EIN) of the trust itself. */
            fun taxIdentifier(taxIdentifier: Optional<String>) =
                taxIdentifier(taxIdentifier.orElse(null))

            /** The Employer Identification Number (EIN) of the trust itself. */
            fun taxIdentifier(taxIdentifier: JsonField<String>) = apply {
                this.taxIdentifier = taxIdentifier
            }

            /** The trustees of the trust. */
            fun trustees(trustees: List<Trustee>) = trustees(JsonField.of(trustees))

            /** The trustees of the trust. */
            fun trustees(trustees: JsonField<List<Trustee>>) = apply {
                this.trustees = trustees.map { it.toMutableList() }
            }

            /** The trustees of the trust. */
            fun addTrustee(trustee: Trustee) = apply {
                trustees =
                    (trustees ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(trustee)
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
                    additionalProperties.toImmutable(),
                )
        }

        /** The trust's address. */
        @NoAutoDetect
        class Address
        @JsonCreator
        private constructor(
            @JsonProperty("city")
            @ExcludeMissing
            private val city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1")
            @ExcludeMissing
            private val line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2")
            @ExcludeMissing
            private val line2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state")
            @ExcludeMissing
            private val state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("zip")
            @ExcludeMissing
            private val zip: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /** The first line of the address. */
            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /** The second line of the address. */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

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

                /** The city of the address. */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The first line of the address. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /** The first line of the address. */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The second line of the address. */
                fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                /** The second line of the address. */
                fun line2(line2: Optional<String>) = line2(line2.orElse(null))

                /** The second line of the address. */
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
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The ZIP code of the address. */
                fun zip(zip: String) = zip(JsonField.of(zip))

                /** The ZIP code of the address. */
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

                fun build(): Address =
                    Address(
                        checkRequired("city", city),
                        checkRequired("line1", line1),
                        checkRequired("line2", line2),
                        checkRequired("state", state),
                        checkRequired("zip", zip),
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
        @NoAutoDetect
        class Grantor
        @JsonCreator
        private constructor(
            @JsonProperty("address")
            @ExcludeMissing
            private val address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("date_of_birth")
            @ExcludeMissing
            private val dateOfBirth: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("identification")
            @ExcludeMissing
            private val identification: JsonField<Identification> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
            @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

            /** The person's date of birth in YYYY-MM-DD format. */
            @JsonProperty("date_of_birth")
            @ExcludeMissing
            fun _dateOfBirth(): JsonField<LocalDate> = dateOfBirth

            /** A means of verifying the person's identity. */
            @JsonProperty("identification")
            @ExcludeMissing
            fun _identification(): JsonField<Identification> = identification

            /** The person's legal name. */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

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

                /** The person's address. */
                fun address(address: JsonField<Address>) = apply { this.address = address }

                /** The person's date of birth in YYYY-MM-DD format. */
                fun dateOfBirth(dateOfBirth: LocalDate) = dateOfBirth(JsonField.of(dateOfBirth))

                /** The person's date of birth in YYYY-MM-DD format. */
                fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                    this.dateOfBirth = dateOfBirth
                }

                /** A means of verifying the person's identity. */
                fun identification(identification: Identification) =
                    identification(JsonField.of(identification))

                /** A means of verifying the person's identity. */
                fun identification(identification: JsonField<Identification>) = apply {
                    this.identification = identification
                }

                /** The person's legal name. */
                fun name(name: String) = name(JsonField.of(name))

                /** The person's legal name. */
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

                fun build(): Grantor =
                    Grantor(
                        checkRequired("address", address),
                        checkRequired("dateOfBirth", dateOfBirth),
                        checkRequired("identification", identification),
                        checkRequired("name", name),
                        additionalProperties.toImmutable(),
                    )
            }

            /** The person's address. */
            @NoAutoDetect
            class Address
            @JsonCreator
            private constructor(
                @JsonProperty("city")
                @ExcludeMissing
                private val city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line1")
                @ExcludeMissing
                private val line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2")
                @ExcludeMissing
                private val line2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state")
                @ExcludeMissing
                private val state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("zip")
                @ExcludeMissing
                private val zip: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
                @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

                /** The first line of the address. */
                @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

                /** The second line of the address. */
                @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

                /** The ZIP code of the address. */
                @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

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

                    /** The city of the address. */
                    fun city(city: JsonField<String>) = apply { this.city = city }

                    /** The first line of the address. */
                    fun line1(line1: String) = line1(JsonField.of(line1))

                    /** The first line of the address. */
                    fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                    /** The second line of the address. */
                    fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                    /** The second line of the address. */
                    fun line2(line2: Optional<String>) = line2(line2.orElse(null))

                    /** The second line of the address. */
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
                    fun state(state: JsonField<String>) = apply { this.state = state }

                    /** The ZIP code of the address. */
                    fun zip(zip: String) = zip(JsonField.of(zip))

                    /** The ZIP code of the address. */
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

                    fun build(): Address =
                        Address(
                            checkRequired("city", city),
                            checkRequired("line1", line1),
                            checkRequired("line2", line2),
                            checkRequired("state", state),
                            checkRequired("zip", zip),
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
            @NoAutoDetect
            class Identification
            @JsonCreator
            private constructor(
                @JsonProperty("method")
                @ExcludeMissing
                private val method: JsonField<Method> = JsonMissing.of(),
                @JsonProperty("number_last4")
                @ExcludeMissing
                private val numberLast4: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** A method that can be used to verify the individual's identity. */
                fun method(): Method = method.getRequired("method")

                /**
                 * The last 4 digits of the identification number that can be used to verify the
                 * individual's identity.
                 */
                fun numberLast4(): String = numberLast4.getRequired("number_last4")

                /** A method that can be used to verify the individual's identity. */
                @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

                /**
                 * The last 4 digits of the identification number that can be used to verify the
                 * individual's identity.
                 */
                @JsonProperty("number_last4")
                @ExcludeMissing
                fun _numberLast4(): JsonField<String> = numberLast4

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Identification = apply {
                    if (validated) {
                        return@apply
                    }

                    method()
                    numberLast4()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

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

                    /** A method that can be used to verify the individual's identity. */
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

                    fun build(): Identification =
                        Identification(
                            checkRequired("method", method),
                            checkRequired("numberLast4", numberLast4),
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

        @NoAutoDetect
        class Trustee
        @JsonCreator
        private constructor(
            @JsonProperty("individual")
            @ExcludeMissing
            private val individual: JsonField<Individual> = JsonMissing.of(),
            @JsonProperty("structure")
            @ExcludeMissing
            private val structure: JsonField<Structure> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
            @JsonProperty("individual")
            @ExcludeMissing
            fun _individual(): JsonField<Individual> = individual

            /** The structure of the trustee. Will always be equal to `individual`. */
            @JsonProperty("structure")
            @ExcludeMissing
            fun _structure(): JsonField<Structure> = structure

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Trustee = apply {
                if (validated) {
                    return@apply
                }

                individual().ifPresent { it.validate() }
                structure()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

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

                /**
                 * The individual trustee of the trust. Will be present if the trustee's `structure`
                 * is equal to `individual`.
                 */
                fun individual(individual: Optional<Individual>) =
                    individual(individual.orElse(null))

                /**
                 * The individual trustee of the trust. Will be present if the trustee's `structure`
                 * is equal to `individual`.
                 */
                fun individual(individual: JsonField<Individual>) = apply {
                    this.individual = individual
                }

                /** The structure of the trustee. Will always be equal to `individual`. */
                fun structure(structure: Structure) = structure(JsonField.of(structure))

                /** The structure of the trustee. Will always be equal to `individual`. */
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

                fun build(): Trustee =
                    Trustee(
                        checkRequired("individual", individual),
                        checkRequired("structure", structure),
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * The individual trustee of the trust. Will be present if the trustee's `structure` is
             * equal to `individual`.
             */
            @NoAutoDetect
            class Individual
            @JsonCreator
            private constructor(
                @JsonProperty("address")
                @ExcludeMissing
                private val address: JsonField<Address> = JsonMissing.of(),
                @JsonProperty("date_of_birth")
                @ExcludeMissing
                private val dateOfBirth: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("identification")
                @ExcludeMissing
                private val identification: JsonField<Identification> = JsonMissing.of(),
                @JsonProperty("name")
                @ExcludeMissing
                private val name: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

                /** The person's date of birth in YYYY-MM-DD format. */
                @JsonProperty("date_of_birth")
                @ExcludeMissing
                fun _dateOfBirth(): JsonField<LocalDate> = dateOfBirth

                /** A means of verifying the person's identity. */
                @JsonProperty("identification")
                @ExcludeMissing
                fun _identification(): JsonField<Identification> = identification

                /** The person's legal name. */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

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

                    /** The person's address. */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

                    /** The person's date of birth in YYYY-MM-DD format. */
                    fun dateOfBirth(dateOfBirth: LocalDate) = dateOfBirth(JsonField.of(dateOfBirth))

                    /** The person's date of birth in YYYY-MM-DD format. */
                    fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                        this.dateOfBirth = dateOfBirth
                    }

                    /** A means of verifying the person's identity. */
                    fun identification(identification: Identification) =
                        identification(JsonField.of(identification))

                    /** A means of verifying the person's identity. */
                    fun identification(identification: JsonField<Identification>) = apply {
                        this.identification = identification
                    }

                    /** The person's legal name. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The person's legal name. */
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

                    fun build(): Individual =
                        Individual(
                            checkRequired("address", address),
                            checkRequired("dateOfBirth", dateOfBirth),
                            checkRequired("identification", identification),
                            checkRequired("name", name),
                            additionalProperties.toImmutable(),
                        )
                }

                /** The person's address. */
                @NoAutoDetect
                class Address
                @JsonCreator
                private constructor(
                    @JsonProperty("city")
                    @ExcludeMissing
                    private val city: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line1")
                    @ExcludeMissing
                    private val line1: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line2")
                    @ExcludeMissing
                    private val line2: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("state")
                    @ExcludeMissing
                    private val state: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("zip")
                    @ExcludeMissing
                    private val zip: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
                    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

                    /** The first line of the address. */
                    @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

                    /** The second line of the address. */
                    @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

                    /** The ZIP code of the address. */
                    @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

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

                        /** The city of the address. */
                        fun city(city: JsonField<String>) = apply { this.city = city }

                        /** The first line of the address. */
                        fun line1(line1: String) = line1(JsonField.of(line1))

                        /** The first line of the address. */
                        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                        /** The second line of the address. */
                        fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                        /** The second line of the address. */
                        fun line2(line2: Optional<String>) = line2(line2.orElse(null))

                        /** The second line of the address. */
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
                        fun state(state: JsonField<String>) = apply { this.state = state }

                        /** The ZIP code of the address. */
                        fun zip(zip: String) = zip(JsonField.of(zip))

                        /** The ZIP code of the address. */
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

                        fun build(): Address =
                            Address(
                                checkRequired("city", city),
                                checkRequired("line1", line1),
                                checkRequired("line2", line2),
                                checkRequired("state", state),
                                checkRequired("zip", zip),
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
                @NoAutoDetect
                class Identification
                @JsonCreator
                private constructor(
                    @JsonProperty("method")
                    @ExcludeMissing
                    private val method: JsonField<Method> = JsonMissing.of(),
                    @JsonProperty("number_last4")
                    @ExcludeMissing
                    private val numberLast4: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** A method that can be used to verify the individual's identity. */
                    fun method(): Method = method.getRequired("method")

                    /**
                     * The last 4 digits of the identification number that can be used to verify the
                     * individual's identity.
                     */
                    fun numberLast4(): String = numberLast4.getRequired("number_last4")

                    /** A method that can be used to verify the individual's identity. */
                    @JsonProperty("method")
                    @ExcludeMissing
                    fun _method(): JsonField<Method> = method

                    /**
                     * The last 4 digits of the identification number that can be used to verify the
                     * individual's identity.
                     */
                    @JsonProperty("number_last4")
                    @ExcludeMissing
                    fun _numberLast4(): JsonField<String> = numberLast4

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Identification = apply {
                        if (validated) {
                            return@apply
                        }

                        method()
                        numberLast4()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

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

                        /** A method that can be used to verify the individual's identity. */
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

                        fun build(): Identification =
                            Identification(
                                checkRequired("method", method),
                                checkRequired("numberLast4", numberLast4),
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

        return /* spotless:off */ other is Entity && id == other.id && corporation == other.corporation && createdAt == other.createdAt && description == other.description && detailsConfirmedAt == other.detailsConfirmedAt && governmentAuthority == other.governmentAuthority && idempotencyKey == other.idempotencyKey && joint == other.joint && naturalPerson == other.naturalPerson && status == other.status && structure == other.structure && supplementalDocuments == other.supplementalDocuments && thirdPartyVerification == other.thirdPartyVerification && trust == other.trust && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, corporation, createdAt, description, detailsConfirmedAt, governmentAuthority, idempotencyKey, joint, naturalPerson, status, structure, supplementalDocuments, thirdPartyVerification, trust, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Entity{id=$id, corporation=$corporation, createdAt=$createdAt, description=$description, detailsConfirmedAt=$detailsConfirmedAt, governmentAuthority=$governmentAuthority, idempotencyKey=$idempotencyKey, joint=$joint, naturalPerson=$naturalPerson, status=$status, structure=$structure, supplementalDocuments=$supplementalDocuments, thirdPartyVerification=$thirdPartyVerification, trust=$trust, type=$type, additionalProperties=$additionalProperties}"
}
