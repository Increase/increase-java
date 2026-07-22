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

/** Update an Entity */
class EntityUpdateParams
private constructor(
    private val entityId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The entity identifier. */
    fun entityId(): Optional<String> = Optional.ofNullable(entityId)

    /**
     * Details of the corporation entity to update. If you specify this parameter and the entity is
     * not a corporation, the request will fail.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun corporation(): Optional<Corporation> = body.corporation()

    /**
     * When your user last confirmed the Entity's details. Depending on your program, you may be
     * required to affirmatively confirm details with your users on an annual basis.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun detailsConfirmedAt(): Optional<OffsetDateTime> = body.detailsConfirmedAt()

    /**
     * Details of the government authority entity to update. If you specify this parameter and the
     * entity is not a government authority, the request will fail.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun governmentAuthority(): Optional<GovernmentAuthority> = body.governmentAuthority()

    /**
     * Details of the natural person entity to update. If you specify this parameter and the entity
     * is not a natural person, the request will fail.
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
     * New terms that the Entity agreed to. Not all programs are required to submit this data. This
     * will not archive previously submitted terms.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun termsAgreements(): Optional<List<TermsAgreement>> = body.termsAgreements()

    /**
     * If you are using a third-party service for identity verification, you can use this field to
     * associate this Entity with the identifier that represents them in that service.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun thirdPartyVerification(): Optional<ThirdPartyVerification> = body.thirdPartyVerification()

    /**
     * Details of the trust entity to update. If you specify this parameter and the entity is not a
     * trust, the request will fail.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trust(): Optional<Trust> = body.trust()

    /**
     * Returns the raw JSON value of [corporation].
     *
     * Unlike [corporation], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _corporation(): JsonField<Corporation> = body._corporation()

    /**
     * Returns the raw JSON value of [detailsConfirmedAt].
     *
     * Unlike [detailsConfirmedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _detailsConfirmedAt(): JsonField<OffsetDateTime> = body._detailsConfirmedAt()

    /**
     * Returns the raw JSON value of [governmentAuthority].
     *
     * Unlike [governmentAuthority], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _governmentAuthority(): JsonField<GovernmentAuthority> = body._governmentAuthority()

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
     * Returns the raw JSON value of [termsAgreements].
     *
     * Unlike [termsAgreements], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _termsAgreements(): JsonField<List<TermsAgreement>> = body._termsAgreements()

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

        @JvmStatic fun none(): EntityUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EntityUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EntityUpdateParams]. */
    class Builder internal constructor() {

        private var entityId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(entityUpdateParams: EntityUpdateParams) = apply {
            entityId = entityUpdateParams.entityId
            body = entityUpdateParams.body.toBuilder()
            additionalHeaders = entityUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = entityUpdateParams.additionalQueryParams.toBuilder()
        }

        /** The entity identifier. */
        fun entityId(entityId: String?) = apply { this.entityId = entityId }

        /** Alias for calling [Builder.entityId] with `entityId.orElse(null)`. */
        fun entityId(entityId: Optional<String>) = entityId(entityId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [corporation]
         * - [detailsConfirmedAt]
         * - [governmentAuthority]
         * - [naturalPerson]
         * - [riskRating]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Details of the corporation entity to update. If you specify this parameter and the entity
         * is not a corporation, the request will fail.
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

        /**
         * When your user last confirmed the Entity's details. Depending on your program, you may be
         * required to affirmatively confirm details with your users on an annual basis.
         */
        fun detailsConfirmedAt(detailsConfirmedAt: OffsetDateTime) = apply {
            body.detailsConfirmedAt(detailsConfirmedAt)
        }

        /**
         * Sets [Builder.detailsConfirmedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detailsConfirmedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun detailsConfirmedAt(detailsConfirmedAt: JsonField<OffsetDateTime>) = apply {
            body.detailsConfirmedAt(detailsConfirmedAt)
        }

        /**
         * Details of the government authority entity to update. If you specify this parameter and
         * the entity is not a government authority, the request will fail.
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

        /**
         * Details of the natural person entity to update. If you specify this parameter and the
         * entity is not a natural person, the request will fail.
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

        /**
         * New terms that the Entity agreed to. Not all programs are required to submit this data.
         * This will not archive previously submitted terms.
         */
        fun termsAgreements(termsAgreements: List<TermsAgreement>) = apply {
            body.termsAgreements(termsAgreements)
        }

        /**
         * Sets [Builder.termsAgreements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.termsAgreements] with a well-typed
         * `List<TermsAgreement>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun termsAgreements(termsAgreements: JsonField<List<TermsAgreement>>) = apply {
            body.termsAgreements(termsAgreements)
        }

        /**
         * Adds a single [TermsAgreement] to [termsAgreements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTermsAgreement(termsAgreement: TermsAgreement) = apply {
            body.addTermsAgreement(termsAgreement)
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

        /**
         * Details of the trust entity to update. If you specify this parameter and the entity is
         * not a trust, the request will fail.
         */
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
         * Returns an immutable instance of [EntityUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EntityUpdateParams =
            EntityUpdateParams(
                entityId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> entityId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val corporation: JsonField<Corporation>,
        private val detailsConfirmedAt: JsonField<OffsetDateTime>,
        private val governmentAuthority: JsonField<GovernmentAuthority>,
        private val naturalPerson: JsonField<NaturalPerson>,
        private val riskRating: JsonField<RiskRating>,
        private val termsAgreements: JsonField<List<TermsAgreement>>,
        private val thirdPartyVerification: JsonField<ThirdPartyVerification>,
        private val trust: JsonField<Trust>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("corporation")
            @ExcludeMissing
            corporation: JsonField<Corporation> = JsonMissing.of(),
            @JsonProperty("details_confirmed_at")
            @ExcludeMissing
            detailsConfirmedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("government_authority")
            @ExcludeMissing
            governmentAuthority: JsonField<GovernmentAuthority> = JsonMissing.of(),
            @JsonProperty("natural_person")
            @ExcludeMissing
            naturalPerson: JsonField<NaturalPerson> = JsonMissing.of(),
            @JsonProperty("risk_rating")
            @ExcludeMissing
            riskRating: JsonField<RiskRating> = JsonMissing.of(),
            @JsonProperty("terms_agreements")
            @ExcludeMissing
            termsAgreements: JsonField<List<TermsAgreement>> = JsonMissing.of(),
            @JsonProperty("third_party_verification")
            @ExcludeMissing
            thirdPartyVerification: JsonField<ThirdPartyVerification> = JsonMissing.of(),
            @JsonProperty("trust") @ExcludeMissing trust: JsonField<Trust> = JsonMissing.of(),
        ) : this(
            corporation,
            detailsConfirmedAt,
            governmentAuthority,
            naturalPerson,
            riskRating,
            termsAgreements,
            thirdPartyVerification,
            trust,
            mutableMapOf(),
        )

        /**
         * Details of the corporation entity to update. If you specify this parameter and the entity
         * is not a corporation, the request will fail.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun corporation(): Optional<Corporation> = corporation.getOptional("corporation")

        /**
         * When your user last confirmed the Entity's details. Depending on your program, you may be
         * required to affirmatively confirm details with your users on an annual basis.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun detailsConfirmedAt(): Optional<OffsetDateTime> =
            detailsConfirmedAt.getOptional("details_confirmed_at")

        /**
         * Details of the government authority entity to update. If you specify this parameter and
         * the entity is not a government authority, the request will fail.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun governmentAuthority(): Optional<GovernmentAuthority> =
            governmentAuthority.getOptional("government_authority")

        /**
         * Details of the natural person entity to update. If you specify this parameter and the
         * entity is not a natural person, the request will fail.
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
         * New terms that the Entity agreed to. Not all programs are required to submit this data.
         * This will not archive previously submitted terms.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun termsAgreements(): Optional<List<TermsAgreement>> =
            termsAgreements.getOptional("terms_agreements")

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
         * Details of the trust entity to update. If you specify this parameter and the entity is
         * not a trust, the request will fail.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun trust(): Optional<Trust> = trust.getOptional("trust")

        /**
         * Returns the raw JSON value of [corporation].
         *
         * Unlike [corporation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("corporation")
        @ExcludeMissing
        fun _corporation(): JsonField<Corporation> = corporation

        /**
         * Returns the raw JSON value of [detailsConfirmedAt].
         *
         * Unlike [detailsConfirmedAt], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("details_confirmed_at")
        @ExcludeMissing
        fun _detailsConfirmedAt(): JsonField<OffsetDateTime> = detailsConfirmedAt

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
         * Returns the raw JSON value of [termsAgreements].
         *
         * Unlike [termsAgreements], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("terms_agreements")
        @ExcludeMissing
        fun _termsAgreements(): JsonField<List<TermsAgreement>> = termsAgreements

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var corporation: JsonField<Corporation> = JsonMissing.of()
            private var detailsConfirmedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var governmentAuthority: JsonField<GovernmentAuthority> = JsonMissing.of()
            private var naturalPerson: JsonField<NaturalPerson> = JsonMissing.of()
            private var riskRating: JsonField<RiskRating> = JsonMissing.of()
            private var termsAgreements: JsonField<MutableList<TermsAgreement>>? = null
            private var thirdPartyVerification: JsonField<ThirdPartyVerification> = JsonMissing.of()
            private var trust: JsonField<Trust> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                corporation = body.corporation
                detailsConfirmedAt = body.detailsConfirmedAt
                governmentAuthority = body.governmentAuthority
                naturalPerson = body.naturalPerson
                riskRating = body.riskRating
                termsAgreements = body.termsAgreements.map { it.toMutableList() }
                thirdPartyVerification = body.thirdPartyVerification
                trust = body.trust
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Details of the corporation entity to update. If you specify this parameter and the
             * entity is not a corporation, the request will fail.
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

            /**
             * When your user last confirmed the Entity's details. Depending on your program, you
             * may be required to affirmatively confirm details with your users on an annual basis.
             */
            fun detailsConfirmedAt(detailsConfirmedAt: OffsetDateTime) =
                detailsConfirmedAt(JsonField.of(detailsConfirmedAt))

            /**
             * Sets [Builder.detailsConfirmedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detailsConfirmedAt] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun detailsConfirmedAt(detailsConfirmedAt: JsonField<OffsetDateTime>) = apply {
                this.detailsConfirmedAt = detailsConfirmedAt
            }

            /**
             * Details of the government authority entity to update. If you specify this parameter
             * and the entity is not a government authority, the request will fail.
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
             * Details of the natural person entity to update. If you specify this parameter and the
             * entity is not a natural person, the request will fail.
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

            /**
             * New terms that the Entity agreed to. Not all programs are required to submit this
             * data. This will not archive previously submitted terms.
             */
            fun termsAgreements(termsAgreements: List<TermsAgreement>) =
                termsAgreements(JsonField.of(termsAgreements))

            /**
             * Sets [Builder.termsAgreements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.termsAgreements] with a well-typed
             * `List<TermsAgreement>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun termsAgreements(termsAgreements: JsonField<List<TermsAgreement>>) = apply {
                this.termsAgreements = termsAgreements.map { it.toMutableList() }
            }

            /**
             * Adds a single [TermsAgreement] to [termsAgreements].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTermsAgreement(termsAgreement: TermsAgreement) = apply {
                termsAgreements =
                    (termsAgreements ?: JsonField.of(mutableListOf())).also {
                        checkKnown("termsAgreements", it).add(termsAgreement)
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
             * Details of the trust entity to update. If you specify this parameter and the entity
             * is not a trust, the request will fail.
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
             */
            fun build(): Body =
                Body(
                    corporation,
                    detailsConfirmedAt,
                    governmentAuthority,
                    naturalPerson,
                    riskRating,
                    (termsAgreements ?: JsonMissing.of()).map { it.toImmutable() },
                    thirdPartyVerification,
                    trust,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            corporation().ifPresent { it.validate() }
            detailsConfirmedAt()
            governmentAuthority().ifPresent { it.validate() }
            naturalPerson().ifPresent { it.validate() }
            riskRating().ifPresent { it.validate() }
            termsAgreements().ifPresent { it.forEach { it.validate() } }
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
            (corporation.asKnown().getOrNull()?.validity() ?: 0) +
                (if (detailsConfirmedAt.asKnown().isPresent) 1 else 0) +
                (governmentAuthority.asKnown().getOrNull()?.validity() ?: 0) +
                (naturalPerson.asKnown().getOrNull()?.validity() ?: 0) +
                (riskRating.asKnown().getOrNull()?.validity() ?: 0) +
                (termsAgreements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (thirdPartyVerification.asKnown().getOrNull()?.validity() ?: 0) +
                (trust.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                corporation == other.corporation &&
                detailsConfirmedAt == other.detailsConfirmedAt &&
                governmentAuthority == other.governmentAuthority &&
                naturalPerson == other.naturalPerson &&
                riskRating == other.riskRating &&
                termsAgreements == other.termsAgreements &&
                thirdPartyVerification == other.thirdPartyVerification &&
                trust == other.trust &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                corporation,
                detailsConfirmedAt,
                governmentAuthority,
                naturalPerson,
                riskRating,
                termsAgreements,
                thirdPartyVerification,
                trust,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{corporation=$corporation, detailsConfirmedAt=$detailsConfirmedAt, governmentAuthority=$governmentAuthority, naturalPerson=$naturalPerson, riskRating=$riskRating, termsAgreements=$termsAgreements, thirdPartyVerification=$thirdPartyVerification, trust=$trust, additionalProperties=$additionalProperties}"
    }

    /**
     * Details of the corporation entity to update. If you specify this parameter and the entity is
     * not a corporation, the request will fail.
     */
    class Corporation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<Address>,
        private val email: JsonField<String>,
        private val incorporationState: JsonField<String>,
        private val industryCode: JsonField<String>,
        private val legalIdentifier: JsonField<LegalIdentifier>,
        private val name: JsonField<String>,
        private val website: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("incorporation_state")
            @ExcludeMissing
            incorporationState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("industry_code")
            @ExcludeMissing
            industryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("legal_identifier")
            @ExcludeMissing
            legalIdentifier: JsonField<LegalIdentifier> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("website") @ExcludeMissing website: JsonField<String> = JsonMissing.of(),
        ) : this(
            address,
            email,
            incorporationState,
            industryCode,
            legalIdentifier,
            name,
            website,
            mutableMapOf(),
        )

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun address(): Optional<Address> = address.getOptional("address")

        /**
         * An email address for the business. Not every program requires an email for submitted
         * Entities.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

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
         * The legal identifier of the corporation. This is usually the Employer Identification
         * Number (EIN).
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun legalIdentifier(): Optional<LegalIdentifier> =
            legalIdentifier.getOptional("legal_identifier")

        /**
         * The legal name of the corporation.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * A website for the business. Not every program requires a website for submitted Entities.
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
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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
         * Returns the raw JSON value of [legalIdentifier].
         *
         * Unlike [legalIdentifier], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("legal_identifier")
        @ExcludeMissing
        fun _legalIdentifier(): JsonField<LegalIdentifier> = legalIdentifier

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

            /** Returns a mutable builder for constructing an instance of [Corporation]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Corporation]. */
        class Builder internal constructor() {

            private var address: JsonField<Address> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var incorporationState: JsonField<String> = JsonMissing.of()
            private var industryCode: JsonField<String> = JsonMissing.of()
            private var legalIdentifier: JsonField<LegalIdentifier> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var website: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(corporation: Corporation) = apply {
                address = corporation.address
                email = corporation.email
                incorporationState = corporation.incorporationState
                industryCode = corporation.industryCode
                legalIdentifier = corporation.legalIdentifier
                name = corporation.name
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
             * An email address for the business. Not every program requires an email for submitted
             * Entities.
             */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

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

            /**
             * The legal identifier of the corporation. This is usually the Employer Identification
             * Number (EIN).
             */
            fun legalIdentifier(legalIdentifier: LegalIdentifier) =
                legalIdentifier(JsonField.of(legalIdentifier))

            /**
             * Sets [Builder.legalIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalIdentifier] with a well-typed [LegalIdentifier]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun legalIdentifier(legalIdentifier: JsonField<LegalIdentifier>) = apply {
                this.legalIdentifier = legalIdentifier
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

            /**
             * A website for the business. Not every program requires a website for submitted
             * Entities.
             */
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
             */
            fun build(): Corporation =
                Corporation(
                    address,
                    email,
                    incorporationState,
                    industryCode,
                    legalIdentifier,
                    name,
                    website,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Corporation = apply {
            if (validated) {
                return@apply
            }

            address().ifPresent { it.validate() }
            email()
            incorporationState()
            industryCode()
            legalIdentifier().ifPresent { it.validate() }
            name()
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
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (incorporationState.asKnown().isPresent) 1 else 0) +
                (if (industryCode.asKnown().isPresent) 1 else 0) +
                (legalIdentifier.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (website.asKnown().isPresent) 1 else 0)

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
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
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
            ) : this(city, country, line1, line2, state, zip, mutableMapOf())

            /**
             * The city, district, town, or village of the address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun city(): String = city.getRequired("city")

            /**
             * The two-letter ISO 3166-1 alpha-2 code for the country of the address.
             *
             * Defaults to `US`.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun country(): String = country.getRequired("country")

            /**
             * The first line of the address. This is usually the street number and street.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun line1(): String = line1.getRequired("line1")

            /**
             * The second line of the address. This might be the floor or room number.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun line2(): Optional<String> = line2.getOptional("line2")

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the US state,
             * province, or region of the address. Required in certain countries.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun state(): Optional<String> = state.getOptional("state")

            /**
             * The ZIP or postal code of the address. Required in certain countries.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun zip(): Optional<String> = zip.getOptional("zip")

            /**
             * Returns the raw JSON value of [city].
             *
             * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /**
             * Returns the raw JSON value of [country].
             *
             * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

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
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

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
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /**
                 * The two-letter ISO 3166-1 alpha-2 code for the country of the address.
                 *
                 * Defaults to `US`.
                 */
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

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

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the US state,
                 * province, or region of the address. Required in certain countries.
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

                /** The ZIP or postal code of the address. Required in certain countries. */
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws IncreaseInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
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

        /**
         * The legal identifier of the corporation. This is usually the Employer Identification
         * Number (EIN).
         */
        class LegalIdentifier
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val value: JsonField<String>,
            private val category: JsonField<Category>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
                @JsonProperty("category")
                @ExcludeMissing
                category: JsonField<Category> = JsonMissing.of(),
            ) : this(value, category, mutableMapOf())

            /**
             * The legal identifier itself. For US Employer Identification Numbers, submit nine
             * digits with no dashes or other separators.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): String = value.getRequired("value")

            /**
             * The category of the legal identifier.
             *
             * Defaults to `us_employer_identification_number`.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun category(): Optional<Category> = category.getOptional("category")

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

            /**
             * Returns the raw JSON value of [category].
             *
             * Unlike [category], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("category")
            @ExcludeMissing
            fun _category(): JsonField<Category> = category

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
                 * Returns a mutable builder for constructing an instance of [LegalIdentifier].
                 *
                 * The following fields are required:
                 * ```java
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [LegalIdentifier]. */
            class Builder internal constructor() {

                private var value: JsonField<String>? = null
                private var category: JsonField<Category> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(legalIdentifier: LegalIdentifier) = apply {
                    value = legalIdentifier.value
                    category = legalIdentifier.category
                    additionalProperties = legalIdentifier.additionalProperties.toMutableMap()
                }

                /**
                 * The legal identifier itself. For US Employer Identification Numbers, submit nine
                 * digits with no dashes or other separators.
                 */
                fun value(value: String) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<String>) = apply { this.value = value }

                /**
                 * The category of the legal identifier.
                 *
                 * Defaults to `us_employer_identification_number`.
                 */
                fun category(category: Category) = category(JsonField.of(category))

                /**
                 * Sets [Builder.category] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.category] with a well-typed [Category] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun category(category: JsonField<Category>) = apply { this.category = category }

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
                 * Returns an immutable instance of [LegalIdentifier].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): LegalIdentifier =
                    LegalIdentifier(
                        checkRequired("value", value),
                        category,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws IncreaseInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): LegalIdentifier = apply {
                if (validated) {
                    return@apply
                }

                value()
                category().ifPresent { it.validate() }
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
                (if (value.asKnown().isPresent) 1 else 0) +
                    (category.asKnown().getOrNull()?.validity() ?: 0)

            /** The category of the legal identifier. */
            class Category @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    /**
                     * The Employer Identification Number (EIN) for the company. The EIN is a
                     * 9-digit number assigned by the IRS; submit it as nine digits with no dashes
                     * or other separators.
                     */
                    @JvmField
                    val US_EMPLOYER_IDENTIFICATION_NUMBER = of("us_employer_identification_number")

                    /**
                     * A legal identifier issued by a foreign government, like a tax identification
                     * number or registration number.
                     */
                    @JvmField val OTHER = of("other")

                    @JvmStatic fun of(value: String) = Category(JsonField.of(value))
                }

                /** An enum containing [Category]'s known values. */
                enum class Known {
                    /**
                     * The Employer Identification Number (EIN) for the company. The EIN is a
                     * 9-digit number assigned by the IRS; submit it as nine digits with no dashes
                     * or other separators.
                     */
                    US_EMPLOYER_IDENTIFICATION_NUMBER,
                    /**
                     * A legal identifier issued by a foreign government, like a tax identification
                     * number or registration number.
                     */
                    OTHER,
                }

                /**
                 * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Category] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /**
                     * The Employer Identification Number (EIN) for the company. The EIN is a
                     * 9-digit number assigned by the IRS; submit it as nine digits with no dashes
                     * or other separators.
                     */
                    US_EMPLOYER_IDENTIFICATION_NUMBER,
                    /**
                     * A legal identifier issued by a foreign government, like a tax identification
                     * number or registration number.
                     */
                    OTHER,
                    /**
                     * An enum member indicating that [Category] was instantiated with an unknown
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
                        US_EMPLOYER_IDENTIFICATION_NUMBER -> Value.US_EMPLOYER_IDENTIFICATION_NUMBER
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
                        US_EMPLOYER_IDENTIFICATION_NUMBER -> Known.US_EMPLOYER_IDENTIFICATION_NUMBER
                        OTHER -> Known.OTHER
                        else -> throw IncreaseInvalidDataException("Unknown Category: $value")
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws IncreaseInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
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

                return other is LegalIdentifier &&
                    value == other.value &&
                    category == other.category &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(value, category, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LegalIdentifier{value=$value, category=$category, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Corporation &&
                address == other.address &&
                email == other.email &&
                incorporationState == other.incorporationState &&
                industryCode == other.industryCode &&
                legalIdentifier == other.legalIdentifier &&
                name == other.name &&
                website == other.website &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                address,
                email,
                incorporationState,
                industryCode,
                legalIdentifier,
                name,
                website,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Corporation{address=$address, email=$email, incorporationState=$incorporationState, industryCode=$industryCode, legalIdentifier=$legalIdentifier, name=$name, website=$website, additionalProperties=$additionalProperties}"
    }

    /**
     * Details of the government authority entity to update. If you specify this parameter and the
     * entity is not a government authority, the request will fail.
     */
    class GovernmentAuthority
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<Address>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(address, name, mutableMapOf())

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun address(): Optional<Address> = address.getOptional("address")

        /**
         * The legal name of the government authority.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

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

            /** Returns a mutable builder for constructing an instance of [GovernmentAuthority]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [GovernmentAuthority]. */
        class Builder internal constructor() {

            private var address: JsonField<Address> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(governmentAuthority: GovernmentAuthority) = apply {
                address = governmentAuthority.address
                name = governmentAuthority.name
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
             */
            fun build(): GovernmentAuthority =
                GovernmentAuthority(address, name, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): GovernmentAuthority = apply {
            if (validated) {
                return@apply
            }

            address().ifPresent { it.validate() }
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
                (if (name.asKnown().isPresent) 1 else 0)

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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws IncreaseInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is GovernmentAuthority &&
                address == other.address &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(address, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GovernmentAuthority{address=$address, name=$name, additionalProperties=$additionalProperties}"
    }

    /**
     * Details of the natural person entity to update. If you specify this parameter and the entity
     * is not a natural person, the request will fail.
     */
    class NaturalPerson
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<Address>,
        private val confirmedNoUsTaxId: JsonField<Boolean>,
        private val identification: JsonField<Identification>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("confirmed_no_us_tax_id")
            @ExcludeMissing
            confirmedNoUsTaxId: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("identification")
            @ExcludeMissing
            identification: JsonField<Identification> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(address, confirmedNoUsTaxId, identification, name, mutableMapOf())

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun address(): Optional<Address> = address.getOptional("address")

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
         * A means of verifying the person's identity.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun identification(): Optional<Identification> =
            identification.getOptional("identification")

        /**
         * The legal name of the natural person.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /**
         * Returns the raw JSON value of [confirmedNoUsTaxId].
         *
         * Unlike [confirmedNoUsTaxId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("confirmed_no_us_tax_id")
        @ExcludeMissing
        fun _confirmedNoUsTaxId(): JsonField<Boolean> = confirmedNoUsTaxId

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

            /** Returns a mutable builder for constructing an instance of [NaturalPerson]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [NaturalPerson]. */
        class Builder internal constructor() {

            private var address: JsonField<Address> = JsonMissing.of()
            private var confirmedNoUsTaxId: JsonField<Boolean> = JsonMissing.of()
            private var identification: JsonField<Identification> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(naturalPerson: NaturalPerson) = apply {
                address = naturalPerson.address
                confirmedNoUsTaxId = naturalPerson.confirmedNoUsTaxId
                identification = naturalPerson.identification
                name = naturalPerson.name
                additionalProperties = naturalPerson.additionalProperties.toMutableMap()
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

            /** The legal name of the natural person. */
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
             */
            fun build(): NaturalPerson =
                NaturalPerson(
                    address,
                    confirmedNoUsTaxId,
                    identification,
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): NaturalPerson = apply {
            if (validated) {
                return@apply
            }

            address().ifPresent { it.validate() }
            confirmedNoUsTaxId()
            identification().ifPresent { it.validate() }
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
                (if (confirmedNoUsTaxId.asKnown().isPresent) 1 else 0) +
                (identification.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
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
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
            ) : this(city, country, line1, line2, state, zip, mutableMapOf())

            /**
             * The city, district, town, or village of the address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun city(): String = city.getRequired("city")

            /**
             * The two-letter ISO 3166-1 alpha-2 code for the country of the address.
             *
             * Defaults to `US`.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun country(): String = country.getRequired("country")

            /**
             * The first line of the address. This is usually the street number and street.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun line1(): String = line1.getRequired("line1")

            /**
             * The second line of the address. This might be the floor or room number.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun line2(): Optional<String> = line2.getOptional("line2")

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the US state,
             * province, or region of the address. Required in certain countries.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun state(): Optional<String> = state.getOptional("state")

            /**
             * The ZIP or postal code of the address. Required in certain countries.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun zip(): Optional<String> = zip.getOptional("zip")

            /**
             * Returns the raw JSON value of [city].
             *
             * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /**
             * Returns the raw JSON value of [country].
             *
             * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

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
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

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
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /**
                 * The two-letter ISO 3166-1 alpha-2 code for the country of the address.
                 *
                 * Defaults to `US`.
                 */
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

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

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the US state,
                 * province, or region of the address. Required in certain countries.
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

                /** The ZIP or postal code of the address. Required in certain countries. */
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws IncreaseInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
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
                @JsonProperty("other") @ExcludeMissing other: JsonField<Other> = JsonMissing.of(),
                @JsonProperty("passport")
                @ExcludeMissing
                passport: JsonField<Passport> = JsonMissing.of(),
            ) : this(method, number, driversLicense, other, passport, mutableMapOf())

            /**
             * A method that can be used to verify the individual's identity.
             *
             * Defaults to `social_security_number`.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun method(): Method = method.getRequired("method")

            /**
             * An identification number that can be used to verify the individual's identity, such
             * as a social security number. For Social Security Numbers and Individual Taxpayer
             * Identification Numbers, submit nine digits with no dashes or other separators. When
             * testing in sandbox, use one of our
             * [sandbox test values](https://increase.com/documentation/sandbox-test-values).
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

                /**
                 * A method that can be used to verify the individual's identity.
                 *
                 * Defaults to `social_security_number`.
                 */
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
                 * such as a social security number. For Social Security Numbers and Individual
                 * Taxpayer Identification Numbers, submit nine digits with no dashes or other
                 * separators. When testing in sandbox, use one of our
                 * [sandbox test values](https://increase.com/documentation/sandbox-test-values).
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws IncreaseInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws IncreaseInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws IncreaseInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws IncreaseInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
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
                 * document (e.g., `US`).
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws IncreaseInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
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
                confirmedNoUsTaxId == other.confirmedNoUsTaxId &&
                identification == other.identification &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(address, confirmedNoUsTaxId, identification, name, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NaturalPerson{address=$address, confirmedNoUsTaxId=$confirmedNoUsTaxId, identification=$identification, name=$name, additionalProperties=$additionalProperties}"
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws IncreaseInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
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

    class TermsAgreement
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val agreedAt: JsonField<OffsetDateTime>,
        private val ipAddress: JsonField<String>,
        private val termsUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("agreed_at")
            @ExcludeMissing
            agreedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("ip_address")
            @ExcludeMissing
            ipAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("terms_url")
            @ExcludeMissing
            termsUrl: JsonField<String> = JsonMissing.of(),
        ) : this(agreedAt, ipAddress, termsUrl, mutableMapOf())

        /**
         * The timestamp of when the Entity agreed to the terms.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun agreedAt(): OffsetDateTime = agreedAt.getRequired("agreed_at")

        /**
         * The IP address the Entity accessed reviewed the terms from.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ipAddress(): String = ipAddress.getRequired("ip_address")

        /**
         * The URL of the terms agreement. This link will be provided by your bank partner.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun termsUrl(): String = termsUrl.getRequired("terms_url")

        /**
         * Returns the raw JSON value of [agreedAt].
         *
         * Unlike [agreedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agreed_at")
        @ExcludeMissing
        fun _agreedAt(): JsonField<OffsetDateTime> = agreedAt

        /**
         * Returns the raw JSON value of [ipAddress].
         *
         * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ip_address") @ExcludeMissing fun _ipAddress(): JsonField<String> = ipAddress

        /**
         * Returns the raw JSON value of [termsUrl].
         *
         * Unlike [termsUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("terms_url") @ExcludeMissing fun _termsUrl(): JsonField<String> = termsUrl

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
             * Returns a mutable builder for constructing an instance of [TermsAgreement].
             *
             * The following fields are required:
             * ```java
             * .agreedAt()
             * .ipAddress()
             * .termsUrl()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TermsAgreement]. */
        class Builder internal constructor() {

            private var agreedAt: JsonField<OffsetDateTime>? = null
            private var ipAddress: JsonField<String>? = null
            private var termsUrl: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(termsAgreement: TermsAgreement) = apply {
                agreedAt = termsAgreement.agreedAt
                ipAddress = termsAgreement.ipAddress
                termsUrl = termsAgreement.termsUrl
                additionalProperties = termsAgreement.additionalProperties.toMutableMap()
            }

            /** The timestamp of when the Entity agreed to the terms. */
            fun agreedAt(agreedAt: OffsetDateTime) = agreedAt(JsonField.of(agreedAt))

            /**
             * Sets [Builder.agreedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agreedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agreedAt(agreedAt: JsonField<OffsetDateTime>) = apply { this.agreedAt = agreedAt }

            /** The IP address the Entity accessed reviewed the terms from. */
            fun ipAddress(ipAddress: String) = ipAddress(JsonField.of(ipAddress))

            /**
             * Sets [Builder.ipAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ipAddress] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

            /** The URL of the terms agreement. This link will be provided by your bank partner. */
            fun termsUrl(termsUrl: String) = termsUrl(JsonField.of(termsUrl))

            /**
             * Sets [Builder.termsUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.termsUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun termsUrl(termsUrl: JsonField<String>) = apply { this.termsUrl = termsUrl }

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
             * Returns an immutable instance of [TermsAgreement].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .agreedAt()
             * .ipAddress()
             * .termsUrl()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TermsAgreement =
                TermsAgreement(
                    checkRequired("agreedAt", agreedAt),
                    checkRequired("ipAddress", ipAddress),
                    checkRequired("termsUrl", termsUrl),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): TermsAgreement = apply {
            if (validated) {
                return@apply
            }

            agreedAt()
            ipAddress()
            termsUrl()
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
            (if (agreedAt.asKnown().isPresent) 1 else 0) +
                (if (ipAddress.asKnown().isPresent) 1 else 0) +
                (if (termsUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TermsAgreement &&
                agreedAt == other.agreedAt &&
                ipAddress == other.ipAddress &&
                termsUrl == other.termsUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(agreedAt, ipAddress, termsUrl, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TermsAgreement{agreedAt=$agreedAt, ipAddress=$ipAddress, termsUrl=$termsUrl, additionalProperties=$additionalProperties}"
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

                /** Taktile. See https://taktile.com for more information. */
                @JvmField val TAKTILE = of("taktile")

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
                /** Taktile. See https://taktile.com for more information. */
                TAKTILE,
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
                /** Taktile. See https://taktile.com for more information. */
                TAKTILE,
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
                    TAKTILE -> Value.TAKTILE
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
                    TAKTILE -> Known.TAKTILE
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws IncreaseInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
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

    /**
     * Details of the trust entity to update. If you specify this parameter and the entity is not a
     * trust, the request will fail.
     */
    class Trust
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<Address>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(address, name, mutableMapOf())

        /**
         * The entity's physical address. Mail receiving locations like PO Boxes and PMB's are
         * disallowed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun address(): Optional<Address> = address.getOptional("address")

        /**
         * The legal name of the trust.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

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

            /** Returns a mutable builder for constructing an instance of [Trust]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Trust]. */
        class Builder internal constructor() {

            private var address: JsonField<Address> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trust: Trust) = apply {
                address = trust.address
                name = trust.name
                additionalProperties = trust.additionalProperties.toMutableMap()
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
             */
            fun build(): Trust = Trust(address, name, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Trust = apply {
            if (validated) {
                return@apply
            }

            address().ifPresent { it.validate() }
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
                (if (name.asKnown().isPresent) 1 else 0)

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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws IncreaseInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Trust &&
                address == other.address &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(address, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Trust{address=$address, name=$name, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntityUpdateParams &&
            entityId == other.entityId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(entityId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EntityUpdateParams{entityId=$entityId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
