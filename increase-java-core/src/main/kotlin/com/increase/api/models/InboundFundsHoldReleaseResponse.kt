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
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * We hold funds for certain transaction types to account for return windows where funds might still
 * be clawed back by the sending institution.
 */
@JsonDeserialize(builder = InboundFundsHoldReleaseResponse.Builder::class)
@NoAutoDetect
class InboundFundsHoldReleaseResponse
private constructor(
    private val amount: JsonField<Long>,
    private val automaticallyReleasesAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val heldTransactionId: JsonField<String>,
    private val id: JsonField<String>,
    private val pendingTransactionId: JsonField<String>,
    private val releasedAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * The held amount in the minor unit of the account's currency. For dollars, for example, this
     * is cents.
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * When the hold will be released automatically. Certain conditions may cause it to be released
     * before this time.
     */
    fun automaticallyReleasesAt(): OffsetDateTime =
        automaticallyReleasesAt.getRequired("automatically_releases_at")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency. */
    fun currency(): Currency = currency.getRequired("currency")

    /** The ID of the Transaction for which funds were held. */
    fun heldTransactionId(): Optional<String> =
        Optional.ofNullable(heldTransactionId.getNullable("held_transaction_id"))

    /** The Inbound Funds Hold identifier. */
    fun id(): String = id.getRequired("id")

    /** The ID of the Pending Transaction representing the held funds. */
    fun pendingTransactionId(): Optional<String> =
        Optional.ofNullable(pendingTransactionId.getNullable("pending_transaction_id"))

    /** When the hold was released (if it has been released). */
    fun releasedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(releasedAt.getNullable("released_at"))

    /** The status of the hold. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_funds_hold`.
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The held amount in the minor unit of the account's currency. For dollars, for example, this
     * is cents.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * When the hold will be released automatically. Certain conditions may cause it to be released
     * before this time.
     */
    @JsonProperty("automatically_releases_at")
    @ExcludeMissing
    fun _automaticallyReleasesAt() = automaticallyReleasesAt

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** The ID of the Transaction for which funds were held. */
    @JsonProperty("held_transaction_id")
    @ExcludeMissing
    fun _heldTransactionId() = heldTransactionId

    /** The Inbound Funds Hold identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The ID of the Pending Transaction representing the held funds. */
    @JsonProperty("pending_transaction_id")
    @ExcludeMissing
    fun _pendingTransactionId() = pendingTransactionId

    /** When the hold was released (if it has been released). */
    @JsonProperty("released_at") @ExcludeMissing fun _releasedAt() = releasedAt

    /** The status of the hold. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_funds_hold`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): InboundFundsHoldReleaseResponse = apply {
        if (!validated) {
            amount()
            automaticallyReleasesAt()
            createdAt()
            currency()
            heldTransactionId()
            id()
            pendingTransactionId()
            releasedAt()
            status()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundFundsHoldReleaseResponse &&
            this.amount == other.amount &&
            this.automaticallyReleasesAt == other.automaticallyReleasesAt &&
            this.createdAt == other.createdAt &&
            this.currency == other.currency &&
            this.heldTransactionId == other.heldTransactionId &&
            this.id == other.id &&
            this.pendingTransactionId == other.pendingTransactionId &&
            this.releasedAt == other.releasedAt &&
            this.status == other.status &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    amount,
                    automaticallyReleasesAt,
                    createdAt,
                    currency,
                    heldTransactionId,
                    id,
                    pendingTransactionId,
                    releasedAt,
                    status,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "InboundFundsHoldReleaseResponse{amount=$amount, automaticallyReleasesAt=$automaticallyReleasesAt, createdAt=$createdAt, currency=$currency, heldTransactionId=$heldTransactionId, id=$id, pendingTransactionId=$pendingTransactionId, releasedAt=$releasedAt, status=$status, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var amount: JsonField<Long> = JsonMissing.of()
        private var automaticallyReleasesAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var heldTransactionId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var pendingTransactionId: JsonField<String> = JsonMissing.of()
        private var releasedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundFundsHoldReleaseResponse: InboundFundsHoldReleaseResponse) =
            apply {
                this.amount = inboundFundsHoldReleaseResponse.amount
                this.automaticallyReleasesAt =
                    inboundFundsHoldReleaseResponse.automaticallyReleasesAt
                this.createdAt = inboundFundsHoldReleaseResponse.createdAt
                this.currency = inboundFundsHoldReleaseResponse.currency
                this.heldTransactionId = inboundFundsHoldReleaseResponse.heldTransactionId
                this.id = inboundFundsHoldReleaseResponse.id
                this.pendingTransactionId = inboundFundsHoldReleaseResponse.pendingTransactionId
                this.releasedAt = inboundFundsHoldReleaseResponse.releasedAt
                this.status = inboundFundsHoldReleaseResponse.status
                this.type = inboundFundsHoldReleaseResponse.type
                additionalProperties(inboundFundsHoldReleaseResponse.additionalProperties)
            }

        /**
         * The held amount in the minor unit of the account's currency. For dollars, for example,
         * this is cents.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * The held amount in the minor unit of the account's currency. For dollars, for example,
         * this is cents.
         */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * When the hold will be released automatically. Certain conditions may cause it to be
         * released before this time.
         */
        fun automaticallyReleasesAt(automaticallyReleasesAt: OffsetDateTime) =
            automaticallyReleasesAt(JsonField.of(automaticallyReleasesAt))

        /**
         * When the hold will be released automatically. Certain conditions may cause it to be
         * released before this time.
         */
        @JsonProperty("automatically_releases_at")
        @ExcludeMissing
        fun automaticallyReleasesAt(automaticallyReleasesAt: JsonField<OffsetDateTime>) = apply {
            this.automaticallyReleasesAt = automaticallyReleasesAt
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
         * created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
         * created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The ID of the Transaction for which funds were held. */
        fun heldTransactionId(heldTransactionId: String) =
            heldTransactionId(JsonField.of(heldTransactionId))

        /** The ID of the Transaction for which funds were held. */
        @JsonProperty("held_transaction_id")
        @ExcludeMissing
        fun heldTransactionId(heldTransactionId: JsonField<String>) = apply {
            this.heldTransactionId = heldTransactionId
        }

        /** The Inbound Funds Hold identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Inbound Funds Hold identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The ID of the Pending Transaction representing the held funds. */
        fun pendingTransactionId(pendingTransactionId: String) =
            pendingTransactionId(JsonField.of(pendingTransactionId))

        /** The ID of the Pending Transaction representing the held funds. */
        @JsonProperty("pending_transaction_id")
        @ExcludeMissing
        fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
            this.pendingTransactionId = pendingTransactionId
        }

        /** When the hold was released (if it has been released). */
        fun releasedAt(releasedAt: OffsetDateTime) = releasedAt(JsonField.of(releasedAt))

        /** When the hold was released (if it has been released). */
        @JsonProperty("released_at")
        @ExcludeMissing
        fun releasedAt(releasedAt: JsonField<OffsetDateTime>) = apply {
            this.releasedAt = releasedAt
        }

        /** The status of the hold. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the hold. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_funds_hold`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_funds_hold`.
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

        fun build(): InboundFundsHoldReleaseResponse =
            InboundFundsHoldReleaseResponse(
                amount,
                automaticallyReleasesAt,
                createdAt,
                currency,
                heldTransactionId,
                id,
                pendingTransactionId,
                releasedAt,
                status,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Currency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Currency && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CAD = Currency(JsonField.of("CAD"))

            @JvmField val CHF = Currency(JsonField.of("CHF"))

            @JvmField val EUR = Currency(JsonField.of("EUR"))

            @JvmField val GBP = Currency(JsonField.of("GBP"))

            @JvmField val JPY = Currency(JsonField.of("JPY"))

            @JvmField val USD = Currency(JsonField.of("USD"))

            @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
        }

        enum class Known {
            CAD,
            CHF,
            EUR,
            GBP,
            JPY,
            USD,
        }

        enum class Value {
            CAD,
            CHF,
            EUR,
            GBP,
            JPY,
            USD,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CAD -> Value.CAD
                CHF -> Value.CHF
                EUR -> Value.EUR
                GBP -> Value.GBP
                JPY -> Value.JPY
                USD -> Value.USD
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CAD -> Known.CAD
                CHF -> Known.CHF
                EUR -> Known.EUR
                GBP -> Known.GBP
                JPY -> Known.JPY
                USD -> Known.USD
                else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            @JvmField val HELD = Status(JsonField.of("held"))

            @JvmField val COMPLETE = Status(JsonField.of("complete"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            HELD,
            COMPLETE,
        }

        enum class Value {
            HELD,
            COMPLETE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                HELD -> Value.HELD
                COMPLETE -> Value.COMPLETE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                HELD -> Known.HELD
                COMPLETE -> Known.COMPLETE
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            @JvmField val INBOUND_FUNDS_HOLD = Type(JsonField.of("inbound_funds_hold"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INBOUND_FUNDS_HOLD,
        }

        enum class Value {
            INBOUND_FUNDS_HOLD,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INBOUND_FUNDS_HOLD -> Value.INBOUND_FUNDS_HOLD
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INBOUND_FUNDS_HOLD -> Known.INBOUND_FUNDS_HOLD
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
