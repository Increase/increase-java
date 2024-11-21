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
import com.increase.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class ProofOfAuthorizationRequestSubmissionCreateParams
constructor(
    private val authorizationTerms: String,
    private val authorizedAt: OffsetDateTime,
    private val authorizerEmail: String,
    private val authorizerName: String,
    private val customerHasBeenOffboarded: Boolean,
    private val proofOfAuthorizationRequestId: String,
    private val validatedAccountOwnershipViaCredential: Boolean,
    private val validatedAccountOwnershipWithAccountStatement: Boolean,
    private val validatedAccountOwnershipWithMicrodeposit: Boolean,
    private val authorizerCompany: String?,
    private val authorizerIpAddress: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun authorizationTerms(): String = authorizationTerms

    fun authorizedAt(): OffsetDateTime = authorizedAt

    fun authorizerEmail(): String = authorizerEmail

    fun authorizerName(): String = authorizerName

    fun customerHasBeenOffboarded(): Boolean = customerHasBeenOffboarded

    fun proofOfAuthorizationRequestId(): String = proofOfAuthorizationRequestId

    fun validatedAccountOwnershipViaCredential(): Boolean = validatedAccountOwnershipViaCredential

    fun validatedAccountOwnershipWithAccountStatement(): Boolean =
        validatedAccountOwnershipWithAccountStatement

    fun validatedAccountOwnershipWithMicrodeposit(): Boolean =
        validatedAccountOwnershipWithMicrodeposit

    fun authorizerCompany(): Optional<String> = Optional.ofNullable(authorizerCompany)

    fun authorizerIpAddress(): Optional<String> = Optional.ofNullable(authorizerIpAddress)

    @JvmSynthetic
    internal fun getBody(): ProofOfAuthorizationRequestSubmissionCreateBody {
        return ProofOfAuthorizationRequestSubmissionCreateBody(
            authorizationTerms,
            authorizedAt,
            authorizerEmail,
            authorizerName,
            customerHasBeenOffboarded,
            proofOfAuthorizationRequestId,
            validatedAccountOwnershipViaCredential,
            validatedAccountOwnershipWithAccountStatement,
            validatedAccountOwnershipWithMicrodeposit,
            authorizerCompany,
            authorizerIpAddress,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = ProofOfAuthorizationRequestSubmissionCreateBody.Builder::class)
    @NoAutoDetect
    class ProofOfAuthorizationRequestSubmissionCreateBody
    internal constructor(
        private val authorizationTerms: String?,
        private val authorizedAt: OffsetDateTime?,
        private val authorizerEmail: String?,
        private val authorizerName: String?,
        private val customerHasBeenOffboarded: Boolean?,
        private val proofOfAuthorizationRequestId: String?,
        private val validatedAccountOwnershipViaCredential: Boolean?,
        private val validatedAccountOwnershipWithAccountStatement: Boolean?,
        private val validatedAccountOwnershipWithMicrodeposit: Boolean?,
        private val authorizerCompany: String?,
        private val authorizerIpAddress: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Terms of authorization. */
        @JsonProperty("authorization_terms") fun authorizationTerms(): String? = authorizationTerms

        /** Time of authorization. */
        @JsonProperty("authorized_at") fun authorizedAt(): OffsetDateTime? = authorizedAt

        /** Email of the authorizer. */
        @JsonProperty("authorizer_email") fun authorizerEmail(): String? = authorizerEmail

        /** Name of the authorizer. */
        @JsonProperty("authorizer_name") fun authorizerName(): String? = authorizerName

        /** Whether the customer has been offboarded or suspended. */
        @JsonProperty("customer_has_been_offboarded")
        fun customerHasBeenOffboarded(): Boolean? = customerHasBeenOffboarded

        /** ID of the proof of authorization request. */
        @JsonProperty("proof_of_authorization_request_id")
        fun proofOfAuthorizationRequestId(): String? = proofOfAuthorizationRequestId

        /** Whether the account ownership was validated via credential (e.g. Plaid). */
        @JsonProperty("validated_account_ownership_via_credential")
        fun validatedAccountOwnershipViaCredential(): Boolean? =
            validatedAccountOwnershipViaCredential

        /** Whether the account ownership was validated with an account statement. */
        @JsonProperty("validated_account_ownership_with_account_statement")
        fun validatedAccountOwnershipWithAccountStatement(): Boolean? =
            validatedAccountOwnershipWithAccountStatement

        /** Whether the account ownership was validated with a microdeposit. */
        @JsonProperty("validated_account_ownership_with_microdeposit")
        fun validatedAccountOwnershipWithMicrodeposit(): Boolean? =
            validatedAccountOwnershipWithMicrodeposit

        /** Company of the authorizer. */
        @JsonProperty("authorizer_company") fun authorizerCompany(): String? = authorizerCompany

        /** IP address of the authorizer. */
        @JsonProperty("authorizer_ip_address")
        fun authorizerIpAddress(): String? = authorizerIpAddress

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var authorizationTerms: String? = null
            private var authorizedAt: OffsetDateTime? = null
            private var authorizerEmail: String? = null
            private var authorizerName: String? = null
            private var customerHasBeenOffboarded: Boolean? = null
            private var proofOfAuthorizationRequestId: String? = null
            private var validatedAccountOwnershipViaCredential: Boolean? = null
            private var validatedAccountOwnershipWithAccountStatement: Boolean? = null
            private var validatedAccountOwnershipWithMicrodeposit: Boolean? = null
            private var authorizerCompany: String? = null
            private var authorizerIpAddress: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                proofOfAuthorizationRequestSubmissionCreateBody:
                    ProofOfAuthorizationRequestSubmissionCreateBody
            ) = apply {
                this.authorizationTerms =
                    proofOfAuthorizationRequestSubmissionCreateBody.authorizationTerms
                this.authorizedAt = proofOfAuthorizationRequestSubmissionCreateBody.authorizedAt
                this.authorizerEmail =
                    proofOfAuthorizationRequestSubmissionCreateBody.authorizerEmail
                this.authorizerName = proofOfAuthorizationRequestSubmissionCreateBody.authorizerName
                this.customerHasBeenOffboarded =
                    proofOfAuthorizationRequestSubmissionCreateBody.customerHasBeenOffboarded
                this.proofOfAuthorizationRequestId =
                    proofOfAuthorizationRequestSubmissionCreateBody.proofOfAuthorizationRequestId
                this.validatedAccountOwnershipViaCredential =
                    proofOfAuthorizationRequestSubmissionCreateBody
                        .validatedAccountOwnershipViaCredential
                this.validatedAccountOwnershipWithAccountStatement =
                    proofOfAuthorizationRequestSubmissionCreateBody
                        .validatedAccountOwnershipWithAccountStatement
                this.validatedAccountOwnershipWithMicrodeposit =
                    proofOfAuthorizationRequestSubmissionCreateBody
                        .validatedAccountOwnershipWithMicrodeposit
                this.authorizerCompany =
                    proofOfAuthorizationRequestSubmissionCreateBody.authorizerCompany
                this.authorizerIpAddress =
                    proofOfAuthorizationRequestSubmissionCreateBody.authorizerIpAddress
                additionalProperties(
                    proofOfAuthorizationRequestSubmissionCreateBody.additionalProperties
                )
            }

            /** Terms of authorization. */
            @JsonProperty("authorization_terms")
            fun authorizationTerms(authorizationTerms: String) = apply {
                this.authorizationTerms = authorizationTerms
            }

            /** Time of authorization. */
            @JsonProperty("authorized_at")
            fun authorizedAt(authorizedAt: OffsetDateTime) = apply {
                this.authorizedAt = authorizedAt
            }

            /** Email of the authorizer. */
            @JsonProperty("authorizer_email")
            fun authorizerEmail(authorizerEmail: String) = apply {
                this.authorizerEmail = authorizerEmail
            }

            /** Name of the authorizer. */
            @JsonProperty("authorizer_name")
            fun authorizerName(authorizerName: String) = apply {
                this.authorizerName = authorizerName
            }

            /** Whether the customer has been offboarded or suspended. */
            @JsonProperty("customer_has_been_offboarded")
            fun customerHasBeenOffboarded(customerHasBeenOffboarded: Boolean) = apply {
                this.customerHasBeenOffboarded = customerHasBeenOffboarded
            }

            /** ID of the proof of authorization request. */
            @JsonProperty("proof_of_authorization_request_id")
            fun proofOfAuthorizationRequestId(proofOfAuthorizationRequestId: String) = apply {
                this.proofOfAuthorizationRequestId = proofOfAuthorizationRequestId
            }

            /** Whether the account ownership was validated via credential (e.g. Plaid). */
            @JsonProperty("validated_account_ownership_via_credential")
            fun validatedAccountOwnershipViaCredential(
                validatedAccountOwnershipViaCredential: Boolean
            ) = apply {
                this.validatedAccountOwnershipViaCredential = validatedAccountOwnershipViaCredential
            }

            /** Whether the account ownership was validated with an account statement. */
            @JsonProperty("validated_account_ownership_with_account_statement")
            fun validatedAccountOwnershipWithAccountStatement(
                validatedAccountOwnershipWithAccountStatement: Boolean
            ) = apply {
                this.validatedAccountOwnershipWithAccountStatement =
                    validatedAccountOwnershipWithAccountStatement
            }

            /** Whether the account ownership was validated with a microdeposit. */
            @JsonProperty("validated_account_ownership_with_microdeposit")
            fun validatedAccountOwnershipWithMicrodeposit(
                validatedAccountOwnershipWithMicrodeposit: Boolean
            ) = apply {
                this.validatedAccountOwnershipWithMicrodeposit =
                    validatedAccountOwnershipWithMicrodeposit
            }

            /** Company of the authorizer. */
            @JsonProperty("authorizer_company")
            fun authorizerCompany(authorizerCompany: String) = apply {
                this.authorizerCompany = authorizerCompany
            }

            /** IP address of the authorizer. */
            @JsonProperty("authorizer_ip_address")
            fun authorizerIpAddress(authorizerIpAddress: String) = apply {
                this.authorizerIpAddress = authorizerIpAddress
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

            fun build(): ProofOfAuthorizationRequestSubmissionCreateBody =
                ProofOfAuthorizationRequestSubmissionCreateBody(
                    checkNotNull(authorizationTerms) {
                        "`authorizationTerms` is required but was not set"
                    },
                    checkNotNull(authorizedAt) { "`authorizedAt` is required but was not set" },
                    checkNotNull(authorizerEmail) {
                        "`authorizerEmail` is required but was not set"
                    },
                    checkNotNull(authorizerName) { "`authorizerName` is required but was not set" },
                    checkNotNull(customerHasBeenOffboarded) {
                        "`customerHasBeenOffboarded` is required but was not set"
                    },
                    checkNotNull(proofOfAuthorizationRequestId) {
                        "`proofOfAuthorizationRequestId` is required but was not set"
                    },
                    checkNotNull(validatedAccountOwnershipViaCredential) {
                        "`validatedAccountOwnershipViaCredential` is required but was not set"
                    },
                    checkNotNull(validatedAccountOwnershipWithAccountStatement) {
                        "`validatedAccountOwnershipWithAccountStatement` is required but was not set"
                    },
                    checkNotNull(validatedAccountOwnershipWithMicrodeposit) {
                        "`validatedAccountOwnershipWithMicrodeposit` is required but was not set"
                    },
                    authorizerCompany,
                    authorizerIpAddress,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ProofOfAuthorizationRequestSubmissionCreateBody && authorizationTerms == other.authorizationTerms && authorizedAt == other.authorizedAt && authorizerEmail == other.authorizerEmail && authorizerName == other.authorizerName && customerHasBeenOffboarded == other.customerHasBeenOffboarded && proofOfAuthorizationRequestId == other.proofOfAuthorizationRequestId && validatedAccountOwnershipViaCredential == other.validatedAccountOwnershipViaCredential && validatedAccountOwnershipWithAccountStatement == other.validatedAccountOwnershipWithAccountStatement && validatedAccountOwnershipWithMicrodeposit == other.validatedAccountOwnershipWithMicrodeposit && authorizerCompany == other.authorizerCompany && authorizerIpAddress == other.authorizerIpAddress && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(authorizationTerms, authorizedAt, authorizerEmail, authorizerName, customerHasBeenOffboarded, proofOfAuthorizationRequestId, validatedAccountOwnershipViaCredential, validatedAccountOwnershipWithAccountStatement, validatedAccountOwnershipWithMicrodeposit, authorizerCompany, authorizerIpAddress, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProofOfAuthorizationRequestSubmissionCreateBody{authorizationTerms=$authorizationTerms, authorizedAt=$authorizedAt, authorizerEmail=$authorizerEmail, authorizerName=$authorizerName, customerHasBeenOffboarded=$customerHasBeenOffboarded, proofOfAuthorizationRequestId=$proofOfAuthorizationRequestId, validatedAccountOwnershipViaCredential=$validatedAccountOwnershipViaCredential, validatedAccountOwnershipWithAccountStatement=$validatedAccountOwnershipWithAccountStatement, validatedAccountOwnershipWithMicrodeposit=$validatedAccountOwnershipWithMicrodeposit, authorizerCompany=$authorizerCompany, authorizerIpAddress=$authorizerIpAddress, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProofOfAuthorizationRequestSubmissionCreateParams && authorizationTerms == other.authorizationTerms && authorizedAt == other.authorizedAt && authorizerEmail == other.authorizerEmail && authorizerName == other.authorizerName && customerHasBeenOffboarded == other.customerHasBeenOffboarded && proofOfAuthorizationRequestId == other.proofOfAuthorizationRequestId && validatedAccountOwnershipViaCredential == other.validatedAccountOwnershipViaCredential && validatedAccountOwnershipWithAccountStatement == other.validatedAccountOwnershipWithAccountStatement && validatedAccountOwnershipWithMicrodeposit == other.validatedAccountOwnershipWithMicrodeposit && authorizerCompany == other.authorizerCompany && authorizerIpAddress == other.authorizerIpAddress && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(authorizationTerms, authorizedAt, authorizerEmail, authorizerName, customerHasBeenOffboarded, proofOfAuthorizationRequestId, validatedAccountOwnershipViaCredential, validatedAccountOwnershipWithAccountStatement, validatedAccountOwnershipWithMicrodeposit, authorizerCompany, authorizerIpAddress, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ProofOfAuthorizationRequestSubmissionCreateParams{authorizationTerms=$authorizationTerms, authorizedAt=$authorizedAt, authorizerEmail=$authorizerEmail, authorizerName=$authorizerName, customerHasBeenOffboarded=$customerHasBeenOffboarded, proofOfAuthorizationRequestId=$proofOfAuthorizationRequestId, validatedAccountOwnershipViaCredential=$validatedAccountOwnershipViaCredential, validatedAccountOwnershipWithAccountStatement=$validatedAccountOwnershipWithAccountStatement, validatedAccountOwnershipWithMicrodeposit=$validatedAccountOwnershipWithMicrodeposit, authorizerCompany=$authorizerCompany, authorizerIpAddress=$authorizerIpAddress, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var authorizationTerms: String? = null
        private var authorizedAt: OffsetDateTime? = null
        private var authorizerEmail: String? = null
        private var authorizerName: String? = null
        private var customerHasBeenOffboarded: Boolean? = null
        private var proofOfAuthorizationRequestId: String? = null
        private var validatedAccountOwnershipViaCredential: Boolean? = null
        private var validatedAccountOwnershipWithAccountStatement: Boolean? = null
        private var validatedAccountOwnershipWithMicrodeposit: Boolean? = null
        private var authorizerCompany: String? = null
        private var authorizerIpAddress: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            proofOfAuthorizationRequestSubmissionCreateParams:
                ProofOfAuthorizationRequestSubmissionCreateParams
        ) = apply {
            this.authorizationTerms =
                proofOfAuthorizationRequestSubmissionCreateParams.authorizationTerms
            this.authorizedAt = proofOfAuthorizationRequestSubmissionCreateParams.authorizedAt
            this.authorizerEmail = proofOfAuthorizationRequestSubmissionCreateParams.authorizerEmail
            this.authorizerName = proofOfAuthorizationRequestSubmissionCreateParams.authorizerName
            this.customerHasBeenOffboarded =
                proofOfAuthorizationRequestSubmissionCreateParams.customerHasBeenOffboarded
            this.proofOfAuthorizationRequestId =
                proofOfAuthorizationRequestSubmissionCreateParams.proofOfAuthorizationRequestId
            this.validatedAccountOwnershipViaCredential =
                proofOfAuthorizationRequestSubmissionCreateParams
                    .validatedAccountOwnershipViaCredential
            this.validatedAccountOwnershipWithAccountStatement =
                proofOfAuthorizationRequestSubmissionCreateParams
                    .validatedAccountOwnershipWithAccountStatement
            this.validatedAccountOwnershipWithMicrodeposit =
                proofOfAuthorizationRequestSubmissionCreateParams
                    .validatedAccountOwnershipWithMicrodeposit
            this.authorizerCompany =
                proofOfAuthorizationRequestSubmissionCreateParams.authorizerCompany
            this.authorizerIpAddress =
                proofOfAuthorizationRequestSubmissionCreateParams.authorizerIpAddress
            additionalHeaders(proofOfAuthorizationRequestSubmissionCreateParams.additionalHeaders)
            additionalQueryParams(
                proofOfAuthorizationRequestSubmissionCreateParams.additionalQueryParams
            )
            additionalBodyProperties(
                proofOfAuthorizationRequestSubmissionCreateParams.additionalBodyProperties
            )
        }

        /** Terms of authorization. */
        fun authorizationTerms(authorizationTerms: String) = apply {
            this.authorizationTerms = authorizationTerms
        }

        /** Time of authorization. */
        fun authorizedAt(authorizedAt: OffsetDateTime) = apply { this.authorizedAt = authorizedAt }

        /** Email of the authorizer. */
        fun authorizerEmail(authorizerEmail: String) = apply {
            this.authorizerEmail = authorizerEmail
        }

        /** Name of the authorizer. */
        fun authorizerName(authorizerName: String) = apply { this.authorizerName = authorizerName }

        /** Whether the customer has been offboarded or suspended. */
        fun customerHasBeenOffboarded(customerHasBeenOffboarded: Boolean) = apply {
            this.customerHasBeenOffboarded = customerHasBeenOffboarded
        }

        /** ID of the proof of authorization request. */
        fun proofOfAuthorizationRequestId(proofOfAuthorizationRequestId: String) = apply {
            this.proofOfAuthorizationRequestId = proofOfAuthorizationRequestId
        }

        /** Whether the account ownership was validated via credential (e.g. Plaid). */
        fun validatedAccountOwnershipViaCredential(
            validatedAccountOwnershipViaCredential: Boolean
        ) = apply {
            this.validatedAccountOwnershipViaCredential = validatedAccountOwnershipViaCredential
        }

        /** Whether the account ownership was validated with an account statement. */
        fun validatedAccountOwnershipWithAccountStatement(
            validatedAccountOwnershipWithAccountStatement: Boolean
        ) = apply {
            this.validatedAccountOwnershipWithAccountStatement =
                validatedAccountOwnershipWithAccountStatement
        }

        /** Whether the account ownership was validated with a microdeposit. */
        fun validatedAccountOwnershipWithMicrodeposit(
            validatedAccountOwnershipWithMicrodeposit: Boolean
        ) = apply {
            this.validatedAccountOwnershipWithMicrodeposit =
                validatedAccountOwnershipWithMicrodeposit
        }

        /** Company of the authorizer. */
        fun authorizerCompany(authorizerCompany: String) = apply {
            this.authorizerCompany = authorizerCompany
        }

        /** IP address of the authorizer. */
        fun authorizerIpAddress(authorizerIpAddress: String) = apply {
            this.authorizerIpAddress = authorizerIpAddress
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

        fun build(): ProofOfAuthorizationRequestSubmissionCreateParams =
            ProofOfAuthorizationRequestSubmissionCreateParams(
                checkNotNull(authorizationTerms) {
                    "`authorizationTerms` is required but was not set"
                },
                checkNotNull(authorizedAt) { "`authorizedAt` is required but was not set" },
                checkNotNull(authorizerEmail) { "`authorizerEmail` is required but was not set" },
                checkNotNull(authorizerName) { "`authorizerName` is required but was not set" },
                checkNotNull(customerHasBeenOffboarded) {
                    "`customerHasBeenOffboarded` is required but was not set"
                },
                checkNotNull(proofOfAuthorizationRequestId) {
                    "`proofOfAuthorizationRequestId` is required but was not set"
                },
                checkNotNull(validatedAccountOwnershipViaCredential) {
                    "`validatedAccountOwnershipViaCredential` is required but was not set"
                },
                checkNotNull(validatedAccountOwnershipWithAccountStatement) {
                    "`validatedAccountOwnershipWithAccountStatement` is required but was not set"
                },
                checkNotNull(validatedAccountOwnershipWithMicrodeposit) {
                    "`validatedAccountOwnershipWithMicrodeposit` is required but was not set"
                },
                authorizerCompany,
                authorizerIpAddress,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
