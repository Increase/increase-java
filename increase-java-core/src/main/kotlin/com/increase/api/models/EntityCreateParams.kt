package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class EntityCreateParams
constructor(
    private val relationship: Relationship,
    private val structure: Structure,
    private val corporation: Corporation?,
    private val description: String?,
    private val joint: Joint?,
    private val naturalPerson: NaturalPerson?,
    private val supplementalDocuments: List<SupplementalDocument>?,
    private val trust: Trust?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun relationship(): Relationship = relationship

    fun structure(): Structure = structure

    fun corporation(): Optional<Corporation> = Optional.ofNullable(corporation)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun joint(): Optional<Joint> = Optional.ofNullable(joint)

    fun naturalPerson(): Optional<NaturalPerson> = Optional.ofNullable(naturalPerson)

    fun supplementalDocuments(): Optional<List<SupplementalDocument>> =
        Optional.ofNullable(supplementalDocuments)

    fun trust(): Optional<Trust> = Optional.ofNullable(trust)

    @JvmSynthetic
    internal fun getBody(): EntityCreateBody {
        return EntityCreateBody(
            relationship,
            structure,
            corporation,
            description,
            joint,
            naturalPerson,
            supplementalDocuments,
            trust,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = EntityCreateBody.Builder::class)
    @NoAutoDetect
    class EntityCreateBody
    internal constructor(
        private val relationship: Relationship?,
        private val structure: Structure?,
        private val corporation: Corporation?,
        private val description: String?,
        private val joint: Joint?,
        private val naturalPerson: NaturalPerson?,
        private val supplementalDocuments: List<SupplementalDocument>?,
        private val trust: Trust?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The relationship between your group and the entity. */
        @JsonProperty("relationship") fun relationship(): Relationship? = relationship

        /** The type of Entity to create. */
        @JsonProperty("structure") fun structure(): Structure? = structure

        /**
         * Details of the corporation entity to create. Required if `structure` is equal to
         * `corporation`.
         */
        @JsonProperty("corporation") fun corporation(): Corporation? = corporation

        /** The description you choose to give the entity. */
        @JsonProperty("description") fun description(): String? = description

        /** Details of the joint entity to create. Required if `structure` is equal to `joint`. */
        @JsonProperty("joint") fun joint(): Joint? = joint

        /**
         * Details of the natural person entity to create. Required if `structure` is equal to
         * `natural_person`. Natural people entities should be submitted with
         * `social_security_number` or `individual_taxpayer_identification_number` identification
         * methods.
         */
        @JsonProperty("natural_person") fun naturalPerson(): NaturalPerson? = naturalPerson

        /** Additional documentation associated with the entity. */
        @JsonProperty("supplemental_documents")
        fun supplementalDocuments(): List<SupplementalDocument>? = supplementalDocuments

        /** Details of the trust entity to create. Required if `structure` is equal to `trust`. */
        @JsonProperty("trust") fun trust(): Trust? = trust

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EntityCreateBody &&
                this.relationship == other.relationship &&
                this.structure == other.structure &&
                this.corporation == other.corporation &&
                this.description == other.description &&
                this.joint == other.joint &&
                this.naturalPerson == other.naturalPerson &&
                this.supplementalDocuments == other.supplementalDocuments &&
                this.trust == other.trust &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        relationship,
                        structure,
                        corporation,
                        description,
                        joint,
                        naturalPerson,
                        supplementalDocuments,
                        trust,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "EntityCreateBody{relationship=$relationship, structure=$structure, corporation=$corporation, description=$description, joint=$joint, naturalPerson=$naturalPerson, supplementalDocuments=$supplementalDocuments, trust=$trust, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var relationship: Relationship? = null
            private var structure: Structure? = null
            private var corporation: Corporation? = null
            private var description: String? = null
            private var joint: Joint? = null
            private var naturalPerson: NaturalPerson? = null
            private var supplementalDocuments: List<SupplementalDocument>? = null
            private var trust: Trust? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entityCreateBody: EntityCreateBody) = apply {
                this.relationship = entityCreateBody.relationship
                this.structure = entityCreateBody.structure
                this.corporation = entityCreateBody.corporation
                this.description = entityCreateBody.description
                this.joint = entityCreateBody.joint
                this.naturalPerson = entityCreateBody.naturalPerson
                this.supplementalDocuments = entityCreateBody.supplementalDocuments
                this.trust = entityCreateBody.trust
                additionalProperties(entityCreateBody.additionalProperties)
            }

            /** The relationship between your group and the entity. */
            @JsonProperty("relationship")
            fun relationship(relationship: Relationship) = apply {
                this.relationship = relationship
            }

            /** The type of Entity to create. */
            @JsonProperty("structure")
            fun structure(structure: Structure) = apply { this.structure = structure }

            /**
             * Details of the corporation entity to create. Required if `structure` is equal to
             * `corporation`.
             */
            @JsonProperty("corporation")
            fun corporation(corporation: Corporation) = apply { this.corporation = corporation }

            /** The description you choose to give the entity. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * Details of the joint entity to create. Required if `structure` is equal to `joint`.
             */
            @JsonProperty("joint") fun joint(joint: Joint) = apply { this.joint = joint }

            /**
             * Details of the natural person entity to create. Required if `structure` is equal to
             * `natural_person`. Natural people entities should be submitted with
             * `social_security_number` or `individual_taxpayer_identification_number`
             * identification methods.
             */
            @JsonProperty("natural_person")
            fun naturalPerson(naturalPerson: NaturalPerson) = apply {
                this.naturalPerson = naturalPerson
            }

            /** Additional documentation associated with the entity. */
            @JsonProperty("supplemental_documents")
            fun supplementalDocuments(supplementalDocuments: List<SupplementalDocument>) = apply {
                this.supplementalDocuments = supplementalDocuments
            }

            /**
             * Details of the trust entity to create. Required if `structure` is equal to `trust`.
             */
            @JsonProperty("trust") fun trust(trust: Trust) = apply { this.trust = trust }

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

            fun build(): EntityCreateBody =
                EntityCreateBody(
                    checkNotNull(relationship) { "`relationship` is required but was not set" },
                    checkNotNull(structure) { "`structure` is required but was not set" },
                    corporation,
                    description,
                    joint,
                    naturalPerson,
                    supplementalDocuments?.toUnmodifiable(),
                    trust,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntityCreateParams &&
            this.relationship == other.relationship &&
            this.structure == other.structure &&
            this.corporation == other.corporation &&
            this.description == other.description &&
            this.joint == other.joint &&
            this.naturalPerson == other.naturalPerson &&
            this.supplementalDocuments == other.supplementalDocuments &&
            this.trust == other.trust &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            relationship,
            structure,
            corporation,
            description,
            joint,
            naturalPerson,
            supplementalDocuments,
            trust,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "EntityCreateParams{relationship=$relationship, structure=$structure, corporation=$corporation, description=$description, joint=$joint, naturalPerson=$naturalPerson, supplementalDocuments=$supplementalDocuments, trust=$trust, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var relationship: Relationship? = null
        private var structure: Structure? = null
        private var corporation: Corporation? = null
        private var description: String? = null
        private var joint: Joint? = null
        private var naturalPerson: NaturalPerson? = null
        private var supplementalDocuments: MutableList<SupplementalDocument> = mutableListOf()
        private var trust: Trust? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(entityCreateParams: EntityCreateParams) = apply {
            this.relationship = entityCreateParams.relationship
            this.structure = entityCreateParams.structure
            this.corporation = entityCreateParams.corporation
            this.description = entityCreateParams.description
            this.joint = entityCreateParams.joint
            this.naturalPerson = entityCreateParams.naturalPerson
            this.supplementalDocuments(entityCreateParams.supplementalDocuments ?: listOf())
            this.trust = entityCreateParams.trust
            additionalQueryParams(entityCreateParams.additionalQueryParams)
            additionalHeaders(entityCreateParams.additionalHeaders)
            additionalBodyProperties(entityCreateParams.additionalBodyProperties)
        }

        /** The relationship between your group and the entity. */
        fun relationship(relationship: Relationship) = apply { this.relationship = relationship }

        /** The type of Entity to create. */
        fun structure(structure: Structure) = apply { this.structure = structure }

        /**
         * Details of the corporation entity to create. Required if `structure` is equal to
         * `corporation`.
         */
        fun corporation(corporation: Corporation) = apply { this.corporation = corporation }

        /** The description you choose to give the entity. */
        fun description(description: String) = apply { this.description = description }

        /** Details of the joint entity to create. Required if `structure` is equal to `joint`. */
        fun joint(joint: Joint) = apply { this.joint = joint }

        /**
         * Details of the natural person entity to create. Required if `structure` is equal to
         * `natural_person`. Natural people entities should be submitted with
         * `social_security_number` or `individual_taxpayer_identification_number` identification
         * methods.
         */
        fun naturalPerson(naturalPerson: NaturalPerson) = apply {
            this.naturalPerson = naturalPerson
        }

        /** Additional documentation associated with the entity. */
        fun supplementalDocuments(supplementalDocuments: List<SupplementalDocument>) = apply {
            this.supplementalDocuments.clear()
            this.supplementalDocuments.addAll(supplementalDocuments)
        }

        /** Additional documentation associated with the entity. */
        fun addSupplementalDocument(supplementalDocument: SupplementalDocument) = apply {
            this.supplementalDocuments.add(supplementalDocument)
        }

        /** Details of the trust entity to create. Required if `structure` is equal to `trust`. */
        fun trust(trust: Trust) = apply { this.trust = trust }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): EntityCreateParams =
            EntityCreateParams(
                checkNotNull(relationship) { "`relationship` is required but was not set" },
                checkNotNull(structure) { "`structure` is required but was not set" },
                corporation,
                description,
                joint,
                naturalPerson,
                if (supplementalDocuments.size == 0) null
                else supplementalDocuments.toUnmodifiable(),
                trust,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class Relationship
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Relationship && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val AFFILIATED = Relationship(JsonField.of("affiliated"))

            @JvmField val INFORMATIONAL = Relationship(JsonField.of("informational"))

            @JvmField val UNAFFILIATED = Relationship(JsonField.of("unaffiliated"))

            @JvmStatic fun of(value: String) = Relationship(JsonField.of(value))
        }

        enum class Known {
            AFFILIATED,
            INFORMATIONAL,
            UNAFFILIATED,
        }

        enum class Value {
            AFFILIATED,
            INFORMATIONAL,
            UNAFFILIATED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                AFFILIATED -> Value.AFFILIATED
                INFORMATIONAL -> Value.INFORMATIONAL
                UNAFFILIATED -> Value.UNAFFILIATED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                AFFILIATED -> Known.AFFILIATED
                INFORMATIONAL -> Known.INFORMATIONAL
                UNAFFILIATED -> Known.UNAFFILIATED
                else -> throw IncreaseInvalidDataException("Unknown Relationship: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Structure
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

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

            @JvmStatic fun of(value: String) = Structure(JsonField.of(value))
        }

        enum class Known {
            CORPORATION,
            NATURAL_PERSON,
            JOINT,
            TRUST,
        }

        enum class Value {
            CORPORATION,
            NATURAL_PERSON,
            JOINT,
            TRUST,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CORPORATION -> Value.CORPORATION
                NATURAL_PERSON -> Value.NATURAL_PERSON
                JOINT -> Value.JOINT
                TRUST -> Value.TRUST
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CORPORATION -> Known.CORPORATION
                NATURAL_PERSON -> Known.NATURAL_PERSON
                JOINT -> Known.JOINT
                TRUST -> Known.TRUST
                else -> throw IncreaseInvalidDataException("Unknown Structure: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * Details of the corporation entity to create. Required if `structure` is equal to
     * `corporation`.
     */
    @JsonDeserialize(builder = Corporation.Builder::class)
    @NoAutoDetect
    class Corporation
    private constructor(
        private val name: String?,
        private val website: String?,
        private val taxIdentifier: String?,
        private val incorporationState: String?,
        private val address: Address?,
        private val beneficialOwners: List<BeneficialOwner>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The legal name of the corporation. */
        @JsonProperty("name") fun name(): String? = name

        /** The website of the corporation. */
        @JsonProperty("website") fun website(): String? = website

        /** The Employer Identification Number (EIN) for the corporation. */
        @JsonProperty("tax_identifier") fun taxIdentifier(): String? = taxIdentifier

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the corporation's
         * state of incorporation.
         */
        @JsonProperty("incorporation_state") fun incorporationState(): String? = incorporationState

        /** The corporation's physical address. Post Office Boxes are disallowed. */
        @JsonProperty("address") fun address(): Address? = address

        /**
         * The identifying details of anyone controlling or owning 25% or more of the corporation.
         */
        @JsonProperty("beneficial_owners")
        fun beneficialOwners(): List<BeneficialOwner>? = beneficialOwners

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                        address,
                        beneficialOwners,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Corporation{name=$name, website=$website, taxIdentifier=$taxIdentifier, incorporationState=$incorporationState, address=$address, beneficialOwners=$beneficialOwners, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var website: String? = null
            private var taxIdentifier: String? = null
            private var incorporationState: String? = null
            private var address: Address? = null
            private var beneficialOwners: List<BeneficialOwner>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(corporation: Corporation) = apply {
                this.name = corporation.name
                this.website = corporation.website
                this.taxIdentifier = corporation.taxIdentifier
                this.incorporationState = corporation.incorporationState
                this.address = corporation.address
                this.beneficialOwners = corporation.beneficialOwners
                additionalProperties(corporation.additionalProperties)
            }

            /** The legal name of the corporation. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** The website of the corporation. */
            @JsonProperty("website") fun website(website: String) = apply { this.website = website }

            /** The Employer Identification Number (EIN) for the corporation. */
            @JsonProperty("tax_identifier")
            fun taxIdentifier(taxIdentifier: String) = apply { this.taxIdentifier = taxIdentifier }

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the corporation's
             * state of incorporation.
             */
            @JsonProperty("incorporation_state")
            fun incorporationState(incorporationState: String) = apply {
                this.incorporationState = incorporationState
            }

            /** The corporation's physical address. Post Office Boxes are disallowed. */
            @JsonProperty("address")
            fun address(address: Address) = apply { this.address = address }

            /**
             * The identifying details of anyone controlling or owning 25% or more of the
             * corporation.
             */
            @JsonProperty("beneficial_owners")
            fun beneficialOwners(beneficialOwners: List<BeneficialOwner>) = apply {
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
                    checkNotNull(name) { "`name` is required but was not set" },
                    website,
                    checkNotNull(taxIdentifier) { "`taxIdentifier` is required but was not set" },
                    incorporationState,
                    checkNotNull(address) { "`address` is required but was not set" },
                    checkNotNull(beneficialOwners) {
                            "`beneficialOwners` is required but was not set"
                        }
                        .toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** The corporation's physical address. Post Office Boxes are disallowed. */
        @JsonDeserialize(builder = Address.Builder::class)
        @NoAutoDetect
        class Address
        private constructor(
            private val line1: String?,
            private val line2: String?,
            private val city: String?,
            private val state: String?,
            private val zip: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /** The first line of the address. This is usually the street number and street. */
            @JsonProperty("line1") fun line1(): String? = line1

            /** The second line of the address. This might be the floor or room number. */
            @JsonProperty("line2") fun line2(): String? = line2

            /** The city of the address. */
            @JsonProperty("city") fun city(): String? = city

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") fun state(): String? = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") fun zip(): String? = zip

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                private var line1: String? = null
                private var line2: String? = null
                private var city: String? = null
                private var state: String? = null
                private var zip: String? = null
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

                /** The first line of the address. This is usually the street number and street. */
                @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

                /** The second line of the address. This might be the floor or room number. */
                @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

                /** The city of the address. */
                @JsonProperty("city") fun city(city: String) = apply { this.city = city }

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                @JsonProperty("state") fun state(state: String) = apply { this.state = state }

                /** The ZIP code of the address. */
                @JsonProperty("zip") fun zip(zip: String) = apply { this.zip = zip }

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
                        checkNotNull(line1) { "`line1` is required but was not set" },
                        line2,
                        checkNotNull(city) { "`city` is required but was not set" },
                        checkNotNull(state) { "`state` is required but was not set" },
                        checkNotNull(zip) { "`zip` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = BeneficialOwner.Builder::class)
        @NoAutoDetect
        class BeneficialOwner
        private constructor(
            private val individual: Individual?,
            private val companyTitle: String?,
            private val prongs: List<Prong>?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /** Personal details for the beneficial owner. */
            @JsonProperty("individual") fun individual(): Individual? = individual

            /** This person's role or title within the entity. */
            @JsonProperty("company_title") fun companyTitle(): String? = companyTitle

            /**
             * Why this person is considered a beneficial owner of the entity. At least one option
             * is required.
             */
            @JsonProperty("prongs") fun prongs(): List<Prong>? = prongs

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BeneficialOwner &&
                    this.individual == other.individual &&
                    this.companyTitle == other.companyTitle &&
                    this.prongs == other.prongs &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            individual,
                            companyTitle,
                            prongs,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "BeneficialOwner{individual=$individual, companyTitle=$companyTitle, prongs=$prongs, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var individual: Individual? = null
                private var companyTitle: String? = null
                private var prongs: List<Prong>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(beneficialOwner: BeneficialOwner) = apply {
                    this.individual = beneficialOwner.individual
                    this.companyTitle = beneficialOwner.companyTitle
                    this.prongs = beneficialOwner.prongs
                    additionalProperties(beneficialOwner.additionalProperties)
                }

                /** Personal details for the beneficial owner. */
                @JsonProperty("individual")
                fun individual(individual: Individual) = apply { this.individual = individual }

                /** This person's role or title within the entity. */
                @JsonProperty("company_title")
                fun companyTitle(companyTitle: String) = apply { this.companyTitle = companyTitle }

                /**
                 * Why this person is considered a beneficial owner of the entity. At least one
                 * option is required.
                 */
                @JsonProperty("prongs")
                fun prongs(prongs: List<Prong>) = apply { this.prongs = prongs }

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
                        checkNotNull(individual) { "`individual` is required but was not set" },
                        companyTitle,
                        checkNotNull(prongs) { "`prongs` is required but was not set" }
                            .toUnmodifiable(),
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /** Personal details for the beneficial owner. */
            @JsonDeserialize(builder = Individual.Builder::class)
            @NoAutoDetect
            class Individual
            private constructor(
                private val name: String?,
                private val dateOfBirth: LocalDate?,
                private val address: Address?,
                private val confirmedNoUsTaxId: Boolean?,
                private val identification: Identification?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var hashCode: Int = 0

                /** The person's legal name. */
                @JsonProperty("name") fun name(): String? = name

                /** The person's date of birth in YYYY-MM-DD format. */
                @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate? = dateOfBirth

                /** The individual's physical address. Post Office Boxes are disallowed. */
                @JsonProperty("address") fun address(): Address? = address

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                @JsonProperty("confirmed_no_us_tax_id")
                fun confirmedNoUsTaxId(): Boolean? = confirmedNoUsTaxId

                /** A means of verifying the person's identity. */
                @JsonProperty("identification")
                fun identification(): Identification? = identification

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        this.name == other.name &&
                        this.dateOfBirth == other.dateOfBirth &&
                        this.address == other.address &&
                        this.confirmedNoUsTaxId == other.confirmedNoUsTaxId &&
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
                                confirmedNoUsTaxId,
                                identification,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Individual{name=$name, dateOfBirth=$dateOfBirth, address=$address, confirmedNoUsTaxId=$confirmedNoUsTaxId, identification=$identification, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var name: String? = null
                    private var dateOfBirth: LocalDate? = null
                    private var address: Address? = null
                    private var confirmedNoUsTaxId: Boolean? = null
                    private var identification: Identification? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(individual: Individual) = apply {
                        this.name = individual.name
                        this.dateOfBirth = individual.dateOfBirth
                        this.address = individual.address
                        this.confirmedNoUsTaxId = individual.confirmedNoUsTaxId
                        this.identification = individual.identification
                        additionalProperties(individual.additionalProperties)
                    }

                    /** The person's legal name. */
                    @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                    /** The person's date of birth in YYYY-MM-DD format. */
                    @JsonProperty("date_of_birth")
                    fun dateOfBirth(dateOfBirth: LocalDate) = apply {
                        this.dateOfBirth = dateOfBirth
                    }

                    /** The individual's physical address. Post Office Boxes are disallowed. */
                    @JsonProperty("address")
                    fun address(address: Address) = apply { this.address = address }

                    /**
                     * The identification method for an individual can only be a passport, driver's
                     * license, or other document if you've confirmed the individual does not have a
                     * US tax id (either a Social Security Number or Individual Taxpayer
                     * Identification Number).
                     */
                    @JsonProperty("confirmed_no_us_tax_id")
                    fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean) = apply {
                        this.confirmedNoUsTaxId = confirmedNoUsTaxId
                    }

                    /** A means of verifying the person's identity. */
                    @JsonProperty("identification")
                    fun identification(identification: Identification) = apply {
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
                            checkNotNull(name) { "`name` is required but was not set" },
                            checkNotNull(dateOfBirth) {
                                "`dateOfBirth` is required but was not set"
                            },
                            checkNotNull(address) { "`address` is required but was not set" },
                            confirmedNoUsTaxId,
                            checkNotNull(identification) {
                                "`identification` is required but was not set"
                            },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /** The individual's physical address. Post Office Boxes are disallowed. */
                @JsonDeserialize(builder = Address.Builder::class)
                @NoAutoDetect
                class Address
                private constructor(
                    private val line1: String?,
                    private val line2: String?,
                    private val city: String?,
                    private val state: String?,
                    private val zip: String?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var hashCode: Int = 0

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    @JsonProperty("line1") fun line1(): String? = line1

                    /** The second line of the address. This might be the floor or room number. */
                    @JsonProperty("line2") fun line2(): String? = line2

                    /** The city of the address. */
                    @JsonProperty("city") fun city(): String? = city

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    @JsonProperty("state") fun state(): String? = state

                    /** The ZIP code of the address. */
                    @JsonProperty("zip") fun zip(): String? = zip

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                        private var line1: String? = null
                        private var line2: String? = null
                        private var city: String? = null
                        private var state: String? = null
                        private var zip: String? = null
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

                        /**
                         * The first line of the address. This is usually the street number and
                         * street.
                         */
                        @JsonProperty("line1")
                        fun line1(line1: String) = apply { this.line1 = line1 }

                        /**
                         * The second line of the address. This might be the floor or room number.
                         */
                        @JsonProperty("line2")
                        fun line2(line2: String) = apply { this.line2 = line2 }

                        /** The city of the address. */
                        @JsonProperty("city") fun city(city: String) = apply { this.city = city }

                        /**
                         * The two-letter United States Postal Service (USPS) abbreviation for the
                         * state of the address.
                         */
                        @JsonProperty("state")
                        fun state(state: String) = apply { this.state = state }

                        /** The ZIP code of the address. */
                        @JsonProperty("zip") fun zip(zip: String) = apply { this.zip = zip }

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
                                checkNotNull(line1) { "`line1` is required but was not set" },
                                line2,
                                checkNotNull(city) { "`city` is required but was not set" },
                                checkNotNull(state) { "`state` is required but was not set" },
                                checkNotNull(zip) { "`zip` is required but was not set" },
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }

                /** A means of verifying the person's identity. */
                @JsonDeserialize(builder = Identification.Builder::class)
                @NoAutoDetect
                class Identification
                private constructor(
                    private val method: Method?,
                    private val number: String?,
                    private val passport: Passport?,
                    private val driversLicense: DriversLicense?,
                    private val other: Other?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var hashCode: Int = 0

                    /** A method that can be used to verify the individual's identity. */
                    @JsonProperty("method") fun method(): Method? = method

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     */
                    @JsonProperty("number") fun number(): String? = number

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    @JsonProperty("passport") fun passport(): Passport? = passport

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    @JsonProperty("drivers_license")
                    fun driversLicense(): DriversLicense? = driversLicense

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    @JsonProperty("other") fun other(): Other? = other

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Identification &&
                            this.method == other.method &&
                            this.number == other.number &&
                            this.passport == other.passport &&
                            this.driversLicense == other.driversLicense &&
                            this.other == other.other &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    method,
                                    number,
                                    passport,
                                    driversLicense,
                                    other,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Identification{method=$method, number=$number, passport=$passport, driversLicense=$driversLicense, other=$other, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var method: Method? = null
                        private var number: String? = null
                        private var passport: Passport? = null
                        private var driversLicense: DriversLicense? = null
                        private var other: Other? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(identification: Identification) = apply {
                            this.method = identification.method
                            this.number = identification.number
                            this.passport = identification.passport
                            this.driversLicense = identification.driversLicense
                            this.other = identification.other
                            additionalProperties(identification.additionalProperties)
                        }

                        /** A method that can be used to verify the individual's identity. */
                        @JsonProperty("method")
                        fun method(method: Method) = apply { this.method = method }

                        /**
                         * An identification number that can be used to verify the individual's
                         * identity, such as a social security number.
                         */
                        @JsonProperty("number")
                        fun number(number: String) = apply { this.number = number }

                        /**
                         * Information about the passport used for identification. Required if
                         * `method` is equal to `passport`.
                         */
                        @JsonProperty("passport")
                        fun passport(passport: Passport) = apply { this.passport = passport }

                        /**
                         * Information about the United States driver's license used for
                         * identification. Required if `method` is equal to `drivers_license`.
                         */
                        @JsonProperty("drivers_license")
                        fun driversLicense(driversLicense: DriversLicense) = apply {
                            this.driversLicense = driversLicense
                        }

                        /**
                         * Information about the identification document provided. Required if
                         * `method` is equal to `other`.
                         */
                        @JsonProperty("other")
                        fun other(other: Other) = apply { this.other = other }

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
                                checkNotNull(method) { "`method` is required but was not set" },
                                checkNotNull(number) { "`number` is required but was not set" },
                                passport,
                                driversLicense,
                                other,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class Method
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

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

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    @JsonDeserialize(builder = DriversLicense.Builder::class)
                    @NoAutoDetect
                    class DriversLicense
                    private constructor(
                        private val fileId: String?,
                        private val backFileId: String?,
                        private val expirationDate: LocalDate?,
                        private val state: String?,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var hashCode: Int = 0

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        @JsonProperty("file_id") fun fileId(): String? = fileId

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        @JsonProperty("back_file_id") fun backFileId(): String? = backFileId

                        /** The driver's license's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(): LocalDate? = expirationDate

                        /** The state that issued the provided driver's license. */
                        @JsonProperty("state") fun state(): String? = state

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is DriversLicense &&
                                this.fileId == other.fileId &&
                                this.backFileId == other.backFileId &&
                                this.expirationDate == other.expirationDate &&
                                this.state == other.state &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        fileId,
                                        backFileId,
                                        expirationDate,
                                        state,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "DriversLicense{fileId=$fileId, backFileId=$backFileId, expirationDate=$expirationDate, state=$state, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var fileId: String? = null
                            private var backFileId: String? = null
                            private var expirationDate: LocalDate? = null
                            private var state: String? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(driversLicense: DriversLicense) = apply {
                                this.fileId = driversLicense.fileId
                                this.backFileId = driversLicense.backFileId
                                this.expirationDate = driversLicense.expirationDate
                                this.state = driversLicense.state
                                additionalProperties(driversLicense.additionalProperties)
                            }

                            /**
                             * The identifier of the File containing the front of the driver's
                             * license.
                             */
                            @JsonProperty("file_id")
                            fun fileId(fileId: String) = apply { this.fileId = fileId }

                            /**
                             * The identifier of the File containing the back of the driver's
                             * license.
                             */
                            @JsonProperty("back_file_id")
                            fun backFileId(backFileId: String) = apply {
                                this.backFileId = backFileId
                            }

                            /** The driver's license's expiration date in YYYY-MM-DD format. */
                            @JsonProperty("expiration_date")
                            fun expirationDate(expirationDate: LocalDate) = apply {
                                this.expirationDate = expirationDate
                            }

                            /** The state that issued the provided driver's license. */
                            @JsonProperty("state")
                            fun state(state: String) = apply { this.state = state }

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

                            fun build(): DriversLicense =
                                DriversLicense(
                                    checkNotNull(fileId) { "`fileId` is required but was not set" },
                                    backFileId,
                                    checkNotNull(expirationDate) {
                                        "`expirationDate` is required but was not set"
                                    },
                                    checkNotNull(state) { "`state` is required but was not set" },
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    @JsonDeserialize(builder = Other.Builder::class)
                    @NoAutoDetect
                    class Other
                    private constructor(
                        private val country: String?,
                        private val description: String?,
                        private val expirationDate: LocalDate?,
                        private val fileId: String?,
                        private val backFileId: String?,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var hashCode: Int = 0

                        /**
                         * The two-character ISO 3166-1 code representing the country that issued
                         * the document.
                         */
                        @JsonProperty("country") fun country(): String? = country

                        /** A description of the document submitted. */
                        @JsonProperty("description") fun description(): String? = description

                        /** The document's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(): LocalDate? = expirationDate

                        /** The identifier of the File containing the front of the document. */
                        @JsonProperty("file_id") fun fileId(): String? = fileId

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        @JsonProperty("back_file_id") fun backFileId(): String? = backFileId

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Other &&
                                this.country == other.country &&
                                this.description == other.description &&
                                this.expirationDate == other.expirationDate &&
                                this.fileId == other.fileId &&
                                this.backFileId == other.backFileId &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        country,
                                        description,
                                        expirationDate,
                                        fileId,
                                        backFileId,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Other{country=$country, description=$description, expirationDate=$expirationDate, fileId=$fileId, backFileId=$backFileId, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var country: String? = null
                            private var description: String? = null
                            private var expirationDate: LocalDate? = null
                            private var fileId: String? = null
                            private var backFileId: String? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(other: Other) = apply {
                                this.country = other.country
                                this.description = other.description
                                this.expirationDate = other.expirationDate
                                this.fileId = other.fileId
                                this.backFileId = other.backFileId
                                additionalProperties(other.additionalProperties)
                            }

                            /**
                             * The two-character ISO 3166-1 code representing the country that
                             * issued the document.
                             */
                            @JsonProperty("country")
                            fun country(country: String) = apply { this.country = country }

                            /** A description of the document submitted. */
                            @JsonProperty("description")
                            fun description(description: String) = apply {
                                this.description = description
                            }

                            /** The document's expiration date in YYYY-MM-DD format. */
                            @JsonProperty("expiration_date")
                            fun expirationDate(expirationDate: LocalDate) = apply {
                                this.expirationDate = expirationDate
                            }

                            /** The identifier of the File containing the front of the document. */
                            @JsonProperty("file_id")
                            fun fileId(fileId: String) = apply { this.fileId = fileId }

                            /**
                             * The identifier of the File containing the back of the document. Not
                             * every document has a reverse side.
                             */
                            @JsonProperty("back_file_id")
                            fun backFileId(backFileId: String) = apply {
                                this.backFileId = backFileId
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

                            fun build(): Other =
                                Other(
                                    checkNotNull(country) {
                                        "`country` is required but was not set"
                                    },
                                    checkNotNull(description) {
                                        "`description` is required but was not set"
                                    },
                                    expirationDate,
                                    checkNotNull(fileId) { "`fileId` is required but was not set" },
                                    backFileId,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    @JsonDeserialize(builder = Passport.Builder::class)
                    @NoAutoDetect
                    class Passport
                    private constructor(
                        private val fileId: String?,
                        private val expirationDate: LocalDate?,
                        private val country: String?,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var hashCode: Int = 0

                        /** The identifier of the File containing the passport. */
                        @JsonProperty("file_id") fun fileId(): String? = fileId

                        /** The passport's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(): LocalDate? = expirationDate

                        /** The country that issued the passport. */
                        @JsonProperty("country") fun country(): String? = country

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Passport &&
                                this.fileId == other.fileId &&
                                this.expirationDate == other.expirationDate &&
                                this.country == other.country &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        fileId,
                                        expirationDate,
                                        country,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Passport{fileId=$fileId, expirationDate=$expirationDate, country=$country, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var fileId: String? = null
                            private var expirationDate: LocalDate? = null
                            private var country: String? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(passport: Passport) = apply {
                                this.fileId = passport.fileId
                                this.expirationDate = passport.expirationDate
                                this.country = passport.country
                                additionalProperties(passport.additionalProperties)
                            }

                            /** The identifier of the File containing the passport. */
                            @JsonProperty("file_id")
                            fun fileId(fileId: String) = apply { this.fileId = fileId }

                            /** The passport's expiration date in YYYY-MM-DD format. */
                            @JsonProperty("expiration_date")
                            fun expirationDate(expirationDate: LocalDate) = apply {
                                this.expirationDate = expirationDate
                            }

                            /** The country that issued the passport. */
                            @JsonProperty("country")
                            fun country(country: String) = apply { this.country = country }

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

                            fun build(): Passport =
                                Passport(
                                    checkNotNull(fileId) { "`fileId` is required but was not set" },
                                    checkNotNull(expirationDate) {
                                        "`expirationDate` is required but was not set"
                                    },
                                    checkNotNull(country) {
                                        "`country` is required but was not set"
                                    },
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }
                }
            }

            class Prong
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

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

    /** Details of the joint entity to create. Required if `structure` is equal to `joint`. */
    @JsonDeserialize(builder = Joint.Builder::class)
    @NoAutoDetect
    class Joint
    private constructor(
        private val name: String?,
        private val individuals: List<Individual>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The name of the joint entity. */
        @JsonProperty("name") fun name(): String? = name

        /** The two individuals that share control of the entity. */
        @JsonProperty("individuals") fun individuals(): List<Individual>? = individuals

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            private var name: String? = null
            private var individuals: List<Individual>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(joint: Joint) = apply {
                this.name = joint.name
                this.individuals = joint.individuals
                additionalProperties(joint.additionalProperties)
            }

            /** The name of the joint entity. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** The two individuals that share control of the entity. */
            @JsonProperty("individuals")
            fun individuals(individuals: List<Individual>) = apply {
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
                    checkNotNull(individuals) { "`individuals` is required but was not set" }
                        .toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = Individual.Builder::class)
        @NoAutoDetect
        class Individual
        private constructor(
            private val name: String?,
            private val dateOfBirth: LocalDate?,
            private val address: Address?,
            private val confirmedNoUsTaxId: Boolean?,
            private val identification: Identification?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /** The person's legal name. */
            @JsonProperty("name") fun name(): String? = name

            /** The person's date of birth in YYYY-MM-DD format. */
            @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate? = dateOfBirth

            /** The individual's physical address. Post Office Boxes are disallowed. */
            @JsonProperty("address") fun address(): Address? = address

            /**
             * The identification method for an individual can only be a passport, driver's license,
             * or other document if you've confirmed the individual does not have a US tax id
             * (either a Social Security Number or Individual Taxpayer Identification Number).
             */
            @JsonProperty("confirmed_no_us_tax_id")
            fun confirmedNoUsTaxId(): Boolean? = confirmedNoUsTaxId

            /** A means of verifying the person's identity. */
            @JsonProperty("identification") fun identification(): Identification? = identification

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Individual &&
                    this.name == other.name &&
                    this.dateOfBirth == other.dateOfBirth &&
                    this.address == other.address &&
                    this.confirmedNoUsTaxId == other.confirmedNoUsTaxId &&
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
                            confirmedNoUsTaxId,
                            identification,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Individual{name=$name, dateOfBirth=$dateOfBirth, address=$address, confirmedNoUsTaxId=$confirmedNoUsTaxId, identification=$identification, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: String? = null
                private var dateOfBirth: LocalDate? = null
                private var address: Address? = null
                private var confirmedNoUsTaxId: Boolean? = null
                private var identification: Identification? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(individual: Individual) = apply {
                    this.name = individual.name
                    this.dateOfBirth = individual.dateOfBirth
                    this.address = individual.address
                    this.confirmedNoUsTaxId = individual.confirmedNoUsTaxId
                    this.identification = individual.identification
                    additionalProperties(individual.additionalProperties)
                }

                /** The person's legal name. */
                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                /** The person's date of birth in YYYY-MM-DD format. */
                @JsonProperty("date_of_birth")
                fun dateOfBirth(dateOfBirth: LocalDate) = apply { this.dateOfBirth = dateOfBirth }

                /** The individual's physical address. Post Office Boxes are disallowed. */
                @JsonProperty("address")
                fun address(address: Address) = apply { this.address = address }

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                @JsonProperty("confirmed_no_us_tax_id")
                fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean) = apply {
                    this.confirmedNoUsTaxId = confirmedNoUsTaxId
                }

                /** A means of verifying the person's identity. */
                @JsonProperty("identification")
                fun identification(identification: Identification) = apply {
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
                        checkNotNull(name) { "`name` is required but was not set" },
                        checkNotNull(dateOfBirth) { "`dateOfBirth` is required but was not set" },
                        checkNotNull(address) { "`address` is required but was not set" },
                        confirmedNoUsTaxId,
                        checkNotNull(identification) {
                            "`identification` is required but was not set"
                        },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /** The individual's physical address. Post Office Boxes are disallowed. */
            @JsonDeserialize(builder = Address.Builder::class)
            @NoAutoDetect
            class Address
            private constructor(
                private val line1: String?,
                private val line2: String?,
                private val city: String?,
                private val state: String?,
                private val zip: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var hashCode: Int = 0

                /** The first line of the address. This is usually the street number and street. */
                @JsonProperty("line1") fun line1(): String? = line1

                /** The second line of the address. This might be the floor or room number. */
                @JsonProperty("line2") fun line2(): String? = line2

                /** The city of the address. */
                @JsonProperty("city") fun city(): String? = city

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                @JsonProperty("state") fun state(): String? = state

                /** The ZIP code of the address. */
                @JsonProperty("zip") fun zip(): String? = zip

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                    private var line1: String? = null
                    private var line2: String? = null
                    private var city: String? = null
                    private var state: String? = null
                    private var zip: String? = null
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

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

                    /** The second line of the address. This might be the floor or room number. */
                    @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

                    /** The city of the address. */
                    @JsonProperty("city") fun city(city: String) = apply { this.city = city }

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    @JsonProperty("state") fun state(state: String) = apply { this.state = state }

                    /** The ZIP code of the address. */
                    @JsonProperty("zip") fun zip(zip: String) = apply { this.zip = zip }

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
                            checkNotNull(line1) { "`line1` is required but was not set" },
                            line2,
                            checkNotNull(city) { "`city` is required but was not set" },
                            checkNotNull(state) { "`state` is required but was not set" },
                            checkNotNull(zip) { "`zip` is required but was not set" },
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /** A means of verifying the person's identity. */
            @JsonDeserialize(builder = Identification.Builder::class)
            @NoAutoDetect
            class Identification
            private constructor(
                private val method: Method?,
                private val number: String?,
                private val passport: Passport?,
                private val driversLicense: DriversLicense?,
                private val other: Other?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var hashCode: Int = 0

                /** A method that can be used to verify the individual's identity. */
                @JsonProperty("method") fun method(): Method? = method

                /**
                 * An identification number that can be used to verify the individual's identity,
                 * such as a social security number.
                 */
                @JsonProperty("number") fun number(): String? = number

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                @JsonProperty("passport") fun passport(): Passport? = passport

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                @JsonProperty("drivers_license")
                fun driversLicense(): DriversLicense? = driversLicense

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                @JsonProperty("other") fun other(): Other? = other

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Identification &&
                        this.method == other.method &&
                        this.number == other.number &&
                        this.passport == other.passport &&
                        this.driversLicense == other.driversLicense &&
                        this.other == other.other &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                method,
                                number,
                                passport,
                                driversLicense,
                                other,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Identification{method=$method, number=$number, passport=$passport, driversLicense=$driversLicense, other=$other, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var method: Method? = null
                    private var number: String? = null
                    private var passport: Passport? = null
                    private var driversLicense: DriversLicense? = null
                    private var other: Other? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(identification: Identification) = apply {
                        this.method = identification.method
                        this.number = identification.number
                        this.passport = identification.passport
                        this.driversLicense = identification.driversLicense
                        this.other = identification.other
                        additionalProperties(identification.additionalProperties)
                    }

                    /** A method that can be used to verify the individual's identity. */
                    @JsonProperty("method")
                    fun method(method: Method) = apply { this.method = method }

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     */
                    @JsonProperty("number")
                    fun number(number: String) = apply { this.number = number }

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    @JsonProperty("passport")
                    fun passport(passport: Passport) = apply { this.passport = passport }

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    @JsonProperty("drivers_license")
                    fun driversLicense(driversLicense: DriversLicense) = apply {
                        this.driversLicense = driversLicense
                    }

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    @JsonProperty("other") fun other(other: Other) = apply { this.other = other }

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
                            checkNotNull(method) { "`method` is required but was not set" },
                            checkNotNull(number) { "`number` is required but was not set" },
                            passport,
                            driversLicense,
                            other,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Method
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

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

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                @JsonDeserialize(builder = DriversLicense.Builder::class)
                @NoAutoDetect
                class DriversLicense
                private constructor(
                    private val fileId: String?,
                    private val backFileId: String?,
                    private val expirationDate: LocalDate?,
                    private val state: String?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var hashCode: Int = 0

                    /** The identifier of the File containing the front of the driver's license. */
                    @JsonProperty("file_id") fun fileId(): String? = fileId

                    /** The identifier of the File containing the back of the driver's license. */
                    @JsonProperty("back_file_id") fun backFileId(): String? = backFileId

                    /** The driver's license's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(): LocalDate? = expirationDate

                    /** The state that issued the provided driver's license. */
                    @JsonProperty("state") fun state(): String? = state

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is DriversLicense &&
                            this.fileId == other.fileId &&
                            this.backFileId == other.backFileId &&
                            this.expirationDate == other.expirationDate &&
                            this.state == other.state &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    fileId,
                                    backFileId,
                                    expirationDate,
                                    state,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "DriversLicense{fileId=$fileId, backFileId=$backFileId, expirationDate=$expirationDate, state=$state, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var fileId: String? = null
                        private var backFileId: String? = null
                        private var expirationDate: LocalDate? = null
                        private var state: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(driversLicense: DriversLicense) = apply {
                            this.fileId = driversLicense.fileId
                            this.backFileId = driversLicense.backFileId
                            this.expirationDate = driversLicense.expirationDate
                            this.state = driversLicense.state
                            additionalProperties(driversLicense.additionalProperties)
                        }

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        @JsonProperty("file_id")
                        fun fileId(fileId: String) = apply { this.fileId = fileId }

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        @JsonProperty("back_file_id")
                        fun backFileId(backFileId: String) = apply { this.backFileId = backFileId }

                        /** The driver's license's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(expirationDate: LocalDate) = apply {
                            this.expirationDate = expirationDate
                        }

                        /** The state that issued the provided driver's license. */
                        @JsonProperty("state")
                        fun state(state: String) = apply { this.state = state }

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

                        fun build(): DriversLicense =
                            DriversLicense(
                                checkNotNull(fileId) { "`fileId` is required but was not set" },
                                backFileId,
                                checkNotNull(expirationDate) {
                                    "`expirationDate` is required but was not set"
                                },
                                checkNotNull(state) { "`state` is required but was not set" },
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                @JsonDeserialize(builder = Other.Builder::class)
                @NoAutoDetect
                class Other
                private constructor(
                    private val country: String?,
                    private val description: String?,
                    private val expirationDate: LocalDate?,
                    private val fileId: String?,
                    private val backFileId: String?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var hashCode: Int = 0

                    /**
                     * The two-character ISO 3166-1 code representing the country that issued the
                     * document.
                     */
                    @JsonProperty("country") fun country(): String? = country

                    /** A description of the document submitted. */
                    @JsonProperty("description") fun description(): String? = description

                    /** The document's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(): LocalDate? = expirationDate

                    /** The identifier of the File containing the front of the document. */
                    @JsonProperty("file_id") fun fileId(): String? = fileId

                    /**
                     * The identifier of the File containing the back of the document. Not every
                     * document has a reverse side.
                     */
                    @JsonProperty("back_file_id") fun backFileId(): String? = backFileId

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Other &&
                            this.country == other.country &&
                            this.description == other.description &&
                            this.expirationDate == other.expirationDate &&
                            this.fileId == other.fileId &&
                            this.backFileId == other.backFileId &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    country,
                                    description,
                                    expirationDate,
                                    fileId,
                                    backFileId,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Other{country=$country, description=$description, expirationDate=$expirationDate, fileId=$fileId, backFileId=$backFileId, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var country: String? = null
                        private var description: String? = null
                        private var expirationDate: LocalDate? = null
                        private var fileId: String? = null
                        private var backFileId: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(other: Other) = apply {
                            this.country = other.country
                            this.description = other.description
                            this.expirationDate = other.expirationDate
                            this.fileId = other.fileId
                            this.backFileId = other.backFileId
                            additionalProperties(other.additionalProperties)
                        }

                        /**
                         * The two-character ISO 3166-1 code representing the country that issued
                         * the document.
                         */
                        @JsonProperty("country")
                        fun country(country: String) = apply { this.country = country }

                        /** A description of the document submitted. */
                        @JsonProperty("description")
                        fun description(description: String) = apply {
                            this.description = description
                        }

                        /** The document's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(expirationDate: LocalDate) = apply {
                            this.expirationDate = expirationDate
                        }

                        /** The identifier of the File containing the front of the document. */
                        @JsonProperty("file_id")
                        fun fileId(fileId: String) = apply { this.fileId = fileId }

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        @JsonProperty("back_file_id")
                        fun backFileId(backFileId: String) = apply { this.backFileId = backFileId }

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

                        fun build(): Other =
                            Other(
                                checkNotNull(country) { "`country` is required but was not set" },
                                checkNotNull(description) {
                                    "`description` is required but was not set"
                                },
                                expirationDate,
                                checkNotNull(fileId) { "`fileId` is required but was not set" },
                                backFileId,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                @JsonDeserialize(builder = Passport.Builder::class)
                @NoAutoDetect
                class Passport
                private constructor(
                    private val fileId: String?,
                    private val expirationDate: LocalDate?,
                    private val country: String?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var hashCode: Int = 0

                    /** The identifier of the File containing the passport. */
                    @JsonProperty("file_id") fun fileId(): String? = fileId

                    /** The passport's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(): LocalDate? = expirationDate

                    /** The country that issued the passport. */
                    @JsonProperty("country") fun country(): String? = country

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Passport &&
                            this.fileId == other.fileId &&
                            this.expirationDate == other.expirationDate &&
                            this.country == other.country &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    fileId,
                                    expirationDate,
                                    country,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Passport{fileId=$fileId, expirationDate=$expirationDate, country=$country, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var fileId: String? = null
                        private var expirationDate: LocalDate? = null
                        private var country: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(passport: Passport) = apply {
                            this.fileId = passport.fileId
                            this.expirationDate = passport.expirationDate
                            this.country = passport.country
                            additionalProperties(passport.additionalProperties)
                        }

                        /** The identifier of the File containing the passport. */
                        @JsonProperty("file_id")
                        fun fileId(fileId: String) = apply { this.fileId = fileId }

                        /** The passport's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(expirationDate: LocalDate) = apply {
                            this.expirationDate = expirationDate
                        }

                        /** The country that issued the passport. */
                        @JsonProperty("country")
                        fun country(country: String) = apply { this.country = country }

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

                        fun build(): Passport =
                            Passport(
                                checkNotNull(fileId) { "`fileId` is required but was not set" },
                                checkNotNull(expirationDate) {
                                    "`expirationDate` is required but was not set"
                                },
                                checkNotNull(country) { "`country` is required but was not set" },
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }
            }
        }
    }

    /**
     * Details of the natural person entity to create. Required if `structure` is equal to
     * `natural_person`. Natural people entities should be submitted with `social_security_number`
     * or `individual_taxpayer_identification_number` identification methods.
     */
    @JsonDeserialize(builder = NaturalPerson.Builder::class)
    @NoAutoDetect
    class NaturalPerson
    private constructor(
        private val name: String?,
        private val dateOfBirth: LocalDate?,
        private val address: Address?,
        private val confirmedNoUsTaxId: Boolean?,
        private val identification: Identification?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The person's legal name. */
        @JsonProperty("name") fun name(): String? = name

        /** The person's date of birth in YYYY-MM-DD format. */
        @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate? = dateOfBirth

        /** The individual's physical address. Post Office Boxes are disallowed. */
        @JsonProperty("address") fun address(): Address? = address

        /**
         * The identification method for an individual can only be a passport, driver's license, or
         * other document if you've confirmed the individual does not have a US tax id (either a
         * Social Security Number or Individual Taxpayer Identification Number).
         */
        @JsonProperty("confirmed_no_us_tax_id")
        fun confirmedNoUsTaxId(): Boolean? = confirmedNoUsTaxId

        /** A means of verifying the person's identity. */
        @JsonProperty("identification") fun identification(): Identification? = identification

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is NaturalPerson &&
                this.name == other.name &&
                this.dateOfBirth == other.dateOfBirth &&
                this.address == other.address &&
                this.confirmedNoUsTaxId == other.confirmedNoUsTaxId &&
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
                        confirmedNoUsTaxId,
                        identification,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "NaturalPerson{name=$name, dateOfBirth=$dateOfBirth, address=$address, confirmedNoUsTaxId=$confirmedNoUsTaxId, identification=$identification, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var dateOfBirth: LocalDate? = null
            private var address: Address? = null
            private var confirmedNoUsTaxId: Boolean? = null
            private var identification: Identification? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(naturalPerson: NaturalPerson) = apply {
                this.name = naturalPerson.name
                this.dateOfBirth = naturalPerson.dateOfBirth
                this.address = naturalPerson.address
                this.confirmedNoUsTaxId = naturalPerson.confirmedNoUsTaxId
                this.identification = naturalPerson.identification
                additionalProperties(naturalPerson.additionalProperties)
            }

            /** The person's legal name. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** The person's date of birth in YYYY-MM-DD format. */
            @JsonProperty("date_of_birth")
            fun dateOfBirth(dateOfBirth: LocalDate) = apply { this.dateOfBirth = dateOfBirth }

            /** The individual's physical address. Post Office Boxes are disallowed. */
            @JsonProperty("address")
            fun address(address: Address) = apply { this.address = address }

            /**
             * The identification method for an individual can only be a passport, driver's license,
             * or other document if you've confirmed the individual does not have a US tax id
             * (either a Social Security Number or Individual Taxpayer Identification Number).
             */
            @JsonProperty("confirmed_no_us_tax_id")
            fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean) = apply {
                this.confirmedNoUsTaxId = confirmedNoUsTaxId
            }

            /** A means of verifying the person's identity. */
            @JsonProperty("identification")
            fun identification(identification: Identification) = apply {
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
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(dateOfBirth) { "`dateOfBirth` is required but was not set" },
                    checkNotNull(address) { "`address` is required but was not set" },
                    confirmedNoUsTaxId,
                    checkNotNull(identification) { "`identification` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** The individual's physical address. Post Office Boxes are disallowed. */
        @JsonDeserialize(builder = Address.Builder::class)
        @NoAutoDetect
        class Address
        private constructor(
            private val line1: String?,
            private val line2: String?,
            private val city: String?,
            private val state: String?,
            private val zip: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /** The first line of the address. This is usually the street number and street. */
            @JsonProperty("line1") fun line1(): String? = line1

            /** The second line of the address. This might be the floor or room number. */
            @JsonProperty("line2") fun line2(): String? = line2

            /** The city of the address. */
            @JsonProperty("city") fun city(): String? = city

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") fun state(): String? = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") fun zip(): String? = zip

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                private var line1: String? = null
                private var line2: String? = null
                private var city: String? = null
                private var state: String? = null
                private var zip: String? = null
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

                /** The first line of the address. This is usually the street number and street. */
                @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

                /** The second line of the address. This might be the floor or room number. */
                @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

                /** The city of the address. */
                @JsonProperty("city") fun city(city: String) = apply { this.city = city }

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                @JsonProperty("state") fun state(state: String) = apply { this.state = state }

                /** The ZIP code of the address. */
                @JsonProperty("zip") fun zip(zip: String) = apply { this.zip = zip }

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
                        checkNotNull(line1) { "`line1` is required but was not set" },
                        line2,
                        checkNotNull(city) { "`city` is required but was not set" },
                        checkNotNull(state) { "`state` is required but was not set" },
                        checkNotNull(zip) { "`zip` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /** A means of verifying the person's identity. */
        @JsonDeserialize(builder = Identification.Builder::class)
        @NoAutoDetect
        class Identification
        private constructor(
            private val method: Method?,
            private val number: String?,
            private val passport: Passport?,
            private val driversLicense: DriversLicense?,
            private val other: Other?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /** A method that can be used to verify the individual's identity. */
            @JsonProperty("method") fun method(): Method? = method

            /**
             * An identification number that can be used to verify the individual's identity, such
             * as a social security number.
             */
            @JsonProperty("number") fun number(): String? = number

            /**
             * Information about the passport used for identification. Required if `method` is equal
             * to `passport`.
             */
            @JsonProperty("passport") fun passport(): Passport? = passport

            /**
             * Information about the United States driver's license used for identification.
             * Required if `method` is equal to `drivers_license`.
             */
            @JsonProperty("drivers_license") fun driversLicense(): DriversLicense? = driversLicense

            /**
             * Information about the identification document provided. Required if `method` is equal
             * to `other`.
             */
            @JsonProperty("other") fun other(): Other? = other

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Identification &&
                    this.method == other.method &&
                    this.number == other.number &&
                    this.passport == other.passport &&
                    this.driversLicense == other.driversLicense &&
                    this.other == other.other &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            method,
                            number,
                            passport,
                            driversLicense,
                            other,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Identification{method=$method, number=$number, passport=$passport, driversLicense=$driversLicense, other=$other, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var method: Method? = null
                private var number: String? = null
                private var passport: Passport? = null
                private var driversLicense: DriversLicense? = null
                private var other: Other? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(identification: Identification) = apply {
                    this.method = identification.method
                    this.number = identification.number
                    this.passport = identification.passport
                    this.driversLicense = identification.driversLicense
                    this.other = identification.other
                    additionalProperties(identification.additionalProperties)
                }

                /** A method that can be used to verify the individual's identity. */
                @JsonProperty("method") fun method(method: Method) = apply { this.method = method }

                /**
                 * An identification number that can be used to verify the individual's identity,
                 * such as a social security number.
                 */
                @JsonProperty("number") fun number(number: String) = apply { this.number = number }

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                @JsonProperty("passport")
                fun passport(passport: Passport) = apply { this.passport = passport }

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                @JsonProperty("drivers_license")
                fun driversLicense(driversLicense: DriversLicense) = apply {
                    this.driversLicense = driversLicense
                }

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                @JsonProperty("other") fun other(other: Other) = apply { this.other = other }

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
                        checkNotNull(method) { "`method` is required but was not set" },
                        checkNotNull(number) { "`number` is required but was not set" },
                        passport,
                        driversLicense,
                        other,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Method
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

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

            /**
             * Information about the United States driver's license used for identification.
             * Required if `method` is equal to `drivers_license`.
             */
            @JsonDeserialize(builder = DriversLicense.Builder::class)
            @NoAutoDetect
            class DriversLicense
            private constructor(
                private val fileId: String?,
                private val backFileId: String?,
                private val expirationDate: LocalDate?,
                private val state: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var hashCode: Int = 0

                /** The identifier of the File containing the front of the driver's license. */
                @JsonProperty("file_id") fun fileId(): String? = fileId

                /** The identifier of the File containing the back of the driver's license. */
                @JsonProperty("back_file_id") fun backFileId(): String? = backFileId

                /** The driver's license's expiration date in YYYY-MM-DD format. */
                @JsonProperty("expiration_date") fun expirationDate(): LocalDate? = expirationDate

                /** The state that issued the provided driver's license. */
                @JsonProperty("state") fun state(): String? = state

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is DriversLicense &&
                        this.fileId == other.fileId &&
                        this.backFileId == other.backFileId &&
                        this.expirationDate == other.expirationDate &&
                        this.state == other.state &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                fileId,
                                backFileId,
                                expirationDate,
                                state,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "DriversLicense{fileId=$fileId, backFileId=$backFileId, expirationDate=$expirationDate, state=$state, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var fileId: String? = null
                    private var backFileId: String? = null
                    private var expirationDate: LocalDate? = null
                    private var state: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(driversLicense: DriversLicense) = apply {
                        this.fileId = driversLicense.fileId
                        this.backFileId = driversLicense.backFileId
                        this.expirationDate = driversLicense.expirationDate
                        this.state = driversLicense.state
                        additionalProperties(driversLicense.additionalProperties)
                    }

                    /** The identifier of the File containing the front of the driver's license. */
                    @JsonProperty("file_id")
                    fun fileId(fileId: String) = apply { this.fileId = fileId }

                    /** The identifier of the File containing the back of the driver's license. */
                    @JsonProperty("back_file_id")
                    fun backFileId(backFileId: String) = apply { this.backFileId = backFileId }

                    /** The driver's license's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(expirationDate: LocalDate) = apply {
                        this.expirationDate = expirationDate
                    }

                    /** The state that issued the provided driver's license. */
                    @JsonProperty("state") fun state(state: String) = apply { this.state = state }

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

                    fun build(): DriversLicense =
                        DriversLicense(
                            checkNotNull(fileId) { "`fileId` is required but was not set" },
                            backFileId,
                            checkNotNull(expirationDate) {
                                "`expirationDate` is required but was not set"
                            },
                            checkNotNull(state) { "`state` is required but was not set" },
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /**
             * Information about the identification document provided. Required if `method` is equal
             * to `other`.
             */
            @JsonDeserialize(builder = Other.Builder::class)
            @NoAutoDetect
            class Other
            private constructor(
                private val country: String?,
                private val description: String?,
                private val expirationDate: LocalDate?,
                private val fileId: String?,
                private val backFileId: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var hashCode: Int = 0

                /**
                 * The two-character ISO 3166-1 code representing the country that issued the
                 * document.
                 */
                @JsonProperty("country") fun country(): String? = country

                /** A description of the document submitted. */
                @JsonProperty("description") fun description(): String? = description

                /** The document's expiration date in YYYY-MM-DD format. */
                @JsonProperty("expiration_date") fun expirationDate(): LocalDate? = expirationDate

                /** The identifier of the File containing the front of the document. */
                @JsonProperty("file_id") fun fileId(): String? = fileId

                /**
                 * The identifier of the File containing the back of the document. Not every
                 * document has a reverse side.
                 */
                @JsonProperty("back_file_id") fun backFileId(): String? = backFileId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Other &&
                        this.country == other.country &&
                        this.description == other.description &&
                        this.expirationDate == other.expirationDate &&
                        this.fileId == other.fileId &&
                        this.backFileId == other.backFileId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                country,
                                description,
                                expirationDate,
                                fileId,
                                backFileId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Other{country=$country, description=$description, expirationDate=$expirationDate, fileId=$fileId, backFileId=$backFileId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var country: String? = null
                    private var description: String? = null
                    private var expirationDate: LocalDate? = null
                    private var fileId: String? = null
                    private var backFileId: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(other: Other) = apply {
                        this.country = other.country
                        this.description = other.description
                        this.expirationDate = other.expirationDate
                        this.fileId = other.fileId
                        this.backFileId = other.backFileId
                        additionalProperties(other.additionalProperties)
                    }

                    /**
                     * The two-character ISO 3166-1 code representing the country that issued the
                     * document.
                     */
                    @JsonProperty("country")
                    fun country(country: String) = apply { this.country = country }

                    /** A description of the document submitted. */
                    @JsonProperty("description")
                    fun description(description: String) = apply { this.description = description }

                    /** The document's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(expirationDate: LocalDate) = apply {
                        this.expirationDate = expirationDate
                    }

                    /** The identifier of the File containing the front of the document. */
                    @JsonProperty("file_id")
                    fun fileId(fileId: String) = apply { this.fileId = fileId }

                    /**
                     * The identifier of the File containing the back of the document. Not every
                     * document has a reverse side.
                     */
                    @JsonProperty("back_file_id")
                    fun backFileId(backFileId: String) = apply { this.backFileId = backFileId }

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

                    fun build(): Other =
                        Other(
                            checkNotNull(country) { "`country` is required but was not set" },
                            checkNotNull(description) {
                                "`description` is required but was not set"
                            },
                            expirationDate,
                            checkNotNull(fileId) { "`fileId` is required but was not set" },
                            backFileId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /**
             * Information about the passport used for identification. Required if `method` is equal
             * to `passport`.
             */
            @JsonDeserialize(builder = Passport.Builder::class)
            @NoAutoDetect
            class Passport
            private constructor(
                private val fileId: String?,
                private val expirationDate: LocalDate?,
                private val country: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var hashCode: Int = 0

                /** The identifier of the File containing the passport. */
                @JsonProperty("file_id") fun fileId(): String? = fileId

                /** The passport's expiration date in YYYY-MM-DD format. */
                @JsonProperty("expiration_date") fun expirationDate(): LocalDate? = expirationDate

                /** The country that issued the passport. */
                @JsonProperty("country") fun country(): String? = country

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Passport &&
                        this.fileId == other.fileId &&
                        this.expirationDate == other.expirationDate &&
                        this.country == other.country &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                fileId,
                                expirationDate,
                                country,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Passport{fileId=$fileId, expirationDate=$expirationDate, country=$country, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var fileId: String? = null
                    private var expirationDate: LocalDate? = null
                    private var country: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(passport: Passport) = apply {
                        this.fileId = passport.fileId
                        this.expirationDate = passport.expirationDate
                        this.country = passport.country
                        additionalProperties(passport.additionalProperties)
                    }

                    /** The identifier of the File containing the passport. */
                    @JsonProperty("file_id")
                    fun fileId(fileId: String) = apply { this.fileId = fileId }

                    /** The passport's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(expirationDate: LocalDate) = apply {
                        this.expirationDate = expirationDate
                    }

                    /** The country that issued the passport. */
                    @JsonProperty("country")
                    fun country(country: String) = apply { this.country = country }

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

                    fun build(): Passport =
                        Passport(
                            checkNotNull(fileId) { "`fileId` is required but was not set" },
                            checkNotNull(expirationDate) {
                                "`expirationDate` is required but was not set"
                            },
                            checkNotNull(country) { "`country` is required but was not set" },
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }
        }
    }

    @JsonDeserialize(builder = SupplementalDocument.Builder::class)
    @NoAutoDetect
    class SupplementalDocument
    private constructor(
        private val fileId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The identifier of the File containing the document. */
        @JsonProperty("file_id") fun fileId(): String? = fileId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SupplementalDocument &&
                this.fileId == other.fileId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(fileId, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "SupplementalDocument{fileId=$fileId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var fileId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(supplementalDocument: SupplementalDocument) = apply {
                this.fileId = supplementalDocument.fileId
                additionalProperties(supplementalDocument.additionalProperties)
            }

            /** The identifier of the File containing the document. */
            @JsonProperty("file_id") fun fileId(fileId: String) = apply { this.fileId = fileId }

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

            fun build(): SupplementalDocument =
                SupplementalDocument(
                    checkNotNull(fileId) { "`fileId` is required but was not set" },
                    additionalProperties.toUnmodifiable()
                )
        }
    }

    /** Details of the trust entity to create. Required if `structure` is equal to `trust`. */
    @JsonDeserialize(builder = Trust.Builder::class)
    @NoAutoDetect
    class Trust
    private constructor(
        private val name: String?,
        private val category: Category?,
        private val taxIdentifier: String?,
        private val formationState: String?,
        private val address: Address?,
        private val formationDocumentFileId: String?,
        private val trustees: List<Trustee>?,
        private val grantor: Grantor?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The legal name of the trust. */
        @JsonProperty("name") fun name(): String? = name

        /**
         * Whether the trust is `revocable` or `irrevocable`. Irrevocable trusts require their own
         * Employer Identification Number. Revocable trusts require information about the individual
         * `grantor` who created the trust.
         */
        @JsonProperty("category") fun category(): Category? = category

        /**
         * The Employer Identification Number (EIN) for the trust. Required if `category` is equal
         * to `irrevocable`.
         */
        @JsonProperty("tax_identifier") fun taxIdentifier(): String? = taxIdentifier

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the state in which
         * the trust was formed.
         */
        @JsonProperty("formation_state") fun formationState(): String? = formationState

        /** The trust's physical address. Post Office Boxes are disallowed. */
        @JsonProperty("address") fun address(): Address? = address

        /** The identifier of the File containing the formation document of the trust. */
        @JsonProperty("formation_document_file_id")
        fun formationDocumentFileId(): String? = formationDocumentFileId

        /** The trustees of the trust. */
        @JsonProperty("trustees") fun trustees(): List<Trustee>? = trustees

        /** The grantor of the trust. Required if `category` is equal to `revocable`. */
        @JsonProperty("grantor") fun grantor(): Grantor? = grantor

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Trust &&
                this.name == other.name &&
                this.category == other.category &&
                this.taxIdentifier == other.taxIdentifier &&
                this.formationState == other.formationState &&
                this.address == other.address &&
                this.formationDocumentFileId == other.formationDocumentFileId &&
                this.trustees == other.trustees &&
                this.grantor == other.grantor &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        category,
                        taxIdentifier,
                        formationState,
                        address,
                        formationDocumentFileId,
                        trustees,
                        grantor,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Trust{name=$name, category=$category, taxIdentifier=$taxIdentifier, formationState=$formationState, address=$address, formationDocumentFileId=$formationDocumentFileId, trustees=$trustees, grantor=$grantor, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var category: Category? = null
            private var taxIdentifier: String? = null
            private var formationState: String? = null
            private var address: Address? = null
            private var formationDocumentFileId: String? = null
            private var trustees: List<Trustee>? = null
            private var grantor: Grantor? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trust: Trust) = apply {
                this.name = trust.name
                this.category = trust.category
                this.taxIdentifier = trust.taxIdentifier
                this.formationState = trust.formationState
                this.address = trust.address
                this.formationDocumentFileId = trust.formationDocumentFileId
                this.trustees = trust.trustees
                this.grantor = trust.grantor
                additionalProperties(trust.additionalProperties)
            }

            /** The legal name of the trust. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * Whether the trust is `revocable` or `irrevocable`. Irrevocable trusts require their
             * own Employer Identification Number. Revocable trusts require information about the
             * individual `grantor` who created the trust.
             */
            @JsonProperty("category")
            fun category(category: Category) = apply { this.category = category }

            /**
             * The Employer Identification Number (EIN) for the trust. Required if `category` is
             * equal to `irrevocable`.
             */
            @JsonProperty("tax_identifier")
            fun taxIdentifier(taxIdentifier: String) = apply { this.taxIdentifier = taxIdentifier }

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state in
             * which the trust was formed.
             */
            @JsonProperty("formation_state")
            fun formationState(formationState: String) = apply {
                this.formationState = formationState
            }

            /** The trust's physical address. Post Office Boxes are disallowed. */
            @JsonProperty("address")
            fun address(address: Address) = apply { this.address = address }

            /** The identifier of the File containing the formation document of the trust. */
            @JsonProperty("formation_document_file_id")
            fun formationDocumentFileId(formationDocumentFileId: String) = apply {
                this.formationDocumentFileId = formationDocumentFileId
            }

            /** The trustees of the trust. */
            @JsonProperty("trustees")
            fun trustees(trustees: List<Trustee>) = apply { this.trustees = trustees }

            /** The grantor of the trust. Required if `category` is equal to `revocable`. */
            @JsonProperty("grantor")
            fun grantor(grantor: Grantor) = apply { this.grantor = grantor }

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
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(category) { "`category` is required but was not set" },
                    taxIdentifier,
                    formationState,
                    checkNotNull(address) { "`address` is required but was not set" },
                    formationDocumentFileId,
                    checkNotNull(trustees) { "`trustees` is required but was not set" }
                        .toUnmodifiable(),
                    grantor,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** The trust's physical address. Post Office Boxes are disallowed. */
        @JsonDeserialize(builder = Address.Builder::class)
        @NoAutoDetect
        class Address
        private constructor(
            private val line1: String?,
            private val line2: String?,
            private val city: String?,
            private val state: String?,
            private val zip: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /** The first line of the address. This is usually the street number and street. */
            @JsonProperty("line1") fun line1(): String? = line1

            /** The second line of the address. This might be the floor or room number. */
            @JsonProperty("line2") fun line2(): String? = line2

            /** The city of the address. */
            @JsonProperty("city") fun city(): String? = city

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") fun state(): String? = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") fun zip(): String? = zip

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                private var line1: String? = null
                private var line2: String? = null
                private var city: String? = null
                private var state: String? = null
                private var zip: String? = null
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

                /** The first line of the address. This is usually the street number and street. */
                @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

                /** The second line of the address. This might be the floor or room number. */
                @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

                /** The city of the address. */
                @JsonProperty("city") fun city(city: String) = apply { this.city = city }

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                @JsonProperty("state") fun state(state: String) = apply { this.state = state }

                /** The ZIP code of the address. */
                @JsonProperty("zip") fun zip(zip: String) = apply { this.zip = zip }

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
                        checkNotNull(line1) { "`line1` is required but was not set" },
                        line2,
                        checkNotNull(city) { "`city` is required but was not set" },
                        checkNotNull(state) { "`state` is required but was not set" },
                        checkNotNull(zip) { "`zip` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class Category
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

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

        @JsonDeserialize(builder = Trustee.Builder::class)
        @NoAutoDetect
        class Trustee
        private constructor(
            private val structure: Structure?,
            private val individual: Individual?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /** The structure of the trustee. */
            @JsonProperty("structure") fun structure(): Structure? = structure

            /**
             * Details of the individual trustee. Required when the trustee `structure` is equal to
             * `individual`.
             */
            @JsonProperty("individual") fun individual(): Individual? = individual

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                private var structure: Structure? = null
                private var individual: Individual? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(trustee: Trustee) = apply {
                    this.structure = trustee.structure
                    this.individual = trustee.individual
                    additionalProperties(trustee.additionalProperties)
                }

                /** The structure of the trustee. */
                @JsonProperty("structure")
                fun structure(structure: Structure) = apply { this.structure = structure }

                /**
                 * Details of the individual trustee. Required when the trustee `structure` is equal
                 * to `individual`.
                 */
                @JsonProperty("individual")
                fun individual(individual: Individual) = apply { this.individual = individual }

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
                        checkNotNull(structure) { "`structure` is required but was not set" },
                        individual,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Structure
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

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

            /**
             * Details of the individual trustee. Required when the trustee `structure` is equal to
             * `individual`.
             */
            @JsonDeserialize(builder = Individual.Builder::class)
            @NoAutoDetect
            class Individual
            private constructor(
                private val name: String?,
                private val dateOfBirth: LocalDate?,
                private val address: Address?,
                private val confirmedNoUsTaxId: Boolean?,
                private val identification: Identification?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var hashCode: Int = 0

                /** The person's legal name. */
                @JsonProperty("name") fun name(): String? = name

                /** The person's date of birth in YYYY-MM-DD format. */
                @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate? = dateOfBirth

                /** The individual's physical address. Post Office Boxes are disallowed. */
                @JsonProperty("address") fun address(): Address? = address

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                @JsonProperty("confirmed_no_us_tax_id")
                fun confirmedNoUsTaxId(): Boolean? = confirmedNoUsTaxId

                /** A means of verifying the person's identity. */
                @JsonProperty("identification")
                fun identification(): Identification? = identification

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        this.name == other.name &&
                        this.dateOfBirth == other.dateOfBirth &&
                        this.address == other.address &&
                        this.confirmedNoUsTaxId == other.confirmedNoUsTaxId &&
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
                                confirmedNoUsTaxId,
                                identification,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Individual{name=$name, dateOfBirth=$dateOfBirth, address=$address, confirmedNoUsTaxId=$confirmedNoUsTaxId, identification=$identification, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var name: String? = null
                    private var dateOfBirth: LocalDate? = null
                    private var address: Address? = null
                    private var confirmedNoUsTaxId: Boolean? = null
                    private var identification: Identification? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(individual: Individual) = apply {
                        this.name = individual.name
                        this.dateOfBirth = individual.dateOfBirth
                        this.address = individual.address
                        this.confirmedNoUsTaxId = individual.confirmedNoUsTaxId
                        this.identification = individual.identification
                        additionalProperties(individual.additionalProperties)
                    }

                    /** The person's legal name. */
                    @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                    /** The person's date of birth in YYYY-MM-DD format. */
                    @JsonProperty("date_of_birth")
                    fun dateOfBirth(dateOfBirth: LocalDate) = apply {
                        this.dateOfBirth = dateOfBirth
                    }

                    /** The individual's physical address. Post Office Boxes are disallowed. */
                    @JsonProperty("address")
                    fun address(address: Address) = apply { this.address = address }

                    /**
                     * The identification method for an individual can only be a passport, driver's
                     * license, or other document if you've confirmed the individual does not have a
                     * US tax id (either a Social Security Number or Individual Taxpayer
                     * Identification Number).
                     */
                    @JsonProperty("confirmed_no_us_tax_id")
                    fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean) = apply {
                        this.confirmedNoUsTaxId = confirmedNoUsTaxId
                    }

                    /** A means of verifying the person's identity. */
                    @JsonProperty("identification")
                    fun identification(identification: Identification) = apply {
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
                            checkNotNull(name) { "`name` is required but was not set" },
                            checkNotNull(dateOfBirth) {
                                "`dateOfBirth` is required but was not set"
                            },
                            checkNotNull(address) { "`address` is required but was not set" },
                            confirmedNoUsTaxId,
                            checkNotNull(identification) {
                                "`identification` is required but was not set"
                            },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /** The individual's physical address. Post Office Boxes are disallowed. */
                @JsonDeserialize(builder = Address.Builder::class)
                @NoAutoDetect
                class Address
                private constructor(
                    private val line1: String?,
                    private val line2: String?,
                    private val city: String?,
                    private val state: String?,
                    private val zip: String?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var hashCode: Int = 0

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    @JsonProperty("line1") fun line1(): String? = line1

                    /** The second line of the address. This might be the floor or room number. */
                    @JsonProperty("line2") fun line2(): String? = line2

                    /** The city of the address. */
                    @JsonProperty("city") fun city(): String? = city

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    @JsonProperty("state") fun state(): String? = state

                    /** The ZIP code of the address. */
                    @JsonProperty("zip") fun zip(): String? = zip

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                        private var line1: String? = null
                        private var line2: String? = null
                        private var city: String? = null
                        private var state: String? = null
                        private var zip: String? = null
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

                        /**
                         * The first line of the address. This is usually the street number and
                         * street.
                         */
                        @JsonProperty("line1")
                        fun line1(line1: String) = apply { this.line1 = line1 }

                        /**
                         * The second line of the address. This might be the floor or room number.
                         */
                        @JsonProperty("line2")
                        fun line2(line2: String) = apply { this.line2 = line2 }

                        /** The city of the address. */
                        @JsonProperty("city") fun city(city: String) = apply { this.city = city }

                        /**
                         * The two-letter United States Postal Service (USPS) abbreviation for the
                         * state of the address.
                         */
                        @JsonProperty("state")
                        fun state(state: String) = apply { this.state = state }

                        /** The ZIP code of the address. */
                        @JsonProperty("zip") fun zip(zip: String) = apply { this.zip = zip }

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
                                checkNotNull(line1) { "`line1` is required but was not set" },
                                line2,
                                checkNotNull(city) { "`city` is required but was not set" },
                                checkNotNull(state) { "`state` is required but was not set" },
                                checkNotNull(zip) { "`zip` is required but was not set" },
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }

                /** A means of verifying the person's identity. */
                @JsonDeserialize(builder = Identification.Builder::class)
                @NoAutoDetect
                class Identification
                private constructor(
                    private val method: Method?,
                    private val number: String?,
                    private val passport: Passport?,
                    private val driversLicense: DriversLicense?,
                    private val other: Other?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var hashCode: Int = 0

                    /** A method that can be used to verify the individual's identity. */
                    @JsonProperty("method") fun method(): Method? = method

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     */
                    @JsonProperty("number") fun number(): String? = number

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    @JsonProperty("passport") fun passport(): Passport? = passport

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    @JsonProperty("drivers_license")
                    fun driversLicense(): DriversLicense? = driversLicense

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    @JsonProperty("other") fun other(): Other? = other

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Identification &&
                            this.method == other.method &&
                            this.number == other.number &&
                            this.passport == other.passport &&
                            this.driversLicense == other.driversLicense &&
                            this.other == other.other &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    method,
                                    number,
                                    passport,
                                    driversLicense,
                                    other,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Identification{method=$method, number=$number, passport=$passport, driversLicense=$driversLicense, other=$other, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var method: Method? = null
                        private var number: String? = null
                        private var passport: Passport? = null
                        private var driversLicense: DriversLicense? = null
                        private var other: Other? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(identification: Identification) = apply {
                            this.method = identification.method
                            this.number = identification.number
                            this.passport = identification.passport
                            this.driversLicense = identification.driversLicense
                            this.other = identification.other
                            additionalProperties(identification.additionalProperties)
                        }

                        /** A method that can be used to verify the individual's identity. */
                        @JsonProperty("method")
                        fun method(method: Method) = apply { this.method = method }

                        /**
                         * An identification number that can be used to verify the individual's
                         * identity, such as a social security number.
                         */
                        @JsonProperty("number")
                        fun number(number: String) = apply { this.number = number }

                        /**
                         * Information about the passport used for identification. Required if
                         * `method` is equal to `passport`.
                         */
                        @JsonProperty("passport")
                        fun passport(passport: Passport) = apply { this.passport = passport }

                        /**
                         * Information about the United States driver's license used for
                         * identification. Required if `method` is equal to `drivers_license`.
                         */
                        @JsonProperty("drivers_license")
                        fun driversLicense(driversLicense: DriversLicense) = apply {
                            this.driversLicense = driversLicense
                        }

                        /**
                         * Information about the identification document provided. Required if
                         * `method` is equal to `other`.
                         */
                        @JsonProperty("other")
                        fun other(other: Other) = apply { this.other = other }

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
                                checkNotNull(method) { "`method` is required but was not set" },
                                checkNotNull(number) { "`number` is required but was not set" },
                                passport,
                                driversLicense,
                                other,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class Method
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

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

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    @JsonDeserialize(builder = DriversLicense.Builder::class)
                    @NoAutoDetect
                    class DriversLicense
                    private constructor(
                        private val fileId: String?,
                        private val backFileId: String?,
                        private val expirationDate: LocalDate?,
                        private val state: String?,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var hashCode: Int = 0

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        @JsonProperty("file_id") fun fileId(): String? = fileId

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        @JsonProperty("back_file_id") fun backFileId(): String? = backFileId

                        /** The driver's license's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(): LocalDate? = expirationDate

                        /** The state that issued the provided driver's license. */
                        @JsonProperty("state") fun state(): String? = state

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is DriversLicense &&
                                this.fileId == other.fileId &&
                                this.backFileId == other.backFileId &&
                                this.expirationDate == other.expirationDate &&
                                this.state == other.state &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        fileId,
                                        backFileId,
                                        expirationDate,
                                        state,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "DriversLicense{fileId=$fileId, backFileId=$backFileId, expirationDate=$expirationDate, state=$state, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var fileId: String? = null
                            private var backFileId: String? = null
                            private var expirationDate: LocalDate? = null
                            private var state: String? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(driversLicense: DriversLicense) = apply {
                                this.fileId = driversLicense.fileId
                                this.backFileId = driversLicense.backFileId
                                this.expirationDate = driversLicense.expirationDate
                                this.state = driversLicense.state
                                additionalProperties(driversLicense.additionalProperties)
                            }

                            /**
                             * The identifier of the File containing the front of the driver's
                             * license.
                             */
                            @JsonProperty("file_id")
                            fun fileId(fileId: String) = apply { this.fileId = fileId }

                            /**
                             * The identifier of the File containing the back of the driver's
                             * license.
                             */
                            @JsonProperty("back_file_id")
                            fun backFileId(backFileId: String) = apply {
                                this.backFileId = backFileId
                            }

                            /** The driver's license's expiration date in YYYY-MM-DD format. */
                            @JsonProperty("expiration_date")
                            fun expirationDate(expirationDate: LocalDate) = apply {
                                this.expirationDate = expirationDate
                            }

                            /** The state that issued the provided driver's license. */
                            @JsonProperty("state")
                            fun state(state: String) = apply { this.state = state }

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

                            fun build(): DriversLicense =
                                DriversLicense(
                                    checkNotNull(fileId) { "`fileId` is required but was not set" },
                                    backFileId,
                                    checkNotNull(expirationDate) {
                                        "`expirationDate` is required but was not set"
                                    },
                                    checkNotNull(state) { "`state` is required but was not set" },
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    @JsonDeserialize(builder = Other.Builder::class)
                    @NoAutoDetect
                    class Other
                    private constructor(
                        private val country: String?,
                        private val description: String?,
                        private val expirationDate: LocalDate?,
                        private val fileId: String?,
                        private val backFileId: String?,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var hashCode: Int = 0

                        /**
                         * The two-character ISO 3166-1 code representing the country that issued
                         * the document.
                         */
                        @JsonProperty("country") fun country(): String? = country

                        /** A description of the document submitted. */
                        @JsonProperty("description") fun description(): String? = description

                        /** The document's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(): LocalDate? = expirationDate

                        /** The identifier of the File containing the front of the document. */
                        @JsonProperty("file_id") fun fileId(): String? = fileId

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        @JsonProperty("back_file_id") fun backFileId(): String? = backFileId

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Other &&
                                this.country == other.country &&
                                this.description == other.description &&
                                this.expirationDate == other.expirationDate &&
                                this.fileId == other.fileId &&
                                this.backFileId == other.backFileId &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        country,
                                        description,
                                        expirationDate,
                                        fileId,
                                        backFileId,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Other{country=$country, description=$description, expirationDate=$expirationDate, fileId=$fileId, backFileId=$backFileId, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var country: String? = null
                            private var description: String? = null
                            private var expirationDate: LocalDate? = null
                            private var fileId: String? = null
                            private var backFileId: String? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(other: Other) = apply {
                                this.country = other.country
                                this.description = other.description
                                this.expirationDate = other.expirationDate
                                this.fileId = other.fileId
                                this.backFileId = other.backFileId
                                additionalProperties(other.additionalProperties)
                            }

                            /**
                             * The two-character ISO 3166-1 code representing the country that
                             * issued the document.
                             */
                            @JsonProperty("country")
                            fun country(country: String) = apply { this.country = country }

                            /** A description of the document submitted. */
                            @JsonProperty("description")
                            fun description(description: String) = apply {
                                this.description = description
                            }

                            /** The document's expiration date in YYYY-MM-DD format. */
                            @JsonProperty("expiration_date")
                            fun expirationDate(expirationDate: LocalDate) = apply {
                                this.expirationDate = expirationDate
                            }

                            /** The identifier of the File containing the front of the document. */
                            @JsonProperty("file_id")
                            fun fileId(fileId: String) = apply { this.fileId = fileId }

                            /**
                             * The identifier of the File containing the back of the document. Not
                             * every document has a reverse side.
                             */
                            @JsonProperty("back_file_id")
                            fun backFileId(backFileId: String) = apply {
                                this.backFileId = backFileId
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

                            fun build(): Other =
                                Other(
                                    checkNotNull(country) {
                                        "`country` is required but was not set"
                                    },
                                    checkNotNull(description) {
                                        "`description` is required but was not set"
                                    },
                                    expirationDate,
                                    checkNotNull(fileId) { "`fileId` is required but was not set" },
                                    backFileId,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    @JsonDeserialize(builder = Passport.Builder::class)
                    @NoAutoDetect
                    class Passport
                    private constructor(
                        private val fileId: String?,
                        private val expirationDate: LocalDate?,
                        private val country: String?,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var hashCode: Int = 0

                        /** The identifier of the File containing the passport. */
                        @JsonProperty("file_id") fun fileId(): String? = fileId

                        /** The passport's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(): LocalDate? = expirationDate

                        /** The country that issued the passport. */
                        @JsonProperty("country") fun country(): String? = country

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Passport &&
                                this.fileId == other.fileId &&
                                this.expirationDate == other.expirationDate &&
                                this.country == other.country &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        fileId,
                                        expirationDate,
                                        country,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Passport{fileId=$fileId, expirationDate=$expirationDate, country=$country, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var fileId: String? = null
                            private var expirationDate: LocalDate? = null
                            private var country: String? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(passport: Passport) = apply {
                                this.fileId = passport.fileId
                                this.expirationDate = passport.expirationDate
                                this.country = passport.country
                                additionalProperties(passport.additionalProperties)
                            }

                            /** The identifier of the File containing the passport. */
                            @JsonProperty("file_id")
                            fun fileId(fileId: String) = apply { this.fileId = fileId }

                            /** The passport's expiration date in YYYY-MM-DD format. */
                            @JsonProperty("expiration_date")
                            fun expirationDate(expirationDate: LocalDate) = apply {
                                this.expirationDate = expirationDate
                            }

                            /** The country that issued the passport. */
                            @JsonProperty("country")
                            fun country(country: String) = apply { this.country = country }

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

                            fun build(): Passport =
                                Passport(
                                    checkNotNull(fileId) { "`fileId` is required but was not set" },
                                    checkNotNull(expirationDate) {
                                        "`expirationDate` is required but was not set"
                                    },
                                    checkNotNull(country) {
                                        "`country` is required but was not set"
                                    },
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }
                }
            }
        }

        /** The grantor of the trust. Required if `category` is equal to `revocable`. */
        @JsonDeserialize(builder = Grantor.Builder::class)
        @NoAutoDetect
        class Grantor
        private constructor(
            private val name: String?,
            private val dateOfBirth: LocalDate?,
            private val address: Address?,
            private val confirmedNoUsTaxId: Boolean?,
            private val identification: Identification?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /** The person's legal name. */
            @JsonProperty("name") fun name(): String? = name

            /** The person's date of birth in YYYY-MM-DD format. */
            @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate? = dateOfBirth

            /** The individual's physical address. Post Office Boxes are disallowed. */
            @JsonProperty("address") fun address(): Address? = address

            /**
             * The identification method for an individual can only be a passport, driver's license,
             * or other document if you've confirmed the individual does not have a US tax id
             * (either a Social Security Number or Individual Taxpayer Identification Number).
             */
            @JsonProperty("confirmed_no_us_tax_id")
            fun confirmedNoUsTaxId(): Boolean? = confirmedNoUsTaxId

            /** A means of verifying the person's identity. */
            @JsonProperty("identification") fun identification(): Identification? = identification

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Grantor &&
                    this.name == other.name &&
                    this.dateOfBirth == other.dateOfBirth &&
                    this.address == other.address &&
                    this.confirmedNoUsTaxId == other.confirmedNoUsTaxId &&
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
                            confirmedNoUsTaxId,
                            identification,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Grantor{name=$name, dateOfBirth=$dateOfBirth, address=$address, confirmedNoUsTaxId=$confirmedNoUsTaxId, identification=$identification, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: String? = null
                private var dateOfBirth: LocalDate? = null
                private var address: Address? = null
                private var confirmedNoUsTaxId: Boolean? = null
                private var identification: Identification? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(grantor: Grantor) = apply {
                    this.name = grantor.name
                    this.dateOfBirth = grantor.dateOfBirth
                    this.address = grantor.address
                    this.confirmedNoUsTaxId = grantor.confirmedNoUsTaxId
                    this.identification = grantor.identification
                    additionalProperties(grantor.additionalProperties)
                }

                /** The person's legal name. */
                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                /** The person's date of birth in YYYY-MM-DD format. */
                @JsonProperty("date_of_birth")
                fun dateOfBirth(dateOfBirth: LocalDate) = apply { this.dateOfBirth = dateOfBirth }

                /** The individual's physical address. Post Office Boxes are disallowed. */
                @JsonProperty("address")
                fun address(address: Address) = apply { this.address = address }

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                @JsonProperty("confirmed_no_us_tax_id")
                fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean) = apply {
                    this.confirmedNoUsTaxId = confirmedNoUsTaxId
                }

                /** A means of verifying the person's identity. */
                @JsonProperty("identification")
                fun identification(identification: Identification) = apply {
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
                        checkNotNull(name) { "`name` is required but was not set" },
                        checkNotNull(dateOfBirth) { "`dateOfBirth` is required but was not set" },
                        checkNotNull(address) { "`address` is required but was not set" },
                        confirmedNoUsTaxId,
                        checkNotNull(identification) {
                            "`identification` is required but was not set"
                        },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /** The individual's physical address. Post Office Boxes are disallowed. */
            @JsonDeserialize(builder = Address.Builder::class)
            @NoAutoDetect
            class Address
            private constructor(
                private val line1: String?,
                private val line2: String?,
                private val city: String?,
                private val state: String?,
                private val zip: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var hashCode: Int = 0

                /** The first line of the address. This is usually the street number and street. */
                @JsonProperty("line1") fun line1(): String? = line1

                /** The second line of the address. This might be the floor or room number. */
                @JsonProperty("line2") fun line2(): String? = line2

                /** The city of the address. */
                @JsonProperty("city") fun city(): String? = city

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                @JsonProperty("state") fun state(): String? = state

                /** The ZIP code of the address. */
                @JsonProperty("zip") fun zip(): String? = zip

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                    private var line1: String? = null
                    private var line2: String? = null
                    private var city: String? = null
                    private var state: String? = null
                    private var zip: String? = null
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

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

                    /** The second line of the address. This might be the floor or room number. */
                    @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

                    /** The city of the address. */
                    @JsonProperty("city") fun city(city: String) = apply { this.city = city }

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    @JsonProperty("state") fun state(state: String) = apply { this.state = state }

                    /** The ZIP code of the address. */
                    @JsonProperty("zip") fun zip(zip: String) = apply { this.zip = zip }

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
                            checkNotNull(line1) { "`line1` is required but was not set" },
                            line2,
                            checkNotNull(city) { "`city` is required but was not set" },
                            checkNotNull(state) { "`state` is required but was not set" },
                            checkNotNull(zip) { "`zip` is required but was not set" },
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /** A means of verifying the person's identity. */
            @JsonDeserialize(builder = Identification.Builder::class)
            @NoAutoDetect
            class Identification
            private constructor(
                private val method: Method?,
                private val number: String?,
                private val passport: Passport?,
                private val driversLicense: DriversLicense?,
                private val other: Other?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var hashCode: Int = 0

                /** A method that can be used to verify the individual's identity. */
                @JsonProperty("method") fun method(): Method? = method

                /**
                 * An identification number that can be used to verify the individual's identity,
                 * such as a social security number.
                 */
                @JsonProperty("number") fun number(): String? = number

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                @JsonProperty("passport") fun passport(): Passport? = passport

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                @JsonProperty("drivers_license")
                fun driversLicense(): DriversLicense? = driversLicense

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                @JsonProperty("other") fun other(): Other? = other

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Identification &&
                        this.method == other.method &&
                        this.number == other.number &&
                        this.passport == other.passport &&
                        this.driversLicense == other.driversLicense &&
                        this.other == other.other &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                method,
                                number,
                                passport,
                                driversLicense,
                                other,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Identification{method=$method, number=$number, passport=$passport, driversLicense=$driversLicense, other=$other, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var method: Method? = null
                    private var number: String? = null
                    private var passport: Passport? = null
                    private var driversLicense: DriversLicense? = null
                    private var other: Other? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(identification: Identification) = apply {
                        this.method = identification.method
                        this.number = identification.number
                        this.passport = identification.passport
                        this.driversLicense = identification.driversLicense
                        this.other = identification.other
                        additionalProperties(identification.additionalProperties)
                    }

                    /** A method that can be used to verify the individual's identity. */
                    @JsonProperty("method")
                    fun method(method: Method) = apply { this.method = method }

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     */
                    @JsonProperty("number")
                    fun number(number: String) = apply { this.number = number }

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    @JsonProperty("passport")
                    fun passport(passport: Passport) = apply { this.passport = passport }

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    @JsonProperty("drivers_license")
                    fun driversLicense(driversLicense: DriversLicense) = apply {
                        this.driversLicense = driversLicense
                    }

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    @JsonProperty("other") fun other(other: Other) = apply { this.other = other }

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
                            checkNotNull(method) { "`method` is required but was not set" },
                            checkNotNull(number) { "`number` is required but was not set" },
                            passport,
                            driversLicense,
                            other,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Method
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

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

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                @JsonDeserialize(builder = DriversLicense.Builder::class)
                @NoAutoDetect
                class DriversLicense
                private constructor(
                    private val fileId: String?,
                    private val backFileId: String?,
                    private val expirationDate: LocalDate?,
                    private val state: String?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var hashCode: Int = 0

                    /** The identifier of the File containing the front of the driver's license. */
                    @JsonProperty("file_id") fun fileId(): String? = fileId

                    /** The identifier of the File containing the back of the driver's license. */
                    @JsonProperty("back_file_id") fun backFileId(): String? = backFileId

                    /** The driver's license's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(): LocalDate? = expirationDate

                    /** The state that issued the provided driver's license. */
                    @JsonProperty("state") fun state(): String? = state

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is DriversLicense &&
                            this.fileId == other.fileId &&
                            this.backFileId == other.backFileId &&
                            this.expirationDate == other.expirationDate &&
                            this.state == other.state &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    fileId,
                                    backFileId,
                                    expirationDate,
                                    state,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "DriversLicense{fileId=$fileId, backFileId=$backFileId, expirationDate=$expirationDate, state=$state, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var fileId: String? = null
                        private var backFileId: String? = null
                        private var expirationDate: LocalDate? = null
                        private var state: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(driversLicense: DriversLicense) = apply {
                            this.fileId = driversLicense.fileId
                            this.backFileId = driversLicense.backFileId
                            this.expirationDate = driversLicense.expirationDate
                            this.state = driversLicense.state
                            additionalProperties(driversLicense.additionalProperties)
                        }

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        @JsonProperty("file_id")
                        fun fileId(fileId: String) = apply { this.fileId = fileId }

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        @JsonProperty("back_file_id")
                        fun backFileId(backFileId: String) = apply { this.backFileId = backFileId }

                        /** The driver's license's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(expirationDate: LocalDate) = apply {
                            this.expirationDate = expirationDate
                        }

                        /** The state that issued the provided driver's license. */
                        @JsonProperty("state")
                        fun state(state: String) = apply { this.state = state }

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

                        fun build(): DriversLicense =
                            DriversLicense(
                                checkNotNull(fileId) { "`fileId` is required but was not set" },
                                backFileId,
                                checkNotNull(expirationDate) {
                                    "`expirationDate` is required but was not set"
                                },
                                checkNotNull(state) { "`state` is required but was not set" },
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                @JsonDeserialize(builder = Other.Builder::class)
                @NoAutoDetect
                class Other
                private constructor(
                    private val country: String?,
                    private val description: String?,
                    private val expirationDate: LocalDate?,
                    private val fileId: String?,
                    private val backFileId: String?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var hashCode: Int = 0

                    /**
                     * The two-character ISO 3166-1 code representing the country that issued the
                     * document.
                     */
                    @JsonProperty("country") fun country(): String? = country

                    /** A description of the document submitted. */
                    @JsonProperty("description") fun description(): String? = description

                    /** The document's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(): LocalDate? = expirationDate

                    /** The identifier of the File containing the front of the document. */
                    @JsonProperty("file_id") fun fileId(): String? = fileId

                    /**
                     * The identifier of the File containing the back of the document. Not every
                     * document has a reverse side.
                     */
                    @JsonProperty("back_file_id") fun backFileId(): String? = backFileId

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Other &&
                            this.country == other.country &&
                            this.description == other.description &&
                            this.expirationDate == other.expirationDate &&
                            this.fileId == other.fileId &&
                            this.backFileId == other.backFileId &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    country,
                                    description,
                                    expirationDate,
                                    fileId,
                                    backFileId,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Other{country=$country, description=$description, expirationDate=$expirationDate, fileId=$fileId, backFileId=$backFileId, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var country: String? = null
                        private var description: String? = null
                        private var expirationDate: LocalDate? = null
                        private var fileId: String? = null
                        private var backFileId: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(other: Other) = apply {
                            this.country = other.country
                            this.description = other.description
                            this.expirationDate = other.expirationDate
                            this.fileId = other.fileId
                            this.backFileId = other.backFileId
                            additionalProperties(other.additionalProperties)
                        }

                        /**
                         * The two-character ISO 3166-1 code representing the country that issued
                         * the document.
                         */
                        @JsonProperty("country")
                        fun country(country: String) = apply { this.country = country }

                        /** A description of the document submitted. */
                        @JsonProperty("description")
                        fun description(description: String) = apply {
                            this.description = description
                        }

                        /** The document's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(expirationDate: LocalDate) = apply {
                            this.expirationDate = expirationDate
                        }

                        /** The identifier of the File containing the front of the document. */
                        @JsonProperty("file_id")
                        fun fileId(fileId: String) = apply { this.fileId = fileId }

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        @JsonProperty("back_file_id")
                        fun backFileId(backFileId: String) = apply { this.backFileId = backFileId }

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

                        fun build(): Other =
                            Other(
                                checkNotNull(country) { "`country` is required but was not set" },
                                checkNotNull(description) {
                                    "`description` is required but was not set"
                                },
                                expirationDate,
                                checkNotNull(fileId) { "`fileId` is required but was not set" },
                                backFileId,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                @JsonDeserialize(builder = Passport.Builder::class)
                @NoAutoDetect
                class Passport
                private constructor(
                    private val fileId: String?,
                    private val expirationDate: LocalDate?,
                    private val country: String?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var hashCode: Int = 0

                    /** The identifier of the File containing the passport. */
                    @JsonProperty("file_id") fun fileId(): String? = fileId

                    /** The passport's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(): LocalDate? = expirationDate

                    /** The country that issued the passport. */
                    @JsonProperty("country") fun country(): String? = country

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Passport &&
                            this.fileId == other.fileId &&
                            this.expirationDate == other.expirationDate &&
                            this.country == other.country &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    fileId,
                                    expirationDate,
                                    country,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Passport{fileId=$fileId, expirationDate=$expirationDate, country=$country, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var fileId: String? = null
                        private var expirationDate: LocalDate? = null
                        private var country: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(passport: Passport) = apply {
                            this.fileId = passport.fileId
                            this.expirationDate = passport.expirationDate
                            this.country = passport.country
                            additionalProperties(passport.additionalProperties)
                        }

                        /** The identifier of the File containing the passport. */
                        @JsonProperty("file_id")
                        fun fileId(fileId: String) = apply { this.fileId = fileId }

                        /** The passport's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(expirationDate: LocalDate) = apply {
                            this.expirationDate = expirationDate
                        }

                        /** The country that issued the passport. */
                        @JsonProperty("country")
                        fun country(country: String) = apply { this.country = country }

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

                        fun build(): Passport =
                            Passport(
                                checkNotNull(fileId) { "`fileId` is required but was not set" },
                                checkNotNull(expirationDate) {
                                    "`expirationDate` is required but was not set"
                                },
                                checkNotNull(country) { "`country` is required but was not set" },
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }
            }
        }
    }
}
