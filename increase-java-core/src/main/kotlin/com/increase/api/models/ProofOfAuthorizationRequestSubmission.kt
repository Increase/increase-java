// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
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
@JsonDeserialize(builder = ProofOfAuthorizationRequestSubmission.Builder::class)
@NoAutoDetect
class ProofOfAuthorizationRequestSubmission
private constructor(
    private val authorizationTerms: JsonField<String>,
    private val authorizedAt: JsonField<OffsetDateTime>,
    private val authorizerCompany: JsonField<String>,
    private val authorizerEmail: JsonField<String>,
    private val authorizerIpAddress: JsonField<String>,
    private val authorizerName: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customerHasBeenOffboarded: JsonField<Boolean>,
    private val id: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val proofOfAuthorizationRequestId: JsonField<String>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val validatedAccountOwnershipViaCredential: JsonField<Boolean>,
    private val validatedAccountOwnershipWithAccountStatement: JsonField<Boolean>,
    private val validatedAccountOwnershipWithMicrodeposit: JsonField<Boolean>,
    private val additionalProperties: Map<String, JsonValue>,
) {

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

    /** The Proof of Authorization Request Submission identifier. */
    fun id(): String = id.getRequired("id")

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

    /** Terms of authorization. */
    @JsonProperty("authorization_terms")
    @ExcludeMissing
    fun _authorizationTerms() = authorizationTerms

    /** Time of authorization. */
    @JsonProperty("authorized_at") @ExcludeMissing fun _authorizedAt() = authorizedAt

    /** Company of the authorizer. */
    @JsonProperty("authorizer_company") @ExcludeMissing fun _authorizerCompany() = authorizerCompany

    /** Email of the authorizer. */
    @JsonProperty("authorizer_email") @ExcludeMissing fun _authorizerEmail() = authorizerEmail

    /** IP address of the authorizer. */
    @JsonProperty("authorizer_ip_address")
    @ExcludeMissing
    fun _authorizerIpAddress() = authorizerIpAddress

    /** Name of the authorizer. */
    @JsonProperty("authorizer_name") @ExcludeMissing fun _authorizerName() = authorizerName

    /** The time the Proof of Authorization Request Submission was created. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** Whether the customer has been offboarded. */
    @JsonProperty("customer_has_been_offboarded")
    @ExcludeMissing
    fun _customerHasBeenOffboarded() = customerHasBeenOffboarded

    /** The Proof of Authorization Request Submission identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /** ID of the proof of authorization request. */
    @JsonProperty("proof_of_authorization_request_id")
    @ExcludeMissing
    fun _proofOfAuthorizationRequestId() = proofOfAuthorizationRequestId

    /** Status of the proof of authorization request submission. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `proof_of_authorization_request_submission`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /** The time the Proof of Authorization Request Submission was last updated. */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /** Whether account ownership was validated via credential (for instance, Plaid). */
    @JsonProperty("validated_account_ownership_via_credential")
    @ExcludeMissing
    fun _validatedAccountOwnershipViaCredential() = validatedAccountOwnershipViaCredential

    /** Whether account ownership was validated with an account statement. */
    @JsonProperty("validated_account_ownership_with_account_statement")
    @ExcludeMissing
    fun _validatedAccountOwnershipWithAccountStatement() =
        validatedAccountOwnershipWithAccountStatement

    /** Whether account ownership was validated with microdeposit. */
    @JsonProperty("validated_account_ownership_with_microdeposit")
    @ExcludeMissing
    fun _validatedAccountOwnershipWithMicrodeposit() = validatedAccountOwnershipWithMicrodeposit

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ProofOfAuthorizationRequestSubmission = apply {
        if (!validated) {
            authorizationTerms()
            authorizedAt()
            authorizerCompany()
            authorizerEmail()
            authorizerIpAddress()
            authorizerName()
            createdAt()
            customerHasBeenOffboarded()
            id()
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
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var authorizationTerms: JsonField<String> = JsonMissing.of()
        private var authorizedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var authorizerCompany: JsonField<String> = JsonMissing.of()
        private var authorizerEmail: JsonField<String> = JsonMissing.of()
        private var authorizerIpAddress: JsonField<String> = JsonMissing.of()
        private var authorizerName: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customerHasBeenOffboarded: JsonField<Boolean> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var proofOfAuthorizationRequestId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var validatedAccountOwnershipViaCredential: JsonField<Boolean> = JsonMissing.of()
        private var validatedAccountOwnershipWithAccountStatement: JsonField<Boolean> =
            JsonMissing.of()
        private var validatedAccountOwnershipWithMicrodeposit: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            proofOfAuthorizationRequestSubmission: ProofOfAuthorizationRequestSubmission
        ) = apply {
            authorizationTerms = proofOfAuthorizationRequestSubmission.authorizationTerms
            authorizedAt = proofOfAuthorizationRequestSubmission.authorizedAt
            authorizerCompany = proofOfAuthorizationRequestSubmission.authorizerCompany
            authorizerEmail = proofOfAuthorizationRequestSubmission.authorizerEmail
            authorizerIpAddress = proofOfAuthorizationRequestSubmission.authorizerIpAddress
            authorizerName = proofOfAuthorizationRequestSubmission.authorizerName
            createdAt = proofOfAuthorizationRequestSubmission.createdAt
            customerHasBeenOffboarded =
                proofOfAuthorizationRequestSubmission.customerHasBeenOffboarded
            id = proofOfAuthorizationRequestSubmission.id
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

        /** Terms of authorization. */
        fun authorizationTerms(authorizationTerms: String) =
            authorizationTerms(JsonField.of(authorizationTerms))

        /** Terms of authorization. */
        @JsonProperty("authorization_terms")
        @ExcludeMissing
        fun authorizationTerms(authorizationTerms: JsonField<String>) = apply {
            this.authorizationTerms = authorizationTerms
        }

        /** Time of authorization. */
        fun authorizedAt(authorizedAt: OffsetDateTime) = authorizedAt(JsonField.of(authorizedAt))

        /** Time of authorization. */
        @JsonProperty("authorized_at")
        @ExcludeMissing
        fun authorizedAt(authorizedAt: JsonField<OffsetDateTime>) = apply {
            this.authorizedAt = authorizedAt
        }

        /** Company of the authorizer. */
        fun authorizerCompany(authorizerCompany: String) =
            authorizerCompany(JsonField.of(authorizerCompany))

        /** Company of the authorizer. */
        @JsonProperty("authorizer_company")
        @ExcludeMissing
        fun authorizerCompany(authorizerCompany: JsonField<String>) = apply {
            this.authorizerCompany = authorizerCompany
        }

        /** Email of the authorizer. */
        fun authorizerEmail(authorizerEmail: String) =
            authorizerEmail(JsonField.of(authorizerEmail))

        /** Email of the authorizer. */
        @JsonProperty("authorizer_email")
        @ExcludeMissing
        fun authorizerEmail(authorizerEmail: JsonField<String>) = apply {
            this.authorizerEmail = authorizerEmail
        }

        /** IP address of the authorizer. */
        fun authorizerIpAddress(authorizerIpAddress: String) =
            authorizerIpAddress(JsonField.of(authorizerIpAddress))

        /** IP address of the authorizer. */
        @JsonProperty("authorizer_ip_address")
        @ExcludeMissing
        fun authorizerIpAddress(authorizerIpAddress: JsonField<String>) = apply {
            this.authorizerIpAddress = authorizerIpAddress
        }

        /** Name of the authorizer. */
        fun authorizerName(authorizerName: String) = authorizerName(JsonField.of(authorizerName))

        /** Name of the authorizer. */
        @JsonProperty("authorizer_name")
        @ExcludeMissing
        fun authorizerName(authorizerName: JsonField<String>) = apply {
            this.authorizerName = authorizerName
        }

        /** The time the Proof of Authorization Request Submission was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The time the Proof of Authorization Request Submission was created. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Whether the customer has been offboarded. */
        fun customerHasBeenOffboarded(customerHasBeenOffboarded: Boolean) =
            customerHasBeenOffboarded(JsonField.of(customerHasBeenOffboarded))

        /** Whether the customer has been offboarded. */
        @JsonProperty("customer_has_been_offboarded")
        @ExcludeMissing
        fun customerHasBeenOffboarded(customerHasBeenOffboarded: JsonField<Boolean>) = apply {
            this.customerHasBeenOffboarded = customerHasBeenOffboarded
        }

        /** The Proof of Authorization Request Submission identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Proof of Authorization Request Submission identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String) = idempotencyKey(JsonField.of(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /** ID of the proof of authorization request. */
        fun proofOfAuthorizationRequestId(proofOfAuthorizationRequestId: String) =
            proofOfAuthorizationRequestId(JsonField.of(proofOfAuthorizationRequestId))

        /** ID of the proof of authorization request. */
        @JsonProperty("proof_of_authorization_request_id")
        @ExcludeMissing
        fun proofOfAuthorizationRequestId(proofOfAuthorizationRequestId: JsonField<String>) =
            apply {
                this.proofOfAuthorizationRequestId = proofOfAuthorizationRequestId
            }

        /** Status of the proof of authorization request submission. */
        fun status(status: Status) = status(JsonField.of(status))

        /** Status of the proof of authorization request submission. */
        @JsonProperty("status")
        @ExcludeMissing
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
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The time the Proof of Authorization Request Submission was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /** The time the Proof of Authorization Request Submission was last updated. */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Whether account ownership was validated via credential (for instance, Plaid). */
        fun validatedAccountOwnershipViaCredential(
            validatedAccountOwnershipViaCredential: Boolean
        ) =
            validatedAccountOwnershipViaCredential(
                JsonField.of(validatedAccountOwnershipViaCredential)
            )

        /** Whether account ownership was validated via credential (for instance, Plaid). */
        @JsonProperty("validated_account_ownership_via_credential")
        @ExcludeMissing
        fun validatedAccountOwnershipViaCredential(
            validatedAccountOwnershipViaCredential: JsonField<Boolean>
        ) = apply {
            this.validatedAccountOwnershipViaCredential = validatedAccountOwnershipViaCredential
        }

        /** Whether account ownership was validated with an account statement. */
        fun validatedAccountOwnershipWithAccountStatement(
            validatedAccountOwnershipWithAccountStatement: Boolean
        ) =
            validatedAccountOwnershipWithAccountStatement(
                JsonField.of(validatedAccountOwnershipWithAccountStatement)
            )

        /** Whether account ownership was validated with an account statement. */
        @JsonProperty("validated_account_ownership_with_account_statement")
        @ExcludeMissing
        fun validatedAccountOwnershipWithAccountStatement(
            validatedAccountOwnershipWithAccountStatement: JsonField<Boolean>
        ) = apply {
            this.validatedAccountOwnershipWithAccountStatement =
                validatedAccountOwnershipWithAccountStatement
        }

        /** Whether account ownership was validated with microdeposit. */
        fun validatedAccountOwnershipWithMicrodeposit(
            validatedAccountOwnershipWithMicrodeposit: Boolean
        ) =
            validatedAccountOwnershipWithMicrodeposit(
                JsonField.of(validatedAccountOwnershipWithMicrodeposit)
            )

        /** Whether account ownership was validated with microdeposit. */
        @JsonProperty("validated_account_ownership_with_microdeposit")
        @ExcludeMissing
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

        fun build(): ProofOfAuthorizationRequestSubmission =
            ProofOfAuthorizationRequestSubmission(
                authorizationTerms,
                authorizedAt,
                authorizerCompany,
                authorizerEmail,
                authorizerIpAddress,
                authorizerName,
                createdAt,
                customerHasBeenOffboarded,
                id,
                idempotencyKey,
                proofOfAuthorizationRequestId,
                status,
                type,
                updatedAt,
                validatedAccountOwnershipViaCredential,
                validatedAccountOwnershipWithAccountStatement,
                validatedAccountOwnershipWithMicrodeposit,
                additionalProperties.toImmutable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PENDING_REVIEW = of("pending_review")

            @JvmField val REJECTED = of("rejected")

            @JvmField val CANCELED = of("canceled")

            @JvmField val PENDING_SENDING = of("pending_sending")

            @JvmField val SENT = of("sent")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING_REVIEW,
            REJECTED,
            CANCELED,
            PENDING_SENDING,
            SENT,
        }

        enum class Value {
            PENDING_REVIEW,
            REJECTED,
            CANCELED,
            PENDING_SENDING,
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

        return /* spotless:off */ other is ProofOfAuthorizationRequestSubmission && authorizationTerms == other.authorizationTerms && authorizedAt == other.authorizedAt && authorizerCompany == other.authorizerCompany && authorizerEmail == other.authorizerEmail && authorizerIpAddress == other.authorizerIpAddress && authorizerName == other.authorizerName && createdAt == other.createdAt && customerHasBeenOffboarded == other.customerHasBeenOffboarded && id == other.id && idempotencyKey == other.idempotencyKey && proofOfAuthorizationRequestId == other.proofOfAuthorizationRequestId && status == other.status && type == other.type && updatedAt == other.updatedAt && validatedAccountOwnershipViaCredential == other.validatedAccountOwnershipViaCredential && validatedAccountOwnershipWithAccountStatement == other.validatedAccountOwnershipWithAccountStatement && validatedAccountOwnershipWithMicrodeposit == other.validatedAccountOwnershipWithMicrodeposit && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(authorizationTerms, authorizedAt, authorizerCompany, authorizerEmail, authorizerIpAddress, authorizerName, createdAt, customerHasBeenOffboarded, id, idempotencyKey, proofOfAuthorizationRequestId, status, type, updatedAt, validatedAccountOwnershipViaCredential, validatedAccountOwnershipWithAccountStatement, validatedAccountOwnershipWithMicrodeposit, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProofOfAuthorizationRequestSubmission{authorizationTerms=$authorizationTerms, authorizedAt=$authorizedAt, authorizerCompany=$authorizerCompany, authorizerEmail=$authorizerEmail, authorizerIpAddress=$authorizerIpAddress, authorizerName=$authorizerName, createdAt=$createdAt, customerHasBeenOffboarded=$customerHasBeenOffboarded, id=$id, idempotencyKey=$idempotencyKey, proofOfAuthorizationRequestId=$proofOfAuthorizationRequestId, status=$status, type=$type, updatedAt=$updatedAt, validatedAccountOwnershipViaCredential=$validatedAccountOwnershipViaCredential, validatedAccountOwnershipWithAccountStatement=$validatedAccountOwnershipWithAccountStatement, validatedAccountOwnershipWithMicrodeposit=$validatedAccountOwnershipWithMicrodeposit, additionalProperties=$additionalProperties}"
}
