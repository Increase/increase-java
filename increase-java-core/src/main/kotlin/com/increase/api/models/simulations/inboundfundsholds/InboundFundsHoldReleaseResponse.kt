// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundfundsholds

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
import kotlin.jvm.optionals.getOrNull

/**
 * We hold funds for certain transaction types to account for return windows where
 * funds might still be clawed back by the sending institution.
 */
@NoAutoDetect
class InboundFundsHoldReleaseResponse @JsonCreator private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("automatically_releases_at") @ExcludeMissing private val automaticallyReleasesAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("created_at") @ExcludeMissing private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency") @ExcludeMissing private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("held_transaction_id") @ExcludeMissing private val heldTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("pending_transaction_id") @ExcludeMissing private val pendingTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("released_at") @ExcludeMissing private val releasedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("status") @ExcludeMissing private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

) {

    /** The Inbound Funds Hold identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The held amount in the minor unit of the account's currency. For dollars, for
     * example, this is cents.
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * When the hold will be released automatically. Certain conditions may cause it to
     * be released before this time.
     */
    fun automaticallyReleasesAt(): OffsetDateTime = automaticallyReleasesAt.getRequired("automatically_releases_at")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's
     * currency.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /** The ID of the Transaction for which funds were held. */
    fun heldTransactionId(): Optional<String> = Optional.ofNullable(heldTransactionId.getNullable("held_transaction_id"))

    /** The ID of the Pending Transaction representing the held funds. */
    fun pendingTransactionId(): Optional<String> = Optional.ofNullable(pendingTransactionId.getNullable("pending_transaction_id"))

    /** When the hold was released (if it has been released). */
    fun releasedAt(): Optional<OffsetDateTime> = Optional.ofNullable(releasedAt.getNullable("released_at"))

    /** The status of the hold. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_funds_hold`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Inbound Funds Hold identifier. */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id(): JsonField<String> = id

    /**
     * The held amount in the minor unit of the account's currency. For dollars, for
     * example, this is cents.
     */
    @JsonProperty("amount")
    @ExcludeMissing
    fun _amount(): JsonField<Long> = amount

    /**
     * When the hold will be released automatically. Certain conditions may cause it to
     * be released before this time.
     */
    @JsonProperty("automatically_releases_at")
    @ExcludeMissing
    fun _automaticallyReleasesAt(): JsonField<OffsetDateTime> = automaticallyReleasesAt

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold
     * was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's
     * currency.
     */
    @JsonProperty("currency")
    @ExcludeMissing
    fun _currency(): JsonField<Currency> = currency

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
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<Status> = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_funds_hold`.
     */
    @JsonProperty("type")
    @ExcludeMissing
    fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): InboundFundsHoldReleaseResponse =
        apply {
            if (validated) {
              return@apply
            }

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

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundFundsHoldReleaseResponse].
         *
         * The following fields are required:
         *
         * ```java
         * .id()
         * .amount()
         * .automaticallyReleasesAt()
         * .createdAt()
         * .currency()
         * .heldTransactionId()
         * .pendingTransactionId()
         * .releasedAt()
         * .status()
         * .type()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [InboundFundsHoldReleaseResponse]. */
    class Builder internal constructor() {

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
        internal fun from(inboundFundsHoldReleaseResponse: InboundFundsHoldReleaseResponse) =
            apply {
                id = inboundFundsHoldReleaseResponse.id
                amount = inboundFundsHoldReleaseResponse.amount
                automaticallyReleasesAt = inboundFundsHoldReleaseResponse.automaticallyReleasesAt
                createdAt = inboundFundsHoldReleaseResponse.createdAt
                currency = inboundFundsHoldReleaseResponse.currency
                heldTransactionId = inboundFundsHoldReleaseResponse.heldTransactionId
                pendingTransactionId = inboundFundsHoldReleaseResponse.pendingTransactionId
                releasedAt = inboundFundsHoldReleaseResponse.releasedAt
                status = inboundFundsHoldReleaseResponse.status
                type = inboundFundsHoldReleaseResponse.type
                additionalProperties = inboundFundsHoldReleaseResponse.additionalProperties.toMutableMap()
            }

        /** The Inbound Funds Hold identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Inbound Funds Hold identifier. */
        fun id(id: JsonField<String>) =
            apply {
                this.id = id
            }

        /**
         * The held amount in the minor unit of the account's currency. For dollars, for
         * example, this is cents.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * The held amount in the minor unit of the account's currency. For dollars, for
         * example, this is cents.
         */
        fun amount(amount: JsonField<Long>) =
            apply {
                this.amount = amount
            }

        /**
         * When the hold will be released automatically. Certain conditions may cause it to
         * be released before this time.
         */
        fun automaticallyReleasesAt(automaticallyReleasesAt: OffsetDateTime) = automaticallyReleasesAt(JsonField.of(automaticallyReleasesAt))

        /**
         * When the hold will be released automatically. Certain conditions may cause it to
         * be released before this time.
         */
        fun automaticallyReleasesAt(automaticallyReleasesAt: JsonField<OffsetDateTime>) =
            apply {
                this.automaticallyReleasesAt = automaticallyReleasesAt
            }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold
         * was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold
         * was created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) =
            apply {
                this.createdAt = createdAt
            }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's
         * currency.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's
         * currency.
         */
        fun currency(currency: JsonField<Currency>) =
            apply {
                this.currency = currency
            }

        /** The ID of the Transaction for which funds were held. */
        fun heldTransactionId(heldTransactionId: String?) = heldTransactionId(JsonField.ofNullable(heldTransactionId))

        /** The ID of the Transaction for which funds were held. */
        fun heldTransactionId(heldTransactionId: Optional<String>) = heldTransactionId(heldTransactionId.getOrNull())

        /** The ID of the Transaction for which funds were held. */
        fun heldTransactionId(heldTransactionId: JsonField<String>) =
            apply {
                this.heldTransactionId = heldTransactionId
            }

        /** The ID of the Pending Transaction representing the held funds. */
        fun pendingTransactionId(pendingTransactionId: String?) = pendingTransactionId(JsonField.ofNullable(pendingTransactionId))

        /** The ID of the Pending Transaction representing the held funds. */
        fun pendingTransactionId(pendingTransactionId: Optional<String>) = pendingTransactionId(pendingTransactionId.getOrNull())

        /** The ID of the Pending Transaction representing the held funds. */
        fun pendingTransactionId(pendingTransactionId: JsonField<String>) =
            apply {
                this.pendingTransactionId = pendingTransactionId
            }

        /** When the hold was released (if it has been released). */
        fun releasedAt(releasedAt: OffsetDateTime?) = releasedAt(JsonField.ofNullable(releasedAt))

        /** When the hold was released (if it has been released). */
        fun releasedAt(releasedAt: Optional<OffsetDateTime>) = releasedAt(releasedAt.getOrNull())

        /** When the hold was released (if it has been released). */
        fun releasedAt(releasedAt: JsonField<OffsetDateTime>) =
            apply {
                this.releasedAt = releasedAt
            }

        /** The status of the hold. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the hold. */
        fun status(status: JsonField<Status>) =
            apply {
                this.status = status
            }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_funds_hold`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_funds_hold`.
         */
        fun type(type: JsonField<Type>) =
            apply {
                this.type = type
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply {
                additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.putAll(additionalProperties)
            }

        fun removeAdditionalProperty(key: String) =
            apply {
                additionalProperties.remove(key)
            }

        fun removeAllAdditionalProperties(keys: Set<String>) =
            apply {
                keys.forEach(::removeAdditionalProperty)
            }

        fun build(): InboundFundsHoldReleaseResponse =
            InboundFundsHoldReleaseResponse(
              checkRequired(
                "id", id
              ),
              checkRequired(
                "amount", amount
              ),
              checkRequired(
                "automaticallyReleasesAt", automaticallyReleasesAt
              ),
              checkRequired(
                "createdAt", createdAt
              ),
              checkRequired(
                "currency", currency
              ),
              checkRequired(
                "heldTransactionId", heldTransactionId
              ),
              checkRequired(
                "pendingTransactionId", pendingTransactionId
              ),
              checkRequired(
                "releasedAt", releasedAt
              ),
              checkRequired(
                "status", status
              ),
              checkRequired(
                "type", type
              ),
              additionalProperties.toImmutable(),
            )
    }

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's
     * currency.
     */
    class Currency @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that
         * doesn't match any known member, and you want to know that value. For example, if
         * the SDK is on an older version than the API, then the API may respond with new
         * members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        companion object {

            /** Canadian Dollar (CAD) */
            @JvmField val CAD = of("CAD")

            /** Swiss Franc (CHF) */
            @JvmField val CHF = of("CHF")

            /** Euro (EUR) */
            @JvmField val EUR = of("EUR")

            /** British Pound (GBP) */
            @JvmField val GBP = of("GBP")

            /** Japanese Yen (JPY) */
            @JvmField val JPY = of("JPY")

            /** US Dollar (USD) */
            @JvmField val USD = of("USD")

            @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
        }

        /** An enum containing [Currency]'s known values. */
        enum class Known {
            /** Canadian Dollar (CAD) */
            CAD,
            /** Swiss Franc (CHF) */
            CHF,
            /** Euro (EUR) */
            EUR,
            /** British Pound (GBP) */
            GBP,
            /** Japanese Yen (JPY) */
            JPY,
            /** US Dollar (USD) */
            USD,
        }

        /**
         * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Currency] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For
         *   example, if the SDK is on an older version than the API, then the API may
         *   respond with new members that the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Canadian Dollar (CAD) */
            CAD,
            /** Swiss Franc (CHF) */
            CHF,
            /** Euro (EUR) */
            EUR,
            /** British Pound (GBP) */
            GBP,
            /** Japanese Yen (JPY) */
            JPY,
            /** US Dollar (USD) */
            USD,
            /**
             * An enum member indicating that [Currency] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or
         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if
         * you want to throw for the unknown case.
         */
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

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and
         * don't want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a
         * known member.
         */
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

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for
         * debugging and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not
         * have the expected primitive type.
         */
        fun asString(): String = _value().asString().orElseThrow { IncreaseInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The status of the hold. */
    class Status @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that
         * doesn't match any known member, and you want to know that value. For example, if
         * the SDK is on an older version than the API, then the API may respond with new
         * members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        companion object {

            /** Funds are still being held. */
            @JvmField val HELD = of("held")

            /** Funds have been released. */
            @JvmField val COMPLETE = of("complete")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** Funds are still being held. */
            HELD,
            /** Funds have been released. */
            COMPLETE,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For
         *   example, if the SDK is on an older version than the API, then the API may
         *   respond with new members that the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Funds are still being held. */
            HELD,
            /** Funds have been released. */
            COMPLETE,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or
         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if
         * you want to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                HELD -> Value.HELD
                COMPLETE -> Value.COMPLETE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and
         * don't want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a
         * known member.
         */
        fun known(): Known =
            when (this) {
                HELD -> Known.HELD
                COMPLETE -> Known.COMPLETE
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for
         * debugging and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not
         * have the expected primitive type.
         */
        fun asString(): String = _value().asString().orElseThrow { IncreaseInvalidDataException("Value is not a String") }

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
     * `inbound_funds_hold`.
     */
    class Type @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that
         * doesn't match any known member, and you want to know that value. For example, if
         * the SDK is on an older version than the API, then the API may respond with new
         * members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        companion object {

            @JvmField val INBOUND_FUNDS_HOLD = of("inbound_funds_hold")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INBOUND_FUNDS_HOLD,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For
         *   example, if the SDK is on an older version than the API, then the API may
         *   respond with new members that the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INBOUND_FUNDS_HOLD,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or
         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if
         * you want to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                INBOUND_FUNDS_HOLD -> Value.INBOUND_FUNDS_HOLD
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and
         * don't want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a
         * known member.
         */
        fun known(): Known =
            when (this) {
                INBOUND_FUNDS_HOLD -> Known.INBOUND_FUNDS_HOLD
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for
         * debugging and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not
         * have the expected primitive type.
         */
        fun asString(): String = _value().asString().orElseThrow { IncreaseInvalidDataException("Value is not a String") }

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

      return /* spotless:off */ other is InboundFundsHoldReleaseResponse && id == other.id && amount == other.amount && automaticallyReleasesAt == other.automaticallyReleasesAt && createdAt == other.createdAt && currency == other.currency && heldTransactionId == other.heldTransactionId && pendingTransactionId == other.pendingTransactionId && releasedAt == other.releasedAt && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amount, automaticallyReleasesAt, createdAt, currency, heldTransactionId, pendingTransactionId, releasedAt, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "InboundFundsHoldReleaseResponse{id=$id, amount=$amount, automaticallyReleasesAt=$automaticallyReleasesAt, createdAt=$createdAt, currency=$currency, heldTransactionId=$heldTransactionId, pendingTransactionId=$pendingTransactionId, releasedAt=$releasedAt, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
