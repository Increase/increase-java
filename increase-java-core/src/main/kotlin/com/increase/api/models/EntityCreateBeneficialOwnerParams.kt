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

/** Create a beneficial owner for a corporate Entity */
class EntityCreateBeneficialOwnerParams
constructor(
    private val entityId: String,
    private val body: EntityCreateBeneficialOwnerBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The identifier of the Entity to associate with the new Beneficial Owner. */
    fun entityId(): String = entityId

    /** The identifying details of anyone controlling or owning 25% or more of the corporation. */
    fun beneficialOwner(): BeneficialOwner = body.beneficialOwner()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): EntityCreateBeneficialOwnerBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> entityId
            else -> ""
        }
    }

    @NoAutoDetect
    class EntityCreateBeneficialOwnerBody
    @JsonCreator
    internal constructor(
        @JsonProperty("beneficial_owner") private val beneficialOwner: BeneficialOwner,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The identifying details of anyone controlling or owning 25% or more of the corporation.
         */
        @JsonProperty("beneficial_owner") fun beneficialOwner(): BeneficialOwner = beneficialOwner

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var beneficialOwner: BeneficialOwner? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entityCreateBeneficialOwnerBody: EntityCreateBeneficialOwnerBody) =
                apply {
                    beneficialOwner = entityCreateBeneficialOwnerBody.beneficialOwner
                    additionalProperties =
                        entityCreateBeneficialOwnerBody.additionalProperties.toMutableMap()
                }

            /**
             * The identifying details of anyone controlling or owning 25% or more of the
             * corporation.
             */
            fun beneficialOwner(beneficialOwner: BeneficialOwner) = apply {
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

            fun build(): EntityCreateBeneficialOwnerBody =
                EntityCreateBeneficialOwnerBody(
                    checkNotNull(beneficialOwner) {
                        "`beneficialOwner` is required but was not set"
                    },
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EntityCreateBeneficialOwnerBody && beneficialOwner == other.beneficialOwner && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(beneficialOwner, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EntityCreateBeneficialOwnerBody{beneficialOwner=$beneficialOwner, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var entityId: String? = null
        private var body: EntityCreateBeneficialOwnerBody.Builder =
            EntityCreateBeneficialOwnerBody.builder()
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

        fun build(): EntityCreateBeneficialOwnerParams =
            EntityCreateBeneficialOwnerParams(
                checkNotNull(entityId) { "`entityId` is required but was not set" },
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** The identifying details of anyone controlling or owning 25% or more of the corporation. */
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
         * Why this person is considered a beneficial owner of the entity. At least one option is
         * required, if a person is both a control person and owner, submit an array containing
         * both.
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
             * Why this person is considered a beneficial owner of the entity. At least one option
             * is required, if a person is both a control person and owner, submit an array
             * containing both.
             */
            fun prongs(prongs: List<Prong>) = apply { this.prongs = prongs.toMutableList() }

            /**
             * Why this person is considered a beneficial owner of the entity. At least one option
             * is required, if a person is both a control person and owner, submit an array
             * containing both.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): BeneficialOwner =
                BeneficialOwner(
                    checkNotNull(individual) { "`individual` is required but was not set" },
                    checkNotNull(prongs) { "`prongs` is required but was not set" }.toImmutable(),
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

        return /* spotless:off */ other is EntityCreateBeneficialOwnerParams && entityId == other.entityId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(entityId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EntityCreateBeneficialOwnerParams{entityId=$entityId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
