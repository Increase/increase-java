// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class EntityCreateParams
constructor(
    private val structure: Structure,
    private val corporation: Corporation?,
    private val description: String?,
    private val governmentAuthority: GovernmentAuthority?,
    private val joint: Joint?,
    private val naturalPerson: NaturalPerson?,
    private val supplementalDocuments: List<SupplementalDocument>?,
    private val thirdPartyVerification: ThirdPartyVerification?,
    private val trust: Trust?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun structure(): Structure = structure

    fun corporation(): Optional<Corporation> = Optional.ofNullable(corporation)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun governmentAuthority(): Optional<GovernmentAuthority> =
        Optional.ofNullable(governmentAuthority)

    fun joint(): Optional<Joint> = Optional.ofNullable(joint)

    fun naturalPerson(): Optional<NaturalPerson> = Optional.ofNullable(naturalPerson)

    fun supplementalDocuments(): Optional<List<SupplementalDocument>> =
        Optional.ofNullable(supplementalDocuments)

    fun thirdPartyVerification(): Optional<ThirdPartyVerification> =
        Optional.ofNullable(thirdPartyVerification)

    fun trust(): Optional<Trust> = Optional.ofNullable(trust)

    @JvmSynthetic
    internal fun getBody(): EntityCreateBody {
        return EntityCreateBody(
            structure,
            corporation,
            description,
            governmentAuthority,
            joint,
            naturalPerson,
            supplementalDocuments,
            thirdPartyVerification,
            trust,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = EntityCreateBody.Builder::class)
    @NoAutoDetect
    class EntityCreateBody
    internal constructor(
        private val structure: Structure?,
        private val corporation: Corporation?,
        private val description: String?,
        private val governmentAuthority: GovernmentAuthority?,
        private val joint: Joint?,
        private val naturalPerson: NaturalPerson?,
        private val supplementalDocuments: List<SupplementalDocument>?,
        private val thirdPartyVerification: ThirdPartyVerification?,
        private val trust: Trust?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The type of Entity to create. */
        @JsonProperty("structure") fun structure(): Structure? = structure

        /**
         * Details of the corporation entity to create. Required if `structure` is equal to
         * `corporation`.
         */
        @JsonProperty("corporation") fun corporation(): Corporation? = corporation

        /** The description you choose to give the entity. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * Details of the Government Authority entity to create. Required if `structure` is equal to
         * `Government Authority`.
         */
        @JsonProperty("government_authority")
        fun governmentAuthority(): GovernmentAuthority? = governmentAuthority

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

        /**
         * A reference to data stored in a third-party verification service. Your integration may or
         * may not use this field.
         */
        @JsonProperty("third_party_verification")
        fun thirdPartyVerification(): ThirdPartyVerification? = thirdPartyVerification

        /** Details of the trust entity to create. Required if `structure` is equal to `trust`. */
        @JsonProperty("trust") fun trust(): Trust? = trust

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var structure: Structure? = null
            private var corporation: Corporation? = null
            private var description: String? = null
            private var governmentAuthority: GovernmentAuthority? = null
            private var joint: Joint? = null
            private var naturalPerson: NaturalPerson? = null
            private var supplementalDocuments: List<SupplementalDocument>? = null
            private var thirdPartyVerification: ThirdPartyVerification? = null
            private var trust: Trust? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entityCreateBody: EntityCreateBody) = apply {
                this.structure = entityCreateBody.structure
                this.corporation = entityCreateBody.corporation
                this.description = entityCreateBody.description
                this.governmentAuthority = entityCreateBody.governmentAuthority
                this.joint = entityCreateBody.joint
                this.naturalPerson = entityCreateBody.naturalPerson
                this.supplementalDocuments = entityCreateBody.supplementalDocuments
                this.thirdPartyVerification = entityCreateBody.thirdPartyVerification
                this.trust = entityCreateBody.trust
                additionalProperties(entityCreateBody.additionalProperties)
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
             * Details of the Government Authority entity to create. Required if `structure` is
             * equal to `Government Authority`.
             */
            @JsonProperty("government_authority")
            fun governmentAuthority(governmentAuthority: GovernmentAuthority) = apply {
                this.governmentAuthority = governmentAuthority
            }

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
             * A reference to data stored in a third-party verification service. Your integration
             * may or may not use this field.
             */
            @JsonProperty("third_party_verification")
            fun thirdPartyVerification(thirdPartyVerification: ThirdPartyVerification) = apply {
                this.thirdPartyVerification = thirdPartyVerification
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
                    checkNotNull(structure) { "`structure` is required but was not set" },
                    corporation,
                    description,
                    governmentAuthority,
                    joint,
                    naturalPerson,
                    supplementalDocuments?.toImmutable(),
                    thirdPartyVerification,
                    trust,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EntityCreateBody && this.structure == other.structure && this.corporation == other.corporation && this.description == other.description && this.governmentAuthority == other.governmentAuthority && this.joint == other.joint && this.naturalPerson == other.naturalPerson && this.supplementalDocuments == other.supplementalDocuments && this.thirdPartyVerification == other.thirdPartyVerification && this.trust == other.trust && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(structure, corporation, description, governmentAuthority, joint, naturalPerson, supplementalDocuments, thirdPartyVerification, trust, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "EntityCreateBody{structure=$structure, corporation=$corporation, description=$description, governmentAuthority=$governmentAuthority, joint=$joint, naturalPerson=$naturalPerson, supplementalDocuments=$supplementalDocuments, thirdPartyVerification=$thirdPartyVerification, trust=$trust, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EntityCreateParams && this.structure == other.structure && this.corporation == other.corporation && this.description == other.description && this.governmentAuthority == other.governmentAuthority && this.joint == other.joint && this.naturalPerson == other.naturalPerson && this.supplementalDocuments == other.supplementalDocuments && this.thirdPartyVerification == other.thirdPartyVerification && this.trust == other.trust && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(structure, corporation, description, governmentAuthority, joint, naturalPerson, supplementalDocuments, thirdPartyVerification, trust, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "EntityCreateParams{structure=$structure, corporation=$corporation, description=$description, governmentAuthority=$governmentAuthority, joint=$joint, naturalPerson=$naturalPerson, supplementalDocuments=$supplementalDocuments, thirdPartyVerification=$thirdPartyVerification, trust=$trust, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var structure: Structure? = null
        private var corporation: Corporation? = null
        private var description: String? = null
        private var governmentAuthority: GovernmentAuthority? = null
        private var joint: Joint? = null
        private var naturalPerson: NaturalPerson? = null
        private var supplementalDocuments: MutableList<SupplementalDocument> = mutableListOf()
        private var thirdPartyVerification: ThirdPartyVerification? = null
        private var trust: Trust? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(entityCreateParams: EntityCreateParams) = apply {
            this.structure = entityCreateParams.structure
            this.corporation = entityCreateParams.corporation
            this.description = entityCreateParams.description
            this.governmentAuthority = entityCreateParams.governmentAuthority
            this.joint = entityCreateParams.joint
            this.naturalPerson = entityCreateParams.naturalPerson
            this.supplementalDocuments(entityCreateParams.supplementalDocuments ?: listOf())
            this.thirdPartyVerification = entityCreateParams.thirdPartyVerification
            this.trust = entityCreateParams.trust
            additionalHeaders(entityCreateParams.additionalHeaders)
            additionalQueryParams(entityCreateParams.additionalQueryParams)
            additionalBodyProperties(entityCreateParams.additionalBodyProperties)
        }

        /** The type of Entity to create. */
        fun structure(structure: Structure) = apply { this.structure = structure }

        /**
         * Details of the corporation entity to create. Required if `structure` is equal to
         * `corporation`.
         */
        fun corporation(corporation: Corporation) = apply { this.corporation = corporation }

        /** The description you choose to give the entity. */
        fun description(description: String) = apply { this.description = description }

        /**
         * Details of the Government Authority entity to create. Required if `structure` is equal to
         * `Government Authority`.
         */
        fun governmentAuthority(governmentAuthority: GovernmentAuthority) = apply {
            this.governmentAuthority = governmentAuthority
        }

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

        /**
         * A reference to data stored in a third-party verification service. Your integration may or
         * may not use this field.
         */
        fun thirdPartyVerification(thirdPartyVerification: ThirdPartyVerification) = apply {
            this.thirdPartyVerification = thirdPartyVerification
        }

        /** Details of the trust entity to create. Required if `structure` is equal to `trust`. */
        fun trust(trust: Trust) = apply { this.trust = trust }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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
                checkNotNull(structure) { "`structure` is required but was not set" },
                corporation,
                description,
                governmentAuthority,
                joint,
                naturalPerson,
                if (supplementalDocuments.size == 0) null else supplementalDocuments.toImmutable(),
                thirdPartyVerification,
                trust,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
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

            return /* spotless:off */ other is Structure && this.value == other.value /* spotless:on */
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

    /**
     * Details of the corporation entity to create. Required if `structure` is equal to
     * `corporation`.
     */
    @JsonDeserialize(builder = Corporation.Builder::class)
    @NoAutoDetect
    class Corporation
    private constructor(
        private val address: Address?,
        private val beneficialOwners: List<BeneficialOwner>?,
        private val incorporationState: String?,
        private val industryCode: String?,
        private val name: String?,
        private val taxIdentifier: String?,
        private val website: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        @JsonProperty("address") fun address(): Address? = address

        /**
         * The identifying details of anyone controlling or owning 25% or more of the corporation.
         */
        @JsonProperty("beneficial_owners")
        fun beneficialOwners(): List<BeneficialOwner>? = beneficialOwners

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the corporation's
         * state of incorporation.
         */
        @JsonProperty("incorporation_state") fun incorporationState(): String? = incorporationState

        /**
         * The North American Industry Classification System (NAICS) code for the corporation's
         * primary line of business. This is a number, like `5132` for `Software Publishers`. A full
         * list of classification codes is available
         * [here](https://increase.com/documentation/data-dictionary#north-american-industry-classification-system-codes).
         */
        @JsonProperty("industry_code") fun industryCode(): String? = industryCode

        /** The legal name of the corporation. */
        @JsonProperty("name") fun name(): String? = name

        /** The Employer Identification Number (EIN) for the corporation. */
        @JsonProperty("tax_identifier") fun taxIdentifier(): String? = taxIdentifier

        /** The website of the corporation. */
        @JsonProperty("website") fun website(): String? = website

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address: Address? = null
            private var beneficialOwners: List<BeneficialOwner>? = null
            private var incorporationState: String? = null
            private var industryCode: String? = null
            private var name: String? = null
            private var taxIdentifier: String? = null
            private var website: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(corporation: Corporation) = apply {
                this.address = corporation.address
                this.beneficialOwners = corporation.beneficialOwners
                this.incorporationState = corporation.incorporationState
                this.industryCode = corporation.industryCode
                this.name = corporation.name
                this.taxIdentifier = corporation.taxIdentifier
                this.website = corporation.website
                additionalProperties(corporation.additionalProperties)
            }

            /**
             * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
             * disallowed.
             */
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

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the corporation's
             * state of incorporation.
             */
            @JsonProperty("incorporation_state")
            fun incorporationState(incorporationState: String) = apply {
                this.incorporationState = incorporationState
            }

            /**
             * The North American Industry Classification System (NAICS) code for the corporation's
             * primary line of business. This is a number, like `5132` for `Software Publishers`. A
             * full list of classification codes is available
             * [here](https://increase.com/documentation/data-dictionary#north-american-industry-classification-system-codes).
             */
            @JsonProperty("industry_code")
            fun industryCode(industryCode: String) = apply { this.industryCode = industryCode }

            /** The legal name of the corporation. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** The Employer Identification Number (EIN) for the corporation. */
            @JsonProperty("tax_identifier")
            fun taxIdentifier(taxIdentifier: String) = apply { this.taxIdentifier = taxIdentifier }

            /** The website of the corporation. */
            @JsonProperty("website") fun website(website: String) = apply { this.website = website }

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
                    checkNotNull(address) { "`address` is required but was not set" },
                    checkNotNull(beneficialOwners) {
                            "`beneficialOwners` is required but was not set"
                        }
                        .toImmutable(),
                    incorporationState,
                    industryCode,
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(taxIdentifier) { "`taxIdentifier` is required but was not set" },
                    website,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        @JsonDeserialize(builder = Address.Builder::class)
        @NoAutoDetect
        class Address
        private constructor(
            private val city: String?,
            private val line1: String?,
            private val line2: String?,
            private val state: String?,
            private val zip: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The city of the address. */
            @JsonProperty("city") fun city(): String? = city

            /** The first line of the address. This is usually the street number and street. */
            @JsonProperty("line1") fun line1(): String? = line1

            /** The second line of the address. This might be the floor or room number. */
            @JsonProperty("line2") fun line2(): String? = line2

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

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var city: String? = null
                private var line1: String? = null
                private var line2: String? = null
                private var state: String? = null
                private var zip: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    this.city = address.city
                    this.line1 = address.line1
                    this.line2 = address.line2
                    this.state = address.state
                    this.zip = address.zip
                    additionalProperties(address.additionalProperties)
                }

                /** The city of the address. */
                @JsonProperty("city") fun city(city: String) = apply { this.city = city }

                /** The first line of the address. This is usually the street number and street. */
                @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

                /** The second line of the address. This might be the floor or room number. */
                @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

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
                        checkNotNull(city) { "`city` is required but was not set" },
                        checkNotNull(line1) { "`line1` is required but was not set" },
                        line2,
                        checkNotNull(state) { "`state` is required but was not set" },
                        checkNotNull(zip) { "`zip` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Address && this.city == other.city && this.line1 == other.line1 && this.line2 == other.line2 && this.state == other.state && this.zip == other.zip && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(city, line1, line2, state, zip, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Address{city=$city, line1=$line1, line2=$line2, state=$state, zip=$zip, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = BeneficialOwner.Builder::class)
        @NoAutoDetect
        class BeneficialOwner
        private constructor(
            private val companyTitle: String?,
            private val individual: Individual?,
            private val prongs: List<Prong>?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** This person's role or title within the entity. */
            @JsonProperty("company_title") fun companyTitle(): String? = companyTitle

            /** Personal details for the beneficial owner. */
            @JsonProperty("individual") fun individual(): Individual? = individual

            /**
             * Why this person is considered a beneficial owner of the entity. At least one option
             * is required, if a person is both a control person and owner, submit an array
             * containing both.
             */
            @JsonProperty("prongs") fun prongs(): List<Prong>? = prongs

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var companyTitle: String? = null
                private var individual: Individual? = null
                private var prongs: List<Prong>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(beneficialOwner: BeneficialOwner) = apply {
                    this.companyTitle = beneficialOwner.companyTitle
                    this.individual = beneficialOwner.individual
                    this.prongs = beneficialOwner.prongs
                    additionalProperties(beneficialOwner.additionalProperties)
                }

                /** This person's role or title within the entity. */
                @JsonProperty("company_title")
                fun companyTitle(companyTitle: String) = apply { this.companyTitle = companyTitle }

                /** Personal details for the beneficial owner. */
                @JsonProperty("individual")
                fun individual(individual: Individual) = apply { this.individual = individual }

                /**
                 * Why this person is considered a beneficial owner of the entity. At least one
                 * option is required, if a person is both a control person and owner, submit an
                 * array containing both.
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
                        companyTitle,
                        checkNotNull(individual) { "`individual` is required but was not set" },
                        checkNotNull(prongs) { "`prongs` is required but was not set" }
                            .toImmutable(),
                        additionalProperties.toImmutable(),
                    )
            }

            /** Personal details for the beneficial owner. */
            @JsonDeserialize(builder = Individual.Builder::class)
            @NoAutoDetect
            class Individual
            private constructor(
                private val address: Address?,
                private val confirmedNoUsTaxId: Boolean?,
                private val dateOfBirth: LocalDate?,
                private val identification: Identification?,
                private val name: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
                 */
                @JsonProperty("address") fun address(): Address? = address

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                @JsonProperty("confirmed_no_us_tax_id")
                fun confirmedNoUsTaxId(): Boolean? = confirmedNoUsTaxId

                /** The person's date of birth in YYYY-MM-DD format. */
                @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate? = dateOfBirth

                /** A means of verifying the person's identity. */
                @JsonProperty("identification")
                fun identification(): Identification? = identification

                /** The person's legal name. */
                @JsonProperty("name") fun name(): String? = name

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var address: Address? = null
                    private var confirmedNoUsTaxId: Boolean? = null
                    private var dateOfBirth: LocalDate? = null
                    private var identification: Identification? = null
                    private var name: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(individual: Individual) = apply {
                        this.address = individual.address
                        this.confirmedNoUsTaxId = individual.confirmedNoUsTaxId
                        this.dateOfBirth = individual.dateOfBirth
                        this.identification = individual.identification
                        this.name = individual.name
                        additionalProperties(individual.additionalProperties)
                    }

                    /**
                     * The individual's physical address. Mail receiving locations like PO Boxes and
                     * PMB's are disallowed.
                     */
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

                    /** The person's date of birth in YYYY-MM-DD format. */
                    @JsonProperty("date_of_birth")
                    fun dateOfBirth(dateOfBirth: LocalDate) = apply {
                        this.dateOfBirth = dateOfBirth
                    }

                    /** A means of verifying the person's identity. */
                    @JsonProperty("identification")
                    fun identification(identification: Identification) = apply {
                        this.identification = identification
                    }

                    /** The person's legal name. */
                    @JsonProperty("name") fun name(name: String) = apply { this.name = name }

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
                            checkNotNull(address) { "`address` is required but was not set" },
                            confirmedNoUsTaxId,
                            checkNotNull(dateOfBirth) {
                                "`dateOfBirth` is required but was not set"
                            },
                            checkNotNull(identification) {
                                "`identification` is required but was not set"
                            },
                            checkNotNull(name) { "`name` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
                 */
                @JsonDeserialize(builder = Address.Builder::class)
                @NoAutoDetect
                class Address
                private constructor(
                    private val city: String?,
                    private val line1: String?,
                    private val line2: String?,
                    private val state: String?,
                    private val zip: String?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /** The city of the address. */
                    @JsonProperty("city") fun city(): String? = city

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    @JsonProperty("line1") fun line1(): String? = line1

                    /** The second line of the address. This might be the floor or room number. */
                    @JsonProperty("line2") fun line2(): String? = line2

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

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var city: String? = null
                        private var line1: String? = null
                        private var line2: String? = null
                        private var state: String? = null
                        private var zip: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(address: Address) = apply {
                            this.city = address.city
                            this.line1 = address.line1
                            this.line2 = address.line2
                            this.state = address.state
                            this.zip = address.zip
                            additionalProperties(address.additionalProperties)
                        }

                        /** The city of the address. */
                        @JsonProperty("city") fun city(city: String) = apply { this.city = city }

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
                                checkNotNull(city) { "`city` is required but was not set" },
                                checkNotNull(line1) { "`line1` is required but was not set" },
                                line2,
                                checkNotNull(state) { "`state` is required but was not set" },
                                checkNotNull(zip) { "`zip` is required but was not set" },
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Address && this.city == other.city && this.line1 == other.line1 && this.line2 == other.line2 && this.state == other.state && this.zip == other.zip && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(city, line1, line2, state, zip, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Address{city=$city, line1=$line1, line2=$line2, state=$state, zip=$zip, additionalProperties=$additionalProperties}"
                }

                /** A means of verifying the person's identity. */
                @JsonDeserialize(builder = Identification.Builder::class)
                @NoAutoDetect
                class Identification
                private constructor(
                    private val driversLicense: DriversLicense?,
                    private val method: Method?,
                    private val number: String?,
                    private val other: Other?,
                    private val passport: Passport?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    @JsonProperty("drivers_license")
                    fun driversLicense(): DriversLicense? = driversLicense

                    /** A method that can be used to verify the individual's identity. */
                    @JsonProperty("method") fun method(): Method? = method

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     */
                    @JsonProperty("number") fun number(): String? = number

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    @JsonProperty("other") fun other(): Other? = other

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    @JsonProperty("passport") fun passport(): Passport? = passport

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var driversLicense: DriversLicense? = null
                        private var method: Method? = null
                        private var number: String? = null
                        private var other: Other? = null
                        private var passport: Passport? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(identification: Identification) = apply {
                            this.driversLicense = identification.driversLicense
                            this.method = identification.method
                            this.number = identification.number
                            this.other = identification.other
                            this.passport = identification.passport
                            additionalProperties(identification.additionalProperties)
                        }

                        /**
                         * Information about the United States driver's license used for
                         * identification. Required if `method` is equal to `drivers_license`.
                         */
                        @JsonProperty("drivers_license")
                        fun driversLicense(driversLicense: DriversLicense) = apply {
                            this.driversLicense = driversLicense
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
                         * Information about the identification document provided. Required if
                         * `method` is equal to `other`.
                         */
                        @JsonProperty("other")
                        fun other(other: Other) = apply { this.other = other }

                        /**
                         * Information about the passport used for identification. Required if
                         * `method` is equal to `passport`.
                         */
                        @JsonProperty("passport")
                        fun passport(passport: Passport) = apply { this.passport = passport }

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
                                driversLicense,
                                checkNotNull(method) { "`method` is required but was not set" },
                                checkNotNull(number) { "`number` is required but was not set" },
                                other,
                                passport,
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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Method && this.value == other.value /* spotless:on */
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
                        private val backFileId: String?,
                        private val expirationDate: LocalDate?,
                        private val fileId: String?,
                        private val state: String?,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        @JsonProperty("back_file_id") fun backFileId(): String? = backFileId

                        /** The driver's license's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(): LocalDate? = expirationDate

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        @JsonProperty("file_id") fun fileId(): String? = fileId

                        /** The state that issued the provided driver's license. */
                        @JsonProperty("state") fun state(): String? = state

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var backFileId: String? = null
                            private var expirationDate: LocalDate? = null
                            private var fileId: String? = null
                            private var state: String? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(driversLicense: DriversLicense) = apply {
                                this.backFileId = driversLicense.backFileId
                                this.expirationDate = driversLicense.expirationDate
                                this.fileId = driversLicense.fileId
                                this.state = driversLicense.state
                                additionalProperties(driversLicense.additionalProperties)
                            }

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

                            /**
                             * The identifier of the File containing the front of the driver's
                             * license.
                             */
                            @JsonProperty("file_id")
                            fun fileId(fileId: String) = apply { this.fileId = fileId }

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
                                    backFileId,
                                    checkNotNull(expirationDate) {
                                        "`expirationDate` is required but was not set"
                                    },
                                    checkNotNull(fileId) { "`fileId` is required but was not set" },
                                    checkNotNull(state) { "`state` is required but was not set" },
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is DriversLicense && this.backFileId == other.backFileId && this.expirationDate == other.expirationDate && this.fileId == other.fileId && this.state == other.state && this.additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        private var hashCode: Int = 0

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = /* spotless:off */ Objects.hash(backFileId, expirationDate, fileId, state, additionalProperties) /* spotless:on */
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "DriversLicense{backFileId=$backFileId, expirationDate=$expirationDate, fileId=$fileId, state=$state, additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    @JsonDeserialize(builder = Other.Builder::class)
                    @NoAutoDetect
                    class Other
                    private constructor(
                        private val backFileId: String?,
                        private val country: String?,
                        private val description: String?,
                        private val expirationDate: LocalDate?,
                        private val fileId: String?,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        @JsonProperty("back_file_id") fun backFileId(): String? = backFileId

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

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var backFileId: String? = null
                            private var country: String? = null
                            private var description: String? = null
                            private var expirationDate: LocalDate? = null
                            private var fileId: String? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(other: Other) = apply {
                                this.backFileId = other.backFileId
                                this.country = other.country
                                this.description = other.description
                                this.expirationDate = other.expirationDate
                                this.fileId = other.fileId
                                additionalProperties(other.additionalProperties)
                            }

                            /**
                             * The identifier of the File containing the back of the document. Not
                             * every document has a reverse side.
                             */
                            @JsonProperty("back_file_id")
                            fun backFileId(backFileId: String) = apply {
                                this.backFileId = backFileId
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
                                    backFileId,
                                    checkNotNull(country) {
                                        "`country` is required but was not set"
                                    },
                                    checkNotNull(description) {
                                        "`description` is required but was not set"
                                    },
                                    expirationDate,
                                    checkNotNull(fileId) { "`fileId` is required but was not set" },
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Other && this.backFileId == other.backFileId && this.country == other.country && this.description == other.description && this.expirationDate == other.expirationDate && this.fileId == other.fileId && this.additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        private var hashCode: Int = 0

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = /* spotless:off */ Objects.hash(backFileId, country, description, expirationDate, fileId, additionalProperties) /* spotless:on */
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Other{backFileId=$backFileId, country=$country, description=$description, expirationDate=$expirationDate, fileId=$fileId, additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    @JsonDeserialize(builder = Passport.Builder::class)
                    @NoAutoDetect
                    class Passport
                    private constructor(
                        private val country: String?,
                        private val expirationDate: LocalDate?,
                        private val fileId: String?,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        /** The country that issued the passport. */
                        @JsonProperty("country") fun country(): String? = country

                        /** The passport's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(): LocalDate? = expirationDate

                        /** The identifier of the File containing the passport. */
                        @JsonProperty("file_id") fun fileId(): String? = fileId

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var country: String? = null
                            private var expirationDate: LocalDate? = null
                            private var fileId: String? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(passport: Passport) = apply {
                                this.country = passport.country
                                this.expirationDate = passport.expirationDate
                                this.fileId = passport.fileId
                                additionalProperties(passport.additionalProperties)
                            }

                            /** The country that issued the passport. */
                            @JsonProperty("country")
                            fun country(country: String) = apply { this.country = country }

                            /** The passport's expiration date in YYYY-MM-DD format. */
                            @JsonProperty("expiration_date")
                            fun expirationDate(expirationDate: LocalDate) = apply {
                                this.expirationDate = expirationDate
                            }

                            /** The identifier of the File containing the passport. */
                            @JsonProperty("file_id")
                            fun fileId(fileId: String) = apply { this.fileId = fileId }

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
                                    checkNotNull(country) {
                                        "`country` is required but was not set"
                                    },
                                    checkNotNull(expirationDate) {
                                        "`expirationDate` is required but was not set"
                                    },
                                    checkNotNull(fileId) { "`fileId` is required but was not set" },
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Passport && this.country == other.country && this.expirationDate == other.expirationDate && this.fileId == other.fileId && this.additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        private var hashCode: Int = 0

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = /* spotless:off */ Objects.hash(country, expirationDate, fileId, additionalProperties) /* spotless:on */
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Passport{country=$country, expirationDate=$expirationDate, fileId=$fileId, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Identification && this.driversLicense == other.driversLicense && this.method == other.method && this.number == other.number && this.other == other.other && this.passport == other.passport && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(driversLicense, method, number, other, passport, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Identification{driversLicense=$driversLicense, method=$method, number=$number, other=$other, passport=$passport, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Individual && this.address == other.address && this.confirmedNoUsTaxId == other.confirmedNoUsTaxId && this.dateOfBirth == other.dateOfBirth && this.identification == other.identification && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(address, confirmedNoUsTaxId, dateOfBirth, identification, name, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Individual{address=$address, confirmedNoUsTaxId=$confirmedNoUsTaxId, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, additionalProperties=$additionalProperties}"
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

                    return /* spotless:off */ other is Prong && this.value == other.value /* spotless:on */
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BeneficialOwner && this.companyTitle == other.companyTitle && this.individual == other.individual && this.prongs == other.prongs && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(companyTitle, individual, prongs, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BeneficialOwner{companyTitle=$companyTitle, individual=$individual, prongs=$prongs, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Corporation && this.address == other.address && this.beneficialOwners == other.beneficialOwners && this.incorporationState == other.incorporationState && this.industryCode == other.industryCode && this.name == other.name && this.taxIdentifier == other.taxIdentifier && this.website == other.website && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(address, beneficialOwners, incorporationState, industryCode, name, taxIdentifier, website, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Corporation{address=$address, beneficialOwners=$beneficialOwners, incorporationState=$incorporationState, industryCode=$industryCode, name=$name, taxIdentifier=$taxIdentifier, website=$website, additionalProperties=$additionalProperties}"
    }

    /**
     * Details of the Government Authority entity to create. Required if `structure` is equal to
     * `Government Authority`.
     */
    @JsonDeserialize(builder = GovernmentAuthority.Builder::class)
    @NoAutoDetect
    class GovernmentAuthority
    private constructor(
        private val address: Address?,
        private val authorizedPersons: List<AuthorizedPerson>?,
        private val category: Category?,
        private val name: String?,
        private val taxIdentifier: String?,
        private val website: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        @JsonProperty("address") fun address(): Address? = address

        /** The identifying details of authorized officials acting on the entity's behalf. */
        @JsonProperty("authorized_persons")
        fun authorizedPersons(): List<AuthorizedPerson>? = authorizedPersons

        /** The category of the government authority. */
        @JsonProperty("category") fun category(): Category? = category

        /** The legal name of the government authority. */
        @JsonProperty("name") fun name(): String? = name

        /** The Employer Identification Number (EIN) for the government authority. */
        @JsonProperty("tax_identifier") fun taxIdentifier(): String? = taxIdentifier

        /** The website of the government authority. */
        @JsonProperty("website") fun website(): String? = website

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address: Address? = null
            private var authorizedPersons: List<AuthorizedPerson>? = null
            private var category: Category? = null
            private var name: String? = null
            private var taxIdentifier: String? = null
            private var website: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(governmentAuthority: GovernmentAuthority) = apply {
                this.address = governmentAuthority.address
                this.authorizedPersons = governmentAuthority.authorizedPersons
                this.category = governmentAuthority.category
                this.name = governmentAuthority.name
                this.taxIdentifier = governmentAuthority.taxIdentifier
                this.website = governmentAuthority.website
                additionalProperties(governmentAuthority.additionalProperties)
            }

            /**
             * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
             * disallowed.
             */
            @JsonProperty("address")
            fun address(address: Address) = apply { this.address = address }

            /** The identifying details of authorized officials acting on the entity's behalf. */
            @JsonProperty("authorized_persons")
            fun authorizedPersons(authorizedPersons: List<AuthorizedPerson>) = apply {
                this.authorizedPersons = authorizedPersons
            }

            /** The category of the government authority. */
            @JsonProperty("category")
            fun category(category: Category) = apply { this.category = category }

            /** The legal name of the government authority. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** The Employer Identification Number (EIN) for the government authority. */
            @JsonProperty("tax_identifier")
            fun taxIdentifier(taxIdentifier: String) = apply { this.taxIdentifier = taxIdentifier }

            /** The website of the government authority. */
            @JsonProperty("website") fun website(website: String) = apply { this.website = website }

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
                    checkNotNull(address) { "`address` is required but was not set" },
                    checkNotNull(authorizedPersons) {
                            "`authorizedPersons` is required but was not set"
                        }
                        .toImmutable(),
                    checkNotNull(category) { "`category` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(taxIdentifier) { "`taxIdentifier` is required but was not set" },
                    website,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        @JsonDeserialize(builder = Address.Builder::class)
        @NoAutoDetect
        class Address
        private constructor(
            private val city: String?,
            private val line1: String?,
            private val line2: String?,
            private val state: String?,
            private val zip: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The city of the address. */
            @JsonProperty("city") fun city(): String? = city

            /** The first line of the address. This is usually the street number and street. */
            @JsonProperty("line1") fun line1(): String? = line1

            /** The second line of the address. This might be the floor or room number. */
            @JsonProperty("line2") fun line2(): String? = line2

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

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var city: String? = null
                private var line1: String? = null
                private var line2: String? = null
                private var state: String? = null
                private var zip: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    this.city = address.city
                    this.line1 = address.line1
                    this.line2 = address.line2
                    this.state = address.state
                    this.zip = address.zip
                    additionalProperties(address.additionalProperties)
                }

                /** The city of the address. */
                @JsonProperty("city") fun city(city: String) = apply { this.city = city }

                /** The first line of the address. This is usually the street number and street. */
                @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

                /** The second line of the address. This might be the floor or room number. */
                @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

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
                        checkNotNull(city) { "`city` is required but was not set" },
                        checkNotNull(line1) { "`line1` is required but was not set" },
                        line2,
                        checkNotNull(state) { "`state` is required but was not set" },
                        checkNotNull(zip) { "`zip` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Address && this.city == other.city && this.line1 == other.line1 && this.line2 == other.line2 && this.state == other.state && this.zip == other.zip && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(city, line1, line2, state, zip, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Address{city=$city, line1=$line1, line2=$line2, state=$state, zip=$zip, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = AuthorizedPerson.Builder::class)
        @NoAutoDetect
        class AuthorizedPerson
        private constructor(
            private val name: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The person's legal name. */
            @JsonProperty("name") fun name(): String? = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(authorizedPerson: AuthorizedPerson) = apply {
                    this.name = authorizedPerson.name
                    additionalProperties(authorizedPerson.additionalProperties)
                }

                /** The person's legal name. */
                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

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
                        checkNotNull(name) { "`name` is required but was not set" },
                        additionalProperties.toImmutable()
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AuthorizedPerson && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(name, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "AuthorizedPerson{name=$name, additionalProperties=$additionalProperties}"
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

                return /* spotless:off */ other is Category && this.value == other.value /* spotless:on */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is GovernmentAuthority && this.address == other.address && this.authorizedPersons == other.authorizedPersons && this.category == other.category && this.name == other.name && this.taxIdentifier == other.taxIdentifier && this.website == other.website && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(address, authorizedPersons, category, name, taxIdentifier, website, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "GovernmentAuthority{address=$address, authorizedPersons=$authorizedPersons, category=$category, name=$name, taxIdentifier=$taxIdentifier, website=$website, additionalProperties=$additionalProperties}"
    }

    /** Details of the joint entity to create. Required if `structure` is equal to `joint`. */
    @JsonDeserialize(builder = Joint.Builder::class)
    @NoAutoDetect
    class Joint
    private constructor(
        private val individuals: List<Individual>?,
        private val name: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The two individuals that share control of the entity. */
        @JsonProperty("individuals") fun individuals(): List<Individual>? = individuals

        /** The name of the joint entity. */
        @JsonProperty("name") fun name(): String? = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var individuals: List<Individual>? = null
            private var name: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(joint: Joint) = apply {
                this.individuals = joint.individuals
                this.name = joint.name
                additionalProperties(joint.additionalProperties)
            }

            /** The two individuals that share control of the entity. */
            @JsonProperty("individuals")
            fun individuals(individuals: List<Individual>) = apply {
                this.individuals = individuals
            }

            /** The name of the joint entity. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

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
                    checkNotNull(individuals) { "`individuals` is required but was not set" }
                        .toImmutable(),
                    name,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = Individual.Builder::class)
        @NoAutoDetect
        class Individual
        private constructor(
            private val address: Address?,
            private val confirmedNoUsTaxId: Boolean?,
            private val dateOfBirth: LocalDate?,
            private val identification: Identification?,
            private val name: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and PMB's
             * are disallowed.
             */
            @JsonProperty("address") fun address(): Address? = address

            /**
             * The identification method for an individual can only be a passport, driver's license,
             * or other document if you've confirmed the individual does not have a US tax id
             * (either a Social Security Number or Individual Taxpayer Identification Number).
             */
            @JsonProperty("confirmed_no_us_tax_id")
            fun confirmedNoUsTaxId(): Boolean? = confirmedNoUsTaxId

            /** The person's date of birth in YYYY-MM-DD format. */
            @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate? = dateOfBirth

            /** A means of verifying the person's identity. */
            @JsonProperty("identification") fun identification(): Identification? = identification

            /** The person's legal name. */
            @JsonProperty("name") fun name(): String? = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var address: Address? = null
                private var confirmedNoUsTaxId: Boolean? = null
                private var dateOfBirth: LocalDate? = null
                private var identification: Identification? = null
                private var name: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(individual: Individual) = apply {
                    this.address = individual.address
                    this.confirmedNoUsTaxId = individual.confirmedNoUsTaxId
                    this.dateOfBirth = individual.dateOfBirth
                    this.identification = individual.identification
                    this.name = individual.name
                    additionalProperties(individual.additionalProperties)
                }

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
                 */
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

                /** The person's date of birth in YYYY-MM-DD format. */
                @JsonProperty("date_of_birth")
                fun dateOfBirth(dateOfBirth: LocalDate) = apply { this.dateOfBirth = dateOfBirth }

                /** A means of verifying the person's identity. */
                @JsonProperty("identification")
                fun identification(identification: Identification) = apply {
                    this.identification = identification
                }

                /** The person's legal name. */
                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

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
                        checkNotNull(address) { "`address` is required but was not set" },
                        confirmedNoUsTaxId,
                        checkNotNull(dateOfBirth) { "`dateOfBirth` is required but was not set" },
                        checkNotNull(identification) {
                            "`identification` is required but was not set"
                        },
                        checkNotNull(name) { "`name` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and PMB's
             * are disallowed.
             */
            @JsonDeserialize(builder = Address.Builder::class)
            @NoAutoDetect
            class Address
            private constructor(
                private val city: String?,
                private val line1: String?,
                private val line2: String?,
                private val state: String?,
                private val zip: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** The city of the address. */
                @JsonProperty("city") fun city(): String? = city

                /** The first line of the address. This is usually the street number and street. */
                @JsonProperty("line1") fun line1(): String? = line1

                /** The second line of the address. This might be the floor or room number. */
                @JsonProperty("line2") fun line2(): String? = line2

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

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var city: String? = null
                    private var line1: String? = null
                    private var line2: String? = null
                    private var state: String? = null
                    private var zip: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(address: Address) = apply {
                        this.city = address.city
                        this.line1 = address.line1
                        this.line2 = address.line2
                        this.state = address.state
                        this.zip = address.zip
                        additionalProperties(address.additionalProperties)
                    }

                    /** The city of the address. */
                    @JsonProperty("city") fun city(city: String) = apply { this.city = city }

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

                    /** The second line of the address. This might be the floor or room number. */
                    @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

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
                            checkNotNull(city) { "`city` is required but was not set" },
                            checkNotNull(line1) { "`line1` is required but was not set" },
                            line2,
                            checkNotNull(state) { "`state` is required but was not set" },
                            checkNotNull(zip) { "`zip` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Address && this.city == other.city && this.line1 == other.line1 && this.line2 == other.line2 && this.state == other.state && this.zip == other.zip && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(city, line1, line2, state, zip, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Address{city=$city, line1=$line1, line2=$line2, state=$state, zip=$zip, additionalProperties=$additionalProperties}"
            }

            /** A means of verifying the person's identity. */
            @JsonDeserialize(builder = Identification.Builder::class)
            @NoAutoDetect
            class Identification
            private constructor(
                private val driversLicense: DriversLicense?,
                private val method: Method?,
                private val number: String?,
                private val other: Other?,
                private val passport: Passport?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                @JsonProperty("drivers_license")
                fun driversLicense(): DriversLicense? = driversLicense

                /** A method that can be used to verify the individual's identity. */
                @JsonProperty("method") fun method(): Method? = method

                /**
                 * An identification number that can be used to verify the individual's identity,
                 * such as a social security number.
                 */
                @JsonProperty("number") fun number(): String? = number

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                @JsonProperty("other") fun other(): Other? = other

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                @JsonProperty("passport") fun passport(): Passport? = passport

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var driversLicense: DriversLicense? = null
                    private var method: Method? = null
                    private var number: String? = null
                    private var other: Other? = null
                    private var passport: Passport? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(identification: Identification) = apply {
                        this.driversLicense = identification.driversLicense
                        this.method = identification.method
                        this.number = identification.number
                        this.other = identification.other
                        this.passport = identification.passport
                        additionalProperties(identification.additionalProperties)
                    }

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    @JsonProperty("drivers_license")
                    fun driversLicense(driversLicense: DriversLicense) = apply {
                        this.driversLicense = driversLicense
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
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    @JsonProperty("other") fun other(other: Other) = apply { this.other = other }

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    @JsonProperty("passport")
                    fun passport(passport: Passport) = apply { this.passport = passport }

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
                            driversLicense,
                            checkNotNull(method) { "`method` is required but was not set" },
                            checkNotNull(number) { "`number` is required but was not set" },
                            other,
                            passport,
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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Method && this.value == other.value /* spotless:on */
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
                    private val backFileId: String?,
                    private val expirationDate: LocalDate?,
                    private val fileId: String?,
                    private val state: String?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /** The identifier of the File containing the back of the driver's license. */
                    @JsonProperty("back_file_id") fun backFileId(): String? = backFileId

                    /** The driver's license's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(): LocalDate? = expirationDate

                    /** The identifier of the File containing the front of the driver's license. */
                    @JsonProperty("file_id") fun fileId(): String? = fileId

                    /** The state that issued the provided driver's license. */
                    @JsonProperty("state") fun state(): String? = state

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var backFileId: String? = null
                        private var expirationDate: LocalDate? = null
                        private var fileId: String? = null
                        private var state: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(driversLicense: DriversLicense) = apply {
                            this.backFileId = driversLicense.backFileId
                            this.expirationDate = driversLicense.expirationDate
                            this.fileId = driversLicense.fileId
                            this.state = driversLicense.state
                            additionalProperties(driversLicense.additionalProperties)
                        }

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

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        @JsonProperty("file_id")
                        fun fileId(fileId: String) = apply { this.fileId = fileId }

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
                                backFileId,
                                checkNotNull(expirationDate) {
                                    "`expirationDate` is required but was not set"
                                },
                                checkNotNull(fileId) { "`fileId` is required but was not set" },
                                checkNotNull(state) { "`state` is required but was not set" },
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DriversLicense && this.backFileId == other.backFileId && this.expirationDate == other.expirationDate && this.fileId == other.fileId && this.state == other.state && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(backFileId, expirationDate, fileId, state, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "DriversLicense{backFileId=$backFileId, expirationDate=$expirationDate, fileId=$fileId, state=$state, additionalProperties=$additionalProperties}"
                }

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                @JsonDeserialize(builder = Other.Builder::class)
                @NoAutoDetect
                class Other
                private constructor(
                    private val backFileId: String?,
                    private val country: String?,
                    private val description: String?,
                    private val expirationDate: LocalDate?,
                    private val fileId: String?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /**
                     * The identifier of the File containing the back of the document. Not every
                     * document has a reverse side.
                     */
                    @JsonProperty("back_file_id") fun backFileId(): String? = backFileId

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

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var backFileId: String? = null
                        private var country: String? = null
                        private var description: String? = null
                        private var expirationDate: LocalDate? = null
                        private var fileId: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(other: Other) = apply {
                            this.backFileId = other.backFileId
                            this.country = other.country
                            this.description = other.description
                            this.expirationDate = other.expirationDate
                            this.fileId = other.fileId
                            additionalProperties(other.additionalProperties)
                        }

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        @JsonProperty("back_file_id")
                        fun backFileId(backFileId: String) = apply { this.backFileId = backFileId }

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
                                backFileId,
                                checkNotNull(country) { "`country` is required but was not set" },
                                checkNotNull(description) {
                                    "`description` is required but was not set"
                                },
                                expirationDate,
                                checkNotNull(fileId) { "`fileId` is required but was not set" },
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Other && this.backFileId == other.backFileId && this.country == other.country && this.description == other.description && this.expirationDate == other.expirationDate && this.fileId == other.fileId && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(backFileId, country, description, expirationDate, fileId, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Other{backFileId=$backFileId, country=$country, description=$description, expirationDate=$expirationDate, fileId=$fileId, additionalProperties=$additionalProperties}"
                }

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                @JsonDeserialize(builder = Passport.Builder::class)
                @NoAutoDetect
                class Passport
                private constructor(
                    private val country: String?,
                    private val expirationDate: LocalDate?,
                    private val fileId: String?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /** The country that issued the passport. */
                    @JsonProperty("country") fun country(): String? = country

                    /** The passport's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(): LocalDate? = expirationDate

                    /** The identifier of the File containing the passport. */
                    @JsonProperty("file_id") fun fileId(): String? = fileId

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var country: String? = null
                        private var expirationDate: LocalDate? = null
                        private var fileId: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(passport: Passport) = apply {
                            this.country = passport.country
                            this.expirationDate = passport.expirationDate
                            this.fileId = passport.fileId
                            additionalProperties(passport.additionalProperties)
                        }

                        /** The country that issued the passport. */
                        @JsonProperty("country")
                        fun country(country: String) = apply { this.country = country }

                        /** The passport's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(expirationDate: LocalDate) = apply {
                            this.expirationDate = expirationDate
                        }

                        /** The identifier of the File containing the passport. */
                        @JsonProperty("file_id")
                        fun fileId(fileId: String) = apply { this.fileId = fileId }

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
                                checkNotNull(country) { "`country` is required but was not set" },
                                checkNotNull(expirationDate) {
                                    "`expirationDate` is required but was not set"
                                },
                                checkNotNull(fileId) { "`fileId` is required but was not set" },
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Passport && this.country == other.country && this.expirationDate == other.expirationDate && this.fileId == other.fileId && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(country, expirationDate, fileId, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Passport{country=$country, expirationDate=$expirationDate, fileId=$fileId, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Identification && this.driversLicense == other.driversLicense && this.method == other.method && this.number == other.number && this.other == other.other && this.passport == other.passport && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(driversLicense, method, number, other, passport, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Identification{driversLicense=$driversLicense, method=$method, number=$number, other=$other, passport=$passport, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Individual && this.address == other.address && this.confirmedNoUsTaxId == other.confirmedNoUsTaxId && this.dateOfBirth == other.dateOfBirth && this.identification == other.identification && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(address, confirmedNoUsTaxId, dateOfBirth, identification, name, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Individual{address=$address, confirmedNoUsTaxId=$confirmedNoUsTaxId, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Joint && this.individuals == other.individuals && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(individuals, name, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Joint{individuals=$individuals, name=$name, additionalProperties=$additionalProperties}"
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
        private val address: Address?,
        private val confirmedNoUsTaxId: Boolean?,
        private val dateOfBirth: LocalDate?,
        private val identification: Identification?,
        private val name: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The individual's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        @JsonProperty("address") fun address(): Address? = address

        /**
         * The identification method for an individual can only be a passport, driver's license, or
         * other document if you've confirmed the individual does not have a US tax id (either a
         * Social Security Number or Individual Taxpayer Identification Number).
         */
        @JsonProperty("confirmed_no_us_tax_id")
        fun confirmedNoUsTaxId(): Boolean? = confirmedNoUsTaxId

        /** The person's date of birth in YYYY-MM-DD format. */
        @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate? = dateOfBirth

        /** A means of verifying the person's identity. */
        @JsonProperty("identification") fun identification(): Identification? = identification

        /** The person's legal name. */
        @JsonProperty("name") fun name(): String? = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address: Address? = null
            private var confirmedNoUsTaxId: Boolean? = null
            private var dateOfBirth: LocalDate? = null
            private var identification: Identification? = null
            private var name: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(naturalPerson: NaturalPerson) = apply {
                this.address = naturalPerson.address
                this.confirmedNoUsTaxId = naturalPerson.confirmedNoUsTaxId
                this.dateOfBirth = naturalPerson.dateOfBirth
                this.identification = naturalPerson.identification
                this.name = naturalPerson.name
                additionalProperties(naturalPerson.additionalProperties)
            }

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and PMB's
             * are disallowed.
             */
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

            /** The person's date of birth in YYYY-MM-DD format. */
            @JsonProperty("date_of_birth")
            fun dateOfBirth(dateOfBirth: LocalDate) = apply { this.dateOfBirth = dateOfBirth }

            /** A means of verifying the person's identity. */
            @JsonProperty("identification")
            fun identification(identification: Identification) = apply {
                this.identification = identification
            }

            /** The person's legal name. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

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
                    checkNotNull(address) { "`address` is required but was not set" },
                    confirmedNoUsTaxId,
                    checkNotNull(dateOfBirth) { "`dateOfBirth` is required but was not set" },
                    checkNotNull(identification) { "`identification` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * The individual's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        @JsonDeserialize(builder = Address.Builder::class)
        @NoAutoDetect
        class Address
        private constructor(
            private val city: String?,
            private val line1: String?,
            private val line2: String?,
            private val state: String?,
            private val zip: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The city of the address. */
            @JsonProperty("city") fun city(): String? = city

            /** The first line of the address. This is usually the street number and street. */
            @JsonProperty("line1") fun line1(): String? = line1

            /** The second line of the address. This might be the floor or room number. */
            @JsonProperty("line2") fun line2(): String? = line2

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

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var city: String? = null
                private var line1: String? = null
                private var line2: String? = null
                private var state: String? = null
                private var zip: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    this.city = address.city
                    this.line1 = address.line1
                    this.line2 = address.line2
                    this.state = address.state
                    this.zip = address.zip
                    additionalProperties(address.additionalProperties)
                }

                /** The city of the address. */
                @JsonProperty("city") fun city(city: String) = apply { this.city = city }

                /** The first line of the address. This is usually the street number and street. */
                @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

                /** The second line of the address. This might be the floor or room number. */
                @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

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
                        checkNotNull(city) { "`city` is required but was not set" },
                        checkNotNull(line1) { "`line1` is required but was not set" },
                        line2,
                        checkNotNull(state) { "`state` is required but was not set" },
                        checkNotNull(zip) { "`zip` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Address && this.city == other.city && this.line1 == other.line1 && this.line2 == other.line2 && this.state == other.state && this.zip == other.zip && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(city, line1, line2, state, zip, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Address{city=$city, line1=$line1, line2=$line2, state=$state, zip=$zip, additionalProperties=$additionalProperties}"
        }

        /** A means of verifying the person's identity. */
        @JsonDeserialize(builder = Identification.Builder::class)
        @NoAutoDetect
        class Identification
        private constructor(
            private val driversLicense: DriversLicense?,
            private val method: Method?,
            private val number: String?,
            private val other: Other?,
            private val passport: Passport?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * Information about the United States driver's license used for identification.
             * Required if `method` is equal to `drivers_license`.
             */
            @JsonProperty("drivers_license") fun driversLicense(): DriversLicense? = driversLicense

            /** A method that can be used to verify the individual's identity. */
            @JsonProperty("method") fun method(): Method? = method

            /**
             * An identification number that can be used to verify the individual's identity, such
             * as a social security number.
             */
            @JsonProperty("number") fun number(): String? = number

            /**
             * Information about the identification document provided. Required if `method` is equal
             * to `other`.
             */
            @JsonProperty("other") fun other(): Other? = other

            /**
             * Information about the passport used for identification. Required if `method` is equal
             * to `passport`.
             */
            @JsonProperty("passport") fun passport(): Passport? = passport

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var driversLicense: DriversLicense? = null
                private var method: Method? = null
                private var number: String? = null
                private var other: Other? = null
                private var passport: Passport? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(identification: Identification) = apply {
                    this.driversLicense = identification.driversLicense
                    this.method = identification.method
                    this.number = identification.number
                    this.other = identification.other
                    this.passport = identification.passport
                    additionalProperties(identification.additionalProperties)
                }

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                @JsonProperty("drivers_license")
                fun driversLicense(driversLicense: DriversLicense) = apply {
                    this.driversLicense = driversLicense
                }

                /** A method that can be used to verify the individual's identity. */
                @JsonProperty("method") fun method(method: Method) = apply { this.method = method }

                /**
                 * An identification number that can be used to verify the individual's identity,
                 * such as a social security number.
                 */
                @JsonProperty("number") fun number(number: String) = apply { this.number = number }

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                @JsonProperty("other") fun other(other: Other) = apply { this.other = other }

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                @JsonProperty("passport")
                fun passport(passport: Passport) = apply { this.passport = passport }

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
                        driversLicense,
                        checkNotNull(method) { "`method` is required but was not set" },
                        checkNotNull(number) { "`number` is required but was not set" },
                        other,
                        passport,
                        additionalProperties.toImmutable(),
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

                    return /* spotless:off */ other is Method && this.value == other.value /* spotless:on */
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
                private val backFileId: String?,
                private val expirationDate: LocalDate?,
                private val fileId: String?,
                private val state: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** The identifier of the File containing the back of the driver's license. */
                @JsonProperty("back_file_id") fun backFileId(): String? = backFileId

                /** The driver's license's expiration date in YYYY-MM-DD format. */
                @JsonProperty("expiration_date") fun expirationDate(): LocalDate? = expirationDate

                /** The identifier of the File containing the front of the driver's license. */
                @JsonProperty("file_id") fun fileId(): String? = fileId

                /** The state that issued the provided driver's license. */
                @JsonProperty("state") fun state(): String? = state

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var backFileId: String? = null
                    private var expirationDate: LocalDate? = null
                    private var fileId: String? = null
                    private var state: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(driversLicense: DriversLicense) = apply {
                        this.backFileId = driversLicense.backFileId
                        this.expirationDate = driversLicense.expirationDate
                        this.fileId = driversLicense.fileId
                        this.state = driversLicense.state
                        additionalProperties(driversLicense.additionalProperties)
                    }

                    /** The identifier of the File containing the back of the driver's license. */
                    @JsonProperty("back_file_id")
                    fun backFileId(backFileId: String) = apply { this.backFileId = backFileId }

                    /** The driver's license's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(expirationDate: LocalDate) = apply {
                        this.expirationDate = expirationDate
                    }

                    /** The identifier of the File containing the front of the driver's license. */
                    @JsonProperty("file_id")
                    fun fileId(fileId: String) = apply { this.fileId = fileId }

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
                            backFileId,
                            checkNotNull(expirationDate) {
                                "`expirationDate` is required but was not set"
                            },
                            checkNotNull(fileId) { "`fileId` is required but was not set" },
                            checkNotNull(state) { "`state` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DriversLicense && this.backFileId == other.backFileId && this.expirationDate == other.expirationDate && this.fileId == other.fileId && this.state == other.state && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(backFileId, expirationDate, fileId, state, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "DriversLicense{backFileId=$backFileId, expirationDate=$expirationDate, fileId=$fileId, state=$state, additionalProperties=$additionalProperties}"
            }

            /**
             * Information about the identification document provided. Required if `method` is equal
             * to `other`.
             */
            @JsonDeserialize(builder = Other.Builder::class)
            @NoAutoDetect
            class Other
            private constructor(
                private val backFileId: String?,
                private val country: String?,
                private val description: String?,
                private val expirationDate: LocalDate?,
                private val fileId: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /**
                 * The identifier of the File containing the back of the document. Not every
                 * document has a reverse side.
                 */
                @JsonProperty("back_file_id") fun backFileId(): String? = backFileId

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

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var backFileId: String? = null
                    private var country: String? = null
                    private var description: String? = null
                    private var expirationDate: LocalDate? = null
                    private var fileId: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(other: Other) = apply {
                        this.backFileId = other.backFileId
                        this.country = other.country
                        this.description = other.description
                        this.expirationDate = other.expirationDate
                        this.fileId = other.fileId
                        additionalProperties(other.additionalProperties)
                    }

                    /**
                     * The identifier of the File containing the back of the document. Not every
                     * document has a reverse side.
                     */
                    @JsonProperty("back_file_id")
                    fun backFileId(backFileId: String) = apply { this.backFileId = backFileId }

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
                            backFileId,
                            checkNotNull(country) { "`country` is required but was not set" },
                            checkNotNull(description) {
                                "`description` is required but was not set"
                            },
                            expirationDate,
                            checkNotNull(fileId) { "`fileId` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Other && this.backFileId == other.backFileId && this.country == other.country && this.description == other.description && this.expirationDate == other.expirationDate && this.fileId == other.fileId && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(backFileId, country, description, expirationDate, fileId, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Other{backFileId=$backFileId, country=$country, description=$description, expirationDate=$expirationDate, fileId=$fileId, additionalProperties=$additionalProperties}"
            }

            /**
             * Information about the passport used for identification. Required if `method` is equal
             * to `passport`.
             */
            @JsonDeserialize(builder = Passport.Builder::class)
            @NoAutoDetect
            class Passport
            private constructor(
                private val country: String?,
                private val expirationDate: LocalDate?,
                private val fileId: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** The country that issued the passport. */
                @JsonProperty("country") fun country(): String? = country

                /** The passport's expiration date in YYYY-MM-DD format. */
                @JsonProperty("expiration_date") fun expirationDate(): LocalDate? = expirationDate

                /** The identifier of the File containing the passport. */
                @JsonProperty("file_id") fun fileId(): String? = fileId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var country: String? = null
                    private var expirationDate: LocalDate? = null
                    private var fileId: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(passport: Passport) = apply {
                        this.country = passport.country
                        this.expirationDate = passport.expirationDate
                        this.fileId = passport.fileId
                        additionalProperties(passport.additionalProperties)
                    }

                    /** The country that issued the passport. */
                    @JsonProperty("country")
                    fun country(country: String) = apply { this.country = country }

                    /** The passport's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(expirationDate: LocalDate) = apply {
                        this.expirationDate = expirationDate
                    }

                    /** The identifier of the File containing the passport. */
                    @JsonProperty("file_id")
                    fun fileId(fileId: String) = apply { this.fileId = fileId }

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
                            checkNotNull(country) { "`country` is required but was not set" },
                            checkNotNull(expirationDate) {
                                "`expirationDate` is required but was not set"
                            },
                            checkNotNull(fileId) { "`fileId` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Passport && this.country == other.country && this.expirationDate == other.expirationDate && this.fileId == other.fileId && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(country, expirationDate, fileId, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Passport{country=$country, expirationDate=$expirationDate, fileId=$fileId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Identification && this.driversLicense == other.driversLicense && this.method == other.method && this.number == other.number && this.other == other.other && this.passport == other.passport && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(driversLicense, method, number, other, passport, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Identification{driversLicense=$driversLicense, method=$method, number=$number, other=$other, passport=$passport, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NaturalPerson && this.address == other.address && this.confirmedNoUsTaxId == other.confirmedNoUsTaxId && this.dateOfBirth == other.dateOfBirth && this.identification == other.identification && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(address, confirmedNoUsTaxId, dateOfBirth, identification, name, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NaturalPerson{address=$address, confirmedNoUsTaxId=$confirmedNoUsTaxId, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = SupplementalDocument.Builder::class)
    @NoAutoDetect
    class SupplementalDocument
    private constructor(
        private val fileId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The identifier of the File containing the document. */
        @JsonProperty("file_id") fun fileId(): String? = fileId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

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
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SupplementalDocument && this.fileId == other.fileId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(fileId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "SupplementalDocument{fileId=$fileId, additionalProperties=$additionalProperties}"
    }

    /**
     * A reference to data stored in a third-party verification service. Your integration may or may
     * not use this field.
     */
    @JsonDeserialize(builder = ThirdPartyVerification.Builder::class)
    @NoAutoDetect
    class ThirdPartyVerification
    private constructor(
        private val reference: String?,
        private val vendor: Vendor?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The reference identifier for the third party verification. */
        @JsonProperty("reference") fun reference(): String? = reference

        /** The vendor that was used to perform the verification. */
        @JsonProperty("vendor") fun vendor(): Vendor? = vendor

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var reference: String? = null
            private var vendor: Vendor? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(thirdPartyVerification: ThirdPartyVerification) = apply {
                this.reference = thirdPartyVerification.reference
                this.vendor = thirdPartyVerification.vendor
                additionalProperties(thirdPartyVerification.additionalProperties)
            }

            /** The reference identifier for the third party verification. */
            @JsonProperty("reference")
            fun reference(reference: String) = apply { this.reference = reference }

            /** The vendor that was used to perform the verification. */
            @JsonProperty("vendor") fun vendor(vendor: Vendor) = apply { this.vendor = vendor }

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

            fun build(): ThirdPartyVerification =
                ThirdPartyVerification(
                    checkNotNull(reference) { "`reference` is required but was not set" },
                    checkNotNull(vendor) { "`vendor` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Vendor
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Vendor && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ALLOY = Vendor(JsonField.of("alloy"))

                @JvmField val MIDDESK = Vendor(JsonField.of("middesk"))

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
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ThirdPartyVerification && this.reference == other.reference && this.vendor == other.vendor && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(reference, vendor, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ThirdPartyVerification{reference=$reference, vendor=$vendor, additionalProperties=$additionalProperties}"
    }

    /** Details of the trust entity to create. Required if `structure` is equal to `trust`. */
    @JsonDeserialize(builder = Trust.Builder::class)
    @NoAutoDetect
    class Trust
    private constructor(
        private val address: Address?,
        private val category: Category?,
        private val formationDocumentFileId: String?,
        private val formationState: String?,
        private val grantor: Grantor?,
        private val name: String?,
        private val taxIdentifier: String?,
        private val trustees: List<Trustee>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The trust's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        @JsonProperty("address") fun address(): Address? = address

        /**
         * Whether the trust is `revocable` or `irrevocable`. Irrevocable trusts require their own
         * Employer Identification Number. Revocable trusts require information about the individual
         * `grantor` who created the trust.
         */
        @JsonProperty("category") fun category(): Category? = category

        /** The identifier of the File containing the formation document of the trust. */
        @JsonProperty("formation_document_file_id")
        fun formationDocumentFileId(): String? = formationDocumentFileId

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the state in which
         * the trust was formed.
         */
        @JsonProperty("formation_state") fun formationState(): String? = formationState

        /** The grantor of the trust. Required if `category` is equal to `revocable`. */
        @JsonProperty("grantor") fun grantor(): Grantor? = grantor

        /** The legal name of the trust. */
        @JsonProperty("name") fun name(): String? = name

        /**
         * The Employer Identification Number (EIN) for the trust. Required if `category` is equal
         * to `irrevocable`.
         */
        @JsonProperty("tax_identifier") fun taxIdentifier(): String? = taxIdentifier

        /** The trustees of the trust. */
        @JsonProperty("trustees") fun trustees(): List<Trustee>? = trustees

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address: Address? = null
            private var category: Category? = null
            private var formationDocumentFileId: String? = null
            private var formationState: String? = null
            private var grantor: Grantor? = null
            private var name: String? = null
            private var taxIdentifier: String? = null
            private var trustees: List<Trustee>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trust: Trust) = apply {
                this.address = trust.address
                this.category = trust.category
                this.formationDocumentFileId = trust.formationDocumentFileId
                this.formationState = trust.formationState
                this.grantor = trust.grantor
                this.name = trust.name
                this.taxIdentifier = trust.taxIdentifier
                this.trustees = trust.trustees
                additionalProperties(trust.additionalProperties)
            }

            /**
             * The trust's physical address. Mail receiving locations like PO Boxes and PMB's are
             * disallowed.
             */
            @JsonProperty("address")
            fun address(address: Address) = apply { this.address = address }

            /**
             * Whether the trust is `revocable` or `irrevocable`. Irrevocable trusts require their
             * own Employer Identification Number. Revocable trusts require information about the
             * individual `grantor` who created the trust.
             */
            @JsonProperty("category")
            fun category(category: Category) = apply { this.category = category }

            /** The identifier of the File containing the formation document of the trust. */
            @JsonProperty("formation_document_file_id")
            fun formationDocumentFileId(formationDocumentFileId: String) = apply {
                this.formationDocumentFileId = formationDocumentFileId
            }

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state in
             * which the trust was formed.
             */
            @JsonProperty("formation_state")
            fun formationState(formationState: String) = apply {
                this.formationState = formationState
            }

            /** The grantor of the trust. Required if `category` is equal to `revocable`. */
            @JsonProperty("grantor")
            fun grantor(grantor: Grantor) = apply { this.grantor = grantor }

            /** The legal name of the trust. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The Employer Identification Number (EIN) for the trust. Required if `category` is
             * equal to `irrevocable`.
             */
            @JsonProperty("tax_identifier")
            fun taxIdentifier(taxIdentifier: String) = apply { this.taxIdentifier = taxIdentifier }

            /** The trustees of the trust. */
            @JsonProperty("trustees")
            fun trustees(trustees: List<Trustee>) = apply { this.trustees = trustees }

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
                    checkNotNull(address) { "`address` is required but was not set" },
                    checkNotNull(category) { "`category` is required but was not set" },
                    formationDocumentFileId,
                    formationState,
                    grantor,
                    checkNotNull(name) { "`name` is required but was not set" },
                    taxIdentifier,
                    checkNotNull(trustees) { "`trustees` is required but was not set" }
                        .toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * The trust's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        @JsonDeserialize(builder = Address.Builder::class)
        @NoAutoDetect
        class Address
        private constructor(
            private val city: String?,
            private val line1: String?,
            private val line2: String?,
            private val state: String?,
            private val zip: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The city of the address. */
            @JsonProperty("city") fun city(): String? = city

            /** The first line of the address. This is usually the street number and street. */
            @JsonProperty("line1") fun line1(): String? = line1

            /** The second line of the address. This might be the floor or room number. */
            @JsonProperty("line2") fun line2(): String? = line2

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

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var city: String? = null
                private var line1: String? = null
                private var line2: String? = null
                private var state: String? = null
                private var zip: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    this.city = address.city
                    this.line1 = address.line1
                    this.line2 = address.line2
                    this.state = address.state
                    this.zip = address.zip
                    additionalProperties(address.additionalProperties)
                }

                /** The city of the address. */
                @JsonProperty("city") fun city(city: String) = apply { this.city = city }

                /** The first line of the address. This is usually the street number and street. */
                @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

                /** The second line of the address. This might be the floor or room number. */
                @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

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
                        checkNotNull(city) { "`city` is required but was not set" },
                        checkNotNull(line1) { "`line1` is required but was not set" },
                        line2,
                        checkNotNull(state) { "`state` is required but was not set" },
                        checkNotNull(zip) { "`zip` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Address && this.city == other.city && this.line1 == other.line1 && this.line2 == other.line2 && this.state == other.state && this.zip == other.zip && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(city, line1, line2, state, zip, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Address{city=$city, line1=$line1, line2=$line2, state=$state, zip=$zip, additionalProperties=$additionalProperties}"
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

                return /* spotless:off */ other is Category && this.value == other.value /* spotless:on */
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
            private val individual: Individual?,
            private val structure: Structure?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * Details of the individual trustee. Required when the trustee `structure` is equal to
             * `individual`.
             */
            @JsonProperty("individual") fun individual(): Individual? = individual

            /** The structure of the trustee. */
            @JsonProperty("structure") fun structure(): Structure? = structure

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var individual: Individual? = null
                private var structure: Structure? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(trustee: Trustee) = apply {
                    this.individual = trustee.individual
                    this.structure = trustee.structure
                    additionalProperties(trustee.additionalProperties)
                }

                /**
                 * Details of the individual trustee. Required when the trustee `structure` is equal
                 * to `individual`.
                 */
                @JsonProperty("individual")
                fun individual(individual: Individual) = apply { this.individual = individual }

                /** The structure of the trustee. */
                @JsonProperty("structure")
                fun structure(structure: Structure) = apply { this.structure = structure }

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
                        individual,
                        checkNotNull(structure) { "`structure` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
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

                    return /* spotless:off */ other is Structure && this.value == other.value /* spotless:on */
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
                private val address: Address?,
                private val confirmedNoUsTaxId: Boolean?,
                private val dateOfBirth: LocalDate?,
                private val identification: Identification?,
                private val name: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
                 */
                @JsonProperty("address") fun address(): Address? = address

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                @JsonProperty("confirmed_no_us_tax_id")
                fun confirmedNoUsTaxId(): Boolean? = confirmedNoUsTaxId

                /** The person's date of birth in YYYY-MM-DD format. */
                @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate? = dateOfBirth

                /** A means of verifying the person's identity. */
                @JsonProperty("identification")
                fun identification(): Identification? = identification

                /** The person's legal name. */
                @JsonProperty("name") fun name(): String? = name

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var address: Address? = null
                    private var confirmedNoUsTaxId: Boolean? = null
                    private var dateOfBirth: LocalDate? = null
                    private var identification: Identification? = null
                    private var name: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(individual: Individual) = apply {
                        this.address = individual.address
                        this.confirmedNoUsTaxId = individual.confirmedNoUsTaxId
                        this.dateOfBirth = individual.dateOfBirth
                        this.identification = individual.identification
                        this.name = individual.name
                        additionalProperties(individual.additionalProperties)
                    }

                    /**
                     * The individual's physical address. Mail receiving locations like PO Boxes and
                     * PMB's are disallowed.
                     */
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

                    /** The person's date of birth in YYYY-MM-DD format. */
                    @JsonProperty("date_of_birth")
                    fun dateOfBirth(dateOfBirth: LocalDate) = apply {
                        this.dateOfBirth = dateOfBirth
                    }

                    /** A means of verifying the person's identity. */
                    @JsonProperty("identification")
                    fun identification(identification: Identification) = apply {
                        this.identification = identification
                    }

                    /** The person's legal name. */
                    @JsonProperty("name") fun name(name: String) = apply { this.name = name }

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
                            checkNotNull(address) { "`address` is required but was not set" },
                            confirmedNoUsTaxId,
                            checkNotNull(dateOfBirth) {
                                "`dateOfBirth` is required but was not set"
                            },
                            checkNotNull(identification) {
                                "`identification` is required but was not set"
                            },
                            checkNotNull(name) { "`name` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
                 */
                @JsonDeserialize(builder = Address.Builder::class)
                @NoAutoDetect
                class Address
                private constructor(
                    private val city: String?,
                    private val line1: String?,
                    private val line2: String?,
                    private val state: String?,
                    private val zip: String?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /** The city of the address. */
                    @JsonProperty("city") fun city(): String? = city

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    @JsonProperty("line1") fun line1(): String? = line1

                    /** The second line of the address. This might be the floor or room number. */
                    @JsonProperty("line2") fun line2(): String? = line2

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

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var city: String? = null
                        private var line1: String? = null
                        private var line2: String? = null
                        private var state: String? = null
                        private var zip: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(address: Address) = apply {
                            this.city = address.city
                            this.line1 = address.line1
                            this.line2 = address.line2
                            this.state = address.state
                            this.zip = address.zip
                            additionalProperties(address.additionalProperties)
                        }

                        /** The city of the address. */
                        @JsonProperty("city") fun city(city: String) = apply { this.city = city }

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
                                checkNotNull(city) { "`city` is required but was not set" },
                                checkNotNull(line1) { "`line1` is required but was not set" },
                                line2,
                                checkNotNull(state) { "`state` is required but was not set" },
                                checkNotNull(zip) { "`zip` is required but was not set" },
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Address && this.city == other.city && this.line1 == other.line1 && this.line2 == other.line2 && this.state == other.state && this.zip == other.zip && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(city, line1, line2, state, zip, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Address{city=$city, line1=$line1, line2=$line2, state=$state, zip=$zip, additionalProperties=$additionalProperties}"
                }

                /** A means of verifying the person's identity. */
                @JsonDeserialize(builder = Identification.Builder::class)
                @NoAutoDetect
                class Identification
                private constructor(
                    private val driversLicense: DriversLicense?,
                    private val method: Method?,
                    private val number: String?,
                    private val other: Other?,
                    private val passport: Passport?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    @JsonProperty("drivers_license")
                    fun driversLicense(): DriversLicense? = driversLicense

                    /** A method that can be used to verify the individual's identity. */
                    @JsonProperty("method") fun method(): Method? = method

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     */
                    @JsonProperty("number") fun number(): String? = number

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    @JsonProperty("other") fun other(): Other? = other

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    @JsonProperty("passport") fun passport(): Passport? = passport

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var driversLicense: DriversLicense? = null
                        private var method: Method? = null
                        private var number: String? = null
                        private var other: Other? = null
                        private var passport: Passport? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(identification: Identification) = apply {
                            this.driversLicense = identification.driversLicense
                            this.method = identification.method
                            this.number = identification.number
                            this.other = identification.other
                            this.passport = identification.passport
                            additionalProperties(identification.additionalProperties)
                        }

                        /**
                         * Information about the United States driver's license used for
                         * identification. Required if `method` is equal to `drivers_license`.
                         */
                        @JsonProperty("drivers_license")
                        fun driversLicense(driversLicense: DriversLicense) = apply {
                            this.driversLicense = driversLicense
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
                         * Information about the identification document provided. Required if
                         * `method` is equal to `other`.
                         */
                        @JsonProperty("other")
                        fun other(other: Other) = apply { this.other = other }

                        /**
                         * Information about the passport used for identification. Required if
                         * `method` is equal to `passport`.
                         */
                        @JsonProperty("passport")
                        fun passport(passport: Passport) = apply { this.passport = passport }

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
                                driversLicense,
                                checkNotNull(method) { "`method` is required but was not set" },
                                checkNotNull(number) { "`number` is required but was not set" },
                                other,
                                passport,
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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Method && this.value == other.value /* spotless:on */
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
                        private val backFileId: String?,
                        private val expirationDate: LocalDate?,
                        private val fileId: String?,
                        private val state: String?,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        @JsonProperty("back_file_id") fun backFileId(): String? = backFileId

                        /** The driver's license's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(): LocalDate? = expirationDate

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        @JsonProperty("file_id") fun fileId(): String? = fileId

                        /** The state that issued the provided driver's license. */
                        @JsonProperty("state") fun state(): String? = state

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var backFileId: String? = null
                            private var expirationDate: LocalDate? = null
                            private var fileId: String? = null
                            private var state: String? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(driversLicense: DriversLicense) = apply {
                                this.backFileId = driversLicense.backFileId
                                this.expirationDate = driversLicense.expirationDate
                                this.fileId = driversLicense.fileId
                                this.state = driversLicense.state
                                additionalProperties(driversLicense.additionalProperties)
                            }

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

                            /**
                             * The identifier of the File containing the front of the driver's
                             * license.
                             */
                            @JsonProperty("file_id")
                            fun fileId(fileId: String) = apply { this.fileId = fileId }

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
                                    backFileId,
                                    checkNotNull(expirationDate) {
                                        "`expirationDate` is required but was not set"
                                    },
                                    checkNotNull(fileId) { "`fileId` is required but was not set" },
                                    checkNotNull(state) { "`state` is required but was not set" },
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is DriversLicense && this.backFileId == other.backFileId && this.expirationDate == other.expirationDate && this.fileId == other.fileId && this.state == other.state && this.additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        private var hashCode: Int = 0

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = /* spotless:off */ Objects.hash(backFileId, expirationDate, fileId, state, additionalProperties) /* spotless:on */
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "DriversLicense{backFileId=$backFileId, expirationDate=$expirationDate, fileId=$fileId, state=$state, additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    @JsonDeserialize(builder = Other.Builder::class)
                    @NoAutoDetect
                    class Other
                    private constructor(
                        private val backFileId: String?,
                        private val country: String?,
                        private val description: String?,
                        private val expirationDate: LocalDate?,
                        private val fileId: String?,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        @JsonProperty("back_file_id") fun backFileId(): String? = backFileId

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

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var backFileId: String? = null
                            private var country: String? = null
                            private var description: String? = null
                            private var expirationDate: LocalDate? = null
                            private var fileId: String? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(other: Other) = apply {
                                this.backFileId = other.backFileId
                                this.country = other.country
                                this.description = other.description
                                this.expirationDate = other.expirationDate
                                this.fileId = other.fileId
                                additionalProperties(other.additionalProperties)
                            }

                            /**
                             * The identifier of the File containing the back of the document. Not
                             * every document has a reverse side.
                             */
                            @JsonProperty("back_file_id")
                            fun backFileId(backFileId: String) = apply {
                                this.backFileId = backFileId
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
                                    backFileId,
                                    checkNotNull(country) {
                                        "`country` is required but was not set"
                                    },
                                    checkNotNull(description) {
                                        "`description` is required but was not set"
                                    },
                                    expirationDate,
                                    checkNotNull(fileId) { "`fileId` is required but was not set" },
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Other && this.backFileId == other.backFileId && this.country == other.country && this.description == other.description && this.expirationDate == other.expirationDate && this.fileId == other.fileId && this.additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        private var hashCode: Int = 0

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = /* spotless:off */ Objects.hash(backFileId, country, description, expirationDate, fileId, additionalProperties) /* spotless:on */
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Other{backFileId=$backFileId, country=$country, description=$description, expirationDate=$expirationDate, fileId=$fileId, additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    @JsonDeserialize(builder = Passport.Builder::class)
                    @NoAutoDetect
                    class Passport
                    private constructor(
                        private val country: String?,
                        private val expirationDate: LocalDate?,
                        private val fileId: String?,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        /** The country that issued the passport. */
                        @JsonProperty("country") fun country(): String? = country

                        /** The passport's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(): LocalDate? = expirationDate

                        /** The identifier of the File containing the passport. */
                        @JsonProperty("file_id") fun fileId(): String? = fileId

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var country: String? = null
                            private var expirationDate: LocalDate? = null
                            private var fileId: String? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(passport: Passport) = apply {
                                this.country = passport.country
                                this.expirationDate = passport.expirationDate
                                this.fileId = passport.fileId
                                additionalProperties(passport.additionalProperties)
                            }

                            /** The country that issued the passport. */
                            @JsonProperty("country")
                            fun country(country: String) = apply { this.country = country }

                            /** The passport's expiration date in YYYY-MM-DD format. */
                            @JsonProperty("expiration_date")
                            fun expirationDate(expirationDate: LocalDate) = apply {
                                this.expirationDate = expirationDate
                            }

                            /** The identifier of the File containing the passport. */
                            @JsonProperty("file_id")
                            fun fileId(fileId: String) = apply { this.fileId = fileId }

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
                                    checkNotNull(country) {
                                        "`country` is required but was not set"
                                    },
                                    checkNotNull(expirationDate) {
                                        "`expirationDate` is required but was not set"
                                    },
                                    checkNotNull(fileId) { "`fileId` is required but was not set" },
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Passport && this.country == other.country && this.expirationDate == other.expirationDate && this.fileId == other.fileId && this.additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        private var hashCode: Int = 0

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = /* spotless:off */ Objects.hash(country, expirationDate, fileId, additionalProperties) /* spotless:on */
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Passport{country=$country, expirationDate=$expirationDate, fileId=$fileId, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Identification && this.driversLicense == other.driversLicense && this.method == other.method && this.number == other.number && this.other == other.other && this.passport == other.passport && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(driversLicense, method, number, other, passport, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Identification{driversLicense=$driversLicense, method=$method, number=$number, other=$other, passport=$passport, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Individual && this.address == other.address && this.confirmedNoUsTaxId == other.confirmedNoUsTaxId && this.dateOfBirth == other.dateOfBirth && this.identification == other.identification && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(address, confirmedNoUsTaxId, dateOfBirth, identification, name, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Individual{address=$address, confirmedNoUsTaxId=$confirmedNoUsTaxId, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Trustee && this.individual == other.individual && this.structure == other.structure && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(individual, structure, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Trustee{individual=$individual, structure=$structure, additionalProperties=$additionalProperties}"
        }

        /** The grantor of the trust. Required if `category` is equal to `revocable`. */
        @JsonDeserialize(builder = Grantor.Builder::class)
        @NoAutoDetect
        class Grantor
        private constructor(
            private val address: Address?,
            private val confirmedNoUsTaxId: Boolean?,
            private val dateOfBirth: LocalDate?,
            private val identification: Identification?,
            private val name: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and PMB's
             * are disallowed.
             */
            @JsonProperty("address") fun address(): Address? = address

            /**
             * The identification method for an individual can only be a passport, driver's license,
             * or other document if you've confirmed the individual does not have a US tax id
             * (either a Social Security Number or Individual Taxpayer Identification Number).
             */
            @JsonProperty("confirmed_no_us_tax_id")
            fun confirmedNoUsTaxId(): Boolean? = confirmedNoUsTaxId

            /** The person's date of birth in YYYY-MM-DD format. */
            @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate? = dateOfBirth

            /** A means of verifying the person's identity. */
            @JsonProperty("identification") fun identification(): Identification? = identification

            /** The person's legal name. */
            @JsonProperty("name") fun name(): String? = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var address: Address? = null
                private var confirmedNoUsTaxId: Boolean? = null
                private var dateOfBirth: LocalDate? = null
                private var identification: Identification? = null
                private var name: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(grantor: Grantor) = apply {
                    this.address = grantor.address
                    this.confirmedNoUsTaxId = grantor.confirmedNoUsTaxId
                    this.dateOfBirth = grantor.dateOfBirth
                    this.identification = grantor.identification
                    this.name = grantor.name
                    additionalProperties(grantor.additionalProperties)
                }

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
                 */
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

                /** The person's date of birth in YYYY-MM-DD format. */
                @JsonProperty("date_of_birth")
                fun dateOfBirth(dateOfBirth: LocalDate) = apply { this.dateOfBirth = dateOfBirth }

                /** A means of verifying the person's identity. */
                @JsonProperty("identification")
                fun identification(identification: Identification) = apply {
                    this.identification = identification
                }

                /** The person's legal name. */
                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

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
                        checkNotNull(address) { "`address` is required but was not set" },
                        confirmedNoUsTaxId,
                        checkNotNull(dateOfBirth) { "`dateOfBirth` is required but was not set" },
                        checkNotNull(identification) {
                            "`identification` is required but was not set"
                        },
                        checkNotNull(name) { "`name` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and PMB's
             * are disallowed.
             */
            @JsonDeserialize(builder = Address.Builder::class)
            @NoAutoDetect
            class Address
            private constructor(
                private val city: String?,
                private val line1: String?,
                private val line2: String?,
                private val state: String?,
                private val zip: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** The city of the address. */
                @JsonProperty("city") fun city(): String? = city

                /** The first line of the address. This is usually the street number and street. */
                @JsonProperty("line1") fun line1(): String? = line1

                /** The second line of the address. This might be the floor or room number. */
                @JsonProperty("line2") fun line2(): String? = line2

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

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var city: String? = null
                    private var line1: String? = null
                    private var line2: String? = null
                    private var state: String? = null
                    private var zip: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(address: Address) = apply {
                        this.city = address.city
                        this.line1 = address.line1
                        this.line2 = address.line2
                        this.state = address.state
                        this.zip = address.zip
                        additionalProperties(address.additionalProperties)
                    }

                    /** The city of the address. */
                    @JsonProperty("city") fun city(city: String) = apply { this.city = city }

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

                    /** The second line of the address. This might be the floor or room number. */
                    @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

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
                            checkNotNull(city) { "`city` is required but was not set" },
                            checkNotNull(line1) { "`line1` is required but was not set" },
                            line2,
                            checkNotNull(state) { "`state` is required but was not set" },
                            checkNotNull(zip) { "`zip` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Address && this.city == other.city && this.line1 == other.line1 && this.line2 == other.line2 && this.state == other.state && this.zip == other.zip && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(city, line1, line2, state, zip, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Address{city=$city, line1=$line1, line2=$line2, state=$state, zip=$zip, additionalProperties=$additionalProperties}"
            }

            /** A means of verifying the person's identity. */
            @JsonDeserialize(builder = Identification.Builder::class)
            @NoAutoDetect
            class Identification
            private constructor(
                private val driversLicense: DriversLicense?,
                private val method: Method?,
                private val number: String?,
                private val other: Other?,
                private val passport: Passport?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                @JsonProperty("drivers_license")
                fun driversLicense(): DriversLicense? = driversLicense

                /** A method that can be used to verify the individual's identity. */
                @JsonProperty("method") fun method(): Method? = method

                /**
                 * An identification number that can be used to verify the individual's identity,
                 * such as a social security number.
                 */
                @JsonProperty("number") fun number(): String? = number

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                @JsonProperty("other") fun other(): Other? = other

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                @JsonProperty("passport") fun passport(): Passport? = passport

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var driversLicense: DriversLicense? = null
                    private var method: Method? = null
                    private var number: String? = null
                    private var other: Other? = null
                    private var passport: Passport? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(identification: Identification) = apply {
                        this.driversLicense = identification.driversLicense
                        this.method = identification.method
                        this.number = identification.number
                        this.other = identification.other
                        this.passport = identification.passport
                        additionalProperties(identification.additionalProperties)
                    }

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    @JsonProperty("drivers_license")
                    fun driversLicense(driversLicense: DriversLicense) = apply {
                        this.driversLicense = driversLicense
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
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    @JsonProperty("other") fun other(other: Other) = apply { this.other = other }

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    @JsonProperty("passport")
                    fun passport(passport: Passport) = apply { this.passport = passport }

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
                            driversLicense,
                            checkNotNull(method) { "`method` is required but was not set" },
                            checkNotNull(number) { "`number` is required but was not set" },
                            other,
                            passport,
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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Method && this.value == other.value /* spotless:on */
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
                    private val backFileId: String?,
                    private val expirationDate: LocalDate?,
                    private val fileId: String?,
                    private val state: String?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /** The identifier of the File containing the back of the driver's license. */
                    @JsonProperty("back_file_id") fun backFileId(): String? = backFileId

                    /** The driver's license's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(): LocalDate? = expirationDate

                    /** The identifier of the File containing the front of the driver's license. */
                    @JsonProperty("file_id") fun fileId(): String? = fileId

                    /** The state that issued the provided driver's license. */
                    @JsonProperty("state") fun state(): String? = state

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var backFileId: String? = null
                        private var expirationDate: LocalDate? = null
                        private var fileId: String? = null
                        private var state: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(driversLicense: DriversLicense) = apply {
                            this.backFileId = driversLicense.backFileId
                            this.expirationDate = driversLicense.expirationDate
                            this.fileId = driversLicense.fileId
                            this.state = driversLicense.state
                            additionalProperties(driversLicense.additionalProperties)
                        }

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

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        @JsonProperty("file_id")
                        fun fileId(fileId: String) = apply { this.fileId = fileId }

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
                                backFileId,
                                checkNotNull(expirationDate) {
                                    "`expirationDate` is required but was not set"
                                },
                                checkNotNull(fileId) { "`fileId` is required but was not set" },
                                checkNotNull(state) { "`state` is required but was not set" },
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DriversLicense && this.backFileId == other.backFileId && this.expirationDate == other.expirationDate && this.fileId == other.fileId && this.state == other.state && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(backFileId, expirationDate, fileId, state, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "DriversLicense{backFileId=$backFileId, expirationDate=$expirationDate, fileId=$fileId, state=$state, additionalProperties=$additionalProperties}"
                }

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                @JsonDeserialize(builder = Other.Builder::class)
                @NoAutoDetect
                class Other
                private constructor(
                    private val backFileId: String?,
                    private val country: String?,
                    private val description: String?,
                    private val expirationDate: LocalDate?,
                    private val fileId: String?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /**
                     * The identifier of the File containing the back of the document. Not every
                     * document has a reverse side.
                     */
                    @JsonProperty("back_file_id") fun backFileId(): String? = backFileId

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

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var backFileId: String? = null
                        private var country: String? = null
                        private var description: String? = null
                        private var expirationDate: LocalDate? = null
                        private var fileId: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(other: Other) = apply {
                            this.backFileId = other.backFileId
                            this.country = other.country
                            this.description = other.description
                            this.expirationDate = other.expirationDate
                            this.fileId = other.fileId
                            additionalProperties(other.additionalProperties)
                        }

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        @JsonProperty("back_file_id")
                        fun backFileId(backFileId: String) = apply { this.backFileId = backFileId }

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
                                backFileId,
                                checkNotNull(country) { "`country` is required but was not set" },
                                checkNotNull(description) {
                                    "`description` is required but was not set"
                                },
                                expirationDate,
                                checkNotNull(fileId) { "`fileId` is required but was not set" },
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Other && this.backFileId == other.backFileId && this.country == other.country && this.description == other.description && this.expirationDate == other.expirationDate && this.fileId == other.fileId && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(backFileId, country, description, expirationDate, fileId, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Other{backFileId=$backFileId, country=$country, description=$description, expirationDate=$expirationDate, fileId=$fileId, additionalProperties=$additionalProperties}"
                }

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                @JsonDeserialize(builder = Passport.Builder::class)
                @NoAutoDetect
                class Passport
                private constructor(
                    private val country: String?,
                    private val expirationDate: LocalDate?,
                    private val fileId: String?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /** The country that issued the passport. */
                    @JsonProperty("country") fun country(): String? = country

                    /** The passport's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(): LocalDate? = expirationDate

                    /** The identifier of the File containing the passport. */
                    @JsonProperty("file_id") fun fileId(): String? = fileId

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var country: String? = null
                        private var expirationDate: LocalDate? = null
                        private var fileId: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(passport: Passport) = apply {
                            this.country = passport.country
                            this.expirationDate = passport.expirationDate
                            this.fileId = passport.fileId
                            additionalProperties(passport.additionalProperties)
                        }

                        /** The country that issued the passport. */
                        @JsonProperty("country")
                        fun country(country: String) = apply { this.country = country }

                        /** The passport's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(expirationDate: LocalDate) = apply {
                            this.expirationDate = expirationDate
                        }

                        /** The identifier of the File containing the passport. */
                        @JsonProperty("file_id")
                        fun fileId(fileId: String) = apply { this.fileId = fileId }

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
                                checkNotNull(country) { "`country` is required but was not set" },
                                checkNotNull(expirationDate) {
                                    "`expirationDate` is required but was not set"
                                },
                                checkNotNull(fileId) { "`fileId` is required but was not set" },
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Passport && this.country == other.country && this.expirationDate == other.expirationDate && this.fileId == other.fileId && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(country, expirationDate, fileId, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Passport{country=$country, expirationDate=$expirationDate, fileId=$fileId, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Identification && this.driversLicense == other.driversLicense && this.method == other.method && this.number == other.number && this.other == other.other && this.passport == other.passport && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(driversLicense, method, number, other, passport, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Identification{driversLicense=$driversLicense, method=$method, number=$number, other=$other, passport=$passport, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Grantor && this.address == other.address && this.confirmedNoUsTaxId == other.confirmedNoUsTaxId && this.dateOfBirth == other.dateOfBirth && this.identification == other.identification && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(address, confirmedNoUsTaxId, dateOfBirth, identification, name, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Grantor{address=$address, confirmedNoUsTaxId=$confirmedNoUsTaxId, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Trust && this.address == other.address && this.category == other.category && this.formationDocumentFileId == other.formationDocumentFileId && this.formationState == other.formationState && this.grantor == other.grantor && this.name == other.name && this.taxIdentifier == other.taxIdentifier && this.trustees == other.trustees && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(address, category, formationDocumentFileId, formationState, grantor, name, taxIdentifier, trustees, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Trust{address=$address, category=$category, formationDocumentFileId=$formationDocumentFileId, formationState=$formationState, grantor=$grantor, name=$name, taxIdentifier=$taxIdentifier, trustees=$trustees, additionalProperties=$additionalProperties}"
    }
}
