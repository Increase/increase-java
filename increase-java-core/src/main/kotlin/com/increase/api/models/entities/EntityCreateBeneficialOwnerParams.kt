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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a beneficial owner for a corporate Entity */
class EntityCreateBeneficialOwnerParams
private constructor(
    private val entityId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the Entity to associate with the new Beneficial Owner. */
    fun entityId(): String = entityId

    /**
     * The identifying details of anyone controlling or owning 25% or more of the corporation.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun beneficialOwner(): BeneficialOwner = body.beneficialOwner()

    /**
     * Returns the raw JSON value of [beneficialOwner].
     *
     * Unlike [beneficialOwner], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _beneficialOwner(): JsonField<BeneficialOwner> = body._beneficialOwner()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [EntityCreateBeneficialOwnerParams].
         *
         * The following fields are required:
         * ```java
         * .entityId()
         * .beneficialOwner()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EntityCreateBeneficialOwnerParams]. */
    class Builder internal constructor() {

        private var entityId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(entityCreateBeneficialOwnerParams: EntityCreateBeneficialOwnerParams) =
            apply {
                entityId = entityCreateBeneficialOwnerParams.entityId
                body = entityCreateBeneficialOwnerParams.body.toBuilder()
                additionalHeaders = entityCreateBeneficialOwnerParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    entityCreateBeneficialOwnerParams.additionalQueryParams.toBuilder()
            }

        /** The identifier of the Entity to associate with the new Beneficial Owner. */
        fun entityId(entityId: String) = apply { this.entityId = entityId }

        /**
         * The identifying details of anyone controlling or owning 25% or more of the corporation.
         */
        fun beneficialOwner(beneficialOwner: BeneficialOwner) = apply {
            body.beneficialOwner(beneficialOwner)
        }

        /**
         * Sets [Builder.beneficialOwner] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficialOwner] with a well-typed [BeneficialOwner]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun beneficialOwner(beneficialOwner: JsonField<BeneficialOwner>) = apply {
            body.beneficialOwner(beneficialOwner)
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
         * Returns an immutable instance of [EntityCreateBeneficialOwnerParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .entityId()
         * .beneficialOwner()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EntityCreateBeneficialOwnerParams =
            EntityCreateBeneficialOwnerParams(
                checkRequired("entityId", entityId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JvmSynthetic internal fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> entityId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val beneficialOwner: JsonField<BeneficialOwner>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("beneficial_owner")
            @ExcludeMissing
            beneficialOwner: JsonField<BeneficialOwner> = JsonMissing.of()
        ) : this(beneficialOwner, mutableMapOf())

        /**
         * The identifying details of anyone controlling or owning 25% or more of the corporation.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun beneficialOwner(): BeneficialOwner = beneficialOwner.getRequired("beneficial_owner")

        /**
         * Returns the raw JSON value of [beneficialOwner].
         *
         * Unlike [beneficialOwner], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("beneficial_owner")
        @ExcludeMissing
        fun _beneficialOwner(): JsonField<BeneficialOwner> = beneficialOwner

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
             * .beneficialOwner()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var beneficialOwner: JsonField<BeneficialOwner>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                beneficialOwner = body.beneficialOwner
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The identifying details of anyone controlling or owning 25% or more of the
             * corporation.
             */
            fun beneficialOwner(beneficialOwner: BeneficialOwner) =
                beneficialOwner(JsonField.of(beneficialOwner))

            /**
             * Sets [Builder.beneficialOwner] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficialOwner] with a well-typed [BeneficialOwner]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun beneficialOwner(beneficialOwner: JsonField<BeneficialOwner>) = apply {
                this.beneficialOwner = beneficialOwner
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .beneficialOwner()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("beneficialOwner", beneficialOwner),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            beneficialOwner().validate()
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
        internal fun validity(): Int = (beneficialOwner.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && beneficialOwner == other.beneficialOwner && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(beneficialOwner, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{beneficialOwner=$beneficialOwner, additionalProperties=$additionalProperties}"
    }

    /** The identifying details of anyone controlling or owning 25% or more of the corporation. */
    class BeneficialOwner
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
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun individual(): Individual = individual.getRequired("individual")

        /**
         * Why this person is considered a beneficial owner of the entity. At least one option is
         * required, if a person is both a control person and owner, submit an array containing
         * both.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun prongs(): List<Prong> = prongs.getRequired("prongs")

        /**
         * This person's role or title within the entity.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyTitle(): Optional<String> =
            Optional.ofNullable(companyTitle.getNullable("company_title"))

        /**
         * Returns the raw JSON value of [individual].
         *
         * Unlike [individual], this method doesn't throw if the JSON field has an unexpected type.
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
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun individual(individual: JsonField<Individual>) = apply {
                this.individual = individual
            }

            /**
             * Why this person is considered a beneficial owner of the entity. At least one option
             * is required, if a person is both a control person and owner, submit an array
             * containing both.
             */
            fun prongs(prongs: List<Prong>) = prongs(JsonField.of(prongs))

            /**
             * Sets [Builder.prongs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prongs] with a well-typed `List<Prong>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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
                Optional.ofNullable(confirmedNoUsTaxId.getNullable("confirmed_no_us_tax_id"))

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
            private constructor(
                private val country: JsonField<String>,
                private val line1: JsonField<String>,
                private val city: JsonField<String>,
                private val line2: JsonField<String>,
                private val state: JsonField<String>,
                private val zip: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("country")
                    @ExcludeMissing
                    country: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line1")
                    @ExcludeMissing
                    line1: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("city")
                    @ExcludeMissing
                    city: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line2")
                    @ExcludeMissing
                    line2: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("state")
                    @ExcludeMissing
                    state: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
                ) : this(country, line1, city, line2, state, zip, mutableMapOf())

                /**
                 * The two-letter ISO 3166-1 alpha-2 code for the country of the address.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun country(): String = country.getRequired("country")

                /**
                 * The first line of the address. This is usually the street number and street.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun line1(): String = line1.getRequired("line1")

                /**
                 * The city, district, town, or village of the address. Required in certain
                 * countries.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun city(): Optional<String> = Optional.ofNullable(city.getNullable("city"))

                /**
                 * The second line of the address. This might be the floor or room number.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the US state,
                 * province, or region of the address. Required in certain countries.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun state(): Optional<String> = Optional.ofNullable(state.getNullable("state"))

                /**
                 * The ZIP or postal code of the address. Required in certain countries.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun zip(): Optional<String> = Optional.ofNullable(zip.getNullable("zip"))

                /**
                 * Returns the raw JSON value of [country].
                 *
                 * Unlike [country], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

                /**
                 * Returns the raw JSON value of [line1].
                 *
                 * Unlike [line1], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

                /**
                 * Returns the raw JSON value of [city].
                 *
                 * Unlike [city], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

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
                     * .country()
                     * .line1()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Address]. */
                class Builder internal constructor() {

                    private var country: JsonField<String>? = null
                    private var line1: JsonField<String>? = null
                    private var city: JsonField<String> = JsonMissing.of()
                    private var line2: JsonField<String> = JsonMissing.of()
                    private var state: JsonField<String> = JsonMissing.of()
                    private var zip: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(address: Address) = apply {
                        country = address.country
                        line1 = address.line1
                        city = address.city
                        line2 = address.line2
                        state = address.state
                        zip = address.zip
                        additionalProperties = address.additionalProperties.toMutableMap()
                    }

                    /** The two-letter ISO 3166-1 alpha-2 code for the country of the address. */
                    fun country(country: String) = country(JsonField.of(country))

                    /**
                     * Sets [Builder.country] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.country] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun country(country: JsonField<String>) = apply { this.country = country }

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
                     * The city, district, town, or village of the address. Required in certain
                     * countries.
                     */
                    fun city(city: String) = city(JsonField.of(city))

                    /**
                     * Sets [Builder.city] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.city] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun city(city: JsonField<String>) = apply { this.city = city }

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

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the US
                     * state, province, or region of the address. Required in certain countries.
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

                    /** The ZIP or postal code of the address. Required in certain countries. */
                    fun zip(zip: String) = zip(JsonField.of(zip))

                    /**
                     * Sets [Builder.zip] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.zip] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * .country()
                     * .line1()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Address =
                        Address(
                            checkRequired("country", country),
                            checkRequired("line1", line1),
                            city,
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

                    country()
                    line1()
                    city()
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
                    (if (country.asKnown().isPresent) 1 else 0) +
                        (if (line1.asKnown().isPresent) 1 else 0) +
                        (if (city.asKnown().isPresent) 1 else 0) +
                        (if (line2.asKnown().isPresent) 1 else 0) +
                        (if (state.asKnown().isPresent) 1 else 0) +
                        (if (zip.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Address && country == other.country && line1 == other.line1 && city == other.city && line2 == other.line2 && state == other.state && zip == other.zip && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(country, line1, city, line2, state, zip, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Address{country=$country, line1=$line1, city=$city, line2=$line2, state=$state, zip=$zip, additionalProperties=$additionalProperties}"
            }

            /** A means of verifying the person's identity. */
            class Identification
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
                    Optional.ofNullable(driversLicense.getNullable("drivers_license"))

                /**
                 * Information about the identification document provided. Required if `method` is
                 * equal to `other`.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun other(): Optional<Other> = Optional.ofNullable(other.getNullable("other"))

                /**
                 * Information about the passport used for identification. Required if `method` is
                 * equal to `passport`.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun passport(): Optional<Passport> =
                    Optional.ofNullable(passport.getNullable("passport"))

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

                        return /* spotless:off */ other is Method && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /**
                 * Information about the United States driver's license used for identification.
                 * Required if `method` is equal to `drivers_license`.
                 */
                class DriversLicense
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
                    fun backFileId(): Optional<String> =
                        Optional.ofNullable(backFileId.getNullable("back_file_id"))

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
                class Other
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
                     * document.
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
                    fun backFileId(): Optional<String> =
                        Optional.ofNullable(backFileId.getNullable("back_file_id"))

                    /**
                     * The document's expiration date in YYYY-MM-DD format.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun expirationDate(): Optional<LocalDate> =
                        Optional.ofNullable(expirationDate.getNullable("expiration_date"))

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
                         * the document.
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
                class Passport
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
                     * The country that issued the passport.
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

                        /** The country that issued the passport. */
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

        class Prong @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** A person with 25% or greater direct or indirect ownership of the entity. */
                OWNERSHIP,
                /** A person who manages, directs, or has significant control of the entity. */
                CONTROL,
                /**
                 * An enum member indicating that [Prong] was instantiated with an unknown value.
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
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
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
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
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

        return /* spotless:off */ other is EntityCreateBeneficialOwnerParams && entityId == other.entityId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(entityId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EntityCreateBeneficialOwnerParams{entityId=$entityId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
