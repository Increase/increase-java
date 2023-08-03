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

class EntityBeneficialOwnerCreateParams
constructor(
    private val entityId: String,
    private val beneficialOwner: BeneficialOwner,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun entityId(): String = entityId

    fun beneficialOwner(): BeneficialOwner = beneficialOwner

    @JvmSynthetic
    internal fun getBody(): EntityBeneficialOwnerCreateBody {
        return EntityBeneficialOwnerCreateBody(beneficialOwner, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> entityId
            else -> ""
        }
    }

    @JsonDeserialize(builder = EntityBeneficialOwnerCreateBody.Builder::class)
    @NoAutoDetect
    class EntityBeneficialOwnerCreateBody
    internal constructor(
        private val beneficialOwner: BeneficialOwner?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * The identifying details of anyone controlling or owning 25% or more of the corporation.
         */
        @JsonProperty("beneficial_owner") fun beneficialOwner(): BeneficialOwner? = beneficialOwner

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EntityBeneficialOwnerCreateBody &&
                this.beneficialOwner == other.beneficialOwner &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(beneficialOwner, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "EntityBeneficialOwnerCreateBody{beneficialOwner=$beneficialOwner, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var beneficialOwner: BeneficialOwner? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entityBeneficialOwnerCreateBody: EntityBeneficialOwnerCreateBody) =
                apply {
                    this.beneficialOwner = entityBeneficialOwnerCreateBody.beneficialOwner
                    additionalProperties(entityBeneficialOwnerCreateBody.additionalProperties)
                }

            /**
             * The identifying details of anyone controlling or owning 25% or more of the
             * corporation.
             */
            @JsonProperty("beneficial_owner")
            fun beneficialOwner(beneficialOwner: BeneficialOwner) = apply {
                this.beneficialOwner = beneficialOwner
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

            fun build(): EntityBeneficialOwnerCreateBody =
                EntityBeneficialOwnerCreateBody(
                    checkNotNull(beneficialOwner) {
                        "`beneficialOwner` is required but was not set"
                    },
                    additionalProperties.toUnmodifiable()
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

        return other is EntityBeneficialOwnerCreateParams &&
            this.entityId == other.entityId &&
            this.beneficialOwner == other.beneficialOwner &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            entityId,
            beneficialOwner,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "EntityBeneficialOwnerCreateParams{entityId=$entityId, beneficialOwner=$beneficialOwner, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var entityId: String? = null
        private var beneficialOwner: BeneficialOwner? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(entityBeneficialOwnerCreateParams: EntityBeneficialOwnerCreateParams) =
            apply {
                this.entityId = entityBeneficialOwnerCreateParams.entityId
                this.beneficialOwner = entityBeneficialOwnerCreateParams.beneficialOwner
                additionalQueryParams(entityBeneficialOwnerCreateParams.additionalQueryParams)
                additionalHeaders(entityBeneficialOwnerCreateParams.additionalHeaders)
                additionalBodyProperties(entityBeneficialOwnerCreateParams.additionalBodyProperties)
            }

        /** The identifier of the Entity to retrieve. */
        fun entityId(entityId: String) = apply { this.entityId = entityId }

        /**
         * The identifying details of anyone controlling or owning 25% or more of the corporation.
         */
        fun beneficialOwner(beneficialOwner: BeneficialOwner) = apply {
            this.beneficialOwner = beneficialOwner
        }

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

        fun build(): EntityBeneficialOwnerCreateParams =
            EntityBeneficialOwnerCreateParams(
                checkNotNull(entityId) { "`entityId` is required but was not set" },
                checkNotNull(beneficialOwner) { "`beneficialOwner` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /** The identifying details of anyone controlling or owning 25% or more of the corporation. */
    @JsonDeserialize(builder = BeneficialOwner.Builder::class)
    @NoAutoDetect
    class BeneficialOwner
    private constructor(
        private val individual: Individual?,
        private val companyTitle: String?,
        private val prong: Prong?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Personal details for the beneficial owner. */
        @JsonProperty("individual") fun individual(): Individual? = individual

        /** This person's role or title within the entity. */
        @JsonProperty("company_title") fun companyTitle(): String? = companyTitle

        /** Why this person is considered a beneficial owner of the entity. */
        @JsonProperty("prong") fun prong(): Prong? = prong

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
                this.prong == other.prong &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        individual,
                        companyTitle,
                        prong,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "BeneficialOwner{individual=$individual, companyTitle=$companyTitle, prong=$prong, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var individual: Individual? = null
            private var companyTitle: String? = null
            private var prong: Prong? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(beneficialOwner: BeneficialOwner) = apply {
                this.individual = beneficialOwner.individual
                this.companyTitle = beneficialOwner.companyTitle
                this.prong = beneficialOwner.prong
                additionalProperties(beneficialOwner.additionalProperties)
            }

            /** Personal details for the beneficial owner. */
            @JsonProperty("individual")
            fun individual(individual: Individual) = apply { this.individual = individual }

            /** This person's role or title within the entity. */
            @JsonProperty("company_title")
            fun companyTitle(companyTitle: String) = apply { this.companyTitle = companyTitle }

            /** Why this person is considered a beneficial owner of the entity. */
            @JsonProperty("prong") fun prong(prong: Prong) = apply { this.prong = prong }

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

            fun build(): BeneficialOwner =
                BeneficialOwner(
                    checkNotNull(individual) { "`individual` is required but was not set" },
                    companyTitle,
                    checkNotNull(prong) { "`prong` is required but was not set" },
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

            /** The individual's address. */
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

                /** The individual's address. */
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

            /** The individual's address. */
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
