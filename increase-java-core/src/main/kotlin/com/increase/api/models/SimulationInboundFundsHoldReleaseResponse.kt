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
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * We hold funds for certain transaction types to account for return windows where funds might still
 * be clawed back by the sending institution.
 */
@NoAutoDetect
class SimulationInboundFundsHoldReleaseResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("automatically_releases_at")
    @ExcludeMissing
    private val automaticallyReleasesAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("held_transaction_id")
    @ExcludeMissing
    private val heldTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("pending_transaction_id")
    @ExcludeMissing
    private val pendingTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("released_at")
    @ExcludeMissing
    private val releasedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The Inbound Funds Hold identifier. */
    fun id(): String = id.getRequired("id")

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

    /** The Inbound Funds Hold identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The held amount in the minor unit of the account's currency. For dollars, for example, this
     * is cents.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * When the hold will be released automatically. Certain conditions may cause it to be released
     * before this time.
     */
    @JsonProperty("automatically_releases_at")
    @ExcludeMissing
    fun _automaticallyReleasesAt(): JsonField<OffsetDateTime> = automaticallyReleasesAt

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency. */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /** The ID of the Transaction for which funds were held. */
    @JsonProperty("held_transaction_id")
    @ExcludeMissing
    fun _heldTransactionId(): JsonField<String> = heldTransactionId

    /** The ID of the Pending Transaction representing the held funds. */
    @JsonProperty("pending_transaction_id")
    @ExcludeMissing
    fun _pendingTransactionId(): JsonField<String> = pendingTransactionId

    /** When the hold was released (if it has been released). */
    @JsonProperty("released_at")
    @ExcludeMissing
    fun _releasedAt(): JsonField<OffsetDateTime> = releasedAt

    /** The status of the hold. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_funds_hold`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SimulationInboundFundsHoldReleaseResponse = apply {
        if (!validated) {
            id()
            amount()
            automaticallyReleasesAt()
            createdAt()
            currency()
            heldTransactionId()
            pendingTransactionId()
            releasedAt()
            status()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var automaticallyReleasesAt: JsonField<OffsetDateTime>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var heldTransactionId: JsonField<String>? = null
        private var pendingTransactionId: JsonField<String>? = null
        private var releasedAt: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationInboundFundsHoldReleaseResponse: SimulationInboundFundsHoldReleaseResponse
        ) = apply {
            id = simulationInboundFundsHoldReleaseResponse.id
            amount = simulationInboundFundsHoldReleaseResponse.amount
            automaticallyReleasesAt =
                simulationInboundFundsHoldReleaseResponse.automaticallyReleasesAt
            createdAt = simulationInboundFundsHoldReleaseResponse.createdAt
            currency = simulationInboundFundsHoldReleaseResponse.currency
            heldTransactionId = simulationInboundFundsHoldReleaseResponse.heldTransactionId
            pendingTransactionId = simulationInboundFundsHoldReleaseResponse.pendingTransactionId
            releasedAt = simulationInboundFundsHoldReleaseResponse.releasedAt
            status = simulationInboundFundsHoldReleaseResponse.status
            type = simulationInboundFundsHoldReleaseResponse.type
            additionalProperties =
                simulationInboundFundsHoldReleaseResponse.additionalProperties.toMutableMap()
        }

        /** The Inbound Funds Hold identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Inbound Funds Hold identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The held amount in the minor unit of the account's currency. For dollars, for example,
         * this is cents.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * The held amount in the minor unit of the account's currency. For dollars, for example,
         * this is cents.
         */
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
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency. */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The ID of the Transaction for which funds were held. */
        fun heldTransactionId(heldTransactionId: String?) =
            heldTransactionId(JsonField.ofNullable(heldTransactionId))

        /** The ID of the Transaction for which funds were held. */
        fun heldTransactionId(heldTransactionId: Optional<String>) =
            heldTransactionId(heldTransactionId.orElse(null))

        /** The ID of the Transaction for which funds were held. */
        fun heldTransactionId(heldTransactionId: JsonField<String>) = apply {
            this.heldTransactionId = heldTransactionId
        }

        /** The ID of the Pending Transaction representing the held funds. */
        fun pendingTransactionId(pendingTransactionId: String?) =
            pendingTransactionId(JsonField.ofNullable(pendingTransactionId))

        /** The ID of the Pending Transaction representing the held funds. */
        fun pendingTransactionId(pendingTransactionId: Optional<String>) =
            pendingTransactionId(pendingTransactionId.orElse(null))

        /** The ID of the Pending Transaction representing the held funds. */
        fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
            this.pendingTransactionId = pendingTransactionId
        }

        /** When the hold was released (if it has been released). */
        fun releasedAt(releasedAt: OffsetDateTime?) = releasedAt(JsonField.ofNullable(releasedAt))

        /** When the hold was released (if it has been released). */
        fun releasedAt(releasedAt: Optional<OffsetDateTime>) = releasedAt(releasedAt.orElse(null))

        /** When the hold was released (if it has been released). */
        fun releasedAt(releasedAt: JsonField<OffsetDateTime>) = apply {
            this.releasedAt = releasedAt
        }

        /** The status of the hold. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the hold. */
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
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): SimulationInboundFundsHoldReleaseResponse =
            SimulationInboundFundsHoldReleaseResponse(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(automaticallyReleasesAt) {
                    "`automaticallyReleasesAt` is required but was not set"
                },
                checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                checkNotNull(currency) { "`currency` is required but was not set" },
                checkNotNull(heldTransactionId) {
                    "`heldTransactionId` is required but was not set"
                },
                checkNotNull(pendingTransactionId) {
                    "`pendingTransactionId` is required but was not set"
                },
                checkNotNull(releasedAt) { "`releasedAt` is required but was not set" },
                checkNotNull(status) { "`status` is required but was not set" },
                checkNotNull(type) { "`type` is required but was not set" },
                additionalProperties.toImmutable(),
            )
    }

    class Currency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CAD = of("CAD")

            @JvmField val CHF = of("CHF")

            @JvmField val EUR = of("EUR")

            @JvmField val GBP = of("GBP")

            @JvmField val JPY = of("JPY")

            @JvmField val USD = of("USD")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val HELD = of("held")

            @JvmField val COMPLETE = of("complete")

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

            @JvmField val INBOUND_FUNDS_HOLD = of("inbound_funds_hold")

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

        return /* spotless:off */ other is SimulationInboundFundsHoldReleaseResponse && id == other.id && amount == other.amount && automaticallyReleasesAt == other.automaticallyReleasesAt && createdAt == other.createdAt && currency == other.currency && heldTransactionId == other.heldTransactionId && pendingTransactionId == other.pendingTransactionId && releasedAt == other.releasedAt && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amount, automaticallyReleasesAt, createdAt, currency, heldTransactionId, pendingTransactionId, releasedAt, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SimulationInboundFundsHoldReleaseResponse{id=$id, amount=$amount, automaticallyReleasesAt=$automaticallyReleasesAt, createdAt=$createdAt, currency=$currency, heldTransactionId=$heldTransactionId, pendingTransactionId=$pendingTransactionId, releasedAt=$releasedAt, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
