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
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.errors.IncreaseInvalidDataException
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
     * A reference to data stored in a third-party verification service. Your integration may or may
     * not use this field.
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
         * - [governmentAuthority]
         * - [naturalPerson]
         * - [riskRating]
         * - [thirdPartyVerification]
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
         * A reference to data stored in a third-party verification service. Your integration may or
         * may not use this field.
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
    private constructor(
        private val corporation: JsonField<Corporation>,
        private val governmentAuthority: JsonField<GovernmentAuthority>,
        private val naturalPerson: JsonField<NaturalPerson>,
        private val riskRating: JsonField<RiskRating>,
        private val thirdPartyVerification: JsonField<ThirdPartyVerification>,
        private val trust: JsonField<Trust>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("corporation")
            @ExcludeMissing
            corporation: JsonField<Corporation> = JsonMissing.of(),
            @JsonProperty("government_authority")
            @ExcludeMissing
            governmentAuthority: JsonField<GovernmentAuthority> = JsonMissing.of(),
            @JsonProperty("natural_person")
            @ExcludeMissing
            naturalPerson: JsonField<NaturalPerson> = JsonMissing.of(),
            @JsonProperty("risk_rating")
            @ExcludeMissing
            riskRating: JsonField<RiskRating> = JsonMissing.of(),
            @JsonProperty("third_party_verification")
            @ExcludeMissing
            thirdPartyVerification: JsonField<ThirdPartyVerification> = JsonMissing.of(),
            @JsonProperty("trust") @ExcludeMissing trust: JsonField<Trust> = JsonMissing.of(),
        ) : this(
            corporation,
            governmentAuthority,
            naturalPerson,
            riskRating,
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
         * A reference to data stored in a third-party verification service. Your integration may or
         * may not use this field.
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
            private var governmentAuthority: JsonField<GovernmentAuthority> = JsonMissing.of()
            private var naturalPerson: JsonField<NaturalPerson> = JsonMissing.of()
            private var riskRating: JsonField<RiskRating> = JsonMissing.of()
            private var thirdPartyVerification: JsonField<ThirdPartyVerification> = JsonMissing.of()
            private var trust: JsonField<Trust> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                corporation = body.corporation
                governmentAuthority = body.governmentAuthority
                naturalPerson = body.naturalPerson
                riskRating = body.riskRating
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
             * A reference to data stored in a third-party verification service. Your integration
             * may or may not use this field.
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
                    governmentAuthority,
                    naturalPerson,
                    riskRating,
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

            corporation().ifPresent { it.validate() }
            governmentAuthority().ifPresent { it.validate() }
            naturalPerson().ifPresent { it.validate() }
            riskRating().ifPresent { it.validate() }
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
                (governmentAuthority.asKnown().getOrNull()?.validity() ?: 0) +
                (naturalPerson.asKnown().getOrNull()?.validity() ?: 0) +
                (riskRating.asKnown().getOrNull()?.validity() ?: 0) +
                (thirdPartyVerification.asKnown().getOrNull()?.validity() ?: 0) +
                (trust.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                corporation == other.corporation &&
                governmentAuthority == other.governmentAuthority &&
                naturalPerson == other.naturalPerson &&
                riskRating == other.riskRating &&
                thirdPartyVerification == other.thirdPartyVerification &&
                trust == other.trust &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                corporation,
                governmentAuthority,
                naturalPerson,
                riskRating,
                thirdPartyVerification,
                trust,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{corporation=$corporation, governmentAuthority=$governmentAuthority, naturalPerson=$naturalPerson, riskRating=$riskRating, thirdPartyVerification=$thirdPartyVerification, trust=$trust, additionalProperties=$additionalProperties}"
    }

    /**
     * Details of the corporation entity to update. If you specify this parameter and the entity is
     * not a corporation, the request will fail.
     */
    class Corporation
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
         * The legal name of the corporation.
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

            /** Returns a mutable builder for constructing an instance of [Corporation]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Corporation]. */
        class Builder internal constructor() {

            private var address: JsonField<Address> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(corporation: Corporation) = apply {
                address = corporation.address
                name = corporation.name
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
                Corporation(address, name, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Corporation = apply {
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Corporation &&
                address == other.address &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(address, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Corporation{address=$address, name=$name, additionalProperties=$additionalProperties}"
    }

    /**
     * Details of the government authority entity to update. If you specify this parameter and the
     * entity is not a government authority, the request will fail.
     */
    class GovernmentAuthority
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
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(naturalPerson: NaturalPerson) = apply {
                address = naturalPerson.address
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
                NaturalPerson(address, name, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): NaturalPerson = apply {
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is NaturalPerson &&
                address == other.address &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(address, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NaturalPerson{address=$address, name=$name, additionalProperties=$additionalProperties}"
    }

    /**
     * An assessment of the entity’s potential risk of involvement in financial crimes, such as
     * money laundering.
     */
    class RiskRating
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

                /** Low */
                @JvmField val LOW = of("low")

                /** Medium */
                @JvmField val MEDIUM = of("medium")

                /** High */
                @JvmField val HIGH = of("high")

                @JvmStatic fun of(value: String) = Rating(JsonField.of(value))
            }

            /** An enum containing [Rating]'s known values. */
            enum class Known {
                /** Low */
                LOW,
                /** Medium */
                MEDIUM,
                /** High */
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
                /** Low */
                LOW,
                /** Medium */
                MEDIUM,
                /** High */
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

    /**
     * A reference to data stored in a third-party verification service. Your integration may or may
     * not use this field.
     */
    class ThirdPartyVerification
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

    /**
     * Details of the trust entity to update. If you specify this parameter and the entity is not a
     * trust, the request will fail.
     */
    class Trust
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
