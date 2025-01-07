// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

/** Create an Entity */
class EntityCreateParams
constructor(
    private val body: EntityCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The type of Entity to create. */
    fun structure(): Structure = body.structure()

    /**
     * Details of the corporation entity to create. Required if `structure` is equal to
     * `corporation`.
     */
    fun corporation(): Optional<Corporation> = body.corporation()

    /** The description you choose to give the entity. */
    fun description(): Optional<String> = body.description()

    /**
     * Details of the Government Authority entity to create. Required if `structure` is equal to
     * `Government Authority`.
     */
    fun governmentAuthority(): Optional<GovernmentAuthority> = body.governmentAuthority()

    /** Details of the joint entity to create. Required if `structure` is equal to `joint`. */
    fun joint(): Optional<Joint> = body.joint()

    /**
     * Details of the natural person entity to create. Required if `structure` is equal to
     * `natural_person`. Natural people entities should be submitted with `social_security_number`
     * or `individual_taxpayer_identification_number` identification methods.
     */
    fun naturalPerson(): Optional<NaturalPerson> = body.naturalPerson()

    /** Additional documentation associated with the entity. */
    fun supplementalDocuments(): Optional<List<SupplementalDocument>> = body.supplementalDocuments()

    /**
     * A reference to data stored in a third-party verification service. Your integration may or may
     * not use this field.
     */
    fun thirdPartyVerification(): Optional<ThirdPartyVerification> = body.thirdPartyVerification()

    /** Details of the trust entity to create. Required if `structure` is equal to `trust`. */
    fun trust(): Optional<Trust> = body.trust()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): EntityCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class EntityCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("structure") private val structure: Structure,
        @JsonProperty("corporation") private val corporation: Corporation?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("government_authority") private val governmentAuthority: GovernmentAuthority?,
        @JsonProperty("joint") private val joint: Joint?,
        @JsonProperty("natural_person") private val naturalPerson: NaturalPerson?,
        @JsonProperty("supplemental_documents")
        private val supplementalDocuments: List<SupplementalDocument>?,
        @JsonProperty("third_party_verification")
        private val thirdPartyVerification: ThirdPartyVerification?,
        @JsonProperty("trust") private val trust: Trust?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The type of Entity to create. */
        @JsonProperty("structure") fun structure(): Structure = structure

        /**
         * Details of the corporation entity to create. Required if `structure` is equal to
         * `corporation`.
         */
        @JsonProperty("corporation")
        fun corporation(): Optional<Corporation> = Optional.ofNullable(corporation)

        /** The description you choose to give the entity. */
        @JsonProperty("description")
        fun description(): Optional<String> = Optional.ofNullable(description)

        /**
         * Details of the Government Authority entity to create. Required if `structure` is equal to
         * `Government Authority`.
         */
        @JsonProperty("government_authority")
        fun governmentAuthority(): Optional<GovernmentAuthority> =
            Optional.ofNullable(governmentAuthority)

        /** Details of the joint entity to create. Required if `structure` is equal to `joint`. */
        @JsonProperty("joint") fun joint(): Optional<Joint> = Optional.ofNullable(joint)

        /**
         * Details of the natural person entity to create. Required if `structure` is equal to
         * `natural_person`. Natural people entities should be submitted with
         * `social_security_number` or `individual_taxpayer_identification_number` identification
         * methods.
         */
        @JsonProperty("natural_person")
        fun naturalPerson(): Optional<NaturalPerson> = Optional.ofNullable(naturalPerson)

        /** Additional documentation associated with the entity. */
        @JsonProperty("supplemental_documents")
        fun supplementalDocuments(): Optional<List<SupplementalDocument>> =
            Optional.ofNullable(supplementalDocuments)

        /**
         * A reference to data stored in a third-party verification service. Your integration may or
         * may not use this field.
         */
        @JsonProperty("third_party_verification")
        fun thirdPartyVerification(): Optional<ThirdPartyVerification> =
            Optional.ofNullable(thirdPartyVerification)

        /** Details of the trust entity to create. Required if `structure` is equal to `trust`. */
        @JsonProperty("trust") fun trust(): Optional<Trust> = Optional.ofNullable(trust)

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
            private var supplementalDocuments: MutableList<SupplementalDocument>? = null
            private var thirdPartyVerification: ThirdPartyVerification? = null
            private var trust: Trust? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entityCreateBody: EntityCreateBody) = apply {
                structure = entityCreateBody.structure
                corporation = entityCreateBody.corporation
                description = entityCreateBody.description
                governmentAuthority = entityCreateBody.governmentAuthority
                joint = entityCreateBody.joint
                naturalPerson = entityCreateBody.naturalPerson
                supplementalDocuments = entityCreateBody.supplementalDocuments?.toMutableList()
                thirdPartyVerification = entityCreateBody.thirdPartyVerification
                trust = entityCreateBody.trust
                additionalProperties = entityCreateBody.additionalProperties.toMutableMap()
            }

            /** The type of Entity to create. */
            fun structure(structure: Structure) = apply { this.structure = structure }

            /**
             * Details of the corporation entity to create. Required if `structure` is equal to
             * `corporation`.
             */
            fun corporation(corporation: Corporation?) = apply { this.corporation = corporation }

            /**
             * Details of the corporation entity to create. Required if `structure` is equal to
             * `corporation`.
             */
            fun corporation(corporation: Optional<Corporation>) =
                corporation(corporation.orElse(null))

            /** The description you choose to give the entity. */
            fun description(description: String?) = apply { this.description = description }

            /** The description you choose to give the entity. */
            fun description(description: Optional<String>) = description(description.orElse(null))

            /**
             * Details of the Government Authority entity to create. Required if `structure` is
             * equal to `Government Authority`.
             */
            fun governmentAuthority(governmentAuthority: GovernmentAuthority?) = apply {
                this.governmentAuthority = governmentAuthority
            }

            /**
             * Details of the Government Authority entity to create. Required if `structure` is
             * equal to `Government Authority`.
             */
            fun governmentAuthority(governmentAuthority: Optional<GovernmentAuthority>) =
                governmentAuthority(governmentAuthority.orElse(null))

            /**
             * Details of the joint entity to create. Required if `structure` is equal to `joint`.
             */
            fun joint(joint: Joint?) = apply { this.joint = joint }

            /**
             * Details of the joint entity to create. Required if `structure` is equal to `joint`.
             */
            fun joint(joint: Optional<Joint>) = joint(joint.orElse(null))

            /**
             * Details of the natural person entity to create. Required if `structure` is equal to
             * `natural_person`. Natural people entities should be submitted with
             * `social_security_number` or `individual_taxpayer_identification_number`
             * identification methods.
             */
            fun naturalPerson(naturalPerson: NaturalPerson?) = apply {
                this.naturalPerson = naturalPerson
            }

            /**
             * Details of the natural person entity to create. Required if `structure` is equal to
             * `natural_person`. Natural people entities should be submitted with
             * `social_security_number` or `individual_taxpayer_identification_number`
             * identification methods.
             */
            fun naturalPerson(naturalPerson: Optional<NaturalPerson>) =
                naturalPerson(naturalPerson.orElse(null))

            /** Additional documentation associated with the entity. */
            fun supplementalDocuments(supplementalDocuments: List<SupplementalDocument>?) = apply {
                this.supplementalDocuments = supplementalDocuments?.toMutableList()
            }

            /** Additional documentation associated with the entity. */
            fun supplementalDocuments(supplementalDocuments: Optional<List<SupplementalDocument>>) =
                supplementalDocuments(supplementalDocuments.orElse(null))

            /** Additional documentation associated with the entity. */
            fun addSupplementalDocument(supplementalDocument: SupplementalDocument) = apply {
                supplementalDocuments =
                    (supplementalDocuments ?: mutableListOf()).apply { add(supplementalDocument) }
            }

            /**
             * A reference to data stored in a third-party verification service. Your integration
             * may or may not use this field.
             */
            fun thirdPartyVerification(thirdPartyVerification: ThirdPartyVerification?) = apply {
                this.thirdPartyVerification = thirdPartyVerification
            }

            /**
             * A reference to data stored in a third-party verification service. Your integration
             * may or may not use this field.
             */
            fun thirdPartyVerification(thirdPartyVerification: Optional<ThirdPartyVerification>) =
                thirdPartyVerification(thirdPartyVerification.orElse(null))

            /**
             * Details of the trust entity to create. Required if `structure` is equal to `trust`.
             */
            fun trust(trust: Trust?) = apply { this.trust = trust }

            /**
             * Details of the trust entity to create. Required if `structure` is equal to `trust`.
             */
            fun trust(trust: Optional<Trust>) = trust(trust.orElse(null))

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

            return /* spotless:off */ other is EntityCreateBody && structure == other.structure && corporation == other.corporation && description == other.description && governmentAuthority == other.governmentAuthority && joint == other.joint && naturalPerson == other.naturalPerson && supplementalDocuments == other.supplementalDocuments && thirdPartyVerification == other.thirdPartyVerification && trust == other.trust && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(structure, corporation, description, governmentAuthority, joint, naturalPerson, supplementalDocuments, thirdPartyVerification, trust, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EntityCreateBody{structure=$structure, corporation=$corporation, description=$description, governmentAuthority=$governmentAuthority, joint=$joint, naturalPerson=$naturalPerson, supplementalDocuments=$supplementalDocuments, thirdPartyVerification=$thirdPartyVerification, trust=$trust, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: EntityCreateBody.Builder = EntityCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(entityCreateParams: EntityCreateParams) = apply {
            body = entityCreateParams.body.toBuilder()
            additionalHeaders = entityCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = entityCreateParams.additionalQueryParams.toBuilder()
        }

        /** The type of Entity to create. */
        fun structure(structure: Structure) = apply { body.structure(structure) }

        /**
         * Details of the corporation entity to create. Required if `structure` is equal to
         * `corporation`.
         */
        fun corporation(corporation: Corporation?) = apply { body.corporation(corporation) }

        /**
         * Details of the corporation entity to create. Required if `structure` is equal to
         * `corporation`.
         */
        fun corporation(corporation: Optional<Corporation>) = corporation(corporation.orElse(null))

        /** The description you choose to give the entity. */
        fun description(description: String?) = apply { body.description(description) }

        /** The description you choose to give the entity. */
        fun description(description: Optional<String>) = description(description.orElse(null))

        /**
         * Details of the Government Authority entity to create. Required if `structure` is equal to
         * `Government Authority`.
         */
        fun governmentAuthority(governmentAuthority: GovernmentAuthority?) = apply {
            body.governmentAuthority(governmentAuthority)
        }

        /**
         * Details of the Government Authority entity to create. Required if `structure` is equal to
         * `Government Authority`.
         */
        fun governmentAuthority(governmentAuthority: Optional<GovernmentAuthority>) =
            governmentAuthority(governmentAuthority.orElse(null))

        /** Details of the joint entity to create. Required if `structure` is equal to `joint`. */
        fun joint(joint: Joint?) = apply { body.joint(joint) }

        /** Details of the joint entity to create. Required if `structure` is equal to `joint`. */
        fun joint(joint: Optional<Joint>) = joint(joint.orElse(null))

        /**
         * Details of the natural person entity to create. Required if `structure` is equal to
         * `natural_person`. Natural people entities should be submitted with
         * `social_security_number` or `individual_taxpayer_identification_number` identification
         * methods.
         */
        fun naturalPerson(naturalPerson: NaturalPerson?) = apply {
            body.naturalPerson(naturalPerson)
        }

        /**
         * Details of the natural person entity to create. Required if `structure` is equal to
         * `natural_person`. Natural people entities should be submitted with
         * `social_security_number` or `individual_taxpayer_identification_number` identification
         * methods.
         */
        fun naturalPerson(naturalPerson: Optional<NaturalPerson>) =
            naturalPerson(naturalPerson.orElse(null))

        /** Additional documentation associated with the entity. */
        fun supplementalDocuments(supplementalDocuments: List<SupplementalDocument>?) = apply {
            body.supplementalDocuments(supplementalDocuments)
        }

        /** Additional documentation associated with the entity. */
        fun supplementalDocuments(supplementalDocuments: Optional<List<SupplementalDocument>>) =
            supplementalDocuments(supplementalDocuments.orElse(null))

        /** Additional documentation associated with the entity. */
        fun addSupplementalDocument(supplementalDocument: SupplementalDocument) = apply {
            body.addSupplementalDocument(supplementalDocument)
        }

        /**
         * A reference to data stored in a third-party verification service. Your integration may or
         * may not use this field.
         */
        fun thirdPartyVerification(thirdPartyVerification: ThirdPartyVerification?) = apply {
            body.thirdPartyVerification(thirdPartyVerification)
        }

        /**
         * A reference to data stored in a third-party verification service. Your integration may or
         * may not use this field.
         */
        fun thirdPartyVerification(thirdPartyVerification: Optional<ThirdPartyVerification>) =
            thirdPartyVerification(thirdPartyVerification.orElse(null))

        /** Details of the trust entity to create. Required if `structure` is equal to `trust`. */
        fun trust(trust: Trust?) = apply { body.trust(trust) }

        /** Details of the trust entity to create. Required if `structure` is equal to `trust`. */
        fun trust(trust: Optional<Trust>) = trust(trust.orElse(null))

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

        fun build(): EntityCreateParams =
            EntityCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
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
     * Details of the corporation entity to create. Required if `structure` is equal to
     * `corporation`.
     */
    @NoAutoDetect
    class Corporation
    @JsonCreator
    private constructor(
        @JsonProperty("address") private val address: Address,
        @JsonProperty("beneficial_owners") private val beneficialOwners: List<BeneficialOwner>,
        @JsonProperty("name") private val name: String,
        @JsonProperty("tax_identifier") private val taxIdentifier: String,
        @JsonProperty("incorporation_state") private val incorporationState: String?,
        @JsonProperty("industry_code") private val industryCode: String?,
        @JsonProperty("website") private val website: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        @JsonProperty("address") fun address(): Address = address

        /**
         * The identifying details of anyone controlling or owning 25% or more of the corporation.
         */
        @JsonProperty("beneficial_owners")
        fun beneficialOwners(): List<BeneficialOwner> = beneficialOwners

        /** The legal name of the corporation. */
        @JsonProperty("name") fun name(): String = name

        /** The Employer Identification Number (EIN) for the corporation. */
        @JsonProperty("tax_identifier") fun taxIdentifier(): String = taxIdentifier

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the corporation's
         * state of incorporation.
         */
        @JsonProperty("incorporation_state")
        fun incorporationState(): Optional<String> = Optional.ofNullable(incorporationState)

        /**
         * The North American Industry Classification System (NAICS) code for the corporation's
         * primary line of business. This is a number, like `5132` for `Software Publishers`. A full
         * list of classification codes is available
         * [here](https://increase.com/documentation/data-dictionary#north-american-industry-classification-system-codes).
         */
        @JsonProperty("industry_code")
        fun industryCode(): Optional<String> = Optional.ofNullable(industryCode)

        /** The website of the corporation. */
        @JsonProperty("website") fun website(): Optional<String> = Optional.ofNullable(website)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address: Address? = null
            private var beneficialOwners: MutableList<BeneficialOwner>? = null
            private var name: String? = null
            private var taxIdentifier: String? = null
            private var incorporationState: String? = null
            private var industryCode: String? = null
            private var website: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(corporation: Corporation) = apply {
                address = corporation.address
                beneficialOwners = corporation.beneficialOwners.toMutableList()
                name = corporation.name
                taxIdentifier = corporation.taxIdentifier
                incorporationState = corporation.incorporationState
                industryCode = corporation.industryCode
                website = corporation.website
                additionalProperties = corporation.additionalProperties.toMutableMap()
            }

            /**
             * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
             * disallowed.
             */
            fun address(address: Address) = apply { this.address = address }

            /**
             * The identifying details of anyone controlling or owning 25% or more of the
             * corporation.
             */
            fun beneficialOwners(beneficialOwners: List<BeneficialOwner>) = apply {
                this.beneficialOwners = beneficialOwners.toMutableList()
            }

            /**
             * The identifying details of anyone controlling or owning 25% or more of the
             * corporation.
             */
            fun addBeneficialOwner(beneficialOwner: BeneficialOwner) = apply {
                beneficialOwners =
                    (beneficialOwners ?: mutableListOf()).apply { add(beneficialOwner) }
            }

            /** The legal name of the corporation. */
            fun name(name: String) = apply { this.name = name }

            /** The Employer Identification Number (EIN) for the corporation. */
            fun taxIdentifier(taxIdentifier: String) = apply { this.taxIdentifier = taxIdentifier }

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the corporation's
             * state of incorporation.
             */
            fun incorporationState(incorporationState: String?) = apply {
                this.incorporationState = incorporationState
            }

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the corporation's
             * state of incorporation.
             */
            fun incorporationState(incorporationState: Optional<String>) =
                incorporationState(incorporationState.orElse(null))

            /**
             * The North American Industry Classification System (NAICS) code for the corporation's
             * primary line of business. This is a number, like `5132` for `Software Publishers`. A
             * full list of classification codes is available
             * [here](https://increase.com/documentation/data-dictionary#north-american-industry-classification-system-codes).
             */
            fun industryCode(industryCode: String?) = apply { this.industryCode = industryCode }

            /**
             * The North American Industry Classification System (NAICS) code for the corporation's
             * primary line of business. This is a number, like `5132` for `Software Publishers`. A
             * full list of classification codes is available
             * [here](https://increase.com/documentation/data-dictionary#north-american-industry-classification-system-codes).
             */
            fun industryCode(industryCode: Optional<String>) =
                industryCode(industryCode.orElse(null))

            /** The website of the corporation. */
            fun website(website: String?) = apply { this.website = website }

            /** The website of the corporation. */
            fun website(website: Optional<String>) = website(website.orElse(null))

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
                    checkNotNull(address) { "`address` is required but was not set" },
                    checkNotNull(beneficialOwners) {
                            "`beneficialOwners` is required but was not set"
                        }
                        .toImmutable(),
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(taxIdentifier) { "`taxIdentifier` is required but was not set" },
                    incorporationState,
                    industryCode,
                    website,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        @NoAutoDetect
        class Address
        @JsonCreator
        private constructor(
            @JsonProperty("city") private val city: String,
            @JsonProperty("line1") private val line1: String,
            @JsonProperty("state") private val state: String,
            @JsonProperty("zip") private val zip: String,
            @JsonProperty("line2") private val line2: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The city of the address. */
            @JsonProperty("city") fun city(): String = city

            /** The first line of the address. This is usually the street number and street. */
            @JsonProperty("line1") fun line1(): String = line1

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") fun state(): String = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") fun zip(): String = zip

            /** The second line of the address. This might be the floor or room number. */
            @JsonProperty("line2") fun line2(): Optional<String> = Optional.ofNullable(line2)

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
                private var state: String? = null
                private var zip: String? = null
                private var line2: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    city = address.city
                    line1 = address.line1
                    state = address.state
                    zip = address.zip
                    line2 = address.line2
                    additionalProperties = address.additionalProperties.toMutableMap()
                }

                /** The city of the address. */
                fun city(city: String) = apply { this.city = city }

                /** The first line of the address. This is usually the street number and street. */
                fun line1(line1: String) = apply { this.line1 = line1 }

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                fun state(state: String) = apply { this.state = state }

                /** The ZIP code of the address. */
                fun zip(zip: String) = apply { this.zip = zip }

                /** The second line of the address. This might be the floor or room number. */
                fun line2(line2: String?) = apply { this.line2 = line2 }

                /** The second line of the address. This might be the floor or room number. */
                fun line2(line2: Optional<String>) = line2(line2.orElse(null))

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
                        checkNotNull(city) { "`city` is required but was not set" },
                        checkNotNull(line1) { "`line1` is required but was not set" },
                        checkNotNull(state) { "`state` is required but was not set" },
                        checkNotNull(zip) { "`zip` is required but was not set" },
                        line2,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Address && city == other.city && line1 == other.line1 && state == other.state && zip == other.zip && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(city, line1, state, zip, line2, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{city=$city, line1=$line1, state=$state, zip=$zip, line2=$line2, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class BeneficialOwner
        @JsonCreator
        private constructor(
            @JsonProperty("individual") private val individual: Individual,
            @JsonProperty("prongs") private val prongs: List<Prong>,
            @JsonProperty("company_title") private val companyTitle: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Personal details for the beneficial owner. */
            @JsonProperty("individual") fun individual(): Individual = individual

            /**
             * Why this person is considered a beneficial owner of the entity. At least one option
             * is required, if a person is both a control person and owner, submit an array
             * containing both.
             */
            @JsonProperty("prongs") fun prongs(): List<Prong> = prongs

            /** This person's role or title within the entity. */
            @JsonProperty("company_title")
            fun companyTitle(): Optional<String> = Optional.ofNullable(companyTitle)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var individual: Individual? = null
                private var prongs: MutableList<Prong>? = null
                private var companyTitle: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(beneficialOwner: BeneficialOwner) = apply {
                    individual = beneficialOwner.individual
                    prongs = beneficialOwner.prongs.toMutableList()
                    companyTitle = beneficialOwner.companyTitle
                    additionalProperties = beneficialOwner.additionalProperties.toMutableMap()
                }

                /** Personal details for the beneficial owner. */
                fun individual(individual: Individual) = apply { this.individual = individual }

                /**
                 * Why this person is considered a beneficial owner of the entity. At least one
                 * option is required, if a person is both a control person and owner, submit an
                 * array containing both.
                 */
                fun prongs(prongs: List<Prong>) = apply { this.prongs = prongs.toMutableList() }

                /**
                 * Why this person is considered a beneficial owner of the entity. At least one
                 * option is required, if a person is both a control person and owner, submit an
                 * array containing both.
                 */
                fun addProng(prong: Prong) = apply {
                    prongs = (prongs ?: mutableListOf()).apply { add(prong) }
                }

                /** This person's role or title within the entity. */
                fun companyTitle(companyTitle: String?) = apply { this.companyTitle = companyTitle }

                /** This person's role or title within the entity. */
                fun companyTitle(companyTitle: Optional<String>) =
                    companyTitle(companyTitle.orElse(null))

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
                        checkNotNull(individual) { "`individual` is required but was not set" },
                        checkNotNull(prongs) { "`prongs` is required but was not set" }
                            .toImmutable(),
                        companyTitle,
                        additionalProperties.toImmutable(),
                    )
            }

            /** Personal details for the beneficial owner. */
            @NoAutoDetect
            class Individual
            @JsonCreator
            private constructor(
                @JsonProperty("address") private val address: Address,
                @JsonProperty("date_of_birth") private val dateOfBirth: LocalDate,
                @JsonProperty("identification") private val identification: Identification,
                @JsonProperty("name") private val name: String,
                @JsonProperty("confirmed_no_us_tax_id") private val confirmedNoUsTaxId: Boolean?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
                 */
                @JsonProperty("address") fun address(): Address = address

                /** The person's date of birth in YYYY-MM-DD format. */
                @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate = dateOfBirth

                /** A means of verifying the person's identity. */
                @JsonProperty("identification")
                fun identification(): Identification = identification

                /** The person's legal name. */
                @JsonProperty("name") fun name(): String = name

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                @JsonProperty("confirmed_no_us_tax_id")
                fun confirmedNoUsTaxId(): Optional<Boolean> =
                    Optional.ofNullable(confirmedNoUsTaxId)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var address: Address? = null
                    private var dateOfBirth: LocalDate? = null
                    private var identification: Identification? = null
                    private var name: String? = null
                    private var confirmedNoUsTaxId: Boolean? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(individual: Individual) = apply {
                        address = individual.address
                        dateOfBirth = individual.dateOfBirth
                        identification = individual.identification
                        name = individual.name
                        confirmedNoUsTaxId = individual.confirmedNoUsTaxId
                        additionalProperties = individual.additionalProperties.toMutableMap()
                    }

                    /**
                     * The individual's physical address. Mail receiving locations like PO Boxes and
                     * PMB's are disallowed.
                     */
                    fun address(address: Address) = apply { this.address = address }

                    /** The person's date of birth in YYYY-MM-DD format. */
                    fun dateOfBirth(dateOfBirth: LocalDate) = apply {
                        this.dateOfBirth = dateOfBirth
                    }

                    /** A means of verifying the person's identity. */
                    fun identification(identification: Identification) = apply {
                        this.identification = identification
                    }

                    /** The person's legal name. */
                    fun name(name: String) = apply { this.name = name }

                    /**
                     * The identification method for an individual can only be a passport, driver's
                     * license, or other document if you've confirmed the individual does not have a
                     * US tax id (either a Social Security Number or Individual Taxpayer
                     * Identification Number).
                     */
                    fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean?) = apply {
                        this.confirmedNoUsTaxId = confirmedNoUsTaxId
                    }

                    /**
                     * The identification method for an individual can only be a passport, driver's
                     * license, or other document if you've confirmed the individual does not have a
                     * US tax id (either a Social Security Number or Individual Taxpayer
                     * Identification Number).
                     */
                    fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean) =
                        confirmedNoUsTaxId(confirmedNoUsTaxId as Boolean?)

                    /**
                     * The identification method for an individual can only be a passport, driver's
                     * license, or other document if you've confirmed the individual does not have a
                     * US tax id (either a Social Security Number or Individual Taxpayer
                     * Identification Number).
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun confirmedNoUsTaxId(confirmedNoUsTaxId: Optional<Boolean>) =
                        confirmedNoUsTaxId(confirmedNoUsTaxId.orElse(null) as Boolean?)

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
                            checkNotNull(address) { "`address` is required but was not set" },
                            checkNotNull(dateOfBirth) {
                                "`dateOfBirth` is required but was not set"
                            },
                            checkNotNull(identification) {
                                "`identification` is required but was not set"
                            },
                            checkNotNull(name) { "`name` is required but was not set" },
                            confirmedNoUsTaxId,
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
                 */
                @NoAutoDetect
                class Address
                @JsonCreator
                private constructor(
                    @JsonProperty("city") private val city: String,
                    @JsonProperty("line1") private val line1: String,
                    @JsonProperty("state") private val state: String,
                    @JsonProperty("zip") private val zip: String,
                    @JsonProperty("line2") private val line2: String?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The city of the address. */
                    @JsonProperty("city") fun city(): String = city

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    @JsonProperty("line1") fun line1(): String = line1

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    @JsonProperty("state") fun state(): String = state

                    /** The ZIP code of the address. */
                    @JsonProperty("zip") fun zip(): String = zip

                    /** The second line of the address. This might be the floor or room number. */
                    @JsonProperty("line2")
                    fun line2(): Optional<String> = Optional.ofNullable(line2)

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
                        private var state: String? = null
                        private var zip: String? = null
                        private var line2: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(address: Address) = apply {
                            city = address.city
                            line1 = address.line1
                            state = address.state
                            zip = address.zip
                            line2 = address.line2
                            additionalProperties = address.additionalProperties.toMutableMap()
                        }

                        /** The city of the address. */
                        fun city(city: String) = apply { this.city = city }

                        /**
                         * The first line of the address. This is usually the street number and
                         * street.
                         */
                        fun line1(line1: String) = apply { this.line1 = line1 }

                        /**
                         * The two-letter United States Postal Service (USPS) abbreviation for the
                         * state of the address.
                         */
                        fun state(state: String) = apply { this.state = state }

                        /** The ZIP code of the address. */
                        fun zip(zip: String) = apply { this.zip = zip }

                        /**
                         * The second line of the address. This might be the floor or room number.
                         */
                        fun line2(line2: String?) = apply { this.line2 = line2 }

                        /**
                         * The second line of the address. This might be the floor or room number.
                         */
                        fun line2(line2: Optional<String>) = line2(line2.orElse(null))

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
                                checkNotNull(city) { "`city` is required but was not set" },
                                checkNotNull(line1) { "`line1` is required but was not set" },
                                checkNotNull(state) { "`state` is required but was not set" },
                                checkNotNull(zip) { "`zip` is required but was not set" },
                                line2,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Address && city == other.city && line1 == other.line1 && state == other.state && zip == other.zip && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(city, line1, state, zip, line2, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Address{city=$city, line1=$line1, state=$state, zip=$zip, line2=$line2, additionalProperties=$additionalProperties}"
                }

                /** A means of verifying the person's identity. */
                @NoAutoDetect
                class Identification
                @JsonCreator
                private constructor(
                    @JsonProperty("method") private val method: Method,
                    @JsonProperty("number") private val number: String,
                    @JsonProperty("drivers_license") private val driversLicense: DriversLicense?,
                    @JsonProperty("other") private val other: Other?,
                    @JsonProperty("passport") private val passport: Passport?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** A method that can be used to verify the individual's identity. */
                    @JsonProperty("method") fun method(): Method = method

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     */
                    @JsonProperty("number") fun number(): String = number

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    @JsonProperty("drivers_license")
                    fun driversLicense(): Optional<DriversLicense> =
                        Optional.ofNullable(driversLicense)

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    @JsonProperty("other") fun other(): Optional<Other> = Optional.ofNullable(other)

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    @JsonProperty("passport")
                    fun passport(): Optional<Passport> = Optional.ofNullable(passport)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var method: Method? = null
                        private var number: String? = null
                        private var driversLicense: DriversLicense? = null
                        private var other: Other? = null
                        private var passport: Passport? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(identification: Identification) = apply {
                            method = identification.method
                            number = identification.number
                            driversLicense = identification.driversLicense
                            other = identification.other
                            passport = identification.passport
                            additionalProperties =
                                identification.additionalProperties.toMutableMap()
                        }

                        /** A method that can be used to verify the individual's identity. */
                        fun method(method: Method) = apply { this.method = method }

                        /**
                         * An identification number that can be used to verify the individual's
                         * identity, such as a social security number.
                         */
                        fun number(number: String) = apply { this.number = number }

                        /**
                         * Information about the United States driver's license used for
                         * identification. Required if `method` is equal to `drivers_license`.
                         */
                        fun driversLicense(driversLicense: DriversLicense?) = apply {
                            this.driversLicense = driversLicense
                        }

                        /**
                         * Information about the United States driver's license used for
                         * identification. Required if `method` is equal to `drivers_license`.
                         */
                        fun driversLicense(driversLicense: Optional<DriversLicense>) =
                            driversLicense(driversLicense.orElse(null))

                        /**
                         * Information about the identification document provided. Required if
                         * `method` is equal to `other`.
                         */
                        fun other(other: Other?) = apply { this.other = other }

                        /**
                         * Information about the identification document provided. Required if
                         * `method` is equal to `other`.
                         */
                        fun other(other: Optional<Other>) = other(other.orElse(null))

                        /**
                         * Information about the passport used for identification. Required if
                         * `method` is equal to `passport`.
                         */
                        fun passport(passport: Passport?) = apply { this.passport = passport }

                        /**
                         * Information about the passport used for identification. Required if
                         * `method` is equal to `passport`.
                         */
                        fun passport(passport: Optional<Passport>) = passport(passport.orElse(null))

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
                                checkNotNull(method) { "`method` is required but was not set" },
                                checkNotNull(number) { "`number` is required but was not set" },
                                driversLicense,
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

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    @NoAutoDetect
                    class DriversLicense
                    @JsonCreator
                    private constructor(
                        @JsonProperty("expiration_date") private val expirationDate: LocalDate,
                        @JsonProperty("file_id") private val fileId: String,
                        @JsonProperty("state") private val state: String,
                        @JsonProperty("back_file_id") private val backFileId: String?,
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        /** The driver's license's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(): LocalDate = expirationDate

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        @JsonProperty("file_id") fun fileId(): String = fileId

                        /** The state that issued the provided driver's license. */
                        @JsonProperty("state") fun state(): String = state

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        @JsonProperty("back_file_id")
                        fun backFileId(): Optional<String> = Optional.ofNullable(backFileId)

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var expirationDate: LocalDate? = null
                            private var fileId: String? = null
                            private var state: String? = null
                            private var backFileId: String? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(driversLicense: DriversLicense) = apply {
                                expirationDate = driversLicense.expirationDate
                                fileId = driversLicense.fileId
                                state = driversLicense.state
                                backFileId = driversLicense.backFileId
                                additionalProperties =
                                    driversLicense.additionalProperties.toMutableMap()
                            }

                            /** The driver's license's expiration date in YYYY-MM-DD format. */
                            fun expirationDate(expirationDate: LocalDate) = apply {
                                this.expirationDate = expirationDate
                            }

                            /**
                             * The identifier of the File containing the front of the driver's
                             * license.
                             */
                            fun fileId(fileId: String) = apply { this.fileId = fileId }

                            /** The state that issued the provided driver's license. */
                            fun state(state: String) = apply { this.state = state }

                            /**
                             * The identifier of the File containing the back of the driver's
                             * license.
                             */
                            fun backFileId(backFileId: String?) = apply {
                                this.backFileId = backFileId
                            }

                            /**
                             * The identifier of the File containing the back of the driver's
                             * license.
                             */
                            fun backFileId(backFileId: Optional<String>) =
                                backFileId(backFileId.orElse(null))

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

                            fun build(): DriversLicense =
                                DriversLicense(
                                    checkNotNull(expirationDate) {
                                        "`expirationDate` is required but was not set"
                                    },
                                    checkNotNull(fileId) { "`fileId` is required but was not set" },
                                    checkNotNull(state) { "`state` is required but was not set" },
                                    backFileId,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is DriversLicense && expirationDate == other.expirationDate && fileId == other.fileId && state == other.state && backFileId == other.backFileId && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(expirationDate, fileId, state, backFileId, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "DriversLicense{expirationDate=$expirationDate, fileId=$fileId, state=$state, backFileId=$backFileId, additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    @NoAutoDetect
                    class Other
                    @JsonCreator
                    private constructor(
                        @JsonProperty("country") private val country: String,
                        @JsonProperty("description") private val description: String,
                        @JsonProperty("file_id") private val fileId: String,
                        @JsonProperty("back_file_id") private val backFileId: String?,
                        @JsonProperty("expiration_date") private val expirationDate: LocalDate?,
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        /**
                         * The two-character ISO 3166-1 code representing the country that issued
                         * the document.
                         */
                        @JsonProperty("country") fun country(): String = country

                        /** A description of the document submitted. */
                        @JsonProperty("description") fun description(): String = description

                        /** The identifier of the File containing the front of the document. */
                        @JsonProperty("file_id") fun fileId(): String = fileId

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        @JsonProperty("back_file_id")
                        fun backFileId(): Optional<String> = Optional.ofNullable(backFileId)

                        /** The document's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(): Optional<LocalDate> =
                            Optional.ofNullable(expirationDate)

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var country: String? = null
                            private var description: String? = null
                            private var fileId: String? = null
                            private var backFileId: String? = null
                            private var expirationDate: LocalDate? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(other: Other) = apply {
                                country = other.country
                                description = other.description
                                fileId = other.fileId
                                backFileId = other.backFileId
                                expirationDate = other.expirationDate
                                additionalProperties = other.additionalProperties.toMutableMap()
                            }

                            /**
                             * The two-character ISO 3166-1 code representing the country that
                             * issued the document.
                             */
                            fun country(country: String) = apply { this.country = country }

                            /** A description of the document submitted. */
                            fun description(description: String) = apply {
                                this.description = description
                            }

                            /** The identifier of the File containing the front of the document. */
                            fun fileId(fileId: String) = apply { this.fileId = fileId }

                            /**
                             * The identifier of the File containing the back of the document. Not
                             * every document has a reverse side.
                             */
                            fun backFileId(backFileId: String?) = apply {
                                this.backFileId = backFileId
                            }

                            /**
                             * The identifier of the File containing the back of the document. Not
                             * every document has a reverse side.
                             */
                            fun backFileId(backFileId: Optional<String>) =
                                backFileId(backFileId.orElse(null))

                            /** The document's expiration date in YYYY-MM-DD format. */
                            fun expirationDate(expirationDate: LocalDate?) = apply {
                                this.expirationDate = expirationDate
                            }

                            /** The document's expiration date in YYYY-MM-DD format. */
                            fun expirationDate(expirationDate: Optional<LocalDate>) =
                                expirationDate(expirationDate.orElse(null))

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

                            fun build(): Other =
                                Other(
                                    checkNotNull(country) {
                                        "`country` is required but was not set"
                                    },
                                    checkNotNull(description) {
                                        "`description` is required but was not set"
                                    },
                                    checkNotNull(fileId) { "`fileId` is required but was not set" },
                                    backFileId,
                                    expirationDate,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Other && country == other.country && description == other.description && fileId == other.fileId && backFileId == other.backFileId && expirationDate == other.expirationDate && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(country, description, fileId, backFileId, expirationDate, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Other{country=$country, description=$description, fileId=$fileId, backFileId=$backFileId, expirationDate=$expirationDate, additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    @NoAutoDetect
                    class Passport
                    @JsonCreator
                    private constructor(
                        @JsonProperty("country") private val country: String,
                        @JsonProperty("expiration_date") private val expirationDate: LocalDate,
                        @JsonProperty("file_id") private val fileId: String,
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        /** The country that issued the passport. */
                        @JsonProperty("country") fun country(): String = country

                        /** The passport's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(): LocalDate = expirationDate

                        /** The identifier of the File containing the passport. */
                        @JsonProperty("file_id") fun fileId(): String = fileId

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
                                country = passport.country
                                expirationDate = passport.expirationDate
                                fileId = passport.fileId
                                additionalProperties = passport.additionalProperties.toMutableMap()
                            }

                            /** The country that issued the passport. */
                            fun country(country: String) = apply { this.country = country }

                            /** The passport's expiration date in YYYY-MM-DD format. */
                            fun expirationDate(expirationDate: LocalDate) = apply {
                                this.expirationDate = expirationDate
                            }

                            /** The identifier of the File containing the passport. */
                            fun fileId(fileId: String) = apply { this.fileId = fileId }

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

                            return /* spotless:off */ other is Passport && country == other.country && expirationDate == other.expirationDate && fileId == other.fileId && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(country, expirationDate, fileId, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Passport{country=$country, expirationDate=$expirationDate, fileId=$fileId, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Identification && method == other.method && number == other.number && driversLicense == other.driversLicense && this.other == other.other && passport == other.passport && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(method, number, driversLicense, other, passport, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Identification{method=$method, number=$number, driversLicense=$driversLicense, other=$other, passport=$passport, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Individual && address == other.address && dateOfBirth == other.dateOfBirth && identification == other.identification && name == other.name && confirmedNoUsTaxId == other.confirmedNoUsTaxId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(address, dateOfBirth, identification, name, confirmedNoUsTaxId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{address=$address, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, confirmedNoUsTaxId=$confirmedNoUsTaxId, additionalProperties=$additionalProperties}"
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

                return /* spotless:off */ other is BeneficialOwner && individual == other.individual && prongs == other.prongs && companyTitle == other.companyTitle && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(individual, prongs, companyTitle, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BeneficialOwner{individual=$individual, prongs=$prongs, companyTitle=$companyTitle, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Corporation && address == other.address && beneficialOwners == other.beneficialOwners && name == other.name && taxIdentifier == other.taxIdentifier && incorporationState == other.incorporationState && industryCode == other.industryCode && website == other.website && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, beneficialOwners, name, taxIdentifier, incorporationState, industryCode, website, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Corporation{address=$address, beneficialOwners=$beneficialOwners, name=$name, taxIdentifier=$taxIdentifier, incorporationState=$incorporationState, industryCode=$industryCode, website=$website, additionalProperties=$additionalProperties}"
    }

    /**
     * Details of the Government Authority entity to create. Required if `structure` is equal to
     * `Government Authority`.
     */
    @NoAutoDetect
    class GovernmentAuthority
    @JsonCreator
    private constructor(
        @JsonProperty("address") private val address: Address,
        @JsonProperty("authorized_persons") private val authorizedPersons: List<AuthorizedPerson>,
        @JsonProperty("category") private val category: Category,
        @JsonProperty("name") private val name: String,
        @JsonProperty("tax_identifier") private val taxIdentifier: String,
        @JsonProperty("website") private val website: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        @JsonProperty("address") fun address(): Address = address

        /** The identifying details of authorized officials acting on the entity's behalf. */
        @JsonProperty("authorized_persons")
        fun authorizedPersons(): List<AuthorizedPerson> = authorizedPersons

        /** The category of the government authority. */
        @JsonProperty("category") fun category(): Category = category

        /** The legal name of the government authority. */
        @JsonProperty("name") fun name(): String = name

        /** The Employer Identification Number (EIN) for the government authority. */
        @JsonProperty("tax_identifier") fun taxIdentifier(): String = taxIdentifier

        /** The website of the government authority. */
        @JsonProperty("website") fun website(): Optional<String> = Optional.ofNullable(website)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address: Address? = null
            private var authorizedPersons: MutableList<AuthorizedPerson>? = null
            private var category: Category? = null
            private var name: String? = null
            private var taxIdentifier: String? = null
            private var website: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(governmentAuthority: GovernmentAuthority) = apply {
                address = governmentAuthority.address
                authorizedPersons = governmentAuthority.authorizedPersons.toMutableList()
                category = governmentAuthority.category
                name = governmentAuthority.name
                taxIdentifier = governmentAuthority.taxIdentifier
                website = governmentAuthority.website
                additionalProperties = governmentAuthority.additionalProperties.toMutableMap()
            }

            /**
             * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
             * disallowed.
             */
            fun address(address: Address) = apply { this.address = address }

            /** The identifying details of authorized officials acting on the entity's behalf. */
            fun authorizedPersons(authorizedPersons: List<AuthorizedPerson>) = apply {
                this.authorizedPersons = authorizedPersons.toMutableList()
            }

            /** The identifying details of authorized officials acting on the entity's behalf. */
            fun addAuthorizedPerson(authorizedPerson: AuthorizedPerson) = apply {
                authorizedPersons =
                    (authorizedPersons ?: mutableListOf()).apply { add(authorizedPerson) }
            }

            /** The category of the government authority. */
            fun category(category: Category) = apply { this.category = category }

            /** The legal name of the government authority. */
            fun name(name: String) = apply { this.name = name }

            /** The Employer Identification Number (EIN) for the government authority. */
            fun taxIdentifier(taxIdentifier: String) = apply { this.taxIdentifier = taxIdentifier }

            /** The website of the government authority. */
            fun website(website: String?) = apply { this.website = website }

            /** The website of the government authority. */
            fun website(website: Optional<String>) = website(website.orElse(null))

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
        @NoAutoDetect
        class Address
        @JsonCreator
        private constructor(
            @JsonProperty("city") private val city: String,
            @JsonProperty("line1") private val line1: String,
            @JsonProperty("state") private val state: String,
            @JsonProperty("zip") private val zip: String,
            @JsonProperty("line2") private val line2: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The city of the address. */
            @JsonProperty("city") fun city(): String = city

            /** The first line of the address. This is usually the street number and street. */
            @JsonProperty("line1") fun line1(): String = line1

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") fun state(): String = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") fun zip(): String = zip

            /** The second line of the address. This might be the floor or room number. */
            @JsonProperty("line2") fun line2(): Optional<String> = Optional.ofNullable(line2)

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
                private var state: String? = null
                private var zip: String? = null
                private var line2: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    city = address.city
                    line1 = address.line1
                    state = address.state
                    zip = address.zip
                    line2 = address.line2
                    additionalProperties = address.additionalProperties.toMutableMap()
                }

                /** The city of the address. */
                fun city(city: String) = apply { this.city = city }

                /** The first line of the address. This is usually the street number and street. */
                fun line1(line1: String) = apply { this.line1 = line1 }

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                fun state(state: String) = apply { this.state = state }

                /** The ZIP code of the address. */
                fun zip(zip: String) = apply { this.zip = zip }

                /** The second line of the address. This might be the floor or room number. */
                fun line2(line2: String?) = apply { this.line2 = line2 }

                /** The second line of the address. This might be the floor or room number. */
                fun line2(line2: Optional<String>) = line2(line2.orElse(null))

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
                        checkNotNull(city) { "`city` is required but was not set" },
                        checkNotNull(line1) { "`line1` is required but was not set" },
                        checkNotNull(state) { "`state` is required but was not set" },
                        checkNotNull(zip) { "`zip` is required but was not set" },
                        line2,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Address && city == other.city && line1 == other.line1 && state == other.state && zip == other.zip && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(city, line1, state, zip, line2, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{city=$city, line1=$line1, state=$state, zip=$zip, line2=$line2, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class AuthorizedPerson
        @JsonCreator
        private constructor(
            @JsonProperty("name") private val name: String,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The person's legal name. */
            @JsonProperty("name") fun name(): String = name

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
                    name = authorizedPerson.name
                    additionalProperties = authorizedPerson.additionalProperties.toMutableMap()
                }

                /** The person's legal name. */
                fun name(name: String) = apply { this.name = name }

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
                        checkNotNull(name) { "`name` is required but was not set" },
                        additionalProperties.toImmutable()
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AuthorizedPerson && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AuthorizedPerson{name=$name, additionalProperties=$additionalProperties}"
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

    /** Details of the joint entity to create. Required if `structure` is equal to `joint`. */
    @NoAutoDetect
    class Joint
    @JsonCreator
    private constructor(
        @JsonProperty("individuals") private val individuals: List<Individual>,
        @JsonProperty("name") private val name: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The two individuals that share control of the entity. */
        @JsonProperty("individuals") fun individuals(): List<Individual> = individuals

        /** The name of the joint entity. */
        @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var individuals: MutableList<Individual>? = null
            private var name: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(joint: Joint) = apply {
                individuals = joint.individuals.toMutableList()
                name = joint.name
                additionalProperties = joint.additionalProperties.toMutableMap()
            }

            /** The two individuals that share control of the entity. */
            fun individuals(individuals: List<Individual>) = apply {
                this.individuals = individuals.toMutableList()
            }

            /** The two individuals that share control of the entity. */
            fun addIndividual(individual: Individual) = apply {
                individuals = (individuals ?: mutableListOf()).apply { add(individual) }
            }

            /** The name of the joint entity. */
            fun name(name: String?) = apply { this.name = name }

            /** The name of the joint entity. */
            fun name(name: Optional<String>) = name(name.orElse(null))

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
                    checkNotNull(individuals) { "`individuals` is required but was not set" }
                        .toImmutable(),
                    name,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Individual
        @JsonCreator
        private constructor(
            @JsonProperty("address") private val address: Address,
            @JsonProperty("date_of_birth") private val dateOfBirth: LocalDate,
            @JsonProperty("identification") private val identification: Identification,
            @JsonProperty("name") private val name: String,
            @JsonProperty("confirmed_no_us_tax_id") private val confirmedNoUsTaxId: Boolean?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and PMB's
             * are disallowed.
             */
            @JsonProperty("address") fun address(): Address = address

            /** The person's date of birth in YYYY-MM-DD format. */
            @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate = dateOfBirth

            /** A means of verifying the person's identity. */
            @JsonProperty("identification") fun identification(): Identification = identification

            /** The person's legal name. */
            @JsonProperty("name") fun name(): String = name

            /**
             * The identification method for an individual can only be a passport, driver's license,
             * or other document if you've confirmed the individual does not have a US tax id
             * (either a Social Security Number or Individual Taxpayer Identification Number).
             */
            @JsonProperty("confirmed_no_us_tax_id")
            fun confirmedNoUsTaxId(): Optional<Boolean> = Optional.ofNullable(confirmedNoUsTaxId)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var address: Address? = null
                private var dateOfBirth: LocalDate? = null
                private var identification: Identification? = null
                private var name: String? = null
                private var confirmedNoUsTaxId: Boolean? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(individual: Individual) = apply {
                    address = individual.address
                    dateOfBirth = individual.dateOfBirth
                    identification = individual.identification
                    name = individual.name
                    confirmedNoUsTaxId = individual.confirmedNoUsTaxId
                    additionalProperties = individual.additionalProperties.toMutableMap()
                }

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
                 */
                fun address(address: Address) = apply { this.address = address }

                /** The person's date of birth in YYYY-MM-DD format. */
                fun dateOfBirth(dateOfBirth: LocalDate) = apply { this.dateOfBirth = dateOfBirth }

                /** A means of verifying the person's identity. */
                fun identification(identification: Identification) = apply {
                    this.identification = identification
                }

                /** The person's legal name. */
                fun name(name: String) = apply { this.name = name }

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean?) = apply {
                    this.confirmedNoUsTaxId = confirmedNoUsTaxId
                }

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean) =
                    confirmedNoUsTaxId(confirmedNoUsTaxId as Boolean?)

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun confirmedNoUsTaxId(confirmedNoUsTaxId: Optional<Boolean>) =
                    confirmedNoUsTaxId(confirmedNoUsTaxId.orElse(null) as Boolean?)

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
                        checkNotNull(address) { "`address` is required but was not set" },
                        checkNotNull(dateOfBirth) { "`dateOfBirth` is required but was not set" },
                        checkNotNull(identification) {
                            "`identification` is required but was not set"
                        },
                        checkNotNull(name) { "`name` is required but was not set" },
                        confirmedNoUsTaxId,
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and PMB's
             * are disallowed.
             */
            @NoAutoDetect
            class Address
            @JsonCreator
            private constructor(
                @JsonProperty("city") private val city: String,
                @JsonProperty("line1") private val line1: String,
                @JsonProperty("state") private val state: String,
                @JsonProperty("zip") private val zip: String,
                @JsonProperty("line2") private val line2: String?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The city of the address. */
                @JsonProperty("city") fun city(): String = city

                /** The first line of the address. This is usually the street number and street. */
                @JsonProperty("line1") fun line1(): String = line1

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                @JsonProperty("state") fun state(): String = state

                /** The ZIP code of the address. */
                @JsonProperty("zip") fun zip(): String = zip

                /** The second line of the address. This might be the floor or room number. */
                @JsonProperty("line2") fun line2(): Optional<String> = Optional.ofNullable(line2)

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
                    private var state: String? = null
                    private var zip: String? = null
                    private var line2: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(address: Address) = apply {
                        city = address.city
                        line1 = address.line1
                        state = address.state
                        zip = address.zip
                        line2 = address.line2
                        additionalProperties = address.additionalProperties.toMutableMap()
                    }

                    /** The city of the address. */
                    fun city(city: String) = apply { this.city = city }

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    fun line1(line1: String) = apply { this.line1 = line1 }

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    fun state(state: String) = apply { this.state = state }

                    /** The ZIP code of the address. */
                    fun zip(zip: String) = apply { this.zip = zip }

                    /** The second line of the address. This might be the floor or room number. */
                    fun line2(line2: String?) = apply { this.line2 = line2 }

                    /** The second line of the address. This might be the floor or room number. */
                    fun line2(line2: Optional<String>) = line2(line2.orElse(null))

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
                            checkNotNull(city) { "`city` is required but was not set" },
                            checkNotNull(line1) { "`line1` is required but was not set" },
                            checkNotNull(state) { "`state` is required but was not set" },
                            checkNotNull(zip) { "`zip` is required but was not set" },
                            line2,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Address && city == other.city && line1 == other.line1 && state == other.state && zip == other.zip && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(city, line1, state, zip, line2, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Address{city=$city, line1=$line1, state=$state, zip=$zip, line2=$line2, additionalProperties=$additionalProperties}"
            }

            /** A means of verifying the person's identity. */
            @NoAutoDetect
            class Identification
            @JsonCreator
            private constructor(
                @JsonProperty("method") private val method: Method,
                @JsonProperty("number") private val number: String,
                @JsonProperty("drivers_license") private val driversLicense: DriversLicense?,
                @JsonProperty("other") private val other: Other?,
                @JsonProperty("passport") private val passport: Passport?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** A method that can be used to verify the individual's identity. */
                @JsonProperty("method") fun method(): Method = method

                /**
                 * An identification number that can be used to verify the individual's identity,
                 * such as a social security number.
                 */
                @JsonProperty("number") fun number(): String = number

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                @JsonProperty("drivers_license")
                fun driversLicense(): Optional<DriversLicense> = Optional.ofNullable(driversLicense)

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                @JsonProperty("other") fun other(): Optional<Other> = Optional.ofNullable(other)

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                @JsonProperty("passport")
                fun passport(): Optional<Passport> = Optional.ofNullable(passport)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var method: Method? = null
                    private var number: String? = null
                    private var driversLicense: DriversLicense? = null
                    private var other: Other? = null
                    private var passport: Passport? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(identification: Identification) = apply {
                        method = identification.method
                        number = identification.number
                        driversLicense = identification.driversLicense
                        other = identification.other
                        passport = identification.passport
                        additionalProperties = identification.additionalProperties.toMutableMap()
                    }

                    /** A method that can be used to verify the individual's identity. */
                    fun method(method: Method) = apply { this.method = method }

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     */
                    fun number(number: String) = apply { this.number = number }

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    fun driversLicense(driversLicense: DriversLicense?) = apply {
                        this.driversLicense = driversLicense
                    }

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    fun driversLicense(driversLicense: Optional<DriversLicense>) =
                        driversLicense(driversLicense.orElse(null))

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    fun other(other: Other?) = apply { this.other = other }

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    fun other(other: Optional<Other>) = other(other.orElse(null))

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    fun passport(passport: Passport?) = apply { this.passport = passport }

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    fun passport(passport: Optional<Passport>) = passport(passport.orElse(null))

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
                            checkNotNull(method) { "`method` is required but was not set" },
                            checkNotNull(number) { "`number` is required but was not set" },
                            driversLicense,
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

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                @NoAutoDetect
                class DriversLicense
                @JsonCreator
                private constructor(
                    @JsonProperty("expiration_date") private val expirationDate: LocalDate,
                    @JsonProperty("file_id") private val fileId: String,
                    @JsonProperty("state") private val state: String,
                    @JsonProperty("back_file_id") private val backFileId: String?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The driver's license's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(): LocalDate = expirationDate

                    /** The identifier of the File containing the front of the driver's license. */
                    @JsonProperty("file_id") fun fileId(): String = fileId

                    /** The state that issued the provided driver's license. */
                    @JsonProperty("state") fun state(): String = state

                    /** The identifier of the File containing the back of the driver's license. */
                    @JsonProperty("back_file_id")
                    fun backFileId(): Optional<String> = Optional.ofNullable(backFileId)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var expirationDate: LocalDate? = null
                        private var fileId: String? = null
                        private var state: String? = null
                        private var backFileId: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(driversLicense: DriversLicense) = apply {
                            expirationDate = driversLicense.expirationDate
                            fileId = driversLicense.fileId
                            state = driversLicense.state
                            backFileId = driversLicense.backFileId
                            additionalProperties =
                                driversLicense.additionalProperties.toMutableMap()
                        }

                        /** The driver's license's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(expirationDate: LocalDate) = apply {
                            this.expirationDate = expirationDate
                        }

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        fun fileId(fileId: String) = apply { this.fileId = fileId }

                        /** The state that issued the provided driver's license. */
                        fun state(state: String) = apply { this.state = state }

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        fun backFileId(backFileId: String?) = apply { this.backFileId = backFileId }

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        fun backFileId(backFileId: Optional<String>) =
                            backFileId(backFileId.orElse(null))

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

                        fun build(): DriversLicense =
                            DriversLicense(
                                checkNotNull(expirationDate) {
                                    "`expirationDate` is required but was not set"
                                },
                                checkNotNull(fileId) { "`fileId` is required but was not set" },
                                checkNotNull(state) { "`state` is required but was not set" },
                                backFileId,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DriversLicense && expirationDate == other.expirationDate && fileId == other.fileId && state == other.state && backFileId == other.backFileId && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(expirationDate, fileId, state, backFileId, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "DriversLicense{expirationDate=$expirationDate, fileId=$fileId, state=$state, backFileId=$backFileId, additionalProperties=$additionalProperties}"
                }

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                @NoAutoDetect
                class Other
                @JsonCreator
                private constructor(
                    @JsonProperty("country") private val country: String,
                    @JsonProperty("description") private val description: String,
                    @JsonProperty("file_id") private val fileId: String,
                    @JsonProperty("back_file_id") private val backFileId: String?,
                    @JsonProperty("expiration_date") private val expirationDate: LocalDate?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /**
                     * The two-character ISO 3166-1 code representing the country that issued the
                     * document.
                     */
                    @JsonProperty("country") fun country(): String = country

                    /** A description of the document submitted. */
                    @JsonProperty("description") fun description(): String = description

                    /** The identifier of the File containing the front of the document. */
                    @JsonProperty("file_id") fun fileId(): String = fileId

                    /**
                     * The identifier of the File containing the back of the document. Not every
                     * document has a reverse side.
                     */
                    @JsonProperty("back_file_id")
                    fun backFileId(): Optional<String> = Optional.ofNullable(backFileId)

                    /** The document's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(): Optional<LocalDate> = Optional.ofNullable(expirationDate)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var country: String? = null
                        private var description: String? = null
                        private var fileId: String? = null
                        private var backFileId: String? = null
                        private var expirationDate: LocalDate? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(other: Other) = apply {
                            country = other.country
                            description = other.description
                            fileId = other.fileId
                            backFileId = other.backFileId
                            expirationDate = other.expirationDate
                            additionalProperties = other.additionalProperties.toMutableMap()
                        }

                        /**
                         * The two-character ISO 3166-1 code representing the country that issued
                         * the document.
                         */
                        fun country(country: String) = apply { this.country = country }

                        /** A description of the document submitted. */
                        fun description(description: String) = apply {
                            this.description = description
                        }

                        /** The identifier of the File containing the front of the document. */
                        fun fileId(fileId: String) = apply { this.fileId = fileId }

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        fun backFileId(backFileId: String?) = apply { this.backFileId = backFileId }

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        fun backFileId(backFileId: Optional<String>) =
                            backFileId(backFileId.orElse(null))

                        /** The document's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(expirationDate: LocalDate?) = apply {
                            this.expirationDate = expirationDate
                        }

                        /** The document's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(expirationDate: Optional<LocalDate>) =
                            expirationDate(expirationDate.orElse(null))

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

                        fun build(): Other =
                            Other(
                                checkNotNull(country) { "`country` is required but was not set" },
                                checkNotNull(description) {
                                    "`description` is required but was not set"
                                },
                                checkNotNull(fileId) { "`fileId` is required but was not set" },
                                backFileId,
                                expirationDate,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Other && country == other.country && description == other.description && fileId == other.fileId && backFileId == other.backFileId && expirationDate == other.expirationDate && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(country, description, fileId, backFileId, expirationDate, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Other{country=$country, description=$description, fileId=$fileId, backFileId=$backFileId, expirationDate=$expirationDate, additionalProperties=$additionalProperties}"
                }

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                @NoAutoDetect
                class Passport
                @JsonCreator
                private constructor(
                    @JsonProperty("country") private val country: String,
                    @JsonProperty("expiration_date") private val expirationDate: LocalDate,
                    @JsonProperty("file_id") private val fileId: String,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The country that issued the passport. */
                    @JsonProperty("country") fun country(): String = country

                    /** The passport's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(): LocalDate = expirationDate

                    /** The identifier of the File containing the passport. */
                    @JsonProperty("file_id") fun fileId(): String = fileId

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
                            country = passport.country
                            expirationDate = passport.expirationDate
                            fileId = passport.fileId
                            additionalProperties = passport.additionalProperties.toMutableMap()
                        }

                        /** The country that issued the passport. */
                        fun country(country: String) = apply { this.country = country }

                        /** The passport's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(expirationDate: LocalDate) = apply {
                            this.expirationDate = expirationDate
                        }

                        /** The identifier of the File containing the passport. */
                        fun fileId(fileId: String) = apply { this.fileId = fileId }

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

                        return /* spotless:off */ other is Passport && country == other.country && expirationDate == other.expirationDate && fileId == other.fileId && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(country, expirationDate, fileId, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Passport{country=$country, expirationDate=$expirationDate, fileId=$fileId, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Identification && method == other.method && number == other.number && driversLicense == other.driversLicense && this.other == other.other && passport == other.passport && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(method, number, driversLicense, other, passport, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Identification{method=$method, number=$number, driversLicense=$driversLicense, other=$other, passport=$passport, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Individual && address == other.address && dateOfBirth == other.dateOfBirth && identification == other.identification && name == other.name && confirmedNoUsTaxId == other.confirmedNoUsTaxId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(address, dateOfBirth, identification, name, confirmedNoUsTaxId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Individual{address=$address, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, confirmedNoUsTaxId=$confirmedNoUsTaxId, additionalProperties=$additionalProperties}"
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
     * Details of the natural person entity to create. Required if `structure` is equal to
     * `natural_person`. Natural people entities should be submitted with `social_security_number`
     * or `individual_taxpayer_identification_number` identification methods.
     */
    @NoAutoDetect
    class NaturalPerson
    @JsonCreator
    private constructor(
        @JsonProperty("address") private val address: Address,
        @JsonProperty("date_of_birth") private val dateOfBirth: LocalDate,
        @JsonProperty("identification") private val identification: Identification,
        @JsonProperty("name") private val name: String,
        @JsonProperty("confirmed_no_us_tax_id") private val confirmedNoUsTaxId: Boolean?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The individual's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        @JsonProperty("address") fun address(): Address = address

        /** The person's date of birth in YYYY-MM-DD format. */
        @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate = dateOfBirth

        /** A means of verifying the person's identity. */
        @JsonProperty("identification") fun identification(): Identification = identification

        /** The person's legal name. */
        @JsonProperty("name") fun name(): String = name

        /**
         * The identification method for an individual can only be a passport, driver's license, or
         * other document if you've confirmed the individual does not have a US tax id (either a
         * Social Security Number or Individual Taxpayer Identification Number).
         */
        @JsonProperty("confirmed_no_us_tax_id")
        fun confirmedNoUsTaxId(): Optional<Boolean> = Optional.ofNullable(confirmedNoUsTaxId)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address: Address? = null
            private var dateOfBirth: LocalDate? = null
            private var identification: Identification? = null
            private var name: String? = null
            private var confirmedNoUsTaxId: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(naturalPerson: NaturalPerson) = apply {
                address = naturalPerson.address
                dateOfBirth = naturalPerson.dateOfBirth
                identification = naturalPerson.identification
                name = naturalPerson.name
                confirmedNoUsTaxId = naturalPerson.confirmedNoUsTaxId
                additionalProperties = naturalPerson.additionalProperties.toMutableMap()
            }

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and PMB's
             * are disallowed.
             */
            fun address(address: Address) = apply { this.address = address }

            /** The person's date of birth in YYYY-MM-DD format. */
            fun dateOfBirth(dateOfBirth: LocalDate) = apply { this.dateOfBirth = dateOfBirth }

            /** A means of verifying the person's identity. */
            fun identification(identification: Identification) = apply {
                this.identification = identification
            }

            /** The person's legal name. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The identification method for an individual can only be a passport, driver's license,
             * or other document if you've confirmed the individual does not have a US tax id
             * (either a Social Security Number or Individual Taxpayer Identification Number).
             */
            fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean?) = apply {
                this.confirmedNoUsTaxId = confirmedNoUsTaxId
            }

            /**
             * The identification method for an individual can only be a passport, driver's license,
             * or other document if you've confirmed the individual does not have a US tax id
             * (either a Social Security Number or Individual Taxpayer Identification Number).
             */
            fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean) =
                confirmedNoUsTaxId(confirmedNoUsTaxId as Boolean?)

            /**
             * The identification method for an individual can only be a passport, driver's license,
             * or other document if you've confirmed the individual does not have a US tax id
             * (either a Social Security Number or Individual Taxpayer Identification Number).
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun confirmedNoUsTaxId(confirmedNoUsTaxId: Optional<Boolean>) =
                confirmedNoUsTaxId(confirmedNoUsTaxId.orElse(null) as Boolean?)

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
                    checkNotNull(address) { "`address` is required but was not set" },
                    checkNotNull(dateOfBirth) { "`dateOfBirth` is required but was not set" },
                    checkNotNull(identification) { "`identification` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    confirmedNoUsTaxId,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * The individual's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        @NoAutoDetect
        class Address
        @JsonCreator
        private constructor(
            @JsonProperty("city") private val city: String,
            @JsonProperty("line1") private val line1: String,
            @JsonProperty("state") private val state: String,
            @JsonProperty("zip") private val zip: String,
            @JsonProperty("line2") private val line2: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The city of the address. */
            @JsonProperty("city") fun city(): String = city

            /** The first line of the address. This is usually the street number and street. */
            @JsonProperty("line1") fun line1(): String = line1

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") fun state(): String = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") fun zip(): String = zip

            /** The second line of the address. This might be the floor or room number. */
            @JsonProperty("line2") fun line2(): Optional<String> = Optional.ofNullable(line2)

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
                private var state: String? = null
                private var zip: String? = null
                private var line2: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    city = address.city
                    line1 = address.line1
                    state = address.state
                    zip = address.zip
                    line2 = address.line2
                    additionalProperties = address.additionalProperties.toMutableMap()
                }

                /** The city of the address. */
                fun city(city: String) = apply { this.city = city }

                /** The first line of the address. This is usually the street number and street. */
                fun line1(line1: String) = apply { this.line1 = line1 }

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                fun state(state: String) = apply { this.state = state }

                /** The ZIP code of the address. */
                fun zip(zip: String) = apply { this.zip = zip }

                /** The second line of the address. This might be the floor or room number. */
                fun line2(line2: String?) = apply { this.line2 = line2 }

                /** The second line of the address. This might be the floor or room number. */
                fun line2(line2: Optional<String>) = line2(line2.orElse(null))

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
                        checkNotNull(city) { "`city` is required but was not set" },
                        checkNotNull(line1) { "`line1` is required but was not set" },
                        checkNotNull(state) { "`state` is required but was not set" },
                        checkNotNull(zip) { "`zip` is required but was not set" },
                        line2,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Address && city == other.city && line1 == other.line1 && state == other.state && zip == other.zip && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(city, line1, state, zip, line2, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{city=$city, line1=$line1, state=$state, zip=$zip, line2=$line2, additionalProperties=$additionalProperties}"
        }

        /** A means of verifying the person's identity. */
        @NoAutoDetect
        class Identification
        @JsonCreator
        private constructor(
            @JsonProperty("method") private val method: Method,
            @JsonProperty("number") private val number: String,
            @JsonProperty("drivers_license") private val driversLicense: DriversLicense?,
            @JsonProperty("other") private val other: Other?,
            @JsonProperty("passport") private val passport: Passport?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** A method that can be used to verify the individual's identity. */
            @JsonProperty("method") fun method(): Method = method

            /**
             * An identification number that can be used to verify the individual's identity, such
             * as a social security number.
             */
            @JsonProperty("number") fun number(): String = number

            /**
             * Information about the United States driver's license used for identification.
             * Required if `method` is equal to `drivers_license`.
             */
            @JsonProperty("drivers_license")
            fun driversLicense(): Optional<DriversLicense> = Optional.ofNullable(driversLicense)

            /**
             * Information about the identification document provided. Required if `method` is equal
             * to `other`.
             */
            @JsonProperty("other") fun other(): Optional<Other> = Optional.ofNullable(other)

            /**
             * Information about the passport used for identification. Required if `method` is equal
             * to `passport`.
             */
            @JsonProperty("passport")
            fun passport(): Optional<Passport> = Optional.ofNullable(passport)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var method: Method? = null
                private var number: String? = null
                private var driversLicense: DriversLicense? = null
                private var other: Other? = null
                private var passport: Passport? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(identification: Identification) = apply {
                    method = identification.method
                    number = identification.number
                    driversLicense = identification.driversLicense
                    other = identification.other
                    passport = identification.passport
                    additionalProperties = identification.additionalProperties.toMutableMap()
                }

                /** A method that can be used to verify the individual's identity. */
                fun method(method: Method) = apply { this.method = method }

                /**
                 * An identification number that can be used to verify the individual's identity,
                 * such as a social security number.
                 */
                fun number(number: String) = apply { this.number = number }

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                fun driversLicense(driversLicense: DriversLicense?) = apply {
                    this.driversLicense = driversLicense
                }

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                fun driversLicense(driversLicense: Optional<DriversLicense>) =
                    driversLicense(driversLicense.orElse(null))

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                fun other(other: Other?) = apply { this.other = other }

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                fun other(other: Optional<Other>) = other(other.orElse(null))

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                fun passport(passport: Passport?) = apply { this.passport = passport }

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                fun passport(passport: Optional<Passport>) = passport(passport.orElse(null))

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
                        checkNotNull(method) { "`method` is required but was not set" },
                        checkNotNull(number) { "`number` is required but was not set" },
                        driversLicense,
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

            /**
             * Information about the United States driver's license used for identification.
             * Required if `method` is equal to `drivers_license`.
             */
            @NoAutoDetect
            class DriversLicense
            @JsonCreator
            private constructor(
                @JsonProperty("expiration_date") private val expirationDate: LocalDate,
                @JsonProperty("file_id") private val fileId: String,
                @JsonProperty("state") private val state: String,
                @JsonProperty("back_file_id") private val backFileId: String?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The driver's license's expiration date in YYYY-MM-DD format. */
                @JsonProperty("expiration_date") fun expirationDate(): LocalDate = expirationDate

                /** The identifier of the File containing the front of the driver's license. */
                @JsonProperty("file_id") fun fileId(): String = fileId

                /** The state that issued the provided driver's license. */
                @JsonProperty("state") fun state(): String = state

                /** The identifier of the File containing the back of the driver's license. */
                @JsonProperty("back_file_id")
                fun backFileId(): Optional<String> = Optional.ofNullable(backFileId)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var expirationDate: LocalDate? = null
                    private var fileId: String? = null
                    private var state: String? = null
                    private var backFileId: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(driversLicense: DriversLicense) = apply {
                        expirationDate = driversLicense.expirationDate
                        fileId = driversLicense.fileId
                        state = driversLicense.state
                        backFileId = driversLicense.backFileId
                        additionalProperties = driversLicense.additionalProperties.toMutableMap()
                    }

                    /** The driver's license's expiration date in YYYY-MM-DD format. */
                    fun expirationDate(expirationDate: LocalDate) = apply {
                        this.expirationDate = expirationDate
                    }

                    /** The identifier of the File containing the front of the driver's license. */
                    fun fileId(fileId: String) = apply { this.fileId = fileId }

                    /** The state that issued the provided driver's license. */
                    fun state(state: String) = apply { this.state = state }

                    /** The identifier of the File containing the back of the driver's license. */
                    fun backFileId(backFileId: String?) = apply { this.backFileId = backFileId }

                    /** The identifier of the File containing the back of the driver's license. */
                    fun backFileId(backFileId: Optional<String>) =
                        backFileId(backFileId.orElse(null))

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

                    fun build(): DriversLicense =
                        DriversLicense(
                            checkNotNull(expirationDate) {
                                "`expirationDate` is required but was not set"
                            },
                            checkNotNull(fileId) { "`fileId` is required but was not set" },
                            checkNotNull(state) { "`state` is required but was not set" },
                            backFileId,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DriversLicense && expirationDate == other.expirationDate && fileId == other.fileId && state == other.state && backFileId == other.backFileId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(expirationDate, fileId, state, backFileId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "DriversLicense{expirationDate=$expirationDate, fileId=$fileId, state=$state, backFileId=$backFileId, additionalProperties=$additionalProperties}"
            }

            /**
             * Information about the identification document provided. Required if `method` is equal
             * to `other`.
             */
            @NoAutoDetect
            class Other
            @JsonCreator
            private constructor(
                @JsonProperty("country") private val country: String,
                @JsonProperty("description") private val description: String,
                @JsonProperty("file_id") private val fileId: String,
                @JsonProperty("back_file_id") private val backFileId: String?,
                @JsonProperty("expiration_date") private val expirationDate: LocalDate?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * The two-character ISO 3166-1 code representing the country that issued the
                 * document.
                 */
                @JsonProperty("country") fun country(): String = country

                /** A description of the document submitted. */
                @JsonProperty("description") fun description(): String = description

                /** The identifier of the File containing the front of the document. */
                @JsonProperty("file_id") fun fileId(): String = fileId

                /**
                 * The identifier of the File containing the back of the document. Not every
                 * document has a reverse side.
                 */
                @JsonProperty("back_file_id")
                fun backFileId(): Optional<String> = Optional.ofNullable(backFileId)

                /** The document's expiration date in YYYY-MM-DD format. */
                @JsonProperty("expiration_date")
                fun expirationDate(): Optional<LocalDate> = Optional.ofNullable(expirationDate)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var country: String? = null
                    private var description: String? = null
                    private var fileId: String? = null
                    private var backFileId: String? = null
                    private var expirationDate: LocalDate? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(other: Other) = apply {
                        country = other.country
                        description = other.description
                        fileId = other.fileId
                        backFileId = other.backFileId
                        expirationDate = other.expirationDate
                        additionalProperties = other.additionalProperties.toMutableMap()
                    }

                    /**
                     * The two-character ISO 3166-1 code representing the country that issued the
                     * document.
                     */
                    fun country(country: String) = apply { this.country = country }

                    /** A description of the document submitted. */
                    fun description(description: String) = apply { this.description = description }

                    /** The identifier of the File containing the front of the document. */
                    fun fileId(fileId: String) = apply { this.fileId = fileId }

                    /**
                     * The identifier of the File containing the back of the document. Not every
                     * document has a reverse side.
                     */
                    fun backFileId(backFileId: String?) = apply { this.backFileId = backFileId }

                    /**
                     * The identifier of the File containing the back of the document. Not every
                     * document has a reverse side.
                     */
                    fun backFileId(backFileId: Optional<String>) =
                        backFileId(backFileId.orElse(null))

                    /** The document's expiration date in YYYY-MM-DD format. */
                    fun expirationDate(expirationDate: LocalDate?) = apply {
                        this.expirationDate = expirationDate
                    }

                    /** The document's expiration date in YYYY-MM-DD format. */
                    fun expirationDate(expirationDate: Optional<LocalDate>) =
                        expirationDate(expirationDate.orElse(null))

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

                    fun build(): Other =
                        Other(
                            checkNotNull(country) { "`country` is required but was not set" },
                            checkNotNull(description) {
                                "`description` is required but was not set"
                            },
                            checkNotNull(fileId) { "`fileId` is required but was not set" },
                            backFileId,
                            expirationDate,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Other && country == other.country && description == other.description && fileId == other.fileId && backFileId == other.backFileId && expirationDate == other.expirationDate && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(country, description, fileId, backFileId, expirationDate, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Other{country=$country, description=$description, fileId=$fileId, backFileId=$backFileId, expirationDate=$expirationDate, additionalProperties=$additionalProperties}"
            }

            /**
             * Information about the passport used for identification. Required if `method` is equal
             * to `passport`.
             */
            @NoAutoDetect
            class Passport
            @JsonCreator
            private constructor(
                @JsonProperty("country") private val country: String,
                @JsonProperty("expiration_date") private val expirationDate: LocalDate,
                @JsonProperty("file_id") private val fileId: String,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The country that issued the passport. */
                @JsonProperty("country") fun country(): String = country

                /** The passport's expiration date in YYYY-MM-DD format. */
                @JsonProperty("expiration_date") fun expirationDate(): LocalDate = expirationDate

                /** The identifier of the File containing the passport. */
                @JsonProperty("file_id") fun fileId(): String = fileId

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
                        country = passport.country
                        expirationDate = passport.expirationDate
                        fileId = passport.fileId
                        additionalProperties = passport.additionalProperties.toMutableMap()
                    }

                    /** The country that issued the passport. */
                    fun country(country: String) = apply { this.country = country }

                    /** The passport's expiration date in YYYY-MM-DD format. */
                    fun expirationDate(expirationDate: LocalDate) = apply {
                        this.expirationDate = expirationDate
                    }

                    /** The identifier of the File containing the passport. */
                    fun fileId(fileId: String) = apply { this.fileId = fileId }

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

                    return /* spotless:off */ other is Passport && country == other.country && expirationDate == other.expirationDate && fileId == other.fileId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(country, expirationDate, fileId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Passport{country=$country, expirationDate=$expirationDate, fileId=$fileId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Identification && method == other.method && number == other.number && driversLicense == other.driversLicense && this.other == other.other && passport == other.passport && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(method, number, driversLicense, other, passport, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Identification{method=$method, number=$number, driversLicense=$driversLicense, other=$other, passport=$passport, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NaturalPerson && address == other.address && dateOfBirth == other.dateOfBirth && identification == other.identification && name == other.name && confirmedNoUsTaxId == other.confirmedNoUsTaxId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, dateOfBirth, identification, name, confirmedNoUsTaxId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NaturalPerson{address=$address, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, confirmedNoUsTaxId=$confirmedNoUsTaxId, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class SupplementalDocument
    @JsonCreator
    private constructor(
        @JsonProperty("file_id") private val fileId: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier of the File containing the document. */
        @JsonProperty("file_id") fun fileId(): String = fileId

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
                fileId = supplementalDocument.fileId
                additionalProperties = supplementalDocument.additionalProperties.toMutableMap()
            }

            /** The identifier of the File containing the document. */
            fun fileId(fileId: String) = apply { this.fileId = fileId }

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

            return /* spotless:off */ other is SupplementalDocument && fileId == other.fileId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(fileId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SupplementalDocument{fileId=$fileId, additionalProperties=$additionalProperties}"
    }

    /**
     * A reference to data stored in a third-party verification service. Your integration may or may
     * not use this field.
     */
    @NoAutoDetect
    class ThirdPartyVerification
    @JsonCreator
    private constructor(
        @JsonProperty("reference") private val reference: String,
        @JsonProperty("vendor") private val vendor: Vendor,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The reference identifier for the third party verification. */
        @JsonProperty("reference") fun reference(): String = reference

        /** The vendor that was used to perform the verification. */
        @JsonProperty("vendor") fun vendor(): Vendor = vendor

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
                reference = thirdPartyVerification.reference
                vendor = thirdPartyVerification.vendor
                additionalProperties = thirdPartyVerification.additionalProperties.toMutableMap()
            }

            /** The reference identifier for the third party verification. */
            fun reference(reference: String) = apply { this.reference = reference }

            /** The vendor that was used to perform the verification. */
            fun vendor(vendor: Vendor) = apply { this.vendor = vendor }

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

    /** Details of the trust entity to create. Required if `structure` is equal to `trust`. */
    @NoAutoDetect
    class Trust
    @JsonCreator
    private constructor(
        @JsonProperty("address") private val address: Address,
        @JsonProperty("category") private val category: Category,
        @JsonProperty("name") private val name: String,
        @JsonProperty("trustees") private val trustees: List<Trustee>,
        @JsonProperty("formation_document_file_id") private val formationDocumentFileId: String?,
        @JsonProperty("formation_state") private val formationState: String?,
        @JsonProperty("grantor") private val grantor: Grantor?,
        @JsonProperty("tax_identifier") private val taxIdentifier: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The trust's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        @JsonProperty("address") fun address(): Address = address

        /**
         * Whether the trust is `revocable` or `irrevocable`. Irrevocable trusts require their own
         * Employer Identification Number. Revocable trusts require information about the individual
         * `grantor` who created the trust.
         */
        @JsonProperty("category") fun category(): Category = category

        /** The legal name of the trust. */
        @JsonProperty("name") fun name(): String = name

        /** The trustees of the trust. */
        @JsonProperty("trustees") fun trustees(): List<Trustee> = trustees

        /** The identifier of the File containing the formation document of the trust. */
        @JsonProperty("formation_document_file_id")
        fun formationDocumentFileId(): Optional<String> =
            Optional.ofNullable(formationDocumentFileId)

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the state in which
         * the trust was formed.
         */
        @JsonProperty("formation_state")
        fun formationState(): Optional<String> = Optional.ofNullable(formationState)

        /** The grantor of the trust. Required if `category` is equal to `revocable`. */
        @JsonProperty("grantor") fun grantor(): Optional<Grantor> = Optional.ofNullable(grantor)

        /**
         * The Employer Identification Number (EIN) for the trust. Required if `category` is equal
         * to `irrevocable`.
         */
        @JsonProperty("tax_identifier")
        fun taxIdentifier(): Optional<String> = Optional.ofNullable(taxIdentifier)

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
            private var name: String? = null
            private var trustees: MutableList<Trustee>? = null
            private var formationDocumentFileId: String? = null
            private var formationState: String? = null
            private var grantor: Grantor? = null
            private var taxIdentifier: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trust: Trust) = apply {
                address = trust.address
                category = trust.category
                name = trust.name
                trustees = trust.trustees.toMutableList()
                formationDocumentFileId = trust.formationDocumentFileId
                formationState = trust.formationState
                grantor = trust.grantor
                taxIdentifier = trust.taxIdentifier
                additionalProperties = trust.additionalProperties.toMutableMap()
            }

            /**
             * The trust's physical address. Mail receiving locations like PO Boxes and PMB's are
             * disallowed.
             */
            fun address(address: Address) = apply { this.address = address }

            /**
             * Whether the trust is `revocable` or `irrevocable`. Irrevocable trusts require their
             * own Employer Identification Number. Revocable trusts require information about the
             * individual `grantor` who created the trust.
             */
            fun category(category: Category) = apply { this.category = category }

            /** The legal name of the trust. */
            fun name(name: String) = apply { this.name = name }

            /** The trustees of the trust. */
            fun trustees(trustees: List<Trustee>) = apply {
                this.trustees = trustees.toMutableList()
            }

            /** The trustees of the trust. */
            fun addTrustee(trustee: Trustee) = apply {
                trustees = (trustees ?: mutableListOf()).apply { add(trustee) }
            }

            /** The identifier of the File containing the formation document of the trust. */
            fun formationDocumentFileId(formationDocumentFileId: String?) = apply {
                this.formationDocumentFileId = formationDocumentFileId
            }

            /** The identifier of the File containing the formation document of the trust. */
            fun formationDocumentFileId(formationDocumentFileId: Optional<String>) =
                formationDocumentFileId(formationDocumentFileId.orElse(null))

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state in
             * which the trust was formed.
             */
            fun formationState(formationState: String?) = apply {
                this.formationState = formationState
            }

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state in
             * which the trust was formed.
             */
            fun formationState(formationState: Optional<String>) =
                formationState(formationState.orElse(null))

            /** The grantor of the trust. Required if `category` is equal to `revocable`. */
            fun grantor(grantor: Grantor?) = apply { this.grantor = grantor }

            /** The grantor of the trust. Required if `category` is equal to `revocable`. */
            fun grantor(grantor: Optional<Grantor>) = grantor(grantor.orElse(null))

            /**
             * The Employer Identification Number (EIN) for the trust. Required if `category` is
             * equal to `irrevocable`.
             */
            fun taxIdentifier(taxIdentifier: String?) = apply { this.taxIdentifier = taxIdentifier }

            /**
             * The Employer Identification Number (EIN) for the trust. Required if `category` is
             * equal to `irrevocable`.
             */
            fun taxIdentifier(taxIdentifier: Optional<String>) =
                taxIdentifier(taxIdentifier.orElse(null))

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
                    checkNotNull(address) { "`address` is required but was not set" },
                    checkNotNull(category) { "`category` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(trustees) { "`trustees` is required but was not set" }
                        .toImmutable(),
                    formationDocumentFileId,
                    formationState,
                    grantor,
                    taxIdentifier,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * The trust's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        @NoAutoDetect
        class Address
        @JsonCreator
        private constructor(
            @JsonProperty("city") private val city: String,
            @JsonProperty("line1") private val line1: String,
            @JsonProperty("state") private val state: String,
            @JsonProperty("zip") private val zip: String,
            @JsonProperty("line2") private val line2: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The city of the address. */
            @JsonProperty("city") fun city(): String = city

            /** The first line of the address. This is usually the street number and street. */
            @JsonProperty("line1") fun line1(): String = line1

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") fun state(): String = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") fun zip(): String = zip

            /** The second line of the address. This might be the floor or room number. */
            @JsonProperty("line2") fun line2(): Optional<String> = Optional.ofNullable(line2)

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
                private var state: String? = null
                private var zip: String? = null
                private var line2: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    city = address.city
                    line1 = address.line1
                    state = address.state
                    zip = address.zip
                    line2 = address.line2
                    additionalProperties = address.additionalProperties.toMutableMap()
                }

                /** The city of the address. */
                fun city(city: String) = apply { this.city = city }

                /** The first line of the address. This is usually the street number and street. */
                fun line1(line1: String) = apply { this.line1 = line1 }

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                fun state(state: String) = apply { this.state = state }

                /** The ZIP code of the address. */
                fun zip(zip: String) = apply { this.zip = zip }

                /** The second line of the address. This might be the floor or room number. */
                fun line2(line2: String?) = apply { this.line2 = line2 }

                /** The second line of the address. This might be the floor or room number. */
                fun line2(line2: Optional<String>) = line2(line2.orElse(null))

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
                        checkNotNull(city) { "`city` is required but was not set" },
                        checkNotNull(line1) { "`line1` is required but was not set" },
                        checkNotNull(state) { "`state` is required but was not set" },
                        checkNotNull(zip) { "`zip` is required but was not set" },
                        line2,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Address && city == other.city && line1 == other.line1 && state == other.state && zip == other.zip && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(city, line1, state, zip, line2, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{city=$city, line1=$line1, state=$state, zip=$zip, line2=$line2, additionalProperties=$additionalProperties}"
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

        @NoAutoDetect
        class Trustee
        @JsonCreator
        private constructor(
            @JsonProperty("structure") private val structure: Structure,
            @JsonProperty("individual") private val individual: Individual?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The structure of the trustee. */
            @JsonProperty("structure") fun structure(): Structure = structure

            /**
             * Details of the individual trustee. Required when the trustee `structure` is equal to
             * `individual`.
             */
            @JsonProperty("individual")
            fun individual(): Optional<Individual> = Optional.ofNullable(individual)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var structure: Structure? = null
                private var individual: Individual? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(trustee: Trustee) = apply {
                    structure = trustee.structure
                    individual = trustee.individual
                    additionalProperties = trustee.additionalProperties.toMutableMap()
                }

                /** The structure of the trustee. */
                fun structure(structure: Structure) = apply { this.structure = structure }

                /**
                 * Details of the individual trustee. Required when the trustee `structure` is equal
                 * to `individual`.
                 */
                fun individual(individual: Individual?) = apply { this.individual = individual }

                /**
                 * Details of the individual trustee. Required when the trustee `structure` is equal
                 * to `individual`.
                 */
                fun individual(individual: Optional<Individual>) =
                    individual(individual.orElse(null))

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
                        checkNotNull(structure) { "`structure` is required but was not set" },
                        individual,
                        additionalProperties.toImmutable(),
                    )
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

            /**
             * Details of the individual trustee. Required when the trustee `structure` is equal to
             * `individual`.
             */
            @NoAutoDetect
            class Individual
            @JsonCreator
            private constructor(
                @JsonProperty("address") private val address: Address,
                @JsonProperty("date_of_birth") private val dateOfBirth: LocalDate,
                @JsonProperty("identification") private val identification: Identification,
                @JsonProperty("name") private val name: String,
                @JsonProperty("confirmed_no_us_tax_id") private val confirmedNoUsTaxId: Boolean?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
                 */
                @JsonProperty("address") fun address(): Address = address

                /** The person's date of birth in YYYY-MM-DD format. */
                @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate = dateOfBirth

                /** A means of verifying the person's identity. */
                @JsonProperty("identification")
                fun identification(): Identification = identification

                /** The person's legal name. */
                @JsonProperty("name") fun name(): String = name

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                @JsonProperty("confirmed_no_us_tax_id")
                fun confirmedNoUsTaxId(): Optional<Boolean> =
                    Optional.ofNullable(confirmedNoUsTaxId)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var address: Address? = null
                    private var dateOfBirth: LocalDate? = null
                    private var identification: Identification? = null
                    private var name: String? = null
                    private var confirmedNoUsTaxId: Boolean? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(individual: Individual) = apply {
                        address = individual.address
                        dateOfBirth = individual.dateOfBirth
                        identification = individual.identification
                        name = individual.name
                        confirmedNoUsTaxId = individual.confirmedNoUsTaxId
                        additionalProperties = individual.additionalProperties.toMutableMap()
                    }

                    /**
                     * The individual's physical address. Mail receiving locations like PO Boxes and
                     * PMB's are disallowed.
                     */
                    fun address(address: Address) = apply { this.address = address }

                    /** The person's date of birth in YYYY-MM-DD format. */
                    fun dateOfBirth(dateOfBirth: LocalDate) = apply {
                        this.dateOfBirth = dateOfBirth
                    }

                    /** A means of verifying the person's identity. */
                    fun identification(identification: Identification) = apply {
                        this.identification = identification
                    }

                    /** The person's legal name. */
                    fun name(name: String) = apply { this.name = name }

                    /**
                     * The identification method for an individual can only be a passport, driver's
                     * license, or other document if you've confirmed the individual does not have a
                     * US tax id (either a Social Security Number or Individual Taxpayer
                     * Identification Number).
                     */
                    fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean?) = apply {
                        this.confirmedNoUsTaxId = confirmedNoUsTaxId
                    }

                    /**
                     * The identification method for an individual can only be a passport, driver's
                     * license, or other document if you've confirmed the individual does not have a
                     * US tax id (either a Social Security Number or Individual Taxpayer
                     * Identification Number).
                     */
                    fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean) =
                        confirmedNoUsTaxId(confirmedNoUsTaxId as Boolean?)

                    /**
                     * The identification method for an individual can only be a passport, driver's
                     * license, or other document if you've confirmed the individual does not have a
                     * US tax id (either a Social Security Number or Individual Taxpayer
                     * Identification Number).
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun confirmedNoUsTaxId(confirmedNoUsTaxId: Optional<Boolean>) =
                        confirmedNoUsTaxId(confirmedNoUsTaxId.orElse(null) as Boolean?)

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
                            checkNotNull(address) { "`address` is required but was not set" },
                            checkNotNull(dateOfBirth) {
                                "`dateOfBirth` is required but was not set"
                            },
                            checkNotNull(identification) {
                                "`identification` is required but was not set"
                            },
                            checkNotNull(name) { "`name` is required but was not set" },
                            confirmedNoUsTaxId,
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
                 */
                @NoAutoDetect
                class Address
                @JsonCreator
                private constructor(
                    @JsonProperty("city") private val city: String,
                    @JsonProperty("line1") private val line1: String,
                    @JsonProperty("state") private val state: String,
                    @JsonProperty("zip") private val zip: String,
                    @JsonProperty("line2") private val line2: String?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The city of the address. */
                    @JsonProperty("city") fun city(): String = city

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    @JsonProperty("line1") fun line1(): String = line1

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    @JsonProperty("state") fun state(): String = state

                    /** The ZIP code of the address. */
                    @JsonProperty("zip") fun zip(): String = zip

                    /** The second line of the address. This might be the floor or room number. */
                    @JsonProperty("line2")
                    fun line2(): Optional<String> = Optional.ofNullable(line2)

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
                        private var state: String? = null
                        private var zip: String? = null
                        private var line2: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(address: Address) = apply {
                            city = address.city
                            line1 = address.line1
                            state = address.state
                            zip = address.zip
                            line2 = address.line2
                            additionalProperties = address.additionalProperties.toMutableMap()
                        }

                        /** The city of the address. */
                        fun city(city: String) = apply { this.city = city }

                        /**
                         * The first line of the address. This is usually the street number and
                         * street.
                         */
                        fun line1(line1: String) = apply { this.line1 = line1 }

                        /**
                         * The two-letter United States Postal Service (USPS) abbreviation for the
                         * state of the address.
                         */
                        fun state(state: String) = apply { this.state = state }

                        /** The ZIP code of the address. */
                        fun zip(zip: String) = apply { this.zip = zip }

                        /**
                         * The second line of the address. This might be the floor or room number.
                         */
                        fun line2(line2: String?) = apply { this.line2 = line2 }

                        /**
                         * The second line of the address. This might be the floor or room number.
                         */
                        fun line2(line2: Optional<String>) = line2(line2.orElse(null))

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
                                checkNotNull(city) { "`city` is required but was not set" },
                                checkNotNull(line1) { "`line1` is required but was not set" },
                                checkNotNull(state) { "`state` is required but was not set" },
                                checkNotNull(zip) { "`zip` is required but was not set" },
                                line2,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Address && city == other.city && line1 == other.line1 && state == other.state && zip == other.zip && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(city, line1, state, zip, line2, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Address{city=$city, line1=$line1, state=$state, zip=$zip, line2=$line2, additionalProperties=$additionalProperties}"
                }

                /** A means of verifying the person's identity. */
                @NoAutoDetect
                class Identification
                @JsonCreator
                private constructor(
                    @JsonProperty("method") private val method: Method,
                    @JsonProperty("number") private val number: String,
                    @JsonProperty("drivers_license") private val driversLicense: DriversLicense?,
                    @JsonProperty("other") private val other: Other?,
                    @JsonProperty("passport") private val passport: Passport?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** A method that can be used to verify the individual's identity. */
                    @JsonProperty("method") fun method(): Method = method

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     */
                    @JsonProperty("number") fun number(): String = number

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    @JsonProperty("drivers_license")
                    fun driversLicense(): Optional<DriversLicense> =
                        Optional.ofNullable(driversLicense)

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    @JsonProperty("other") fun other(): Optional<Other> = Optional.ofNullable(other)

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    @JsonProperty("passport")
                    fun passport(): Optional<Passport> = Optional.ofNullable(passport)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var method: Method? = null
                        private var number: String? = null
                        private var driversLicense: DriversLicense? = null
                        private var other: Other? = null
                        private var passport: Passport? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(identification: Identification) = apply {
                            method = identification.method
                            number = identification.number
                            driversLicense = identification.driversLicense
                            other = identification.other
                            passport = identification.passport
                            additionalProperties =
                                identification.additionalProperties.toMutableMap()
                        }

                        /** A method that can be used to verify the individual's identity. */
                        fun method(method: Method) = apply { this.method = method }

                        /**
                         * An identification number that can be used to verify the individual's
                         * identity, such as a social security number.
                         */
                        fun number(number: String) = apply { this.number = number }

                        /**
                         * Information about the United States driver's license used for
                         * identification. Required if `method` is equal to `drivers_license`.
                         */
                        fun driversLicense(driversLicense: DriversLicense?) = apply {
                            this.driversLicense = driversLicense
                        }

                        /**
                         * Information about the United States driver's license used for
                         * identification. Required if `method` is equal to `drivers_license`.
                         */
                        fun driversLicense(driversLicense: Optional<DriversLicense>) =
                            driversLicense(driversLicense.orElse(null))

                        /**
                         * Information about the identification document provided. Required if
                         * `method` is equal to `other`.
                         */
                        fun other(other: Other?) = apply { this.other = other }

                        /**
                         * Information about the identification document provided. Required if
                         * `method` is equal to `other`.
                         */
                        fun other(other: Optional<Other>) = other(other.orElse(null))

                        /**
                         * Information about the passport used for identification. Required if
                         * `method` is equal to `passport`.
                         */
                        fun passport(passport: Passport?) = apply { this.passport = passport }

                        /**
                         * Information about the passport used for identification. Required if
                         * `method` is equal to `passport`.
                         */
                        fun passport(passport: Optional<Passport>) = passport(passport.orElse(null))

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
                                checkNotNull(method) { "`method` is required but was not set" },
                                checkNotNull(number) { "`number` is required but was not set" },
                                driversLicense,
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

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    @NoAutoDetect
                    class DriversLicense
                    @JsonCreator
                    private constructor(
                        @JsonProperty("expiration_date") private val expirationDate: LocalDate,
                        @JsonProperty("file_id") private val fileId: String,
                        @JsonProperty("state") private val state: String,
                        @JsonProperty("back_file_id") private val backFileId: String?,
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        /** The driver's license's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(): LocalDate = expirationDate

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        @JsonProperty("file_id") fun fileId(): String = fileId

                        /** The state that issued the provided driver's license. */
                        @JsonProperty("state") fun state(): String = state

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        @JsonProperty("back_file_id")
                        fun backFileId(): Optional<String> = Optional.ofNullable(backFileId)

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var expirationDate: LocalDate? = null
                            private var fileId: String? = null
                            private var state: String? = null
                            private var backFileId: String? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(driversLicense: DriversLicense) = apply {
                                expirationDate = driversLicense.expirationDate
                                fileId = driversLicense.fileId
                                state = driversLicense.state
                                backFileId = driversLicense.backFileId
                                additionalProperties =
                                    driversLicense.additionalProperties.toMutableMap()
                            }

                            /** The driver's license's expiration date in YYYY-MM-DD format. */
                            fun expirationDate(expirationDate: LocalDate) = apply {
                                this.expirationDate = expirationDate
                            }

                            /**
                             * The identifier of the File containing the front of the driver's
                             * license.
                             */
                            fun fileId(fileId: String) = apply { this.fileId = fileId }

                            /** The state that issued the provided driver's license. */
                            fun state(state: String) = apply { this.state = state }

                            /**
                             * The identifier of the File containing the back of the driver's
                             * license.
                             */
                            fun backFileId(backFileId: String?) = apply {
                                this.backFileId = backFileId
                            }

                            /**
                             * The identifier of the File containing the back of the driver's
                             * license.
                             */
                            fun backFileId(backFileId: Optional<String>) =
                                backFileId(backFileId.orElse(null))

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

                            fun build(): DriversLicense =
                                DriversLicense(
                                    checkNotNull(expirationDate) {
                                        "`expirationDate` is required but was not set"
                                    },
                                    checkNotNull(fileId) { "`fileId` is required but was not set" },
                                    checkNotNull(state) { "`state` is required but was not set" },
                                    backFileId,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is DriversLicense && expirationDate == other.expirationDate && fileId == other.fileId && state == other.state && backFileId == other.backFileId && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(expirationDate, fileId, state, backFileId, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "DriversLicense{expirationDate=$expirationDate, fileId=$fileId, state=$state, backFileId=$backFileId, additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    @NoAutoDetect
                    class Other
                    @JsonCreator
                    private constructor(
                        @JsonProperty("country") private val country: String,
                        @JsonProperty("description") private val description: String,
                        @JsonProperty("file_id") private val fileId: String,
                        @JsonProperty("back_file_id") private val backFileId: String?,
                        @JsonProperty("expiration_date") private val expirationDate: LocalDate?,
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        /**
                         * The two-character ISO 3166-1 code representing the country that issued
                         * the document.
                         */
                        @JsonProperty("country") fun country(): String = country

                        /** A description of the document submitted. */
                        @JsonProperty("description") fun description(): String = description

                        /** The identifier of the File containing the front of the document. */
                        @JsonProperty("file_id") fun fileId(): String = fileId

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        @JsonProperty("back_file_id")
                        fun backFileId(): Optional<String> = Optional.ofNullable(backFileId)

                        /** The document's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(): Optional<LocalDate> =
                            Optional.ofNullable(expirationDate)

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var country: String? = null
                            private var description: String? = null
                            private var fileId: String? = null
                            private var backFileId: String? = null
                            private var expirationDate: LocalDate? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(other: Other) = apply {
                                country = other.country
                                description = other.description
                                fileId = other.fileId
                                backFileId = other.backFileId
                                expirationDate = other.expirationDate
                                additionalProperties = other.additionalProperties.toMutableMap()
                            }

                            /**
                             * The two-character ISO 3166-1 code representing the country that
                             * issued the document.
                             */
                            fun country(country: String) = apply { this.country = country }

                            /** A description of the document submitted. */
                            fun description(description: String) = apply {
                                this.description = description
                            }

                            /** The identifier of the File containing the front of the document. */
                            fun fileId(fileId: String) = apply { this.fileId = fileId }

                            /**
                             * The identifier of the File containing the back of the document. Not
                             * every document has a reverse side.
                             */
                            fun backFileId(backFileId: String?) = apply {
                                this.backFileId = backFileId
                            }

                            /**
                             * The identifier of the File containing the back of the document. Not
                             * every document has a reverse side.
                             */
                            fun backFileId(backFileId: Optional<String>) =
                                backFileId(backFileId.orElse(null))

                            /** The document's expiration date in YYYY-MM-DD format. */
                            fun expirationDate(expirationDate: LocalDate?) = apply {
                                this.expirationDate = expirationDate
                            }

                            /** The document's expiration date in YYYY-MM-DD format. */
                            fun expirationDate(expirationDate: Optional<LocalDate>) =
                                expirationDate(expirationDate.orElse(null))

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

                            fun build(): Other =
                                Other(
                                    checkNotNull(country) {
                                        "`country` is required but was not set"
                                    },
                                    checkNotNull(description) {
                                        "`description` is required but was not set"
                                    },
                                    checkNotNull(fileId) { "`fileId` is required but was not set" },
                                    backFileId,
                                    expirationDate,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Other && country == other.country && description == other.description && fileId == other.fileId && backFileId == other.backFileId && expirationDate == other.expirationDate && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(country, description, fileId, backFileId, expirationDate, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Other{country=$country, description=$description, fileId=$fileId, backFileId=$backFileId, expirationDate=$expirationDate, additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    @NoAutoDetect
                    class Passport
                    @JsonCreator
                    private constructor(
                        @JsonProperty("country") private val country: String,
                        @JsonProperty("expiration_date") private val expirationDate: LocalDate,
                        @JsonProperty("file_id") private val fileId: String,
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        /** The country that issued the passport. */
                        @JsonProperty("country") fun country(): String = country

                        /** The passport's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(): LocalDate = expirationDate

                        /** The identifier of the File containing the passport. */
                        @JsonProperty("file_id") fun fileId(): String = fileId

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
                                country = passport.country
                                expirationDate = passport.expirationDate
                                fileId = passport.fileId
                                additionalProperties = passport.additionalProperties.toMutableMap()
                            }

                            /** The country that issued the passport. */
                            fun country(country: String) = apply { this.country = country }

                            /** The passport's expiration date in YYYY-MM-DD format. */
                            fun expirationDate(expirationDate: LocalDate) = apply {
                                this.expirationDate = expirationDate
                            }

                            /** The identifier of the File containing the passport. */
                            fun fileId(fileId: String) = apply { this.fileId = fileId }

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

                            return /* spotless:off */ other is Passport && country == other.country && expirationDate == other.expirationDate && fileId == other.fileId && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(country, expirationDate, fileId, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Passport{country=$country, expirationDate=$expirationDate, fileId=$fileId, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Identification && method == other.method && number == other.number && driversLicense == other.driversLicense && this.other == other.other && passport == other.passport && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(method, number, driversLicense, other, passport, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Identification{method=$method, number=$number, driversLicense=$driversLicense, other=$other, passport=$passport, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Individual && address == other.address && dateOfBirth == other.dateOfBirth && identification == other.identification && name == other.name && confirmedNoUsTaxId == other.confirmedNoUsTaxId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(address, dateOfBirth, identification, name, confirmedNoUsTaxId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{address=$address, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, confirmedNoUsTaxId=$confirmedNoUsTaxId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Trustee && structure == other.structure && individual == other.individual && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(structure, individual, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Trustee{structure=$structure, individual=$individual, additionalProperties=$additionalProperties}"
        }

        /** The grantor of the trust. Required if `category` is equal to `revocable`. */
        @NoAutoDetect
        class Grantor
        @JsonCreator
        private constructor(
            @JsonProperty("address") private val address: Address,
            @JsonProperty("date_of_birth") private val dateOfBirth: LocalDate,
            @JsonProperty("identification") private val identification: Identification,
            @JsonProperty("name") private val name: String,
            @JsonProperty("confirmed_no_us_tax_id") private val confirmedNoUsTaxId: Boolean?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and PMB's
             * are disallowed.
             */
            @JsonProperty("address") fun address(): Address = address

            /** The person's date of birth in YYYY-MM-DD format. */
            @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate = dateOfBirth

            /** A means of verifying the person's identity. */
            @JsonProperty("identification") fun identification(): Identification = identification

            /** The person's legal name. */
            @JsonProperty("name") fun name(): String = name

            /**
             * The identification method for an individual can only be a passport, driver's license,
             * or other document if you've confirmed the individual does not have a US tax id
             * (either a Social Security Number or Individual Taxpayer Identification Number).
             */
            @JsonProperty("confirmed_no_us_tax_id")
            fun confirmedNoUsTaxId(): Optional<Boolean> = Optional.ofNullable(confirmedNoUsTaxId)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var address: Address? = null
                private var dateOfBirth: LocalDate? = null
                private var identification: Identification? = null
                private var name: String? = null
                private var confirmedNoUsTaxId: Boolean? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(grantor: Grantor) = apply {
                    address = grantor.address
                    dateOfBirth = grantor.dateOfBirth
                    identification = grantor.identification
                    name = grantor.name
                    confirmedNoUsTaxId = grantor.confirmedNoUsTaxId
                    additionalProperties = grantor.additionalProperties.toMutableMap()
                }

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
                 */
                fun address(address: Address) = apply { this.address = address }

                /** The person's date of birth in YYYY-MM-DD format. */
                fun dateOfBirth(dateOfBirth: LocalDate) = apply { this.dateOfBirth = dateOfBirth }

                /** A means of verifying the person's identity. */
                fun identification(identification: Identification) = apply {
                    this.identification = identification
                }

                /** The person's legal name. */
                fun name(name: String) = apply { this.name = name }

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean?) = apply {
                    this.confirmedNoUsTaxId = confirmedNoUsTaxId
                }

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean) =
                    confirmedNoUsTaxId(confirmedNoUsTaxId as Boolean?)

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun confirmedNoUsTaxId(confirmedNoUsTaxId: Optional<Boolean>) =
                    confirmedNoUsTaxId(confirmedNoUsTaxId.orElse(null) as Boolean?)

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
                        checkNotNull(address) { "`address` is required but was not set" },
                        checkNotNull(dateOfBirth) { "`dateOfBirth` is required but was not set" },
                        checkNotNull(identification) {
                            "`identification` is required but was not set"
                        },
                        checkNotNull(name) { "`name` is required but was not set" },
                        confirmedNoUsTaxId,
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and PMB's
             * are disallowed.
             */
            @NoAutoDetect
            class Address
            @JsonCreator
            private constructor(
                @JsonProperty("city") private val city: String,
                @JsonProperty("line1") private val line1: String,
                @JsonProperty("state") private val state: String,
                @JsonProperty("zip") private val zip: String,
                @JsonProperty("line2") private val line2: String?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The city of the address. */
                @JsonProperty("city") fun city(): String = city

                /** The first line of the address. This is usually the street number and street. */
                @JsonProperty("line1") fun line1(): String = line1

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                @JsonProperty("state") fun state(): String = state

                /** The ZIP code of the address. */
                @JsonProperty("zip") fun zip(): String = zip

                /** The second line of the address. This might be the floor or room number. */
                @JsonProperty("line2") fun line2(): Optional<String> = Optional.ofNullable(line2)

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
                    private var state: String? = null
                    private var zip: String? = null
                    private var line2: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(address: Address) = apply {
                        city = address.city
                        line1 = address.line1
                        state = address.state
                        zip = address.zip
                        line2 = address.line2
                        additionalProperties = address.additionalProperties.toMutableMap()
                    }

                    /** The city of the address. */
                    fun city(city: String) = apply { this.city = city }

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    fun line1(line1: String) = apply { this.line1 = line1 }

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    fun state(state: String) = apply { this.state = state }

                    /** The ZIP code of the address. */
                    fun zip(zip: String) = apply { this.zip = zip }

                    /** The second line of the address. This might be the floor or room number. */
                    fun line2(line2: String?) = apply { this.line2 = line2 }

                    /** The second line of the address. This might be the floor or room number. */
                    fun line2(line2: Optional<String>) = line2(line2.orElse(null))

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
                            checkNotNull(city) { "`city` is required but was not set" },
                            checkNotNull(line1) { "`line1` is required but was not set" },
                            checkNotNull(state) { "`state` is required but was not set" },
                            checkNotNull(zip) { "`zip` is required but was not set" },
                            line2,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Address && city == other.city && line1 == other.line1 && state == other.state && zip == other.zip && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(city, line1, state, zip, line2, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Address{city=$city, line1=$line1, state=$state, zip=$zip, line2=$line2, additionalProperties=$additionalProperties}"
            }

            /** A means of verifying the person's identity. */
            @NoAutoDetect
            class Identification
            @JsonCreator
            private constructor(
                @JsonProperty("method") private val method: Method,
                @JsonProperty("number") private val number: String,
                @JsonProperty("drivers_license") private val driversLicense: DriversLicense?,
                @JsonProperty("other") private val other: Other?,
                @JsonProperty("passport") private val passport: Passport?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** A method that can be used to verify the individual's identity. */
                @JsonProperty("method") fun method(): Method = method

                /**
                 * An identification number that can be used to verify the individual's identity,
                 * such as a social security number.
                 */
                @JsonProperty("number") fun number(): String = number

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                @JsonProperty("drivers_license")
                fun driversLicense(): Optional<DriversLicense> = Optional.ofNullable(driversLicense)

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                @JsonProperty("other") fun other(): Optional<Other> = Optional.ofNullable(other)

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                @JsonProperty("passport")
                fun passport(): Optional<Passport> = Optional.ofNullable(passport)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var method: Method? = null
                    private var number: String? = null
                    private var driversLicense: DriversLicense? = null
                    private var other: Other? = null
                    private var passport: Passport? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(identification: Identification) = apply {
                        method = identification.method
                        number = identification.number
                        driversLicense = identification.driversLicense
                        other = identification.other
                        passport = identification.passport
                        additionalProperties = identification.additionalProperties.toMutableMap()
                    }

                    /** A method that can be used to verify the individual's identity. */
                    fun method(method: Method) = apply { this.method = method }

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     */
                    fun number(number: String) = apply { this.number = number }

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    fun driversLicense(driversLicense: DriversLicense?) = apply {
                        this.driversLicense = driversLicense
                    }

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    fun driversLicense(driversLicense: Optional<DriversLicense>) =
                        driversLicense(driversLicense.orElse(null))

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    fun other(other: Other?) = apply { this.other = other }

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    fun other(other: Optional<Other>) = other(other.orElse(null))

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    fun passport(passport: Passport?) = apply { this.passport = passport }

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    fun passport(passport: Optional<Passport>) = passport(passport.orElse(null))

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
                            checkNotNull(method) { "`method` is required but was not set" },
                            checkNotNull(number) { "`number` is required but was not set" },
                            driversLicense,
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

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                @NoAutoDetect
                class DriversLicense
                @JsonCreator
                private constructor(
                    @JsonProperty("expiration_date") private val expirationDate: LocalDate,
                    @JsonProperty("file_id") private val fileId: String,
                    @JsonProperty("state") private val state: String,
                    @JsonProperty("back_file_id") private val backFileId: String?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The driver's license's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(): LocalDate = expirationDate

                    /** The identifier of the File containing the front of the driver's license. */
                    @JsonProperty("file_id") fun fileId(): String = fileId

                    /** The state that issued the provided driver's license. */
                    @JsonProperty("state") fun state(): String = state

                    /** The identifier of the File containing the back of the driver's license. */
                    @JsonProperty("back_file_id")
                    fun backFileId(): Optional<String> = Optional.ofNullable(backFileId)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var expirationDate: LocalDate? = null
                        private var fileId: String? = null
                        private var state: String? = null
                        private var backFileId: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(driversLicense: DriversLicense) = apply {
                            expirationDate = driversLicense.expirationDate
                            fileId = driversLicense.fileId
                            state = driversLicense.state
                            backFileId = driversLicense.backFileId
                            additionalProperties =
                                driversLicense.additionalProperties.toMutableMap()
                        }

                        /** The driver's license's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(expirationDate: LocalDate) = apply {
                            this.expirationDate = expirationDate
                        }

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        fun fileId(fileId: String) = apply { this.fileId = fileId }

                        /** The state that issued the provided driver's license. */
                        fun state(state: String) = apply { this.state = state }

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        fun backFileId(backFileId: String?) = apply { this.backFileId = backFileId }

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        fun backFileId(backFileId: Optional<String>) =
                            backFileId(backFileId.orElse(null))

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

                        fun build(): DriversLicense =
                            DriversLicense(
                                checkNotNull(expirationDate) {
                                    "`expirationDate` is required but was not set"
                                },
                                checkNotNull(fileId) { "`fileId` is required but was not set" },
                                checkNotNull(state) { "`state` is required but was not set" },
                                backFileId,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DriversLicense && expirationDate == other.expirationDate && fileId == other.fileId && state == other.state && backFileId == other.backFileId && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(expirationDate, fileId, state, backFileId, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "DriversLicense{expirationDate=$expirationDate, fileId=$fileId, state=$state, backFileId=$backFileId, additionalProperties=$additionalProperties}"
                }

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                @NoAutoDetect
                class Other
                @JsonCreator
                private constructor(
                    @JsonProperty("country") private val country: String,
                    @JsonProperty("description") private val description: String,
                    @JsonProperty("file_id") private val fileId: String,
                    @JsonProperty("back_file_id") private val backFileId: String?,
                    @JsonProperty("expiration_date") private val expirationDate: LocalDate?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /**
                     * The two-character ISO 3166-1 code representing the country that issued the
                     * document.
                     */
                    @JsonProperty("country") fun country(): String = country

                    /** A description of the document submitted. */
                    @JsonProperty("description") fun description(): String = description

                    /** The identifier of the File containing the front of the document. */
                    @JsonProperty("file_id") fun fileId(): String = fileId

                    /**
                     * The identifier of the File containing the back of the document. Not every
                     * document has a reverse side.
                     */
                    @JsonProperty("back_file_id")
                    fun backFileId(): Optional<String> = Optional.ofNullable(backFileId)

                    /** The document's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(): Optional<LocalDate> = Optional.ofNullable(expirationDate)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var country: String? = null
                        private var description: String? = null
                        private var fileId: String? = null
                        private var backFileId: String? = null
                        private var expirationDate: LocalDate? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(other: Other) = apply {
                            country = other.country
                            description = other.description
                            fileId = other.fileId
                            backFileId = other.backFileId
                            expirationDate = other.expirationDate
                            additionalProperties = other.additionalProperties.toMutableMap()
                        }

                        /**
                         * The two-character ISO 3166-1 code representing the country that issued
                         * the document.
                         */
                        fun country(country: String) = apply { this.country = country }

                        /** A description of the document submitted. */
                        fun description(description: String) = apply {
                            this.description = description
                        }

                        /** The identifier of the File containing the front of the document. */
                        fun fileId(fileId: String) = apply { this.fileId = fileId }

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        fun backFileId(backFileId: String?) = apply { this.backFileId = backFileId }

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        fun backFileId(backFileId: Optional<String>) =
                            backFileId(backFileId.orElse(null))

                        /** The document's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(expirationDate: LocalDate?) = apply {
                            this.expirationDate = expirationDate
                        }

                        /** The document's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(expirationDate: Optional<LocalDate>) =
                            expirationDate(expirationDate.orElse(null))

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

                        fun build(): Other =
                            Other(
                                checkNotNull(country) { "`country` is required but was not set" },
                                checkNotNull(description) {
                                    "`description` is required but was not set"
                                },
                                checkNotNull(fileId) { "`fileId` is required but was not set" },
                                backFileId,
                                expirationDate,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Other && country == other.country && description == other.description && fileId == other.fileId && backFileId == other.backFileId && expirationDate == other.expirationDate && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(country, description, fileId, backFileId, expirationDate, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Other{country=$country, description=$description, fileId=$fileId, backFileId=$backFileId, expirationDate=$expirationDate, additionalProperties=$additionalProperties}"
                }

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                @NoAutoDetect
                class Passport
                @JsonCreator
                private constructor(
                    @JsonProperty("country") private val country: String,
                    @JsonProperty("expiration_date") private val expirationDate: LocalDate,
                    @JsonProperty("file_id") private val fileId: String,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The country that issued the passport. */
                    @JsonProperty("country") fun country(): String = country

                    /** The passport's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(): LocalDate = expirationDate

                    /** The identifier of the File containing the passport. */
                    @JsonProperty("file_id") fun fileId(): String = fileId

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
                            country = passport.country
                            expirationDate = passport.expirationDate
                            fileId = passport.fileId
                            additionalProperties = passport.additionalProperties.toMutableMap()
                        }

                        /** The country that issued the passport. */
                        fun country(country: String) = apply { this.country = country }

                        /** The passport's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(expirationDate: LocalDate) = apply {
                            this.expirationDate = expirationDate
                        }

                        /** The identifier of the File containing the passport. */
                        fun fileId(fileId: String) = apply { this.fileId = fileId }

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

                        return /* spotless:off */ other is Passport && country == other.country && expirationDate == other.expirationDate && fileId == other.fileId && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(country, expirationDate, fileId, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Passport{country=$country, expirationDate=$expirationDate, fileId=$fileId, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Identification && method == other.method && number == other.number && driversLicense == other.driversLicense && this.other == other.other && passport == other.passport && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(method, number, driversLicense, other, passport, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Identification{method=$method, number=$number, driversLicense=$driversLicense, other=$other, passport=$passport, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Grantor && address == other.address && dateOfBirth == other.dateOfBirth && identification == other.identification && name == other.name && confirmedNoUsTaxId == other.confirmedNoUsTaxId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(address, dateOfBirth, identification, name, confirmedNoUsTaxId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Grantor{address=$address, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, confirmedNoUsTaxId=$confirmedNoUsTaxId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Trust && address == other.address && category == other.category && name == other.name && trustees == other.trustees && formationDocumentFileId == other.formationDocumentFileId && formationState == other.formationState && grantor == other.grantor && taxIdentifier == other.taxIdentifier && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, category, name, trustees, formationDocumentFileId, formationState, grantor, taxIdentifier, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Trust{address=$address, category=$category, name=$name, trustees=$trustees, formationDocumentFileId=$formationDocumentFileId, formationState=$formationState, grantor=$grantor, taxIdentifier=$taxIdentifier, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EntityCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EntityCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
