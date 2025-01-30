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
import java.util.Objects

/** Enroll an account in the IntraFi deposit sweep network */
class IntrafiAccountEnrollmentCreateParams
private constructor(
    private val body: IntrafiAccountEnrollmentCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier for the account to be added to IntraFi. */
    fun accountId(): String = body.accountId()

    /** The contact email for the account owner, to be shared with IntraFi. */
    fun emailAddress(): String = body.emailAddress()

    /** The identifier for the account to be added to IntraFi. */
    fun _accountId(): JsonField<String> = body._accountId()

    /** The contact email for the account owner, to be shared with IntraFi. */
    fun _emailAddress(): JsonField<String> = body._emailAddress()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): IntrafiAccountEnrollmentCreateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class IntrafiAccountEnrollmentCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("account_id")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email_address")
        @ExcludeMissing
        private val emailAddress: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier for the account to be added to IntraFi. */
        fun accountId(): String = accountId.getRequired("account_id")

        /** The contact email for the account owner, to be shared with IntraFi. */
        fun emailAddress(): String = emailAddress.getRequired("email_address")

        /** The identifier for the account to be added to IntraFi. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /** The contact email for the account owner, to be shared with IntraFi. */
        @JsonProperty("email_address")
        @ExcludeMissing
        fun _emailAddress(): JsonField<String> = emailAddress

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): IntrafiAccountEnrollmentCreateBody = apply {
            if (validated) {
                return@apply
            }

            accountId()
            emailAddress()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [IntrafiAccountEnrollmentCreateBody]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var emailAddress: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                intrafiAccountEnrollmentCreateBody: IntrafiAccountEnrollmentCreateBody
            ) = apply {
                accountId = intrafiAccountEnrollmentCreateBody.accountId
                emailAddress = intrafiAccountEnrollmentCreateBody.emailAddress
                additionalProperties =
                    intrafiAccountEnrollmentCreateBody.additionalProperties.toMutableMap()
            }

            /** The identifier for the account to be added to IntraFi. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The identifier for the account to be added to IntraFi. */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The contact email for the account owner, to be shared with IntraFi. */
            fun emailAddress(emailAddress: String) = emailAddress(JsonField.of(emailAddress))

            /** The contact email for the account owner, to be shared with IntraFi. */
            fun emailAddress(emailAddress: JsonField<String>) = apply {
                this.emailAddress = emailAddress
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

            fun build(): IntrafiAccountEnrollmentCreateBody =
                IntrafiAccountEnrollmentCreateBody(
                    checkRequired("accountId", accountId),
                    checkRequired("emailAddress", emailAddress),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is IntrafiAccountEnrollmentCreateBody && accountId == other.accountId && emailAddress == other.emailAddress && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, emailAddress, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "IntrafiAccountEnrollmentCreateBody{accountId=$accountId, emailAddress=$emailAddress, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IntrafiAccountEnrollmentCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: IntrafiAccountEnrollmentCreateBody.Builder =
            IntrafiAccountEnrollmentCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            intrafiAccountEnrollmentCreateParams: IntrafiAccountEnrollmentCreateParams
        ) = apply {
            body = intrafiAccountEnrollmentCreateParams.body.toBuilder()
            additionalHeaders = intrafiAccountEnrollmentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                intrafiAccountEnrollmentCreateParams.additionalQueryParams.toBuilder()
        }

        /** The identifier for the account to be added to IntraFi. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /** The identifier for the account to be added to IntraFi. */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /** The contact email for the account owner, to be shared with IntraFi. */
        fun emailAddress(emailAddress: String) = apply { body.emailAddress(emailAddress) }

        /** The contact email for the account owner, to be shared with IntraFi. */
        fun emailAddress(emailAddress: JsonField<String>) = apply {
            body.emailAddress(emailAddress)
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

        fun build(): IntrafiAccountEnrollmentCreateParams =
            IntrafiAccountEnrollmentCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IntrafiAccountEnrollmentCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "IntrafiAccountEnrollmentCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
