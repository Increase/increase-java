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
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
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

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

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
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ProofOfAuthorizationRequestSubmissionCreateBody &&
                this.authorizationTerms == other.authorizationTerms &&
                this.authorizedAt == other.authorizedAt &&
                this.authorizerEmail == other.authorizerEmail &&
                this.authorizerName == other.authorizerName &&
                this.customerHasBeenOffboarded == other.customerHasBeenOffboarded &&
                this.proofOfAuthorizationRequestId == other.proofOfAuthorizationRequestId &&
                this.validatedAccountOwnershipViaCredential ==
                    other.validatedAccountOwnershipViaCredential &&
                this.validatedAccountOwnershipWithAccountStatement ==
                    other.validatedAccountOwnershipWithAccountStatement &&
                this.validatedAccountOwnershipWithMicrodeposit ==
                    other.validatedAccountOwnershipWithMicrodeposit &&
                this.authorizerCompany == other.authorizerCompany &&
                this.authorizerIpAddress == other.authorizerIpAddress &&
                this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
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
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ProofOfAuthorizationRequestSubmissionCreateBody{authorizationTerms=$authorizationTerms, authorizedAt=$authorizedAt, authorizerEmail=$authorizerEmail, authorizerName=$authorizerName, customerHasBeenOffboarded=$customerHasBeenOffboarded, proofOfAuthorizationRequestId=$proofOfAuthorizationRequestId, validatedAccountOwnershipViaCredential=$validatedAccountOwnershipViaCredential, validatedAccountOwnershipWithAccountStatement=$validatedAccountOwnershipWithAccountStatement, validatedAccountOwnershipWithMicrodeposit=$validatedAccountOwnershipWithMicrodeposit, authorizerCompany=$authorizerCompany, authorizerIpAddress=$authorizerIpAddress, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProofOfAuthorizationRequestSubmissionCreateParams &&
            this.authorizationTerms == other.authorizationTerms &&
            this.authorizedAt == other.authorizedAt &&
            this.authorizerEmail == other.authorizerEmail &&
            this.authorizerName == other.authorizerName &&
            this.customerHasBeenOffboarded == other.customerHasBeenOffboarded &&
            this.proofOfAuthorizationRequestId == other.proofOfAuthorizationRequestId &&
            this.validatedAccountOwnershipViaCredential ==
                other.validatedAccountOwnershipViaCredential &&
            this.validatedAccountOwnershipWithAccountStatement ==
                other.validatedAccountOwnershipWithAccountStatement &&
            this.validatedAccountOwnershipWithMicrodeposit ==
                other.validatedAccountOwnershipWithMicrodeposit &&
            this.authorizerCompany == other.authorizerCompany &&
            this.authorizerIpAddress == other.authorizerIpAddress &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
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
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "ProofOfAuthorizationRequestSubmissionCreateParams{authorizationTerms=$authorizationTerms, authorizedAt=$authorizedAt, authorizerEmail=$authorizerEmail, authorizerName=$authorizerName, customerHasBeenOffboarded=$customerHasBeenOffboarded, proofOfAuthorizationRequestId=$proofOfAuthorizationRequestId, validatedAccountOwnershipViaCredential=$validatedAccountOwnershipViaCredential, validatedAccountOwnershipWithAccountStatement=$validatedAccountOwnershipWithAccountStatement, validatedAccountOwnershipWithMicrodeposit=$validatedAccountOwnershipWithMicrodeposit, authorizerCompany=$authorizerCompany, authorizerIpAddress=$authorizerIpAddress, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
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
            additionalQueryParams(
                proofOfAuthorizationRequestSubmissionCreateParams.additionalQueryParams
            )
            additionalHeaders(proofOfAuthorizationRequestSubmissionCreateParams.additionalHeaders)
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
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
