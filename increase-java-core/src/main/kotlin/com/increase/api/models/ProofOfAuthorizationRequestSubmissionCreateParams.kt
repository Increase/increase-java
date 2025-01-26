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
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Submit Proof of Authorization */
class ProofOfAuthorizationRequestSubmissionCreateParams
private constructor(
    private val body: ProofOfAuthorizationRequestSubmissionCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** Terms of authorization. */
    fun authorizationTerms(): String = body.authorizationTerms()

    /** Time of authorization. */
    fun authorizedAt(): OffsetDateTime = body.authorizedAt()

    /** Email of the authorizer. */
    fun authorizerEmail(): String = body.authorizerEmail()

    /** Name of the authorizer. */
    fun authorizerName(): String = body.authorizerName()

    /** Whether the customer has been offboarded or suspended. */
    fun customerHasBeenOffboarded(): Boolean = body.customerHasBeenOffboarded()

    /** ID of the proof of authorization request. */
    fun proofOfAuthorizationRequestId(): String = body.proofOfAuthorizationRequestId()

    /** Whether the account ownership was validated via credential (e.g. Plaid). */
    fun validatedAccountOwnershipViaCredential(): Boolean =
        body.validatedAccountOwnershipViaCredential()

    /** Whether the account ownership was validated with an account statement. */
    fun validatedAccountOwnershipWithAccountStatement(): Boolean =
        body.validatedAccountOwnershipWithAccountStatement()

    /** Whether the account ownership was validated with a microdeposit. */
    fun validatedAccountOwnershipWithMicrodeposit(): Boolean =
        body.validatedAccountOwnershipWithMicrodeposit()

    /** Company of the authorizer. */
    fun authorizerCompany(): Optional<String> = body.authorizerCompany()

    /** IP address of the authorizer. */
    fun authorizerIpAddress(): Optional<String> = body.authorizerIpAddress()

    /** Terms of authorization. */
    fun _authorizationTerms(): JsonField<String> = body._authorizationTerms()

    /** Time of authorization. */
    fun _authorizedAt(): JsonField<OffsetDateTime> = body._authorizedAt()

    /** Email of the authorizer. */
    fun _authorizerEmail(): JsonField<String> = body._authorizerEmail()

    /** Name of the authorizer. */
    fun _authorizerName(): JsonField<String> = body._authorizerName()

    /** Whether the customer has been offboarded or suspended. */
    fun _customerHasBeenOffboarded(): JsonField<Boolean> = body._customerHasBeenOffboarded()

    /** ID of the proof of authorization request. */
    fun _proofOfAuthorizationRequestId(): JsonField<String> = body._proofOfAuthorizationRequestId()

    /** Whether the account ownership was validated via credential (e.g. Plaid). */
    fun _validatedAccountOwnershipViaCredential(): JsonField<Boolean> =
        body._validatedAccountOwnershipViaCredential()

    /** Whether the account ownership was validated with an account statement. */
    fun _validatedAccountOwnershipWithAccountStatement(): JsonField<Boolean> =
        body._validatedAccountOwnershipWithAccountStatement()

    /** Whether the account ownership was validated with a microdeposit. */
    fun _validatedAccountOwnershipWithMicrodeposit(): JsonField<Boolean> =
        body._validatedAccountOwnershipWithMicrodeposit()

    /** Company of the authorizer. */
    fun _authorizerCompany(): JsonField<String> = body._authorizerCompany()

    /** IP address of the authorizer. */
    fun _authorizerIpAddress(): JsonField<String> = body._authorizerIpAddress()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): ProofOfAuthorizationRequestSubmissionCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ProofOfAuthorizationRequestSubmissionCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("authorization_terms")
        @ExcludeMissing
        private val authorizationTerms: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authorized_at")
        @ExcludeMissing
        private val authorizedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("authorizer_email")
        @ExcludeMissing
        private val authorizerEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authorizer_name")
        @ExcludeMissing
        private val authorizerName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_has_been_offboarded")
        @ExcludeMissing
        private val customerHasBeenOffboarded: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("proof_of_authorization_request_id")
        @ExcludeMissing
        private val proofOfAuthorizationRequestId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("validated_account_ownership_via_credential")
        @ExcludeMissing
        private val validatedAccountOwnershipViaCredential: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("validated_account_ownership_with_account_statement")
        @ExcludeMissing
        private val validatedAccountOwnershipWithAccountStatement: JsonField<Boolean> =
            JsonMissing.of(),
        @JsonProperty("validated_account_ownership_with_microdeposit")
        @ExcludeMissing
        private val validatedAccountOwnershipWithMicrodeposit: JsonField<Boolean> =
            JsonMissing.of(),
        @JsonProperty("authorizer_company")
        @ExcludeMissing
        private val authorizerCompany: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authorizer_ip_address")
        @ExcludeMissing
        private val authorizerIpAddress: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Terms of authorization. */
        fun authorizationTerms(): String = authorizationTerms.getRequired("authorization_terms")

        /** Time of authorization. */
        fun authorizedAt(): OffsetDateTime = authorizedAt.getRequired("authorized_at")

        /** Email of the authorizer. */
        fun authorizerEmail(): String = authorizerEmail.getRequired("authorizer_email")

        /** Name of the authorizer. */
        fun authorizerName(): String = authorizerName.getRequired("authorizer_name")

        /** Whether the customer has been offboarded or suspended. */
        fun customerHasBeenOffboarded(): Boolean =
            customerHasBeenOffboarded.getRequired("customer_has_been_offboarded")

        /** ID of the proof of authorization request. */
        fun proofOfAuthorizationRequestId(): String =
            proofOfAuthorizationRequestId.getRequired("proof_of_authorization_request_id")

        /** Whether the account ownership was validated via credential (e.g. Plaid). */
        fun validatedAccountOwnershipViaCredential(): Boolean =
            validatedAccountOwnershipViaCredential.getRequired(
                "validated_account_ownership_via_credential"
            )

        /** Whether the account ownership was validated with an account statement. */
        fun validatedAccountOwnershipWithAccountStatement(): Boolean =
            validatedAccountOwnershipWithAccountStatement.getRequired(
                "validated_account_ownership_with_account_statement"
            )

        /** Whether the account ownership was validated with a microdeposit. */
        fun validatedAccountOwnershipWithMicrodeposit(): Boolean =
            validatedAccountOwnershipWithMicrodeposit.getRequired(
                "validated_account_ownership_with_microdeposit"
            )

        /** Company of the authorizer. */
        fun authorizerCompany(): Optional<String> =
            Optional.ofNullable(authorizerCompany.getNullable("authorizer_company"))

        /** IP address of the authorizer. */
        fun authorizerIpAddress(): Optional<String> =
            Optional.ofNullable(authorizerIpAddress.getNullable("authorizer_ip_address"))

        /** Terms of authorization. */
        @JsonProperty("authorization_terms")
        @ExcludeMissing
        fun _authorizationTerms(): JsonField<String> = authorizationTerms

        /** Time of authorization. */
        @JsonProperty("authorized_at")
        @ExcludeMissing
        fun _authorizedAt(): JsonField<OffsetDateTime> = authorizedAt

        /** Email of the authorizer. */
        @JsonProperty("authorizer_email")
        @ExcludeMissing
        fun _authorizerEmail(): JsonField<String> = authorizerEmail

        /** Name of the authorizer. */
        @JsonProperty("authorizer_name")
        @ExcludeMissing
        fun _authorizerName(): JsonField<String> = authorizerName

        /** Whether the customer has been offboarded or suspended. */
        @JsonProperty("customer_has_been_offboarded")
        @ExcludeMissing
        fun _customerHasBeenOffboarded(): JsonField<Boolean> = customerHasBeenOffboarded

        /** ID of the proof of authorization request. */
        @JsonProperty("proof_of_authorization_request_id")
        @ExcludeMissing
        fun _proofOfAuthorizationRequestId(): JsonField<String> = proofOfAuthorizationRequestId

        /** Whether the account ownership was validated via credential (e.g. Plaid). */
        @JsonProperty("validated_account_ownership_via_credential")
        @ExcludeMissing
        fun _validatedAccountOwnershipViaCredential(): JsonField<Boolean> =
            validatedAccountOwnershipViaCredential

        /** Whether the account ownership was validated with an account statement. */
        @JsonProperty("validated_account_ownership_with_account_statement")
        @ExcludeMissing
        fun _validatedAccountOwnershipWithAccountStatement(): JsonField<Boolean> =
            validatedAccountOwnershipWithAccountStatement

        /** Whether the account ownership was validated with a microdeposit. */
        @JsonProperty("validated_account_ownership_with_microdeposit")
        @ExcludeMissing
        fun _validatedAccountOwnershipWithMicrodeposit(): JsonField<Boolean> =
            validatedAccountOwnershipWithMicrodeposit

        /** Company of the authorizer. */
        @JsonProperty("authorizer_company")
        @ExcludeMissing
        fun _authorizerCompany(): JsonField<String> = authorizerCompany

        /** IP address of the authorizer. */
        @JsonProperty("authorizer_ip_address")
        @ExcludeMissing
        fun _authorizerIpAddress(): JsonField<String> = authorizerIpAddress

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ProofOfAuthorizationRequestSubmissionCreateBody = apply {
            if (validated) {
                return@apply
            }

            authorizationTerms()
            authorizedAt()
            authorizerEmail()
            authorizerName()
            customerHasBeenOffboarded()
            proofOfAuthorizationRequestId()
            validatedAccountOwnershipViaCredential()
            validatedAccountOwnershipWithAccountStatement()
            validatedAccountOwnershipWithMicrodeposit()
            authorizerCompany()
            authorizerIpAddress()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var authorizationTerms: JsonField<String>? = null
            private var authorizedAt: JsonField<OffsetDateTime>? = null
            private var authorizerEmail: JsonField<String>? = null
            private var authorizerName: JsonField<String>? = null
            private var customerHasBeenOffboarded: JsonField<Boolean>? = null
            private var proofOfAuthorizationRequestId: JsonField<String>? = null
            private var validatedAccountOwnershipViaCredential: JsonField<Boolean>? = null
            private var validatedAccountOwnershipWithAccountStatement: JsonField<Boolean>? = null
            private var validatedAccountOwnershipWithMicrodeposit: JsonField<Boolean>? = null
            private var authorizerCompany: JsonField<String> = JsonMissing.of()
            private var authorizerIpAddress: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                proofOfAuthorizationRequestSubmissionCreateBody:
                    ProofOfAuthorizationRequestSubmissionCreateBody
            ) = apply {
                authorizationTerms =
                    proofOfAuthorizationRequestSubmissionCreateBody.authorizationTerms
                authorizedAt = proofOfAuthorizationRequestSubmissionCreateBody.authorizedAt
                authorizerEmail = proofOfAuthorizationRequestSubmissionCreateBody.authorizerEmail
                authorizerName = proofOfAuthorizationRequestSubmissionCreateBody.authorizerName
                customerHasBeenOffboarded =
                    proofOfAuthorizationRequestSubmissionCreateBody.customerHasBeenOffboarded
                proofOfAuthorizationRequestId =
                    proofOfAuthorizationRequestSubmissionCreateBody.proofOfAuthorizationRequestId
                validatedAccountOwnershipViaCredential =
                    proofOfAuthorizationRequestSubmissionCreateBody
                        .validatedAccountOwnershipViaCredential
                validatedAccountOwnershipWithAccountStatement =
                    proofOfAuthorizationRequestSubmissionCreateBody
                        .validatedAccountOwnershipWithAccountStatement
                validatedAccountOwnershipWithMicrodeposit =
                    proofOfAuthorizationRequestSubmissionCreateBody
                        .validatedAccountOwnershipWithMicrodeposit
                authorizerCompany =
                    proofOfAuthorizationRequestSubmissionCreateBody.authorizerCompany
                authorizerIpAddress =
                    proofOfAuthorizationRequestSubmissionCreateBody.authorizerIpAddress
                additionalProperties =
                    proofOfAuthorizationRequestSubmissionCreateBody.additionalProperties
                        .toMutableMap()
            }

            /** Terms of authorization. */
            fun authorizationTerms(authorizationTerms: String) =
                authorizationTerms(JsonField.of(authorizationTerms))

            /** Terms of authorization. */
            fun authorizationTerms(authorizationTerms: JsonField<String>) = apply {
                this.authorizationTerms = authorizationTerms
            }

            /** Time of authorization. */
            fun authorizedAt(authorizedAt: OffsetDateTime) =
                authorizedAt(JsonField.of(authorizedAt))

            /** Time of authorization. */
            fun authorizedAt(authorizedAt: JsonField<OffsetDateTime>) = apply {
                this.authorizedAt = authorizedAt
            }

            /** Email of the authorizer. */
            fun authorizerEmail(authorizerEmail: String) =
                authorizerEmail(JsonField.of(authorizerEmail))

            /** Email of the authorizer. */
            fun authorizerEmail(authorizerEmail: JsonField<String>) = apply {
                this.authorizerEmail = authorizerEmail
            }

            /** Name of the authorizer. */
            fun authorizerName(authorizerName: String) =
                authorizerName(JsonField.of(authorizerName))

            /** Name of the authorizer. */
            fun authorizerName(authorizerName: JsonField<String>) = apply {
                this.authorizerName = authorizerName
            }

            /** Whether the customer has been offboarded or suspended. */
            fun customerHasBeenOffboarded(customerHasBeenOffboarded: Boolean) =
                customerHasBeenOffboarded(JsonField.of(customerHasBeenOffboarded))

            /** Whether the customer has been offboarded or suspended. */
            fun customerHasBeenOffboarded(customerHasBeenOffboarded: JsonField<Boolean>) = apply {
                this.customerHasBeenOffboarded = customerHasBeenOffboarded
            }

            /** ID of the proof of authorization request. */
            fun proofOfAuthorizationRequestId(proofOfAuthorizationRequestId: String) =
                proofOfAuthorizationRequestId(JsonField.of(proofOfAuthorizationRequestId))

            /** ID of the proof of authorization request. */
            fun proofOfAuthorizationRequestId(proofOfAuthorizationRequestId: JsonField<String>) =
                apply {
                    this.proofOfAuthorizationRequestId = proofOfAuthorizationRequestId
                }

            /** Whether the account ownership was validated via credential (e.g. Plaid). */
            fun validatedAccountOwnershipViaCredential(
                validatedAccountOwnershipViaCredential: Boolean
            ) =
                validatedAccountOwnershipViaCredential(
                    JsonField.of(validatedAccountOwnershipViaCredential)
                )

            /** Whether the account ownership was validated via credential (e.g. Plaid). */
            fun validatedAccountOwnershipViaCredential(
                validatedAccountOwnershipViaCredential: JsonField<Boolean>
            ) = apply {
                this.validatedAccountOwnershipViaCredential = validatedAccountOwnershipViaCredential
            }

            /** Whether the account ownership was validated with an account statement. */
            fun validatedAccountOwnershipWithAccountStatement(
                validatedAccountOwnershipWithAccountStatement: Boolean
            ) =
                validatedAccountOwnershipWithAccountStatement(
                    JsonField.of(validatedAccountOwnershipWithAccountStatement)
                )

            /** Whether the account ownership was validated with an account statement. */
            fun validatedAccountOwnershipWithAccountStatement(
                validatedAccountOwnershipWithAccountStatement: JsonField<Boolean>
            ) = apply {
                this.validatedAccountOwnershipWithAccountStatement =
                    validatedAccountOwnershipWithAccountStatement
            }

            /** Whether the account ownership was validated with a microdeposit. */
            fun validatedAccountOwnershipWithMicrodeposit(
                validatedAccountOwnershipWithMicrodeposit: Boolean
            ) =
                validatedAccountOwnershipWithMicrodeposit(
                    JsonField.of(validatedAccountOwnershipWithMicrodeposit)
                )

            /** Whether the account ownership was validated with a microdeposit. */
            fun validatedAccountOwnershipWithMicrodeposit(
                validatedAccountOwnershipWithMicrodeposit: JsonField<Boolean>
            ) = apply {
                this.validatedAccountOwnershipWithMicrodeposit =
                    validatedAccountOwnershipWithMicrodeposit
            }

            /** Company of the authorizer. */
            fun authorizerCompany(authorizerCompany: String) =
                authorizerCompany(JsonField.of(authorizerCompany))

            /** Company of the authorizer. */
            fun authorizerCompany(authorizerCompany: JsonField<String>) = apply {
                this.authorizerCompany = authorizerCompany
            }

            /** IP address of the authorizer. */
            fun authorizerIpAddress(authorizerIpAddress: String) =
                authorizerIpAddress(JsonField.of(authorizerIpAddress))

            /** IP address of the authorizer. */
            fun authorizerIpAddress(authorizerIpAddress: JsonField<String>) = apply {
                this.authorizerIpAddress = authorizerIpAddress
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

            fun build(): ProofOfAuthorizationRequestSubmissionCreateBody =
                ProofOfAuthorizationRequestSubmissionCreateBody(
                    checkRequired("authorizationTerms", authorizationTerms),
                    checkRequired("authorizedAt", authorizedAt),
                    checkRequired("authorizerEmail", authorizerEmail),
                    checkRequired("authorizerName", authorizerName),
                    checkRequired("customerHasBeenOffboarded", customerHasBeenOffboarded),
                    checkRequired("proofOfAuthorizationRequestId", proofOfAuthorizationRequestId),
                    checkRequired(
                        "validatedAccountOwnershipViaCredential",
                        validatedAccountOwnershipViaCredential
                    ),
                    checkRequired(
                        "validatedAccountOwnershipWithAccountStatement",
                        validatedAccountOwnershipWithAccountStatement
                    ),
                    checkRequired(
                        "validatedAccountOwnershipWithMicrodeposit",
                        validatedAccountOwnershipWithMicrodeposit
                    ),
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

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder internal constructor() {

        private var body: ProofOfAuthorizationRequestSubmissionCreateBody.Builder =
            ProofOfAuthorizationRequestSubmissionCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            proofOfAuthorizationRequestSubmissionCreateParams:
                ProofOfAuthorizationRequestSubmissionCreateParams
        ) = apply {
            body = proofOfAuthorizationRequestSubmissionCreateParams.body.toBuilder()
            additionalHeaders =
                proofOfAuthorizationRequestSubmissionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                proofOfAuthorizationRequestSubmissionCreateParams.additionalQueryParams.toBuilder()
        }

        /** Terms of authorization. */
        fun authorizationTerms(authorizationTerms: String) = apply {
            body.authorizationTerms(authorizationTerms)
        }

        /** Terms of authorization. */
        fun authorizationTerms(authorizationTerms: JsonField<String>) = apply {
            body.authorizationTerms(authorizationTerms)
        }

        /** Time of authorization. */
        fun authorizedAt(authorizedAt: OffsetDateTime) = apply { body.authorizedAt(authorizedAt) }

        /** Time of authorization. */
        fun authorizedAt(authorizedAt: JsonField<OffsetDateTime>) = apply {
            body.authorizedAt(authorizedAt)
        }

        /** Email of the authorizer. */
        fun authorizerEmail(authorizerEmail: String) = apply {
            body.authorizerEmail(authorizerEmail)
        }

        /** Email of the authorizer. */
        fun authorizerEmail(authorizerEmail: JsonField<String>) = apply {
            body.authorizerEmail(authorizerEmail)
        }

        /** Name of the authorizer. */
        fun authorizerName(authorizerName: String) = apply { body.authorizerName(authorizerName) }

        /** Name of the authorizer. */
        fun authorizerName(authorizerName: JsonField<String>) = apply {
            body.authorizerName(authorizerName)
        }

        /** Whether the customer has been offboarded or suspended. */
        fun customerHasBeenOffboarded(customerHasBeenOffboarded: Boolean) = apply {
            body.customerHasBeenOffboarded(customerHasBeenOffboarded)
        }

        /** Whether the customer has been offboarded or suspended. */
        fun customerHasBeenOffboarded(customerHasBeenOffboarded: JsonField<Boolean>) = apply {
            body.customerHasBeenOffboarded(customerHasBeenOffboarded)
        }

        /** ID of the proof of authorization request. */
        fun proofOfAuthorizationRequestId(proofOfAuthorizationRequestId: String) = apply {
            body.proofOfAuthorizationRequestId(proofOfAuthorizationRequestId)
        }

        /** ID of the proof of authorization request. */
        fun proofOfAuthorizationRequestId(proofOfAuthorizationRequestId: JsonField<String>) =
            apply {
                body.proofOfAuthorizationRequestId(proofOfAuthorizationRequestId)
            }

        /** Whether the account ownership was validated via credential (e.g. Plaid). */
        fun validatedAccountOwnershipViaCredential(
            validatedAccountOwnershipViaCredential: Boolean
        ) = apply {
            body.validatedAccountOwnershipViaCredential(validatedAccountOwnershipViaCredential)
        }

        /** Whether the account ownership was validated via credential (e.g. Plaid). */
        fun validatedAccountOwnershipViaCredential(
            validatedAccountOwnershipViaCredential: JsonField<Boolean>
        ) = apply {
            body.validatedAccountOwnershipViaCredential(validatedAccountOwnershipViaCredential)
        }

        /** Whether the account ownership was validated with an account statement. */
        fun validatedAccountOwnershipWithAccountStatement(
            validatedAccountOwnershipWithAccountStatement: Boolean
        ) = apply {
            body.validatedAccountOwnershipWithAccountStatement(
                validatedAccountOwnershipWithAccountStatement
            )
        }

        /** Whether the account ownership was validated with an account statement. */
        fun validatedAccountOwnershipWithAccountStatement(
            validatedAccountOwnershipWithAccountStatement: JsonField<Boolean>
        ) = apply {
            body.validatedAccountOwnershipWithAccountStatement(
                validatedAccountOwnershipWithAccountStatement
            )
        }

        /** Whether the account ownership was validated with a microdeposit. */
        fun validatedAccountOwnershipWithMicrodeposit(
            validatedAccountOwnershipWithMicrodeposit: Boolean
        ) = apply {
            body.validatedAccountOwnershipWithMicrodeposit(
                validatedAccountOwnershipWithMicrodeposit
            )
        }

        /** Whether the account ownership was validated with a microdeposit. */
        fun validatedAccountOwnershipWithMicrodeposit(
            validatedAccountOwnershipWithMicrodeposit: JsonField<Boolean>
        ) = apply {
            body.validatedAccountOwnershipWithMicrodeposit(
                validatedAccountOwnershipWithMicrodeposit
            )
        }

        /** Company of the authorizer. */
        fun authorizerCompany(authorizerCompany: String) = apply {
            body.authorizerCompany(authorizerCompany)
        }

        /** Company of the authorizer. */
        fun authorizerCompany(authorizerCompany: JsonField<String>) = apply {
            body.authorizerCompany(authorizerCompany)
        }

        /** IP address of the authorizer. */
        fun authorizerIpAddress(authorizerIpAddress: String) = apply {
            body.authorizerIpAddress(authorizerIpAddress)
        }

        /** IP address of the authorizer. */
        fun authorizerIpAddress(authorizerIpAddress: JsonField<String>) = apply {
            body.authorizerIpAddress(authorizerIpAddress)
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

        fun build(): ProofOfAuthorizationRequestSubmissionCreateParams =
            ProofOfAuthorizationRequestSubmissionCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProofOfAuthorizationRequestSubmissionCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ProofOfAuthorizationRequestSubmissionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
