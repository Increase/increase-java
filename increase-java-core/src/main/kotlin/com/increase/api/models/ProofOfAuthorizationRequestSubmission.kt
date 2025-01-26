// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.checkRequired
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Information submitted in response to a proof of authorization request. Per Nacha's guidance on
 * proof of authorization, the originator must ensure that the authorization complies with
 * applicable legal requirements, is readily identifiable as an authorization, and has clear and
 * readily understandable terms.
 */
@NoAutoDetect
class ProofOfAuthorizationRequestSubmission
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("authorization_terms")
    @ExcludeMissing
    private val authorizationTerms: JsonField<String> = JsonMissing.of(),
    @JsonProperty("authorized_at")
    @ExcludeMissing
    private val authorizedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("authorizer_company")
    @ExcludeMissing
    private val authorizerCompany: JsonField<String> = JsonMissing.of(),
    @JsonProperty("authorizer_email")
    @ExcludeMissing
    private val authorizerEmail: JsonField<String> = JsonMissing.of(),
    @JsonProperty("authorizer_ip_address")
    @ExcludeMissing
    private val authorizerIpAddress: JsonField<String> = JsonMissing.of(),
    @JsonProperty("authorizer_name")
    @ExcludeMissing
    private val authorizerName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("customer_has_been_offboarded")
    @ExcludeMissing
    private val customerHasBeenOffboarded: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("proof_of_authorization_request_id")
    @ExcludeMissing
    private val proofOfAuthorizationRequestId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("validated_account_ownership_via_credential")
    @ExcludeMissing
    private val validatedAccountOwnershipViaCredential: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("validated_account_ownership_with_account_statement")
    @ExcludeMissing
    private val validatedAccountOwnershipWithAccountStatement: JsonField<Boolean> =
        JsonMissing.of(),
    @JsonProperty("validated_account_ownership_with_microdeposit")
    @ExcludeMissing
    private val validatedAccountOwnershipWithMicrodeposit: JsonField<Boolean> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The Proof of Authorization Request Submission identifier. */
    fun id(): String = id.getRequired("id")

    /** Terms of authorization. */
    fun authorizationTerms(): String = authorizationTerms.getRequired("authorization_terms")

    /** Time of authorization. */
    fun authorizedAt(): OffsetDateTime = authorizedAt.getRequired("authorized_at")

    /** Company of the authorizer. */
    fun authorizerCompany(): Optional<String> =
        Optional.ofNullable(authorizerCompany.getNullable("authorizer_company"))

    /** Email of the authorizer. */
    fun authorizerEmail(): Optional<String> =
        Optional.ofNullable(authorizerEmail.getNullable("authorizer_email"))

    /** IP address of the authorizer. */
    fun authorizerIpAddress(): Optional<String> =
        Optional.ofNullable(authorizerIpAddress.getNullable("authorizer_ip_address"))

    /** Name of the authorizer. */
    fun authorizerName(): Optional<String> =
        Optional.ofNullable(authorizerName.getNullable("authorizer_name"))

    /** The time the Proof of Authorization Request Submission was created. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** Whether the customer has been offboarded. */
    fun customerHasBeenOffboarded(): Optional<Boolean> =
        Optional.ofNullable(customerHasBeenOffboarded.getNullable("customer_has_been_offboarded"))

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /** ID of the proof of authorization request. */
    fun proofOfAuthorizationRequestId(): String =
        proofOfAuthorizationRequestId.getRequired("proof_of_authorization_request_id")

    /** Status of the proof of authorization request submission. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `proof_of_authorization_request_submission`.
     */
    fun type(): Type = type.getRequired("type")

    /** The time the Proof of Authorization Request Submission was last updated. */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** Whether account ownership was validated via credential (for instance, Plaid). */
    fun validatedAccountOwnershipViaCredential(): Optional<Boolean> =
        Optional.ofNullable(
            validatedAccountOwnershipViaCredential.getNullable(
                "validated_account_ownership_via_credential"
            )
        )

    /** Whether account ownership was validated with an account statement. */
    fun validatedAccountOwnershipWithAccountStatement(): Optional<Boolean> =
        Optional.ofNullable(
            validatedAccountOwnershipWithAccountStatement.getNullable(
                "validated_account_ownership_with_account_statement"
            )
        )

    /** Whether account ownership was validated with microdeposit. */
    fun validatedAccountOwnershipWithMicrodeposit(): Optional<Boolean> =
        Optional.ofNullable(
            validatedAccountOwnershipWithMicrodeposit.getNullable(
                "validated_account_ownership_with_microdeposit"
            )
        )

    /** The Proof of Authorization Request Submission identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** Terms of authorization. */
    @JsonProperty("authorization_terms")
    @ExcludeMissing
    fun _authorizationTerms(): JsonField<String> = authorizationTerms

    /** Time of authorization. */
    @JsonProperty("authorized_at")
    @ExcludeMissing
    fun _authorizedAt(): JsonField<OffsetDateTime> = authorizedAt

    /** Company of the authorizer. */
    @JsonProperty("authorizer_company")
    @ExcludeMissing
    fun _authorizerCompany(): JsonField<String> = authorizerCompany

    /** Email of the authorizer. */
    @JsonProperty("authorizer_email")
    @ExcludeMissing
    fun _authorizerEmail(): JsonField<String> = authorizerEmail

    /** IP address of the authorizer. */
    @JsonProperty("authorizer_ip_address")
    @ExcludeMissing
    fun _authorizerIpAddress(): JsonField<String> = authorizerIpAddress

    /** Name of the authorizer. */
    @JsonProperty("authorizer_name")
    @ExcludeMissing
    fun _authorizerName(): JsonField<String> = authorizerName

    /** The time the Proof of Authorization Request Submission was created. */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** Whether the customer has been offboarded. */
    @JsonProperty("customer_has_been_offboarded")
    @ExcludeMissing
    fun _customerHasBeenOffboarded(): JsonField<Boolean> = customerHasBeenOffboarded

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /** ID of the proof of authorization request. */
    @JsonProperty("proof_of_authorization_request_id")
    @ExcludeMissing
    fun _proofOfAuthorizationRequestId(): JsonField<String> = proofOfAuthorizationRequestId

    /** Status of the proof of authorization request submission. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `proof_of_authorization_request_submission`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /** The time the Proof of Authorization Request Submission was last updated. */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /** Whether account ownership was validated via credential (for instance, Plaid). */
    @JsonProperty("validated_account_ownership_via_credential")
    @ExcludeMissing
    fun _validatedAccountOwnershipViaCredential(): JsonField<Boolean> =
        validatedAccountOwnershipViaCredential

    /** Whether account ownership was validated with an account statement. */
    @JsonProperty("validated_account_ownership_with_account_statement")
    @ExcludeMissing
    fun _validatedAccountOwnershipWithAccountStatement(): JsonField<Boolean> =
        validatedAccountOwnershipWithAccountStatement

    /** Whether account ownership was validated with microdeposit. */
    @JsonProperty("validated_account_ownership_with_microdeposit")
    @ExcludeMissing
    fun _validatedAccountOwnershipWithMicrodeposit(): JsonField<Boolean> =
        validatedAccountOwnershipWithMicrodeposit

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ProofOfAuthorizationRequestSubmission = apply {
        if (validated) {
            return@apply
        }

        id()
        authorizationTerms()
        authorizedAt()
        authorizerCompany()
        authorizerEmail()
        authorizerIpAddress()
        authorizerName()
        createdAt()
        customerHasBeenOffboarded()
        idempotencyKey()
        proofOfAuthorizationRequestId()
        status()
        type()
        updatedAt()
        validatedAccountOwnershipViaCredential()
        validatedAccountOwnershipWithAccountStatement()
        validatedAccountOwnershipWithMicrodeposit()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var authorizationTerms: JsonField<String>? = null
        private var authorizedAt: JsonField<OffsetDateTime>? = null
        private var authorizerCompany: JsonField<String>? = null
        private var authorizerEmail: JsonField<String>? = null
        private var authorizerIpAddress: JsonField<String>? = null
        private var authorizerName: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var customerHasBeenOffboarded: JsonField<Boolean>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var proofOfAuthorizationRequestId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var validatedAccountOwnershipViaCredential: JsonField<Boolean>? = null
        private var validatedAccountOwnershipWithAccountStatement: JsonField<Boolean>? = null
        private var validatedAccountOwnershipWithMicrodeposit: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            proofOfAuthorizationRequestSubmission: ProofOfAuthorizationRequestSubmission
        ) = apply {
            id = proofOfAuthorizationRequestSubmission.id
            authorizationTerms = proofOfAuthorizationRequestSubmission.authorizationTerms
            authorizedAt = proofOfAuthorizationRequestSubmission.authorizedAt
            authorizerCompany = proofOfAuthorizationRequestSubmission.authorizerCompany
            authorizerEmail = proofOfAuthorizationRequestSubmission.authorizerEmail
            authorizerIpAddress = proofOfAuthorizationRequestSubmission.authorizerIpAddress
            authorizerName = proofOfAuthorizationRequestSubmission.authorizerName
            createdAt = proofOfAuthorizationRequestSubmission.createdAt
            customerHasBeenOffboarded =
                proofOfAuthorizationRequestSubmission.customerHasBeenOffboarded
            idempotencyKey = proofOfAuthorizationRequestSubmission.idempotencyKey
            proofOfAuthorizationRequestId =
                proofOfAuthorizationRequestSubmission.proofOfAuthorizationRequestId
            status = proofOfAuthorizationRequestSubmission.status
            type = proofOfAuthorizationRequestSubmission.type
            updatedAt = proofOfAuthorizationRequestSubmission.updatedAt
            validatedAccountOwnershipViaCredential =
                proofOfAuthorizationRequestSubmission.validatedAccountOwnershipViaCredential
            validatedAccountOwnershipWithAccountStatement =
                proofOfAuthorizationRequestSubmission.validatedAccountOwnershipWithAccountStatement
            validatedAccountOwnershipWithMicrodeposit =
                proofOfAuthorizationRequestSubmission.validatedAccountOwnershipWithMicrodeposit
            additionalProperties =
                proofOfAuthorizationRequestSubmission.additionalProperties.toMutableMap()
        }

        /** The Proof of Authorization Request Submission identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Proof of Authorization Request Submission identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Terms of authorization. */
        fun authorizationTerms(authorizationTerms: String) =
            authorizationTerms(JsonField.of(authorizationTerms))

        /** Terms of authorization. */
        fun authorizationTerms(authorizationTerms: JsonField<String>) = apply {
            this.authorizationTerms = authorizationTerms
        }

        /** Time of authorization. */
        fun authorizedAt(authorizedAt: OffsetDateTime) = authorizedAt(JsonField.of(authorizedAt))

        /** Time of authorization. */
        fun authorizedAt(authorizedAt: JsonField<OffsetDateTime>) = apply {
            this.authorizedAt = authorizedAt
        }

        /** Company of the authorizer. */
        fun authorizerCompany(authorizerCompany: String?) =
            authorizerCompany(JsonField.ofNullable(authorizerCompany))

        /** Company of the authorizer. */
        fun authorizerCompany(authorizerCompany: Optional<String>) =
            authorizerCompany(authorizerCompany.orElse(null))

        /** Company of the authorizer. */
        fun authorizerCompany(authorizerCompany: JsonField<String>) = apply {
            this.authorizerCompany = authorizerCompany
        }

        /** Email of the authorizer. */
        fun authorizerEmail(authorizerEmail: String?) =
            authorizerEmail(JsonField.ofNullable(authorizerEmail))

        /** Email of the authorizer. */
        fun authorizerEmail(authorizerEmail: Optional<String>) =
            authorizerEmail(authorizerEmail.orElse(null))

        /** Email of the authorizer. */
        fun authorizerEmail(authorizerEmail: JsonField<String>) = apply {
            this.authorizerEmail = authorizerEmail
        }

        /** IP address of the authorizer. */
        fun authorizerIpAddress(authorizerIpAddress: String?) =
            authorizerIpAddress(JsonField.ofNullable(authorizerIpAddress))

        /** IP address of the authorizer. */
        fun authorizerIpAddress(authorizerIpAddress: Optional<String>) =
            authorizerIpAddress(authorizerIpAddress.orElse(null))

        /** IP address of the authorizer. */
        fun authorizerIpAddress(authorizerIpAddress: JsonField<String>) = apply {
            this.authorizerIpAddress = authorizerIpAddress
        }

        /** Name of the authorizer. */
        fun authorizerName(authorizerName: String?) =
            authorizerName(JsonField.ofNullable(authorizerName))

        /** Name of the authorizer. */
        fun authorizerName(authorizerName: Optional<String>) =
            authorizerName(authorizerName.orElse(null))

        /** Name of the authorizer. */
        fun authorizerName(authorizerName: JsonField<String>) = apply {
            this.authorizerName = authorizerName
        }

        /** The time the Proof of Authorization Request Submission was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The time the Proof of Authorization Request Submission was created. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Whether the customer has been offboarded. */
        fun customerHasBeenOffboarded(customerHasBeenOffboarded: Boolean?) =
            customerHasBeenOffboarded(JsonField.ofNullable(customerHasBeenOffboarded))

        /** Whether the customer has been offboarded. */
        fun customerHasBeenOffboarded(customerHasBeenOffboarded: Boolean) =
            customerHasBeenOffboarded(customerHasBeenOffboarded as Boolean?)

        /** Whether the customer has been offboarded. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun customerHasBeenOffboarded(customerHasBeenOffboarded: Optional<Boolean>) =
            customerHasBeenOffboarded(customerHasBeenOffboarded.orElse(null) as Boolean?)

        /** Whether the customer has been offboarded. */
        fun customerHasBeenOffboarded(customerHasBeenOffboarded: JsonField<Boolean>) = apply {
            this.customerHasBeenOffboarded = customerHasBeenOffboarded
        }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) =
            idempotencyKey(JsonField.ofNullable(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.orElse(null))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /** ID of the proof of authorization request. */
        fun proofOfAuthorizationRequestId(proofOfAuthorizationRequestId: String) =
            proofOfAuthorizationRequestId(JsonField.of(proofOfAuthorizationRequestId))

        /** ID of the proof of authorization request. */
        fun proofOfAuthorizationRequestId(proofOfAuthorizationRequestId: JsonField<String>) =
            apply {
                this.proofOfAuthorizationRequestId = proofOfAuthorizationRequestId
            }

        /** Status of the proof of authorization request submission. */
        fun status(status: Status) = status(JsonField.of(status))

        /** Status of the proof of authorization request submission. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `proof_of_authorization_request_submission`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `proof_of_authorization_request_submission`.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The time the Proof of Authorization Request Submission was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /** The time the Proof of Authorization Request Submission was last updated. */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Whether account ownership was validated via credential (for instance, Plaid). */
        fun validatedAccountOwnershipViaCredential(
            validatedAccountOwnershipViaCredential: Boolean?
        ) =
            validatedAccountOwnershipViaCredential(
                JsonField.ofNullable(validatedAccountOwnershipViaCredential)
            )

        /** Whether account ownership was validated via credential (for instance, Plaid). */
        fun validatedAccountOwnershipViaCredential(
            validatedAccountOwnershipViaCredential: Boolean
        ) =
            validatedAccountOwnershipViaCredential(
                validatedAccountOwnershipViaCredential as Boolean?
            )

        /** Whether account ownership was validated via credential (for instance, Plaid). */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun validatedAccountOwnershipViaCredential(
            validatedAccountOwnershipViaCredential: Optional<Boolean>
        ) =
            validatedAccountOwnershipViaCredential(
                validatedAccountOwnershipViaCredential.orElse(null) as Boolean?
            )

        /** Whether account ownership was validated via credential (for instance, Plaid). */
        fun validatedAccountOwnershipViaCredential(
            validatedAccountOwnershipViaCredential: JsonField<Boolean>
        ) = apply {
            this.validatedAccountOwnershipViaCredential = validatedAccountOwnershipViaCredential
        }

        /** Whether account ownership was validated with an account statement. */
        fun validatedAccountOwnershipWithAccountStatement(
            validatedAccountOwnershipWithAccountStatement: Boolean?
        ) =
            validatedAccountOwnershipWithAccountStatement(
                JsonField.ofNullable(validatedAccountOwnershipWithAccountStatement)
            )

        /** Whether account ownership was validated with an account statement. */
        fun validatedAccountOwnershipWithAccountStatement(
            validatedAccountOwnershipWithAccountStatement: Boolean
        ) =
            validatedAccountOwnershipWithAccountStatement(
                validatedAccountOwnershipWithAccountStatement as Boolean?
            )

        /** Whether account ownership was validated with an account statement. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun validatedAccountOwnershipWithAccountStatement(
            validatedAccountOwnershipWithAccountStatement: Optional<Boolean>
        ) =
            validatedAccountOwnershipWithAccountStatement(
                validatedAccountOwnershipWithAccountStatement.orElse(null) as Boolean?
            )

        /** Whether account ownership was validated with an account statement. */
        fun validatedAccountOwnershipWithAccountStatement(
            validatedAccountOwnershipWithAccountStatement: JsonField<Boolean>
        ) = apply {
            this.validatedAccountOwnershipWithAccountStatement =
                validatedAccountOwnershipWithAccountStatement
        }

        /** Whether account ownership was validated with microdeposit. */
        fun validatedAccountOwnershipWithMicrodeposit(
            validatedAccountOwnershipWithMicrodeposit: Boolean?
        ) =
            validatedAccountOwnershipWithMicrodeposit(
                JsonField.ofNullable(validatedAccountOwnershipWithMicrodeposit)
            )

        /** Whether account ownership was validated with microdeposit. */
        fun validatedAccountOwnershipWithMicrodeposit(
            validatedAccountOwnershipWithMicrodeposit: Boolean
        ) =
            validatedAccountOwnershipWithMicrodeposit(
                validatedAccountOwnershipWithMicrodeposit as Boolean?
            )

        /** Whether account ownership was validated with microdeposit. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun validatedAccountOwnershipWithMicrodeposit(
            validatedAccountOwnershipWithMicrodeposit: Optional<Boolean>
        ) =
            validatedAccountOwnershipWithMicrodeposit(
                validatedAccountOwnershipWithMicrodeposit.orElse(null) as Boolean?
            )

        /** Whether account ownership was validated with microdeposit. */
        fun validatedAccountOwnershipWithMicrodeposit(
            validatedAccountOwnershipWithMicrodeposit: JsonField<Boolean>
        ) = apply {
            this.validatedAccountOwnershipWithMicrodeposit =
                validatedAccountOwnershipWithMicrodeposit
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

        fun build(): ProofOfAuthorizationRequestSubmission =
            ProofOfAuthorizationRequestSubmission(
                checkRequired("id", id),
                checkRequired("authorizationTerms", authorizationTerms),
                checkRequired("authorizedAt", authorizedAt),
                checkRequired("authorizerCompany", authorizerCompany),
                checkRequired("authorizerEmail", authorizerEmail),
                checkRequired("authorizerIpAddress", authorizerIpAddress),
                checkRequired("authorizerName", authorizerName),
                checkRequired("createdAt", createdAt),
                checkRequired("customerHasBeenOffboarded", customerHasBeenOffboarded),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("proofOfAuthorizationRequestId", proofOfAuthorizationRequestId),
                checkRequired("status", status),
                checkRequired("type", type),
                checkRequired("updatedAt", updatedAt),
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
                additionalProperties.toImmutable(),
            )
    }

    /** Status of the proof of authorization request submission. */
    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /** The proof of authorization request submission is pending review. */
            @JvmField val PENDING_REVIEW = of("pending_review")

            /** The proof of authorization request submission was rejected. */
            @JvmField val REJECTED = of("rejected")

            /**
             * The proof of authorization request submission was canceled and replaced with another.
             */
            @JvmField val CANCELED = of("canceled")

            /** The proof of authorization request submission is pending sending. */
            @JvmField val PENDING_SENDING = of("pending_sending")

            /** The proof of authorization request submission was sent. */
            @JvmField val SENT = of("sent")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            /** The proof of authorization request submission is pending review. */
            PENDING_REVIEW,
            /** The proof of authorization request submission was rejected. */
            REJECTED,
            /**
             * The proof of authorization request submission was canceled and replaced with another.
             */
            CANCELED,
            /** The proof of authorization request submission is pending sending. */
            PENDING_SENDING,
            /** The proof of authorization request submission was sent. */
            SENT,
        }

        enum class Value {
            /** The proof of authorization request submission is pending review. */
            PENDING_REVIEW,
            /** The proof of authorization request submission was rejected. */
            REJECTED,
            /**
             * The proof of authorization request submission was canceled and replaced with another.
             */
            CANCELED,
            /** The proof of authorization request submission is pending sending. */
            PENDING_SENDING,
            /** The proof of authorization request submission was sent. */
            SENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING_REVIEW -> Value.PENDING_REVIEW
                REJECTED -> Value.REJECTED
                CANCELED -> Value.CANCELED
                PENDING_SENDING -> Value.PENDING_SENDING
                SENT -> Value.SENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING_REVIEW -> Known.PENDING_REVIEW
                REJECTED -> Known.REJECTED
                CANCELED -> Known.CANCELED
                PENDING_SENDING -> Known.PENDING_SENDING
                SENT -> Known.SENT
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `proof_of_authorization_request_submission`.
     */
    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField
            val PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION =
                of("proof_of_authorization_request_submission")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION,
        }

        enum class Value {
            PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION ->
                    Value.PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION ->
                    Known.PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProofOfAuthorizationRequestSubmission && id == other.id && authorizationTerms == other.authorizationTerms && authorizedAt == other.authorizedAt && authorizerCompany == other.authorizerCompany && authorizerEmail == other.authorizerEmail && authorizerIpAddress == other.authorizerIpAddress && authorizerName == other.authorizerName && createdAt == other.createdAt && customerHasBeenOffboarded == other.customerHasBeenOffboarded && idempotencyKey == other.idempotencyKey && proofOfAuthorizationRequestId == other.proofOfAuthorizationRequestId && status == other.status && type == other.type && updatedAt == other.updatedAt && validatedAccountOwnershipViaCredential == other.validatedAccountOwnershipViaCredential && validatedAccountOwnershipWithAccountStatement == other.validatedAccountOwnershipWithAccountStatement && validatedAccountOwnershipWithMicrodeposit == other.validatedAccountOwnershipWithMicrodeposit && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, authorizationTerms, authorizedAt, authorizerCompany, authorizerEmail, authorizerIpAddress, authorizerName, createdAt, customerHasBeenOffboarded, idempotencyKey, proofOfAuthorizationRequestId, status, type, updatedAt, validatedAccountOwnershipViaCredential, validatedAccountOwnershipWithAccountStatement, validatedAccountOwnershipWithMicrodeposit, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProofOfAuthorizationRequestSubmission{id=$id, authorizationTerms=$authorizationTerms, authorizedAt=$authorizedAt, authorizerCompany=$authorizerCompany, authorizerEmail=$authorizerEmail, authorizerIpAddress=$authorizerIpAddress, authorizerName=$authorizerName, createdAt=$createdAt, customerHasBeenOffboarded=$customerHasBeenOffboarded, idempotencyKey=$idempotencyKey, proofOfAuthorizationRequestId=$proofOfAuthorizationRequestId, status=$status, type=$type, updatedAt=$updatedAt, validatedAccountOwnershipViaCredential=$validatedAccountOwnershipViaCredential, validatedAccountOwnershipWithAccountStatement=$validatedAccountOwnershipWithAccountStatement, validatedAccountOwnershipWithMicrodeposit=$validatedAccountOwnershipWithMicrodeposit, additionalProperties=$additionalProperties}"
}
