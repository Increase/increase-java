// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

/** Create a Real-Time Payments Request for Payment */
class RealTimePaymentsRequestForPaymentCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The requested amount in USD cents. Must be positive. */
    fun amount(): Long = body.amount()

    /** Details of the person being requested to pay. */
    fun debtor(): Debtor = body.debtor()

    /** The identifier of the Account Number where the funds will land. */
    fun destinationAccountNumberId(): String = body.destinationAccountNumberId()

    /**
     * The expiration time for this request, in UTC. The requestee will not be able to pay after
     * this date.
     */
    fun expiresAt(): LocalDate = body.expiresAt()

    /** Unstructured information that will show on the requestee's bank statement. */
    fun remittanceInformation(): String = body.remittanceInformation()

    /** The account number the funds will be requested from. */
    fun sourceAccountNumber(): String = body.sourceAccountNumber()

    /** The requestee's American Bankers' Association (ABA) Routing Transit Number (RTN). */
    fun sourceRoutingNumber(): String = body.sourceRoutingNumber()

    /** The requested amount in USD cents. Must be positive. */
    fun _amount(): JsonField<Long> = body._amount()

    /** Details of the person being requested to pay. */
    fun _debtor(): JsonField<Debtor> = body._debtor()

    /** The identifier of the Account Number where the funds will land. */
    fun _destinationAccountNumberId(): JsonField<String> = body._destinationAccountNumberId()

    /**
     * The expiration time for this request, in UTC. The requestee will not be able to pay after
     * this date.
     */
    fun _expiresAt(): JsonField<LocalDate> = body._expiresAt()

    /** Unstructured information that will show on the requestee's bank statement. */
    fun _remittanceInformation(): JsonField<String> = body._remittanceInformation()

    /** The account number the funds will be requested from. */
    fun _sourceAccountNumber(): JsonField<String> = body._sourceAccountNumber()

    /** The requestee's American Bankers' Association (ABA) Routing Transit Number (RTN). */
    fun _sourceRoutingNumber(): JsonField<String> = body._sourceRoutingNumber()

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
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("debtor")
        @ExcludeMissing
        private val debtor: JsonField<Debtor> = JsonMissing.of(),
        @JsonProperty("destination_account_number_id")
        @ExcludeMissing
        private val destinationAccountNumberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        private val expiresAt: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("remittance_information")
        @ExcludeMissing
        private val remittanceInformation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_account_number")
        @ExcludeMissing
        private val sourceAccountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_routing_number")
        @ExcludeMissing
        private val sourceRoutingNumber: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The requested amount in USD cents. Must be positive. */
        fun amount(): Long = amount.getRequired("amount")

        /** Details of the person being requested to pay. */
        fun debtor(): Debtor = debtor.getRequired("debtor")

        /** The identifier of the Account Number where the funds will land. */
        fun destinationAccountNumberId(): String =
            destinationAccountNumberId.getRequired("destination_account_number_id")

        /**
         * The expiration time for this request, in UTC. The requestee will not be able to pay after
         * this date.
         */
        fun expiresAt(): LocalDate = expiresAt.getRequired("expires_at")

        /** Unstructured information that will show on the requestee's bank statement. */
        fun remittanceInformation(): String =
            remittanceInformation.getRequired("remittance_information")

        /** The account number the funds will be requested from. */
        fun sourceAccountNumber(): String = sourceAccountNumber.getRequired("source_account_number")

        /** The requestee's American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun sourceRoutingNumber(): String = sourceRoutingNumber.getRequired("source_routing_number")

        /** The requested amount in USD cents. Must be positive. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** Details of the person being requested to pay. */
        @JsonProperty("debtor") @ExcludeMissing fun _debtor(): JsonField<Debtor> = debtor

        /** The identifier of the Account Number where the funds will land. */
        @JsonProperty("destination_account_number_id")
        @ExcludeMissing
        fun _destinationAccountNumberId(): JsonField<String> = destinationAccountNumberId

        /**
         * The expiration time for this request, in UTC. The requestee will not be able to pay after
         * this date.
         */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): JsonField<LocalDate> = expiresAt

        /** Unstructured information that will show on the requestee's bank statement. */
        @JsonProperty("remittance_information")
        @ExcludeMissing
        fun _remittanceInformation(): JsonField<String> = remittanceInformation

        /** The account number the funds will be requested from. */
        @JsonProperty("source_account_number")
        @ExcludeMissing
        fun _sourceAccountNumber(): JsonField<String> = sourceAccountNumber

        /** The requestee's American Bankers' Association (ABA) Routing Transit Number (RTN). */
        @JsonProperty("source_routing_number")
        @ExcludeMissing
        fun _sourceRoutingNumber(): JsonField<String> = sourceRoutingNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            amount()
            debtor().validate()
            destinationAccountNumberId()
            expiresAt()
            remittanceInformation()
            sourceAccountNumber()
            sourceRoutingNumber()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var debtor: JsonField<Debtor>? = null
            private var destinationAccountNumberId: JsonField<String>? = null
            private var expiresAt: JsonField<LocalDate>? = null
            private var remittanceInformation: JsonField<String>? = null
            private var sourceAccountNumber: JsonField<String>? = null
            private var sourceRoutingNumber: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                amount = body.amount
                debtor = body.debtor
                destinationAccountNumberId = body.destinationAccountNumberId
                expiresAt = body.expiresAt
                remittanceInformation = body.remittanceInformation
                sourceAccountNumber = body.sourceAccountNumber
                sourceRoutingNumber = body.sourceRoutingNumber
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The requested amount in USD cents. Must be positive. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The requested amount in USD cents. Must be positive. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** Details of the person being requested to pay. */
            fun debtor(debtor: Debtor) = debtor(JsonField.of(debtor))

            /** Details of the person being requested to pay. */
            fun debtor(debtor: JsonField<Debtor>) = apply { this.debtor = debtor }

            /** The identifier of the Account Number where the funds will land. */
            fun destinationAccountNumberId(destinationAccountNumberId: String) =
                destinationAccountNumberId(JsonField.of(destinationAccountNumberId))

            /** The identifier of the Account Number where the funds will land. */
            fun destinationAccountNumberId(destinationAccountNumberId: JsonField<String>) = apply {
                this.destinationAccountNumberId = destinationAccountNumberId
            }

            /**
             * The expiration time for this request, in UTC. The requestee will not be able to pay
             * after this date.
             */
            fun expiresAt(expiresAt: LocalDate) = expiresAt(JsonField.of(expiresAt))

            /**
             * The expiration time for this request, in UTC. The requestee will not be able to pay
             * after this date.
             */
            fun expiresAt(expiresAt: JsonField<LocalDate>) = apply { this.expiresAt = expiresAt }

            /** Unstructured information that will show on the requestee's bank statement. */
            fun remittanceInformation(remittanceInformation: String) =
                remittanceInformation(JsonField.of(remittanceInformation))

            /** Unstructured information that will show on the requestee's bank statement. */
            fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                this.remittanceInformation = remittanceInformation
            }

            /** The account number the funds will be requested from. */
            fun sourceAccountNumber(sourceAccountNumber: String) =
                sourceAccountNumber(JsonField.of(sourceAccountNumber))

            /** The account number the funds will be requested from. */
            fun sourceAccountNumber(sourceAccountNumber: JsonField<String>) = apply {
                this.sourceAccountNumber = sourceAccountNumber
            }

            /** The requestee's American Bankers' Association (ABA) Routing Transit Number (RTN). */
            fun sourceRoutingNumber(sourceRoutingNumber: String) =
                sourceRoutingNumber(JsonField.of(sourceRoutingNumber))

            /** The requestee's American Bankers' Association (ABA) Routing Transit Number (RTN). */
            fun sourceRoutingNumber(sourceRoutingNumber: JsonField<String>) = apply {
                this.sourceRoutingNumber = sourceRoutingNumber
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

            fun build(): Body =
                Body(
                    checkRequired("amount", amount),
                    checkRequired("debtor", debtor),
                    checkRequired("destinationAccountNumberId", destinationAccountNumberId),
                    checkRequired("expiresAt", expiresAt),
                    checkRequired("remittanceInformation", remittanceInformation),
                    checkRequired("sourceAccountNumber", sourceAccountNumber),
                    checkRequired("sourceRoutingNumber", sourceRoutingNumber),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && amount == other.amount && debtor == other.debtor && destinationAccountNumberId == other.destinationAccountNumberId && expiresAt == other.expiresAt && remittanceInformation == other.remittanceInformation && sourceAccountNumber == other.sourceAccountNumber && sourceRoutingNumber == other.sourceRoutingNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, debtor, destinationAccountNumberId, expiresAt, remittanceInformation, sourceAccountNumber, sourceRoutingNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{amount=$amount, debtor=$debtor, destinationAccountNumberId=$destinationAccountNumberId, expiresAt=$expiresAt, remittanceInformation=$remittanceInformation, sourceAccountNumber=$sourceAccountNumber, sourceRoutingNumber=$sourceRoutingNumber, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RealTimePaymentsRequestForPaymentCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            realTimePaymentsRequestForPaymentCreateParams:
                RealTimePaymentsRequestForPaymentCreateParams
        ) = apply {
            body = realTimePaymentsRequestForPaymentCreateParams.body.toBuilder()
            additionalHeaders =
                realTimePaymentsRequestForPaymentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                realTimePaymentsRequestForPaymentCreateParams.additionalQueryParams.toBuilder()
        }

        /** The requested amount in USD cents. Must be positive. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /** The requested amount in USD cents. Must be positive. */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** Details of the person being requested to pay. */
        fun debtor(debtor: Debtor) = apply { body.debtor(debtor) }

        /** Details of the person being requested to pay. */
        fun debtor(debtor: JsonField<Debtor>) = apply { body.debtor(debtor) }

        /** The identifier of the Account Number where the funds will land. */
        fun destinationAccountNumberId(destinationAccountNumberId: String) = apply {
            body.destinationAccountNumberId(destinationAccountNumberId)
        }

        /** The identifier of the Account Number where the funds will land. */
        fun destinationAccountNumberId(destinationAccountNumberId: JsonField<String>) = apply {
            body.destinationAccountNumberId(destinationAccountNumberId)
        }

        /**
         * The expiration time for this request, in UTC. The requestee will not be able to pay after
         * this date.
         */
        fun expiresAt(expiresAt: LocalDate) = apply { body.expiresAt(expiresAt) }

        /**
         * The expiration time for this request, in UTC. The requestee will not be able to pay after
         * this date.
         */
        fun expiresAt(expiresAt: JsonField<LocalDate>) = apply { body.expiresAt(expiresAt) }

        /** Unstructured information that will show on the requestee's bank statement. */
        fun remittanceInformation(remittanceInformation: String) = apply {
            body.remittanceInformation(remittanceInformation)
        }

        /** Unstructured information that will show on the requestee's bank statement. */
        fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
            body.remittanceInformation(remittanceInformation)
        }

        /** The account number the funds will be requested from. */
        fun sourceAccountNumber(sourceAccountNumber: String) = apply {
            body.sourceAccountNumber(sourceAccountNumber)
        }

        /** The account number the funds will be requested from. */
        fun sourceAccountNumber(sourceAccountNumber: JsonField<String>) = apply {
            body.sourceAccountNumber(sourceAccountNumber)
        }

        /** The requestee's American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun sourceRoutingNumber(sourceRoutingNumber: String) = apply {
            body.sourceRoutingNumber(sourceRoutingNumber)
        }

        /** The requestee's American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun sourceRoutingNumber(sourceRoutingNumber: JsonField<String>) = apply {
            body.sourceRoutingNumber(sourceRoutingNumber)
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

        fun build(): RealTimePaymentsRequestForPaymentCreateParams =
            RealTimePaymentsRequestForPaymentCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Details of the person being requested to pay. */
    @NoAutoDetect
    class Debtor
    @JsonCreator
    private constructor(
        @JsonProperty("address")
        @ExcludeMissing
        private val address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Address of the debtor. */
        fun address(): Address = address.getRequired("address")

        /** The name of the debtor. */
        fun name(): String = name.getRequired("name")

        /** Address of the debtor. */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /** The name of the debtor. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Debtor = apply {
            if (validated) {
                return@apply
            }

            address().validate()
            name()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Debtor]. */
        class Builder internal constructor() {

            private var address: JsonField<Address>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(debtor: Debtor) = apply {
                address = debtor.address
                name = debtor.name
                additionalProperties = debtor.additionalProperties.toMutableMap()
            }

            /** Address of the debtor. */
            fun address(address: Address) = address(JsonField.of(address))

            /** Address of the debtor. */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** The name of the debtor. */
            fun name(name: String) = name(JsonField.of(name))

            /** The name of the debtor. */
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

            fun build(): Debtor =
                Debtor(
                    checkRequired("address", address),
                    checkRequired("name", name),
                    additionalProperties.toImmutable(),
                )
        }

        /** Address of the debtor. */
        @NoAutoDetect
        class Address
        @JsonCreator
        private constructor(
            @JsonProperty("country")
            @ExcludeMissing
            private val country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("city")
            @ExcludeMissing
            private val city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("post_code")
            @ExcludeMissing
            private val postCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("street_name")
            @ExcludeMissing
            private val streetName: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The ISO 3166, Alpha-2 country code. */
            fun country(): String = country.getRequired("country")

            /** The town or city. */
            fun city(): Optional<String> = Optional.ofNullable(city.getNullable("city"))

            /** The postal code or zip. */
            fun postCode(): Optional<String> =
                Optional.ofNullable(postCode.getNullable("post_code"))

            /** The street name without the street number. */
            fun streetName(): Optional<String> =
                Optional.ofNullable(streetName.getNullable("street_name"))

            /** The ISO 3166, Alpha-2 country code. */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

            /** The town or city. */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /** The postal code or zip. */
            @JsonProperty("post_code") @ExcludeMissing fun _postCode(): JsonField<String> = postCode

            /** The street name without the street number. */
            @JsonProperty("street_name")
            @ExcludeMissing
            fun _streetName(): JsonField<String> = streetName

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Address = apply {
                if (validated) {
                    return@apply
                }

                country()
                city()
                postCode()
                streetName()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Address]. */
            class Builder internal constructor() {

                private var country: JsonField<String>? = null
                private var city: JsonField<String> = JsonMissing.of()
                private var postCode: JsonField<String> = JsonMissing.of()
                private var streetName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    country = address.country
                    city = address.city
                    postCode = address.postCode
                    streetName = address.streetName
                    additionalProperties = address.additionalProperties.toMutableMap()
                }

                /** The ISO 3166, Alpha-2 country code. */
                fun country(country: String) = country(JsonField.of(country))

                /** The ISO 3166, Alpha-2 country code. */
                fun country(country: JsonField<String>) = apply { this.country = country }

                /** The town or city. */
                fun city(city: String) = city(JsonField.of(city))

                /** The town or city. */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The postal code or zip. */
                fun postCode(postCode: String) = postCode(JsonField.of(postCode))

                /** The postal code or zip. */
                fun postCode(postCode: JsonField<String>) = apply { this.postCode = postCode }

                /** The street name without the street number. */
                fun streetName(streetName: String) = streetName(JsonField.of(streetName))

                /** The street name without the street number. */
                fun streetName(streetName: JsonField<String>) = apply {
                    this.streetName = streetName
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

                fun build(): Address =
                    Address(
                        checkRequired("country", country),
                        city,
                        postCode,
                        streetName,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Address && country == other.country && city == other.city && postCode == other.postCode && streetName == other.streetName && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(country, city, postCode, streetName, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{country=$country, city=$city, postCode=$postCode, streetName=$streetName, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Debtor && address == other.address && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Debtor{address=$address, name=$name, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RealTimePaymentsRequestForPaymentCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "RealTimePaymentsRequestForPaymentCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
