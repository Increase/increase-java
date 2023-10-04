// File generated from our OpenAPI spec by Stainless.

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

/** An Inbound ACH Transfer is an ACH transfer initiated outside of Increase to your account. */
@JsonDeserialize(builder = InboundAchTransfer.Builder::class)
@NoAutoDetect
class InboundAchTransfer
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<Long>,
    private val accountNumberId: JsonField<String>,
    private val direction: JsonField<Direction>,
    private val status: JsonField<Status>,
    private val originatorCompanyName: JsonField<String>,
    private val originatorCompanyDescriptiveDate: JsonField<String>,
    private val originatorCompanyDiscretionaryData: JsonField<String>,
    private val originatorCompanyEntryDescription: JsonField<String>,
    private val originatorCompanyId: JsonField<String>,
    private val originatorRoutingNumber: JsonField<String>,
    private val receiverIdNumber: JsonField<String>,
    private val receiverName: JsonField<String>,
    private val traceNumber: JsonField<String>,
    private val automaticallyResolvesAt: JsonField<OffsetDateTime>,
    private val acceptance: JsonField<Acceptance>,
    private val decline: JsonField<Decline>,
    private val transferReturn: JsonField<TransferReturn>,
    private val notificationOfChange: JsonField<NotificationOfChange>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The inbound ach transfer's identifier. */
    fun id(): String = id.getRequired("id")

    /** The transfer amount in USD cents. */
    fun amount(): Long = amount.getRequired("amount")

    /** The identifier of the Account Number to which this transfer was sent. */
    fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

    /** The direction of the transfer. */
    fun direction(): Direction = direction.getRequired("direction")

    /** The status of the transfer. */
    fun status(): Status = status.getRequired("status")

    /** The name of the company that initiated the transfer. */
    fun originatorCompanyName(): String =
        originatorCompanyName.getRequired("originator_company_name")

    /** The descriptive date of the transfer. */
    fun originatorCompanyDescriptiveDate(): Optional<String> =
        Optional.ofNullable(
            originatorCompanyDescriptiveDate.getNullable("originator_company_descriptive_date")
        )

    /** The additional information included with the transfer. */
    fun originatorCompanyDiscretionaryData(): Optional<String> =
        Optional.ofNullable(
            originatorCompanyDiscretionaryData.getNullable("originator_company_discretionary_data")
        )

    /** The description of the transfer. */
    fun originatorCompanyEntryDescription(): String =
        originatorCompanyEntryDescription.getRequired("originator_company_entry_description")

    /** The id of the company that initiated the transfer. */
    fun originatorCompanyId(): String = originatorCompanyId.getRequired("originator_company_id")

    /**
     * The American Banking Association (ABA) routing number of the bank originating the transfer.
     */
    fun originatorRoutingNumber(): String =
        originatorRoutingNumber.getRequired("originator_routing_number")

    /** The id of the receiver of the transfer. */
    fun receiverIdNumber(): Optional<String> =
        Optional.ofNullable(receiverIdNumber.getNullable("receiver_id_number"))

    /** The name of the receiver of the transfer. */
    fun receiverName(): Optional<String> =
        Optional.ofNullable(receiverName.getNullable("receiver_name"))

    /** The trace number of the transfer. */
    fun traceNumber(): String = traceNumber.getRequired("trace_number")

    /** The time at which the transfer will be automatically resolved. */
    fun automaticallyResolvesAt(): OffsetDateTime =
        automaticallyResolvesAt.getRequired("automatically_resolves_at")

    /** If your transfer is accepted, this will contain details of the acceptance. */
    fun acceptance(): Optional<Acceptance> =
        Optional.ofNullable(acceptance.getNullable("acceptance"))

    /** If your transfer is declined, this will contain details of the decline. */
    fun decline(): Optional<Decline> = Optional.ofNullable(decline.getNullable("decline"))

    /** If your transfer is returned, this will contain details of the return. */
    fun transferReturn(): Optional<TransferReturn> =
        Optional.ofNullable(transferReturn.getNullable("transfer_return"))

    /**
     * If you initiate a notification of change in response to the transfer, this will contain its
     * details.
     */
    fun notificationOfChange(): Optional<NotificationOfChange> =
        Optional.ofNullable(notificationOfChange.getNullable("notification_of_change"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_ach_transfer`.
     */
    fun type(): Type = type.getRequired("type")

    /** The inbound ach transfer's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The transfer amount in USD cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** The identifier of the Account Number to which this transfer was sent. */
    @JsonProperty("account_number_id") @ExcludeMissing fun _accountNumberId() = accountNumberId

    /** The direction of the transfer. */
    @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

    /** The status of the transfer. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The name of the company that initiated the transfer. */
    @JsonProperty("originator_company_name")
    @ExcludeMissing
    fun _originatorCompanyName() = originatorCompanyName

    /** The descriptive date of the transfer. */
    @JsonProperty("originator_company_descriptive_date")
    @ExcludeMissing
    fun _originatorCompanyDescriptiveDate() = originatorCompanyDescriptiveDate

    /** The additional information included with the transfer. */
    @JsonProperty("originator_company_discretionary_data")
    @ExcludeMissing
    fun _originatorCompanyDiscretionaryData() = originatorCompanyDiscretionaryData

    /** The description of the transfer. */
    @JsonProperty("originator_company_entry_description")
    @ExcludeMissing
    fun _originatorCompanyEntryDescription() = originatorCompanyEntryDescription

    /** The id of the company that initiated the transfer. */
    @JsonProperty("originator_company_id")
    @ExcludeMissing
    fun _originatorCompanyId() = originatorCompanyId

    /**
     * The American Banking Association (ABA) routing number of the bank originating the transfer.
     */
    @JsonProperty("originator_routing_number")
    @ExcludeMissing
    fun _originatorRoutingNumber() = originatorRoutingNumber

    /** The id of the receiver of the transfer. */
    @JsonProperty("receiver_id_number") @ExcludeMissing fun _receiverIdNumber() = receiverIdNumber

    /** The name of the receiver of the transfer. */
    @JsonProperty("receiver_name") @ExcludeMissing fun _receiverName() = receiverName

    /** The trace number of the transfer. */
    @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

    /** The time at which the transfer will be automatically resolved. */
    @JsonProperty("automatically_resolves_at")
    @ExcludeMissing
    fun _automaticallyResolvesAt() = automaticallyResolvesAt

    /** If your transfer is accepted, this will contain details of the acceptance. */
    @JsonProperty("acceptance") @ExcludeMissing fun _acceptance() = acceptance

    /** If your transfer is declined, this will contain details of the decline. */
    @JsonProperty("decline") @ExcludeMissing fun _decline() = decline

    /** If your transfer is returned, this will contain details of the return. */
    @JsonProperty("transfer_return") @ExcludeMissing fun _transferReturn() = transferReturn

    /**
     * If you initiate a notification of change in response to the transfer, this will contain its
     * details.
     */
    @JsonProperty("notification_of_change")
    @ExcludeMissing
    fun _notificationOfChange() = notificationOfChange

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_ach_transfer`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): InboundAchTransfer = apply {
        if (!validated) {
            id()
            amount()
            accountNumberId()
            direction()
            status()
            originatorCompanyName()
            originatorCompanyDescriptiveDate()
            originatorCompanyDiscretionaryData()
            originatorCompanyEntryDescription()
            originatorCompanyId()
            originatorRoutingNumber()
            receiverIdNumber()
            receiverName()
            traceNumber()
            automaticallyResolvesAt()
            acceptance().map { it.validate() }
            decline().map { it.validate() }
            transferReturn().map { it.validate() }
            notificationOfChange().map { it.validate() }
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundAchTransfer &&
            this.id == other.id &&
            this.amount == other.amount &&
            this.accountNumberId == other.accountNumberId &&
            this.direction == other.direction &&
            this.status == other.status &&
            this.originatorCompanyName == other.originatorCompanyName &&
            this.originatorCompanyDescriptiveDate == other.originatorCompanyDescriptiveDate &&
            this.originatorCompanyDiscretionaryData == other.originatorCompanyDiscretionaryData &&
            this.originatorCompanyEntryDescription == other.originatorCompanyEntryDescription &&
            this.originatorCompanyId == other.originatorCompanyId &&
            this.originatorRoutingNumber == other.originatorRoutingNumber &&
            this.receiverIdNumber == other.receiverIdNumber &&
            this.receiverName == other.receiverName &&
            this.traceNumber == other.traceNumber &&
            this.automaticallyResolvesAt == other.automaticallyResolvesAt &&
            this.acceptance == other.acceptance &&
            this.decline == other.decline &&
            this.transferReturn == other.transferReturn &&
            this.notificationOfChange == other.notificationOfChange &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    amount,
                    accountNumberId,
                    direction,
                    status,
                    originatorCompanyName,
                    originatorCompanyDescriptiveDate,
                    originatorCompanyDiscretionaryData,
                    originatorCompanyEntryDescription,
                    originatorCompanyId,
                    originatorRoutingNumber,
                    receiverIdNumber,
                    receiverName,
                    traceNumber,
                    automaticallyResolvesAt,
                    acceptance,
                    decline,
                    transferReturn,
                    notificationOfChange,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "InboundAchTransfer{id=$id, amount=$amount, accountNumberId=$accountNumberId, direction=$direction, status=$status, originatorCompanyName=$originatorCompanyName, originatorCompanyDescriptiveDate=$originatorCompanyDescriptiveDate, originatorCompanyDiscretionaryData=$originatorCompanyDiscretionaryData, originatorCompanyEntryDescription=$originatorCompanyEntryDescription, originatorCompanyId=$originatorCompanyId, originatorRoutingNumber=$originatorRoutingNumber, receiverIdNumber=$receiverIdNumber, receiverName=$receiverName, traceNumber=$traceNumber, automaticallyResolvesAt=$automaticallyResolvesAt, acceptance=$acceptance, decline=$decline, transferReturn=$transferReturn, notificationOfChange=$notificationOfChange, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var accountNumberId: JsonField<String> = JsonMissing.of()
        private var direction: JsonField<Direction> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var originatorCompanyName: JsonField<String> = JsonMissing.of()
        private var originatorCompanyDescriptiveDate: JsonField<String> = JsonMissing.of()
        private var originatorCompanyDiscretionaryData: JsonField<String> = JsonMissing.of()
        private var originatorCompanyEntryDescription: JsonField<String> = JsonMissing.of()
        private var originatorCompanyId: JsonField<String> = JsonMissing.of()
        private var originatorRoutingNumber: JsonField<String> = JsonMissing.of()
        private var receiverIdNumber: JsonField<String> = JsonMissing.of()
        private var receiverName: JsonField<String> = JsonMissing.of()
        private var traceNumber: JsonField<String> = JsonMissing.of()
        private var automaticallyResolvesAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var acceptance: JsonField<Acceptance> = JsonMissing.of()
        private var decline: JsonField<Decline> = JsonMissing.of()
        private var transferReturn: JsonField<TransferReturn> = JsonMissing.of()
        private var notificationOfChange: JsonField<NotificationOfChange> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundAchTransfer: InboundAchTransfer) = apply {
            this.id = inboundAchTransfer.id
            this.amount = inboundAchTransfer.amount
            this.accountNumberId = inboundAchTransfer.accountNumberId
            this.direction = inboundAchTransfer.direction
            this.status = inboundAchTransfer.status
            this.originatorCompanyName = inboundAchTransfer.originatorCompanyName
            this.originatorCompanyDescriptiveDate =
                inboundAchTransfer.originatorCompanyDescriptiveDate
            this.originatorCompanyDiscretionaryData =
                inboundAchTransfer.originatorCompanyDiscretionaryData
            this.originatorCompanyEntryDescription =
                inboundAchTransfer.originatorCompanyEntryDescription
            this.originatorCompanyId = inboundAchTransfer.originatorCompanyId
            this.originatorRoutingNumber = inboundAchTransfer.originatorRoutingNumber
            this.receiverIdNumber = inboundAchTransfer.receiverIdNumber
            this.receiverName = inboundAchTransfer.receiverName
            this.traceNumber = inboundAchTransfer.traceNumber
            this.automaticallyResolvesAt = inboundAchTransfer.automaticallyResolvesAt
            this.acceptance = inboundAchTransfer.acceptance
            this.decline = inboundAchTransfer.decline
            this.transferReturn = inboundAchTransfer.transferReturn
            this.notificationOfChange = inboundAchTransfer.notificationOfChange
            this.type = inboundAchTransfer.type
            additionalProperties(inboundAchTransfer.additionalProperties)
        }

        /** The inbound ach transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The inbound ach transfer's identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The transfer amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The transfer amount in USD cents. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The identifier of the Account Number to which this transfer was sent. */
        fun accountNumberId(accountNumberId: String) =
            accountNumberId(JsonField.of(accountNumberId))

        /** The identifier of the Account Number to which this transfer was sent. */
        @JsonProperty("account_number_id")
        @ExcludeMissing
        fun accountNumberId(accountNumberId: JsonField<String>) = apply {
            this.accountNumberId = accountNumberId
        }

        /** The direction of the transfer. */
        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /** The direction of the transfer. */
        @JsonProperty("direction")
        @ExcludeMissing
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /** The status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the transfer. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The name of the company that initiated the transfer. */
        fun originatorCompanyName(originatorCompanyName: String) =
            originatorCompanyName(JsonField.of(originatorCompanyName))

        /** The name of the company that initiated the transfer. */
        @JsonProperty("originator_company_name")
        @ExcludeMissing
        fun originatorCompanyName(originatorCompanyName: JsonField<String>) = apply {
            this.originatorCompanyName = originatorCompanyName
        }

        /** The descriptive date of the transfer. */
        fun originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate: String) =
            originatorCompanyDescriptiveDate(JsonField.of(originatorCompanyDescriptiveDate))

        /** The descriptive date of the transfer. */
        @JsonProperty("originator_company_descriptive_date")
        @ExcludeMissing
        fun originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate: JsonField<String>) =
            apply {
                this.originatorCompanyDescriptiveDate = originatorCompanyDescriptiveDate
            }

        /** The additional information included with the transfer. */
        fun originatorCompanyDiscretionaryData(originatorCompanyDiscretionaryData: String) =
            originatorCompanyDiscretionaryData(JsonField.of(originatorCompanyDiscretionaryData))

        /** The additional information included with the transfer. */
        @JsonProperty("originator_company_discretionary_data")
        @ExcludeMissing
        fun originatorCompanyDiscretionaryData(
            originatorCompanyDiscretionaryData: JsonField<String>
        ) = apply { this.originatorCompanyDiscretionaryData = originatorCompanyDiscretionaryData }

        /** The description of the transfer. */
        fun originatorCompanyEntryDescription(originatorCompanyEntryDescription: String) =
            originatorCompanyEntryDescription(JsonField.of(originatorCompanyEntryDescription))

        /** The description of the transfer. */
        @JsonProperty("originator_company_entry_description")
        @ExcludeMissing
        fun originatorCompanyEntryDescription(
            originatorCompanyEntryDescription: JsonField<String>
        ) = apply { this.originatorCompanyEntryDescription = originatorCompanyEntryDescription }

        /** The id of the company that initiated the transfer. */
        fun originatorCompanyId(originatorCompanyId: String) =
            originatorCompanyId(JsonField.of(originatorCompanyId))

        /** The id of the company that initiated the transfer. */
        @JsonProperty("originator_company_id")
        @ExcludeMissing
        fun originatorCompanyId(originatorCompanyId: JsonField<String>) = apply {
            this.originatorCompanyId = originatorCompanyId
        }

        /**
         * The American Banking Association (ABA) routing number of the bank originating the
         * transfer.
         */
        fun originatorRoutingNumber(originatorRoutingNumber: String) =
            originatorRoutingNumber(JsonField.of(originatorRoutingNumber))

        /**
         * The American Banking Association (ABA) routing number of the bank originating the
         * transfer.
         */
        @JsonProperty("originator_routing_number")
        @ExcludeMissing
        fun originatorRoutingNumber(originatorRoutingNumber: JsonField<String>) = apply {
            this.originatorRoutingNumber = originatorRoutingNumber
        }

        /** The id of the receiver of the transfer. */
        fun receiverIdNumber(receiverIdNumber: String) =
            receiverIdNumber(JsonField.of(receiverIdNumber))

        /** The id of the receiver of the transfer. */
        @JsonProperty("receiver_id_number")
        @ExcludeMissing
        fun receiverIdNumber(receiverIdNumber: JsonField<String>) = apply {
            this.receiverIdNumber = receiverIdNumber
        }

        /** The name of the receiver of the transfer. */
        fun receiverName(receiverName: String) = receiverName(JsonField.of(receiverName))

        /** The name of the receiver of the transfer. */
        @JsonProperty("receiver_name")
        @ExcludeMissing
        fun receiverName(receiverName: JsonField<String>) = apply {
            this.receiverName = receiverName
        }

        /** The trace number of the transfer. */
        fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

        /** The trace number of the transfer. */
        @JsonProperty("trace_number")
        @ExcludeMissing
        fun traceNumber(traceNumber: JsonField<String>) = apply { this.traceNumber = traceNumber }

        /** The time at which the transfer will be automatically resolved. */
        fun automaticallyResolvesAt(automaticallyResolvesAt: OffsetDateTime) =
            automaticallyResolvesAt(JsonField.of(automaticallyResolvesAt))

        /** The time at which the transfer will be automatically resolved. */
        @JsonProperty("automatically_resolves_at")
        @ExcludeMissing
        fun automaticallyResolvesAt(automaticallyResolvesAt: JsonField<OffsetDateTime>) = apply {
            this.automaticallyResolvesAt = automaticallyResolvesAt
        }

        /** If your transfer is accepted, this will contain details of the acceptance. */
        fun acceptance(acceptance: Acceptance) = acceptance(JsonField.of(acceptance))

        /** If your transfer is accepted, this will contain details of the acceptance. */
        @JsonProperty("acceptance")
        @ExcludeMissing
        fun acceptance(acceptance: JsonField<Acceptance>) = apply { this.acceptance = acceptance }

        /** If your transfer is declined, this will contain details of the decline. */
        fun decline(decline: Decline) = decline(JsonField.of(decline))

        /** If your transfer is declined, this will contain details of the decline. */
        @JsonProperty("decline")
        @ExcludeMissing
        fun decline(decline: JsonField<Decline>) = apply { this.decline = decline }

        /** If your transfer is returned, this will contain details of the return. */
        fun transferReturn(transferReturn: TransferReturn) =
            transferReturn(JsonField.of(transferReturn))

        /** If your transfer is returned, this will contain details of the return. */
        @JsonProperty("transfer_return")
        @ExcludeMissing
        fun transferReturn(transferReturn: JsonField<TransferReturn>) = apply {
            this.transferReturn = transferReturn
        }

        /**
         * If you initiate a notification of change in response to the transfer, this will contain
         * its details.
         */
        fun notificationOfChange(notificationOfChange: NotificationOfChange) =
            notificationOfChange(JsonField.of(notificationOfChange))

        /**
         * If you initiate a notification of change in response to the transfer, this will contain
         * its details.
         */
        @JsonProperty("notification_of_change")
        @ExcludeMissing
        fun notificationOfChange(notificationOfChange: JsonField<NotificationOfChange>) = apply {
            this.notificationOfChange = notificationOfChange
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_ach_transfer`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_ach_transfer`.
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

        fun build(): InboundAchTransfer =
            InboundAchTransfer(
                id,
                amount,
                accountNumberId,
                direction,
                status,
                originatorCompanyName,
                originatorCompanyDescriptiveDate,
                originatorCompanyDiscretionaryData,
                originatorCompanyEntryDescription,
                originatorCompanyId,
                originatorRoutingNumber,
                receiverIdNumber,
                receiverName,
                traceNumber,
                automaticallyResolvesAt,
                acceptance,
                decline,
                transferReturn,
                notificationOfChange,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** If your transfer is accepted, this will contain details of the acceptance. */
    @JsonDeserialize(builder = Acceptance.Builder::class)
    @NoAutoDetect
    class Acceptance
    private constructor(
        private val acceptedAt: JsonField<OffsetDateTime>,
        private val transactionId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The time at which the transfer was accepted. */
        fun acceptedAt(): OffsetDateTime = acceptedAt.getRequired("accepted_at")

        /** The id of the transaction for the accepted transfer. */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /** The time at which the transfer was accepted. */
        @JsonProperty("accepted_at") @ExcludeMissing fun _acceptedAt() = acceptedAt

        /** The id of the transaction for the accepted transfer. */
        @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Acceptance = apply {
            if (!validated) {
                acceptedAt()
                transactionId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Acceptance &&
                this.acceptedAt == other.acceptedAt &&
                this.transactionId == other.transactionId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        acceptedAt,
                        transactionId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Acceptance{acceptedAt=$acceptedAt, transactionId=$transactionId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var acceptedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(acceptance: Acceptance) = apply {
                this.acceptedAt = acceptance.acceptedAt
                this.transactionId = acceptance.transactionId
                additionalProperties(acceptance.additionalProperties)
            }

            /** The time at which the transfer was accepted. */
            fun acceptedAt(acceptedAt: OffsetDateTime) = acceptedAt(JsonField.of(acceptedAt))

            /** The time at which the transfer was accepted. */
            @JsonProperty("accepted_at")
            @ExcludeMissing
            fun acceptedAt(acceptedAt: JsonField<OffsetDateTime>) = apply {
                this.acceptedAt = acceptedAt
            }

            /** The id of the transaction for the accepted transfer. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The id of the transaction for the accepted transfer. */
            @JsonProperty("transaction_id")
            @ExcludeMissing
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
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

            fun build(): Acceptance =
                Acceptance(
                    acceptedAt,
                    transactionId,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    /** If your transfer is declined, this will contain details of the decline. */
    @JsonDeserialize(builder = Decline.Builder::class)
    @NoAutoDetect
    class Decline
    private constructor(
        private val reason: JsonField<Reason>,
        private val declinedAt: JsonField<OffsetDateTime>,
        private val declinedTransactionId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The reason for the transfer decline. */
        fun reason(): Reason = reason.getRequired("reason")

        /** The time at which the transfer was declined. */
        fun declinedAt(): OffsetDateTime = declinedAt.getRequired("declined_at")

        /** The id of the transaction for the declined transfer. */
        fun declinedTransactionId(): String =
            declinedTransactionId.getRequired("declined_transaction_id")

        /** The reason for the transfer decline. */
        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        /** The time at which the transfer was declined. */
        @JsonProperty("declined_at") @ExcludeMissing fun _declinedAt() = declinedAt

        /** The id of the transaction for the declined transfer. */
        @JsonProperty("declined_transaction_id")
        @ExcludeMissing
        fun _declinedTransactionId() = declinedTransactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Decline = apply {
            if (!validated) {
                reason()
                declinedAt()
                declinedTransactionId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Decline &&
                this.reason == other.reason &&
                this.declinedAt == other.declinedAt &&
                this.declinedTransactionId == other.declinedTransactionId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        reason,
                        declinedAt,
                        declinedTransactionId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Decline{reason=$reason, declinedAt=$declinedAt, declinedTransactionId=$declinedTransactionId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var reason: JsonField<Reason> = JsonMissing.of()
            private var declinedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var declinedTransactionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(decline: Decline) = apply {
                this.reason = decline.reason
                this.declinedAt = decline.declinedAt
                this.declinedTransactionId = decline.declinedTransactionId
                additionalProperties(decline.additionalProperties)
            }

            /** The reason for the transfer decline. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** The reason for the transfer decline. */
            @JsonProperty("reason")
            @ExcludeMissing
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /** The time at which the transfer was declined. */
            fun declinedAt(declinedAt: OffsetDateTime) = declinedAt(JsonField.of(declinedAt))

            /** The time at which the transfer was declined. */
            @JsonProperty("declined_at")
            @ExcludeMissing
            fun declinedAt(declinedAt: JsonField<OffsetDateTime>) = apply {
                this.declinedAt = declinedAt
            }

            /** The id of the transaction for the declined transfer. */
            fun declinedTransactionId(declinedTransactionId: String) =
                declinedTransactionId(JsonField.of(declinedTransactionId))

            /** The id of the transaction for the declined transfer. */
            @JsonProperty("declined_transaction_id")
            @ExcludeMissing
            fun declinedTransactionId(declinedTransactionId: JsonField<String>) = apply {
                this.declinedTransactionId = declinedTransactionId
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

            fun build(): Decline =
                Decline(
                    reason,
                    declinedAt,
                    declinedTransactionId,
                    additionalProperties.toUnmodifiable(),
                )
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

                @JvmField val ACH_ROUTE_CANCELED = Reason(JsonField.of("ach_route_canceled"))

                @JvmField val ACH_ROUTE_DISABLED = Reason(JsonField.of("ach_route_disabled"))

                @JvmField val BREACHES_LIMIT = Reason(JsonField.of("breaches_limit"))

                @JvmField
                val CREDIT_ENTRY_REFUSED_BY_RECEIVER =
                    Reason(JsonField.of("credit_entry_refused_by_receiver"))

                @JvmField val DUPLICATE_RETURN = Reason(JsonField.of("duplicate_return"))

                @JvmField val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                @JvmField val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                @JvmField val INSUFFICIENT_FUNDS = Reason(JsonField.of("insufficient_funds"))

                @JvmField val MISROUTED_RETURN = Reason(JsonField.of("misrouted_return"))

                @JvmField
                val RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT =
                    Reason(JsonField.of("return_of_erroneous_or_reversing_debit"))

                @JvmField val NO_ACH_ROUTE = Reason(JsonField.of("no_ach_route"))

                @JvmField val ORIGINATOR_REQUEST = Reason(JsonField.of("originator_request"))

                @JvmField
                val TRANSACTION_NOT_ALLOWED = Reason(JsonField.of("transaction_not_allowed"))

                @JvmField val USER_INITIATED = Reason(JsonField.of("user_initiated"))

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            enum class Known {
                ACH_ROUTE_CANCELED,
                ACH_ROUTE_DISABLED,
                BREACHES_LIMIT,
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                DUPLICATE_RETURN,
                ENTITY_NOT_ACTIVE,
                GROUP_LOCKED,
                INSUFFICIENT_FUNDS,
                MISROUTED_RETURN,
                RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT,
                NO_ACH_ROUTE,
                ORIGINATOR_REQUEST,
                TRANSACTION_NOT_ALLOWED,
                USER_INITIATED,
            }

            enum class Value {
                ACH_ROUTE_CANCELED,
                ACH_ROUTE_DISABLED,
                BREACHES_LIMIT,
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                DUPLICATE_RETURN,
                ENTITY_NOT_ACTIVE,
                GROUP_LOCKED,
                INSUFFICIENT_FUNDS,
                MISROUTED_RETURN,
                RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT,
                NO_ACH_ROUTE,
                ORIGINATOR_REQUEST,
                TRANSACTION_NOT_ALLOWED,
                USER_INITIATED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACH_ROUTE_CANCELED -> Value.ACH_ROUTE_CANCELED
                    ACH_ROUTE_DISABLED -> Value.ACH_ROUTE_DISABLED
                    BREACHES_LIMIT -> Value.BREACHES_LIMIT
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                    DUPLICATE_RETURN -> Value.DUPLICATE_RETURN
                    ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                    GROUP_LOCKED -> Value.GROUP_LOCKED
                    INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                    MISROUTED_RETURN -> Value.MISROUTED_RETURN
                    RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT ->
                        Value.RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT
                    NO_ACH_ROUTE -> Value.NO_ACH_ROUTE
                    ORIGINATOR_REQUEST -> Value.ORIGINATOR_REQUEST
                    TRANSACTION_NOT_ALLOWED -> Value.TRANSACTION_NOT_ALLOWED
                    USER_INITIATED -> Value.USER_INITIATED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACH_ROUTE_CANCELED -> Known.ACH_ROUTE_CANCELED
                    ACH_ROUTE_DISABLED -> Known.ACH_ROUTE_DISABLED
                    BREACHES_LIMIT -> Known.BREACHES_LIMIT
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                    DUPLICATE_RETURN -> Known.DUPLICATE_RETURN
                    ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                    GROUP_LOCKED -> Known.GROUP_LOCKED
                    INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                    MISROUTED_RETURN -> Known.MISROUTED_RETURN
                    RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT ->
                        Known.RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT
                    NO_ACH_ROUTE -> Known.NO_ACH_ROUTE
                    ORIGINATOR_REQUEST -> Known.ORIGINATOR_REQUEST
                    TRANSACTION_NOT_ALLOWED -> Known.TRANSACTION_NOT_ALLOWED
                    USER_INITIATED -> Known.USER_INITIATED
                    else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Direction && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CREDIT = Direction(JsonField.of("credit"))

            @JvmField val DEBIT = Direction(JsonField.of("debit"))

            @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
        }

        enum class Known {
            CREDIT,
            DEBIT,
        }

        enum class Value {
            CREDIT,
            DEBIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw IncreaseInvalidDataException("Unknown Direction: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * If you initiate a notification of change in response to the transfer, this will contain its
     * details.
     */
    @JsonDeserialize(builder = NotificationOfChange.Builder::class)
    @NoAutoDetect
    class NotificationOfChange
    private constructor(
        private val updatedAccountNumber: JsonField<String>,
        private val updatedRoutingNumber: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The new account number provided in the notification of change. */
        fun updatedAccountNumber(): Optional<String> =
            Optional.ofNullable(updatedAccountNumber.getNullable("updated_account_number"))

        /** The new account number provided in the notification of change. */
        fun updatedRoutingNumber(): Optional<String> =
            Optional.ofNullable(updatedRoutingNumber.getNullable("updated_routing_number"))

        /** The new account number provided in the notification of change. */
        @JsonProperty("updated_account_number")
        @ExcludeMissing
        fun _updatedAccountNumber() = updatedAccountNumber

        /** The new account number provided in the notification of change. */
        @JsonProperty("updated_routing_number")
        @ExcludeMissing
        fun _updatedRoutingNumber() = updatedRoutingNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): NotificationOfChange = apply {
            if (!validated) {
                updatedAccountNumber()
                updatedRoutingNumber()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is NotificationOfChange &&
                this.updatedAccountNumber == other.updatedAccountNumber &&
                this.updatedRoutingNumber == other.updatedRoutingNumber &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        updatedAccountNumber,
                        updatedRoutingNumber,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "NotificationOfChange{updatedAccountNumber=$updatedAccountNumber, updatedRoutingNumber=$updatedRoutingNumber, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var updatedAccountNumber: JsonField<String> = JsonMissing.of()
            private var updatedRoutingNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(notificationOfChange: NotificationOfChange) = apply {
                this.updatedAccountNumber = notificationOfChange.updatedAccountNumber
                this.updatedRoutingNumber = notificationOfChange.updatedRoutingNumber
                additionalProperties(notificationOfChange.additionalProperties)
            }

            /** The new account number provided in the notification of change. */
            fun updatedAccountNumber(updatedAccountNumber: String) =
                updatedAccountNumber(JsonField.of(updatedAccountNumber))

            /** The new account number provided in the notification of change. */
            @JsonProperty("updated_account_number")
            @ExcludeMissing
            fun updatedAccountNumber(updatedAccountNumber: JsonField<String>) = apply {
                this.updatedAccountNumber = updatedAccountNumber
            }

            /** The new account number provided in the notification of change. */
            fun updatedRoutingNumber(updatedRoutingNumber: String) =
                updatedRoutingNumber(JsonField.of(updatedRoutingNumber))

            /** The new account number provided in the notification of change. */
            @JsonProperty("updated_routing_number")
            @ExcludeMissing
            fun updatedRoutingNumber(updatedRoutingNumber: JsonField<String>) = apply {
                this.updatedRoutingNumber = updatedRoutingNumber
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

            fun build(): NotificationOfChange =
                NotificationOfChange(
                    updatedAccountNumber,
                    updatedRoutingNumber,
                    additionalProperties.toUnmodifiable(),
                )
        }
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

            @JvmField val PENDING = Status(JsonField.of("pending"))

            @JvmField val DECLINED = Status(JsonField.of("declined"))

            @JvmField val ACCEPTED = Status(JsonField.of("accepted"))

            @JvmField val RETURNED = Status(JsonField.of("returned"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            DECLINED,
            ACCEPTED,
            RETURNED,
        }

        enum class Value {
            PENDING,
            DECLINED,
            ACCEPTED,
            RETURNED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                DECLINED -> Value.DECLINED
                ACCEPTED -> Value.ACCEPTED
                RETURNED -> Value.RETURNED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                DECLINED -> Known.DECLINED
                ACCEPTED -> Known.ACCEPTED
                RETURNED -> Known.RETURNED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** If your transfer is returned, this will contain details of the return. */
    @JsonDeserialize(builder = TransferReturn.Builder::class)
    @NoAutoDetect
    class TransferReturn
    private constructor(
        private val reason: JsonField<Reason>,
        private val returnedAt: JsonField<OffsetDateTime>,
        private val transactionId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The reason for the transfer return. */
        fun reason(): Reason = reason.getRequired("reason")

        /** The time at which the transfer was returned. */
        fun returnedAt(): OffsetDateTime = returnedAt.getRequired("returned_at")

        /** The id of the transaction for the returned transfer. */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /** The reason for the transfer return. */
        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        /** The time at which the transfer was returned. */
        @JsonProperty("returned_at") @ExcludeMissing fun _returnedAt() = returnedAt

        /** The id of the transaction for the returned transfer. */
        @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): TransferReturn = apply {
            if (!validated) {
                reason()
                returnedAt()
                transactionId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransferReturn &&
                this.reason == other.reason &&
                this.returnedAt == other.returnedAt &&
                this.transactionId == other.transactionId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        reason,
                        returnedAt,
                        transactionId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TransferReturn{reason=$reason, returnedAt=$returnedAt, transactionId=$transactionId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var reason: JsonField<Reason> = JsonMissing.of()
            private var returnedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transferReturn: TransferReturn) = apply {
                this.reason = transferReturn.reason
                this.returnedAt = transferReturn.returnedAt
                this.transactionId = transferReturn.transactionId
                additionalProperties(transferReturn.additionalProperties)
            }

            /** The reason for the transfer return. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** The reason for the transfer return. */
            @JsonProperty("reason")
            @ExcludeMissing
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /** The time at which the transfer was returned. */
            fun returnedAt(returnedAt: OffsetDateTime) = returnedAt(JsonField.of(returnedAt))

            /** The time at which the transfer was returned. */
            @JsonProperty("returned_at")
            @ExcludeMissing
            fun returnedAt(returnedAt: JsonField<OffsetDateTime>) = apply {
                this.returnedAt = returnedAt
            }

            /** The id of the transaction for the returned transfer. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The id of the transaction for the returned transfer. */
            @JsonProperty("transaction_id")
            @ExcludeMissing
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
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

            fun build(): TransferReturn =
                TransferReturn(
                    reason,
                    returnedAt,
                    transactionId,
                    additionalProperties.toUnmodifiable(),
                )
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
                        JsonField.of(
                            "customer_advised_unauthorized_improper_ineligible_or_incomplete"
                        )
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

            @JvmField val INBOUND_ACH_TRANSFER = Type(JsonField.of("inbound_ach_transfer"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INBOUND_ACH_TRANSFER,
        }

        enum class Value {
            INBOUND_ACH_TRANSFER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INBOUND_ACH_TRANSFER -> Value.INBOUND_ACH_TRANSFER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INBOUND_ACH_TRANSFER -> Known.INBOUND_ACH_TRANSFER
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
