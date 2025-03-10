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
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Params
import com.increase.api.core.checkKnown
import com.increase.api.core.checkRequired
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
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

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

    /** The type of Entity to create. */
    fun _structure(): JsonField<Structure> = body._structure()

    /**
     * Details of the corporation entity to create. Required if `structure` is equal to
     * `corporation`.
     */
    fun _corporation(): JsonField<Corporation> = body._corporation()

    /** The description you choose to give the entity. */
    fun _description(): JsonField<String> = body._description()

    /**
     * Details of the Government Authority entity to create. Required if `structure` is equal to
     * `Government Authority`.
     */
    fun _governmentAuthority(): JsonField<GovernmentAuthority> = body._governmentAuthority()

    /** Details of the joint entity to create. Required if `structure` is equal to `joint`. */
    fun _joint(): JsonField<Joint> = body._joint()

    /**
     * Details of the natural person entity to create. Required if `structure` is equal to
     * `natural_person`. Natural people entities should be submitted with `social_security_number`
     * or `individual_taxpayer_identification_number` identification methods.
     */
    fun _naturalPerson(): JsonField<NaturalPerson> = body._naturalPerson()

    /** Additional documentation associated with the entity. */
    fun _supplementalDocuments(): JsonField<List<SupplementalDocument>> =
        body._supplementalDocuments()

    /**
     * A reference to data stored in a third-party verification service. Your integration may or may
     * not use this field.
     */
    fun _thirdPartyVerification(): JsonField<ThirdPartyVerification> =
        body._thirdPartyVerification()

    /** Details of the trust entity to create. Required if `structure` is equal to `trust`. */
    fun _trust(): JsonField<Trust> = body._trust()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("structure")
        @ExcludeMissing
        private val structure: JsonField<Structure> = JsonMissing.of(),
        @JsonProperty("corporation")
        @ExcludeMissing
        private val corporation: JsonField<Corporation> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("government_authority")
        @ExcludeMissing
        private val governmentAuthority: JsonField<GovernmentAuthority> = JsonMissing.of(),
        @JsonProperty("joint")
        @ExcludeMissing
        private val joint: JsonField<Joint> = JsonMissing.of(),
        @JsonProperty("natural_person")
        @ExcludeMissing
        private val naturalPerson: JsonField<NaturalPerson> = JsonMissing.of(),
        @JsonProperty("supplemental_documents")
        @ExcludeMissing
        private val supplementalDocuments: JsonField<List<SupplementalDocument>> = JsonMissing.of(),
        @JsonProperty("third_party_verification")
        @ExcludeMissing
        private val thirdPartyVerification: JsonField<ThirdPartyVerification> = JsonMissing.of(),
        @JsonProperty("trust")
        @ExcludeMissing
        private val trust: JsonField<Trust> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The type of Entity to create. */
        fun structure(): Structure = structure.getRequired("structure")

        /**
         * Details of the corporation entity to create. Required if `structure` is equal to
         * `corporation`.
         */
        fun corporation(): Optional<Corporation> =
            Optional.ofNullable(corporation.getNullable("corporation"))

        /** The description you choose to give the entity. */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * Details of the Government Authority entity to create. Required if `structure` is equal to
         * `Government Authority`.
         */
        fun governmentAuthority(): Optional<GovernmentAuthority> =
            Optional.ofNullable(governmentAuthority.getNullable("government_authority"))

        /** Details of the joint entity to create. Required if `structure` is equal to `joint`. */
        fun joint(): Optional<Joint> = Optional.ofNullable(joint.getNullable("joint"))

        /**
         * Details of the natural person entity to create. Required if `structure` is equal to
         * `natural_person`. Natural people entities should be submitted with
         * `social_security_number` or `individual_taxpayer_identification_number` identification
         * methods.
         */
        fun naturalPerson(): Optional<NaturalPerson> =
            Optional.ofNullable(naturalPerson.getNullable("natural_person"))

        /** Additional documentation associated with the entity. */
        fun supplementalDocuments(): Optional<List<SupplementalDocument>> =
            Optional.ofNullable(supplementalDocuments.getNullable("supplemental_documents"))

        /**
         * A reference to data stored in a third-party verification service. Your integration may or
         * may not use this field.
         */
        fun thirdPartyVerification(): Optional<ThirdPartyVerification> =
            Optional.ofNullable(thirdPartyVerification.getNullable("third_party_verification"))

        /** Details of the trust entity to create. Required if `structure` is equal to `trust`. */
        fun trust(): Optional<Trust> = Optional.ofNullable(trust.getNullable("trust"))

        /** The type of Entity to create. */
        @JsonProperty("structure")
        @ExcludeMissing
        fun _structure(): JsonField<Structure> = structure

        /**
         * Details of the corporation entity to create. Required if `structure` is equal to
         * `corporation`.
         */
        @JsonProperty("corporation")
        @ExcludeMissing
        fun _corporation(): JsonField<Corporation> = corporation

        /** The description you choose to give the entity. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Details of the Government Authority entity to create. Required if `structure` is equal to
         * `Government Authority`.
         */
        @JsonProperty("government_authority")
        @ExcludeMissing
        fun _governmentAuthority(): JsonField<GovernmentAuthority> = governmentAuthority

        /** Details of the joint entity to create. Required if `structure` is equal to `joint`. */
        @JsonProperty("joint") @ExcludeMissing fun _joint(): JsonField<Joint> = joint

        /**
         * Details of the natural person entity to create. Required if `structure` is equal to
         * `natural_person`. Natural people entities should be submitted with
         * `social_security_number` or `individual_taxpayer_identification_number` identification
         * methods.
         */
        @JsonProperty("natural_person")
        @ExcludeMissing
        fun _naturalPerson(): JsonField<NaturalPerson> = naturalPerson

        /** Additional documentation associated with the entity. */
        @JsonProperty("supplemental_documents")
        @ExcludeMissing
        fun _supplementalDocuments(): JsonField<List<SupplementalDocument>> = supplementalDocuments

        /**
         * A reference to data stored in a third-party verification service. Your integration may or
         * may not use this field.
         */
        @JsonProperty("third_party_verification")
        @ExcludeMissing
        fun _thirdPartyVerification(): JsonField<ThirdPartyVerification> = thirdPartyVerification

        /** Details of the trust entity to create. Required if `structure` is equal to `trust`. */
        @JsonProperty("trust") @ExcludeMissing fun _trust(): JsonField<Trust> = trust

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            structure()
            corporation().ifPresent { it.validate() }
            description()
            governmentAuthority().ifPresent { it.validate() }
            joint().ifPresent { it.validate() }
            naturalPerson().ifPresent { it.validate() }
            supplementalDocuments().ifPresent { it.forEach { it.validate() } }
            thirdPartyVerification().ifPresent { it.validate() }
            trust().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .structure()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var structure: JsonField<Structure>? = null
            private var corporation: JsonField<Corporation> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var governmentAuthority: JsonField<GovernmentAuthority> = JsonMissing.of()
            private var joint: JsonField<Joint> = JsonMissing.of()
            private var naturalPerson: JsonField<NaturalPerson> = JsonMissing.of()
            private var supplementalDocuments: JsonField<MutableList<SupplementalDocument>>? = null
            private var thirdPartyVerification: JsonField<ThirdPartyVerification> = JsonMissing.of()
            private var trust: JsonField<Trust> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                structure = body.structure
                corporation = body.corporation
                description = body.description
                governmentAuthority = body.governmentAuthority
                joint = body.joint
                naturalPerson = body.naturalPerson
                supplementalDocuments = body.supplementalDocuments.map { it.toMutableList() }
                thirdPartyVerification = body.thirdPartyVerification
                trust = body.trust
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The type of Entity to create. */
            fun structure(structure: Structure) = structure(JsonField.of(structure))

            /** The type of Entity to create. */
            fun structure(structure: JsonField<Structure>) = apply { this.structure = structure }

            /**
             * Details of the corporation entity to create. Required if `structure` is equal to
             * `corporation`.
             */
            fun corporation(corporation: Corporation) = corporation(JsonField.of(corporation))

            /**
             * Details of the corporation entity to create. Required if `structure` is equal to
             * `corporation`.
             */
            fun corporation(corporation: JsonField<Corporation>) = apply {
                this.corporation = corporation
            }

            /** The description you choose to give the entity. */
            fun description(description: String) = description(JsonField.of(description))

            /** The description you choose to give the entity. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Details of the Government Authority entity to create. Required if `structure` is
             * equal to `Government Authority`.
             */
            fun governmentAuthority(governmentAuthority: GovernmentAuthority) =
                governmentAuthority(JsonField.of(governmentAuthority))

            /**
             * Details of the Government Authority entity to create. Required if `structure` is
             * equal to `Government Authority`.
             */
            fun governmentAuthority(governmentAuthority: JsonField<GovernmentAuthority>) = apply {
                this.governmentAuthority = governmentAuthority
            }

            /**
             * Details of the joint entity to create. Required if `structure` is equal to `joint`.
             */
            fun joint(joint: Joint) = joint(JsonField.of(joint))

            /**
             * Details of the joint entity to create. Required if `structure` is equal to `joint`.
             */
            fun joint(joint: JsonField<Joint>) = apply { this.joint = joint }

            /**
             * Details of the natural person entity to create. Required if `structure` is equal to
             * `natural_person`. Natural people entities should be submitted with
             * `social_security_number` or `individual_taxpayer_identification_number`
             * identification methods.
             */
            fun naturalPerson(naturalPerson: NaturalPerson) =
                naturalPerson(JsonField.of(naturalPerson))

            /**
             * Details of the natural person entity to create. Required if `structure` is equal to
             * `natural_person`. Natural people entities should be submitted with
             * `social_security_number` or `individual_taxpayer_identification_number`
             * identification methods.
             */
            fun naturalPerson(naturalPerson: JsonField<NaturalPerson>) = apply {
                this.naturalPerson = naturalPerson
            }

            /** Additional documentation associated with the entity. */
            fun supplementalDocuments(supplementalDocuments: List<SupplementalDocument>) =
                supplementalDocuments(JsonField.of(supplementalDocuments))

            /** Additional documentation associated with the entity. */
            fun supplementalDocuments(
                supplementalDocuments: JsonField<List<SupplementalDocument>>
            ) = apply {
                this.supplementalDocuments = supplementalDocuments.map { it.toMutableList() }
            }

            /** Additional documentation associated with the entity. */
            fun addSupplementalDocument(supplementalDocument: SupplementalDocument) = apply {
                supplementalDocuments =
                    (supplementalDocuments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("supplementalDocuments", it).add(supplementalDocument)
                    }
            }

            /**
             * A reference to data stored in a third-party verification service. Your integration
             * may or may not use this field.
             */
            fun thirdPartyVerification(thirdPartyVerification: ThirdPartyVerification) =
                thirdPartyVerification(JsonField.of(thirdPartyVerification))

            /**
             * A reference to data stored in a third-party verification service. Your integration
             * may or may not use this field.
             */
            fun thirdPartyVerification(thirdPartyVerification: JsonField<ThirdPartyVerification>) =
                apply {
                    this.thirdPartyVerification = thirdPartyVerification
                }

            /**
             * Details of the trust entity to create. Required if `structure` is equal to `trust`.
             */
            fun trust(trust: Trust) = trust(JsonField.of(trust))

            /**
             * Details of the trust entity to create. Required if `structure` is equal to `trust`.
             */
            fun trust(trust: JsonField<Trust>) = apply { this.trust = trust }

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

            fun build(): Body =
                Body(
                    checkRequired("structure", structure),
                    corporation,
                    description,
                    governmentAuthority,
                    joint,
                    naturalPerson,
                    (supplementalDocuments ?: JsonMissing.of()).map { it.toImmutable() },
                    thirdPartyVerification,
                    trust,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && structure == other.structure && corporation == other.corporation && description == other.description && governmentAuthority == other.governmentAuthority && joint == other.joint && naturalPerson == other.naturalPerson && supplementalDocuments == other.supplementalDocuments && thirdPartyVerification == other.thirdPartyVerification && trust == other.trust && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(structure, corporation, description, governmentAuthority, joint, naturalPerson, supplementalDocuments, thirdPartyVerification, trust, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{structure=$structure, corporation=$corporation, description=$description, governmentAuthority=$governmentAuthority, joint=$joint, naturalPerson=$naturalPerson, supplementalDocuments=$supplementalDocuments, thirdPartyVerification=$thirdPartyVerification, trust=$trust, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EntityCreateParams].
         *
         * The following fields are required:
         * ```java
         * .structure()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EntityCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
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

        /** The type of Entity to create. */
        fun structure(structure: JsonField<Structure>) = apply { body.structure(structure) }

        /**
         * Details of the corporation entity to create. Required if `structure` is equal to
         * `corporation`.
         */
        fun corporation(corporation: Corporation) = apply { body.corporation(corporation) }

        /**
         * Details of the corporation entity to create. Required if `structure` is equal to
         * `corporation`.
         */
        fun corporation(corporation: JsonField<Corporation>) = apply {
            body.corporation(corporation)
        }

        /** The description you choose to give the entity. */
        fun description(description: String) = apply { body.description(description) }

        /** The description you choose to give the entity. */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * Details of the Government Authority entity to create. Required if `structure` is equal to
         * `Government Authority`.
         */
        fun governmentAuthority(governmentAuthority: GovernmentAuthority) = apply {
            body.governmentAuthority(governmentAuthority)
        }

        /**
         * Details of the Government Authority entity to create. Required if `structure` is equal to
         * `Government Authority`.
         */
        fun governmentAuthority(governmentAuthority: JsonField<GovernmentAuthority>) = apply {
            body.governmentAuthority(governmentAuthority)
        }

        /** Details of the joint entity to create. Required if `structure` is equal to `joint`. */
        fun joint(joint: Joint) = apply { body.joint(joint) }

        /** Details of the joint entity to create. Required if `structure` is equal to `joint`. */
        fun joint(joint: JsonField<Joint>) = apply { body.joint(joint) }

        /**
         * Details of the natural person entity to create. Required if `structure` is equal to
         * `natural_person`. Natural people entities should be submitted with
         * `social_security_number` or `individual_taxpayer_identification_number` identification
         * methods.
         */
        fun naturalPerson(naturalPerson: NaturalPerson) = apply {
            body.naturalPerson(naturalPerson)
        }

        /**
         * Details of the natural person entity to create. Required if `structure` is equal to
         * `natural_person`. Natural people entities should be submitted with
         * `social_security_number` or `individual_taxpayer_identification_number` identification
         * methods.
         */
        fun naturalPerson(naturalPerson: JsonField<NaturalPerson>) = apply {
            body.naturalPerson(naturalPerson)
        }

        /** Additional documentation associated with the entity. */
        fun supplementalDocuments(supplementalDocuments: List<SupplementalDocument>) = apply {
            body.supplementalDocuments(supplementalDocuments)
        }

        /** Additional documentation associated with the entity. */
        fun supplementalDocuments(supplementalDocuments: JsonField<List<SupplementalDocument>>) =
            apply {
                body.supplementalDocuments(supplementalDocuments)
            }

        /** Additional documentation associated with the entity. */
        fun addSupplementalDocument(supplementalDocument: SupplementalDocument) = apply {
            body.addSupplementalDocument(supplementalDocument)
        }

        /**
         * A reference to data stored in a third-party verification service. Your integration may or
         * may not use this field.
         */
        fun thirdPartyVerification(thirdPartyVerification: ThirdPartyVerification) = apply {
            body.thirdPartyVerification(thirdPartyVerification)
        }

        /**
         * A reference to data stored in a third-party verification service. Your integration may or
         * may not use this field.
         */
        fun thirdPartyVerification(thirdPartyVerification: JsonField<ThirdPartyVerification>) =
            apply {
                body.thirdPartyVerification(thirdPartyVerification)
            }

        /** Details of the trust entity to create. Required if `structure` is equal to `trust`. */
        fun trust(trust: Trust) = apply { body.trust(trust) }

        /** Details of the trust entity to create. Required if `structure` is equal to `trust`. */
        fun trust(trust: JsonField<Trust>) = apply { body.trust(trust) }

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

        fun build(): EntityCreateParams =
            EntityCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** The type of Entity to create. */
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
        @JsonProperty("address")
        @ExcludeMissing
        private val address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("beneficial_owners")
        @ExcludeMissing
        private val beneficialOwners: JsonField<List<BeneficialOwner>> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_identifier")
        @ExcludeMissing
        private val taxIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("incorporation_state")
        @ExcludeMissing
        private val incorporationState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("industry_code")
        @ExcludeMissing
        private val industryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("website")
        @ExcludeMissing
        private val website: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        fun address(): Address = address.getRequired("address")

        /**
         * The identifying details of anyone controlling or owning 25% or more of the corporation.
         */
        fun beneficialOwners(): List<BeneficialOwner> =
            beneficialOwners.getRequired("beneficial_owners")

        /** The legal name of the corporation. */
        fun name(): String = name.getRequired("name")

        /** The Employer Identification Number (EIN) for the corporation. */
        fun taxIdentifier(): String = taxIdentifier.getRequired("tax_identifier")

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the corporation's
         * state of incorporation.
         */
        fun incorporationState(): Optional<String> =
            Optional.ofNullable(incorporationState.getNullable("incorporation_state"))

        /**
         * The North American Industry Classification System (NAICS) code for the corporation's
         * primary line of business. This is a number, like `5132` for `Software Publishers`. A full
         * list of classification codes is available
         * [here](https://increase.com/documentation/data-dictionary#north-american-industry-classification-system-codes).
         */
        fun industryCode(): Optional<String> =
            Optional.ofNullable(industryCode.getNullable("industry_code"))

        /** The website of the corporation. */
        fun website(): Optional<String> = Optional.ofNullable(website.getNullable("website"))

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /**
         * The identifying details of anyone controlling or owning 25% or more of the corporation.
         */
        @JsonProperty("beneficial_owners")
        @ExcludeMissing
        fun _beneficialOwners(): JsonField<List<BeneficialOwner>> = beneficialOwners

        /** The legal name of the corporation. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** The Employer Identification Number (EIN) for the corporation. */
        @JsonProperty("tax_identifier")
        @ExcludeMissing
        fun _taxIdentifier(): JsonField<String> = taxIdentifier

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the corporation's
         * state of incorporation.
         */
        @JsonProperty("incorporation_state")
        @ExcludeMissing
        fun _incorporationState(): JsonField<String> = incorporationState

        /**
         * The North American Industry Classification System (NAICS) code for the corporation's
         * primary line of business. This is a number, like `5132` for `Software Publishers`. A full
         * list of classification codes is available
         * [here](https://increase.com/documentation/data-dictionary#north-american-industry-classification-system-codes).
         */
        @JsonProperty("industry_code")
        @ExcludeMissing
        fun _industryCode(): JsonField<String> = industryCode

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
            name()
            taxIdentifier()
            incorporationState()
            industryCode()
            website()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Corporation].
             *
             * The following fields are required:
             * ```java
             * .address()
             * .beneficialOwners()
             * .name()
             * .taxIdentifier()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Corporation]. */
        class Builder internal constructor() {

            private var address: JsonField<Address>? = null
            private var beneficialOwners: JsonField<MutableList<BeneficialOwner>>? = null
            private var name: JsonField<String>? = null
            private var taxIdentifier: JsonField<String>? = null
            private var incorporationState: JsonField<String> = JsonMissing.of()
            private var industryCode: JsonField<String> = JsonMissing.of()
            private var website: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(corporation: Corporation) = apply {
                address = corporation.address
                beneficialOwners = corporation.beneficialOwners.map { it.toMutableList() }
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
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
             * disallowed.
             */
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
                    (beneficialOwners ?: JsonField.of(mutableListOf())).also {
                        checkKnown("beneficialOwners", it).add(beneficialOwner)
                    }
            }

            /** The legal name of the corporation. */
            fun name(name: String) = name(JsonField.of(name))

            /** The legal name of the corporation. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The Employer Identification Number (EIN) for the corporation. */
            fun taxIdentifier(taxIdentifier: String) = taxIdentifier(JsonField.of(taxIdentifier))

            /** The Employer Identification Number (EIN) for the corporation. */
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
            fun incorporationState(incorporationState: JsonField<String>) = apply {
                this.incorporationState = incorporationState
            }

            /**
             * The North American Industry Classification System (NAICS) code for the corporation's
             * primary line of business. This is a number, like `5132` for `Software Publishers`. A
             * full list of classification codes is available
             * [here](https://increase.com/documentation/data-dictionary#north-american-industry-classification-system-codes).
             */
            fun industryCode(industryCode: String) = industryCode(JsonField.of(industryCode))

            /**
             * The North American Industry Classification System (NAICS) code for the corporation's
             * primary line of business. This is a number, like `5132` for `Software Publishers`. A
             * full list of classification codes is available
             * [here](https://increase.com/documentation/data-dictionary#north-american-industry-classification-system-codes).
             */
            fun industryCode(industryCode: JsonField<String>) = apply {
                this.industryCode = industryCode
            }

            /** The website of the corporation. */
            fun website(website: String) = website(JsonField.of(website))

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
                    checkRequired("name", name),
                    checkRequired("taxIdentifier", taxIdentifier),
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
            @JsonProperty("city")
            @ExcludeMissing
            private val city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1")
            @ExcludeMissing
            private val line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state")
            @ExcludeMissing
            private val state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("zip")
            @ExcludeMissing
            private val zip: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2")
            @ExcludeMissing
            private val line2: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The city of the address. */
            fun city(): String = city.getRequired("city")

            /** The first line of the address. This is usually the street number and street. */
            fun line1(): String = line1.getRequired("line1")

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            fun state(): String = state.getRequired("state")

            /** The ZIP code of the address. */
            fun zip(): String = zip.getRequired("zip")

            /** The second line of the address. This might be the floor or room number. */
            fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

            /** The city of the address. */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /** The first line of the address. This is usually the street number and street. */
            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

            /** The second line of the address. This might be the floor or room number. */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
                state()
                zip()
                line2()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Address].
                 *
                 * The following fields are required:
                 * ```java
                 * .city()
                 * .line1()
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
                private var state: JsonField<String>? = null
                private var zip: JsonField<String>? = null
                private var line2: JsonField<String> = JsonMissing.of()
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
                fun city(city: String) = city(JsonField.of(city))

                /** The city of the address. */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The first line of the address. This is usually the street number and street. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /** The first line of the address. This is usually the street number and street. */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

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

                /** The second line of the address. This might be the floor or room number. */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /** The second line of the address. This might be the floor or room number. */
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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
                        checkRequired("state", state),
                        checkRequired("zip", zip),
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
            @JsonProperty("individual")
            @ExcludeMissing
            private val individual: JsonField<Individual> = JsonMissing.of(),
            @JsonProperty("prongs")
            @ExcludeMissing
            private val prongs: JsonField<List<Prong>> = JsonMissing.of(),
            @JsonProperty("company_title")
            @ExcludeMissing
            private val companyTitle: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Personal details for the beneficial owner. */
            fun individual(): Individual = individual.getRequired("individual")

            /**
             * Why this person is considered a beneficial owner of the entity. At least one option
             * is required, if a person is both a control person and owner, submit an array
             * containing both.
             */
            fun prongs(): List<Prong> = prongs.getRequired("prongs")

            /** This person's role or title within the entity. */
            fun companyTitle(): Optional<String> =
                Optional.ofNullable(companyTitle.getNullable("company_title"))

            /** Personal details for the beneficial owner. */
            @JsonProperty("individual")
            @ExcludeMissing
            fun _individual(): JsonField<Individual> = individual

            /**
             * Why this person is considered a beneficial owner of the entity. At least one option
             * is required, if a person is both a control person and owner, submit an array
             * containing both.
             */
            @JsonProperty("prongs") @ExcludeMissing fun _prongs(): JsonField<List<Prong>> = prongs

            /** This person's role or title within the entity. */
            @JsonProperty("company_title")
            @ExcludeMissing
            fun _companyTitle(): JsonField<String> = companyTitle

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): BeneficialOwner = apply {
                if (validated) {
                    return@apply
                }

                individual().validate()
                prongs()
                companyTitle()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [BeneficialOwner].
                 *
                 * The following fields are required:
                 * ```java
                 * .individual()
                 * .prongs()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [BeneficialOwner]. */
            class Builder internal constructor() {

                private var individual: JsonField<Individual>? = null
                private var prongs: JsonField<MutableList<Prong>>? = null
                private var companyTitle: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(beneficialOwner: BeneficialOwner) = apply {
                    individual = beneficialOwner.individual
                    prongs = beneficialOwner.prongs.map { it.toMutableList() }
                    companyTitle = beneficialOwner.companyTitle
                    additionalProperties = beneficialOwner.additionalProperties.toMutableMap()
                }

                /** Personal details for the beneficial owner. */
                fun individual(individual: Individual) = individual(JsonField.of(individual))

                /** Personal details for the beneficial owner. */
                fun individual(individual: JsonField<Individual>) = apply {
                    this.individual = individual
                }

                /**
                 * Why this person is considered a beneficial owner of the entity. At least one
                 * option is required, if a person is both a control person and owner, submit an
                 * array containing both.
                 */
                fun prongs(prongs: List<Prong>) = prongs(JsonField.of(prongs))

                /**
                 * Why this person is considered a beneficial owner of the entity. At least one
                 * option is required, if a person is both a control person and owner, submit an
                 * array containing both.
                 */
                fun prongs(prongs: JsonField<List<Prong>>) = apply {
                    this.prongs = prongs.map { it.toMutableList() }
                }

                /**
                 * Why this person is considered a beneficial owner of the entity. At least one
                 * option is required, if a person is both a control person and owner, submit an
                 * array containing both.
                 */
                fun addProng(prong: Prong) = apply {
                    prongs =
                        (prongs ?: JsonField.of(mutableListOf())).also {
                            checkKnown("prongs", it).add(prong)
                        }
                }

                /** This person's role or title within the entity. */
                fun companyTitle(companyTitle: String) = companyTitle(JsonField.of(companyTitle))

                /** This person's role or title within the entity. */
                fun companyTitle(companyTitle: JsonField<String>) = apply {
                    this.companyTitle = companyTitle
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

                fun build(): BeneficialOwner =
                    BeneficialOwner(
                        checkRequired("individual", individual),
                        checkRequired("prongs", prongs).map { it.toImmutable() },
                        companyTitle,
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
                @JsonProperty("confirmed_no_us_tax_id")
                @ExcludeMissing
                private val confirmedNoUsTaxId: JsonField<Boolean> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
                 */
                fun address(): Address = address.getRequired("address")

                /** The person's date of birth in YYYY-MM-DD format. */
                fun dateOfBirth(): LocalDate = dateOfBirth.getRequired("date_of_birth")

                /** A means of verifying the person's identity. */
                fun identification(): Identification = identification.getRequired("identification")

                /** The person's legal name. */
                fun name(): String = name.getRequired("name")

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                fun confirmedNoUsTaxId(): Optional<Boolean> =
                    Optional.ofNullable(confirmedNoUsTaxId.getNullable("confirmed_no_us_tax_id"))

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
                 */
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

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                @JsonProperty("confirmed_no_us_tax_id")
                @ExcludeMissing
                fun _confirmedNoUsTaxId(): JsonField<Boolean> = confirmedNoUsTaxId

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
                    confirmedNoUsTaxId()
                    validated = true
                }

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
                    private var confirmedNoUsTaxId: JsonField<Boolean> = JsonMissing.of()
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
                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * The individual's physical address. Mail receiving locations like PO Boxes and
                     * PMB's are disallowed.
                     */
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

                    /**
                     * The identification method for an individual can only be a passport, driver's
                     * license, or other document if you've confirmed the individual does not have a
                     * US tax id (either a Social Security Number or Individual Taxpayer
                     * Identification Number).
                     */
                    fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean) =
                        confirmedNoUsTaxId(JsonField.of(confirmedNoUsTaxId))

                    /**
                     * The identification method for an individual can only be a passport, driver's
                     * license, or other document if you've confirmed the individual does not have a
                     * US tax id (either a Social Security Number or Individual Taxpayer
                     * Identification Number).
                     */
                    fun confirmedNoUsTaxId(confirmedNoUsTaxId: JsonField<Boolean>) = apply {
                        this.confirmedNoUsTaxId = confirmedNoUsTaxId
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

                    fun build(): Individual =
                        Individual(
                            checkRequired("address", address),
                            checkRequired("dateOfBirth", dateOfBirth),
                            checkRequired("identification", identification),
                            checkRequired("name", name),
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
                    @JsonProperty("city")
                    @ExcludeMissing
                    private val city: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line1")
                    @ExcludeMissing
                    private val line1: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("state")
                    @ExcludeMissing
                    private val state: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("zip")
                    @ExcludeMissing
                    private val zip: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line2")
                    @ExcludeMissing
                    private val line2: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The city of the address. */
                    fun city(): String = city.getRequired("city")

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    fun line1(): String = line1.getRequired("line1")

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    fun state(): String = state.getRequired("state")

                    /** The ZIP code of the address. */
                    fun zip(): String = zip.getRequired("zip")

                    /** The second line of the address. This might be the floor or room number. */
                    fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

                    /** The city of the address. */
                    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

                    /** The ZIP code of the address. */
                    @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

                    /** The second line of the address. This might be the floor or room number. */
                    @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
                        state()
                        zip()
                        line2()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Address].
                         *
                         * The following fields are required:
                         * ```java
                         * .city()
                         * .line1()
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
                        private var state: JsonField<String>? = null
                        private var zip: JsonField<String>? = null
                        private var line2: JsonField<String> = JsonMissing.of()
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
                        fun city(city: String) = city(JsonField.of(city))

                        /** The city of the address. */
                        fun city(city: JsonField<String>) = apply { this.city = city }

                        /**
                         * The first line of the address. This is usually the street number and
                         * street.
                         */
                        fun line1(line1: String) = line1(JsonField.of(line1))

                        /**
                         * The first line of the address. This is usually the street number and
                         * street.
                         */
                        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

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

                        /**
                         * The second line of the address. This might be the floor or room number.
                         */
                        fun line2(line2: String) = line2(JsonField.of(line2))

                        /**
                         * The second line of the address. This might be the floor or room number.
                         */
                        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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
                                checkRequired("state", state),
                                checkRequired("zip", zip),
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
                    @JsonProperty("method")
                    @ExcludeMissing
                    private val method: JsonField<Method> = JsonMissing.of(),
                    @JsonProperty("number")
                    @ExcludeMissing
                    private val number: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("drivers_license")
                    @ExcludeMissing
                    private val driversLicense: JsonField<DriversLicense> = JsonMissing.of(),
                    @JsonProperty("other")
                    @ExcludeMissing
                    private val other: JsonField<Other> = JsonMissing.of(),
                    @JsonProperty("passport")
                    @ExcludeMissing
                    private val passport: JsonField<Passport> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** A method that can be used to verify the individual's identity. */
                    fun method(): Method = method.getRequired("method")

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     */
                    fun number(): String = number.getRequired("number")

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    fun driversLicense(): Optional<DriversLicense> =
                        Optional.ofNullable(driversLicense.getNullable("drivers_license"))

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    fun other(): Optional<Other> = Optional.ofNullable(other.getNullable("other"))

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    fun passport(): Optional<Passport> =
                        Optional.ofNullable(passport.getNullable("passport"))

                    /** A method that can be used to verify the individual's identity. */
                    @JsonProperty("method")
                    @ExcludeMissing
                    fun _method(): JsonField<Method> = method

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     */
                    @JsonProperty("number")
                    @ExcludeMissing
                    fun _number(): JsonField<String> = number

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    @JsonProperty("drivers_license")
                    @ExcludeMissing
                    fun _driversLicense(): JsonField<DriversLicense> = driversLicense

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    @JsonProperty("other") @ExcludeMissing fun _other(): JsonField<Other> = other

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    @JsonProperty("passport")
                    @ExcludeMissing
                    fun _passport(): JsonField<Passport> = passport

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Identification = apply {
                        if (validated) {
                            return@apply
                        }

                        method()
                        number()
                        driversLicense().ifPresent { it.validate() }
                        other().ifPresent { it.validate() }
                        passport().ifPresent { it.validate() }
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [Identification].
                         *
                         * The following fields are required:
                         * ```java
                         * .method()
                         * .number()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Identification]. */
                    class Builder internal constructor() {

                        private var method: JsonField<Method>? = null
                        private var number: JsonField<String>? = null
                        private var driversLicense: JsonField<DriversLicense> = JsonMissing.of()
                        private var other: JsonField<Other> = JsonMissing.of()
                        private var passport: JsonField<Passport> = JsonMissing.of()
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
                        fun method(method: Method) = method(JsonField.of(method))

                        /** A method that can be used to verify the individual's identity. */
                        fun method(method: JsonField<Method>) = apply { this.method = method }

                        /**
                         * An identification number that can be used to verify the individual's
                         * identity, such as a social security number.
                         */
                        fun number(number: String) = number(JsonField.of(number))

                        /**
                         * An identification number that can be used to verify the individual's
                         * identity, such as a social security number.
                         */
                        fun number(number: JsonField<String>) = apply { this.number = number }

                        /**
                         * Information about the United States driver's license used for
                         * identification. Required if `method` is equal to `drivers_license`.
                         */
                        fun driversLicense(driversLicense: DriversLicense) =
                            driversLicense(JsonField.of(driversLicense))

                        /**
                         * Information about the United States driver's license used for
                         * identification. Required if `method` is equal to `drivers_license`.
                         */
                        fun driversLicense(driversLicense: JsonField<DriversLicense>) = apply {
                            this.driversLicense = driversLicense
                        }

                        /**
                         * Information about the identification document provided. Required if
                         * `method` is equal to `other`.
                         */
                        fun other(other: Other) = other(JsonField.of(other))

                        /**
                         * Information about the identification document provided. Required if
                         * `method` is equal to `other`.
                         */
                        fun other(other: JsonField<Other>) = apply { this.other = other }

                        /**
                         * Information about the passport used for identification. Required if
                         * `method` is equal to `passport`.
                         */
                        fun passport(passport: Passport) = passport(JsonField.of(passport))

                        /**
                         * Information about the passport used for identification. Required if
                         * `method` is equal to `passport`.
                         */
                        fun passport(passport: JsonField<Passport>) = apply {
                            this.passport = passport
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
                                checkRequired("number", number),
                                driversLicense,
                                other,
                                passport,
                                additionalProperties.toImmutable(),
                            )
                    }

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
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        private val expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        private val fileId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("state")
                        @ExcludeMissing
                        private val state: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("back_file_id")
                        @ExcludeMissing
                        private val backFileId: JsonField<String> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        /** The driver's license's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(): LocalDate =
                            expirationDate.getRequired("expiration_date")

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        fun fileId(): String = fileId.getRequired("file_id")

                        /** The state that issued the provided driver's license. */
                        fun state(): String = state.getRequired("state")

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        fun backFileId(): Optional<String> =
                            Optional.ofNullable(backFileId.getNullable("back_file_id"))

                        /** The driver's license's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        fun _expirationDate(): JsonField<LocalDate> = expirationDate

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        fun _fileId(): JsonField<String> = fileId

                        /** The state that issued the provided driver's license. */
                        @JsonProperty("state")
                        @ExcludeMissing
                        fun _state(): JsonField<String> = state

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        @JsonProperty("back_file_id")
                        @ExcludeMissing
                        fun _backFileId(): JsonField<String> = backFileId

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): DriversLicense = apply {
                            if (validated) {
                                return@apply
                            }

                            expirationDate()
                            fileId()
                            state()
                            backFileId()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [DriversLicense].
                             *
                             * The following fields are required:
                             * ```java
                             * .expirationDate()
                             * .fileId()
                             * .state()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [DriversLicense]. */
                        class Builder internal constructor() {

                            private var expirationDate: JsonField<LocalDate>? = null
                            private var fileId: JsonField<String>? = null
                            private var state: JsonField<String>? = null
                            private var backFileId: JsonField<String> = JsonMissing.of()
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
                            fun expirationDate(expirationDate: LocalDate) =
                                expirationDate(JsonField.of(expirationDate))

                            /** The driver's license's expiration date in YYYY-MM-DD format. */
                            fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                                this.expirationDate = expirationDate
                            }

                            /**
                             * The identifier of the File containing the front of the driver's
                             * license.
                             */
                            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                            /**
                             * The identifier of the File containing the front of the driver's
                             * license.
                             */
                            fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                            /** The state that issued the provided driver's license. */
                            fun state(state: String) = state(JsonField.of(state))

                            /** The state that issued the provided driver's license. */
                            fun state(state: JsonField<String>) = apply { this.state = state }

                            /**
                             * The identifier of the File containing the back of the driver's
                             * license.
                             */
                            fun backFileId(backFileId: String) =
                                backFileId(JsonField.of(backFileId))

                            /**
                             * The identifier of the File containing the back of the driver's
                             * license.
                             */
                            fun backFileId(backFileId: JsonField<String>) = apply {
                                this.backFileId = backFileId
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

                            fun build(): DriversLicense =
                                DriversLicense(
                                    checkRequired("expirationDate", expirationDate),
                                    checkRequired("fileId", fileId),
                                    checkRequired("state", state),
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
                        @JsonProperty("country")
                        @ExcludeMissing
                        private val country: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("description")
                        @ExcludeMissing
                        private val description: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        private val fileId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("back_file_id")
                        @ExcludeMissing
                        private val backFileId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        private val expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        /**
                         * The two-character ISO 3166-1 code representing the country that issued
                         * the document.
                         */
                        fun country(): String = country.getRequired("country")

                        /** A description of the document submitted. */
                        fun description(): String = description.getRequired("description")

                        /** The identifier of the File containing the front of the document. */
                        fun fileId(): String = fileId.getRequired("file_id")

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        fun backFileId(): Optional<String> =
                            Optional.ofNullable(backFileId.getNullable("back_file_id"))

                        /** The document's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(): Optional<LocalDate> =
                            Optional.ofNullable(expirationDate.getNullable("expiration_date"))

                        /**
                         * The two-character ISO 3166-1 code representing the country that issued
                         * the document.
                         */
                        @JsonProperty("country")
                        @ExcludeMissing
                        fun _country(): JsonField<String> = country

                        /** A description of the document submitted. */
                        @JsonProperty("description")
                        @ExcludeMissing
                        fun _description(): JsonField<String> = description

                        /** The identifier of the File containing the front of the document. */
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        fun _fileId(): JsonField<String> = fileId

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        @JsonProperty("back_file_id")
                        @ExcludeMissing
                        fun _backFileId(): JsonField<String> = backFileId

                        /** The document's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        fun _expirationDate(): JsonField<LocalDate> = expirationDate

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Other = apply {
                            if (validated) {
                                return@apply
                            }

                            country()
                            description()
                            fileId()
                            backFileId()
                            expirationDate()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of [Other].
                             *
                             * The following fields are required:
                             * ```java
                             * .country()
                             * .description()
                             * .fileId()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Other]. */
                        class Builder internal constructor() {

                            private var country: JsonField<String>? = null
                            private var description: JsonField<String>? = null
                            private var fileId: JsonField<String>? = null
                            private var backFileId: JsonField<String> = JsonMissing.of()
                            private var expirationDate: JsonField<LocalDate> = JsonMissing.of()
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
                            fun country(country: String) = country(JsonField.of(country))

                            /**
                             * The two-character ISO 3166-1 code representing the country that
                             * issued the document.
                             */
                            fun country(country: JsonField<String>) = apply {
                                this.country = country
                            }

                            /** A description of the document submitted. */
                            fun description(description: String) =
                                description(JsonField.of(description))

                            /** A description of the document submitted. */
                            fun description(description: JsonField<String>) = apply {
                                this.description = description
                            }

                            /** The identifier of the File containing the front of the document. */
                            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                            /** The identifier of the File containing the front of the document. */
                            fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                            /**
                             * The identifier of the File containing the back of the document. Not
                             * every document has a reverse side.
                             */
                            fun backFileId(backFileId: String) =
                                backFileId(JsonField.of(backFileId))

                            /**
                             * The identifier of the File containing the back of the document. Not
                             * every document has a reverse side.
                             */
                            fun backFileId(backFileId: JsonField<String>) = apply {
                                this.backFileId = backFileId
                            }

                            /** The document's expiration date in YYYY-MM-DD format. */
                            fun expirationDate(expirationDate: LocalDate) =
                                expirationDate(JsonField.of(expirationDate))

                            /** The document's expiration date in YYYY-MM-DD format. */
                            fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                                this.expirationDate = expirationDate
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

                            fun build(): Other =
                                Other(
                                    checkRequired("country", country),
                                    checkRequired("description", description),
                                    checkRequired("fileId", fileId),
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
                        @JsonProperty("country")
                        @ExcludeMissing
                        private val country: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        private val expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        private val fileId: JsonField<String> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        /** The country that issued the passport. */
                        fun country(): String = country.getRequired("country")

                        /** The passport's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(): LocalDate =
                            expirationDate.getRequired("expiration_date")

                        /** The identifier of the File containing the passport. */
                        fun fileId(): String = fileId.getRequired("file_id")

                        /** The country that issued the passport. */
                        @JsonProperty("country")
                        @ExcludeMissing
                        fun _country(): JsonField<String> = country

                        /** The passport's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        fun _expirationDate(): JsonField<LocalDate> = expirationDate

                        /** The identifier of the File containing the passport. */
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        fun _fileId(): JsonField<String> = fileId

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Passport = apply {
                            if (validated) {
                                return@apply
                            }

                            country()
                            expirationDate()
                            fileId()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of [Passport].
                             *
                             * The following fields are required:
                             * ```java
                             * .country()
                             * .expirationDate()
                             * .fileId()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Passport]. */
                        class Builder internal constructor() {

                            private var country: JsonField<String>? = null
                            private var expirationDate: JsonField<LocalDate>? = null
                            private var fileId: JsonField<String>? = null
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
                            fun country(country: String) = country(JsonField.of(country))

                            /** The country that issued the passport. */
                            fun country(country: JsonField<String>) = apply {
                                this.country = country
                            }

                            /** The passport's expiration date in YYYY-MM-DD format. */
                            fun expirationDate(expirationDate: LocalDate) =
                                expirationDate(JsonField.of(expirationDate))

                            /** The passport's expiration date in YYYY-MM-DD format. */
                            fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                                this.expirationDate = expirationDate
                            }

                            /** The identifier of the File containing the passport. */
                            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                            /** The identifier of the File containing the passport. */
                            fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

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
                                    checkRequired("country", country),
                                    checkRequired("expirationDate", expirationDate),
                                    checkRequired("fileId", fileId),
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

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        fun address(): Address = address.getRequired("address")

        /** The identifying details of authorized officials acting on the entity's behalf. */
        fun authorizedPersons(): List<AuthorizedPerson> =
            authorizedPersons.getRequired("authorized_persons")

        /** The category of the government authority. */
        fun category(): Category = category.getRequired("category")

        /** The legal name of the government authority. */
        fun name(): String = name.getRequired("name")

        /** The Employer Identification Number (EIN) for the government authority. */
        fun taxIdentifier(): String = taxIdentifier.getRequired("tax_identifier")

        /** The website of the government authority. */
        fun website(): Optional<String> = Optional.ofNullable(website.getNullable("website"))

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /** The identifying details of authorized officials acting on the entity's behalf. */
        @JsonProperty("authorized_persons")
        @ExcludeMissing
        fun _authorizedPersons(): JsonField<List<AuthorizedPerson>> = authorizedPersons

        /** The category of the government authority. */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /** The legal name of the government authority. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** The Employer Identification Number (EIN) for the government authority. */
        @JsonProperty("tax_identifier")
        @ExcludeMissing
        fun _taxIdentifier(): JsonField<String> = taxIdentifier

        /** The website of the government authority. */
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
            private var website: JsonField<String> = JsonMissing.of()
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

            /**
             * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
             * disallowed.
             */
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
             * disallowed.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** The identifying details of authorized officials acting on the entity's behalf. */
            fun authorizedPersons(authorizedPersons: List<AuthorizedPerson>) =
                authorizedPersons(JsonField.of(authorizedPersons))

            /** The identifying details of authorized officials acting on the entity's behalf. */
            fun authorizedPersons(authorizedPersons: JsonField<List<AuthorizedPerson>>) = apply {
                this.authorizedPersons = authorizedPersons.map { it.toMutableList() }
            }

            /** The identifying details of authorized officials acting on the entity's behalf. */
            fun addAuthorizedPerson(authorizedPerson: AuthorizedPerson) = apply {
                authorizedPersons =
                    (authorizedPersons ?: JsonField.of(mutableListOf())).also {
                        checkKnown("authorizedPersons", it).add(authorizedPerson)
                    }
            }

            /** The category of the government authority. */
            fun category(category: Category) = category(JsonField.of(category))

            /** The category of the government authority. */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** The legal name of the government authority. */
            fun name(name: String) = name(JsonField.of(name))

            /** The legal name of the government authority. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The Employer Identification Number (EIN) for the government authority. */
            fun taxIdentifier(taxIdentifier: String) = taxIdentifier(JsonField.of(taxIdentifier))

            /** The Employer Identification Number (EIN) for the government authority. */
            fun taxIdentifier(taxIdentifier: JsonField<String>) = apply {
                this.taxIdentifier = taxIdentifier
            }

            /** The website of the government authority. */
            fun website(website: String) = website(JsonField.of(website))

            /** The website of the government authority. */
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
            @JsonProperty("city")
            @ExcludeMissing
            private val city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1")
            @ExcludeMissing
            private val line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state")
            @ExcludeMissing
            private val state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("zip")
            @ExcludeMissing
            private val zip: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2")
            @ExcludeMissing
            private val line2: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The city of the address. */
            fun city(): String = city.getRequired("city")

            /** The first line of the address. This is usually the street number and street. */
            fun line1(): String = line1.getRequired("line1")

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            fun state(): String = state.getRequired("state")

            /** The ZIP code of the address. */
            fun zip(): String = zip.getRequired("zip")

            /** The second line of the address. This might be the floor or room number. */
            fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

            /** The city of the address. */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /** The first line of the address. This is usually the street number and street. */
            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

            /** The second line of the address. This might be the floor or room number. */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
                state()
                zip()
                line2()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Address].
                 *
                 * The following fields are required:
                 * ```java
                 * .city()
                 * .line1()
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
                private var state: JsonField<String>? = null
                private var zip: JsonField<String>? = null
                private var line2: JsonField<String> = JsonMissing.of()
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
                fun city(city: String) = city(JsonField.of(city))

                /** The city of the address. */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The first line of the address. This is usually the street number and street. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /** The first line of the address. This is usually the street number and street. */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

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

                /** The second line of the address. This might be the floor or room number. */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /** The second line of the address. This might be the floor or room number. */
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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
                        checkRequired("state", state),
                        checkRequired("zip", zip),
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
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The person's legal name. */
            fun name(): String = name.getRequired("name")

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

                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [AuthorizedPerson].
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AuthorizedPerson]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(authorizedPerson: AuthorizedPerson) = apply {
                    name = authorizedPerson.name
                    additionalProperties = authorizedPerson.additionalProperties.toMutableMap()
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
                        checkRequired("name", name),
                        additionalProperties.toImmutable(),
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

        /** The name of the joint entity. */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** The two individuals that share control of the entity. */
        @JsonProperty("individuals")
        @ExcludeMissing
        fun _individuals(): JsonField<List<Individual>> = individuals

        /** The name of the joint entity. */
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

            /**
             * Returns a mutable builder for constructing an instance of [Joint].
             *
             * The following fields are required:
             * ```java
             * .individuals()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Joint]. */
        class Builder internal constructor() {

            private var individuals: JsonField<MutableList<Individual>>? = null
            private var name: JsonField<String> = JsonMissing.of()
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
                    (individuals ?: JsonField.of(mutableListOf())).also {
                        checkKnown("individuals", it).add(individual)
                    }
            }

            /** The name of the joint entity. */
            fun name(name: String) = name(JsonField.of(name))

            /** The name of the joint entity. */
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
                    name,
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
            @JsonProperty("confirmed_no_us_tax_id")
            @ExcludeMissing
            private val confirmedNoUsTaxId: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and PMB's
             * are disallowed.
             */
            fun address(): Address = address.getRequired("address")

            /** The person's date of birth in YYYY-MM-DD format. */
            fun dateOfBirth(): LocalDate = dateOfBirth.getRequired("date_of_birth")

            /** A means of verifying the person's identity. */
            fun identification(): Identification = identification.getRequired("identification")

            /** The person's legal name. */
            fun name(): String = name.getRequired("name")

            /**
             * The identification method for an individual can only be a passport, driver's license,
             * or other document if you've confirmed the individual does not have a US tax id
             * (either a Social Security Number or Individual Taxpayer Identification Number).
             */
            fun confirmedNoUsTaxId(): Optional<Boolean> =
                Optional.ofNullable(confirmedNoUsTaxId.getNullable("confirmed_no_us_tax_id"))

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and PMB's
             * are disallowed.
             */
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

            /**
             * The identification method for an individual can only be a passport, driver's license,
             * or other document if you've confirmed the individual does not have a US tax id
             * (either a Social Security Number or Individual Taxpayer Identification Number).
             */
            @JsonProperty("confirmed_no_us_tax_id")
            @ExcludeMissing
            fun _confirmedNoUsTaxId(): JsonField<Boolean> = confirmedNoUsTaxId

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
                confirmedNoUsTaxId()
                validated = true
            }

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
                private var confirmedNoUsTaxId: JsonField<Boolean> = JsonMissing.of()
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
                fun address(address: Address) = address(JsonField.of(address))

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
                 */
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

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean) =
                    confirmedNoUsTaxId(JsonField.of(confirmedNoUsTaxId))

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                fun confirmedNoUsTaxId(confirmedNoUsTaxId: JsonField<Boolean>) = apply {
                    this.confirmedNoUsTaxId = confirmedNoUsTaxId
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

                fun build(): Individual =
                    Individual(
                        checkRequired("address", address),
                        checkRequired("dateOfBirth", dateOfBirth),
                        checkRequired("identification", identification),
                        checkRequired("name", name),
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
                @JsonProperty("city")
                @ExcludeMissing
                private val city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line1")
                @ExcludeMissing
                private val line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state")
                @ExcludeMissing
                private val state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("zip")
                @ExcludeMissing
                private val zip: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2")
                @ExcludeMissing
                private val line2: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The city of the address. */
                fun city(): String = city.getRequired("city")

                /** The first line of the address. This is usually the street number and street. */
                fun line1(): String = line1.getRequired("line1")

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                fun state(): String = state.getRequired("state")

                /** The ZIP code of the address. */
                fun zip(): String = zip.getRequired("zip")

                /** The second line of the address. This might be the floor or room number. */
                fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

                /** The city of the address. */
                @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

                /** The first line of the address. This is usually the street number and street. */
                @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

                /** The ZIP code of the address. */
                @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

                /** The second line of the address. This might be the floor or room number. */
                @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
                    state()
                    zip()
                    line2()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Address].
                     *
                     * The following fields are required:
                     * ```java
                     * .city()
                     * .line1()
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
                    private var state: JsonField<String>? = null
                    private var zip: JsonField<String>? = null
                    private var line2: JsonField<String> = JsonMissing.of()
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
                    fun city(city: String) = city(JsonField.of(city))

                    /** The city of the address. */
                    fun city(city: JsonField<String>) = apply { this.city = city }

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    fun line1(line1: String) = line1(JsonField.of(line1))

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

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

                    /** The second line of the address. This might be the floor or room number. */
                    fun line2(line2: String) = line2(JsonField.of(line2))

                    /** The second line of the address. This might be the floor or room number. */
                    fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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
                            checkRequired("state", state),
                            checkRequired("zip", zip),
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
                @JsonProperty("method")
                @ExcludeMissing
                private val method: JsonField<Method> = JsonMissing.of(),
                @JsonProperty("number")
                @ExcludeMissing
                private val number: JsonField<String> = JsonMissing.of(),
                @JsonProperty("drivers_license")
                @ExcludeMissing
                private val driversLicense: JsonField<DriversLicense> = JsonMissing.of(),
                @JsonProperty("other")
                @ExcludeMissing
                private val other: JsonField<Other> = JsonMissing.of(),
                @JsonProperty("passport")
                @ExcludeMissing
                private val passport: JsonField<Passport> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** A method that can be used to verify the individual's identity. */
                fun method(): Method = method.getRequired("method")

                /**
                 * An identification number that can be used to verify the individual's identity,
                 * such as a social security number.
                 */
                fun number(): String = number.getRequired("number")

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                fun driversLicense(): Optional<DriversLicense> =
                    Optional.ofNullable(driversLicense.getNullable("drivers_license"))

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                fun other(): Optional<Other> = Optional.ofNullable(other.getNullable("other"))

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                fun passport(): Optional<Passport> =
                    Optional.ofNullable(passport.getNullable("passport"))

                /** A method that can be used to verify the individual's identity. */
                @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

                /**
                 * An identification number that can be used to verify the individual's identity,
                 * such as a social security number.
                 */
                @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<String> = number

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                @JsonProperty("drivers_license")
                @ExcludeMissing
                fun _driversLicense(): JsonField<DriversLicense> = driversLicense

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                @JsonProperty("other") @ExcludeMissing fun _other(): JsonField<Other> = other

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                @JsonProperty("passport")
                @ExcludeMissing
                fun _passport(): JsonField<Passport> = passport

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Identification = apply {
                    if (validated) {
                        return@apply
                    }

                    method()
                    number()
                    driversLicense().ifPresent { it.validate() }
                    other().ifPresent { it.validate() }
                    passport().ifPresent { it.validate() }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Identification].
                     *
                     * The following fields are required:
                     * ```java
                     * .method()
                     * .number()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Identification]. */
                class Builder internal constructor() {

                    private var method: JsonField<Method>? = null
                    private var number: JsonField<String>? = null
                    private var driversLicense: JsonField<DriversLicense> = JsonMissing.of()
                    private var other: JsonField<Other> = JsonMissing.of()
                    private var passport: JsonField<Passport> = JsonMissing.of()
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
                    fun method(method: Method) = method(JsonField.of(method))

                    /** A method that can be used to verify the individual's identity. */
                    fun method(method: JsonField<Method>) = apply { this.method = method }

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     */
                    fun number(number: String) = number(JsonField.of(number))

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     */
                    fun number(number: JsonField<String>) = apply { this.number = number }

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    fun driversLicense(driversLicense: DriversLicense) =
                        driversLicense(JsonField.of(driversLicense))

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    fun driversLicense(driversLicense: JsonField<DriversLicense>) = apply {
                        this.driversLicense = driversLicense
                    }

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    fun other(other: Other) = other(JsonField.of(other))

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    fun other(other: JsonField<Other>) = apply { this.other = other }

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    fun passport(passport: Passport) = passport(JsonField.of(passport))

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    fun passport(passport: JsonField<Passport>) = apply { this.passport = passport }

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
                            checkRequired("number", number),
                            driversLicense,
                            other,
                            passport,
                            additionalProperties.toImmutable(),
                        )
                }

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
                    @JsonProperty("expiration_date")
                    @ExcludeMissing
                    private val expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    private val fileId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("state")
                    @ExcludeMissing
                    private val state: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("back_file_id")
                    @ExcludeMissing
                    private val backFileId: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The driver's license's expiration date in YYYY-MM-DD format. */
                    fun expirationDate(): LocalDate = expirationDate.getRequired("expiration_date")

                    /** The identifier of the File containing the front of the driver's license. */
                    fun fileId(): String = fileId.getRequired("file_id")

                    /** The state that issued the provided driver's license. */
                    fun state(): String = state.getRequired("state")

                    /** The identifier of the File containing the back of the driver's license. */
                    fun backFileId(): Optional<String> =
                        Optional.ofNullable(backFileId.getNullable("back_file_id"))

                    /** The driver's license's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    @ExcludeMissing
                    fun _expirationDate(): JsonField<LocalDate> = expirationDate

                    /** The identifier of the File containing the front of the driver's license. */
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    fun _fileId(): JsonField<String> = fileId

                    /** The state that issued the provided driver's license. */
                    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

                    /** The identifier of the File containing the back of the driver's license. */
                    @JsonProperty("back_file_id")
                    @ExcludeMissing
                    fun _backFileId(): JsonField<String> = backFileId

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): DriversLicense = apply {
                        if (validated) {
                            return@apply
                        }

                        expirationDate()
                        fileId()
                        state()
                        backFileId()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [DriversLicense].
                         *
                         * The following fields are required:
                         * ```java
                         * .expirationDate()
                         * .fileId()
                         * .state()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [DriversLicense]. */
                    class Builder internal constructor() {

                        private var expirationDate: JsonField<LocalDate>? = null
                        private var fileId: JsonField<String>? = null
                        private var state: JsonField<String>? = null
                        private var backFileId: JsonField<String> = JsonMissing.of()
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
                        fun expirationDate(expirationDate: LocalDate) =
                            expirationDate(JsonField.of(expirationDate))

                        /** The driver's license's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                            this.expirationDate = expirationDate
                        }

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                        /** The state that issued the provided driver's license. */
                        fun state(state: String) = state(JsonField.of(state))

                        /** The state that issued the provided driver's license. */
                        fun state(state: JsonField<String>) = apply { this.state = state }

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        fun backFileId(backFileId: String) = backFileId(JsonField.of(backFileId))

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        fun backFileId(backFileId: JsonField<String>) = apply {
                            this.backFileId = backFileId
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

                        fun build(): DriversLicense =
                            DriversLicense(
                                checkRequired("expirationDate", expirationDate),
                                checkRequired("fileId", fileId),
                                checkRequired("state", state),
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
                    @JsonProperty("country")
                    @ExcludeMissing
                    private val country: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    private val description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    private val fileId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("back_file_id")
                    @ExcludeMissing
                    private val backFileId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("expiration_date")
                    @ExcludeMissing
                    private val expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /**
                     * The two-character ISO 3166-1 code representing the country that issued the
                     * document.
                     */
                    fun country(): String = country.getRequired("country")

                    /** A description of the document submitted. */
                    fun description(): String = description.getRequired("description")

                    /** The identifier of the File containing the front of the document. */
                    fun fileId(): String = fileId.getRequired("file_id")

                    /**
                     * The identifier of the File containing the back of the document. Not every
                     * document has a reverse side.
                     */
                    fun backFileId(): Optional<String> =
                        Optional.ofNullable(backFileId.getNullable("back_file_id"))

                    /** The document's expiration date in YYYY-MM-DD format. */
                    fun expirationDate(): Optional<LocalDate> =
                        Optional.ofNullable(expirationDate.getNullable("expiration_date"))

                    /**
                     * The two-character ISO 3166-1 code representing the country that issued the
                     * document.
                     */
                    @JsonProperty("country")
                    @ExcludeMissing
                    fun _country(): JsonField<String> = country

                    /** A description of the document submitted. */
                    @JsonProperty("description")
                    @ExcludeMissing
                    fun _description(): JsonField<String> = description

                    /** The identifier of the File containing the front of the document. */
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    fun _fileId(): JsonField<String> = fileId

                    /**
                     * The identifier of the File containing the back of the document. Not every
                     * document has a reverse side.
                     */
                    @JsonProperty("back_file_id")
                    @ExcludeMissing
                    fun _backFileId(): JsonField<String> = backFileId

                    /** The document's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    @ExcludeMissing
                    fun _expirationDate(): JsonField<LocalDate> = expirationDate

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Other = apply {
                        if (validated) {
                            return@apply
                        }

                        country()
                        description()
                        fileId()
                        backFileId()
                        expirationDate()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Other].
                         *
                         * The following fields are required:
                         * ```java
                         * .country()
                         * .description()
                         * .fileId()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Other]. */
                    class Builder internal constructor() {

                        private var country: JsonField<String>? = null
                        private var description: JsonField<String>? = null
                        private var fileId: JsonField<String>? = null
                        private var backFileId: JsonField<String> = JsonMissing.of()
                        private var expirationDate: JsonField<LocalDate> = JsonMissing.of()
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
                        fun country(country: String) = country(JsonField.of(country))

                        /**
                         * The two-character ISO 3166-1 code representing the country that issued
                         * the document.
                         */
                        fun country(country: JsonField<String>) = apply { this.country = country }

                        /** A description of the document submitted. */
                        fun description(description: String) =
                            description(JsonField.of(description))

                        /** A description of the document submitted. */
                        fun description(description: JsonField<String>) = apply {
                            this.description = description
                        }

                        /** The identifier of the File containing the front of the document. */
                        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                        /** The identifier of the File containing the front of the document. */
                        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        fun backFileId(backFileId: String) = backFileId(JsonField.of(backFileId))

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        fun backFileId(backFileId: JsonField<String>) = apply {
                            this.backFileId = backFileId
                        }

                        /** The document's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(expirationDate: LocalDate) =
                            expirationDate(JsonField.of(expirationDate))

                        /** The document's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                            this.expirationDate = expirationDate
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

                        fun build(): Other =
                            Other(
                                checkRequired("country", country),
                                checkRequired("description", description),
                                checkRequired("fileId", fileId),
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
                    @JsonProperty("country")
                    @ExcludeMissing
                    private val country: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("expiration_date")
                    @ExcludeMissing
                    private val expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    private val fileId: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The country that issued the passport. */
                    fun country(): String = country.getRequired("country")

                    /** The passport's expiration date in YYYY-MM-DD format. */
                    fun expirationDate(): LocalDate = expirationDate.getRequired("expiration_date")

                    /** The identifier of the File containing the passport. */
                    fun fileId(): String = fileId.getRequired("file_id")

                    /** The country that issued the passport. */
                    @JsonProperty("country")
                    @ExcludeMissing
                    fun _country(): JsonField<String> = country

                    /** The passport's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    @ExcludeMissing
                    fun _expirationDate(): JsonField<LocalDate> = expirationDate

                    /** The identifier of the File containing the passport. */
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    fun _fileId(): JsonField<String> = fileId

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Passport = apply {
                        if (validated) {
                            return@apply
                        }

                        country()
                        expirationDate()
                        fileId()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Passport].
                         *
                         * The following fields are required:
                         * ```java
                         * .country()
                         * .expirationDate()
                         * .fileId()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Passport]. */
                    class Builder internal constructor() {

                        private var country: JsonField<String>? = null
                        private var expirationDate: JsonField<LocalDate>? = null
                        private var fileId: JsonField<String>? = null
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
                        fun country(country: String) = country(JsonField.of(country))

                        /** The country that issued the passport. */
                        fun country(country: JsonField<String>) = apply { this.country = country }

                        /** The passport's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(expirationDate: LocalDate) =
                            expirationDate(JsonField.of(expirationDate))

                        /** The passport's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                            this.expirationDate = expirationDate
                        }

                        /** The identifier of the File containing the passport. */
                        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                        /** The identifier of the File containing the passport. */
                        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

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
                                checkRequired("country", country),
                                checkRequired("expirationDate", expirationDate),
                                checkRequired("fileId", fileId),
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
        @JsonProperty("confirmed_no_us_tax_id")
        @ExcludeMissing
        private val confirmedNoUsTaxId: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The individual's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        fun address(): Address = address.getRequired("address")

        /** The person's date of birth in YYYY-MM-DD format. */
        fun dateOfBirth(): LocalDate = dateOfBirth.getRequired("date_of_birth")

        /** A means of verifying the person's identity. */
        fun identification(): Identification = identification.getRequired("identification")

        /** The person's legal name. */
        fun name(): String = name.getRequired("name")

        /**
         * The identification method for an individual can only be a passport, driver's license, or
         * other document if you've confirmed the individual does not have a US tax id (either a
         * Social Security Number or Individual Taxpayer Identification Number).
         */
        fun confirmedNoUsTaxId(): Optional<Boolean> =
            Optional.ofNullable(confirmedNoUsTaxId.getNullable("confirmed_no_us_tax_id"))

        /**
         * The individual's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
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

        /**
         * The identification method for an individual can only be a passport, driver's license, or
         * other document if you've confirmed the individual does not have a US tax id (either a
         * Social Security Number or Individual Taxpayer Identification Number).
         */
        @JsonProperty("confirmed_no_us_tax_id")
        @ExcludeMissing
        fun _confirmedNoUsTaxId(): JsonField<Boolean> = confirmedNoUsTaxId

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
            confirmedNoUsTaxId()
            validated = true
        }

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
            private var confirmedNoUsTaxId: JsonField<Boolean> = JsonMissing.of()
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
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and PMB's
             * are disallowed.
             */
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

            /**
             * The identification method for an individual can only be a passport, driver's license,
             * or other document if you've confirmed the individual does not have a US tax id
             * (either a Social Security Number or Individual Taxpayer Identification Number).
             */
            fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean) =
                confirmedNoUsTaxId(JsonField.of(confirmedNoUsTaxId))

            /**
             * The identification method for an individual can only be a passport, driver's license,
             * or other document if you've confirmed the individual does not have a US tax id
             * (either a Social Security Number or Individual Taxpayer Identification Number).
             */
            fun confirmedNoUsTaxId(confirmedNoUsTaxId: JsonField<Boolean>) = apply {
                this.confirmedNoUsTaxId = confirmedNoUsTaxId
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

            fun build(): NaturalPerson =
                NaturalPerson(
                    checkRequired("address", address),
                    checkRequired("dateOfBirth", dateOfBirth),
                    checkRequired("identification", identification),
                    checkRequired("name", name),
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
            @JsonProperty("city")
            @ExcludeMissing
            private val city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1")
            @ExcludeMissing
            private val line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state")
            @ExcludeMissing
            private val state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("zip")
            @ExcludeMissing
            private val zip: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2")
            @ExcludeMissing
            private val line2: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The city of the address. */
            fun city(): String = city.getRequired("city")

            /** The first line of the address. This is usually the street number and street. */
            fun line1(): String = line1.getRequired("line1")

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            fun state(): String = state.getRequired("state")

            /** The ZIP code of the address. */
            fun zip(): String = zip.getRequired("zip")

            /** The second line of the address. This might be the floor or room number. */
            fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

            /** The city of the address. */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /** The first line of the address. This is usually the street number and street. */
            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

            /** The second line of the address. This might be the floor or room number. */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
                state()
                zip()
                line2()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Address].
                 *
                 * The following fields are required:
                 * ```java
                 * .city()
                 * .line1()
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
                private var state: JsonField<String>? = null
                private var zip: JsonField<String>? = null
                private var line2: JsonField<String> = JsonMissing.of()
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
                fun city(city: String) = city(JsonField.of(city))

                /** The city of the address. */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The first line of the address. This is usually the street number and street. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /** The first line of the address. This is usually the street number and street. */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

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

                /** The second line of the address. This might be the floor or room number. */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /** The second line of the address. This might be the floor or room number. */
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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
                        checkRequired("state", state),
                        checkRequired("zip", zip),
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
            @JsonProperty("method")
            @ExcludeMissing
            private val method: JsonField<Method> = JsonMissing.of(),
            @JsonProperty("number")
            @ExcludeMissing
            private val number: JsonField<String> = JsonMissing.of(),
            @JsonProperty("drivers_license")
            @ExcludeMissing
            private val driversLicense: JsonField<DriversLicense> = JsonMissing.of(),
            @JsonProperty("other")
            @ExcludeMissing
            private val other: JsonField<Other> = JsonMissing.of(),
            @JsonProperty("passport")
            @ExcludeMissing
            private val passport: JsonField<Passport> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** A method that can be used to verify the individual's identity. */
            fun method(): Method = method.getRequired("method")

            /**
             * An identification number that can be used to verify the individual's identity, such
             * as a social security number.
             */
            fun number(): String = number.getRequired("number")

            /**
             * Information about the United States driver's license used for identification.
             * Required if `method` is equal to `drivers_license`.
             */
            fun driversLicense(): Optional<DriversLicense> =
                Optional.ofNullable(driversLicense.getNullable("drivers_license"))

            /**
             * Information about the identification document provided. Required if `method` is equal
             * to `other`.
             */
            fun other(): Optional<Other> = Optional.ofNullable(other.getNullable("other"))

            /**
             * Information about the passport used for identification. Required if `method` is equal
             * to `passport`.
             */
            fun passport(): Optional<Passport> =
                Optional.ofNullable(passport.getNullable("passport"))

            /** A method that can be used to verify the individual's identity. */
            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

            /**
             * An identification number that can be used to verify the individual's identity, such
             * as a social security number.
             */
            @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<String> = number

            /**
             * Information about the United States driver's license used for identification.
             * Required if `method` is equal to `drivers_license`.
             */
            @JsonProperty("drivers_license")
            @ExcludeMissing
            fun _driversLicense(): JsonField<DriversLicense> = driversLicense

            /**
             * Information about the identification document provided. Required if `method` is equal
             * to `other`.
             */
            @JsonProperty("other") @ExcludeMissing fun _other(): JsonField<Other> = other

            /**
             * Information about the passport used for identification. Required if `method` is equal
             * to `passport`.
             */
            @JsonProperty("passport")
            @ExcludeMissing
            fun _passport(): JsonField<Passport> = passport

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Identification = apply {
                if (validated) {
                    return@apply
                }

                method()
                number()
                driversLicense().ifPresent { it.validate() }
                other().ifPresent { it.validate() }
                passport().ifPresent { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Identification].
                 *
                 * The following fields are required:
                 * ```java
                 * .method()
                 * .number()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Identification]. */
            class Builder internal constructor() {

                private var method: JsonField<Method>? = null
                private var number: JsonField<String>? = null
                private var driversLicense: JsonField<DriversLicense> = JsonMissing.of()
                private var other: JsonField<Other> = JsonMissing.of()
                private var passport: JsonField<Passport> = JsonMissing.of()
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
                fun method(method: Method) = method(JsonField.of(method))

                /** A method that can be used to verify the individual's identity. */
                fun method(method: JsonField<Method>) = apply { this.method = method }

                /**
                 * An identification number that can be used to verify the individual's identity,
                 * such as a social security number.
                 */
                fun number(number: String) = number(JsonField.of(number))

                /**
                 * An identification number that can be used to verify the individual's identity,
                 * such as a social security number.
                 */
                fun number(number: JsonField<String>) = apply { this.number = number }

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                fun driversLicense(driversLicense: DriversLicense) =
                    driversLicense(JsonField.of(driversLicense))

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                fun driversLicense(driversLicense: JsonField<DriversLicense>) = apply {
                    this.driversLicense = driversLicense
                }

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                fun other(other: Other) = other(JsonField.of(other))

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                fun other(other: JsonField<Other>) = apply { this.other = other }

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                fun passport(passport: Passport) = passport(JsonField.of(passport))

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                fun passport(passport: JsonField<Passport>) = apply { this.passport = passport }

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
                        checkRequired("number", number),
                        driversLicense,
                        other,
                        passport,
                        additionalProperties.toImmutable(),
                    )
            }

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
                @JsonProperty("expiration_date")
                @ExcludeMissing
                private val expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("file_id")
                @ExcludeMissing
                private val fileId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state")
                @ExcludeMissing
                private val state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("back_file_id")
                @ExcludeMissing
                private val backFileId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The driver's license's expiration date in YYYY-MM-DD format. */
                fun expirationDate(): LocalDate = expirationDate.getRequired("expiration_date")

                /** The identifier of the File containing the front of the driver's license. */
                fun fileId(): String = fileId.getRequired("file_id")

                /** The state that issued the provided driver's license. */
                fun state(): String = state.getRequired("state")

                /** The identifier of the File containing the back of the driver's license. */
                fun backFileId(): Optional<String> =
                    Optional.ofNullable(backFileId.getNullable("back_file_id"))

                /** The driver's license's expiration date in YYYY-MM-DD format. */
                @JsonProperty("expiration_date")
                @ExcludeMissing
                fun _expirationDate(): JsonField<LocalDate> = expirationDate

                /** The identifier of the File containing the front of the driver's license. */
                @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

                /** The state that issued the provided driver's license. */
                @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

                /** The identifier of the File containing the back of the driver's license. */
                @JsonProperty("back_file_id")
                @ExcludeMissing
                fun _backFileId(): JsonField<String> = backFileId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): DriversLicense = apply {
                    if (validated) {
                        return@apply
                    }

                    expirationDate()
                    fileId()
                    state()
                    backFileId()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [DriversLicense].
                     *
                     * The following fields are required:
                     * ```java
                     * .expirationDate()
                     * .fileId()
                     * .state()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [DriversLicense]. */
                class Builder internal constructor() {

                    private var expirationDate: JsonField<LocalDate>? = null
                    private var fileId: JsonField<String>? = null
                    private var state: JsonField<String>? = null
                    private var backFileId: JsonField<String> = JsonMissing.of()
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
                    fun expirationDate(expirationDate: LocalDate) =
                        expirationDate(JsonField.of(expirationDate))

                    /** The driver's license's expiration date in YYYY-MM-DD format. */
                    fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                        this.expirationDate = expirationDate
                    }

                    /** The identifier of the File containing the front of the driver's license. */
                    fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                    /** The identifier of the File containing the front of the driver's license. */
                    fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                    /** The state that issued the provided driver's license. */
                    fun state(state: String) = state(JsonField.of(state))

                    /** The state that issued the provided driver's license. */
                    fun state(state: JsonField<String>) = apply { this.state = state }

                    /** The identifier of the File containing the back of the driver's license. */
                    fun backFileId(backFileId: String) = backFileId(JsonField.of(backFileId))

                    /** The identifier of the File containing the back of the driver's license. */
                    fun backFileId(backFileId: JsonField<String>) = apply {
                        this.backFileId = backFileId
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

                    fun build(): DriversLicense =
                        DriversLicense(
                            checkRequired("expirationDate", expirationDate),
                            checkRequired("fileId", fileId),
                            checkRequired("state", state),
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
                @JsonProperty("country")
                @ExcludeMissing
                private val country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                private val description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("file_id")
                @ExcludeMissing
                private val fileId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("back_file_id")
                @ExcludeMissing
                private val backFileId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("expiration_date")
                @ExcludeMissing
                private val expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * The two-character ISO 3166-1 code representing the country that issued the
                 * document.
                 */
                fun country(): String = country.getRequired("country")

                /** A description of the document submitted. */
                fun description(): String = description.getRequired("description")

                /** The identifier of the File containing the front of the document. */
                fun fileId(): String = fileId.getRequired("file_id")

                /**
                 * The identifier of the File containing the back of the document. Not every
                 * document has a reverse side.
                 */
                fun backFileId(): Optional<String> =
                    Optional.ofNullable(backFileId.getNullable("back_file_id"))

                /** The document's expiration date in YYYY-MM-DD format. */
                fun expirationDate(): Optional<LocalDate> =
                    Optional.ofNullable(expirationDate.getNullable("expiration_date"))

                /**
                 * The two-character ISO 3166-1 code representing the country that issued the
                 * document.
                 */
                @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

                /** A description of the document submitted. */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /** The identifier of the File containing the front of the document. */
                @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

                /**
                 * The identifier of the File containing the back of the document. Not every
                 * document has a reverse side.
                 */
                @JsonProperty("back_file_id")
                @ExcludeMissing
                fun _backFileId(): JsonField<String> = backFileId

                /** The document's expiration date in YYYY-MM-DD format. */
                @JsonProperty("expiration_date")
                @ExcludeMissing
                fun _expirationDate(): JsonField<LocalDate> = expirationDate

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Other = apply {
                    if (validated) {
                        return@apply
                    }

                    country()
                    description()
                    fileId()
                    backFileId()
                    expirationDate()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Other].
                     *
                     * The following fields are required:
                     * ```java
                     * .country()
                     * .description()
                     * .fileId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Other]. */
                class Builder internal constructor() {

                    private var country: JsonField<String>? = null
                    private var description: JsonField<String>? = null
                    private var fileId: JsonField<String>? = null
                    private var backFileId: JsonField<String> = JsonMissing.of()
                    private var expirationDate: JsonField<LocalDate> = JsonMissing.of()
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
                    fun country(country: String) = country(JsonField.of(country))

                    /**
                     * The two-character ISO 3166-1 code representing the country that issued the
                     * document.
                     */
                    fun country(country: JsonField<String>) = apply { this.country = country }

                    /** A description of the document submitted. */
                    fun description(description: String) = description(JsonField.of(description))

                    /** A description of the document submitted. */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /** The identifier of the File containing the front of the document. */
                    fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                    /** The identifier of the File containing the front of the document. */
                    fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                    /**
                     * The identifier of the File containing the back of the document. Not every
                     * document has a reverse side.
                     */
                    fun backFileId(backFileId: String) = backFileId(JsonField.of(backFileId))

                    /**
                     * The identifier of the File containing the back of the document. Not every
                     * document has a reverse side.
                     */
                    fun backFileId(backFileId: JsonField<String>) = apply {
                        this.backFileId = backFileId
                    }

                    /** The document's expiration date in YYYY-MM-DD format. */
                    fun expirationDate(expirationDate: LocalDate) =
                        expirationDate(JsonField.of(expirationDate))

                    /** The document's expiration date in YYYY-MM-DD format. */
                    fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                        this.expirationDate = expirationDate
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

                    fun build(): Other =
                        Other(
                            checkRequired("country", country),
                            checkRequired("description", description),
                            checkRequired("fileId", fileId),
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
                @JsonProperty("country")
                @ExcludeMissing
                private val country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("expiration_date")
                @ExcludeMissing
                private val expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("file_id")
                @ExcludeMissing
                private val fileId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The country that issued the passport. */
                fun country(): String = country.getRequired("country")

                /** The passport's expiration date in YYYY-MM-DD format. */
                fun expirationDate(): LocalDate = expirationDate.getRequired("expiration_date")

                /** The identifier of the File containing the passport. */
                fun fileId(): String = fileId.getRequired("file_id")

                /** The country that issued the passport. */
                @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

                /** The passport's expiration date in YYYY-MM-DD format. */
                @JsonProperty("expiration_date")
                @ExcludeMissing
                fun _expirationDate(): JsonField<LocalDate> = expirationDate

                /** The identifier of the File containing the passport. */
                @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Passport = apply {
                    if (validated) {
                        return@apply
                    }

                    country()
                    expirationDate()
                    fileId()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Passport].
                     *
                     * The following fields are required:
                     * ```java
                     * .country()
                     * .expirationDate()
                     * .fileId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Passport]. */
                class Builder internal constructor() {

                    private var country: JsonField<String>? = null
                    private var expirationDate: JsonField<LocalDate>? = null
                    private var fileId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(passport: Passport) = apply {
                        country = passport.country
                        expirationDate = passport.expirationDate
                        fileId = passport.fileId
                        additionalProperties = passport.additionalProperties.toMutableMap()
                    }

                    /** The country that issued the passport. */
                    fun country(country: String) = country(JsonField.of(country))

                    /** The country that issued the passport. */
                    fun country(country: JsonField<String>) = apply { this.country = country }

                    /** The passport's expiration date in YYYY-MM-DD format. */
                    fun expirationDate(expirationDate: LocalDate) =
                        expirationDate(JsonField.of(expirationDate))

                    /** The passport's expiration date in YYYY-MM-DD format. */
                    fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                        this.expirationDate = expirationDate
                    }

                    /** The identifier of the File containing the passport. */
                    fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                    /** The identifier of the File containing the passport. */
                    fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

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
                            checkRequired("country", country),
                            checkRequired("expirationDate", expirationDate),
                            checkRequired("fileId", fileId),
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
        @JsonProperty("file_id")
        @ExcludeMissing
        private val fileId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier of the File containing the document. */
        fun fileId(): String = fileId.getRequired("file_id")

        /** The identifier of the File containing the document. */
        @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SupplementalDocument = apply {
            if (validated) {
                return@apply
            }

            fileId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [SupplementalDocument].
             *
             * The following fields are required:
             * ```java
             * .fileId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SupplementalDocument]. */
        class Builder internal constructor() {

            private var fileId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(supplementalDocument: SupplementalDocument) = apply {
                fileId = supplementalDocument.fileId
                additionalProperties = supplementalDocument.additionalProperties.toMutableMap()
            }

            /** The identifier of the File containing the document. */
            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

            /** The identifier of the File containing the document. */
            fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

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
                    checkRequired("fileId", fileId),
                    additionalProperties.toImmutable(),
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
        @JsonProperty("address")
        @ExcludeMissing
        private val address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("category")
        @ExcludeMissing
        private val category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trustees")
        @ExcludeMissing
        private val trustees: JsonField<List<Trustee>> = JsonMissing.of(),
        @JsonProperty("formation_document_file_id")
        @ExcludeMissing
        private val formationDocumentFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("formation_state")
        @ExcludeMissing
        private val formationState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("grantor")
        @ExcludeMissing
        private val grantor: JsonField<Grantor> = JsonMissing.of(),
        @JsonProperty("tax_identifier")
        @ExcludeMissing
        private val taxIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The trust's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        fun address(): Address = address.getRequired("address")

        /**
         * Whether the trust is `revocable` or `irrevocable`. Irrevocable trusts require their own
         * Employer Identification Number. Revocable trusts require information about the individual
         * `grantor` who created the trust.
         */
        fun category(): Category = category.getRequired("category")

        /** The legal name of the trust. */
        fun name(): String = name.getRequired("name")

        /** The trustees of the trust. */
        fun trustees(): List<Trustee> = trustees.getRequired("trustees")

        /** The identifier of the File containing the formation document of the trust. */
        fun formationDocumentFileId(): Optional<String> =
            Optional.ofNullable(formationDocumentFileId.getNullable("formation_document_file_id"))

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the state in which
         * the trust was formed.
         */
        fun formationState(): Optional<String> =
            Optional.ofNullable(formationState.getNullable("formation_state"))

        /** The grantor of the trust. Required if `category` is equal to `revocable`. */
        fun grantor(): Optional<Grantor> = Optional.ofNullable(grantor.getNullable("grantor"))

        /**
         * The Employer Identification Number (EIN) for the trust. Required if `category` is equal
         * to `irrevocable`.
         */
        fun taxIdentifier(): Optional<String> =
            Optional.ofNullable(taxIdentifier.getNullable("tax_identifier"))

        /**
         * The trust's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /**
         * Whether the trust is `revocable` or `irrevocable`. Irrevocable trusts require their own
         * Employer Identification Number. Revocable trusts require information about the individual
         * `grantor` who created the trust.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /** The legal name of the trust. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** The trustees of the trust. */
        @JsonProperty("trustees")
        @ExcludeMissing
        fun _trustees(): JsonField<List<Trustee>> = trustees

        /** The identifier of the File containing the formation document of the trust. */
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

        /** The grantor of the trust. Required if `category` is equal to `revocable`. */
        @JsonProperty("grantor") @ExcludeMissing fun _grantor(): JsonField<Grantor> = grantor

        /**
         * The Employer Identification Number (EIN) for the trust. Required if `category` is equal
         * to `irrevocable`.
         */
        @JsonProperty("tax_identifier")
        @ExcludeMissing
        fun _taxIdentifier(): JsonField<String> = taxIdentifier

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
            name()
            trustees().forEach { it.validate() }
            formationDocumentFileId()
            formationState()
            grantor().ifPresent { it.validate() }
            taxIdentifier()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Trust].
             *
             * The following fields are required:
             * ```java
             * .address()
             * .category()
             * .name()
             * .trustees()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Trust]. */
        class Builder internal constructor() {

            private var address: JsonField<Address>? = null
            private var category: JsonField<Category>? = null
            private var name: JsonField<String>? = null
            private var trustees: JsonField<MutableList<Trustee>>? = null
            private var formationDocumentFileId: JsonField<String> = JsonMissing.of()
            private var formationState: JsonField<String> = JsonMissing.of()
            private var grantor: JsonField<Grantor> = JsonMissing.of()
            private var taxIdentifier: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trust: Trust) = apply {
                address = trust.address
                category = trust.category
                name = trust.name
                trustees = trust.trustees.map { it.toMutableList() }
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
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * The trust's physical address. Mail receiving locations like PO Boxes and PMB's are
             * disallowed.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /**
             * Whether the trust is `revocable` or `irrevocable`. Irrevocable trusts require their
             * own Employer Identification Number. Revocable trusts require information about the
             * individual `grantor` who created the trust.
             */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Whether the trust is `revocable` or `irrevocable`. Irrevocable trusts require their
             * own Employer Identification Number. Revocable trusts require information about the
             * individual `grantor` who created the trust.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** The legal name of the trust. */
            fun name(name: String) = name(JsonField.of(name))

            /** The legal name of the trust. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The trustees of the trust. */
            fun trustees(trustees: List<Trustee>) = trustees(JsonField.of(trustees))

            /** The trustees of the trust. */
            fun trustees(trustees: JsonField<List<Trustee>>) = apply {
                this.trustees = trustees.map { it.toMutableList() }
            }

            /** The trustees of the trust. */
            fun addTrustee(trustee: Trustee) = apply {
                trustees =
                    (trustees ?: JsonField.of(mutableListOf())).also {
                        checkKnown("trustees", it).add(trustee)
                    }
            }

            /** The identifier of the File containing the formation document of the trust. */
            fun formationDocumentFileId(formationDocumentFileId: String) =
                formationDocumentFileId(JsonField.of(formationDocumentFileId))

            /** The identifier of the File containing the formation document of the trust. */
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
            fun formationState(formationState: JsonField<String>) = apply {
                this.formationState = formationState
            }

            /** The grantor of the trust. Required if `category` is equal to `revocable`. */
            fun grantor(grantor: Grantor) = grantor(JsonField.of(grantor))

            /** The grantor of the trust. Required if `category` is equal to `revocable`. */
            fun grantor(grantor: JsonField<Grantor>) = apply { this.grantor = grantor }

            /**
             * The Employer Identification Number (EIN) for the trust. Required if `category` is
             * equal to `irrevocable`.
             */
            fun taxIdentifier(taxIdentifier: String) = taxIdentifier(JsonField.of(taxIdentifier))

            /**
             * The Employer Identification Number (EIN) for the trust. Required if `category` is
             * equal to `irrevocable`.
             */
            fun taxIdentifier(taxIdentifier: JsonField<String>) = apply {
                this.taxIdentifier = taxIdentifier
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
                    checkRequired("name", name),
                    checkRequired("trustees", trustees).map { it.toImmutable() },
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
            @JsonProperty("city")
            @ExcludeMissing
            private val city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1")
            @ExcludeMissing
            private val line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state")
            @ExcludeMissing
            private val state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("zip")
            @ExcludeMissing
            private val zip: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2")
            @ExcludeMissing
            private val line2: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The city of the address. */
            fun city(): String = city.getRequired("city")

            /** The first line of the address. This is usually the street number and street. */
            fun line1(): String = line1.getRequired("line1")

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            fun state(): String = state.getRequired("state")

            /** The ZIP code of the address. */
            fun zip(): String = zip.getRequired("zip")

            /** The second line of the address. This might be the floor or room number. */
            fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

            /** The city of the address. */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /** The first line of the address. This is usually the street number and street. */
            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            /** The ZIP code of the address. */
            @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

            /** The second line of the address. This might be the floor or room number. */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
                state()
                zip()
                line2()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Address].
                 *
                 * The following fields are required:
                 * ```java
                 * .city()
                 * .line1()
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
                private var state: JsonField<String>? = null
                private var zip: JsonField<String>? = null
                private var line2: JsonField<String> = JsonMissing.of()
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
                fun city(city: String) = city(JsonField.of(city))

                /** The city of the address. */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The first line of the address. This is usually the street number and street. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /** The first line of the address. This is usually the street number and street. */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

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

                /** The second line of the address. This might be the floor or room number. */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /** The second line of the address. This might be the floor or room number. */
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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
                        checkRequired("state", state),
                        checkRequired("zip", zip),
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

        /**
         * Whether the trust is `revocable` or `irrevocable`. Irrevocable trusts require their own
         * Employer Identification Number. Revocable trusts require information about the individual
         * `grantor` who created the trust.
         */
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
            @JsonProperty("structure")
            @ExcludeMissing
            private val structure: JsonField<Structure> = JsonMissing.of(),
            @JsonProperty("individual")
            @ExcludeMissing
            private val individual: JsonField<Individual> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The structure of the trustee. */
            fun structure(): Structure = structure.getRequired("structure")

            /**
             * Details of the individual trustee. Required when the trustee `structure` is equal to
             * `individual`.
             */
            fun individual(): Optional<Individual> =
                Optional.ofNullable(individual.getNullable("individual"))

            /** The structure of the trustee. */
            @JsonProperty("structure")
            @ExcludeMissing
            fun _structure(): JsonField<Structure> = structure

            /**
             * Details of the individual trustee. Required when the trustee `structure` is equal to
             * `individual`.
             */
            @JsonProperty("individual")
            @ExcludeMissing
            fun _individual(): JsonField<Individual> = individual

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Trustee = apply {
                if (validated) {
                    return@apply
                }

                structure()
                individual().ifPresent { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Trustee].
                 *
                 * The following fields are required:
                 * ```java
                 * .structure()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Trustee]. */
            class Builder internal constructor() {

                private var structure: JsonField<Structure>? = null
                private var individual: JsonField<Individual> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(trustee: Trustee) = apply {
                    structure = trustee.structure
                    individual = trustee.individual
                    additionalProperties = trustee.additionalProperties.toMutableMap()
                }

                /** The structure of the trustee. */
                fun structure(structure: Structure) = structure(JsonField.of(structure))

                /** The structure of the trustee. */
                fun structure(structure: JsonField<Structure>) = apply {
                    this.structure = structure
                }

                /**
                 * Details of the individual trustee. Required when the trustee `structure` is equal
                 * to `individual`.
                 */
                fun individual(individual: Individual) = individual(JsonField.of(individual))

                /**
                 * Details of the individual trustee. Required when the trustee `structure` is equal
                 * to `individual`.
                 */
                fun individual(individual: JsonField<Individual>) = apply {
                    this.individual = individual
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
                        checkRequired("structure", structure),
                        individual,
                        additionalProperties.toImmutable(),
                    )
            }

            /** The structure of the trustee. */
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
                @JsonProperty("confirmed_no_us_tax_id")
                @ExcludeMissing
                private val confirmedNoUsTaxId: JsonField<Boolean> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
                 */
                fun address(): Address = address.getRequired("address")

                /** The person's date of birth in YYYY-MM-DD format. */
                fun dateOfBirth(): LocalDate = dateOfBirth.getRequired("date_of_birth")

                /** A means of verifying the person's identity. */
                fun identification(): Identification = identification.getRequired("identification")

                /** The person's legal name. */
                fun name(): String = name.getRequired("name")

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                fun confirmedNoUsTaxId(): Optional<Boolean> =
                    Optional.ofNullable(confirmedNoUsTaxId.getNullable("confirmed_no_us_tax_id"))

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
                 */
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

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                @JsonProperty("confirmed_no_us_tax_id")
                @ExcludeMissing
                fun _confirmedNoUsTaxId(): JsonField<Boolean> = confirmedNoUsTaxId

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
                    confirmedNoUsTaxId()
                    validated = true
                }

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
                    private var confirmedNoUsTaxId: JsonField<Boolean> = JsonMissing.of()
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
                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * The individual's physical address. Mail receiving locations like PO Boxes and
                     * PMB's are disallowed.
                     */
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

                    /**
                     * The identification method for an individual can only be a passport, driver's
                     * license, or other document if you've confirmed the individual does not have a
                     * US tax id (either a Social Security Number or Individual Taxpayer
                     * Identification Number).
                     */
                    fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean) =
                        confirmedNoUsTaxId(JsonField.of(confirmedNoUsTaxId))

                    /**
                     * The identification method for an individual can only be a passport, driver's
                     * license, or other document if you've confirmed the individual does not have a
                     * US tax id (either a Social Security Number or Individual Taxpayer
                     * Identification Number).
                     */
                    fun confirmedNoUsTaxId(confirmedNoUsTaxId: JsonField<Boolean>) = apply {
                        this.confirmedNoUsTaxId = confirmedNoUsTaxId
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

                    fun build(): Individual =
                        Individual(
                            checkRequired("address", address),
                            checkRequired("dateOfBirth", dateOfBirth),
                            checkRequired("identification", identification),
                            checkRequired("name", name),
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
                    @JsonProperty("city")
                    @ExcludeMissing
                    private val city: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line1")
                    @ExcludeMissing
                    private val line1: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("state")
                    @ExcludeMissing
                    private val state: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("zip")
                    @ExcludeMissing
                    private val zip: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line2")
                    @ExcludeMissing
                    private val line2: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The city of the address. */
                    fun city(): String = city.getRequired("city")

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    fun line1(): String = line1.getRequired("line1")

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    fun state(): String = state.getRequired("state")

                    /** The ZIP code of the address. */
                    fun zip(): String = zip.getRequired("zip")

                    /** The second line of the address. This might be the floor or room number. */
                    fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

                    /** The city of the address. */
                    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

                    /** The ZIP code of the address. */
                    @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

                    /** The second line of the address. This might be the floor or room number. */
                    @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
                        state()
                        zip()
                        line2()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Address].
                         *
                         * The following fields are required:
                         * ```java
                         * .city()
                         * .line1()
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
                        private var state: JsonField<String>? = null
                        private var zip: JsonField<String>? = null
                        private var line2: JsonField<String> = JsonMissing.of()
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
                        fun city(city: String) = city(JsonField.of(city))

                        /** The city of the address. */
                        fun city(city: JsonField<String>) = apply { this.city = city }

                        /**
                         * The first line of the address. This is usually the street number and
                         * street.
                         */
                        fun line1(line1: String) = line1(JsonField.of(line1))

                        /**
                         * The first line of the address. This is usually the street number and
                         * street.
                         */
                        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

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

                        /**
                         * The second line of the address. This might be the floor or room number.
                         */
                        fun line2(line2: String) = line2(JsonField.of(line2))

                        /**
                         * The second line of the address. This might be the floor or room number.
                         */
                        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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
                                checkRequired("state", state),
                                checkRequired("zip", zip),
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
                    @JsonProperty("method")
                    @ExcludeMissing
                    private val method: JsonField<Method> = JsonMissing.of(),
                    @JsonProperty("number")
                    @ExcludeMissing
                    private val number: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("drivers_license")
                    @ExcludeMissing
                    private val driversLicense: JsonField<DriversLicense> = JsonMissing.of(),
                    @JsonProperty("other")
                    @ExcludeMissing
                    private val other: JsonField<Other> = JsonMissing.of(),
                    @JsonProperty("passport")
                    @ExcludeMissing
                    private val passport: JsonField<Passport> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** A method that can be used to verify the individual's identity. */
                    fun method(): Method = method.getRequired("method")

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     */
                    fun number(): String = number.getRequired("number")

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    fun driversLicense(): Optional<DriversLicense> =
                        Optional.ofNullable(driversLicense.getNullable("drivers_license"))

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    fun other(): Optional<Other> = Optional.ofNullable(other.getNullable("other"))

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    fun passport(): Optional<Passport> =
                        Optional.ofNullable(passport.getNullable("passport"))

                    /** A method that can be used to verify the individual's identity. */
                    @JsonProperty("method")
                    @ExcludeMissing
                    fun _method(): JsonField<Method> = method

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     */
                    @JsonProperty("number")
                    @ExcludeMissing
                    fun _number(): JsonField<String> = number

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    @JsonProperty("drivers_license")
                    @ExcludeMissing
                    fun _driversLicense(): JsonField<DriversLicense> = driversLicense

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    @JsonProperty("other") @ExcludeMissing fun _other(): JsonField<Other> = other

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    @JsonProperty("passport")
                    @ExcludeMissing
                    fun _passport(): JsonField<Passport> = passport

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Identification = apply {
                        if (validated) {
                            return@apply
                        }

                        method()
                        number()
                        driversLicense().ifPresent { it.validate() }
                        other().ifPresent { it.validate() }
                        passport().ifPresent { it.validate() }
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [Identification].
                         *
                         * The following fields are required:
                         * ```java
                         * .method()
                         * .number()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Identification]. */
                    class Builder internal constructor() {

                        private var method: JsonField<Method>? = null
                        private var number: JsonField<String>? = null
                        private var driversLicense: JsonField<DriversLicense> = JsonMissing.of()
                        private var other: JsonField<Other> = JsonMissing.of()
                        private var passport: JsonField<Passport> = JsonMissing.of()
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
                        fun method(method: Method) = method(JsonField.of(method))

                        /** A method that can be used to verify the individual's identity. */
                        fun method(method: JsonField<Method>) = apply { this.method = method }

                        /**
                         * An identification number that can be used to verify the individual's
                         * identity, such as a social security number.
                         */
                        fun number(number: String) = number(JsonField.of(number))

                        /**
                         * An identification number that can be used to verify the individual's
                         * identity, such as a social security number.
                         */
                        fun number(number: JsonField<String>) = apply { this.number = number }

                        /**
                         * Information about the United States driver's license used for
                         * identification. Required if `method` is equal to `drivers_license`.
                         */
                        fun driversLicense(driversLicense: DriversLicense) =
                            driversLicense(JsonField.of(driversLicense))

                        /**
                         * Information about the United States driver's license used for
                         * identification. Required if `method` is equal to `drivers_license`.
                         */
                        fun driversLicense(driversLicense: JsonField<DriversLicense>) = apply {
                            this.driversLicense = driversLicense
                        }

                        /**
                         * Information about the identification document provided. Required if
                         * `method` is equal to `other`.
                         */
                        fun other(other: Other) = other(JsonField.of(other))

                        /**
                         * Information about the identification document provided. Required if
                         * `method` is equal to `other`.
                         */
                        fun other(other: JsonField<Other>) = apply { this.other = other }

                        /**
                         * Information about the passport used for identification. Required if
                         * `method` is equal to `passport`.
                         */
                        fun passport(passport: Passport) = passport(JsonField.of(passport))

                        /**
                         * Information about the passport used for identification. Required if
                         * `method` is equal to `passport`.
                         */
                        fun passport(passport: JsonField<Passport>) = apply {
                            this.passport = passport
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
                                checkRequired("number", number),
                                driversLicense,
                                other,
                                passport,
                                additionalProperties.toImmutable(),
                            )
                    }

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
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        private val expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        private val fileId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("state")
                        @ExcludeMissing
                        private val state: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("back_file_id")
                        @ExcludeMissing
                        private val backFileId: JsonField<String> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        /** The driver's license's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(): LocalDate =
                            expirationDate.getRequired("expiration_date")

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        fun fileId(): String = fileId.getRequired("file_id")

                        /** The state that issued the provided driver's license. */
                        fun state(): String = state.getRequired("state")

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        fun backFileId(): Optional<String> =
                            Optional.ofNullable(backFileId.getNullable("back_file_id"))

                        /** The driver's license's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        fun _expirationDate(): JsonField<LocalDate> = expirationDate

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        fun _fileId(): JsonField<String> = fileId

                        /** The state that issued the provided driver's license. */
                        @JsonProperty("state")
                        @ExcludeMissing
                        fun _state(): JsonField<String> = state

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        @JsonProperty("back_file_id")
                        @ExcludeMissing
                        fun _backFileId(): JsonField<String> = backFileId

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): DriversLicense = apply {
                            if (validated) {
                                return@apply
                            }

                            expirationDate()
                            fileId()
                            state()
                            backFileId()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [DriversLicense].
                             *
                             * The following fields are required:
                             * ```java
                             * .expirationDate()
                             * .fileId()
                             * .state()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [DriversLicense]. */
                        class Builder internal constructor() {

                            private var expirationDate: JsonField<LocalDate>? = null
                            private var fileId: JsonField<String>? = null
                            private var state: JsonField<String>? = null
                            private var backFileId: JsonField<String> = JsonMissing.of()
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
                            fun expirationDate(expirationDate: LocalDate) =
                                expirationDate(JsonField.of(expirationDate))

                            /** The driver's license's expiration date in YYYY-MM-DD format. */
                            fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                                this.expirationDate = expirationDate
                            }

                            /**
                             * The identifier of the File containing the front of the driver's
                             * license.
                             */
                            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                            /**
                             * The identifier of the File containing the front of the driver's
                             * license.
                             */
                            fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                            /** The state that issued the provided driver's license. */
                            fun state(state: String) = state(JsonField.of(state))

                            /** The state that issued the provided driver's license. */
                            fun state(state: JsonField<String>) = apply { this.state = state }

                            /**
                             * The identifier of the File containing the back of the driver's
                             * license.
                             */
                            fun backFileId(backFileId: String) =
                                backFileId(JsonField.of(backFileId))

                            /**
                             * The identifier of the File containing the back of the driver's
                             * license.
                             */
                            fun backFileId(backFileId: JsonField<String>) = apply {
                                this.backFileId = backFileId
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

                            fun build(): DriversLicense =
                                DriversLicense(
                                    checkRequired("expirationDate", expirationDate),
                                    checkRequired("fileId", fileId),
                                    checkRequired("state", state),
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
                        @JsonProperty("country")
                        @ExcludeMissing
                        private val country: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("description")
                        @ExcludeMissing
                        private val description: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        private val fileId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("back_file_id")
                        @ExcludeMissing
                        private val backFileId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        private val expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        /**
                         * The two-character ISO 3166-1 code representing the country that issued
                         * the document.
                         */
                        fun country(): String = country.getRequired("country")

                        /** A description of the document submitted. */
                        fun description(): String = description.getRequired("description")

                        /** The identifier of the File containing the front of the document. */
                        fun fileId(): String = fileId.getRequired("file_id")

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        fun backFileId(): Optional<String> =
                            Optional.ofNullable(backFileId.getNullable("back_file_id"))

                        /** The document's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(): Optional<LocalDate> =
                            Optional.ofNullable(expirationDate.getNullable("expiration_date"))

                        /**
                         * The two-character ISO 3166-1 code representing the country that issued
                         * the document.
                         */
                        @JsonProperty("country")
                        @ExcludeMissing
                        fun _country(): JsonField<String> = country

                        /** A description of the document submitted. */
                        @JsonProperty("description")
                        @ExcludeMissing
                        fun _description(): JsonField<String> = description

                        /** The identifier of the File containing the front of the document. */
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        fun _fileId(): JsonField<String> = fileId

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        @JsonProperty("back_file_id")
                        @ExcludeMissing
                        fun _backFileId(): JsonField<String> = backFileId

                        /** The document's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        fun _expirationDate(): JsonField<LocalDate> = expirationDate

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Other = apply {
                            if (validated) {
                                return@apply
                            }

                            country()
                            description()
                            fileId()
                            backFileId()
                            expirationDate()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of [Other].
                             *
                             * The following fields are required:
                             * ```java
                             * .country()
                             * .description()
                             * .fileId()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Other]. */
                        class Builder internal constructor() {

                            private var country: JsonField<String>? = null
                            private var description: JsonField<String>? = null
                            private var fileId: JsonField<String>? = null
                            private var backFileId: JsonField<String> = JsonMissing.of()
                            private var expirationDate: JsonField<LocalDate> = JsonMissing.of()
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
                            fun country(country: String) = country(JsonField.of(country))

                            /**
                             * The two-character ISO 3166-1 code representing the country that
                             * issued the document.
                             */
                            fun country(country: JsonField<String>) = apply {
                                this.country = country
                            }

                            /** A description of the document submitted. */
                            fun description(description: String) =
                                description(JsonField.of(description))

                            /** A description of the document submitted. */
                            fun description(description: JsonField<String>) = apply {
                                this.description = description
                            }

                            /** The identifier of the File containing the front of the document. */
                            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                            /** The identifier of the File containing the front of the document. */
                            fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                            /**
                             * The identifier of the File containing the back of the document. Not
                             * every document has a reverse side.
                             */
                            fun backFileId(backFileId: String) =
                                backFileId(JsonField.of(backFileId))

                            /**
                             * The identifier of the File containing the back of the document. Not
                             * every document has a reverse side.
                             */
                            fun backFileId(backFileId: JsonField<String>) = apply {
                                this.backFileId = backFileId
                            }

                            /** The document's expiration date in YYYY-MM-DD format. */
                            fun expirationDate(expirationDate: LocalDate) =
                                expirationDate(JsonField.of(expirationDate))

                            /** The document's expiration date in YYYY-MM-DD format. */
                            fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                                this.expirationDate = expirationDate
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

                            fun build(): Other =
                                Other(
                                    checkRequired("country", country),
                                    checkRequired("description", description),
                                    checkRequired("fileId", fileId),
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
                        @JsonProperty("country")
                        @ExcludeMissing
                        private val country: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        private val expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        private val fileId: JsonField<String> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        /** The country that issued the passport. */
                        fun country(): String = country.getRequired("country")

                        /** The passport's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(): LocalDate =
                            expirationDate.getRequired("expiration_date")

                        /** The identifier of the File containing the passport. */
                        fun fileId(): String = fileId.getRequired("file_id")

                        /** The country that issued the passport. */
                        @JsonProperty("country")
                        @ExcludeMissing
                        fun _country(): JsonField<String> = country

                        /** The passport's expiration date in YYYY-MM-DD format. */
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        fun _expirationDate(): JsonField<LocalDate> = expirationDate

                        /** The identifier of the File containing the passport. */
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        fun _fileId(): JsonField<String> = fileId

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Passport = apply {
                            if (validated) {
                                return@apply
                            }

                            country()
                            expirationDate()
                            fileId()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of [Passport].
                             *
                             * The following fields are required:
                             * ```java
                             * .country()
                             * .expirationDate()
                             * .fileId()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Passport]. */
                        class Builder internal constructor() {

                            private var country: JsonField<String>? = null
                            private var expirationDate: JsonField<LocalDate>? = null
                            private var fileId: JsonField<String>? = null
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
                            fun country(country: String) = country(JsonField.of(country))

                            /** The country that issued the passport. */
                            fun country(country: JsonField<String>) = apply {
                                this.country = country
                            }

                            /** The passport's expiration date in YYYY-MM-DD format. */
                            fun expirationDate(expirationDate: LocalDate) =
                                expirationDate(JsonField.of(expirationDate))

                            /** The passport's expiration date in YYYY-MM-DD format. */
                            fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                                this.expirationDate = expirationDate
                            }

                            /** The identifier of the File containing the passport. */
                            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                            /** The identifier of the File containing the passport. */
                            fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

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
                                    checkRequired("country", country),
                                    checkRequired("expirationDate", expirationDate),
                                    checkRequired("fileId", fileId),
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
            @JsonProperty("confirmed_no_us_tax_id")
            @ExcludeMissing
            private val confirmedNoUsTaxId: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and PMB's
             * are disallowed.
             */
            fun address(): Address = address.getRequired("address")

            /** The person's date of birth in YYYY-MM-DD format. */
            fun dateOfBirth(): LocalDate = dateOfBirth.getRequired("date_of_birth")

            /** A means of verifying the person's identity. */
            fun identification(): Identification = identification.getRequired("identification")

            /** The person's legal name. */
            fun name(): String = name.getRequired("name")

            /**
             * The identification method for an individual can only be a passport, driver's license,
             * or other document if you've confirmed the individual does not have a US tax id
             * (either a Social Security Number or Individual Taxpayer Identification Number).
             */
            fun confirmedNoUsTaxId(): Optional<Boolean> =
                Optional.ofNullable(confirmedNoUsTaxId.getNullable("confirmed_no_us_tax_id"))

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and PMB's
             * are disallowed.
             */
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

            /**
             * The identification method for an individual can only be a passport, driver's license,
             * or other document if you've confirmed the individual does not have a US tax id
             * (either a Social Security Number or Individual Taxpayer Identification Number).
             */
            @JsonProperty("confirmed_no_us_tax_id")
            @ExcludeMissing
            fun _confirmedNoUsTaxId(): JsonField<Boolean> = confirmedNoUsTaxId

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
                confirmedNoUsTaxId()
                validated = true
            }

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
                private var confirmedNoUsTaxId: JsonField<Boolean> = JsonMissing.of()
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
                fun address(address: Address) = address(JsonField.of(address))

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
                 */
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

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean) =
                    confirmedNoUsTaxId(JsonField.of(confirmedNoUsTaxId))

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                fun confirmedNoUsTaxId(confirmedNoUsTaxId: JsonField<Boolean>) = apply {
                    this.confirmedNoUsTaxId = confirmedNoUsTaxId
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

                fun build(): Grantor =
                    Grantor(
                        checkRequired("address", address),
                        checkRequired("dateOfBirth", dateOfBirth),
                        checkRequired("identification", identification),
                        checkRequired("name", name),
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
                @JsonProperty("city")
                @ExcludeMissing
                private val city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line1")
                @ExcludeMissing
                private val line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state")
                @ExcludeMissing
                private val state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("zip")
                @ExcludeMissing
                private val zip: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2")
                @ExcludeMissing
                private val line2: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The city of the address. */
                fun city(): String = city.getRequired("city")

                /** The first line of the address. This is usually the street number and street. */
                fun line1(): String = line1.getRequired("line1")

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                fun state(): String = state.getRequired("state")

                /** The ZIP code of the address. */
                fun zip(): String = zip.getRequired("zip")

                /** The second line of the address. This might be the floor or room number. */
                fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

                /** The city of the address. */
                @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

                /** The first line of the address. This is usually the street number and street. */
                @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

                /** The ZIP code of the address. */
                @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

                /** The second line of the address. This might be the floor or room number. */
                @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
                    state()
                    zip()
                    line2()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Address].
                     *
                     * The following fields are required:
                     * ```java
                     * .city()
                     * .line1()
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
                    private var state: JsonField<String>? = null
                    private var zip: JsonField<String>? = null
                    private var line2: JsonField<String> = JsonMissing.of()
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
                    fun city(city: String) = city(JsonField.of(city))

                    /** The city of the address. */
                    fun city(city: JsonField<String>) = apply { this.city = city }

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    fun line1(line1: String) = line1(JsonField.of(line1))

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

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

                    /** The second line of the address. This might be the floor or room number. */
                    fun line2(line2: String) = line2(JsonField.of(line2))

                    /** The second line of the address. This might be the floor or room number. */
                    fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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
                            checkRequired("state", state),
                            checkRequired("zip", zip),
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
                @JsonProperty("method")
                @ExcludeMissing
                private val method: JsonField<Method> = JsonMissing.of(),
                @JsonProperty("number")
                @ExcludeMissing
                private val number: JsonField<String> = JsonMissing.of(),
                @JsonProperty("drivers_license")
                @ExcludeMissing
                private val driversLicense: JsonField<DriversLicense> = JsonMissing.of(),
                @JsonProperty("other")
                @ExcludeMissing
                private val other: JsonField<Other> = JsonMissing.of(),
                @JsonProperty("passport")
                @ExcludeMissing
                private val passport: JsonField<Passport> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** A method that can be used to verify the individual's identity. */
                fun method(): Method = method.getRequired("method")

                /**
                 * An identification number that can be used to verify the individual's identity,
                 * such as a social security number.
                 */
                fun number(): String = number.getRequired("number")

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                fun driversLicense(): Optional<DriversLicense> =
                    Optional.ofNullable(driversLicense.getNullable("drivers_license"))

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                fun other(): Optional<Other> = Optional.ofNullable(other.getNullable("other"))

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                fun passport(): Optional<Passport> =
                    Optional.ofNullable(passport.getNullable("passport"))

                /** A method that can be used to verify the individual's identity. */
                @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

                /**
                 * An identification number that can be used to verify the individual's identity,
                 * such as a social security number.
                 */
                @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<String> = number

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                @JsonProperty("drivers_license")
                @ExcludeMissing
                fun _driversLicense(): JsonField<DriversLicense> = driversLicense

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                @JsonProperty("other") @ExcludeMissing fun _other(): JsonField<Other> = other

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                @JsonProperty("passport")
                @ExcludeMissing
                fun _passport(): JsonField<Passport> = passport

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Identification = apply {
                    if (validated) {
                        return@apply
                    }

                    method()
                    number()
                    driversLicense().ifPresent { it.validate() }
                    other().ifPresent { it.validate() }
                    passport().ifPresent { it.validate() }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Identification].
                     *
                     * The following fields are required:
                     * ```java
                     * .method()
                     * .number()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Identification]. */
                class Builder internal constructor() {

                    private var method: JsonField<Method>? = null
                    private var number: JsonField<String>? = null
                    private var driversLicense: JsonField<DriversLicense> = JsonMissing.of()
                    private var other: JsonField<Other> = JsonMissing.of()
                    private var passport: JsonField<Passport> = JsonMissing.of()
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
                    fun method(method: Method) = method(JsonField.of(method))

                    /** A method that can be used to verify the individual's identity. */
                    fun method(method: JsonField<Method>) = apply { this.method = method }

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     */
                    fun number(number: String) = number(JsonField.of(number))

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     */
                    fun number(number: JsonField<String>) = apply { this.number = number }

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    fun driversLicense(driversLicense: DriversLicense) =
                        driversLicense(JsonField.of(driversLicense))

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    fun driversLicense(driversLicense: JsonField<DriversLicense>) = apply {
                        this.driversLicense = driversLicense
                    }

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    fun other(other: Other) = other(JsonField.of(other))

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    fun other(other: JsonField<Other>) = apply { this.other = other }

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    fun passport(passport: Passport) = passport(JsonField.of(passport))

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    fun passport(passport: JsonField<Passport>) = apply { this.passport = passport }

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
                            checkRequired("number", number),
                            driversLicense,
                            other,
                            passport,
                            additionalProperties.toImmutable(),
                        )
                }

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
                    @JsonProperty("expiration_date")
                    @ExcludeMissing
                    private val expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    private val fileId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("state")
                    @ExcludeMissing
                    private val state: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("back_file_id")
                    @ExcludeMissing
                    private val backFileId: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The driver's license's expiration date in YYYY-MM-DD format. */
                    fun expirationDate(): LocalDate = expirationDate.getRequired("expiration_date")

                    /** The identifier of the File containing the front of the driver's license. */
                    fun fileId(): String = fileId.getRequired("file_id")

                    /** The state that issued the provided driver's license. */
                    fun state(): String = state.getRequired("state")

                    /** The identifier of the File containing the back of the driver's license. */
                    fun backFileId(): Optional<String> =
                        Optional.ofNullable(backFileId.getNullable("back_file_id"))

                    /** The driver's license's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    @ExcludeMissing
                    fun _expirationDate(): JsonField<LocalDate> = expirationDate

                    /** The identifier of the File containing the front of the driver's license. */
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    fun _fileId(): JsonField<String> = fileId

                    /** The state that issued the provided driver's license. */
                    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

                    /** The identifier of the File containing the back of the driver's license. */
                    @JsonProperty("back_file_id")
                    @ExcludeMissing
                    fun _backFileId(): JsonField<String> = backFileId

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): DriversLicense = apply {
                        if (validated) {
                            return@apply
                        }

                        expirationDate()
                        fileId()
                        state()
                        backFileId()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [DriversLicense].
                         *
                         * The following fields are required:
                         * ```java
                         * .expirationDate()
                         * .fileId()
                         * .state()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [DriversLicense]. */
                    class Builder internal constructor() {

                        private var expirationDate: JsonField<LocalDate>? = null
                        private var fileId: JsonField<String>? = null
                        private var state: JsonField<String>? = null
                        private var backFileId: JsonField<String> = JsonMissing.of()
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
                        fun expirationDate(expirationDate: LocalDate) =
                            expirationDate(JsonField.of(expirationDate))

                        /** The driver's license's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                            this.expirationDate = expirationDate
                        }

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                        /** The state that issued the provided driver's license. */
                        fun state(state: String) = state(JsonField.of(state))

                        /** The state that issued the provided driver's license. */
                        fun state(state: JsonField<String>) = apply { this.state = state }

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        fun backFileId(backFileId: String) = backFileId(JsonField.of(backFileId))

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        fun backFileId(backFileId: JsonField<String>) = apply {
                            this.backFileId = backFileId
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

                        fun build(): DriversLicense =
                            DriversLicense(
                                checkRequired("expirationDate", expirationDate),
                                checkRequired("fileId", fileId),
                                checkRequired("state", state),
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
                    @JsonProperty("country")
                    @ExcludeMissing
                    private val country: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    private val description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    private val fileId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("back_file_id")
                    @ExcludeMissing
                    private val backFileId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("expiration_date")
                    @ExcludeMissing
                    private val expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /**
                     * The two-character ISO 3166-1 code representing the country that issued the
                     * document.
                     */
                    fun country(): String = country.getRequired("country")

                    /** A description of the document submitted. */
                    fun description(): String = description.getRequired("description")

                    /** The identifier of the File containing the front of the document. */
                    fun fileId(): String = fileId.getRequired("file_id")

                    /**
                     * The identifier of the File containing the back of the document. Not every
                     * document has a reverse side.
                     */
                    fun backFileId(): Optional<String> =
                        Optional.ofNullable(backFileId.getNullable("back_file_id"))

                    /** The document's expiration date in YYYY-MM-DD format. */
                    fun expirationDate(): Optional<LocalDate> =
                        Optional.ofNullable(expirationDate.getNullable("expiration_date"))

                    /**
                     * The two-character ISO 3166-1 code representing the country that issued the
                     * document.
                     */
                    @JsonProperty("country")
                    @ExcludeMissing
                    fun _country(): JsonField<String> = country

                    /** A description of the document submitted. */
                    @JsonProperty("description")
                    @ExcludeMissing
                    fun _description(): JsonField<String> = description

                    /** The identifier of the File containing the front of the document. */
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    fun _fileId(): JsonField<String> = fileId

                    /**
                     * The identifier of the File containing the back of the document. Not every
                     * document has a reverse side.
                     */
                    @JsonProperty("back_file_id")
                    @ExcludeMissing
                    fun _backFileId(): JsonField<String> = backFileId

                    /** The document's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    @ExcludeMissing
                    fun _expirationDate(): JsonField<LocalDate> = expirationDate

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Other = apply {
                        if (validated) {
                            return@apply
                        }

                        country()
                        description()
                        fileId()
                        backFileId()
                        expirationDate()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Other].
                         *
                         * The following fields are required:
                         * ```java
                         * .country()
                         * .description()
                         * .fileId()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Other]. */
                    class Builder internal constructor() {

                        private var country: JsonField<String>? = null
                        private var description: JsonField<String>? = null
                        private var fileId: JsonField<String>? = null
                        private var backFileId: JsonField<String> = JsonMissing.of()
                        private var expirationDate: JsonField<LocalDate> = JsonMissing.of()
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
                        fun country(country: String) = country(JsonField.of(country))

                        /**
                         * The two-character ISO 3166-1 code representing the country that issued
                         * the document.
                         */
                        fun country(country: JsonField<String>) = apply { this.country = country }

                        /** A description of the document submitted. */
                        fun description(description: String) =
                            description(JsonField.of(description))

                        /** A description of the document submitted. */
                        fun description(description: JsonField<String>) = apply {
                            this.description = description
                        }

                        /** The identifier of the File containing the front of the document. */
                        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                        /** The identifier of the File containing the front of the document. */
                        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        fun backFileId(backFileId: String) = backFileId(JsonField.of(backFileId))

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        fun backFileId(backFileId: JsonField<String>) = apply {
                            this.backFileId = backFileId
                        }

                        /** The document's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(expirationDate: LocalDate) =
                            expirationDate(JsonField.of(expirationDate))

                        /** The document's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                            this.expirationDate = expirationDate
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

                        fun build(): Other =
                            Other(
                                checkRequired("country", country),
                                checkRequired("description", description),
                                checkRequired("fileId", fileId),
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
                    @JsonProperty("country")
                    @ExcludeMissing
                    private val country: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("expiration_date")
                    @ExcludeMissing
                    private val expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    private val fileId: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The country that issued the passport. */
                    fun country(): String = country.getRequired("country")

                    /** The passport's expiration date in YYYY-MM-DD format. */
                    fun expirationDate(): LocalDate = expirationDate.getRequired("expiration_date")

                    /** The identifier of the File containing the passport. */
                    fun fileId(): String = fileId.getRequired("file_id")

                    /** The country that issued the passport. */
                    @JsonProperty("country")
                    @ExcludeMissing
                    fun _country(): JsonField<String> = country

                    /** The passport's expiration date in YYYY-MM-DD format. */
                    @JsonProperty("expiration_date")
                    @ExcludeMissing
                    fun _expirationDate(): JsonField<LocalDate> = expirationDate

                    /** The identifier of the File containing the passport. */
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    fun _fileId(): JsonField<String> = fileId

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Passport = apply {
                        if (validated) {
                            return@apply
                        }

                        country()
                        expirationDate()
                        fileId()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Passport].
                         *
                         * The following fields are required:
                         * ```java
                         * .country()
                         * .expirationDate()
                         * .fileId()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Passport]. */
                    class Builder internal constructor() {

                        private var country: JsonField<String>? = null
                        private var expirationDate: JsonField<LocalDate>? = null
                        private var fileId: JsonField<String>? = null
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
                        fun country(country: String) = country(JsonField.of(country))

                        /** The country that issued the passport. */
                        fun country(country: JsonField<String>) = apply { this.country = country }

                        /** The passport's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(expirationDate: LocalDate) =
                            expirationDate(JsonField.of(expirationDate))

                        /** The passport's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                            this.expirationDate = expirationDate
                        }

                        /** The identifier of the File containing the passport. */
                        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                        /** The identifier of the File containing the passport. */
                        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

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
                                checkRequired("country", country),
                                checkRequired("expirationDate", expirationDate),
                                checkRequired("fileId", fileId),
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
