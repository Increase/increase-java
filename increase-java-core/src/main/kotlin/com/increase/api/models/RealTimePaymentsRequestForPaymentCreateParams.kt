// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.models.*
import java.time.LocalDate
import java.util.Objects

class RealTimePaymentsRequestForPaymentCreateParams
constructor(
    private val amount: Long,
    private val debtor: Debtor,
    private val destinationAccountNumberId: String,
    private val expiresAt: LocalDate,
    private val remittanceInformation: String,
    private val sourceAccountNumber: String,
    private val sourceRoutingNumber: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun debtor(): Debtor = debtor

    fun destinationAccountNumberId(): String = destinationAccountNumberId

    fun expiresAt(): LocalDate = expiresAt

    fun remittanceInformation(): String = remittanceInformation

    fun sourceAccountNumber(): String = sourceAccountNumber

    fun sourceRoutingNumber(): String = sourceRoutingNumber

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

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = RealTimePaymentsRequestForPaymentCreateBody.Builder::class)
    @NoAutoDetect
    class RealTimePaymentsRequestForPaymentCreateBody
    internal constructor(
        private val amount: Long?,
        private val debtor: Debtor?,
        private val destinationAccountNumberId: String?,
        private val expiresAt: LocalDate?,
        private val remittanceInformation: String?,
        private val sourceAccountNumber: String?,
        private val sourceRoutingNumber: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The requested amount in USD cents. Must be positive. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** Details of the person being requested to pay. */
        @JsonProperty("debtor") fun debtor(): Debtor? = debtor

        /** The identifier of the Account Number where the funds will land. */
        @JsonProperty("destination_account_number_id")
        fun destinationAccountNumberId(): String? = destinationAccountNumberId

        /**
         * The expiration time for this request, in UTC. The requestee will not be able to pay after
         * this date.
         */
        @JsonProperty("expires_at") fun expiresAt(): LocalDate? = expiresAt

        /** Unstructured information that will show on the requestee's bank statement. */
        @JsonProperty("remittance_information")
        fun remittanceInformation(): String? = remittanceInformation

        /** The account number the funds will be requested from. */
        @JsonProperty("source_account_number")
        fun sourceAccountNumber(): String? = sourceAccountNumber

        /** The requestee's American Bankers' Association (ABA) Routing Transit Number (RTN). */
        @JsonProperty("source_routing_number")
        fun sourceRoutingNumber(): String? = sourceRoutingNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RealTimePaymentsRequestForPaymentCreateBody &&
                this.amount == other.amount &&
                this.debtor == other.debtor &&
                this.destinationAccountNumberId == other.destinationAccountNumberId &&
                this.expiresAt == other.expiresAt &&
                this.remittanceInformation == other.remittanceInformation &&
                this.sourceAccountNumber == other.sourceAccountNumber &&
                this.sourceRoutingNumber == other.sourceRoutingNumber &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        debtor,
                        destinationAccountNumberId,
                        expiresAt,
                        remittanceInformation,
                        sourceAccountNumber,
                        sourceRoutingNumber,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "RealTimePaymentsRequestForPaymentCreateBody{amount=$amount, debtor=$debtor, destinationAccountNumberId=$destinationAccountNumberId, expiresAt=$expiresAt, remittanceInformation=$remittanceInformation, sourceAccountNumber=$sourceAccountNumber, sourceRoutingNumber=$sourceRoutingNumber, additionalProperties=$additionalProperties}"

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
                this.amount = realTimePaymentsRequestForPaymentCreateBody.amount
                this.debtor = realTimePaymentsRequestForPaymentCreateBody.debtor
                this.destinationAccountNumberId =
                    realTimePaymentsRequestForPaymentCreateBody.destinationAccountNumberId
                this.expiresAt = realTimePaymentsRequestForPaymentCreateBody.expiresAt
                this.remittanceInformation =
                    realTimePaymentsRequestForPaymentCreateBody.remittanceInformation
                this.sourceAccountNumber =
                    realTimePaymentsRequestForPaymentCreateBody.sourceAccountNumber
                this.sourceRoutingNumber =
                    realTimePaymentsRequestForPaymentCreateBody.sourceRoutingNumber
                additionalProperties(
                    realTimePaymentsRequestForPaymentCreateBody.additionalProperties
                )
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
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
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

        return other is RealTimePaymentsRequestForPaymentCreateParams &&
            this.amount == other.amount &&
            this.debtor == other.debtor &&
            this.destinationAccountNumberId == other.destinationAccountNumberId &&
            this.expiresAt == other.expiresAt &&
            this.remittanceInformation == other.remittanceInformation &&
            this.sourceAccountNumber == other.sourceAccountNumber &&
            this.sourceRoutingNumber == other.sourceRoutingNumber &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            amount,
            debtor,
            destinationAccountNumberId,
            expiresAt,
            remittanceInformation,
            sourceAccountNumber,
            sourceRoutingNumber,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "RealTimePaymentsRequestForPaymentCreateParams{amount=$amount, debtor=$debtor, destinationAccountNumberId=$destinationAccountNumberId, expiresAt=$expiresAt, remittanceInformation=$remittanceInformation, sourceAccountNumber=$sourceAccountNumber, sourceRoutingNumber=$sourceRoutingNumber, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            realTimePaymentsRequestForPaymentCreateParams:
                RealTimePaymentsRequestForPaymentCreateParams
        ) = apply {
            this.amount = realTimePaymentsRequestForPaymentCreateParams.amount
            this.debtor = realTimePaymentsRequestForPaymentCreateParams.debtor
            this.destinationAccountNumberId =
                realTimePaymentsRequestForPaymentCreateParams.destinationAccountNumberId
            this.expiresAt = realTimePaymentsRequestForPaymentCreateParams.expiresAt
            this.remittanceInformation =
                realTimePaymentsRequestForPaymentCreateParams.remittanceInformation
            this.sourceAccountNumber =
                realTimePaymentsRequestForPaymentCreateParams.sourceAccountNumber
            this.sourceRoutingNumber =
                realTimePaymentsRequestForPaymentCreateParams.sourceRoutingNumber
            additionalQueryParams(
                realTimePaymentsRequestForPaymentCreateParams.additionalQueryParams
            )
            additionalHeaders(realTimePaymentsRequestForPaymentCreateParams.additionalHeaders)
            additionalBodyProperties(
                realTimePaymentsRequestForPaymentCreateParams.additionalBodyProperties
            )
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
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /** Details of the person being requested to pay. */
    @JsonDeserialize(builder = Debtor.Builder::class)
    @NoAutoDetect
    class Debtor
    private constructor(
        private val address: Address?,
        private val name: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Address of the debtor. */
        @JsonProperty("address") fun address(): Address? = address

        /** The name of the debtor. */
        @JsonProperty("name") fun name(): String? = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Debtor &&
                this.address == other.address &&
                this.name == other.name &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        address,
                        name,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Debtor{address=$address, name=$name, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address: Address? = null
            private var name: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(debtor: Debtor) = apply {
                this.address = debtor.address
                this.name = debtor.name
                additionalProperties(debtor.additionalProperties)
            }

            /** Address of the debtor. */
            @JsonProperty("address")
            fun address(address: Address) = apply { this.address = address }

            /** The name of the debtor. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

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

            fun build(): Debtor =
                Debtor(
                    checkNotNull(address) { "`address` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** Address of the debtor. */
        @JsonDeserialize(builder = Address.Builder::class)
        @NoAutoDetect
        class Address
        private constructor(
            private val city: String?,
            private val country: String?,
            private val postCode: String?,
            private val streetName: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /** The town or city. */
            @JsonProperty("city") fun city(): String? = city

            /** The ISO 3166, Alpha-2 country code. */
            @JsonProperty("country") fun country(): String? = country

            /** The postal code or zip. */
            @JsonProperty("post_code") fun postCode(): String? = postCode

            /** The street name without the street number. */
            @JsonProperty("street_name") fun streetName(): String? = streetName

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Address &&
                    this.city == other.city &&
                    this.country == other.country &&
                    this.postCode == other.postCode &&
                    this.streetName == other.streetName &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            city,
                            country,
                            postCode,
                            streetName,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Address{city=$city, country=$country, postCode=$postCode, streetName=$streetName, additionalProperties=$additionalProperties}"

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
                    this.city = address.city
                    this.country = address.country
                    this.postCode = address.postCode
                    this.streetName = address.streetName
                    additionalProperties(address.additionalProperties)
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
                        city,
                        checkNotNull(country) { "`country` is required but was not set" },
                        postCode,
                        streetName,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }
}
