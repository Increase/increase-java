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
import java.util.Objects

class IntrafiAccountEnrollmentCreateParams
constructor(
    private val accountId: String,
    private val emailAddress: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun emailAddress(): String = emailAddress

    @JvmSynthetic
    internal fun getBody(): IntrafiAccountEnrollmentCreateBody {
        return IntrafiAccountEnrollmentCreateBody(
            accountId,
            emailAddress,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = IntrafiAccountEnrollmentCreateBody.Builder::class)
    @NoAutoDetect
    class IntrafiAccountEnrollmentCreateBody
    internal constructor(
        private val accountId: String?,
        private val emailAddress: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The identifier for the account to be added to IntraFi. */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /** The contact email for the account owner, to be shared with IntraFi. */
        @JsonProperty("email_address") fun emailAddress(): String? = emailAddress

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IntrafiAccountEnrollmentCreateBody &&
                this.accountId == other.accountId &&
                this.emailAddress == other.emailAddress &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountId,
                        emailAddress,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "IntrafiAccountEnrollmentCreateBody{accountId=$accountId, emailAddress=$emailAddress, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var emailAddress: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                intrafiAccountEnrollmentCreateBody: IntrafiAccountEnrollmentCreateBody
            ) = apply {
                this.accountId = intrafiAccountEnrollmentCreateBody.accountId
                this.emailAddress = intrafiAccountEnrollmentCreateBody.emailAddress
                additionalProperties(intrafiAccountEnrollmentCreateBody.additionalProperties)
            }

            /** The identifier for the account to be added to IntraFi. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** The contact email for the account owner, to be shared with IntraFi. */
            @JsonProperty("email_address")
            fun emailAddress(emailAddress: String) = apply { this.emailAddress = emailAddress }

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

            fun build(): IntrafiAccountEnrollmentCreateBody =
                IntrafiAccountEnrollmentCreateBody(
                    checkNotNull(accountId) { "`accountId` is required but was not set" },
                    checkNotNull(emailAddress) { "`emailAddress` is required but was not set" },
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

        return other is IntrafiAccountEnrollmentCreateParams &&
            this.accountId == other.accountId &&
            this.emailAddress == other.emailAddress &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountId,
            emailAddress,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "IntrafiAccountEnrollmentCreateParams{accountId=$accountId, emailAddress=$emailAddress, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var emailAddress: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            intrafiAccountEnrollmentCreateParams: IntrafiAccountEnrollmentCreateParams
        ) = apply {
            this.accountId = intrafiAccountEnrollmentCreateParams.accountId
            this.emailAddress = intrafiAccountEnrollmentCreateParams.emailAddress
            additionalQueryParams(intrafiAccountEnrollmentCreateParams.additionalQueryParams)
            additionalHeaders(intrafiAccountEnrollmentCreateParams.additionalHeaders)
            additionalBodyProperties(intrafiAccountEnrollmentCreateParams.additionalBodyProperties)
        }

        /** The identifier for the account to be added to IntraFi. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** The contact email for the account owner, to be shared with IntraFi. */
        fun emailAddress(emailAddress: String) = apply { this.emailAddress = emailAddress }

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

        fun build(): IntrafiAccountEnrollmentCreateParams =
            IntrafiAccountEnrollmentCreateParams(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(emailAddress) { "`emailAddress` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
