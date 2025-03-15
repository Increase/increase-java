// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequestsubmissions

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
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Submit Proof of Authorization */
class ProofOfAuthorizationRequestSubmissionCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Terms of authorization.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authorizationTerms(): String = body.authorizationTerms()

    /**
     * Time of authorization.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authorizedAt(): OffsetDateTime = body.authorizedAt()

    /**
     * Email of the authorizer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authorizerEmail(): String = body.authorizerEmail()

    /**
     * Name of the authorizer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authorizerName(): String = body.authorizerName()

    /**
     * Whether the customer has been offboarded or suspended.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerHasBeenOffboarded(): Boolean = body.customerHasBeenOffboarded()

    /**
     * ID of the proof of authorization request.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun proofOfAuthorizationRequestId(): String = body.proofOfAuthorizationRequestId()

    /**
     * Whether the account ownership was validated via credential (e.g. Plaid).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun validatedAccountOwnershipViaCredential(): Boolean =
        body.validatedAccountOwnershipViaCredential()

    /**
     * Whether the account ownership was validated with an account statement.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun validatedAccountOwnershipWithAccountStatement(): Boolean =
        body.validatedAccountOwnershipWithAccountStatement()

    /**
     * Whether the account ownership was validated with a microdeposit.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun validatedAccountOwnershipWithMicrodeposit(): Boolean =
        body.validatedAccountOwnershipWithMicrodeposit()

    /**
     * The File containing the check's front image.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun additionalEvidenceFileId(): Optional<String> = body.additionalEvidenceFileId()

    /**
     * Company of the authorizer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorizerCompany(): Optional<String> = body.authorizerCompany()

    /**
     * IP address of the authorizer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorizerIpAddress(): Optional<String> = body.authorizerIpAddress()

    /**
     * Returns the raw JSON value of [authorizationTerms].
     *
     * Unlike [authorizationTerms], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _authorizationTerms(): JsonField<String> = body._authorizationTerms()

    /**
     * Returns the raw JSON value of [authorizedAt].
     *
     * Unlike [authorizedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _authorizedAt(): JsonField<OffsetDateTime> = body._authorizedAt()

    /**
     * Returns the raw JSON value of [authorizerEmail].
     *
     * Unlike [authorizerEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _authorizerEmail(): JsonField<String> = body._authorizerEmail()

    /**
     * Returns the raw JSON value of [authorizerName].
     *
     * Unlike [authorizerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _authorizerName(): JsonField<String> = body._authorizerName()

    /**
     * Returns the raw JSON value of [customerHasBeenOffboarded].
     *
     * Unlike [customerHasBeenOffboarded], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _customerHasBeenOffboarded(): JsonField<Boolean> = body._customerHasBeenOffboarded()

    /**
     * Returns the raw JSON value of [proofOfAuthorizationRequestId].
     *
     * Unlike [proofOfAuthorizationRequestId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _proofOfAuthorizationRequestId(): JsonField<String> = body._proofOfAuthorizationRequestId()

    /**
     * Returns the raw JSON value of [validatedAccountOwnershipViaCredential].
     *
     * Unlike [validatedAccountOwnershipViaCredential], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    fun _validatedAccountOwnershipViaCredential(): JsonField<Boolean> =
        body._validatedAccountOwnershipViaCredential()

    /**
     * Returns the raw JSON value of [validatedAccountOwnershipWithAccountStatement].
     *
     * Unlike [validatedAccountOwnershipWithAccountStatement], this method doesn't throw if the JSON
     * field has an unexpected type.
     */
    fun _validatedAccountOwnershipWithAccountStatement(): JsonField<Boolean> =
        body._validatedAccountOwnershipWithAccountStatement()

    /**
     * Returns the raw JSON value of [validatedAccountOwnershipWithMicrodeposit].
     *
     * Unlike [validatedAccountOwnershipWithMicrodeposit], this method doesn't throw if the JSON
     * field has an unexpected type.
     */
    fun _validatedAccountOwnershipWithMicrodeposit(): JsonField<Boolean> =
        body._validatedAccountOwnershipWithMicrodeposit()

    /**
     * Returns the raw JSON value of [additionalEvidenceFileId].
     *
     * Unlike [additionalEvidenceFileId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _additionalEvidenceFileId(): JsonField<String> = body._additionalEvidenceFileId()

    /**
     * Returns the raw JSON value of [authorizerCompany].
     *
     * Unlike [authorizerCompany], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _authorizerCompany(): JsonField<String> = body._authorizerCompany()

    /**
     * Returns the raw JSON value of [authorizerIpAddress].
     *
     * Unlike [authorizerIpAddress], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _authorizerIpAddress(): JsonField<String> = body._authorizerIpAddress()

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
        @JsonProperty("additional_evidence_file_id")
        @ExcludeMissing
        private val additionalEvidenceFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authorizer_company")
        @ExcludeMissing
        private val authorizerCompany: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authorizer_ip_address")
        @ExcludeMissing
        private val authorizerIpAddress: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Terms of authorization.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun authorizationTerms(): String = authorizationTerms.getRequired("authorization_terms")

        /**
         * Time of authorization.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun authorizedAt(): OffsetDateTime = authorizedAt.getRequired("authorized_at")

        /**
         * Email of the authorizer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun authorizerEmail(): String = authorizerEmail.getRequired("authorizer_email")

        /**
         * Name of the authorizer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun authorizerName(): String = authorizerName.getRequired("authorizer_name")

        /**
         * Whether the customer has been offboarded or suspended.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerHasBeenOffboarded(): Boolean =
            customerHasBeenOffboarded.getRequired("customer_has_been_offboarded")

        /**
         * ID of the proof of authorization request.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun proofOfAuthorizationRequestId(): String =
            proofOfAuthorizationRequestId.getRequired("proof_of_authorization_request_id")

        /**
         * Whether the account ownership was validated via credential (e.g. Plaid).
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun validatedAccountOwnershipViaCredential(): Boolean =
            validatedAccountOwnershipViaCredential.getRequired(
                "validated_account_ownership_via_credential"
            )

        /**
         * Whether the account ownership was validated with an account statement.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun validatedAccountOwnershipWithAccountStatement(): Boolean =
            validatedAccountOwnershipWithAccountStatement.getRequired(
                "validated_account_ownership_with_account_statement"
            )

        /**
         * Whether the account ownership was validated with a microdeposit.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun validatedAccountOwnershipWithMicrodeposit(): Boolean =
            validatedAccountOwnershipWithMicrodeposit.getRequired(
                "validated_account_ownership_with_microdeposit"
            )

        /**
         * The File containing the check's front image.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun additionalEvidenceFileId(): Optional<String> =
            Optional.ofNullable(additionalEvidenceFileId.getNullable("additional_evidence_file_id"))

        /**
         * Company of the authorizer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun authorizerCompany(): Optional<String> =
            Optional.ofNullable(authorizerCompany.getNullable("authorizer_company"))

        /**
         * IP address of the authorizer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun authorizerIpAddress(): Optional<String> =
            Optional.ofNullable(authorizerIpAddress.getNullable("authorizer_ip_address"))

        /**
         * Returns the raw JSON value of [authorizationTerms].
         *
         * Unlike [authorizationTerms], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("authorization_terms")
        @ExcludeMissing
        fun _authorizationTerms(): JsonField<String> = authorizationTerms

        /**
         * Returns the raw JSON value of [authorizedAt].
         *
         * Unlike [authorizedAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("authorized_at")
        @ExcludeMissing
        fun _authorizedAt(): JsonField<OffsetDateTime> = authorizedAt

        /**
         * Returns the raw JSON value of [authorizerEmail].
         *
         * Unlike [authorizerEmail], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("authorizer_email")
        @ExcludeMissing
        fun _authorizerEmail(): JsonField<String> = authorizerEmail

        /**
         * Returns the raw JSON value of [authorizerName].
         *
         * Unlike [authorizerName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("authorizer_name")
        @ExcludeMissing
        fun _authorizerName(): JsonField<String> = authorizerName

        /**
         * Returns the raw JSON value of [customerHasBeenOffboarded].
         *
         * Unlike [customerHasBeenOffboarded], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("customer_has_been_offboarded")
        @ExcludeMissing
        fun _customerHasBeenOffboarded(): JsonField<Boolean> = customerHasBeenOffboarded

        /**
         * Returns the raw JSON value of [proofOfAuthorizationRequestId].
         *
         * Unlike [proofOfAuthorizationRequestId], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("proof_of_authorization_request_id")
        @ExcludeMissing
        fun _proofOfAuthorizationRequestId(): JsonField<String> = proofOfAuthorizationRequestId

        /**
         * Returns the raw JSON value of [validatedAccountOwnershipViaCredential].
         *
         * Unlike [validatedAccountOwnershipViaCredential], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("validated_account_ownership_via_credential")
        @ExcludeMissing
        fun _validatedAccountOwnershipViaCredential(): JsonField<Boolean> =
            validatedAccountOwnershipViaCredential

        /**
         * Returns the raw JSON value of [validatedAccountOwnershipWithAccountStatement].
         *
         * Unlike [validatedAccountOwnershipWithAccountStatement], this method doesn't throw if the
         * JSON field has an unexpected type.
         */
        @JsonProperty("validated_account_ownership_with_account_statement")
        @ExcludeMissing
        fun _validatedAccountOwnershipWithAccountStatement(): JsonField<Boolean> =
            validatedAccountOwnershipWithAccountStatement

        /**
         * Returns the raw JSON value of [validatedAccountOwnershipWithMicrodeposit].
         *
         * Unlike [validatedAccountOwnershipWithMicrodeposit], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("validated_account_ownership_with_microdeposit")
        @ExcludeMissing
        fun _validatedAccountOwnershipWithMicrodeposit(): JsonField<Boolean> =
            validatedAccountOwnershipWithMicrodeposit

        /**
         * Returns the raw JSON value of [additionalEvidenceFileId].
         *
         * Unlike [additionalEvidenceFileId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("additional_evidence_file_id")
        @ExcludeMissing
        fun _additionalEvidenceFileId(): JsonField<String> = additionalEvidenceFileId

        /**
         * Returns the raw JSON value of [authorizerCompany].
         *
         * Unlike [authorizerCompany], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("authorizer_company")
        @ExcludeMissing
        fun _authorizerCompany(): JsonField<String> = authorizerCompany

        /**
         * Returns the raw JSON value of [authorizerIpAddress].
         *
         * Unlike [authorizerIpAddress], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("authorizer_ip_address")
        @ExcludeMissing
        fun _authorizerIpAddress(): JsonField<String> = authorizerIpAddress

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
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
            additionalEvidenceFileId()
            authorizerCompany()
            authorizerIpAddress()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .authorizationTerms()
             * .authorizedAt()
             * .authorizerEmail()
             * .authorizerName()
             * .customerHasBeenOffboarded()
             * .proofOfAuthorizationRequestId()
             * .validatedAccountOwnershipViaCredential()
             * .validatedAccountOwnershipWithAccountStatement()
             * .validatedAccountOwnershipWithMicrodeposit()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
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
            private var additionalEvidenceFileId: JsonField<String> = JsonMissing.of()
            private var authorizerCompany: JsonField<String> = JsonMissing.of()
            private var authorizerIpAddress: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                authorizationTerms = body.authorizationTerms
                authorizedAt = body.authorizedAt
                authorizerEmail = body.authorizerEmail
                authorizerName = body.authorizerName
                customerHasBeenOffboarded = body.customerHasBeenOffboarded
                proofOfAuthorizationRequestId = body.proofOfAuthorizationRequestId
                validatedAccountOwnershipViaCredential = body.validatedAccountOwnershipViaCredential
                validatedAccountOwnershipWithAccountStatement =
                    body.validatedAccountOwnershipWithAccountStatement
                validatedAccountOwnershipWithMicrodeposit =
                    body.validatedAccountOwnershipWithMicrodeposit
                additionalEvidenceFileId = body.additionalEvidenceFileId
                authorizerCompany = body.authorizerCompany
                authorizerIpAddress = body.authorizerIpAddress
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Terms of authorization. */
            fun authorizationTerms(authorizationTerms: String) =
                authorizationTerms(JsonField.of(authorizationTerms))

            /**
             * Sets [Builder.authorizationTerms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authorizationTerms] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun authorizationTerms(authorizationTerms: JsonField<String>) = apply {
                this.authorizationTerms = authorizationTerms
            }

            /** Time of authorization. */
            fun authorizedAt(authorizedAt: OffsetDateTime) =
                authorizedAt(JsonField.of(authorizedAt))

            /**
             * Sets [Builder.authorizedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authorizedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun authorizedAt(authorizedAt: JsonField<OffsetDateTime>) = apply {
                this.authorizedAt = authorizedAt
            }

            /** Email of the authorizer. */
            fun authorizerEmail(authorizerEmail: String) =
                authorizerEmail(JsonField.of(authorizerEmail))

            /**
             * Sets [Builder.authorizerEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authorizerEmail] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun authorizerEmail(authorizerEmail: JsonField<String>) = apply {
                this.authorizerEmail = authorizerEmail
            }

            /** Name of the authorizer. */
            fun authorizerName(authorizerName: String) =
                authorizerName(JsonField.of(authorizerName))

            /**
             * Sets [Builder.authorizerName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authorizerName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun authorizerName(authorizerName: JsonField<String>) = apply {
                this.authorizerName = authorizerName
            }

            /** Whether the customer has been offboarded or suspended. */
            fun customerHasBeenOffboarded(customerHasBeenOffboarded: Boolean) =
                customerHasBeenOffboarded(JsonField.of(customerHasBeenOffboarded))

            /**
             * Sets [Builder.customerHasBeenOffboarded] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerHasBeenOffboarded] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun customerHasBeenOffboarded(customerHasBeenOffboarded: JsonField<Boolean>) = apply {
                this.customerHasBeenOffboarded = customerHasBeenOffboarded
            }

            /** ID of the proof of authorization request. */
            fun proofOfAuthorizationRequestId(proofOfAuthorizationRequestId: String) =
                proofOfAuthorizationRequestId(JsonField.of(proofOfAuthorizationRequestId))

            /**
             * Sets [Builder.proofOfAuthorizationRequestId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.proofOfAuthorizationRequestId] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
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

            /**
             * Sets [Builder.validatedAccountOwnershipViaCredential] to an arbitrary JSON value.
             *
             * You should usually call [Builder.validatedAccountOwnershipViaCredential] with a
             * well-typed [Boolean] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
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

            /**
             * Sets [Builder.validatedAccountOwnershipWithAccountStatement] to an arbitrary JSON
             * value.
             *
             * You should usually call [Builder.validatedAccountOwnershipWithAccountStatement] with
             * a well-typed [Boolean] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
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

            /**
             * Sets [Builder.validatedAccountOwnershipWithMicrodeposit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.validatedAccountOwnershipWithMicrodeposit] with a
             * well-typed [Boolean] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun validatedAccountOwnershipWithMicrodeposit(
                validatedAccountOwnershipWithMicrodeposit: JsonField<Boolean>
            ) = apply {
                this.validatedAccountOwnershipWithMicrodeposit =
                    validatedAccountOwnershipWithMicrodeposit
            }

            /** The File containing the check's front image. */
            fun additionalEvidenceFileId(additionalEvidenceFileId: String) =
                additionalEvidenceFileId(JsonField.of(additionalEvidenceFileId))

            /**
             * Sets [Builder.additionalEvidenceFileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.additionalEvidenceFileId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun additionalEvidenceFileId(additionalEvidenceFileId: JsonField<String>) = apply {
                this.additionalEvidenceFileId = additionalEvidenceFileId
            }

            /** Company of the authorizer. */
            fun authorizerCompany(authorizerCompany: String) =
                authorizerCompany(JsonField.of(authorizerCompany))

            /**
             * Sets [Builder.authorizerCompany] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authorizerCompany] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun authorizerCompany(authorizerCompany: JsonField<String>) = apply {
                this.authorizerCompany = authorizerCompany
            }

            /** IP address of the authorizer. */
            fun authorizerIpAddress(authorizerIpAddress: String) =
                authorizerIpAddress(JsonField.of(authorizerIpAddress))

            /**
             * Sets [Builder.authorizerIpAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authorizerIpAddress] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
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

            fun build(): Body =
                Body(
                    checkRequired("authorizationTerms", authorizationTerms),
                    checkRequired("authorizedAt", authorizedAt),
                    checkRequired("authorizerEmail", authorizerEmail),
                    checkRequired("authorizerName", authorizerName),
                    checkRequired("customerHasBeenOffboarded", customerHasBeenOffboarded),
                    checkRequired("proofOfAuthorizationRequestId", proofOfAuthorizationRequestId),
                    checkRequired(
                        "validatedAccountOwnershipViaCredential",
                        validatedAccountOwnershipViaCredential,
                    ),
                    checkRequired(
                        "validatedAccountOwnershipWithAccountStatement",
                        validatedAccountOwnershipWithAccountStatement,
                    ),
                    checkRequired(
                        "validatedAccountOwnershipWithMicrodeposit",
                        validatedAccountOwnershipWithMicrodeposit,
                    ),
                    additionalEvidenceFileId,
                    authorizerCompany,
                    authorizerIpAddress,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && authorizationTerms == other.authorizationTerms && authorizedAt == other.authorizedAt && authorizerEmail == other.authorizerEmail && authorizerName == other.authorizerName && customerHasBeenOffboarded == other.customerHasBeenOffboarded && proofOfAuthorizationRequestId == other.proofOfAuthorizationRequestId && validatedAccountOwnershipViaCredential == other.validatedAccountOwnershipViaCredential && validatedAccountOwnershipWithAccountStatement == other.validatedAccountOwnershipWithAccountStatement && validatedAccountOwnershipWithMicrodeposit == other.validatedAccountOwnershipWithMicrodeposit && additionalEvidenceFileId == other.additionalEvidenceFileId && authorizerCompany == other.authorizerCompany && authorizerIpAddress == other.authorizerIpAddress && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(authorizationTerms, authorizedAt, authorizerEmail, authorizerName, customerHasBeenOffboarded, proofOfAuthorizationRequestId, validatedAccountOwnershipViaCredential, validatedAccountOwnershipWithAccountStatement, validatedAccountOwnershipWithMicrodeposit, additionalEvidenceFileId, authorizerCompany, authorizerIpAddress, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{authorizationTerms=$authorizationTerms, authorizedAt=$authorizedAt, authorizerEmail=$authorizerEmail, authorizerName=$authorizerName, customerHasBeenOffboarded=$customerHasBeenOffboarded, proofOfAuthorizationRequestId=$proofOfAuthorizationRequestId, validatedAccountOwnershipViaCredential=$validatedAccountOwnershipViaCredential, validatedAccountOwnershipWithAccountStatement=$validatedAccountOwnershipWithAccountStatement, validatedAccountOwnershipWithMicrodeposit=$validatedAccountOwnershipWithMicrodeposit, additionalEvidenceFileId=$additionalEvidenceFileId, authorizerCompany=$authorizerCompany, authorizerIpAddress=$authorizerIpAddress, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ProofOfAuthorizationRequestSubmissionCreateParams].
         *
         * The following fields are required:
         * ```java
         * .authorizationTerms()
         * .authorizedAt()
         * .authorizerEmail()
         * .authorizerName()
         * .customerHasBeenOffboarded()
         * .proofOfAuthorizationRequestId()
         * .validatedAccountOwnershipViaCredential()
         * .validatedAccountOwnershipWithAccountStatement()
         * .validatedAccountOwnershipWithMicrodeposit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProofOfAuthorizationRequestSubmissionCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
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

        /**
         * Sets [Builder.authorizationTerms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizationTerms] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorizationTerms(authorizationTerms: JsonField<String>) = apply {
            body.authorizationTerms(authorizationTerms)
        }

        /** Time of authorization. */
        fun authorizedAt(authorizedAt: OffsetDateTime) = apply { body.authorizedAt(authorizedAt) }

        /**
         * Sets [Builder.authorizedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorizedAt(authorizedAt: JsonField<OffsetDateTime>) = apply {
            body.authorizedAt(authorizedAt)
        }

        /** Email of the authorizer. */
        fun authorizerEmail(authorizerEmail: String) = apply {
            body.authorizerEmail(authorizerEmail)
        }

        /**
         * Sets [Builder.authorizerEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizerEmail] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorizerEmail(authorizerEmail: JsonField<String>) = apply {
            body.authorizerEmail(authorizerEmail)
        }

        /** Name of the authorizer. */
        fun authorizerName(authorizerName: String) = apply { body.authorizerName(authorizerName) }

        /**
         * Sets [Builder.authorizerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizerName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorizerName(authorizerName: JsonField<String>) = apply {
            body.authorizerName(authorizerName)
        }

        /** Whether the customer has been offboarded or suspended. */
        fun customerHasBeenOffboarded(customerHasBeenOffboarded: Boolean) = apply {
            body.customerHasBeenOffboarded(customerHasBeenOffboarded)
        }

        /**
         * Sets [Builder.customerHasBeenOffboarded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerHasBeenOffboarded] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customerHasBeenOffboarded(customerHasBeenOffboarded: JsonField<Boolean>) = apply {
            body.customerHasBeenOffboarded(customerHasBeenOffboarded)
        }

        /** ID of the proof of authorization request. */
        fun proofOfAuthorizationRequestId(proofOfAuthorizationRequestId: String) = apply {
            body.proofOfAuthorizationRequestId(proofOfAuthorizationRequestId)
        }

        /**
         * Sets [Builder.proofOfAuthorizationRequestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.proofOfAuthorizationRequestId] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
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

        /**
         * Sets [Builder.validatedAccountOwnershipViaCredential] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validatedAccountOwnershipViaCredential] with a
         * well-typed [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
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

        /**
         * Sets [Builder.validatedAccountOwnershipWithAccountStatement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validatedAccountOwnershipWithAccountStatement] with a
         * well-typed [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
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

        /**
         * Sets [Builder.validatedAccountOwnershipWithMicrodeposit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validatedAccountOwnershipWithMicrodeposit] with a
         * well-typed [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun validatedAccountOwnershipWithMicrodeposit(
            validatedAccountOwnershipWithMicrodeposit: JsonField<Boolean>
        ) = apply {
            body.validatedAccountOwnershipWithMicrodeposit(
                validatedAccountOwnershipWithMicrodeposit
            )
        }

        /** The File containing the check's front image. */
        fun additionalEvidenceFileId(additionalEvidenceFileId: String) = apply {
            body.additionalEvidenceFileId(additionalEvidenceFileId)
        }

        /**
         * Sets [Builder.additionalEvidenceFileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalEvidenceFileId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun additionalEvidenceFileId(additionalEvidenceFileId: JsonField<String>) = apply {
            body.additionalEvidenceFileId(additionalEvidenceFileId)
        }

        /** Company of the authorizer. */
        fun authorizerCompany(authorizerCompany: String) = apply {
            body.authorizerCompany(authorizerCompany)
        }

        /**
         * Sets [Builder.authorizerCompany] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizerCompany] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorizerCompany(authorizerCompany: JsonField<String>) = apply {
            body.authorizerCompany(authorizerCompany)
        }

        /** IP address of the authorizer. */
        fun authorizerIpAddress(authorizerIpAddress: String) = apply {
            body.authorizerIpAddress(authorizerIpAddress)
        }

        /**
         * Sets [Builder.authorizerIpAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizerIpAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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
