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
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
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
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

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

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = EntityCreateBody.Builder::class)
    @NoAutoDetect
    class EntityCreateBody
    internal constructor(
        private val structure: Structure,
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
            private var supplementalDocuments: List<SupplementalDocument>? = null
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

        private var structure: Structure? = null
        private var corporation: Corporation? = null
        private var description: String? = null
        private var governmentAuthority: GovernmentAuthority? = null
        private var joint: Joint? = null
        private var naturalPerson: NaturalPerson? = null
        private var supplementalDocuments: MutableList<SupplementalDocument> = mutableListOf()
        private var thirdPartyVerification: ThirdPartyVerification? = null
        private var trust: Trust? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(entityCreateParams: EntityCreateParams) = apply {
            structure = entityCreateParams.structure
            corporation = entityCreateParams.corporation
            description = entityCreateParams.description
            governmentAuthority = entityCreateParams.governmentAuthority
            joint = entityCreateParams.joint
            naturalPerson = entityCreateParams.naturalPerson
            supplementalDocuments =
                entityCreateParams.supplementalDocuments?.toMutableList() ?: mutableListOf()
            thirdPartyVerification = entityCreateParams.thirdPartyVerification
            trust = entityCreateParams.trust
            additionalHeaders = entityCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = entityCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = entityCreateParams.additionalBodyProperties.toMutableMap()
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
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): EntityCreateParams =
            EntityCreateParams(
                checkNotNull(structure) { "`structure` is required but was not set" },
                corporation,
                description,
                governmentAuthority,
                joint,
                naturalPerson,
                supplementalDocuments.toImmutable().ifEmpty { null },
                thirdPartyVerification,
                trust,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
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
    @JsonDeserialize(builder = Corporation.Builder::class)
    @NoAutoDetect
    class Corporation
    private constructor(
        private val address: Address,
        private val beneficialOwners: List<BeneficialOwner>,
        private val incorporationState: String?,
        private val industryCode: String?,
        private val name: String,
        private val taxIdentifier: String,
        private val website: String?,
        private val additionalProperties: Map<String, JsonValue>,
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

        /** The legal name of the corporation. */
        @JsonProperty("name") fun name(): String = name

        /** The Employer Identification Number (EIN) for the corporation. */
        @JsonProperty("tax_identifier") fun taxIdentifier(): String = taxIdentifier

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
            private var beneficialOwners: List<BeneficialOwner>? = null
            private var incorporationState: String? = null
            private var industryCode: String? = null
            private var name: String? = null
            private var taxIdentifier: String? = null
            private var website: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(corporation: Corporation) = apply {
                address = corporation.address
                beneficialOwners = corporation.beneficialOwners.toMutableList()
                incorporationState = corporation.incorporationState
                industryCode = corporation.industryCode
                name = corporation.name
                taxIdentifier = corporation.taxIdentifier
                website = corporation.website
                additionalProperties = corporation.additionalProperties.toMutableMap()
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
            private val city: String,
            private val line1: String,
            private val line2: String?,
            private val state: String,
            private val zip: String,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The city of the address. */
            @JsonProperty("city") fun city(): String = city

            /** The first line of the address. This is usually the street number and street. */
            @JsonProperty("line1") fun line1(): String = line1

            /** The second line of the address. This might be the floor or room number. */
            @JsonProperty("line2") fun line2(): Optional<String> = Optional.ofNullable(line2)

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") fun state(): String = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") fun zip(): String = zip

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
                    city = address.city
                    line1 = address.line1
                    line2 = address.line2
                    state = address.state
                    zip = address.zip
                    additionalProperties = address.additionalProperties.toMutableMap()
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
            private val companyTitle: String?,
            private val individual: Individual,
            private val prongs: List<Prong>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** This person's role or title within the entity. */
            @JsonProperty("company_title")
            fun companyTitle(): Optional<String> = Optional.ofNullable(companyTitle)

            /** Personal details for the beneficial owner. */
            @JsonProperty("individual") fun individual(): Individual = individual

            /**
             * Why this person is considered a beneficial owner of the entity. At least one option
             * is required, if a person is both a control person and owner, submit an array
             * containing both.
             */
            @JsonProperty("prongs") fun prongs(): List<Prong> = prongs

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
                    companyTitle = beneficialOwner.companyTitle
                    individual = beneficialOwner.individual
                    prongs = beneficialOwner.prongs.toMutableList()
                    additionalProperties = beneficialOwner.additionalProperties.toMutableMap()
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
                private val address: Address,
                private val confirmedNoUsTaxId: Boolean?,
                private val dateOfBirth: LocalDate,
                private val identification: Identification,
                private val name: String,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
                 */
                @JsonProperty("address") fun address(): Address = address

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                @JsonProperty("confirmed_no_us_tax_id")
                fun confirmedNoUsTaxId(): Optional<Boolean> =
                    Optional.ofNullable(confirmedNoUsTaxId)

                /** The person's date of birth in YYYY-MM-DD format. */
                @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate = dateOfBirth

                /** A means of verifying the person's identity. */
                @JsonProperty("identification")
                fun identification(): Identification = identification

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

                    private var address: Address? = null
                    private var confirmedNoUsTaxId: Boolean? = null
                    private var dateOfBirth: LocalDate? = null
                    private var identification: Identification? = null
                    private var name: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(individual: Individual) = apply {
                        address = individual.address
                        confirmedNoUsTaxId = individual.confirmedNoUsTaxId
                        dateOfBirth = individual.dateOfBirth
                        identification = individual.identification
                        name = individual.name
                        additionalProperties = individual.additionalProperties.toMutableMap()
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
                    private val city: String,
                    private val line1: String,
                    private val line2: String?,
                    private val state: String,
                    private val zip: String,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /** The city of the address. */
                    @JsonProperty("city") fun city(): String = city

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    @JsonProperty("line1") fun line1(): String = line1

                    /** The second line of the address. This might be the floor or room number. */
                    @JsonProperty("line2")
                    fun line2(): Optional<String> = Optional.ofNullable(line2)

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    @JsonProperty("state") fun state(): String = state

                    /** The ZIP code of the address. */
                    @JsonProperty("zip") fun zip(): String = zip

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
                            city = address.city
                            line1 = address.line1
                            line2 = address.line2
                            state = address.state
                            zip = address.zip
                            additionalProperties = address.additionalProperties.toMutableMap()
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
                    private val driversLicense: DriversLicense?,
                    private val method: Method,
                    private val number: String,
                    private val other: Other?,
                    private val passport: Passport?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    @JsonProperty("drivers_license")
                    fun driversLicense(): Optional<DriversLicense> =
                        Optional.ofNullable(driversLicense)

                    /** A method that can be used to verify the individual's identity. */
                    @JsonProperty("method") fun method(): Method = method

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     */
                    @JsonProperty("number") fun number(): String = number

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

                        private var driversLicense: DriversLicense? = null
                        private var method: Method? = null
                        private var number: String? = null
                        private var other: Other? = null
                        private var passport: Passport? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(identification: Identification) = apply {
                            driversLicense = identification.driversLicense
                            method = identification.method
                            number = identification.number
                            other = identification.other
                            passport = identification.passport
                            additionalProperties =
                                identification.additionalProperties.toMutableMap()
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
                    @JsonDeserialize(builder = DriversLicense.Builder::class)
                    @NoAutoDetect
                    class DriversLicense
                    private constructor(
                        private val backFileId: String?,
                        private val expirationDate: LocalDate,
                        private val fileId: String,
                        private val state: String,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        @JsonProperty("back_file_id")
                        fun backFileId(): Optional<String> = Optional.ofNullable(backFileId)

                        /** The driver's license's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(): LocalDate = expirationDate

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        @JsonProperty("file_id") fun fileId(): String = fileId

                        /** The state that issued the provided driver's license. */
                        @JsonProperty("state") fun state(): String = state

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
                                backFileId = driversLicense.backFileId
                                expirationDate = driversLicense.expirationDate
                                fileId = driversLicense.fileId
                                state = driversLicense.state
                                additionalProperties =
                                    driversLicense.additionalProperties.toMutableMap()
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

                            return /* spotless:off */ other is DriversLicense && backFileId == other.backFileId && expirationDate == other.expirationDate && fileId == other.fileId && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(backFileId, expirationDate, fileId, state, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

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
                        private val country: String,
                        private val description: String,
                        private val expirationDate: LocalDate?,
                        private val fileId: String,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        @JsonProperty("back_file_id")
                        fun backFileId(): Optional<String> = Optional.ofNullable(backFileId)

                        /**
                         * The two-character ISO 3166-1 code representing the country that issued
                         * the document.
                         */
                        @JsonProperty("country") fun country(): String = country

                        /** A description of the document submitted. */
                        @JsonProperty("description") fun description(): String = description

                        /** The document's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(): Optional<LocalDate> =
                            Optional.ofNullable(expirationDate)

                        /** The identifier of the File containing the front of the document. */
                        @JsonProperty("file_id") fun fileId(): String = fileId

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
                                backFileId = other.backFileId
                                country = other.country
                                description = other.description
                                expirationDate = other.expirationDate
                                fileId = other.fileId
                                additionalProperties = other.additionalProperties.toMutableMap()
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

                            return /* spotless:off */ other is Other && backFileId == other.backFileId && country == other.country && description == other.description && expirationDate == other.expirationDate && fileId == other.fileId && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(backFileId, country, description, expirationDate, fileId, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

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
                        private val country: String,
                        private val expirationDate: LocalDate,
                        private val fileId: String,
                        private val additionalProperties: Map<String, JsonValue>,
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

                        return /* spotless:off */ other is Identification && driversLicense == other.driversLicense && method == other.method && number == other.number && this.other == other.other && passport == other.passport && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(driversLicense, method, number, other, passport, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Identification{driversLicense=$driversLicense, method=$method, number=$number, other=$other, passport=$passport, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Individual && address == other.address && confirmedNoUsTaxId == other.confirmedNoUsTaxId && dateOfBirth == other.dateOfBirth && identification == other.identification && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(address, confirmedNoUsTaxId, dateOfBirth, identification, name, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{address=$address, confirmedNoUsTaxId=$confirmedNoUsTaxId, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, additionalProperties=$additionalProperties}"
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

                return /* spotless:off */ other is BeneficialOwner && companyTitle == other.companyTitle && individual == other.individual && prongs == other.prongs && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(companyTitle, individual, prongs, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BeneficialOwner{companyTitle=$companyTitle, individual=$individual, prongs=$prongs, additionalProperties=$additionalProperties}"
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
     * Details of the Government Authority entity to create. Required if `structure` is equal to
     * `Government Authority`.
     */
    @JsonDeserialize(builder = GovernmentAuthority.Builder::class)
    @NoAutoDetect
    class GovernmentAuthority
    private constructor(
        private val address: Address,
        private val authorizedPersons: List<AuthorizedPerson>,
        private val category: Category,
        private val name: String,
        private val taxIdentifier: String,
        private val website: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
            private var authorizedPersons: List<AuthorizedPerson>? = null
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
            private val city: String,
            private val line1: String,
            private val line2: String?,
            private val state: String,
            private val zip: String,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The city of the address. */
            @JsonProperty("city") fun city(): String = city

            /** The first line of the address. This is usually the street number and street. */
            @JsonProperty("line1") fun line1(): String = line1

            /** The second line of the address. This might be the floor or room number. */
            @JsonProperty("line2") fun line2(): Optional<String> = Optional.ofNullable(line2)

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") fun state(): String = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") fun zip(): String = zip

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
                    city = address.city
                    line1 = address.line1
                    line2 = address.line2
                    state = address.state
                    zip = address.zip
                    additionalProperties = address.additionalProperties.toMutableMap()
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
            private val name: String,
            private val additionalProperties: Map<String, JsonValue>,
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
                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

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
    @JsonDeserialize(builder = Joint.Builder::class)
    @NoAutoDetect
    class Joint
    private constructor(
        private val individuals: List<Individual>,
        private val name: String?,
        private val additionalProperties: Map<String, JsonValue>,
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

            private var individuals: List<Individual>? = null
            private var name: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(joint: Joint) = apply {
                individuals = joint.individuals.toMutableList()
                name = joint.name
                additionalProperties = joint.additionalProperties.toMutableMap()
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
            private val address: Address,
            private val confirmedNoUsTaxId: Boolean?,
            private val dateOfBirth: LocalDate,
            private val identification: Identification,
            private val name: String,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and PMB's
             * are disallowed.
             */
            @JsonProperty("address") fun address(): Address = address

            /**
             * The identification method for an individual can only be a passport, driver's license,
             * or other document if you've confirmed the individual does not have a US tax id
             * (either a Social Security Number or Individual Taxpayer Identification Number).
             */
            @JsonProperty("confirmed_no_us_tax_id")
            fun confirmedNoUsTaxId(): Optional<Boolean> = Optional.ofNullable(confirmedNoUsTaxId)

            /** The person's date of birth in YYYY-MM-DD format. */
            @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate = dateOfBirth

            /** A means of verifying the person's identity. */
            @JsonProperty("identification") fun identification(): Identification = identification

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

                private var address: Address? = null
                private var confirmedNoUsTaxId: Boolean? = null
                private var dateOfBirth: LocalDate? = null
                private var identification: Identification? = null
                private var name: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(individual: Individual) = apply {
                    address = individual.address
                    confirmedNoUsTaxId = individual.confirmedNoUsTaxId
                    dateOfBirth = individual.dateOfBirth
                    identification = individual.identification
                    name = individual.name
                    additionalProperties = individual.additionalProperties.toMutableMap()
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
                private val city: String,
                private val line1: String,
                private val line2: String?,
                private val state: String,
                private val zip: String,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** The city of the address. */
                @JsonProperty("city") fun city(): String = city

                /** The first line of the address. This is usually the street number and street. */
                @JsonProperty("line1") fun line1(): String = line1

                /** The second line of the address. This might be the floor or room number. */
                @JsonProperty("line2") fun line2(): Optional<String> = Optional.ofNullable(line2)

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                @JsonProperty("state") fun state(): String = state

                /** The ZIP code of the address. */
                @JsonProperty("zip") fun zip(): String = zip

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
                        city = address.city
                        line1 = address.line1
                        line2 = address.line2
                        state = address.state
                        zip = address.zip
                        additionalProperties = address.additionalProperties.toMutableMap()
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
                private val driversLicense: DriversLicense?,
                private val method: Method,
                private val number: String,
                private val other: Other?,
                private val passport: Passport?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                @JsonProperty("drivers_license")
                fun driversLicense(): Optional<DriversLicense> = Optional.ofNullable(driversLicense)

                /** A method that can be used to verify the individual's identity. */
                @JsonProperty("method") fun method(): Method = method

                /**
                 * An identification number that can be used to verify the individual's identity,
                 * such as a social security number.
                 */
                @JsonProperty("number") fun number(): String = number

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

                    private var driversLicense: DriversLicense? = null
                    private var method: Method? = null
                    private var number: String? = null
                    private var other: Other? = null
                    private var passport: Passport? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(identification: Identification) = apply {
                        driversLicense = identification.driversLicense
                        method = identification.method
                        number = identification.number
                        other = identification.other
                        passport = identification.passport
                        additionalProperties = identification.additionalProperties.toMutableMap()
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
                @JsonDeserialize(builder = DriversLicense.Builder::class)
                @NoAutoDetect
                class DriversLicense
                private constructor(
                    private val backFileId: String?,
                    private val expirationDate: LocalDate,
                    private val fileId: String,
                    private val state: String,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /** The identifier of the File containing the back of the driver's license. */
                    @JsonProperty("back_file_id")
                    fun backFileId(): Optional<String> = Optional.ofNullable(backFileId)

                    /** The driver's license's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(): LocalDate = expirationDate

                    /** The identifier of the File containing the front of the driver's license. */
                    @JsonProperty("file_id") fun fileId(): String = fileId

                    /** The state that issued the provided driver's license. */
                    @JsonProperty("state") fun state(): String = state

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
                            backFileId = driversLicense.backFileId
                            expirationDate = driversLicense.expirationDate
                            fileId = driversLicense.fileId
                            state = driversLicense.state
                            additionalProperties =
                                driversLicense.additionalProperties.toMutableMap()
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

                        return /* spotless:off */ other is DriversLicense && backFileId == other.backFileId && expirationDate == other.expirationDate && fileId == other.fileId && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(backFileId, expirationDate, fileId, state, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

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
                    private val country: String,
                    private val description: String,
                    private val expirationDate: LocalDate?,
                    private val fileId: String,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /**
                     * The identifier of the File containing the back of the document. Not every
                     * document has a reverse side.
                     */
                    @JsonProperty("back_file_id")
                    fun backFileId(): Optional<String> = Optional.ofNullable(backFileId)

                    /**
                     * The two-character ISO 3166-1 code representing the country that issued the
                     * document.
                     */
                    @JsonProperty("country") fun country(): String = country

                    /** A description of the document submitted. */
                    @JsonProperty("description") fun description(): String = description

                    /** The document's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(): Optional<LocalDate> = Optional.ofNullable(expirationDate)

                    /** The identifier of the File containing the front of the document. */
                    @JsonProperty("file_id") fun fileId(): String = fileId

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
                            backFileId = other.backFileId
                            country = other.country
                            description = other.description
                            expirationDate = other.expirationDate
                            fileId = other.fileId
                            additionalProperties = other.additionalProperties.toMutableMap()
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

                        return /* spotless:off */ other is Other && backFileId == other.backFileId && country == other.country && description == other.description && expirationDate == other.expirationDate && fileId == other.fileId && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(backFileId, country, description, expirationDate, fileId, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

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
                    private val country: String,
                    private val expirationDate: LocalDate,
                    private val fileId: String,
                    private val additionalProperties: Map<String, JsonValue>,
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

                    return /* spotless:off */ other is Identification && driversLicense == other.driversLicense && method == other.method && number == other.number && this.other == other.other && passport == other.passport && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(driversLicense, method, number, other, passport, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Identification{driversLicense=$driversLicense, method=$method, number=$number, other=$other, passport=$passport, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Individual && address == other.address && confirmedNoUsTaxId == other.confirmedNoUsTaxId && dateOfBirth == other.dateOfBirth && identification == other.identification && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(address, confirmedNoUsTaxId, dateOfBirth, identification, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Individual{address=$address, confirmedNoUsTaxId=$confirmedNoUsTaxId, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, additionalProperties=$additionalProperties}"
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
    @JsonDeserialize(builder = NaturalPerson.Builder::class)
    @NoAutoDetect
    class NaturalPerson
    private constructor(
        private val address: Address,
        private val confirmedNoUsTaxId: Boolean?,
        private val dateOfBirth: LocalDate,
        private val identification: Identification,
        private val name: String,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The individual's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        @JsonProperty("address") fun address(): Address = address

        /**
         * The identification method for an individual can only be a passport, driver's license, or
         * other document if you've confirmed the individual does not have a US tax id (either a
         * Social Security Number or Individual Taxpayer Identification Number).
         */
        @JsonProperty("confirmed_no_us_tax_id")
        fun confirmedNoUsTaxId(): Optional<Boolean> = Optional.ofNullable(confirmedNoUsTaxId)

        /** The person's date of birth in YYYY-MM-DD format. */
        @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate = dateOfBirth

        /** A means of verifying the person's identity. */
        @JsonProperty("identification") fun identification(): Identification = identification

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

            private var address: Address? = null
            private var confirmedNoUsTaxId: Boolean? = null
            private var dateOfBirth: LocalDate? = null
            private var identification: Identification? = null
            private var name: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(naturalPerson: NaturalPerson) = apply {
                address = naturalPerson.address
                confirmedNoUsTaxId = naturalPerson.confirmedNoUsTaxId
                dateOfBirth = naturalPerson.dateOfBirth
                identification = naturalPerson.identification
                name = naturalPerson.name
                additionalProperties = naturalPerson.additionalProperties.toMutableMap()
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
            private val city: String,
            private val line1: String,
            private val line2: String?,
            private val state: String,
            private val zip: String,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The city of the address. */
            @JsonProperty("city") fun city(): String = city

            /** The first line of the address. This is usually the street number and street. */
            @JsonProperty("line1") fun line1(): String = line1

            /** The second line of the address. This might be the floor or room number. */
            @JsonProperty("line2") fun line2(): Optional<String> = Optional.ofNullable(line2)

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") fun state(): String = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") fun zip(): String = zip

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
                    city = address.city
                    line1 = address.line1
                    line2 = address.line2
                    state = address.state
                    zip = address.zip
                    additionalProperties = address.additionalProperties.toMutableMap()
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
            private val driversLicense: DriversLicense?,
            private val method: Method,
            private val number: String,
            private val other: Other?,
            private val passport: Passport?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * Information about the United States driver's license used for identification.
             * Required if `method` is equal to `drivers_license`.
             */
            @JsonProperty("drivers_license")
            fun driversLicense(): Optional<DriversLicense> = Optional.ofNullable(driversLicense)

            /** A method that can be used to verify the individual's identity. */
            @JsonProperty("method") fun method(): Method = method

            /**
             * An identification number that can be used to verify the individual's identity, such
             * as a social security number.
             */
            @JsonProperty("number") fun number(): String = number

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

                private var driversLicense: DriversLicense? = null
                private var method: Method? = null
                private var number: String? = null
                private var other: Other? = null
                private var passport: Passport? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(identification: Identification) = apply {
                    driversLicense = identification.driversLicense
                    method = identification.method
                    number = identification.number
                    other = identification.other
                    passport = identification.passport
                    additionalProperties = identification.additionalProperties.toMutableMap()
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
            @JsonDeserialize(builder = DriversLicense.Builder::class)
            @NoAutoDetect
            class DriversLicense
            private constructor(
                private val backFileId: String?,
                private val expirationDate: LocalDate,
                private val fileId: String,
                private val state: String,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** The identifier of the File containing the back of the driver's license. */
                @JsonProperty("back_file_id")
                fun backFileId(): Optional<String> = Optional.ofNullable(backFileId)

                /** The driver's license's expiration date in YYYY-MM-DD format. */
                @JsonProperty("expiration_date") fun expirationDate(): LocalDate = expirationDate

                /** The identifier of the File containing the front of the driver's license. */
                @JsonProperty("file_id") fun fileId(): String = fileId

                /** The state that issued the provided driver's license. */
                @JsonProperty("state") fun state(): String = state

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
                        backFileId = driversLicense.backFileId
                        expirationDate = driversLicense.expirationDate
                        fileId = driversLicense.fileId
                        state = driversLicense.state
                        additionalProperties = driversLicense.additionalProperties.toMutableMap()
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

                    return /* spotless:off */ other is DriversLicense && backFileId == other.backFileId && expirationDate == other.expirationDate && fileId == other.fileId && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(backFileId, expirationDate, fileId, state, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

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
                private val country: String,
                private val description: String,
                private val expirationDate: LocalDate?,
                private val fileId: String,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /**
                 * The identifier of the File containing the back of the document. Not every
                 * document has a reverse side.
                 */
                @JsonProperty("back_file_id")
                fun backFileId(): Optional<String> = Optional.ofNullable(backFileId)

                /**
                 * The two-character ISO 3166-1 code representing the country that issued the
                 * document.
                 */
                @JsonProperty("country") fun country(): String = country

                /** A description of the document submitted. */
                @JsonProperty("description") fun description(): String = description

                /** The document's expiration date in YYYY-MM-DD format. */
                @JsonProperty("expiration_date")
                fun expirationDate(): Optional<LocalDate> = Optional.ofNullable(expirationDate)

                /** The identifier of the File containing the front of the document. */
                @JsonProperty("file_id") fun fileId(): String = fileId

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
                        backFileId = other.backFileId
                        country = other.country
                        description = other.description
                        expirationDate = other.expirationDate
                        fileId = other.fileId
                        additionalProperties = other.additionalProperties.toMutableMap()
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

                    return /* spotless:off */ other is Other && backFileId == other.backFileId && country == other.country && description == other.description && expirationDate == other.expirationDate && fileId == other.fileId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(backFileId, country, description, expirationDate, fileId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

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
                private val country: String,
                private val expirationDate: LocalDate,
                private val fileId: String,
                private val additionalProperties: Map<String, JsonValue>,
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

                return /* spotless:off */ other is Identification && driversLicense == other.driversLicense && method == other.method && number == other.number && this.other == other.other && passport == other.passport && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(driversLicense, method, number, other, passport, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Identification{driversLicense=$driversLicense, method=$method, number=$number, other=$other, passport=$passport, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NaturalPerson && address == other.address && confirmedNoUsTaxId == other.confirmedNoUsTaxId && dateOfBirth == other.dateOfBirth && identification == other.identification && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, confirmedNoUsTaxId, dateOfBirth, identification, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NaturalPerson{address=$address, confirmedNoUsTaxId=$confirmedNoUsTaxId, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = SupplementalDocument.Builder::class)
    @NoAutoDetect
    class SupplementalDocument
    private constructor(
        private val fileId: String,
        private val additionalProperties: Map<String, JsonValue>,
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
            @JsonProperty("file_id") fun fileId(fileId: String) = apply { this.fileId = fileId }

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
    @JsonDeserialize(builder = ThirdPartyVerification.Builder::class)
    @NoAutoDetect
    class ThirdPartyVerification
    private constructor(
        private val reference: String,
        private val vendor: Vendor,
        private val additionalProperties: Map<String, JsonValue>,
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
            @JsonProperty("reference")
            fun reference(reference: String) = apply { this.reference = reference }

            /** The vendor that was used to perform the verification. */
            @JsonProperty("vendor") fun vendor(vendor: Vendor) = apply { this.vendor = vendor }

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
    @JsonDeserialize(builder = Trust.Builder::class)
    @NoAutoDetect
    class Trust
    private constructor(
        private val address: Address,
        private val category: Category,
        private val formationDocumentFileId: String?,
        private val formationState: String?,
        private val grantor: Grantor?,
        private val name: String,
        private val taxIdentifier: String?,
        private val trustees: List<Trustee>,
        private val additionalProperties: Map<String, JsonValue>,
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

        /** The legal name of the trust. */
        @JsonProperty("name") fun name(): String = name

        /**
         * The Employer Identification Number (EIN) for the trust. Required if `category` is equal
         * to `irrevocable`.
         */
        @JsonProperty("tax_identifier")
        fun taxIdentifier(): Optional<String> = Optional.ofNullable(taxIdentifier)

        /** The trustees of the trust. */
        @JsonProperty("trustees") fun trustees(): List<Trustee> = trustees

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
                address = trust.address
                category = trust.category
                formationDocumentFileId = trust.formationDocumentFileId
                formationState = trust.formationState
                grantor = trust.grantor
                name = trust.name
                taxIdentifier = trust.taxIdentifier
                trustees = trust.trustees.toMutableList()
                additionalProperties = trust.additionalProperties.toMutableMap()
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
            private val city: String,
            private val line1: String,
            private val line2: String?,
            private val state: String,
            private val zip: String,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The city of the address. */
            @JsonProperty("city") fun city(): String = city

            /** The first line of the address. This is usually the street number and street. */
            @JsonProperty("line1") fun line1(): String = line1

            /** The second line of the address. This might be the floor or room number. */
            @JsonProperty("line2") fun line2(): Optional<String> = Optional.ofNullable(line2)

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") fun state(): String = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") fun zip(): String = zip

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
                    city = address.city
                    line1 = address.line1
                    line2 = address.line2
                    state = address.state
                    zip = address.zip
                    additionalProperties = address.additionalProperties.toMutableMap()
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

        @JsonDeserialize(builder = Trustee.Builder::class)
        @NoAutoDetect
        class Trustee
        private constructor(
            private val individual: Individual?,
            private val structure: Structure,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * Details of the individual trustee. Required when the trustee `structure` is equal to
             * `individual`.
             */
            @JsonProperty("individual")
            fun individual(): Optional<Individual> = Optional.ofNullable(individual)

            /** The structure of the trustee. */
            @JsonProperty("structure") fun structure(): Structure = structure

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
                    individual = trustee.individual
                    structure = trustee.structure
                    additionalProperties = trustee.additionalProperties.toMutableMap()
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
            @JsonDeserialize(builder = Individual.Builder::class)
            @NoAutoDetect
            class Individual
            private constructor(
                private val address: Address,
                private val confirmedNoUsTaxId: Boolean?,
                private val dateOfBirth: LocalDate,
                private val identification: Identification,
                private val name: String,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
                 */
                @JsonProperty("address") fun address(): Address = address

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                @JsonProperty("confirmed_no_us_tax_id")
                fun confirmedNoUsTaxId(): Optional<Boolean> =
                    Optional.ofNullable(confirmedNoUsTaxId)

                /** The person's date of birth in YYYY-MM-DD format. */
                @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate = dateOfBirth

                /** A means of verifying the person's identity. */
                @JsonProperty("identification")
                fun identification(): Identification = identification

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

                    private var address: Address? = null
                    private var confirmedNoUsTaxId: Boolean? = null
                    private var dateOfBirth: LocalDate? = null
                    private var identification: Identification? = null
                    private var name: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(individual: Individual) = apply {
                        address = individual.address
                        confirmedNoUsTaxId = individual.confirmedNoUsTaxId
                        dateOfBirth = individual.dateOfBirth
                        identification = individual.identification
                        name = individual.name
                        additionalProperties = individual.additionalProperties.toMutableMap()
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
                    private val city: String,
                    private val line1: String,
                    private val line2: String?,
                    private val state: String,
                    private val zip: String,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /** The city of the address. */
                    @JsonProperty("city") fun city(): String = city

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    @JsonProperty("line1") fun line1(): String = line1

                    /** The second line of the address. This might be the floor or room number. */
                    @JsonProperty("line2")
                    fun line2(): Optional<String> = Optional.ofNullable(line2)

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    @JsonProperty("state") fun state(): String = state

                    /** The ZIP code of the address. */
                    @JsonProperty("zip") fun zip(): String = zip

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
                            city = address.city
                            line1 = address.line1
                            line2 = address.line2
                            state = address.state
                            zip = address.zip
                            additionalProperties = address.additionalProperties.toMutableMap()
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
                    private val driversLicense: DriversLicense?,
                    private val method: Method,
                    private val number: String,
                    private val other: Other?,
                    private val passport: Passport?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    @JsonProperty("drivers_license")
                    fun driversLicense(): Optional<DriversLicense> =
                        Optional.ofNullable(driversLicense)

                    /** A method that can be used to verify the individual's identity. */
                    @JsonProperty("method") fun method(): Method = method

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     */
                    @JsonProperty("number") fun number(): String = number

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

                        private var driversLicense: DriversLicense? = null
                        private var method: Method? = null
                        private var number: String? = null
                        private var other: Other? = null
                        private var passport: Passport? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(identification: Identification) = apply {
                            driversLicense = identification.driversLicense
                            method = identification.method
                            number = identification.number
                            other = identification.other
                            passport = identification.passport
                            additionalProperties =
                                identification.additionalProperties.toMutableMap()
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
                    @JsonDeserialize(builder = DriversLicense.Builder::class)
                    @NoAutoDetect
                    class DriversLicense
                    private constructor(
                        private val backFileId: String?,
                        private val expirationDate: LocalDate,
                        private val fileId: String,
                        private val state: String,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        @JsonProperty("back_file_id")
                        fun backFileId(): Optional<String> = Optional.ofNullable(backFileId)

                        /** The driver's license's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(): LocalDate = expirationDate

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        @JsonProperty("file_id") fun fileId(): String = fileId

                        /** The state that issued the provided driver's license. */
                        @JsonProperty("state") fun state(): String = state

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
                                backFileId = driversLicense.backFileId
                                expirationDate = driversLicense.expirationDate
                                fileId = driversLicense.fileId
                                state = driversLicense.state
                                additionalProperties =
                                    driversLicense.additionalProperties.toMutableMap()
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

                            return /* spotless:off */ other is DriversLicense && backFileId == other.backFileId && expirationDate == other.expirationDate && fileId == other.fileId && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(backFileId, expirationDate, fileId, state, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

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
                        private val country: String,
                        private val description: String,
                        private val expirationDate: LocalDate?,
                        private val fileId: String,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        @JsonProperty("back_file_id")
                        fun backFileId(): Optional<String> = Optional.ofNullable(backFileId)

                        /**
                         * The two-character ISO 3166-1 code representing the country that issued
                         * the document.
                         */
                        @JsonProperty("country") fun country(): String = country

                        /** A description of the document submitted. */
                        @JsonProperty("description") fun description(): String = description

                        /** The document's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        fun expirationDate(): Optional<LocalDate> =
                            Optional.ofNullable(expirationDate)

                        /** The identifier of the File containing the front of the document. */
                        @JsonProperty("file_id") fun fileId(): String = fileId

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
                                backFileId = other.backFileId
                                country = other.country
                                description = other.description
                                expirationDate = other.expirationDate
                                fileId = other.fileId
                                additionalProperties = other.additionalProperties.toMutableMap()
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

                            return /* spotless:off */ other is Other && backFileId == other.backFileId && country == other.country && description == other.description && expirationDate == other.expirationDate && fileId == other.fileId && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(backFileId, country, description, expirationDate, fileId, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

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
                        private val country: String,
                        private val expirationDate: LocalDate,
                        private val fileId: String,
                        private val additionalProperties: Map<String, JsonValue>,
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

                        return /* spotless:off */ other is Identification && driversLicense == other.driversLicense && method == other.method && number == other.number && this.other == other.other && passport == other.passport && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(driversLicense, method, number, other, passport, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Identification{driversLicense=$driversLicense, method=$method, number=$number, other=$other, passport=$passport, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Individual && address == other.address && confirmedNoUsTaxId == other.confirmedNoUsTaxId && dateOfBirth == other.dateOfBirth && identification == other.identification && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(address, confirmedNoUsTaxId, dateOfBirth, identification, name, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{address=$address, confirmedNoUsTaxId=$confirmedNoUsTaxId, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, additionalProperties=$additionalProperties}"
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

        /** The grantor of the trust. Required if `category` is equal to `revocable`. */
        @JsonDeserialize(builder = Grantor.Builder::class)
        @NoAutoDetect
        class Grantor
        private constructor(
            private val address: Address,
            private val confirmedNoUsTaxId: Boolean?,
            private val dateOfBirth: LocalDate,
            private val identification: Identification,
            private val name: String,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and PMB's
             * are disallowed.
             */
            @JsonProperty("address") fun address(): Address = address

            /**
             * The identification method for an individual can only be a passport, driver's license,
             * or other document if you've confirmed the individual does not have a US tax id
             * (either a Social Security Number or Individual Taxpayer Identification Number).
             */
            @JsonProperty("confirmed_no_us_tax_id")
            fun confirmedNoUsTaxId(): Optional<Boolean> = Optional.ofNullable(confirmedNoUsTaxId)

            /** The person's date of birth in YYYY-MM-DD format. */
            @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate = dateOfBirth

            /** A means of verifying the person's identity. */
            @JsonProperty("identification") fun identification(): Identification = identification

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

                private var address: Address? = null
                private var confirmedNoUsTaxId: Boolean? = null
                private var dateOfBirth: LocalDate? = null
                private var identification: Identification? = null
                private var name: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(grantor: Grantor) = apply {
                    address = grantor.address
                    confirmedNoUsTaxId = grantor.confirmedNoUsTaxId
                    dateOfBirth = grantor.dateOfBirth
                    identification = grantor.identification
                    name = grantor.name
                    additionalProperties = grantor.additionalProperties.toMutableMap()
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
                private val city: String,
                private val line1: String,
                private val line2: String?,
                private val state: String,
                private val zip: String,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** The city of the address. */
                @JsonProperty("city") fun city(): String = city

                /** The first line of the address. This is usually the street number and street. */
                @JsonProperty("line1") fun line1(): String = line1

                /** The second line of the address. This might be the floor or room number. */
                @JsonProperty("line2") fun line2(): Optional<String> = Optional.ofNullable(line2)

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                @JsonProperty("state") fun state(): String = state

                /** The ZIP code of the address. */
                @JsonProperty("zip") fun zip(): String = zip

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
                        city = address.city
                        line1 = address.line1
                        line2 = address.line2
                        state = address.state
                        zip = address.zip
                        additionalProperties = address.additionalProperties.toMutableMap()
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
                private val driversLicense: DriversLicense?,
                private val method: Method,
                private val number: String,
                private val other: Other?,
                private val passport: Passport?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                @JsonProperty("drivers_license")
                fun driversLicense(): Optional<DriversLicense> = Optional.ofNullable(driversLicense)

                /** A method that can be used to verify the individual's identity. */
                @JsonProperty("method") fun method(): Method = method

                /**
                 * An identification number that can be used to verify the individual's identity,
                 * such as a social security number.
                 */
                @JsonProperty("number") fun number(): String = number

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

                    private var driversLicense: DriversLicense? = null
                    private var method: Method? = null
                    private var number: String? = null
                    private var other: Other? = null
                    private var passport: Passport? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(identification: Identification) = apply {
                        driversLicense = identification.driversLicense
                        method = identification.method
                        number = identification.number
                        other = identification.other
                        passport = identification.passport
                        additionalProperties = identification.additionalProperties.toMutableMap()
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
                @JsonDeserialize(builder = DriversLicense.Builder::class)
                @NoAutoDetect
                class DriversLicense
                private constructor(
                    private val backFileId: String?,
                    private val expirationDate: LocalDate,
                    private val fileId: String,
                    private val state: String,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /** The identifier of the File containing the back of the driver's license. */
                    @JsonProperty("back_file_id")
                    fun backFileId(): Optional<String> = Optional.ofNullable(backFileId)

                    /** The driver's license's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(): LocalDate = expirationDate

                    /** The identifier of the File containing the front of the driver's license. */
                    @JsonProperty("file_id") fun fileId(): String = fileId

                    /** The state that issued the provided driver's license. */
                    @JsonProperty("state") fun state(): String = state

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
                            backFileId = driversLicense.backFileId
                            expirationDate = driversLicense.expirationDate
                            fileId = driversLicense.fileId
                            state = driversLicense.state
                            additionalProperties =
                                driversLicense.additionalProperties.toMutableMap()
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

                        return /* spotless:off */ other is DriversLicense && backFileId == other.backFileId && expirationDate == other.expirationDate && fileId == other.fileId && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(backFileId, expirationDate, fileId, state, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

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
                    private val country: String,
                    private val description: String,
                    private val expirationDate: LocalDate?,
                    private val fileId: String,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /**
                     * The identifier of the File containing the back of the document. Not every
                     * document has a reverse side.
                     */
                    @JsonProperty("back_file_id")
                    fun backFileId(): Optional<String> = Optional.ofNullable(backFileId)

                    /**
                     * The two-character ISO 3166-1 code representing the country that issued the
                     * document.
                     */
                    @JsonProperty("country") fun country(): String = country

                    /** A description of the document submitted. */
                    @JsonProperty("description") fun description(): String = description

                    /** The document's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    fun expirationDate(): Optional<LocalDate> = Optional.ofNullable(expirationDate)

                    /** The identifier of the File containing the front of the document. */
                    @JsonProperty("file_id") fun fileId(): String = fileId

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
                            backFileId = other.backFileId
                            country = other.country
                            description = other.description
                            expirationDate = other.expirationDate
                            fileId = other.fileId
                            additionalProperties = other.additionalProperties.toMutableMap()
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

                        return /* spotless:off */ other is Other && backFileId == other.backFileId && country == other.country && description == other.description && expirationDate == other.expirationDate && fileId == other.fileId && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(backFileId, country, description, expirationDate, fileId, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

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
                    private val country: String,
                    private val expirationDate: LocalDate,
                    private val fileId: String,
                    private val additionalProperties: Map<String, JsonValue>,
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

                    return /* spotless:off */ other is Identification && driversLicense == other.driversLicense && method == other.method && number == other.number && this.other == other.other && passport == other.passport && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(driversLicense, method, number, other, passport, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Identification{driversLicense=$driversLicense, method=$method, number=$number, other=$other, passport=$passport, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Grantor && address == other.address && confirmedNoUsTaxId == other.confirmedNoUsTaxId && dateOfBirth == other.dateOfBirth && identification == other.identification && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(address, confirmedNoUsTaxId, dateOfBirth, identification, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Grantor{address=$address, confirmedNoUsTaxId=$confirmedNoUsTaxId, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, additionalProperties=$additionalProperties}"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EntityCreateParams && structure == other.structure && corporation == other.corporation && description == other.description && governmentAuthority == other.governmentAuthority && joint == other.joint && naturalPerson == other.naturalPerson && supplementalDocuments == other.supplementalDocuments && thirdPartyVerification == other.thirdPartyVerification && trust == other.trust && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(structure, corporation, description, governmentAuthority, joint, naturalPerson, supplementalDocuments, thirdPartyVerification, trust, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "EntityCreateParams{structure=$structure, corporation=$corporation, description=$description, governmentAuthority=$governmentAuthority, joint=$joint, naturalPerson=$naturalPerson, supplementalDocuments=$supplementalDocuments, thirdPartyVerification=$thirdPartyVerification, trust=$trust, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
