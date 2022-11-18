package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * If unauthorized activity occurs via ACH, you can create an Inbound ACH Transfer Return and we'll
 * reverse the transaction. You can create an Inbound ACH Transfer return the first two days after
 * receiving an Inbound ACH Transfer.
 */
@JsonDeserialize(builder = InboundAchTransferReturn.Builder::class)
@NoAutoDetect
class InboundAchTransferReturn
private constructor(
    private val id: JsonField<String>,
    private val inboundAchTransferTransactionId: JsonField<String>,
    private val transactionId: JsonField<String>,
    private val status: JsonField<Status>,
    private val reason: JsonField<Reason>,
    private val submission: JsonField<Submission>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The ID of the Inbound ACH Transfer Return. */
    fun id(): String = id.getRequired("id")

    /** The ID for the Transaction that is being returned. */
    fun inboundAchTransferTransactionId(): String =
        inboundAchTransferTransactionId.getRequired("inbound_ach_transfer_transaction_id")

    /** The ID for the transaction refunding the transfer. */
    fun transactionId(): Optional<String> =
        Optional.ofNullable(transactionId.getNullable("transaction_id"))

    /** The lifecycle status of the transfer. */
    fun status(): Status = status.getRequired("status")

    /** The reason why this transfer will be returned. This is sent to the initiating bank. */
    fun reason(): Reason = reason.getRequired("reason")

    /** After the return is submitted to FedACH, this will contain supplemental details. */
    fun submission(): Optional<Submission> =
        Optional.ofNullable(submission.getNullable("submission"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_ach_transfer_return`.
     */
    fun type(): Type = type.getRequired("type")

    /** The ID of the Inbound ACH Transfer Return. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The ID for the Transaction that is being returned. */
    @JsonProperty("inbound_ach_transfer_transaction_id")
    @ExcludeMissing
    fun _inboundAchTransferTransactionId() = inboundAchTransferTransactionId

    /** The ID for the transaction refunding the transfer. */
    @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

    /** The lifecycle status of the transfer. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The reason why this transfer will be returned. This is sent to the initiating bank. */
    @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

    /** After the return is submitted to FedACH, this will contain supplemental details. */
    @JsonProperty("submission") @ExcludeMissing fun _submission() = submission

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_ach_transfer_return`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            id()
            inboundAchTransferTransactionId()
            transactionId()
            status()
            reason()
            submission().map { it.validate() }
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundAchTransferReturn &&
            this.id == other.id &&
            this.inboundAchTransferTransactionId == other.inboundAchTransferTransactionId &&
            this.transactionId == other.transactionId &&
            this.status == other.status &&
            this.reason == other.reason &&
            this.submission == other.submission &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    inboundAchTransferTransactionId,
                    transactionId,
                    status,
                    reason,
                    submission,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "InboundAchTransferReturn{id=$id, inboundAchTransferTransactionId=$inboundAchTransferTransactionId, transactionId=$transactionId, status=$status, reason=$reason, submission=$submission, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var inboundAchTransferTransactionId: JsonField<String> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var reason: JsonField<Reason> = JsonMissing.of()
        private var submission: JsonField<Submission> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundAchTransferReturn: InboundAchTransferReturn) = apply {
            this.id = inboundAchTransferReturn.id
            this.inboundAchTransferTransactionId =
                inboundAchTransferReturn.inboundAchTransferTransactionId
            this.transactionId = inboundAchTransferReturn.transactionId
            this.status = inboundAchTransferReturn.status
            this.reason = inboundAchTransferReturn.reason
            this.submission = inboundAchTransferReturn.submission
            this.type = inboundAchTransferReturn.type
            additionalProperties(inboundAchTransferReturn.additionalProperties)
        }

        /** The ID of the Inbound ACH Transfer Return. */
        fun id(id: String) = id(JsonField.of(id))

        /** The ID of the Inbound ACH Transfer Return. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The ID for the Transaction that is being returned. */
        fun inboundAchTransferTransactionId(inboundAchTransferTransactionId: String) =
            inboundAchTransferTransactionId(JsonField.of(inboundAchTransferTransactionId))

        /** The ID for the Transaction that is being returned. */
        @JsonProperty("inbound_ach_transfer_transaction_id")
        @ExcludeMissing
        fun inboundAchTransferTransactionId(inboundAchTransferTransactionId: JsonField<String>) =
            apply {
                this.inboundAchTransferTransactionId = inboundAchTransferTransactionId
            }

        /** The ID for the transaction refunding the transfer. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** The ID for the transaction refunding the transfer. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /** The lifecycle status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the transfer. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The reason why this transfer will be returned. This is sent to the initiating bank. */
        fun reason(reason: Reason) = reason(JsonField.of(reason))

        /** The reason why this transfer will be returned. This is sent to the initiating bank. */
        @JsonProperty("reason")
        @ExcludeMissing
        fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

        /** After the return is submitted to FedACH, this will contain supplemental details. */
        fun submission(submission: Submission) = submission(JsonField.of(submission))

        /** After the return is submitted to FedACH, this will contain supplemental details. */
        @JsonProperty("submission")
        @ExcludeMissing
        fun submission(submission: JsonField<Submission>) = apply { this.submission = submission }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_ach_transfer_return`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_ach_transfer_return`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): InboundAchTransferReturn =
            InboundAchTransferReturn(
                id,
                inboundAchTransferTransactionId,
                transactionId,
                status,
                reason,
                submission,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PENDING_SUBMITTING = Status(JsonField.of("pending_submitting"))

            @JvmField val SUBMITTED = Status(JsonField.of("submitted"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING_SUBMITTING,
            SUBMITTED,
        }

        enum class Value {
            PENDING_SUBMITTING,
            SUBMITTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING_SUBMITTING -> Value.PENDING_SUBMITTING
                SUBMITTED -> Value.SUBMITTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING_SUBMITTING -> Known.PENDING_SUBMITTING
                SUBMITTED -> Known.SUBMITTED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Reason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Reason && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val AUTHORIZATION_REVOKED_BY_CUSTOMER =
                Reason(JsonField.of("authorization_revoked_by_customer"))

            @JvmField val PAYMENT_STOPPED = Reason(JsonField.of("payment_stopped"))

            @JvmField
            val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE =
                Reason(
                    JsonField.of("customer_advised_unauthorized_improper_ineligible_or_incomplete")
                )

            @JvmField
            val REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY =
                Reason(
                    JsonField.of(
                        "representative_payee_deceased_or_unable_to_continue_in_that_capacity"
                    )
                )

            @JvmField
            val BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED =
                Reason(JsonField.of("beneficiary_or_account_holder_deceased"))

            @JvmField
            val CREDIT_ENTRY_REFUSED_BY_RECEIVER =
                Reason(JsonField.of("credit_entry_refused_by_receiver"))

            @JvmField val DUPLICATE_ENTRY = Reason(JsonField.of("duplicate_entry"))

            @JvmField
            val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED =
                Reason(JsonField.of("corporate_customer_advised_not_authorized"))

            @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
        }

        enum class Known {
            AUTHORIZATION_REVOKED_BY_CUSTOMER,
            PAYMENT_STOPPED,
            CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
            REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
            BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
            CREDIT_ENTRY_REFUSED_BY_RECEIVER,
            DUPLICATE_ENTRY,
            CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
        }

        enum class Value {
            AUTHORIZATION_REVOKED_BY_CUSTOMER,
            PAYMENT_STOPPED,
            CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
            REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
            BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
            CREDIT_ENTRY_REFUSED_BY_RECEIVER,
            DUPLICATE_ENTRY,
            CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                AUTHORIZATION_REVOKED_BY_CUSTOMER -> Value.AUTHORIZATION_REVOKED_BY_CUSTOMER
                PAYMENT_STOPPED -> Value.PAYMENT_STOPPED
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                    Value.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                    Value.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                    Value.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                DUPLICATE_ENTRY -> Value.DUPLICATE_ENTRY
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                    Value.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                AUTHORIZATION_REVOKED_BY_CUSTOMER -> Known.AUTHORIZATION_REVOKED_BY_CUSTOMER
                PAYMENT_STOPPED -> Known.PAYMENT_STOPPED
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                    Known.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                    Known.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                    Known.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                DUPLICATE_ENTRY -> Known.DUPLICATE_ENTRY
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                    Known.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** After the return is submitted to FedACH, this will contain supplemental details. */
    @JsonDeserialize(builder = Submission.Builder::class)
    @NoAutoDetect
    class Submission
    private constructor(
        private val traceNumber: JsonField<String>,
        private val submittedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The trace number for the submission. */
        fun traceNumber(): String = traceNumber.getRequired("trace_number")

        /** When the ACH transfer return was sent to FedACH. */
        fun submittedAt(): OffsetDateTime = submittedAt.getRequired("submitted_at")

        /** The trace number for the submission. */
        @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

        /** When the ACH transfer return was sent to FedACH. */
        @JsonProperty("submitted_at") @ExcludeMissing fun _submittedAt() = submittedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
                traceNumber()
                submittedAt()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Submission &&
                this.traceNumber == other.traceNumber &&
                this.submittedAt == other.submittedAt &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        traceNumber,
                        submittedAt,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Submission{traceNumber=$traceNumber, submittedAt=$submittedAt, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var traceNumber: JsonField<String> = JsonMissing.of()
            private var submittedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(submission: Submission) = apply {
                this.traceNumber = submission.traceNumber
                this.submittedAt = submission.submittedAt
                additionalProperties(submission.additionalProperties)
            }

            /** The trace number for the submission. */
            fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

            /** The trace number for the submission. */
            @JsonProperty("trace_number")
            @ExcludeMissing
            fun traceNumber(traceNumber: JsonField<String>) = apply {
                this.traceNumber = traceNumber
            }

            /** When the ACH transfer return was sent to FedACH. */
            fun submittedAt(submittedAt: OffsetDateTime) = submittedAt(JsonField.of(submittedAt))

            /** When the ACH transfer return was sent to FedACH. */
            @JsonProperty("submitted_at")
            @ExcludeMissing
            fun submittedAt(submittedAt: JsonField<OffsetDateTime>) = apply {
                this.submittedAt = submittedAt
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

            fun build(): Submission =
                Submission(
                    traceNumber,
                    submittedAt,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val INBOUND_ACH_TRANSFER_RETURN = Type(JsonField.of("inbound_ach_transfer_return"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INBOUND_ACH_TRANSFER_RETURN,
        }

        enum class Value {
            INBOUND_ACH_TRANSFER_RETURN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INBOUND_ACH_TRANSFER_RETURN -> Value.INBOUND_ACH_TRANSFER_RETURN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INBOUND_ACH_TRANSFER_RETURN -> Known.INBOUND_ACH_TRANSFER_RETURN
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
