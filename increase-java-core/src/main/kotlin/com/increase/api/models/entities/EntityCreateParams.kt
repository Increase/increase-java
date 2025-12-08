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
import com.increase.api.core.Params
import com.increase.api.core.checkKnown
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create an Entity */
class EntityCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The type of Entity to create.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun structure(): Structure = body.structure()

    /**
     * Details of the corporation entity to create. Required if `structure` is equal to
     * `corporation`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun corporation(): Optional<Corporation> = body.corporation()

    /**
     * The description you choose to give the entity.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Details of the Government Authority entity to create. Required if `structure` is equal to
     * `government_authority`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun governmentAuthority(): Optional<GovernmentAuthority> = body.governmentAuthority()

    /**
     * Details of the joint entity to create. Required if `structure` is equal to `joint`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun joint(): Optional<Joint> = body.joint()

    /**
     * Details of the natural person entity to create. Required if `structure` is equal to
     * `natural_person`. Natural people entities should be submitted with `social_security_number`
     * or `individual_taxpayer_identification_number` identification methods.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun naturalPerson(): Optional<NaturalPerson> = body.naturalPerson()

    /**
     * An assessment of the entity’s potential risk of involvement in financial crimes, such as
     * money laundering.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun riskRating(): Optional<RiskRating> = body.riskRating()

    /**
     * Additional documentation associated with the entity.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supplementalDocuments(): Optional<List<SupplementalDocument>> = body.supplementalDocuments()

    /**
     * If you are using a third-party service for identity verification, you can use this field to
     * associate this Entity with the identifier that represents them in that service.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun thirdPartyVerification(): Optional<ThirdPartyVerification> = body.thirdPartyVerification()

    /**
     * Details of the trust entity to create. Required if `structure` is equal to `trust`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trust(): Optional<Trust> = body.trust()

    /**
     * Returns the raw JSON value of [structure].
     *
     * Unlike [structure], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _structure(): JsonField<Structure> = body._structure()

    /**
     * Returns the raw JSON value of [corporation].
     *
     * Unlike [corporation], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _corporation(): JsonField<Corporation> = body._corporation()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [governmentAuthority].
     *
     * Unlike [governmentAuthority], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _governmentAuthority(): JsonField<GovernmentAuthority> = body._governmentAuthority()

    /**
     * Returns the raw JSON value of [joint].
     *
     * Unlike [joint], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _joint(): JsonField<Joint> = body._joint()

    /**
     * Returns the raw JSON value of [naturalPerson].
     *
     * Unlike [naturalPerson], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _naturalPerson(): JsonField<NaturalPerson> = body._naturalPerson()

    /**
     * Returns the raw JSON value of [riskRating].
     *
     * Unlike [riskRating], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _riskRating(): JsonField<RiskRating> = body._riskRating()

    /**
     * Returns the raw JSON value of [supplementalDocuments].
     *
     * Unlike [supplementalDocuments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _supplementalDocuments(): JsonField<List<SupplementalDocument>> =
        body._supplementalDocuments()

    /**
     * Returns the raw JSON value of [thirdPartyVerification].
     *
     * Unlike [thirdPartyVerification], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _thirdPartyVerification(): JsonField<ThirdPartyVerification> =
        body._thirdPartyVerification()

    /**
     * Returns the raw JSON value of [trust].
     *
     * Unlike [trust], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _trust(): JsonField<Trust> = body._trust()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

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

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [structure]
         * - [corporation]
         * - [description]
         * - [governmentAuthority]
         * - [joint]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The type of Entity to create. */
        fun structure(structure: Structure) = apply { body.structure(structure) }

        /**
         * Sets [Builder.structure] to an arbitrary JSON value.
         *
         * You should usually call [Builder.structure] with a well-typed [Structure] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun structure(structure: JsonField<Structure>) = apply { body.structure(structure) }

        /**
         * Details of the corporation entity to create. Required if `structure` is equal to
         * `corporation`.
         */
        fun corporation(corporation: Corporation) = apply { body.corporation(corporation) }

        /**
         * Sets [Builder.corporation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.corporation] with a well-typed [Corporation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun corporation(corporation: JsonField<Corporation>) = apply {
            body.corporation(corporation)
        }

        /** The description you choose to give the entity. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * Details of the Government Authority entity to create. Required if `structure` is equal to
         * `government_authority`.
         */
        fun governmentAuthority(governmentAuthority: GovernmentAuthority) = apply {
            body.governmentAuthority(governmentAuthority)
        }

        /**
         * Sets [Builder.governmentAuthority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.governmentAuthority] with a well-typed
         * [GovernmentAuthority] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun governmentAuthority(governmentAuthority: JsonField<GovernmentAuthority>) = apply {
            body.governmentAuthority(governmentAuthority)
        }

        /** Details of the joint entity to create. Required if `structure` is equal to `joint`. */
        fun joint(joint: Joint) = apply { body.joint(joint) }

        /**
         * Sets [Builder.joint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.joint] with a well-typed [Joint] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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
         * Sets [Builder.naturalPerson] to an arbitrary JSON value.
         *
         * You should usually call [Builder.naturalPerson] with a well-typed [NaturalPerson] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun naturalPerson(naturalPerson: JsonField<NaturalPerson>) = apply {
            body.naturalPerson(naturalPerson)
        }

        /**
         * An assessment of the entity’s potential risk of involvement in financial crimes, such as
         * money laundering.
         */
        fun riskRating(riskRating: RiskRating) = apply { body.riskRating(riskRating) }

        /**
         * Sets [Builder.riskRating] to an arbitrary JSON value.
         *
         * You should usually call [Builder.riskRating] with a well-typed [RiskRating] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun riskRating(riskRating: JsonField<RiskRating>) = apply { body.riskRating(riskRating) }

        /** Additional documentation associated with the entity. */
        fun supplementalDocuments(supplementalDocuments: List<SupplementalDocument>) = apply {
            body.supplementalDocuments(supplementalDocuments)
        }

        /**
         * Sets [Builder.supplementalDocuments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supplementalDocuments] with a well-typed
         * `List<SupplementalDocument>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun supplementalDocuments(supplementalDocuments: JsonField<List<SupplementalDocument>>) =
            apply {
                body.supplementalDocuments(supplementalDocuments)
            }

        /**
         * Adds a single [SupplementalDocument] to [supplementalDocuments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSupplementalDocument(supplementalDocument: SupplementalDocument) = apply {
            body.addSupplementalDocument(supplementalDocument)
        }

        /**
         * If you are using a third-party service for identity verification, you can use this field
         * to associate this Entity with the identifier that represents them in that service.
         */
        fun thirdPartyVerification(thirdPartyVerification: ThirdPartyVerification) = apply {
            body.thirdPartyVerification(thirdPartyVerification)
        }

        /**
         * Sets [Builder.thirdPartyVerification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thirdPartyVerification] with a well-typed
         * [ThirdPartyVerification] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun thirdPartyVerification(thirdPartyVerification: JsonField<ThirdPartyVerification>) =
            apply {
                body.thirdPartyVerification(thirdPartyVerification)
            }

        /** Details of the trust entity to create. Required if `structure` is equal to `trust`. */
        fun trust(trust: Trust) = apply { body.trust(trust) }

        /**
         * Sets [Builder.trust] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trust] with a well-typed [Trust] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [EntityCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .structure()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EntityCreateParams =
            EntityCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val structure: JsonField<Structure>,
        private val corporation: JsonField<Corporation>,
        private val description: JsonField<String>,
        private val governmentAuthority: JsonField<GovernmentAuthority>,
        private val joint: JsonField<Joint>,
        private val naturalPerson: JsonField<NaturalPerson>,
        private val riskRating: JsonField<RiskRating>,
        private val supplementalDocuments: JsonField<List<SupplementalDocument>>,
        private val thirdPartyVerification: JsonField<ThirdPartyVerification>,
        private val trust: JsonField<Trust>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("structure")
            @ExcludeMissing
            structure: JsonField<Structure> = JsonMissing.of(),
            @JsonProperty("corporation")
            @ExcludeMissing
            corporation: JsonField<Corporation> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("government_authority")
            @ExcludeMissing
            governmentAuthority: JsonField<GovernmentAuthority> = JsonMissing.of(),
            @JsonProperty("joint") @ExcludeMissing joint: JsonField<Joint> = JsonMissing.of(),
            @JsonProperty("natural_person")
            @ExcludeMissing
            naturalPerson: JsonField<NaturalPerson> = JsonMissing.of(),
            @JsonProperty("risk_rating")
            @ExcludeMissing
            riskRating: JsonField<RiskRating> = JsonMissing.of(),
            @JsonProperty("supplemental_documents")
            @ExcludeMissing
            supplementalDocuments: JsonField<List<SupplementalDocument>> = JsonMissing.of(),
            @JsonProperty("third_party_verification")
            @ExcludeMissing
            thirdPartyVerification: JsonField<ThirdPartyVerification> = JsonMissing.of(),
            @JsonProperty("trust") @ExcludeMissing trust: JsonField<Trust> = JsonMissing.of(),
        ) : this(
            structure,
            corporation,
            description,
            governmentAuthority,
            joint,
            naturalPerson,
            riskRating,
            supplementalDocuments,
            thirdPartyVerification,
            trust,
            mutableMapOf(),
        )

        /**
         * The type of Entity to create.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun structure(): Structure = structure.getRequired("structure")

        /**
         * Details of the corporation entity to create. Required if `structure` is equal to
         * `corporation`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun corporation(): Optional<Corporation> = corporation.getOptional("corporation")

        /**
         * The description you choose to give the entity.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Details of the Government Authority entity to create. Required if `structure` is equal to
         * `government_authority`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun governmentAuthority(): Optional<GovernmentAuthority> =
            governmentAuthority.getOptional("government_authority")

        /**
         * Details of the joint entity to create. Required if `structure` is equal to `joint`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun joint(): Optional<Joint> = joint.getOptional("joint")

        /**
         * Details of the natural person entity to create. Required if `structure` is equal to
         * `natural_person`. Natural people entities should be submitted with
         * `social_security_number` or `individual_taxpayer_identification_number` identification
         * methods.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun naturalPerson(): Optional<NaturalPerson> = naturalPerson.getOptional("natural_person")

        /**
         * An assessment of the entity’s potential risk of involvement in financial crimes, such as
         * money laundering.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun riskRating(): Optional<RiskRating> = riskRating.getOptional("risk_rating")

        /**
         * Additional documentation associated with the entity.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun supplementalDocuments(): Optional<List<SupplementalDocument>> =
            supplementalDocuments.getOptional("supplemental_documents")

        /**
         * If you are using a third-party service for identity verification, you can use this field
         * to associate this Entity with the identifier that represents them in that service.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun thirdPartyVerification(): Optional<ThirdPartyVerification> =
            thirdPartyVerification.getOptional("third_party_verification")

        /**
         * Details of the trust entity to create. Required if `structure` is equal to `trust`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun trust(): Optional<Trust> = trust.getOptional("trust")

        /**
         * Returns the raw JSON value of [structure].
         *
         * Unlike [structure], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("structure")
        @ExcludeMissing
        fun _structure(): JsonField<Structure> = structure

        /**
         * Returns the raw JSON value of [corporation].
         *
         * Unlike [corporation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("corporation")
        @ExcludeMissing
        fun _corporation(): JsonField<Corporation> = corporation

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [governmentAuthority].
         *
         * Unlike [governmentAuthority], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("government_authority")
        @ExcludeMissing
        fun _governmentAuthority(): JsonField<GovernmentAuthority> = governmentAuthority

        /**
         * Returns the raw JSON value of [joint].
         *
         * Unlike [joint], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("joint") @ExcludeMissing fun _joint(): JsonField<Joint> = joint

        /**
         * Returns the raw JSON value of [naturalPerson].
         *
         * Unlike [naturalPerson], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("natural_person")
        @ExcludeMissing
        fun _naturalPerson(): JsonField<NaturalPerson> = naturalPerson

        /**
         * Returns the raw JSON value of [riskRating].
         *
         * Unlike [riskRating], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("risk_rating")
        @ExcludeMissing
        fun _riskRating(): JsonField<RiskRating> = riskRating

        /**
         * Returns the raw JSON value of [supplementalDocuments].
         *
         * Unlike [supplementalDocuments], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("supplemental_documents")
        @ExcludeMissing
        fun _supplementalDocuments(): JsonField<List<SupplementalDocument>> = supplementalDocuments

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
            private var riskRating: JsonField<RiskRating> = JsonMissing.of()
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
                riskRating = body.riskRating
                supplementalDocuments = body.supplementalDocuments.map { it.toMutableList() }
                thirdPartyVerification = body.thirdPartyVerification
                trust = body.trust
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The type of Entity to create. */
            fun structure(structure: Structure) = structure(JsonField.of(structure))

            /**
             * Sets [Builder.structure] to an arbitrary JSON value.
             *
             * You should usually call [Builder.structure] with a well-typed [Structure] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun structure(structure: JsonField<Structure>) = apply { this.structure = structure }

            /**
             * Details of the corporation entity to create. Required if `structure` is equal to
             * `corporation`.
             */
            fun corporation(corporation: Corporation) = corporation(JsonField.of(corporation))

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

            /** The description you choose to give the entity. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Details of the Government Authority entity to create. Required if `structure` is
             * equal to `government_authority`.
             */
            fun governmentAuthority(governmentAuthority: GovernmentAuthority) =
                governmentAuthority(JsonField.of(governmentAuthority))

            /**
             * Sets [Builder.governmentAuthority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.governmentAuthority] with a well-typed
             * [GovernmentAuthority] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun governmentAuthority(governmentAuthority: JsonField<GovernmentAuthority>) = apply {
                this.governmentAuthority = governmentAuthority
            }

            /**
             * Details of the joint entity to create. Required if `structure` is equal to `joint`.
             */
            fun joint(joint: Joint) = joint(JsonField.of(joint))

            /**
             * Sets [Builder.joint] to an arbitrary JSON value.
             *
             * You should usually call [Builder.joint] with a well-typed [Joint] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Sets [Builder.naturalPerson] to an arbitrary JSON value.
             *
             * You should usually call [Builder.naturalPerson] with a well-typed [NaturalPerson]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun naturalPerson(naturalPerson: JsonField<NaturalPerson>) = apply {
                this.naturalPerson = naturalPerson
            }

            /**
             * An assessment of the entity’s potential risk of involvement in financial crimes, such
             * as money laundering.
             */
            fun riskRating(riskRating: RiskRating) = riskRating(JsonField.of(riskRating))

            /**
             * Sets [Builder.riskRating] to an arbitrary JSON value.
             *
             * You should usually call [Builder.riskRating] with a well-typed [RiskRating] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun riskRating(riskRating: JsonField<RiskRating>) = apply {
                this.riskRating = riskRating
            }

            /** Additional documentation associated with the entity. */
            fun supplementalDocuments(supplementalDocuments: List<SupplementalDocument>) =
                supplementalDocuments(JsonField.of(supplementalDocuments))

            /**
             * Sets [Builder.supplementalDocuments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.supplementalDocuments] with a well-typed
             * `List<SupplementalDocument>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun supplementalDocuments(
                supplementalDocuments: JsonField<List<SupplementalDocument>>
            ) = apply {
                this.supplementalDocuments = supplementalDocuments.map { it.toMutableList() }
            }

            /**
             * Adds a single [SupplementalDocument] to [supplementalDocuments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSupplementalDocument(supplementalDocument: SupplementalDocument) = apply {
                supplementalDocuments =
                    (supplementalDocuments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("supplementalDocuments", it).add(supplementalDocument)
                    }
            }

            /**
             * If you are using a third-party service for identity verification, you can use this
             * field to associate this Entity with the identifier that represents them in that
             * service.
             */
            fun thirdPartyVerification(thirdPartyVerification: ThirdPartyVerification) =
                thirdPartyVerification(JsonField.of(thirdPartyVerification))

            /**
             * Sets [Builder.thirdPartyVerification] to an arbitrary JSON value.
             *
             * You should usually call [Builder.thirdPartyVerification] with a well-typed
             * [ThirdPartyVerification] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
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
             * Sets [Builder.trust] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trust] with a well-typed [Trust] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .structure()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("structure", structure),
                    corporation,
                    description,
                    governmentAuthority,
                    joint,
                    naturalPerson,
                    riskRating,
                    (supplementalDocuments ?: JsonMissing.of()).map { it.toImmutable() },
                    thirdPartyVerification,
                    trust,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            structure().validate()
            corporation().ifPresent { it.validate() }
            description()
            governmentAuthority().ifPresent { it.validate() }
            joint().ifPresent { it.validate() }
            naturalPerson().ifPresent { it.validate() }
            riskRating().ifPresent { it.validate() }
            supplementalDocuments().ifPresent { it.forEach { it.validate() } }
            thirdPartyVerification().ifPresent { it.validate() }
            trust().ifPresent { it.validate() }
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
            (structure.asKnown().getOrNull()?.validity() ?: 0) +
                (corporation.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (governmentAuthority.asKnown().getOrNull()?.validity() ?: 0) +
                (joint.asKnown().getOrNull()?.validity() ?: 0) +
                (naturalPerson.asKnown().getOrNull()?.validity() ?: 0) +
                (riskRating.asKnown().getOrNull()?.validity() ?: 0) +
                (supplementalDocuments.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (thirdPartyVerification.asKnown().getOrNull()?.validity() ?: 0) +
                (trust.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                structure == other.structure &&
                corporation == other.corporation &&
                description == other.description &&
                governmentAuthority == other.governmentAuthority &&
                joint == other.joint &&
                naturalPerson == other.naturalPerson &&
                riskRating == other.riskRating &&
                supplementalDocuments == other.supplementalDocuments &&
                thirdPartyVerification == other.thirdPartyVerification &&
                trust == other.trust &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                structure,
                corporation,
                description,
                governmentAuthority,
                joint,
                naturalPerson,
                riskRating,
                supplementalDocuments,
                thirdPartyVerification,
                trust,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{structure=$structure, corporation=$corporation, description=$description, governmentAuthority=$governmentAuthority, joint=$joint, naturalPerson=$naturalPerson, riskRating=$riskRating, supplementalDocuments=$supplementalDocuments, thirdPartyVerification=$thirdPartyVerification, trust=$trust, additionalProperties=$additionalProperties}"
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

            return other is Structure && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Details of the corporation entity to create. Required if `structure` is equal to
     * `corporation`.
     */
    class Corporation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<Address>,
        private val beneficialOwners: JsonField<List<BeneficialOwner>>,
        private val name: JsonField<String>,
        private val taxIdentifier: JsonField<String>,
        private val beneficialOwnershipExemptionReason:
            JsonField<BeneficialOwnershipExemptionReason>,
        private val incorporationState: JsonField<String>,
        private val industryCode: JsonField<String>,
        private val website: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("beneficial_owners")
            @ExcludeMissing
            beneficialOwners: JsonField<List<BeneficialOwner>> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax_identifier")
            @ExcludeMissing
            taxIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("beneficial_ownership_exemption_reason")
            @ExcludeMissing
            beneficialOwnershipExemptionReason: JsonField<BeneficialOwnershipExemptionReason> =
                JsonMissing.of(),
            @JsonProperty("incorporation_state")
            @ExcludeMissing
            incorporationState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("industry_code")
            @ExcludeMissing
            industryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("website") @ExcludeMissing website: JsonField<String> = JsonMissing.of(),
        ) : this(
            address,
            beneficialOwners,
            name,
            taxIdentifier,
            beneficialOwnershipExemptionReason,
            incorporationState,
            industryCode,
            website,
            mutableMapOf(),
        )

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): Address = address.getRequired("address")

        /**
         * The identifying details of each person who owns 25% or more of the business and one
         * control person, like the CEO, CFO, or other executive. You can submit between 1 and 5
         * people to this list.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun beneficialOwners(): List<BeneficialOwner> =
            beneficialOwners.getRequired("beneficial_owners")

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
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun taxIdentifier(): String = taxIdentifier.getRequired("tax_identifier")

        /**
         * If the entity is exempt from the requirement to submit beneficial owners, provide the
         * justification. If a reason is provided, you do not need to submit a list of beneficial
         * owners.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun beneficialOwnershipExemptionReason(): Optional<BeneficialOwnershipExemptionReason> =
            beneficialOwnershipExemptionReason.getOptional("beneficial_ownership_exemption_reason")

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
         * The North American Industry Classification System (NAICS) code for the corporation's
         * primary line of business. This is a number, like `5132` for `Software Publishers`. A full
         * list of classification codes is available
         * [here](https://increase.com/documentation/data-dictionary#north-american-industry-classification-system-codes).
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun industryCode(): Optional<String> = industryCode.getOptional("industry_code")

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
         * Returns the raw JSON value of [beneficialOwnershipExemptionReason].
         *
         * Unlike [beneficialOwnershipExemptionReason], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("beneficial_ownership_exemption_reason")
        @ExcludeMissing
        fun _beneficialOwnershipExemptionReason(): JsonField<BeneficialOwnershipExemptionReason> =
            beneficialOwnershipExemptionReason

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
            private var beneficialOwnershipExemptionReason:
                JsonField<BeneficialOwnershipExemptionReason> =
                JsonMissing.of()
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
                beneficialOwnershipExemptionReason = corporation.beneficialOwnershipExemptionReason
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
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /**
             * The identifying details of each person who owns 25% or more of the business and one
             * control person, like the CEO, CFO, or other executive. You can submit between 1 and 5
             * people to this list.
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
            fun taxIdentifier(taxIdentifier: String) = taxIdentifier(JsonField.of(taxIdentifier))

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

            /**
             * If the entity is exempt from the requirement to submit beneficial owners, provide the
             * justification. If a reason is provided, you do not need to submit a list of
             * beneficial owners.
             */
            fun beneficialOwnershipExemptionReason(
                beneficialOwnershipExemptionReason: BeneficialOwnershipExemptionReason
            ) = beneficialOwnershipExemptionReason(JsonField.of(beneficialOwnershipExemptionReason))

            /**
             * Sets [Builder.beneficialOwnershipExemptionReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficialOwnershipExemptionReason] with a
             * well-typed [BeneficialOwnershipExemptionReason] value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun beneficialOwnershipExemptionReason(
                beneficialOwnershipExemptionReason: JsonField<BeneficialOwnershipExemptionReason>
            ) = apply {
                this.beneficialOwnershipExemptionReason = beneficialOwnershipExemptionReason
            }

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the corporation's
             * state of incorporation.
             */
            fun incorporationState(incorporationState: String) =
                incorporationState(JsonField.of(incorporationState))

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
             * The North American Industry Classification System (NAICS) code for the corporation's
             * primary line of business. This is a number, like `5132` for `Software Publishers`. A
             * full list of classification codes is available
             * [here](https://increase.com/documentation/data-dictionary#north-american-industry-classification-system-codes).
             */
            fun industryCode(industryCode: String) = industryCode(JsonField.of(industryCode))

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

            /** The website of the corporation. */
            fun website(website: String) = website(JsonField.of(website))

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
             * .name()
             * .taxIdentifier()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Corporation =
                Corporation(
                    checkRequired("address", address),
                    checkRequired("beneficialOwners", beneficialOwners).map { it.toImmutable() },
                    checkRequired("name", name),
                    checkRequired("taxIdentifier", taxIdentifier),
                    beneficialOwnershipExemptionReason,
                    incorporationState,
                    industryCode,
                    website,
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
            name()
            taxIdentifier()
            beneficialOwnershipExemptionReason().ifPresent { it.validate() }
            incorporationState()
            industryCode()
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
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (taxIdentifier.asKnown().isPresent) 1 else 0) +
                (beneficialOwnershipExemptionReason.asKnown().getOrNull()?.validity() ?: 0) +
                (if (incorporationState.asKnown().isPresent) 1 else 0) +
                (if (industryCode.asKnown().isPresent) 1 else 0) +
                (if (website.asKnown().isPresent) 1 else 0)

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        class Address
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val city: JsonField<String>,
            private val line1: JsonField<String>,
            private val state: JsonField<String>,
            private val zip: JsonField<String>,
            private val line2: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
            ) : this(city, line1, state, zip, line2, mutableMapOf())

            /**
             * The city of the address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun city(): String = city.getRequired("city")

            /**
             * The first line of the address. This is usually the street number and street.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun line1(): String = line1.getRequired("line1")

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
             * The second line of the address. This might be the floor or room number.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun line2(): Optional<String> = line2.getOptional("line2")

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

            /**
             * Returns the raw JSON value of [line2].
             *
             * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The first line of the address. This is usually the street number and street. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /**
                 * Sets [Builder.line1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line1] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

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

                /** The second line of the address. This might be the floor or room number. */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /**
                 * Sets [Builder.line2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line2] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Address].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .city()
                 * .line1()
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
                        checkRequired("state", state),
                        checkRequired("zip", zip),
                        line2,
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
                state()
                zip()
                line2()
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
                    (if (state.asKnown().isPresent) 1 else 0) +
                    (if (zip.asKnown().isPresent) 1 else 0) +
                    (if (line2.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Address &&
                    city == other.city &&
                    line1 == other.line1 &&
                    state == other.state &&
                    zip == other.zip &&
                    line2 == other.line2 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(city, line1, state, zip, line2, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{city=$city, line1=$line1, state=$state, zip=$zip, line2=$line2, additionalProperties=$additionalProperties}"
        }

        class BeneficialOwner
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val individual: JsonField<Individual>,
            private val prongs: JsonField<List<Prong>>,
            private val companyTitle: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("individual")
                @ExcludeMissing
                individual: JsonField<Individual> = JsonMissing.of(),
                @JsonProperty("prongs")
                @ExcludeMissing
                prongs: JsonField<List<Prong>> = JsonMissing.of(),
                @JsonProperty("company_title")
                @ExcludeMissing
                companyTitle: JsonField<String> = JsonMissing.of(),
            ) : this(individual, prongs, companyTitle, mutableMapOf())

            /**
             * Personal details for the beneficial owner.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun individual(): Individual = individual.getRequired("individual")

            /**
             * Why this person is considered a beneficial owner of the entity. At least one option
             * is required, if a person is both a control person and owner, submit an array
             * containing both.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun prongs(): List<Prong> = prongs.getRequired("prongs")

            /**
             * This person's role or title within the entity.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun companyTitle(): Optional<String> = companyTitle.getOptional("company_title")

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
             * Returns the raw JSON value of [prongs].
             *
             * Unlike [prongs], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("prongs") @ExcludeMissing fun _prongs(): JsonField<List<Prong>> = prongs

            /**
             * Returns the raw JSON value of [companyTitle].
             *
             * Unlike [companyTitle], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("company_title")
            @ExcludeMissing
            fun _companyTitle(): JsonField<String> = companyTitle

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

                /**
                 * Why this person is considered a beneficial owner of the entity. At least one
                 * option is required, if a person is both a control person and owner, submit an
                 * array containing both.
                 */
                fun prongs(prongs: List<Prong>) = prongs(JsonField.of(prongs))

                /**
                 * Sets [Builder.prongs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.prongs] with a well-typed `List<Prong>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                /** This person's role or title within the entity. */
                fun companyTitle(companyTitle: String) = companyTitle(JsonField.of(companyTitle))

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
                 * .individual()
                 * .prongs()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BeneficialOwner =
                    BeneficialOwner(
                        checkRequired("individual", individual),
                        checkRequired("prongs", prongs).map { it.toImmutable() },
                        companyTitle,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): BeneficialOwner = apply {
                if (validated) {
                    return@apply
                }

                individual().validate()
                prongs().forEach { it.validate() }
                companyTitle()
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
                    (prongs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (companyTitle.asKnown().isPresent) 1 else 0)

            /** Personal details for the beneficial owner. */
            class Individual
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val address: JsonField<Address>,
                private val dateOfBirth: JsonField<LocalDate>,
                private val identification: JsonField<Identification>,
                private val name: JsonField<String>,
                private val confirmedNoUsTaxId: JsonField<Boolean>,
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
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("confirmed_no_us_tax_id")
                    @ExcludeMissing
                    confirmedNoUsTaxId: JsonField<Boolean> = JsonMissing.of(),
                ) : this(
                    address,
                    dateOfBirth,
                    identification,
                    name,
                    confirmedNoUsTaxId,
                    mutableMapOf(),
                )

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
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
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun confirmedNoUsTaxId(): Optional<Boolean> =
                    confirmedNoUsTaxId.getOptional("confirmed_no_us_tax_id")

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

                /**
                 * Returns the raw JSON value of [confirmedNoUsTaxId].
                 *
                 * Unlike [confirmedNoUsTaxId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("confirmed_no_us_tax_id")
                @ExcludeMissing
                fun _confirmedNoUsTaxId(): JsonField<Boolean> = confirmedNoUsTaxId

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

                    /**
                     * The identification method for an individual can only be a passport, driver's
                     * license, or other document if you've confirmed the individual does not have a
                     * US tax id (either a Social Security Number or Individual Taxpayer
                     * Identification Number).
                     */
                    fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean) =
                        confirmedNoUsTaxId(JsonField.of(confirmedNoUsTaxId))

                    /**
                     * Sets [Builder.confirmedNoUsTaxId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.confirmedNoUsTaxId] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                            confirmedNoUsTaxId,
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
                    confirmedNoUsTaxId()
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
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (if (confirmedNoUsTaxId.asKnown().isPresent) 1 else 0)

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
                 */
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
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun city(): String = city.getRequired("city")

                    /**
                     * The two-letter ISO 3166-1 alpha-2 code for the country of the address.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun country(): String = country.getRequired("country")

                    /**
                     * The first line of the address. This is usually the street number and street.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun line1(): String = line1.getRequired("line1")

                    /**
                     * The second line of the address. This might be the floor or room number.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun line2(): Optional<String> = line2.getOptional("line2")

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the US
                     * state, province, or region of the address. Required in certain countries.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun state(): Optional<String> = state.getOptional("state")

                    /**
                     * The ZIP or postal code of the address. Required in certain countries.
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
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Address]. */
                    class Builder internal constructor() {

                        private var city: JsonField<String>? = null
                        private var country: JsonField<String>? = null
                        private var line1: JsonField<String>? = null
                        private var line2: JsonField<String> = JsonMissing.of()
                        private var state: JsonField<String> = JsonMissing.of()
                        private var zip: JsonField<String> = JsonMissing.of()
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
                        fun city(city: String) = city(JsonField.of(city))

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

                        /**
                         * The first line of the address. This is usually the street number and
                         * street.
                         */
                        fun line1(line1: String) = line1(JsonField.of(line1))

                        /**
                         * Sets [Builder.line1] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.line1] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                        /**
                         * The second line of the address. This might be the floor or room number.
                         */
                        fun line2(line2: String) = line2(JsonField.of(line2))

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
                         * US state, province, or region of the address. Required in certain
                         * countries.
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

                        /** The ZIP or postal code of the address. Required in certain countries. */
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
                         * .country()
                         * .line1()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Address =
                            Address(
                                checkRequired("city", city),
                                checkRequired("country", country),
                                checkRequired("line1", line1),
                                line2,
                                state,
                                zip,
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
                    private val number: JsonField<String>,
                    private val driversLicense: JsonField<DriversLicense>,
                    private val other: JsonField<Other>,
                    private val passport: JsonField<Passport>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("method")
                        @ExcludeMissing
                        method: JsonField<Method> = JsonMissing.of(),
                        @JsonProperty("number")
                        @ExcludeMissing
                        number: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("drivers_license")
                        @ExcludeMissing
                        driversLicense: JsonField<DriversLicense> = JsonMissing.of(),
                        @JsonProperty("other")
                        @ExcludeMissing
                        other: JsonField<Other> = JsonMissing.of(),
                        @JsonProperty("passport")
                        @ExcludeMissing
                        passport: JsonField<Passport> = JsonMissing.of(),
                    ) : this(method, number, driversLicense, other, passport, mutableMapOf())

                    /**
                     * A method that can be used to verify the individual's identity.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun method(): Method = method.getRequired("method")

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun number(): String = number.getRequired("number")

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun driversLicense(): Optional<DriversLicense> =
                        driversLicense.getOptional("drivers_license")

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun other(): Optional<Other> = other.getOptional("other")

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun passport(): Optional<Passport> = passport.getOptional("passport")

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
                     * Returns the raw JSON value of [number].
                     *
                     * Unlike [number], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("number")
                    @ExcludeMissing
                    fun _number(): JsonField<String> = number

                    /**
                     * Returns the raw JSON value of [driversLicense].
                     *
                     * Unlike [driversLicense], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("drivers_license")
                    @ExcludeMissing
                    fun _driversLicense(): JsonField<DriversLicense> = driversLicense

                    /**
                     * Returns the raw JSON value of [other].
                     *
                     * Unlike [other], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("other") @ExcludeMissing fun _other(): JsonField<Other> = other

                    /**
                     * Returns the raw JSON value of [passport].
                     *
                     * Unlike [passport], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("passport")
                    @ExcludeMissing
                    fun _passport(): JsonField<Passport> = passport

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

                        /**
                         * Sets [Builder.method] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.method] with a well-typed [Method] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun method(method: JsonField<Method>) = apply { this.method = method }

                        /**
                         * An identification number that can be used to verify the individual's
                         * identity, such as a social security number.
                         */
                        fun number(number: String) = number(JsonField.of(number))

                        /**
                         * Sets [Builder.number] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.number] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun number(number: JsonField<String>) = apply { this.number = number }

                        /**
                         * Information about the United States driver's license used for
                         * identification. Required if `method` is equal to `drivers_license`.
                         */
                        fun driversLicense(driversLicense: DriversLicense) =
                            driversLicense(JsonField.of(driversLicense))

                        /**
                         * Sets [Builder.driversLicense] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.driversLicense] with a well-typed
                         * [DriversLicense] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
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
                         * Sets [Builder.other] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.other] with a well-typed [Other] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun other(other: JsonField<Other>) = apply { this.other = other }

                        /**
                         * Information about the passport used for identification. Required if
                         * `method` is equal to `passport`.
                         */
                        fun passport(passport: Passport) = passport(JsonField.of(passport))

                        /**
                         * Sets [Builder.passport] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.passport] with a well-typed [Passport]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
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

                        /**
                         * Returns an immutable instance of [Identification].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .method()
                         * .number()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Identification =
                            Identification(
                                checkRequired("method", method),
                                checkRequired("number", number),
                                driversLicense,
                                other,
                                passport,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Identification = apply {
                        if (validated) {
                            return@apply
                        }

                        method().validate()
                        number()
                        driversLicense().ifPresent { it.validate() }
                        other().ifPresent { it.validate() }
                        passport().ifPresent { it.validate() }
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
                            (if (number.asKnown().isPresent) 1 else 0) +
                            (driversLicense.asKnown().getOrNull()?.validity() ?: 0) +
                            (other.asKnown().getOrNull()?.validity() ?: 0) +
                            (passport.asKnown().getOrNull()?.validity() ?: 0)

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

                            return other is Method && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    class DriversLicense
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val expirationDate: JsonField<LocalDate>,
                        private val fileId: JsonField<String>,
                        private val state: JsonField<String>,
                        private val backFileId: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("expiration_date")
                            @ExcludeMissing
                            expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                            @JsonProperty("file_id")
                            @ExcludeMissing
                            fileId: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("state")
                            @ExcludeMissing
                            state: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("back_file_id")
                            @ExcludeMissing
                            backFileId: JsonField<String> = JsonMissing.of(),
                        ) : this(expirationDate, fileId, state, backFileId, mutableMapOf())

                        /**
                         * The driver's license's expiration date in YYYY-MM-DD format.
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun expirationDate(): LocalDate =
                            expirationDate.getRequired("expiration_date")

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun fileId(): String = fileId.getRequired("file_id")

                        /**
                         * The state that issued the provided driver's license.
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun state(): String = state.getRequired("state")

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun backFileId(): Optional<String> = backFileId.getOptional("back_file_id")

                        /**
                         * Returns the raw JSON value of [expirationDate].
                         *
                         * Unlike [expirationDate], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        fun _expirationDate(): JsonField<LocalDate> = expirationDate

                        /**
                         * Returns the raw JSON value of [fileId].
                         *
                         * Unlike [fileId], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        fun _fileId(): JsonField<String> = fileId

                        /**
                         * Returns the raw JSON value of [state].
                         *
                         * Unlike [state], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("state")
                        @ExcludeMissing
                        fun _state(): JsonField<String> = state

                        /**
                         * Returns the raw JSON value of [backFileId].
                         *
                         * Unlike [backFileId], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("back_file_id")
                        @ExcludeMissing
                        fun _backFileId(): JsonField<String> = backFileId

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

                            /**
                             * Sets [Builder.expirationDate] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.expirationDate] with a well-typed
                             * [LocalDate] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                                this.expirationDate = expirationDate
                            }

                            /**
                             * The identifier of the File containing the front of the driver's
                             * license.
                             */
                            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                            /**
                             * Sets [Builder.fileId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.fileId] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                            /** The state that issued the provided driver's license. */
                            fun state(state: String) = state(JsonField.of(state))

                            /**
                             * Sets [Builder.state] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.state] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun state(state: JsonField<String>) = apply { this.state = state }

                            /**
                             * The identifier of the File containing the back of the driver's
                             * license.
                             */
                            fun backFileId(backFileId: String) =
                                backFileId(JsonField.of(backFileId))

                            /**
                             * Sets [Builder.backFileId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.backFileId] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
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

                            /**
                             * Returns an immutable instance of [DriversLicense].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .expirationDate()
                             * .fileId()
                             * .state()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): DriversLicense =
                                DriversLicense(
                                    checkRequired("expirationDate", expirationDate),
                                    checkRequired("fileId", fileId),
                                    checkRequired("state", state),
                                    backFileId,
                                    additionalProperties.toMutableMap(),
                                )
                        }

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
                        internal fun validity(): Int =
                            (if (expirationDate.asKnown().isPresent) 1 else 0) +
                                (if (fileId.asKnown().isPresent) 1 else 0) +
                                (if (state.asKnown().isPresent) 1 else 0) +
                                (if (backFileId.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is DriversLicense &&
                                expirationDate == other.expirationDate &&
                                fileId == other.fileId &&
                                state == other.state &&
                                backFileId == other.backFileId &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(
                                expirationDate,
                                fileId,
                                state,
                                backFileId,
                                additionalProperties,
                            )
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "DriversLicense{expirationDate=$expirationDate, fileId=$fileId, state=$state, backFileId=$backFileId, additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    class Other
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val country: JsonField<String>,
                        private val description: JsonField<String>,
                        private val fileId: JsonField<String>,
                        private val backFileId: JsonField<String>,
                        private val expirationDate: JsonField<LocalDate>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("country")
                            @ExcludeMissing
                            country: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("description")
                            @ExcludeMissing
                            description: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("file_id")
                            @ExcludeMissing
                            fileId: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("back_file_id")
                            @ExcludeMissing
                            backFileId: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("expiration_date")
                            @ExcludeMissing
                            expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                        ) : this(
                            country,
                            description,
                            fileId,
                            backFileId,
                            expirationDate,
                            mutableMapOf(),
                        )

                        /**
                         * The two-character ISO 3166-1 code representing the country that issued
                         * the document (e.g., `US`).
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun country(): String = country.getRequired("country")

                        /**
                         * A description of the document submitted.
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun description(): String = description.getRequired("description")

                        /**
                         * The identifier of the File containing the front of the document.
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun fileId(): String = fileId.getRequired("file_id")

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun backFileId(): Optional<String> = backFileId.getOptional("back_file_id")

                        /**
                         * The document's expiration date in YYYY-MM-DD format.
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun expirationDate(): Optional<LocalDate> =
                            expirationDate.getOptional("expiration_date")

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
                         * Returns the raw JSON value of [description].
                         *
                         * Unlike [description], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("description")
                        @ExcludeMissing
                        fun _description(): JsonField<String> = description

                        /**
                         * Returns the raw JSON value of [fileId].
                         *
                         * Unlike [fileId], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        fun _fileId(): JsonField<String> = fileId

                        /**
                         * Returns the raw JSON value of [backFileId].
                         *
                         * Unlike [backFileId], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("back_file_id")
                        @ExcludeMissing
                        fun _backFileId(): JsonField<String> = backFileId

                        /**
                         * Returns the raw JSON value of [expirationDate].
                         *
                         * Unlike [expirationDate], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        fun _expirationDate(): JsonField<LocalDate> = expirationDate

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
                             * issued the document (e.g., `US`).
                             */
                            fun country(country: String) = country(JsonField.of(country))

                            /**
                             * Sets [Builder.country] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.country] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun country(country: JsonField<String>) = apply {
                                this.country = country
                            }

                            /** A description of the document submitted. */
                            fun description(description: String) =
                                description(JsonField.of(description))

                            /**
                             * Sets [Builder.description] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.description] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun description(description: JsonField<String>) = apply {
                                this.description = description
                            }

                            /** The identifier of the File containing the front of the document. */
                            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                            /**
                             * Sets [Builder.fileId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.fileId] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                            /**
                             * The identifier of the File containing the back of the document. Not
                             * every document has a reverse side.
                             */
                            fun backFileId(backFileId: String) =
                                backFileId(JsonField.of(backFileId))

                            /**
                             * Sets [Builder.backFileId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.backFileId] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun backFileId(backFileId: JsonField<String>) = apply {
                                this.backFileId = backFileId
                            }

                            /** The document's expiration date in YYYY-MM-DD format. */
                            fun expirationDate(expirationDate: LocalDate) =
                                expirationDate(JsonField.of(expirationDate))

                            /**
                             * Sets [Builder.expirationDate] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.expirationDate] with a well-typed
                             * [LocalDate] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
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

                            /**
                             * Returns an immutable instance of [Other].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .country()
                             * .description()
                             * .fileId()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Other =
                                Other(
                                    checkRequired("country", country),
                                    checkRequired("description", description),
                                    checkRequired("fileId", fileId),
                                    backFileId,
                                    expirationDate,
                                    additionalProperties.toMutableMap(),
                                )
                        }

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
                        internal fun validity(): Int =
                            (if (country.asKnown().isPresent) 1 else 0) +
                                (if (description.asKnown().isPresent) 1 else 0) +
                                (if (fileId.asKnown().isPresent) 1 else 0) +
                                (if (backFileId.asKnown().isPresent) 1 else 0) +
                                (if (expirationDate.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Other &&
                                country == other.country &&
                                description == other.description &&
                                fileId == other.fileId &&
                                backFileId == other.backFileId &&
                                expirationDate == other.expirationDate &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(
                                country,
                                description,
                                fileId,
                                backFileId,
                                expirationDate,
                                additionalProperties,
                            )
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Other{country=$country, description=$description, fileId=$fileId, backFileId=$backFileId, expirationDate=$expirationDate, additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    class Passport
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val country: JsonField<String>,
                        private val expirationDate: JsonField<LocalDate>,
                        private val fileId: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("country")
                            @ExcludeMissing
                            country: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("expiration_date")
                            @ExcludeMissing
                            expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                            @JsonProperty("file_id")
                            @ExcludeMissing
                            fileId: JsonField<String> = JsonMissing.of(),
                        ) : this(country, expirationDate, fileId, mutableMapOf())

                        /**
                         * The two-character ISO 3166-1 code representing the country that issued
                         * the document (e.g., `US`).
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun country(): String = country.getRequired("country")

                        /**
                         * The passport's expiration date in YYYY-MM-DD format.
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun expirationDate(): LocalDate =
                            expirationDate.getRequired("expiration_date")

                        /**
                         * The identifier of the File containing the passport.
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun fileId(): String = fileId.getRequired("file_id")

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
                         * Returns the raw JSON value of [expirationDate].
                         *
                         * Unlike [expirationDate], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        fun _expirationDate(): JsonField<LocalDate> = expirationDate

                        /**
                         * Returns the raw JSON value of [fileId].
                         *
                         * Unlike [fileId], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        fun _fileId(): JsonField<String> = fileId

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

                            /**
                             * The two-character ISO 3166-1 code representing the country that
                             * issued the document (e.g., `US`).
                             */
                            fun country(country: String) = country(JsonField.of(country))

                            /**
                             * Sets [Builder.country] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.country] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun country(country: JsonField<String>) = apply {
                                this.country = country
                            }

                            /** The passport's expiration date in YYYY-MM-DD format. */
                            fun expirationDate(expirationDate: LocalDate) =
                                expirationDate(JsonField.of(expirationDate))

                            /**
                             * Sets [Builder.expirationDate] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.expirationDate] with a well-typed
                             * [LocalDate] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                                this.expirationDate = expirationDate
                            }

                            /** The identifier of the File containing the passport. */
                            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                            /**
                             * Sets [Builder.fileId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.fileId] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
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

                            /**
                             * Returns an immutable instance of [Passport].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .country()
                             * .expirationDate()
                             * .fileId()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Passport =
                                Passport(
                                    checkRequired("country", country),
                                    checkRequired("expirationDate", expirationDate),
                                    checkRequired("fileId", fileId),
                                    additionalProperties.toMutableMap(),
                                )
                        }

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
                        internal fun validity(): Int =
                            (if (country.asKnown().isPresent) 1 else 0) +
                                (if (expirationDate.asKnown().isPresent) 1 else 0) +
                                (if (fileId.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Passport &&
                                country == other.country &&
                                expirationDate == other.expirationDate &&
                                fileId == other.fileId &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(country, expirationDate, fileId, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Passport{country=$country, expirationDate=$expirationDate, fileId=$fileId, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Identification &&
                            method == other.method &&
                            number == other.number &&
                            driversLicense == other.driversLicense &&
                            this.other == other.other &&
                            passport == other.passport &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            method,
                            number,
                            driversLicense,
                            other,
                            passport,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Identification{method=$method, number=$number, driversLicense=$driversLicense, other=$other, passport=$passport, additionalProperties=$additionalProperties}"
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
                        confirmedNoUsTaxId == other.confirmedNoUsTaxId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        address,
                        dateOfBirth,
                        identification,
                        name,
                        confirmedNoUsTaxId,
                        additionalProperties,
                    )
                }

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BeneficialOwner &&
                    individual == other.individual &&
                    prongs == other.prongs &&
                    companyTitle == other.companyTitle &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(individual, prongs, companyTitle, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BeneficialOwner{individual=$individual, prongs=$prongs, companyTitle=$companyTitle, additionalProperties=$additionalProperties}"
        }

        /**
         * If the entity is exempt from the requirement to submit beneficial owners, provide the
         * justification. If a reason is provided, you do not need to submit a list of beneficial
         * owners.
         */
        class BeneficialOwnershipExemptionReason
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                /** A regulated financial institution. */
                @JvmField
                val REGULATED_FINANCIAL_INSTITUTION = of("regulated_financial_institution")

                /** A publicly traded company. */
                @JvmField val PUBLICLY_TRADED_COMPANY = of("publicly_traded_company")

                /** A public entity acting on behalf of the federal or a state government. */
                @JvmField val PUBLIC_ENTITY = of("public_entity")

                /**
                 * Any other reason why this entity is exempt from the requirement to submit
                 * beneficial owners. You can only use this exemption after approval from your bank
                 * partner.
                 */
                @JvmField val OTHER = of("other")

                @JvmStatic
                fun of(value: String) = BeneficialOwnershipExemptionReason(JsonField.of(value))
            }

            /** An enum containing [BeneficialOwnershipExemptionReason]'s known values. */
            enum class Known {
                /** A regulated financial institution. */
                REGULATED_FINANCIAL_INSTITUTION,
                /** A publicly traded company. */
                PUBLICLY_TRADED_COMPANY,
                /** A public entity acting on behalf of the federal or a state government. */
                PUBLIC_ENTITY,
                /**
                 * Any other reason why this entity is exempt from the requirement to submit
                 * beneficial owners. You can only use this exemption after approval from your bank
                 * partner.
                 */
                OTHER,
            }

            /**
             * An enum containing [BeneficialOwnershipExemptionReason]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [BeneficialOwnershipExemptionReason] can contain an unknown value in a
             * couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** A regulated financial institution. */
                REGULATED_FINANCIAL_INSTITUTION,
                /** A publicly traded company. */
                PUBLICLY_TRADED_COMPANY,
                /** A public entity acting on behalf of the federal or a state government. */
                PUBLIC_ENTITY,
                /**
                 * Any other reason why this entity is exempt from the requirement to submit
                 * beneficial owners. You can only use this exemption after approval from your bank
                 * partner.
                 */
                OTHER,
                /**
                 * An enum member indicating that [BeneficialOwnershipExemptionReason] was
                 * instantiated with an unknown value.
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
                    REGULATED_FINANCIAL_INSTITUTION -> Value.REGULATED_FINANCIAL_INSTITUTION
                    PUBLICLY_TRADED_COMPANY -> Value.PUBLICLY_TRADED_COMPANY
                    PUBLIC_ENTITY -> Value.PUBLIC_ENTITY
                    OTHER -> Value.OTHER
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
                    REGULATED_FINANCIAL_INSTITUTION -> Known.REGULATED_FINANCIAL_INSTITUTION
                    PUBLICLY_TRADED_COMPANY -> Known.PUBLICLY_TRADED_COMPANY
                    PUBLIC_ENTITY -> Known.PUBLIC_ENTITY
                    OTHER -> Known.OTHER
                    else ->
                        throw IncreaseInvalidDataException(
                            "Unknown BeneficialOwnershipExemptionReason: $value"
                        )
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

            fun validate(): BeneficialOwnershipExemptionReason = apply {
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

                return other is BeneficialOwnershipExemptionReason && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Corporation &&
                address == other.address &&
                beneficialOwners == other.beneficialOwners &&
                name == other.name &&
                taxIdentifier == other.taxIdentifier &&
                beneficialOwnershipExemptionReason == other.beneficialOwnershipExemptionReason &&
                incorporationState == other.incorporationState &&
                industryCode == other.industryCode &&
                website == other.website &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                address,
                beneficialOwners,
                name,
                taxIdentifier,
                beneficialOwnershipExemptionReason,
                incorporationState,
                industryCode,
                website,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Corporation{address=$address, beneficialOwners=$beneficialOwners, name=$name, taxIdentifier=$taxIdentifier, beneficialOwnershipExemptionReason=$beneficialOwnershipExemptionReason, incorporationState=$incorporationState, industryCode=$industryCode, website=$website, additionalProperties=$additionalProperties}"
    }

    /**
     * Details of the Government Authority entity to create. Required if `structure` is equal to
     * `government_authority`.
     */
    class GovernmentAuthority
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): Address = address.getRequired("address")

        /**
         * The identifying details of authorized officials acting on the entity's behalf.
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
         * The legal name of the government authority.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The Employer Identification Number (EIN) for the government authority.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun taxIdentifier(): String = taxIdentifier.getRequired("tax_identifier")

        /**
         * The website of the government authority.
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
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** The identifying details of authorized officials acting on the entity's behalf. */
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

            /** The legal name of the government authority. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The Employer Identification Number (EIN) for the government authority. */
            fun taxIdentifier(taxIdentifier: String) = taxIdentifier(JsonField.of(taxIdentifier))

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

            /** The website of the government authority. */
            fun website(website: String) = website(JsonField.of(website))

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
                    website,
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

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        class Address
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val city: JsonField<String>,
            private val line1: JsonField<String>,
            private val state: JsonField<String>,
            private val zip: JsonField<String>,
            private val line2: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
            ) : this(city, line1, state, zip, line2, mutableMapOf())

            /**
             * The city of the address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun city(): String = city.getRequired("city")

            /**
             * The first line of the address. This is usually the street number and street.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun line1(): String = line1.getRequired("line1")

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
             * The second line of the address. This might be the floor or room number.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun line2(): Optional<String> = line2.getOptional("line2")

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

            /**
             * Returns the raw JSON value of [line2].
             *
             * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The first line of the address. This is usually the street number and street. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /**
                 * Sets [Builder.line1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line1] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

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

                /** The second line of the address. This might be the floor or room number. */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /**
                 * Sets [Builder.line2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line2] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Address].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .city()
                 * .line1()
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
                        checkRequired("state", state),
                        checkRequired("zip", zip),
                        line2,
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
                state()
                zip()
                line2()
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
                    (if (state.asKnown().isPresent) 1 else 0) +
                    (if (zip.asKnown().isPresent) 1 else 0) +
                    (if (line2.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Address &&
                    city == other.city &&
                    line1 == other.line1 &&
                    state == other.state &&
                    zip == other.zip &&
                    line2 == other.line2 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(city, line1, state, zip, line2, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{city=$city, line1=$line1, state=$state, zip=$zip, line2=$line2, additionalProperties=$additionalProperties}"
        }

        class AuthorizedPerson
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of()
            ) : this(name, mutableMapOf())

            /**
             * The person's legal name.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

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
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AuthorizedPerson =
                    AuthorizedPerson(
                        checkRequired("name", name),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AuthorizedPerson = apply {
                if (validated) {
                    return@apply
                }

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
            @JvmSynthetic internal fun validity(): Int = (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AuthorizedPerson &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }

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

                /** A municipality. */
                @JvmField val MUNICIPALITY = of("municipality")

                /** A state agency. */
                @JvmField val STATE_AGENCY = of("state_agency")

                /** A state government. */
                @JvmField val STATE_GOVERNMENT = of("state_government")

                /** A federal agency. */
                @JvmField val FEDERAL_AGENCY = of("federal_agency")

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                /** A municipality. */
                MUNICIPALITY,
                /** A state agency. */
                STATE_AGENCY,
                /** A state government. */
                STATE_GOVERNMENT,
                /** A federal agency. */
                FEDERAL_AGENCY,
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
                /** A municipality. */
                MUNICIPALITY,
                /** A state agency. */
                STATE_AGENCY,
                /** A state government. */
                STATE_GOVERNMENT,
                /** A federal agency. */
                FEDERAL_AGENCY,
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
                    STATE_AGENCY -> Value.STATE_AGENCY
                    STATE_GOVERNMENT -> Value.STATE_GOVERNMENT
                    FEDERAL_AGENCY -> Value.FEDERAL_AGENCY
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
                    STATE_AGENCY -> Known.STATE_AGENCY
                    STATE_GOVERNMENT -> Known.STATE_GOVERNMENT
                    FEDERAL_AGENCY -> Known.FEDERAL_AGENCY
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

                return other is Category && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is GovernmentAuthority &&
                address == other.address &&
                authorizedPersons == other.authorizedPersons &&
                category == other.category &&
                name == other.name &&
                taxIdentifier == other.taxIdentifier &&
                website == other.website &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                address,
                authorizedPersons,
                category,
                name,
                taxIdentifier,
                website,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GovernmentAuthority{address=$address, authorizedPersons=$authorizedPersons, category=$category, name=$name, taxIdentifier=$taxIdentifier, website=$website, additionalProperties=$additionalProperties}"
    }

    /** Details of the joint entity to create. Required if `structure` is equal to `joint`. */
    class Joint
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val individuals: JsonField<List<Individual>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("individuals")
            @ExcludeMissing
            individuals: JsonField<List<Individual>> = JsonMissing.of()
        ) : this(individuals, mutableMapOf())

        /**
         * The two individuals that share control of the entity.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun individuals(): List<Individual> = individuals.getRequired("individuals")

        /**
         * Returns the raw JSON value of [individuals].
         *
         * Unlike [individuals], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("individuals")
        @ExcludeMissing
        fun _individuals(): JsonField<List<Individual>> = individuals

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
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Joint]. */
        class Builder internal constructor() {

            private var individuals: JsonField<MutableList<Individual>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(joint: Joint) = apply {
                individuals = joint.individuals.map { it.toMutableList() }
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
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Joint =
                Joint(
                    checkRequired("individuals", individuals).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Joint = apply {
            if (validated) {
                return@apply
            }

            individuals().forEach { it.validate() }
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
            (individuals.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Individual
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val address: JsonField<Address>,
            private val dateOfBirth: JsonField<LocalDate>,
            private val identification: JsonField<Identification>,
            private val name: JsonField<String>,
            private val confirmedNoUsTaxId: JsonField<Boolean>,
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
                @JsonProperty("confirmed_no_us_tax_id")
                @ExcludeMissing
                confirmedNoUsTaxId: JsonField<Boolean> = JsonMissing.of(),
            ) : this(address, dateOfBirth, identification, name, confirmedNoUsTaxId, mutableMapOf())

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and PMB's
             * are disallowed.
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
             * The identification method for an individual can only be a passport, driver's license,
             * or other document if you've confirmed the individual does not have a US tax id
             * (either a Social Security Number or Individual Taxpayer Identification Number).
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun confirmedNoUsTaxId(): Optional<Boolean> =
                confirmedNoUsTaxId.getOptional("confirmed_no_us_tax_id")

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

            /**
             * Returns the raw JSON value of [confirmedNoUsTaxId].
             *
             * Unlike [confirmedNoUsTaxId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("confirmed_no_us_tax_id")
            @ExcludeMissing
            fun _confirmedNoUsTaxId(): JsonField<Boolean> = confirmedNoUsTaxId

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

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean) =
                    confirmedNoUsTaxId(JsonField.of(confirmedNoUsTaxId))

                /**
                 * Sets [Builder.confirmedNoUsTaxId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.confirmedNoUsTaxId] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                        confirmedNoUsTaxId,
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
                confirmedNoUsTaxId()
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
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (confirmedNoUsTaxId.asKnown().isPresent) 1 else 0)

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and PMB's
             * are disallowed.
             */
            class Address
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val city: JsonField<String>,
                private val line1: JsonField<String>,
                private val state: JsonField<String>,
                private val zip: JsonField<String>,
                private val line2: JsonField<String>,
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
                    @JsonProperty("state")
                    @ExcludeMissing
                    state: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line2")
                    @ExcludeMissing
                    line2: JsonField<String> = JsonMissing.of(),
                ) : this(city, line1, state, zip, line2, mutableMapOf())

                /**
                 * The city of the address.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun city(): String = city.getRequired("city")

                /**
                 * The first line of the address. This is usually the street number and street.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun line1(): String = line1.getRequired("line1")

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
                 * The second line of the address. This might be the floor or room number.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun line2(): Optional<String> = line2.getOptional("line2")

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

                /**
                 * Returns the raw JSON value of [line2].
                 *
                 * Unlike [line2], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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

                    /**
                     * Sets [Builder.city] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.city] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun city(city: JsonField<String>) = apply { this.city = city }

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    fun line1(line1: String) = line1(JsonField.of(line1))

                    /**
                     * Sets [Builder.line1] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.line1] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

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

                    /** The second line of the address. This might be the floor or room number. */
                    fun line2(line2: String) = line2(JsonField.of(line2))

                    /**
                     * Sets [Builder.line2] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.line2] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [Address].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .city()
                     * .line1()
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
                            checkRequired("state", state),
                            checkRequired("zip", zip),
                            line2,
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
                    state()
                    zip()
                    line2()
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
                        (if (state.asKnown().isPresent) 1 else 0) +
                        (if (zip.asKnown().isPresent) 1 else 0) +
                        (if (line2.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Address &&
                        city == other.city &&
                        line1 == other.line1 &&
                        state == other.state &&
                        zip == other.zip &&
                        line2 == other.line2 &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(city, line1, state, zip, line2, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Address{city=$city, line1=$line1, state=$state, zip=$zip, line2=$line2, additionalProperties=$additionalProperties}"
            }

            /** A means of verifying the person's identity. */
            class Identification
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val method: JsonField<Method>,
                private val number: JsonField<String>,
                private val driversLicense: JsonField<DriversLicense>,
                private val other: JsonField<Other>,
                private val passport: JsonField<Passport>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("method")
                    @ExcludeMissing
                    method: JsonField<Method> = JsonMissing.of(),
                    @JsonProperty("number")
                    @ExcludeMissing
                    number: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("drivers_license")
                    @ExcludeMissing
                    driversLicense: JsonField<DriversLicense> = JsonMissing.of(),
                    @JsonProperty("other")
                    @ExcludeMissing
                    other: JsonField<Other> = JsonMissing.of(),
                    @JsonProperty("passport")
                    @ExcludeMissing
                    passport: JsonField<Passport> = JsonMissing.of(),
                ) : this(method, number, driversLicense, other, passport, mutableMapOf())

                /**
                 * A method that can be used to verify the individual's identity.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun method(): Method = method.getRequired("method")

                /**
                 * An identification number that can be used to verify the individual's identity,
                 * such as a social security number.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun number(): String = number.getRequired("number")

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun driversLicense(): Optional<DriversLicense> =
                    driversLicense.getOptional("drivers_license")

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun other(): Optional<Other> = other.getOptional("other")

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun passport(): Optional<Passport> = passport.getOptional("passport")

                /**
                 * Returns the raw JSON value of [method].
                 *
                 * Unlike [method], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

                /**
                 * Returns the raw JSON value of [number].
                 *
                 * Unlike [number], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<String> = number

                /**
                 * Returns the raw JSON value of [driversLicense].
                 *
                 * Unlike [driversLicense], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("drivers_license")
                @ExcludeMissing
                fun _driversLicense(): JsonField<DriversLicense> = driversLicense

                /**
                 * Returns the raw JSON value of [other].
                 *
                 * Unlike [other], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("other") @ExcludeMissing fun _other(): JsonField<Other> = other

                /**
                 * Returns the raw JSON value of [passport].
                 *
                 * Unlike [passport], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("passport")
                @ExcludeMissing
                fun _passport(): JsonField<Passport> = passport

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

                    /**
                     * Sets [Builder.method] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.method] with a well-typed [Method] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun method(method: JsonField<Method>) = apply { this.method = method }

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     */
                    fun number(number: String) = number(JsonField.of(number))

                    /**
                     * Sets [Builder.number] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.number] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun number(number: JsonField<String>) = apply { this.number = number }

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    fun driversLicense(driversLicense: DriversLicense) =
                        driversLicense(JsonField.of(driversLicense))

                    /**
                     * Sets [Builder.driversLicense] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.driversLicense] with a well-typed
                     * [DriversLicense] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
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
                     * Sets [Builder.other] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.other] with a well-typed [Other] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun other(other: JsonField<Other>) = apply { this.other = other }

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    fun passport(passport: Passport) = passport(JsonField.of(passport))

                    /**
                     * Sets [Builder.passport] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.passport] with a well-typed [Passport] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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

                    /**
                     * Returns an immutable instance of [Identification].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .method()
                     * .number()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Identification =
                        Identification(
                            checkRequired("method", method),
                            checkRequired("number", number),
                            driversLicense,
                            other,
                            passport,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Identification = apply {
                    if (validated) {
                        return@apply
                    }

                    method().validate()
                    number()
                    driversLicense().ifPresent { it.validate() }
                    other().ifPresent { it.validate() }
                    passport().ifPresent { it.validate() }
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
                        (if (number.asKnown().isPresent) 1 else 0) +
                        (driversLicense.asKnown().getOrNull()?.validity() ?: 0) +
                        (other.asKnown().getOrNull()?.validity() ?: 0) +
                        (passport.asKnown().getOrNull()?.validity() ?: 0)

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

                        return other is Method && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                class DriversLicense
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val expirationDate: JsonField<LocalDate>,
                    private val fileId: JsonField<String>,
                    private val state: JsonField<String>,
                    private val backFileId: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        fileId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("state")
                        @ExcludeMissing
                        state: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("back_file_id")
                        @ExcludeMissing
                        backFileId: JsonField<String> = JsonMissing.of(),
                    ) : this(expirationDate, fileId, state, backFileId, mutableMapOf())

                    /**
                     * The driver's license's expiration date in YYYY-MM-DD format.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun expirationDate(): LocalDate = expirationDate.getRequired("expiration_date")

                    /**
                     * The identifier of the File containing the front of the driver's license.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun fileId(): String = fileId.getRequired("file_id")

                    /**
                     * The state that issued the provided driver's license.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun state(): String = state.getRequired("state")

                    /**
                     * The identifier of the File containing the back of the driver's license.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun backFileId(): Optional<String> = backFileId.getOptional("back_file_id")

                    /**
                     * Returns the raw JSON value of [expirationDate].
                     *
                     * Unlike [expirationDate], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("expiration_date")
                    @ExcludeMissing
                    fun _expirationDate(): JsonField<LocalDate> = expirationDate

                    /**
                     * Returns the raw JSON value of [fileId].
                     *
                     * Unlike [fileId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    fun _fileId(): JsonField<String> = fileId

                    /**
                     * Returns the raw JSON value of [state].
                     *
                     * Unlike [state], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

                    /**
                     * Returns the raw JSON value of [backFileId].
                     *
                     * Unlike [backFileId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("back_file_id")
                    @ExcludeMissing
                    fun _backFileId(): JsonField<String> = backFileId

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

                        /**
                         * Sets [Builder.expirationDate] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.expirationDate] with a well-typed
                         * [LocalDate] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                            this.expirationDate = expirationDate
                        }

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                        /**
                         * Sets [Builder.fileId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fileId] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                        /** The state that issued the provided driver's license. */
                        fun state(state: String) = state(JsonField.of(state))

                        /**
                         * Sets [Builder.state] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.state] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun state(state: JsonField<String>) = apply { this.state = state }

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        fun backFileId(backFileId: String) = backFileId(JsonField.of(backFileId))

                        /**
                         * Sets [Builder.backFileId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.backFileId] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
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

                        /**
                         * Returns an immutable instance of [DriversLicense].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .expirationDate()
                         * .fileId()
                         * .state()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): DriversLicense =
                            DriversLicense(
                                checkRequired("expirationDate", expirationDate),
                                checkRequired("fileId", fileId),
                                checkRequired("state", state),
                                backFileId,
                                additionalProperties.toMutableMap(),
                            )
                    }

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
                        (if (expirationDate.asKnown().isPresent) 1 else 0) +
                            (if (fileId.asKnown().isPresent) 1 else 0) +
                            (if (state.asKnown().isPresent) 1 else 0) +
                            (if (backFileId.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is DriversLicense &&
                            expirationDate == other.expirationDate &&
                            fileId == other.fileId &&
                            state == other.state &&
                            backFileId == other.backFileId &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            expirationDate,
                            fileId,
                            state,
                            backFileId,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "DriversLicense{expirationDate=$expirationDate, fileId=$fileId, state=$state, backFileId=$backFileId, additionalProperties=$additionalProperties}"
                }

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                class Other
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val country: JsonField<String>,
                    private val description: JsonField<String>,
                    private val fileId: JsonField<String>,
                    private val backFileId: JsonField<String>,
                    private val expirationDate: JsonField<LocalDate>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("country")
                        @ExcludeMissing
                        country: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("description")
                        @ExcludeMissing
                        description: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        fileId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("back_file_id")
                        @ExcludeMissing
                        backFileId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                    ) : this(
                        country,
                        description,
                        fileId,
                        backFileId,
                        expirationDate,
                        mutableMapOf(),
                    )

                    /**
                     * The two-character ISO 3166-1 code representing the country that issued the
                     * document (e.g., `US`).
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun country(): String = country.getRequired("country")

                    /**
                     * A description of the document submitted.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun description(): String = description.getRequired("description")

                    /**
                     * The identifier of the File containing the front of the document.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun fileId(): String = fileId.getRequired("file_id")

                    /**
                     * The identifier of the File containing the back of the document. Not every
                     * document has a reverse side.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun backFileId(): Optional<String> = backFileId.getOptional("back_file_id")

                    /**
                     * The document's expiration date in YYYY-MM-DD format.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun expirationDate(): Optional<LocalDate> =
                        expirationDate.getOptional("expiration_date")

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
                     * Returns the raw JSON value of [description].
                     *
                     * Unlike [description], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("description")
                    @ExcludeMissing
                    fun _description(): JsonField<String> = description

                    /**
                     * Returns the raw JSON value of [fileId].
                     *
                     * Unlike [fileId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    fun _fileId(): JsonField<String> = fileId

                    /**
                     * Returns the raw JSON value of [backFileId].
                     *
                     * Unlike [backFileId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("back_file_id")
                    @ExcludeMissing
                    fun _backFileId(): JsonField<String> = backFileId

                    /**
                     * Returns the raw JSON value of [expirationDate].
                     *
                     * Unlike [expirationDate], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("expiration_date")
                    @ExcludeMissing
                    fun _expirationDate(): JsonField<LocalDate> = expirationDate

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
                         * the document (e.g., `US`).
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

                        /** A description of the document submitted. */
                        fun description(description: String) =
                            description(JsonField.of(description))

                        /**
                         * Sets [Builder.description] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.description] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun description(description: JsonField<String>) = apply {
                            this.description = description
                        }

                        /** The identifier of the File containing the front of the document. */
                        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                        /**
                         * Sets [Builder.fileId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fileId] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        fun backFileId(backFileId: String) = backFileId(JsonField.of(backFileId))

                        /**
                         * Sets [Builder.backFileId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.backFileId] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun backFileId(backFileId: JsonField<String>) = apply {
                            this.backFileId = backFileId
                        }

                        /** The document's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(expirationDate: LocalDate) =
                            expirationDate(JsonField.of(expirationDate))

                        /**
                         * Sets [Builder.expirationDate] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.expirationDate] with a well-typed
                         * [LocalDate] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
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

                        /**
                         * Returns an immutable instance of [Other].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .country()
                         * .description()
                         * .fileId()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Other =
                            Other(
                                checkRequired("country", country),
                                checkRequired("description", description),
                                checkRequired("fileId", fileId),
                                backFileId,
                                expirationDate,
                                additionalProperties.toMutableMap(),
                            )
                    }

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
                        (if (country.asKnown().isPresent) 1 else 0) +
                            (if (description.asKnown().isPresent) 1 else 0) +
                            (if (fileId.asKnown().isPresent) 1 else 0) +
                            (if (backFileId.asKnown().isPresent) 1 else 0) +
                            (if (expirationDate.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Other &&
                            country == other.country &&
                            description == other.description &&
                            fileId == other.fileId &&
                            backFileId == other.backFileId &&
                            expirationDate == other.expirationDate &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            country,
                            description,
                            fileId,
                            backFileId,
                            expirationDate,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Other{country=$country, description=$description, fileId=$fileId, backFileId=$backFileId, expirationDate=$expirationDate, additionalProperties=$additionalProperties}"
                }

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                class Passport
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val country: JsonField<String>,
                    private val expirationDate: JsonField<LocalDate>,
                    private val fileId: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("country")
                        @ExcludeMissing
                        country: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        fileId: JsonField<String> = JsonMissing.of(),
                    ) : this(country, expirationDate, fileId, mutableMapOf())

                    /**
                     * The two-character ISO 3166-1 code representing the country that issued the
                     * passport (e.g., `US`).
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun country(): String = country.getRequired("country")

                    /**
                     * The passport's expiration date in YYYY-MM-DD format.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun expirationDate(): LocalDate = expirationDate.getRequired("expiration_date")

                    /**
                     * The identifier of the File containing the passport.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun fileId(): String = fileId.getRequired("file_id")

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
                     * Returns the raw JSON value of [expirationDate].
                     *
                     * Unlike [expirationDate], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("expiration_date")
                    @ExcludeMissing
                    fun _expirationDate(): JsonField<LocalDate> = expirationDate

                    /**
                     * Returns the raw JSON value of [fileId].
                     *
                     * Unlike [fileId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    fun _fileId(): JsonField<String> = fileId

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

                        /**
                         * The two-character ISO 3166-1 code representing the country that issued
                         * the passport (e.g., `US`).
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

                        /** The passport's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(expirationDate: LocalDate) =
                            expirationDate(JsonField.of(expirationDate))

                        /**
                         * Sets [Builder.expirationDate] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.expirationDate] with a well-typed
                         * [LocalDate] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                            this.expirationDate = expirationDate
                        }

                        /** The identifier of the File containing the passport. */
                        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                        /**
                         * Sets [Builder.fileId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fileId] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
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

                        /**
                         * Returns an immutable instance of [Passport].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .country()
                         * .expirationDate()
                         * .fileId()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Passport =
                            Passport(
                                checkRequired("country", country),
                                checkRequired("expirationDate", expirationDate),
                                checkRequired("fileId", fileId),
                                additionalProperties.toMutableMap(),
                            )
                    }

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
                        (if (country.asKnown().isPresent) 1 else 0) +
                            (if (expirationDate.asKnown().isPresent) 1 else 0) +
                            (if (fileId.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Passport &&
                            country == other.country &&
                            expirationDate == other.expirationDate &&
                            fileId == other.fileId &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(country, expirationDate, fileId, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Passport{country=$country, expirationDate=$expirationDate, fileId=$fileId, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Identification &&
                        method == other.method &&
                        number == other.number &&
                        driversLicense == other.driversLicense &&
                        this.other == other.other &&
                        passport == other.passport &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        method,
                        number,
                        driversLicense,
                        other,
                        passport,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Identification{method=$method, number=$number, driversLicense=$driversLicense, other=$other, passport=$passport, additionalProperties=$additionalProperties}"
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
                    confirmedNoUsTaxId == other.confirmedNoUsTaxId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    address,
                    dateOfBirth,
                    identification,
                    name,
                    confirmedNoUsTaxId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Individual{address=$address, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, confirmedNoUsTaxId=$confirmedNoUsTaxId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Joint &&
                individuals == other.individuals &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(individuals, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Joint{individuals=$individuals, additionalProperties=$additionalProperties}"
    }

    /**
     * Details of the natural person entity to create. Required if `structure` is equal to
     * `natural_person`. Natural people entities should be submitted with `social_security_number`
     * or `individual_taxpayer_identification_number` identification methods.
     */
    class NaturalPerson
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<Address>,
        private val dateOfBirth: JsonField<LocalDate>,
        private val identification: JsonField<Identification>,
        private val name: JsonField<String>,
        private val confirmedNoUsTaxId: JsonField<Boolean>,
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
            @JsonProperty("confirmed_no_us_tax_id")
            @ExcludeMissing
            confirmedNoUsTaxId: JsonField<Boolean> = JsonMissing.of(),
        ) : this(address, dateOfBirth, identification, name, confirmedNoUsTaxId, mutableMapOf())

        /**
         * The individual's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
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
         * The identification method for an individual can only be a passport, driver's license, or
         * other document if you've confirmed the individual does not have a US tax id (either a
         * Social Security Number or Individual Taxpayer Identification Number).
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun confirmedNoUsTaxId(): Optional<Boolean> =
            confirmedNoUsTaxId.getOptional("confirmed_no_us_tax_id")

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

        /**
         * Returns the raw JSON value of [confirmedNoUsTaxId].
         *
         * Unlike [confirmedNoUsTaxId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("confirmed_no_us_tax_id")
        @ExcludeMissing
        fun _confirmedNoUsTaxId(): JsonField<Boolean> = confirmedNoUsTaxId

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

            /**
             * The identification method for an individual can only be a passport, driver's license,
             * or other document if you've confirmed the individual does not have a US tax id
             * (either a Social Security Number or Individual Taxpayer Identification Number).
             */
            fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean) =
                confirmedNoUsTaxId(JsonField.of(confirmedNoUsTaxId))

            /**
             * Sets [Builder.confirmedNoUsTaxId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.confirmedNoUsTaxId] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
                    confirmedNoUsTaxId,
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
            confirmedNoUsTaxId()
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
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (confirmedNoUsTaxId.asKnown().isPresent) 1 else 0)

        /**
         * The individual's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        class Address
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val city: JsonField<String>,
            private val line1: JsonField<String>,
            private val state: JsonField<String>,
            private val zip: JsonField<String>,
            private val line2: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
            ) : this(city, line1, state, zip, line2, mutableMapOf())

            /**
             * The city of the address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun city(): String = city.getRequired("city")

            /**
             * The first line of the address. This is usually the street number and street.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun line1(): String = line1.getRequired("line1")

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
             * The second line of the address. This might be the floor or room number.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun line2(): Optional<String> = line2.getOptional("line2")

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

            /**
             * Returns the raw JSON value of [line2].
             *
             * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The first line of the address. This is usually the street number and street. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /**
                 * Sets [Builder.line1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line1] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

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

                /** The second line of the address. This might be the floor or room number. */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /**
                 * Sets [Builder.line2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line2] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Address].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .city()
                 * .line1()
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
                        checkRequired("state", state),
                        checkRequired("zip", zip),
                        line2,
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
                state()
                zip()
                line2()
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
                    (if (state.asKnown().isPresent) 1 else 0) +
                    (if (zip.asKnown().isPresent) 1 else 0) +
                    (if (line2.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Address &&
                    city == other.city &&
                    line1 == other.line1 &&
                    state == other.state &&
                    zip == other.zip &&
                    line2 == other.line2 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(city, line1, state, zip, line2, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{city=$city, line1=$line1, state=$state, zip=$zip, line2=$line2, additionalProperties=$additionalProperties}"
        }

        /** A means of verifying the person's identity. */
        class Identification
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val method: JsonField<Method>,
            private val number: JsonField<String>,
            private val driversLicense: JsonField<DriversLicense>,
            private val other: JsonField<Other>,
            private val passport: JsonField<Passport>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("method")
                @ExcludeMissing
                method: JsonField<Method> = JsonMissing.of(),
                @JsonProperty("number")
                @ExcludeMissing
                number: JsonField<String> = JsonMissing.of(),
                @JsonProperty("drivers_license")
                @ExcludeMissing
                driversLicense: JsonField<DriversLicense> = JsonMissing.of(),
                @JsonProperty("other") @ExcludeMissing other: JsonField<Other> = JsonMissing.of(),
                @JsonProperty("passport")
                @ExcludeMissing
                passport: JsonField<Passport> = JsonMissing.of(),
            ) : this(method, number, driversLicense, other, passport, mutableMapOf())

            /**
             * A method that can be used to verify the individual's identity.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun method(): Method = method.getRequired("method")

            /**
             * An identification number that can be used to verify the individual's identity, such
             * as a social security number.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun number(): String = number.getRequired("number")

            /**
             * Information about the United States driver's license used for identification.
             * Required if `method` is equal to `drivers_license`.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun driversLicense(): Optional<DriversLicense> =
                driversLicense.getOptional("drivers_license")

            /**
             * Information about the identification document provided. Required if `method` is equal
             * to `other`.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun other(): Optional<Other> = other.getOptional("other")

            /**
             * Information about the passport used for identification. Required if `method` is equal
             * to `passport`.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun passport(): Optional<Passport> = passport.getOptional("passport")

            /**
             * Returns the raw JSON value of [method].
             *
             * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

            /**
             * Returns the raw JSON value of [number].
             *
             * Unlike [number], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<String> = number

            /**
             * Returns the raw JSON value of [driversLicense].
             *
             * Unlike [driversLicense], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("drivers_license")
            @ExcludeMissing
            fun _driversLicense(): JsonField<DriversLicense> = driversLicense

            /**
             * Returns the raw JSON value of [other].
             *
             * Unlike [other], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("other") @ExcludeMissing fun _other(): JsonField<Other> = other

            /**
             * Returns the raw JSON value of [passport].
             *
             * Unlike [passport], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("passport")
            @ExcludeMissing
            fun _passport(): JsonField<Passport> = passport

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

                /**
                 * Sets [Builder.method] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.method] with a well-typed [Method] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun method(method: JsonField<Method>) = apply { this.method = method }

                /**
                 * An identification number that can be used to verify the individual's identity,
                 * such as a social security number.
                 */
                fun number(number: String) = number(JsonField.of(number))

                /**
                 * Sets [Builder.number] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.number] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun number(number: JsonField<String>) = apply { this.number = number }

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                fun driversLicense(driversLicense: DriversLicense) =
                    driversLicense(JsonField.of(driversLicense))

                /**
                 * Sets [Builder.driversLicense] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.driversLicense] with a well-typed
                 * [DriversLicense] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
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
                 * Sets [Builder.other] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.other] with a well-typed [Other] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun other(other: JsonField<Other>) = apply { this.other = other }

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                fun passport(passport: Passport) = passport(JsonField.of(passport))

                /**
                 * Sets [Builder.passport] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.passport] with a well-typed [Passport] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                /**
                 * Returns an immutable instance of [Identification].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .method()
                 * .number()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Identification =
                    Identification(
                        checkRequired("method", method),
                        checkRequired("number", number),
                        driversLicense,
                        other,
                        passport,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Identification = apply {
                if (validated) {
                    return@apply
                }

                method().validate()
                number()
                driversLicense().ifPresent { it.validate() }
                other().ifPresent { it.validate() }
                passport().ifPresent { it.validate() }
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
                    (if (number.asKnown().isPresent) 1 else 0) +
                    (driversLicense.asKnown().getOrNull()?.validity() ?: 0) +
                    (other.asKnown().getOrNull()?.validity() ?: 0) +
                    (passport.asKnown().getOrNull()?.validity() ?: 0)

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

            /**
             * Information about the United States driver's license used for identification.
             * Required if `method` is equal to `drivers_license`.
             */
            class DriversLicense
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val expirationDate: JsonField<LocalDate>,
                private val fileId: JsonField<String>,
                private val state: JsonField<String>,
                private val backFileId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("expiration_date")
                    @ExcludeMissing
                    expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    fileId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("state")
                    @ExcludeMissing
                    state: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("back_file_id")
                    @ExcludeMissing
                    backFileId: JsonField<String> = JsonMissing.of(),
                ) : this(expirationDate, fileId, state, backFileId, mutableMapOf())

                /**
                 * The driver's license's expiration date in YYYY-MM-DD format.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun expirationDate(): LocalDate = expirationDate.getRequired("expiration_date")

                /**
                 * The identifier of the File containing the front of the driver's license.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fileId(): String = fileId.getRequired("file_id")

                /**
                 * The state that issued the provided driver's license.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun state(): String = state.getRequired("state")

                /**
                 * The identifier of the File containing the back of the driver's license.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun backFileId(): Optional<String> = backFileId.getOptional("back_file_id")

                /**
                 * Returns the raw JSON value of [expirationDate].
                 *
                 * Unlike [expirationDate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("expiration_date")
                @ExcludeMissing
                fun _expirationDate(): JsonField<LocalDate> = expirationDate

                /**
                 * Returns the raw JSON value of [fileId].
                 *
                 * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

                /**
                 * Returns the raw JSON value of [state].
                 *
                 * Unlike [state], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

                /**
                 * Returns the raw JSON value of [backFileId].
                 *
                 * Unlike [backFileId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("back_file_id")
                @ExcludeMissing
                fun _backFileId(): JsonField<String> = backFileId

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

                    /**
                     * Sets [Builder.expirationDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.expirationDate] with a well-typed
                     * [LocalDate] value instead. This method is primarily for setting the field to
                     * an undocumented or not yet supported value.
                     */
                    fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                        this.expirationDate = expirationDate
                    }

                    /** The identifier of the File containing the front of the driver's license. */
                    fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                    /**
                     * Sets [Builder.fileId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fileId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                    /** The state that issued the provided driver's license. */
                    fun state(state: String) = state(JsonField.of(state))

                    /**
                     * Sets [Builder.state] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.state] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun state(state: JsonField<String>) = apply { this.state = state }

                    /** The identifier of the File containing the back of the driver's license. */
                    fun backFileId(backFileId: String) = backFileId(JsonField.of(backFileId))

                    /**
                     * Sets [Builder.backFileId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.backFileId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [DriversLicense].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .expirationDate()
                     * .fileId()
                     * .state()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): DriversLicense =
                        DriversLicense(
                            checkRequired("expirationDate", expirationDate),
                            checkRequired("fileId", fileId),
                            checkRequired("state", state),
                            backFileId,
                            additionalProperties.toMutableMap(),
                        )
                }

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
                    (if (expirationDate.asKnown().isPresent) 1 else 0) +
                        (if (fileId.asKnown().isPresent) 1 else 0) +
                        (if (state.asKnown().isPresent) 1 else 0) +
                        (if (backFileId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is DriversLicense &&
                        expirationDate == other.expirationDate &&
                        fileId == other.fileId &&
                        state == other.state &&
                        backFileId == other.backFileId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(expirationDate, fileId, state, backFileId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "DriversLicense{expirationDate=$expirationDate, fileId=$fileId, state=$state, backFileId=$backFileId, additionalProperties=$additionalProperties}"
            }

            /**
             * Information about the identification document provided. Required if `method` is equal
             * to `other`.
             */
            class Other
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val country: JsonField<String>,
                private val description: JsonField<String>,
                private val fileId: JsonField<String>,
                private val backFileId: JsonField<String>,
                private val expirationDate: JsonField<LocalDate>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("country")
                    @ExcludeMissing
                    country: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    fileId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("back_file_id")
                    @ExcludeMissing
                    backFileId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("expiration_date")
                    @ExcludeMissing
                    expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                ) : this(country, description, fileId, backFileId, expirationDate, mutableMapOf())

                /**
                 * The two-character ISO 3166-1 code representing the country that issued the
                 * document (e.g., `US`).
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun country(): String = country.getRequired("country")

                /**
                 * A description of the document submitted.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun description(): String = description.getRequired("description")

                /**
                 * The identifier of the File containing the front of the document.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fileId(): String = fileId.getRequired("file_id")

                /**
                 * The identifier of the File containing the back of the document. Not every
                 * document has a reverse side.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun backFileId(): Optional<String> = backFileId.getOptional("back_file_id")

                /**
                 * The document's expiration date in YYYY-MM-DD format.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun expirationDate(): Optional<LocalDate> =
                    expirationDate.getOptional("expiration_date")

                /**
                 * Returns the raw JSON value of [country].
                 *
                 * Unlike [country], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Returns the raw JSON value of [fileId].
                 *
                 * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

                /**
                 * Returns the raw JSON value of [backFileId].
                 *
                 * Unlike [backFileId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("back_file_id")
                @ExcludeMissing
                fun _backFileId(): JsonField<String> = backFileId

                /**
                 * Returns the raw JSON value of [expirationDate].
                 *
                 * Unlike [expirationDate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("expiration_date")
                @ExcludeMissing
                fun _expirationDate(): JsonField<LocalDate> = expirationDate

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
                     * document (e.g., `US`).
                     */
                    fun country(country: String) = country(JsonField.of(country))

                    /**
                     * Sets [Builder.country] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.country] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun country(country: JsonField<String>) = apply { this.country = country }

                    /** A description of the document submitted. */
                    fun description(description: String) = description(JsonField.of(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /** The identifier of the File containing the front of the document. */
                    fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                    /**
                     * Sets [Builder.fileId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fileId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                    /**
                     * The identifier of the File containing the back of the document. Not every
                     * document has a reverse side.
                     */
                    fun backFileId(backFileId: String) = backFileId(JsonField.of(backFileId))

                    /**
                     * Sets [Builder.backFileId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.backFileId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun backFileId(backFileId: JsonField<String>) = apply {
                        this.backFileId = backFileId
                    }

                    /** The document's expiration date in YYYY-MM-DD format. */
                    fun expirationDate(expirationDate: LocalDate) =
                        expirationDate(JsonField.of(expirationDate))

                    /**
                     * Sets [Builder.expirationDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.expirationDate] with a well-typed
                     * [LocalDate] value instead. This method is primarily for setting the field to
                     * an undocumented or not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [Other].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .country()
                     * .description()
                     * .fileId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Other =
                        Other(
                            checkRequired("country", country),
                            checkRequired("description", description),
                            checkRequired("fileId", fileId),
                            backFileId,
                            expirationDate,
                            additionalProperties.toMutableMap(),
                        )
                }

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
                    (if (country.asKnown().isPresent) 1 else 0) +
                        (if (description.asKnown().isPresent) 1 else 0) +
                        (if (fileId.asKnown().isPresent) 1 else 0) +
                        (if (backFileId.asKnown().isPresent) 1 else 0) +
                        (if (expirationDate.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Other &&
                        country == other.country &&
                        description == other.description &&
                        fileId == other.fileId &&
                        backFileId == other.backFileId &&
                        expirationDate == other.expirationDate &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        country,
                        description,
                        fileId,
                        backFileId,
                        expirationDate,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Other{country=$country, description=$description, fileId=$fileId, backFileId=$backFileId, expirationDate=$expirationDate, additionalProperties=$additionalProperties}"
            }

            /**
             * Information about the passport used for identification. Required if `method` is equal
             * to `passport`.
             */
            class Passport
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val country: JsonField<String>,
                private val expirationDate: JsonField<LocalDate>,
                private val fileId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("country")
                    @ExcludeMissing
                    country: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("expiration_date")
                    @ExcludeMissing
                    expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    fileId: JsonField<String> = JsonMissing.of(),
                ) : this(country, expirationDate, fileId, mutableMapOf())

                /**
                 * The two-character ISO 3166-1 code representing the country that issued the
                 * passport (e.g., `US`).
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun country(): String = country.getRequired("country")

                /**
                 * The passport's expiration date in YYYY-MM-DD format.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun expirationDate(): LocalDate = expirationDate.getRequired("expiration_date")

                /**
                 * The identifier of the File containing the passport.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fileId(): String = fileId.getRequired("file_id")

                /**
                 * Returns the raw JSON value of [country].
                 *
                 * Unlike [country], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

                /**
                 * Returns the raw JSON value of [expirationDate].
                 *
                 * Unlike [expirationDate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("expiration_date")
                @ExcludeMissing
                fun _expirationDate(): JsonField<LocalDate> = expirationDate

                /**
                 * Returns the raw JSON value of [fileId].
                 *
                 * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

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

                    /**
                     * The two-character ISO 3166-1 code representing the country that issued the
                     * passport (e.g., `US`).
                     */
                    fun country(country: String) = country(JsonField.of(country))

                    /**
                     * Sets [Builder.country] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.country] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun country(country: JsonField<String>) = apply { this.country = country }

                    /** The passport's expiration date in YYYY-MM-DD format. */
                    fun expirationDate(expirationDate: LocalDate) =
                        expirationDate(JsonField.of(expirationDate))

                    /**
                     * Sets [Builder.expirationDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.expirationDate] with a well-typed
                     * [LocalDate] value instead. This method is primarily for setting the field to
                     * an undocumented or not yet supported value.
                     */
                    fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                        this.expirationDate = expirationDate
                    }

                    /** The identifier of the File containing the passport. */
                    fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                    /**
                     * Sets [Builder.fileId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fileId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [Passport].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .country()
                     * .expirationDate()
                     * .fileId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Passport =
                        Passport(
                            checkRequired("country", country),
                            checkRequired("expirationDate", expirationDate),
                            checkRequired("fileId", fileId),
                            additionalProperties.toMutableMap(),
                        )
                }

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
                    (if (country.asKnown().isPresent) 1 else 0) +
                        (if (expirationDate.asKnown().isPresent) 1 else 0) +
                        (if (fileId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Passport &&
                        country == other.country &&
                        expirationDate == other.expirationDate &&
                        fileId == other.fileId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(country, expirationDate, fileId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Passport{country=$country, expirationDate=$expirationDate, fileId=$fileId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Identification &&
                    method == other.method &&
                    number == other.number &&
                    driversLicense == other.driversLicense &&
                    this.other == other.other &&
                    passport == other.passport &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(method, number, driversLicense, other, passport, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Identification{method=$method, number=$number, driversLicense=$driversLicense, other=$other, passport=$passport, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is NaturalPerson &&
                address == other.address &&
                dateOfBirth == other.dateOfBirth &&
                identification == other.identification &&
                name == other.name &&
                confirmedNoUsTaxId == other.confirmedNoUsTaxId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                address,
                dateOfBirth,
                identification,
                name,
                confirmedNoUsTaxId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NaturalPerson{address=$address, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, confirmedNoUsTaxId=$confirmedNoUsTaxId, additionalProperties=$additionalProperties}"
    }

    /**
     * An assessment of the entity’s potential risk of involvement in financial crimes, such as
     * money laundering.
     */
    class RiskRating
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val ratedAt: JsonField<OffsetDateTime>,
        private val rating: JsonField<Rating>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("rated_at")
            @ExcludeMissing
            ratedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("rating") @ExcludeMissing rating: JsonField<Rating> = JsonMissing.of(),
        ) : this(ratedAt, rating, mutableMapOf())

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the risk rating was
         * performed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ratedAt(): OffsetDateTime = ratedAt.getRequired("rated_at")

        /**
         * The rating given to this entity.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rating(): Rating = rating.getRequired("rating")

        /**
         * Returns the raw JSON value of [ratedAt].
         *
         * Unlike [ratedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rated_at")
        @ExcludeMissing
        fun _ratedAt(): JsonField<OffsetDateTime> = ratedAt

        /**
         * Returns the raw JSON value of [rating].
         *
         * Unlike [rating], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rating") @ExcludeMissing fun _rating(): JsonField<Rating> = rating

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
             * Returns a mutable builder for constructing an instance of [RiskRating].
             *
             * The following fields are required:
             * ```java
             * .ratedAt()
             * .rating()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RiskRating]. */
        class Builder internal constructor() {

            private var ratedAt: JsonField<OffsetDateTime>? = null
            private var rating: JsonField<Rating>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(riskRating: RiskRating) = apply {
                ratedAt = riskRating.ratedAt
                rating = riskRating.rating
                additionalProperties = riskRating.additionalProperties.toMutableMap()
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the risk rating
             * was performed.
             */
            fun ratedAt(ratedAt: OffsetDateTime) = ratedAt(JsonField.of(ratedAt))

            /**
             * Sets [Builder.ratedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ratedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ratedAt(ratedAt: JsonField<OffsetDateTime>) = apply { this.ratedAt = ratedAt }

            /** The rating given to this entity. */
            fun rating(rating: Rating) = rating(JsonField.of(rating))

            /**
             * Sets [Builder.rating] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rating] with a well-typed [Rating] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rating(rating: JsonField<Rating>) = apply { this.rating = rating }

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
             * Returns an immutable instance of [RiskRating].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .ratedAt()
             * .rating()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RiskRating =
                RiskRating(
                    checkRequired("ratedAt", ratedAt),
                    checkRequired("rating", rating),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RiskRating = apply {
            if (validated) {
                return@apply
            }

            ratedAt()
            rating().validate()
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
            (if (ratedAt.asKnown().isPresent) 1 else 0) +
                (rating.asKnown().getOrNull()?.validity() ?: 0)

        /** The rating given to this entity. */
        class Rating @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                /** Minimal risk of involvement in financial crime. */
                @JvmField val LOW = of("low")

                /** Moderate risk of involvement in financial crime. */
                @JvmField val MEDIUM = of("medium")

                /** Elevated risk of involvement in financial crime. */
                @JvmField val HIGH = of("high")

                @JvmStatic fun of(value: String) = Rating(JsonField.of(value))
            }

            /** An enum containing [Rating]'s known values. */
            enum class Known {
                /** Minimal risk of involvement in financial crime. */
                LOW,
                /** Moderate risk of involvement in financial crime. */
                MEDIUM,
                /** Elevated risk of involvement in financial crime. */
                HIGH,
            }

            /**
             * An enum containing [Rating]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Rating] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Minimal risk of involvement in financial crime. */
                LOW,
                /** Moderate risk of involvement in financial crime. */
                MEDIUM,
                /** Elevated risk of involvement in financial crime. */
                HIGH,
                /**
                 * An enum member indicating that [Rating] was instantiated with an unknown value.
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
                    LOW -> Value.LOW
                    MEDIUM -> Value.MEDIUM
                    HIGH -> Value.HIGH
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
                    LOW -> Known.LOW
                    MEDIUM -> Known.MEDIUM
                    HIGH -> Known.HIGH
                    else -> throw IncreaseInvalidDataException("Unknown Rating: $value")
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

            fun validate(): Rating = apply {
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

                return other is Rating && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RiskRating &&
                ratedAt == other.ratedAt &&
                rating == other.rating &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(ratedAt, rating, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RiskRating{ratedAt=$ratedAt, rating=$rating, additionalProperties=$additionalProperties}"
    }

    class SupplementalDocument
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fileId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of()
        ) : this(fileId, mutableMapOf())

        /**
         * The identifier of the File containing the document.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fileId(): String = fileId.getRequired("file_id")

        /**
         * Returns the raw JSON value of [fileId].
         *
         * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

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

            /**
             * Sets [Builder.fileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [SupplementalDocument].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .fileId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SupplementalDocument =
                SupplementalDocument(
                    checkRequired("fileId", fileId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SupplementalDocument = apply {
            if (validated) {
                return@apply
            }

            fileId()
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
        @JvmSynthetic internal fun validity(): Int = (if (fileId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SupplementalDocument &&
                fileId == other.fileId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(fileId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SupplementalDocument{fileId=$fileId, additionalProperties=$additionalProperties}"
    }

    /**
     * If you are using a third-party service for identity verification, you can use this field to
     * associate this Entity with the identifier that represents them in that service.
     */
    class ThirdPartyVerification
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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

                /** Oscilar. See https://oscilar.com for more information. */
                @JvmField val OSCILAR = of("oscilar")

                /** Persona. See https://withpersona.com for more information. */
                @JvmField val PERSONA = of("persona")

                @JvmStatic fun of(value: String) = Vendor(JsonField.of(value))
            }

            /** An enum containing [Vendor]'s known values. */
            enum class Known {
                /** Alloy. See https://alloy.com for more information. */
                ALLOY,
                /** Middesk. See https://middesk.com for more information. */
                MIDDESK,
                /** Oscilar. See https://oscilar.com for more information. */
                OSCILAR,
                /** Persona. See https://withpersona.com for more information. */
                PERSONA,
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
                /** Oscilar. See https://oscilar.com for more information. */
                OSCILAR,
                /** Persona. See https://withpersona.com for more information. */
                PERSONA,
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
                    OSCILAR -> Value.OSCILAR
                    PERSONA -> Value.PERSONA
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
                    OSCILAR -> Known.OSCILAR
                    PERSONA -> Known.PERSONA
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

                return other is Vendor && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ThirdPartyVerification &&
                reference == other.reference &&
                vendor == other.vendor &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(reference, vendor, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ThirdPartyVerification{reference=$reference, vendor=$vendor, additionalProperties=$additionalProperties}"
    }

    /** Details of the trust entity to create. Required if `structure` is equal to `trust`. */
    class Trust
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<Address>,
        private val category: JsonField<Category>,
        private val name: JsonField<String>,
        private val trustees: JsonField<List<Trustee>>,
        private val formationDocumentFileId: JsonField<String>,
        private val formationState: JsonField<String>,
        private val grantor: JsonField<Grantor>,
        private val taxIdentifier: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("trustees")
            @ExcludeMissing
            trustees: JsonField<List<Trustee>> = JsonMissing.of(),
            @JsonProperty("formation_document_file_id")
            @ExcludeMissing
            formationDocumentFileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("formation_state")
            @ExcludeMissing
            formationState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("grantor") @ExcludeMissing grantor: JsonField<Grantor> = JsonMissing.of(),
            @JsonProperty("tax_identifier")
            @ExcludeMissing
            taxIdentifier: JsonField<String> = JsonMissing.of(),
        ) : this(
            address,
            category,
            name,
            trustees,
            formationDocumentFileId,
            formationState,
            grantor,
            taxIdentifier,
            mutableMapOf(),
        )

        /**
         * The trust's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): Address = address.getRequired("address")

        /**
         * Whether the trust is `revocable` or `irrevocable`. Irrevocable trusts require their own
         * Employer Identification Number. Revocable trusts require information about the individual
         * `grantor` who created the trust.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * The legal name of the trust.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The trustees of the trust.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun trustees(): List<Trustee> = trustees.getRequired("trustees")

        /**
         * The identifier of the File containing the formation document of the trust.
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
         * The grantor of the trust. Required if `category` is equal to `revocable`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun grantor(): Optional<Grantor> = grantor.getOptional("grantor")

        /**
         * The Employer Identification Number (EIN) for the trust. Required if `category` is equal
         * to `irrevocable`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun taxIdentifier(): Optional<String> = taxIdentifier.getOptional("tax_identifier")

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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [trustees].
         *
         * Unlike [trustees], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trustees")
        @ExcludeMissing
        fun _trustees(): JsonField<List<Trustee>> = trustees

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
         * Returns the raw JSON value of [taxIdentifier].
         *
         * Unlike [taxIdentifier], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tax_identifier")
        @ExcludeMissing
        fun _taxIdentifier(): JsonField<String> = taxIdentifier

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
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /**
             * Whether the trust is `revocable` or `irrevocable`. Irrevocable trusts require their
             * own Employer Identification Number. Revocable trusts require information about the
             * individual `grantor` who created the trust.
             */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** The legal name of the trust. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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

            /** The identifier of the File containing the formation document of the trust. */
            fun formationDocumentFileId(formationDocumentFileId: String) =
                formationDocumentFileId(JsonField.of(formationDocumentFileId))

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
            fun formationState(formationState: String) =
                formationState(JsonField.of(formationState))

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

            /** The grantor of the trust. Required if `category` is equal to `revocable`. */
            fun grantor(grantor: Grantor) = grantor(JsonField.of(grantor))

            /**
             * Sets [Builder.grantor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.grantor] with a well-typed [Grantor] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun grantor(grantor: JsonField<Grantor>) = apply { this.grantor = grantor }

            /**
             * The Employer Identification Number (EIN) for the trust. Required if `category` is
             * equal to `irrevocable`.
             */
            fun taxIdentifier(taxIdentifier: String) = taxIdentifier(JsonField.of(taxIdentifier))

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
             * .name()
             * .trustees()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
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
            name()
            trustees().forEach { it.validate() }
            formationDocumentFileId()
            formationState()
            grantor().ifPresent { it.validate() }
            taxIdentifier()
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
                (if (name.asKnown().isPresent) 1 else 0) +
                (trustees.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (formationDocumentFileId.asKnown().isPresent) 1 else 0) +
                (if (formationState.asKnown().isPresent) 1 else 0) +
                (grantor.asKnown().getOrNull()?.validity() ?: 0) +
                (if (taxIdentifier.asKnown().isPresent) 1 else 0)

        /**
         * The trust's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         */
        class Address
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val city: JsonField<String>,
            private val line1: JsonField<String>,
            private val state: JsonField<String>,
            private val zip: JsonField<String>,
            private val line2: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
            ) : this(city, line1, state, zip, line2, mutableMapOf())

            /**
             * The city of the address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun city(): String = city.getRequired("city")

            /**
             * The first line of the address. This is usually the street number and street.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun line1(): String = line1.getRequired("line1")

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
             * The second line of the address. This might be the floor or room number.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun line2(): Optional<String> = line2.getOptional("line2")

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

            /**
             * Returns the raw JSON value of [line2].
             *
             * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The first line of the address. This is usually the street number and street. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /**
                 * Sets [Builder.line1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line1] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

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

                /** The second line of the address. This might be the floor or room number. */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /**
                 * Sets [Builder.line2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line2] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Address].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .city()
                 * .line1()
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
                        checkRequired("state", state),
                        checkRequired("zip", zip),
                        line2,
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
                state()
                zip()
                line2()
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
                    (if (state.asKnown().isPresent) 1 else 0) +
                    (if (zip.asKnown().isPresent) 1 else 0) +
                    (if (line2.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Address &&
                    city == other.city &&
                    line1 == other.line1 &&
                    state == other.state &&
                    zip == other.zip &&
                    line2 == other.line2 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(city, line1, state, zip, line2, additionalProperties)
            }

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

                return other is Category && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Trustee
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val structure: JsonField<Structure>,
            private val individual: JsonField<Individual>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("structure")
                @ExcludeMissing
                structure: JsonField<Structure> = JsonMissing.of(),
                @JsonProperty("individual")
                @ExcludeMissing
                individual: JsonField<Individual> = JsonMissing.of(),
            ) : this(structure, individual, mutableMapOf())

            /**
             * The structure of the trustee.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun structure(): Structure = structure.getRequired("structure")

            /**
             * Details of the individual trustee. Within the trustee object, this is required if
             * `structure` is equal to `individual`.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun individual(): Optional<Individual> = individual.getOptional("individual")

            /**
             * Returns the raw JSON value of [structure].
             *
             * Unlike [structure], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("structure")
            @ExcludeMissing
            fun _structure(): JsonField<Structure> = structure

            /**
             * Returns the raw JSON value of [individual].
             *
             * Unlike [individual], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("individual")
            @ExcludeMissing
            fun _individual(): JsonField<Individual> = individual

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

                /**
                 * Details of the individual trustee. Within the trustee object, this is required if
                 * `structure` is equal to `individual`.
                 */
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
                 * .structure()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Trustee =
                    Trustee(
                        checkRequired("structure", structure),
                        individual,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Trustee = apply {
                if (validated) {
                    return@apply
                }

                structure().validate()
                individual().ifPresent { it.validate() }
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
                (structure.asKnown().getOrNull()?.validity() ?: 0) +
                    (individual.asKnown().getOrNull()?.validity() ?: 0)

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

                    return other is Structure && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Details of the individual trustee. Within the trustee object, this is required if
             * `structure` is equal to `individual`.
             */
            class Individual
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val address: JsonField<Address>,
                private val dateOfBirth: JsonField<LocalDate>,
                private val identification: JsonField<Identification>,
                private val name: JsonField<String>,
                private val confirmedNoUsTaxId: JsonField<Boolean>,
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
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("confirmed_no_us_tax_id")
                    @ExcludeMissing
                    confirmedNoUsTaxId: JsonField<Boolean> = JsonMissing.of(),
                ) : this(
                    address,
                    dateOfBirth,
                    identification,
                    name,
                    confirmedNoUsTaxId,
                    mutableMapOf(),
                )

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
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
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun confirmedNoUsTaxId(): Optional<Boolean> =
                    confirmedNoUsTaxId.getOptional("confirmed_no_us_tax_id")

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

                /**
                 * Returns the raw JSON value of [confirmedNoUsTaxId].
                 *
                 * Unlike [confirmedNoUsTaxId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("confirmed_no_us_tax_id")
                @ExcludeMissing
                fun _confirmedNoUsTaxId(): JsonField<Boolean> = confirmedNoUsTaxId

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

                    /**
                     * The identification method for an individual can only be a passport, driver's
                     * license, or other document if you've confirmed the individual does not have a
                     * US tax id (either a Social Security Number or Individual Taxpayer
                     * Identification Number).
                     */
                    fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean) =
                        confirmedNoUsTaxId(JsonField.of(confirmedNoUsTaxId))

                    /**
                     * Sets [Builder.confirmedNoUsTaxId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.confirmedNoUsTaxId] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                            confirmedNoUsTaxId,
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
                    confirmedNoUsTaxId()
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
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (if (confirmedNoUsTaxId.asKnown().isPresent) 1 else 0)

                /**
                 * The individual's physical address. Mail receiving locations like PO Boxes and
                 * PMB's are disallowed.
                 */
                class Address
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val city: JsonField<String>,
                    private val line1: JsonField<String>,
                    private val state: JsonField<String>,
                    private val zip: JsonField<String>,
                    private val line2: JsonField<String>,
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
                        @JsonProperty("state")
                        @ExcludeMissing
                        state: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("zip")
                        @ExcludeMissing
                        zip: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("line2")
                        @ExcludeMissing
                        line2: JsonField<String> = JsonMissing.of(),
                    ) : this(city, line1, state, zip, line2, mutableMapOf())

                    /**
                     * The city of the address.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun city(): String = city.getRequired("city")

                    /**
                     * The first line of the address. This is usually the street number and street.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun line1(): String = line1.getRequired("line1")

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
                     * The second line of the address. This might be the floor or room number.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun line2(): Optional<String> = line2.getOptional("line2")

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

                    /**
                     * Returns the raw JSON value of [line2].
                     *
                     * Unlike [line2], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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

                        /**
                         * Sets [Builder.city] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.city] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun city(city: JsonField<String>) = apply { this.city = city }

                        /**
                         * The first line of the address. This is usually the street number and
                         * street.
                         */
                        fun line1(line1: String) = line1(JsonField.of(line1))

                        /**
                         * Sets [Builder.line1] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.line1] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

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

                        /**
                         * The second line of the address. This might be the floor or room number.
                         */
                        fun line2(line2: String) = line2(JsonField.of(line2))

                        /**
                         * Sets [Builder.line2] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.line2] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
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

                        /**
                         * Returns an immutable instance of [Address].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .city()
                         * .line1()
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
                                checkRequired("state", state),
                                checkRequired("zip", zip),
                                line2,
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
                        state()
                        zip()
                        line2()
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
                            (if (state.asKnown().isPresent) 1 else 0) +
                            (if (zip.asKnown().isPresent) 1 else 0) +
                            (if (line2.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Address &&
                            city == other.city &&
                            line1 == other.line1 &&
                            state == other.state &&
                            zip == other.zip &&
                            line2 == other.line2 &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(city, line1, state, zip, line2, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Address{city=$city, line1=$line1, state=$state, zip=$zip, line2=$line2, additionalProperties=$additionalProperties}"
                }

                /** A means of verifying the person's identity. */
                class Identification
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val method: JsonField<Method>,
                    private val number: JsonField<String>,
                    private val driversLicense: JsonField<DriversLicense>,
                    private val other: JsonField<Other>,
                    private val passport: JsonField<Passport>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("method")
                        @ExcludeMissing
                        method: JsonField<Method> = JsonMissing.of(),
                        @JsonProperty("number")
                        @ExcludeMissing
                        number: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("drivers_license")
                        @ExcludeMissing
                        driversLicense: JsonField<DriversLicense> = JsonMissing.of(),
                        @JsonProperty("other")
                        @ExcludeMissing
                        other: JsonField<Other> = JsonMissing.of(),
                        @JsonProperty("passport")
                        @ExcludeMissing
                        passport: JsonField<Passport> = JsonMissing.of(),
                    ) : this(method, number, driversLicense, other, passport, mutableMapOf())

                    /**
                     * A method that can be used to verify the individual's identity.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun method(): Method = method.getRequired("method")

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun number(): String = number.getRequired("number")

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun driversLicense(): Optional<DriversLicense> =
                        driversLicense.getOptional("drivers_license")

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun other(): Optional<Other> = other.getOptional("other")

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun passport(): Optional<Passport> = passport.getOptional("passport")

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
                     * Returns the raw JSON value of [number].
                     *
                     * Unlike [number], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("number")
                    @ExcludeMissing
                    fun _number(): JsonField<String> = number

                    /**
                     * Returns the raw JSON value of [driversLicense].
                     *
                     * Unlike [driversLicense], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("drivers_license")
                    @ExcludeMissing
                    fun _driversLicense(): JsonField<DriversLicense> = driversLicense

                    /**
                     * Returns the raw JSON value of [other].
                     *
                     * Unlike [other], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("other") @ExcludeMissing fun _other(): JsonField<Other> = other

                    /**
                     * Returns the raw JSON value of [passport].
                     *
                     * Unlike [passport], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("passport")
                    @ExcludeMissing
                    fun _passport(): JsonField<Passport> = passport

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

                        /**
                         * Sets [Builder.method] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.method] with a well-typed [Method] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun method(method: JsonField<Method>) = apply { this.method = method }

                        /**
                         * An identification number that can be used to verify the individual's
                         * identity, such as a social security number.
                         */
                        fun number(number: String) = number(JsonField.of(number))

                        /**
                         * Sets [Builder.number] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.number] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun number(number: JsonField<String>) = apply { this.number = number }

                        /**
                         * Information about the United States driver's license used for
                         * identification. Required if `method` is equal to `drivers_license`.
                         */
                        fun driversLicense(driversLicense: DriversLicense) =
                            driversLicense(JsonField.of(driversLicense))

                        /**
                         * Sets [Builder.driversLicense] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.driversLicense] with a well-typed
                         * [DriversLicense] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
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
                         * Sets [Builder.other] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.other] with a well-typed [Other] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun other(other: JsonField<Other>) = apply { this.other = other }

                        /**
                         * Information about the passport used for identification. Required if
                         * `method` is equal to `passport`.
                         */
                        fun passport(passport: Passport) = passport(JsonField.of(passport))

                        /**
                         * Sets [Builder.passport] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.passport] with a well-typed [Passport]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
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

                        /**
                         * Returns an immutable instance of [Identification].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .method()
                         * .number()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Identification =
                            Identification(
                                checkRequired("method", method),
                                checkRequired("number", number),
                                driversLicense,
                                other,
                                passport,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Identification = apply {
                        if (validated) {
                            return@apply
                        }

                        method().validate()
                        number()
                        driversLicense().ifPresent { it.validate() }
                        other().ifPresent { it.validate() }
                        passport().ifPresent { it.validate() }
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
                            (if (number.asKnown().isPresent) 1 else 0) +
                            (driversLicense.asKnown().getOrNull()?.validity() ?: 0) +
                            (other.asKnown().getOrNull()?.validity() ?: 0) +
                            (passport.asKnown().getOrNull()?.validity() ?: 0)

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

                            return other is Method && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    class DriversLicense
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val expirationDate: JsonField<LocalDate>,
                        private val fileId: JsonField<String>,
                        private val state: JsonField<String>,
                        private val backFileId: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("expiration_date")
                            @ExcludeMissing
                            expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                            @JsonProperty("file_id")
                            @ExcludeMissing
                            fileId: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("state")
                            @ExcludeMissing
                            state: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("back_file_id")
                            @ExcludeMissing
                            backFileId: JsonField<String> = JsonMissing.of(),
                        ) : this(expirationDate, fileId, state, backFileId, mutableMapOf())

                        /**
                         * The driver's license's expiration date in YYYY-MM-DD format.
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun expirationDate(): LocalDate =
                            expirationDate.getRequired("expiration_date")

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun fileId(): String = fileId.getRequired("file_id")

                        /**
                         * The state that issued the provided driver's license.
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun state(): String = state.getRequired("state")

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun backFileId(): Optional<String> = backFileId.getOptional("back_file_id")

                        /**
                         * Returns the raw JSON value of [expirationDate].
                         *
                         * Unlike [expirationDate], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        fun _expirationDate(): JsonField<LocalDate> = expirationDate

                        /**
                         * Returns the raw JSON value of [fileId].
                         *
                         * Unlike [fileId], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        fun _fileId(): JsonField<String> = fileId

                        /**
                         * Returns the raw JSON value of [state].
                         *
                         * Unlike [state], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("state")
                        @ExcludeMissing
                        fun _state(): JsonField<String> = state

                        /**
                         * Returns the raw JSON value of [backFileId].
                         *
                         * Unlike [backFileId], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("back_file_id")
                        @ExcludeMissing
                        fun _backFileId(): JsonField<String> = backFileId

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

                            /**
                             * Sets [Builder.expirationDate] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.expirationDate] with a well-typed
                             * [LocalDate] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                                this.expirationDate = expirationDate
                            }

                            /**
                             * The identifier of the File containing the front of the driver's
                             * license.
                             */
                            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                            /**
                             * Sets [Builder.fileId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.fileId] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                            /** The state that issued the provided driver's license. */
                            fun state(state: String) = state(JsonField.of(state))

                            /**
                             * Sets [Builder.state] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.state] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun state(state: JsonField<String>) = apply { this.state = state }

                            /**
                             * The identifier of the File containing the back of the driver's
                             * license.
                             */
                            fun backFileId(backFileId: String) =
                                backFileId(JsonField.of(backFileId))

                            /**
                             * Sets [Builder.backFileId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.backFileId] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
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

                            /**
                             * Returns an immutable instance of [DriversLicense].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .expirationDate()
                             * .fileId()
                             * .state()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): DriversLicense =
                                DriversLicense(
                                    checkRequired("expirationDate", expirationDate),
                                    checkRequired("fileId", fileId),
                                    checkRequired("state", state),
                                    backFileId,
                                    additionalProperties.toMutableMap(),
                                )
                        }

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
                        internal fun validity(): Int =
                            (if (expirationDate.asKnown().isPresent) 1 else 0) +
                                (if (fileId.asKnown().isPresent) 1 else 0) +
                                (if (state.asKnown().isPresent) 1 else 0) +
                                (if (backFileId.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is DriversLicense &&
                                expirationDate == other.expirationDate &&
                                fileId == other.fileId &&
                                state == other.state &&
                                backFileId == other.backFileId &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(
                                expirationDate,
                                fileId,
                                state,
                                backFileId,
                                additionalProperties,
                            )
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "DriversLicense{expirationDate=$expirationDate, fileId=$fileId, state=$state, backFileId=$backFileId, additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Information about the identification document provided. Required if `method`
                     * is equal to `other`.
                     */
                    class Other
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val country: JsonField<String>,
                        private val description: JsonField<String>,
                        private val fileId: JsonField<String>,
                        private val backFileId: JsonField<String>,
                        private val expirationDate: JsonField<LocalDate>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("country")
                            @ExcludeMissing
                            country: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("description")
                            @ExcludeMissing
                            description: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("file_id")
                            @ExcludeMissing
                            fileId: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("back_file_id")
                            @ExcludeMissing
                            backFileId: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("expiration_date")
                            @ExcludeMissing
                            expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                        ) : this(
                            country,
                            description,
                            fileId,
                            backFileId,
                            expirationDate,
                            mutableMapOf(),
                        )

                        /**
                         * The two-character ISO 3166-1 code representing the country that issued
                         * the document (e.g., `US`).
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun country(): String = country.getRequired("country")

                        /**
                         * A description of the document submitted.
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun description(): String = description.getRequired("description")

                        /**
                         * The identifier of the File containing the front of the document.
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun fileId(): String = fileId.getRequired("file_id")

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun backFileId(): Optional<String> = backFileId.getOptional("back_file_id")

                        /**
                         * The document's expiration date in YYYY-MM-DD format.
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun expirationDate(): Optional<LocalDate> =
                            expirationDate.getOptional("expiration_date")

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
                         * Returns the raw JSON value of [description].
                         *
                         * Unlike [description], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("description")
                        @ExcludeMissing
                        fun _description(): JsonField<String> = description

                        /**
                         * Returns the raw JSON value of [fileId].
                         *
                         * Unlike [fileId], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        fun _fileId(): JsonField<String> = fileId

                        /**
                         * Returns the raw JSON value of [backFileId].
                         *
                         * Unlike [backFileId], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("back_file_id")
                        @ExcludeMissing
                        fun _backFileId(): JsonField<String> = backFileId

                        /**
                         * Returns the raw JSON value of [expirationDate].
                         *
                         * Unlike [expirationDate], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        fun _expirationDate(): JsonField<LocalDate> = expirationDate

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
                             * issued the document (e.g., `US`).
                             */
                            fun country(country: String) = country(JsonField.of(country))

                            /**
                             * Sets [Builder.country] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.country] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun country(country: JsonField<String>) = apply {
                                this.country = country
                            }

                            /** A description of the document submitted. */
                            fun description(description: String) =
                                description(JsonField.of(description))

                            /**
                             * Sets [Builder.description] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.description] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun description(description: JsonField<String>) = apply {
                                this.description = description
                            }

                            /** The identifier of the File containing the front of the document. */
                            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                            /**
                             * Sets [Builder.fileId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.fileId] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                            /**
                             * The identifier of the File containing the back of the document. Not
                             * every document has a reverse side.
                             */
                            fun backFileId(backFileId: String) =
                                backFileId(JsonField.of(backFileId))

                            /**
                             * Sets [Builder.backFileId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.backFileId] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun backFileId(backFileId: JsonField<String>) = apply {
                                this.backFileId = backFileId
                            }

                            /** The document's expiration date in YYYY-MM-DD format. */
                            fun expirationDate(expirationDate: LocalDate) =
                                expirationDate(JsonField.of(expirationDate))

                            /**
                             * Sets [Builder.expirationDate] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.expirationDate] with a well-typed
                             * [LocalDate] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
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

                            /**
                             * Returns an immutable instance of [Other].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .country()
                             * .description()
                             * .fileId()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Other =
                                Other(
                                    checkRequired("country", country),
                                    checkRequired("description", description),
                                    checkRequired("fileId", fileId),
                                    backFileId,
                                    expirationDate,
                                    additionalProperties.toMutableMap(),
                                )
                        }

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
                        internal fun validity(): Int =
                            (if (country.asKnown().isPresent) 1 else 0) +
                                (if (description.asKnown().isPresent) 1 else 0) +
                                (if (fileId.asKnown().isPresent) 1 else 0) +
                                (if (backFileId.asKnown().isPresent) 1 else 0) +
                                (if (expirationDate.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Other &&
                                country == other.country &&
                                description == other.description &&
                                fileId == other.fileId &&
                                backFileId == other.backFileId &&
                                expirationDate == other.expirationDate &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(
                                country,
                                description,
                                fileId,
                                backFileId,
                                expirationDate,
                                additionalProperties,
                            )
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Other{country=$country, description=$description, fileId=$fileId, backFileId=$backFileId, expirationDate=$expirationDate, additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    class Passport
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val country: JsonField<String>,
                        private val expirationDate: JsonField<LocalDate>,
                        private val fileId: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("country")
                            @ExcludeMissing
                            country: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("expiration_date")
                            @ExcludeMissing
                            expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                            @JsonProperty("file_id")
                            @ExcludeMissing
                            fileId: JsonField<String> = JsonMissing.of(),
                        ) : this(country, expirationDate, fileId, mutableMapOf())

                        /**
                         * The two-character ISO 3166-1 code representing the country that issued
                         * the passport (e.g., `US`).
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun country(): String = country.getRequired("country")

                        /**
                         * The passport's expiration date in YYYY-MM-DD format.
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun expirationDate(): LocalDate =
                            expirationDate.getRequired("expiration_date")

                        /**
                         * The identifier of the File containing the passport.
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun fileId(): String = fileId.getRequired("file_id")

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
                         * Returns the raw JSON value of [expirationDate].
                         *
                         * Unlike [expirationDate], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        fun _expirationDate(): JsonField<LocalDate> = expirationDate

                        /**
                         * Returns the raw JSON value of [fileId].
                         *
                         * Unlike [fileId], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        fun _fileId(): JsonField<String> = fileId

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

                            /**
                             * The two-character ISO 3166-1 code representing the country that
                             * issued the passport (e.g., `US`).
                             */
                            fun country(country: String) = country(JsonField.of(country))

                            /**
                             * Sets [Builder.country] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.country] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun country(country: JsonField<String>) = apply {
                                this.country = country
                            }

                            /** The passport's expiration date in YYYY-MM-DD format. */
                            fun expirationDate(expirationDate: LocalDate) =
                                expirationDate(JsonField.of(expirationDate))

                            /**
                             * Sets [Builder.expirationDate] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.expirationDate] with a well-typed
                             * [LocalDate] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                                this.expirationDate = expirationDate
                            }

                            /** The identifier of the File containing the passport. */
                            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                            /**
                             * Sets [Builder.fileId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.fileId] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
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

                            /**
                             * Returns an immutable instance of [Passport].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .country()
                             * .expirationDate()
                             * .fileId()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Passport =
                                Passport(
                                    checkRequired("country", country),
                                    checkRequired("expirationDate", expirationDate),
                                    checkRequired("fileId", fileId),
                                    additionalProperties.toMutableMap(),
                                )
                        }

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
                        internal fun validity(): Int =
                            (if (country.asKnown().isPresent) 1 else 0) +
                                (if (expirationDate.asKnown().isPresent) 1 else 0) +
                                (if (fileId.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Passport &&
                                country == other.country &&
                                expirationDate == other.expirationDate &&
                                fileId == other.fileId &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(country, expirationDate, fileId, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Passport{country=$country, expirationDate=$expirationDate, fileId=$fileId, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Identification &&
                            method == other.method &&
                            number == other.number &&
                            driversLicense == other.driversLicense &&
                            this.other == other.other &&
                            passport == other.passport &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            method,
                            number,
                            driversLicense,
                            other,
                            passport,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Identification{method=$method, number=$number, driversLicense=$driversLicense, other=$other, passport=$passport, additionalProperties=$additionalProperties}"
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
                        confirmedNoUsTaxId == other.confirmedNoUsTaxId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        address,
                        dateOfBirth,
                        identification,
                        name,
                        confirmedNoUsTaxId,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{address=$address, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, confirmedNoUsTaxId=$confirmedNoUsTaxId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Trustee &&
                    structure == other.structure &&
                    individual == other.individual &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(structure, individual, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Trustee{structure=$structure, individual=$individual, additionalProperties=$additionalProperties}"
        }

        /** The grantor of the trust. Required if `category` is equal to `revocable`. */
        class Grantor
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val address: JsonField<Address>,
            private val dateOfBirth: JsonField<LocalDate>,
            private val identification: JsonField<Identification>,
            private val name: JsonField<String>,
            private val confirmedNoUsTaxId: JsonField<Boolean>,
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
                @JsonProperty("confirmed_no_us_tax_id")
                @ExcludeMissing
                confirmedNoUsTaxId: JsonField<Boolean> = JsonMissing.of(),
            ) : this(address, dateOfBirth, identification, name, confirmedNoUsTaxId, mutableMapOf())

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and PMB's
             * are disallowed.
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
             * The identification method for an individual can only be a passport, driver's license,
             * or other document if you've confirmed the individual does not have a US tax id
             * (either a Social Security Number or Individual Taxpayer Identification Number).
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun confirmedNoUsTaxId(): Optional<Boolean> =
                confirmedNoUsTaxId.getOptional("confirmed_no_us_tax_id")

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

            /**
             * Returns the raw JSON value of [confirmedNoUsTaxId].
             *
             * Unlike [confirmedNoUsTaxId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("confirmed_no_us_tax_id")
            @ExcludeMissing
            fun _confirmedNoUsTaxId(): JsonField<Boolean> = confirmedNoUsTaxId

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

                /**
                 * The identification method for an individual can only be a passport, driver's
                 * license, or other document if you've confirmed the individual does not have a US
                 * tax id (either a Social Security Number or Individual Taxpayer Identification
                 * Number).
                 */
                fun confirmedNoUsTaxId(confirmedNoUsTaxId: Boolean) =
                    confirmedNoUsTaxId(JsonField.of(confirmedNoUsTaxId))

                /**
                 * Sets [Builder.confirmedNoUsTaxId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.confirmedNoUsTaxId] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                        confirmedNoUsTaxId,
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
                confirmedNoUsTaxId()
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
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (confirmedNoUsTaxId.asKnown().isPresent) 1 else 0)

            /**
             * The individual's physical address. Mail receiving locations like PO Boxes and PMB's
             * are disallowed.
             */
            class Address
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val city: JsonField<String>,
                private val line1: JsonField<String>,
                private val state: JsonField<String>,
                private val zip: JsonField<String>,
                private val line2: JsonField<String>,
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
                    @JsonProperty("state")
                    @ExcludeMissing
                    state: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line2")
                    @ExcludeMissing
                    line2: JsonField<String> = JsonMissing.of(),
                ) : this(city, line1, state, zip, line2, mutableMapOf())

                /**
                 * The city of the address.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun city(): String = city.getRequired("city")

                /**
                 * The first line of the address. This is usually the street number and street.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun line1(): String = line1.getRequired("line1")

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
                 * The second line of the address. This might be the floor or room number.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun line2(): Optional<String> = line2.getOptional("line2")

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

                /**
                 * Returns the raw JSON value of [line2].
                 *
                 * Unlike [line2], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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

                    /**
                     * Sets [Builder.city] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.city] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun city(city: JsonField<String>) = apply { this.city = city }

                    /**
                     * The first line of the address. This is usually the street number and street.
                     */
                    fun line1(line1: String) = line1(JsonField.of(line1))

                    /**
                     * Sets [Builder.line1] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.line1] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

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

                    /** The second line of the address. This might be the floor or room number. */
                    fun line2(line2: String) = line2(JsonField.of(line2))

                    /**
                     * Sets [Builder.line2] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.line2] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [Address].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .city()
                     * .line1()
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
                            checkRequired("state", state),
                            checkRequired("zip", zip),
                            line2,
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
                    state()
                    zip()
                    line2()
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
                        (if (state.asKnown().isPresent) 1 else 0) +
                        (if (zip.asKnown().isPresent) 1 else 0) +
                        (if (line2.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Address &&
                        city == other.city &&
                        line1 == other.line1 &&
                        state == other.state &&
                        zip == other.zip &&
                        line2 == other.line2 &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(city, line1, state, zip, line2, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Address{city=$city, line1=$line1, state=$state, zip=$zip, line2=$line2, additionalProperties=$additionalProperties}"
            }

            /** A means of verifying the person's identity. */
            class Identification
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val method: JsonField<Method>,
                private val number: JsonField<String>,
                private val driversLicense: JsonField<DriversLicense>,
                private val other: JsonField<Other>,
                private val passport: JsonField<Passport>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("method")
                    @ExcludeMissing
                    method: JsonField<Method> = JsonMissing.of(),
                    @JsonProperty("number")
                    @ExcludeMissing
                    number: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("drivers_license")
                    @ExcludeMissing
                    driversLicense: JsonField<DriversLicense> = JsonMissing.of(),
                    @JsonProperty("other")
                    @ExcludeMissing
                    other: JsonField<Other> = JsonMissing.of(),
                    @JsonProperty("passport")
                    @ExcludeMissing
                    passport: JsonField<Passport> = JsonMissing.of(),
                ) : this(method, number, driversLicense, other, passport, mutableMapOf())

                /**
                 * A method that can be used to verify the individual's identity.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun method(): Method = method.getRequired("method")

                /**
                 * An identification number that can be used to verify the individual's identity,
                 * such as a social security number.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun number(): String = number.getRequired("number")

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun driversLicense(): Optional<DriversLicense> =
                    driversLicense.getOptional("drivers_license")

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun other(): Optional<Other> = other.getOptional("other")

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun passport(): Optional<Passport> = passport.getOptional("passport")

                /**
                 * Returns the raw JSON value of [method].
                 *
                 * Unlike [method], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

                /**
                 * Returns the raw JSON value of [number].
                 *
                 * Unlike [number], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<String> = number

                /**
                 * Returns the raw JSON value of [driversLicense].
                 *
                 * Unlike [driversLicense], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("drivers_license")
                @ExcludeMissing
                fun _driversLicense(): JsonField<DriversLicense> = driversLicense

                /**
                 * Returns the raw JSON value of [other].
                 *
                 * Unlike [other], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("other") @ExcludeMissing fun _other(): JsonField<Other> = other

                /**
                 * Returns the raw JSON value of [passport].
                 *
                 * Unlike [passport], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("passport")
                @ExcludeMissing
                fun _passport(): JsonField<Passport> = passport

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

                    /**
                     * Sets [Builder.method] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.method] with a well-typed [Method] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun method(method: JsonField<Method>) = apply { this.method = method }

                    /**
                     * An identification number that can be used to verify the individual's
                     * identity, such as a social security number.
                     */
                    fun number(number: String) = number(JsonField.of(number))

                    /**
                     * Sets [Builder.number] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.number] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun number(number: JsonField<String>) = apply { this.number = number }

                    /**
                     * Information about the United States driver's license used for identification.
                     * Required if `method` is equal to `drivers_license`.
                     */
                    fun driversLicense(driversLicense: DriversLicense) =
                        driversLicense(JsonField.of(driversLicense))

                    /**
                     * Sets [Builder.driversLicense] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.driversLicense] with a well-typed
                     * [DriversLicense] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
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
                     * Sets [Builder.other] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.other] with a well-typed [Other] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun other(other: JsonField<Other>) = apply { this.other = other }

                    /**
                     * Information about the passport used for identification. Required if `method`
                     * is equal to `passport`.
                     */
                    fun passport(passport: Passport) = passport(JsonField.of(passport))

                    /**
                     * Sets [Builder.passport] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.passport] with a well-typed [Passport] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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

                    /**
                     * Returns an immutable instance of [Identification].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .method()
                     * .number()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Identification =
                        Identification(
                            checkRequired("method", method),
                            checkRequired("number", number),
                            driversLicense,
                            other,
                            passport,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Identification = apply {
                    if (validated) {
                        return@apply
                    }

                    method().validate()
                    number()
                    driversLicense().ifPresent { it.validate() }
                    other().ifPresent { it.validate() }
                    passport().ifPresent { it.validate() }
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
                        (if (number.asKnown().isPresent) 1 else 0) +
                        (driversLicense.asKnown().getOrNull()?.validity() ?: 0) +
                        (other.asKnown().getOrNull()?.validity() ?: 0) +
                        (passport.asKnown().getOrNull()?.validity() ?: 0)

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

                        return other is Method && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                class DriversLicense
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val expirationDate: JsonField<LocalDate>,
                    private val fileId: JsonField<String>,
                    private val state: JsonField<String>,
                    private val backFileId: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        fileId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("state")
                        @ExcludeMissing
                        state: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("back_file_id")
                        @ExcludeMissing
                        backFileId: JsonField<String> = JsonMissing.of(),
                    ) : this(expirationDate, fileId, state, backFileId, mutableMapOf())

                    /**
                     * The driver's license's expiration date in YYYY-MM-DD format.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun expirationDate(): LocalDate = expirationDate.getRequired("expiration_date")

                    /**
                     * The identifier of the File containing the front of the driver's license.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun fileId(): String = fileId.getRequired("file_id")

                    /**
                     * The state that issued the provided driver's license.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun state(): String = state.getRequired("state")

                    /**
                     * The identifier of the File containing the back of the driver's license.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun backFileId(): Optional<String> = backFileId.getOptional("back_file_id")

                    /**
                     * Returns the raw JSON value of [expirationDate].
                     *
                     * Unlike [expirationDate], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("expiration_date")
                    @ExcludeMissing
                    fun _expirationDate(): JsonField<LocalDate> = expirationDate

                    /**
                     * Returns the raw JSON value of [fileId].
                     *
                     * Unlike [fileId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    fun _fileId(): JsonField<String> = fileId

                    /**
                     * Returns the raw JSON value of [state].
                     *
                     * Unlike [state], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

                    /**
                     * Returns the raw JSON value of [backFileId].
                     *
                     * Unlike [backFileId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("back_file_id")
                    @ExcludeMissing
                    fun _backFileId(): JsonField<String> = backFileId

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

                        /**
                         * Sets [Builder.expirationDate] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.expirationDate] with a well-typed
                         * [LocalDate] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                            this.expirationDate = expirationDate
                        }

                        /**
                         * The identifier of the File containing the front of the driver's license.
                         */
                        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                        /**
                         * Sets [Builder.fileId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fileId] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                        /** The state that issued the provided driver's license. */
                        fun state(state: String) = state(JsonField.of(state))

                        /**
                         * Sets [Builder.state] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.state] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun state(state: JsonField<String>) = apply { this.state = state }

                        /**
                         * The identifier of the File containing the back of the driver's license.
                         */
                        fun backFileId(backFileId: String) = backFileId(JsonField.of(backFileId))

                        /**
                         * Sets [Builder.backFileId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.backFileId] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
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

                        /**
                         * Returns an immutable instance of [DriversLicense].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .expirationDate()
                         * .fileId()
                         * .state()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): DriversLicense =
                            DriversLicense(
                                checkRequired("expirationDate", expirationDate),
                                checkRequired("fileId", fileId),
                                checkRequired("state", state),
                                backFileId,
                                additionalProperties.toMutableMap(),
                            )
                    }

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
                        (if (expirationDate.asKnown().isPresent) 1 else 0) +
                            (if (fileId.asKnown().isPresent) 1 else 0) +
                            (if (state.asKnown().isPresent) 1 else 0) +
                            (if (backFileId.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is DriversLicense &&
                            expirationDate == other.expirationDate &&
                            fileId == other.fileId &&
                            state == other.state &&
                            backFileId == other.backFileId &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            expirationDate,
                            fileId,
                            state,
                            backFileId,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "DriversLicense{expirationDate=$expirationDate, fileId=$fileId, state=$state, backFileId=$backFileId, additionalProperties=$additionalProperties}"
                }

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 */
                class Other
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val country: JsonField<String>,
                    private val description: JsonField<String>,
                    private val fileId: JsonField<String>,
                    private val backFileId: JsonField<String>,
                    private val expirationDate: JsonField<LocalDate>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("country")
                        @ExcludeMissing
                        country: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("description")
                        @ExcludeMissing
                        description: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        fileId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("back_file_id")
                        @ExcludeMissing
                        backFileId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                    ) : this(
                        country,
                        description,
                        fileId,
                        backFileId,
                        expirationDate,
                        mutableMapOf(),
                    )

                    /**
                     * The two-character ISO 3166-1 code representing the country that issued the
                     * document (e.g., `US`).
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun country(): String = country.getRequired("country")

                    /**
                     * A description of the document submitted.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun description(): String = description.getRequired("description")

                    /**
                     * The identifier of the File containing the front of the document.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun fileId(): String = fileId.getRequired("file_id")

                    /**
                     * The identifier of the File containing the back of the document. Not every
                     * document has a reverse side.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun backFileId(): Optional<String> = backFileId.getOptional("back_file_id")

                    /**
                     * The document's expiration date in YYYY-MM-DD format.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun expirationDate(): Optional<LocalDate> =
                        expirationDate.getOptional("expiration_date")

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
                     * Returns the raw JSON value of [description].
                     *
                     * Unlike [description], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("description")
                    @ExcludeMissing
                    fun _description(): JsonField<String> = description

                    /**
                     * Returns the raw JSON value of [fileId].
                     *
                     * Unlike [fileId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    fun _fileId(): JsonField<String> = fileId

                    /**
                     * Returns the raw JSON value of [backFileId].
                     *
                     * Unlike [backFileId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("back_file_id")
                    @ExcludeMissing
                    fun _backFileId(): JsonField<String> = backFileId

                    /**
                     * Returns the raw JSON value of [expirationDate].
                     *
                     * Unlike [expirationDate], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("expiration_date")
                    @ExcludeMissing
                    fun _expirationDate(): JsonField<LocalDate> = expirationDate

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
                         * the document (e.g., `US`).
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

                        /** A description of the document submitted. */
                        fun description(description: String) =
                            description(JsonField.of(description))

                        /**
                         * Sets [Builder.description] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.description] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun description(description: JsonField<String>) = apply {
                            this.description = description
                        }

                        /** The identifier of the File containing the front of the document. */
                        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                        /**
                         * Sets [Builder.fileId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fileId] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                        /**
                         * The identifier of the File containing the back of the document. Not every
                         * document has a reverse side.
                         */
                        fun backFileId(backFileId: String) = backFileId(JsonField.of(backFileId))

                        /**
                         * Sets [Builder.backFileId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.backFileId] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun backFileId(backFileId: JsonField<String>) = apply {
                            this.backFileId = backFileId
                        }

                        /** The document's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(expirationDate: LocalDate) =
                            expirationDate(JsonField.of(expirationDate))

                        /**
                         * Sets [Builder.expirationDate] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.expirationDate] with a well-typed
                         * [LocalDate] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
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

                        /**
                         * Returns an immutable instance of [Other].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .country()
                         * .description()
                         * .fileId()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Other =
                            Other(
                                checkRequired("country", country),
                                checkRequired("description", description),
                                checkRequired("fileId", fileId),
                                backFileId,
                                expirationDate,
                                additionalProperties.toMutableMap(),
                            )
                    }

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
                        (if (country.asKnown().isPresent) 1 else 0) +
                            (if (description.asKnown().isPresent) 1 else 0) +
                            (if (fileId.asKnown().isPresent) 1 else 0) +
                            (if (backFileId.asKnown().isPresent) 1 else 0) +
                            (if (expirationDate.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Other &&
                            country == other.country &&
                            description == other.description &&
                            fileId == other.fileId &&
                            backFileId == other.backFileId &&
                            expirationDate == other.expirationDate &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            country,
                            description,
                            fileId,
                            backFileId,
                            expirationDate,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Other{country=$country, description=$description, fileId=$fileId, backFileId=$backFileId, expirationDate=$expirationDate, additionalProperties=$additionalProperties}"
                }

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 */
                class Passport
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val country: JsonField<String>,
                    private val expirationDate: JsonField<LocalDate>,
                    private val fileId: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("country")
                        @ExcludeMissing
                        country: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("expiration_date")
                        @ExcludeMissing
                        expirationDate: JsonField<LocalDate> = JsonMissing.of(),
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        fileId: JsonField<String> = JsonMissing.of(),
                    ) : this(country, expirationDate, fileId, mutableMapOf())

                    /**
                     * The two-character ISO 3166-1 code representing the country that issued the
                     * passport (e.g., `US`).
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun country(): String = country.getRequired("country")

                    /**
                     * The passport's expiration date in YYYY-MM-DD format.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun expirationDate(): LocalDate = expirationDate.getRequired("expiration_date")

                    /**
                     * The identifier of the File containing the passport.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun fileId(): String = fileId.getRequired("file_id")

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
                     * Returns the raw JSON value of [expirationDate].
                     *
                     * Unlike [expirationDate], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("expiration_date")
                    @ExcludeMissing
                    fun _expirationDate(): JsonField<LocalDate> = expirationDate

                    /**
                     * Returns the raw JSON value of [fileId].
                     *
                     * Unlike [fileId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    fun _fileId(): JsonField<String> = fileId

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

                        /**
                         * The two-character ISO 3166-1 code representing the country that issued
                         * the passport (e.g., `US`).
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

                        /** The passport's expiration date in YYYY-MM-DD format. */
                        fun expirationDate(expirationDate: LocalDate) =
                            expirationDate(JsonField.of(expirationDate))

                        /**
                         * Sets [Builder.expirationDate] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.expirationDate] with a well-typed
                         * [LocalDate] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                            this.expirationDate = expirationDate
                        }

                        /** The identifier of the File containing the passport. */
                        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                        /**
                         * Sets [Builder.fileId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fileId] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
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

                        /**
                         * Returns an immutable instance of [Passport].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .country()
                         * .expirationDate()
                         * .fileId()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Passport =
                            Passport(
                                checkRequired("country", country),
                                checkRequired("expirationDate", expirationDate),
                                checkRequired("fileId", fileId),
                                additionalProperties.toMutableMap(),
                            )
                    }

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
                        (if (country.asKnown().isPresent) 1 else 0) +
                            (if (expirationDate.asKnown().isPresent) 1 else 0) +
                            (if (fileId.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Passport &&
                            country == other.country &&
                            expirationDate == other.expirationDate &&
                            fileId == other.fileId &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(country, expirationDate, fileId, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Passport{country=$country, expirationDate=$expirationDate, fileId=$fileId, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Identification &&
                        method == other.method &&
                        number == other.number &&
                        driversLicense == other.driversLicense &&
                        this.other == other.other &&
                        passport == other.passport &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        method,
                        number,
                        driversLicense,
                        other,
                        passport,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Identification{method=$method, number=$number, driversLicense=$driversLicense, other=$other, passport=$passport, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Grantor &&
                    address == other.address &&
                    dateOfBirth == other.dateOfBirth &&
                    identification == other.identification &&
                    name == other.name &&
                    confirmedNoUsTaxId == other.confirmedNoUsTaxId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    address,
                    dateOfBirth,
                    identification,
                    name,
                    confirmedNoUsTaxId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Grantor{address=$address, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, confirmedNoUsTaxId=$confirmedNoUsTaxId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Trust &&
                address == other.address &&
                category == other.category &&
                name == other.name &&
                trustees == other.trustees &&
                formationDocumentFileId == other.formationDocumentFileId &&
                formationState == other.formationState &&
                grantor == other.grantor &&
                taxIdentifier == other.taxIdentifier &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                address,
                category,
                name,
                trustees,
                formationDocumentFileId,
                formationState,
                grantor,
                taxIdentifier,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Trust{address=$address, category=$category, name=$name, trustees=$trustees, formationDocumentFileId=$formationDocumentFileId, formationState=$formationState, grantor=$grantor, taxIdentifier=$taxIdentifier, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntityCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EntityCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
