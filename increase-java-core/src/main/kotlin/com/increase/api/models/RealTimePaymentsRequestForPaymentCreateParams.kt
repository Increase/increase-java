// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class RealTimePaymentsRequestForPaymentCreateParams
constructor(
    private val amount: Long,
    private val debtor: Debtor,
    private val destinationAccountNumberId: String,
    private val expiresAt: LocalDate,
    private val remittanceInformation: String,
    private val sourceAccountNumber: String,
    private val sourceRoutingNumber: String,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun debtor(): Debtor = debtor

    fun destinationAccountNumberId(): String = destinationAccountNumberId

    fun expiresAt(): LocalDate = expiresAt

    fun remittanceInformation(): String = remittanceInformation

    fun sourceAccountNumber(): String = sourceAccountNumber

    fun sourceRoutingNumber(): String = sourceRoutingNumber

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): RealTimePaymentsRequestForPaymentCreateBody {
        return RealTimePaymentsRequestForPaymentCreateBody(
            amount,
            debtor,
            destinationAccountNumberId,
            expiresAt,
            remittanceInformation,
            sourceAccountNumber,
            sourceRoutingNumber,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = RealTimePaymentsRequestForPaymentCreateBody.Builder::class)
    @NoAutoDetect
    class RealTimePaymentsRequestForPaymentCreateBody
    internal constructor(
        private val amount: Long,
        private val debtor: Debtor,
        private val destinationAccountNumberId: String,
        private val expiresAt: LocalDate,
        private val remittanceInformation: String,
        private val sourceAccountNumber: String,
        private val sourceRoutingNumber: String,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The requested amount in USD cents. Must be positive. */
        @JsonProperty("amount") fun amount(): Long = amount

        /** Details of the person being requested to pay. */
        @JsonProperty("debtor") fun debtor(): Debtor = debtor

        /** The identifier of the Account Number where the funds will land. */
        @JsonProperty("destination_account_number_id")
        fun destinationAccountNumberId(): String = destinationAccountNumberId

        /**
         * The expiration time for this request, in UTC. The requestee will not be able to pay after
         * this date.
         */
        @JsonProperty("expires_at") fun expiresAt(): LocalDate = expiresAt

        /** Unstructured information that will show on the requestee's bank statement. */
        @JsonProperty("remittance_information")
        fun remittanceInformation(): String = remittanceInformation

        /** The account number the funds will be requested from. */
        @JsonProperty("source_account_number")
        fun sourceAccountNumber(): String = sourceAccountNumber

        /** The requestee's American Bankers' Association (ABA) Routing Transit Number (RTN). */
        @JsonProperty("source_routing_number")
        fun sourceRoutingNumber(): String = sourceRoutingNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var debtor: Debtor? = null
            private var destinationAccountNumberId: String? = null
            private var expiresAt: LocalDate? = null
            private var remittanceInformation: String? = null
            private var sourceAccountNumber: String? = null
            private var sourceRoutingNumber: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                realTimePaymentsRequestForPaymentCreateBody:
                    RealTimePaymentsRequestForPaymentCreateBody
            ) = apply {
                amount = realTimePaymentsRequestForPaymentCreateBody.amount
                debtor = realTimePaymentsRequestForPaymentCreateBody.debtor
                destinationAccountNumberId =
                    realTimePaymentsRequestForPaymentCreateBody.destinationAccountNumberId
                expiresAt = realTimePaymentsRequestForPaymentCreateBody.expiresAt
                remittanceInformation =
                    realTimePaymentsRequestForPaymentCreateBody.remittanceInformation
                sourceAccountNumber =
                    realTimePaymentsRequestForPaymentCreateBody.sourceAccountNumber
                sourceRoutingNumber =
                    realTimePaymentsRequestForPaymentCreateBody.sourceRoutingNumber
                additionalProperties =
                    realTimePaymentsRequestForPaymentCreateBody.additionalProperties.toMutableMap()
            }

            /** The requested amount in USD cents. Must be positive. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** Details of the person being requested to pay. */
            @JsonProperty("debtor") fun debtor(debtor: Debtor) = apply { this.debtor = debtor }

            /** The identifier of the Account Number where the funds will land. */
            @JsonProperty("destination_account_number_id")
            fun destinationAccountNumberId(destinationAccountNumberId: String) = apply {
                this.destinationAccountNumberId = destinationAccountNumberId
            }

            /**
             * The expiration time for this request, in UTC. The requestee will not be able to pay
             * after this date.
             */
            @JsonProperty("expires_at")
            fun expiresAt(expiresAt: LocalDate) = apply { this.expiresAt = expiresAt }

            /** Unstructured information that will show on the requestee's bank statement. */
            @JsonProperty("remittance_information")
            fun remittanceInformation(remittanceInformation: String) = apply {
                this.remittanceInformation = remittanceInformation
            }

            /** The account number the funds will be requested from. */
            @JsonProperty("source_account_number")
            fun sourceAccountNumber(sourceAccountNumber: String) = apply {
                this.sourceAccountNumber = sourceAccountNumber
            }

            /** The requestee's American Bankers' Association (ABA) Routing Transit Number (RTN). */
            @JsonProperty("source_routing_number")
            fun sourceRoutingNumber(sourceRoutingNumber: String) = apply {
                this.sourceRoutingNumber = sourceRoutingNumber
            }

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

            fun build(): RealTimePaymentsRequestForPaymentCreateBody =
                RealTimePaymentsRequestForPaymentCreateBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(debtor) { "`debtor` is required but was not set" },
                    checkNotNull(destinationAccountNumberId) {
                        "`destinationAccountNumberId` is required but was not set"
                    },
                    checkNotNull(expiresAt) { "`expiresAt` is required but was not set" },
                    checkNotNull(remittanceInformation) {
                        "`remittanceInformation` is required but was not set"
                    },
                    checkNotNull(sourceAccountNumber) {
                        "`sourceAccountNumber` is required but was not set"
                    },
                    checkNotNull(sourceRoutingNumber) {
                        "`sourceRoutingNumber` is required but was not set"
                    },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RealTimePaymentsRequestForPaymentCreateBody && amount == other.amount && debtor == other.debtor && destinationAccountNumberId == other.destinationAccountNumberId && expiresAt == other.expiresAt && remittanceInformation == other.remittanceInformation && sourceAccountNumber == other.sourceAccountNumber && sourceRoutingNumber == other.sourceRoutingNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, debtor, destinationAccountNumberId, expiresAt, remittanceInformation, sourceAccountNumber, sourceRoutingNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RealTimePaymentsRequestForPaymentCreateBody{amount=$amount, debtor=$debtor, destinationAccountNumberId=$destinationAccountNumberId, expiresAt=$expiresAt, remittanceInformation=$remittanceInformation, sourceAccountNumber=$sourceAccountNumber, sourceRoutingNumber=$sourceRoutingNumber, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var debtor: Debtor? = null
        private var destinationAccountNumberId: String? = null
        private var expiresAt: LocalDate? = null
        private var remittanceInformation: String? = null
        private var sourceAccountNumber: String? = null
        private var sourceRoutingNumber: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            realTimePaymentsRequestForPaymentCreateParams:
                RealTimePaymentsRequestForPaymentCreateParams
        ) = apply {
            amount = realTimePaymentsRequestForPaymentCreateParams.amount
            debtor = realTimePaymentsRequestForPaymentCreateParams.debtor
            destinationAccountNumberId =
                realTimePaymentsRequestForPaymentCreateParams.destinationAccountNumberId
            expiresAt = realTimePaymentsRequestForPaymentCreateParams.expiresAt
            remittanceInformation =
                realTimePaymentsRequestForPaymentCreateParams.remittanceInformation
            sourceAccountNumber = realTimePaymentsRequestForPaymentCreateParams.sourceAccountNumber
            sourceRoutingNumber = realTimePaymentsRequestForPaymentCreateParams.sourceRoutingNumber
            additionalHeaders =
                realTimePaymentsRequestForPaymentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                realTimePaymentsRequestForPaymentCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                realTimePaymentsRequestForPaymentCreateParams.additionalBodyProperties
                    .toMutableMap()
        }

        /** The requested amount in USD cents. Must be positive. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** Details of the person being requested to pay. */
        fun debtor(debtor: Debtor) = apply { this.debtor = debtor }

        /** The identifier of the Account Number where the funds will land. */
        fun destinationAccountNumberId(destinationAccountNumberId: String) = apply {
            this.destinationAccountNumberId = destinationAccountNumberId
        }

        /**
         * The expiration time for this request, in UTC. The requestee will not be able to pay after
         * this date.
         */
        fun expiresAt(expiresAt: LocalDate) = apply { this.expiresAt = expiresAt }

        /** Unstructured information that will show on the requestee's bank statement. */
        fun remittanceInformation(remittanceInformation: String) = apply {
            this.remittanceInformation = remittanceInformation
        }

        /** The account number the funds will be requested from. */
        fun sourceAccountNumber(sourceAccountNumber: String) = apply {
            this.sourceAccountNumber = sourceAccountNumber
        }

        /** The requestee's American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun sourceRoutingNumber(sourceRoutingNumber: String) = apply {
            this.sourceRoutingNumber = sourceRoutingNumber
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

        fun build(): RealTimePaymentsRequestForPaymentCreateParams =
            RealTimePaymentsRequestForPaymentCreateParams(
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(debtor) { "`debtor` is required but was not set" },
                checkNotNull(destinationAccountNumberId) {
                    "`destinationAccountNumberId` is required but was not set"
                },
                checkNotNull(expiresAt) { "`expiresAt` is required but was not set" },
                checkNotNull(remittanceInformation) {
                    "`remittanceInformation` is required but was not set"
                },
                checkNotNull(sourceAccountNumber) {
                    "`sourceAccountNumber` is required but was not set"
                },
                checkNotNull(sourceRoutingNumber) {
                    "`sourceRoutingNumber` is required but was not set"
                },
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /** Details of the person being requested to pay. */
    @JsonDeserialize(builder = Debtor.Builder::class)
    @NoAutoDetect
    class Debtor
    private constructor(
        private val address: Address,
        private val name: String,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Address of the debtor. */
        @JsonProperty("address") fun address(): Address = address

        /** The name of the debtor. */
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
            private var name: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(debtor: Debtor) = apply {
                address = debtor.address
                name = debtor.name
                additionalProperties = debtor.additionalProperties.toMutableMap()
            }

            /** Address of the debtor. */
            @JsonProperty("address")
            fun address(address: Address) = apply { this.address = address }

            /** The name of the debtor. */
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

            fun build(): Debtor =
                Debtor(
                    checkNotNull(address) { "`address` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        /** Address of the debtor. */
        @JsonDeserialize(builder = Address.Builder::class)
        @NoAutoDetect
        class Address
        private constructor(
            private val city: String?,
            private val country: String,
            private val postCode: String?,
            private val streetName: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The town or city. */
            @JsonProperty("city") fun city(): Optional<String> = Optional.ofNullable(city)

            /** The ISO 3166, Alpha-2 country code. */
            @JsonProperty("country") fun country(): String = country

            /** The postal code or zip. */
            @JsonProperty("post_code")
            fun postCode(): Optional<String> = Optional.ofNullable(postCode)

            /** The street name without the street number. */
            @JsonProperty("street_name")
            fun streetName(): Optional<String> = Optional.ofNullable(streetName)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var city: String? = null
                private var country: String? = null
                private var postCode: String? = null
                private var streetName: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    city = address.city
                    country = address.country
                    postCode = address.postCode
                    streetName = address.streetName
                    additionalProperties = address.additionalProperties.toMutableMap()
                }

                /** The town or city. */
                @JsonProperty("city") fun city(city: String) = apply { this.city = city }

                /** The ISO 3166, Alpha-2 country code. */
                @JsonProperty("country")
                fun country(country: String) = apply { this.country = country }

                /** The postal code or zip. */
                @JsonProperty("post_code")
                fun postCode(postCode: String) = apply { this.postCode = postCode }

                /** The street name without the street number. */
                @JsonProperty("street_name")
                fun streetName(streetName: String) = apply { this.streetName = streetName }

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
                        city,
                        checkNotNull(country) { "`country` is required but was not set" },
                        postCode,
                        streetName,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Address && city == other.city && country == other.country && postCode == other.postCode && streetName == other.streetName && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(city, country, postCode, streetName, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{city=$city, country=$country, postCode=$postCode, streetName=$streetName, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is RealTimePaymentsRequestForPaymentCreateParams && amount == other.amount && debtor == other.debtor && destinationAccountNumberId == other.destinationAccountNumberId && expiresAt == other.expiresAt && remittanceInformation == other.remittanceInformation && sourceAccountNumber == other.sourceAccountNumber && sourceRoutingNumber == other.sourceRoutingNumber && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(amount, debtor, destinationAccountNumberId, expiresAt, remittanceInformation, sourceAccountNumber, sourceRoutingNumber, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "RealTimePaymentsRequestForPaymentCreateParams{amount=$amount, debtor=$debtor, destinationAccountNumberId=$destinationAccountNumberId, expiresAt=$expiresAt, remittanceInformation=$remittanceInformation, sourceAccountNumber=$sourceAccountNumber, sourceRoutingNumber=$sourceRoutingNumber, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
