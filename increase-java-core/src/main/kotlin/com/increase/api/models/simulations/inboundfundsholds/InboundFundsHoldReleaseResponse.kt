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
import com.increase.api.core.checkRequired
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * We hold funds for certain transaction types to account for return windows where funds might still
 * be clawed back by the sending institution.
 */
class InboundFundsHoldReleaseResponse
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<Long>,
    private val automaticallyReleasesAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val heldTransactionId: JsonField<String>,
    private val pendingTransactionId: JsonField<String>,
    private val releasedAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("automatically_releases_at")
        @ExcludeMissing
        automaticallyReleasesAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("held_transaction_id")
        @ExcludeMissing
        heldTransactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pending_transaction_id")
        @ExcludeMissing
        pendingTransactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("released_at")
        @ExcludeMissing
        releasedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        amount,
        automaticallyReleasesAt,
        createdAt,
        currency,
        heldTransactionId,
        pendingTransactionId,
        releasedAt,
        status,
        type,
        mutableMapOf(),
    )

    /**
     * The Inbound Funds Hold identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The held amount in the minor unit of the account's currency. For dollars, for example, this
     * is cents.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * When the hold will be released automatically. Certain conditions may cause it to be released
     * before this time.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun automaticallyReleasesAt(): OffsetDateTime =
        automaticallyReleasesAt.getRequired("automatically_releases_at")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * The ID of the Transaction for which funds were held.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun heldTransactionId(): Optional<String> = heldTransactionId.getOptional("held_transaction_id")

    /**
     * The ID of the Pending Transaction representing the held funds.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pendingTransactionId(): Optional<String> =
        pendingTransactionId.getOptional("pending_transaction_id")

    /**
     * When the hold was released (if it has been released).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun releasedAt(): Optional<OffsetDateTime> = releasedAt.getOptional("released_at")

    /**
     * The status of the hold.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_funds_hold`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [automaticallyReleasesAt].
     *
     * Unlike [automaticallyReleasesAt], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("automatically_releases_at")
    @ExcludeMissing
    fun _automaticallyReleasesAt(): JsonField<OffsetDateTime> = automaticallyReleasesAt

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [heldTransactionId].
     *
     * Unlike [heldTransactionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("held_transaction_id")
    @ExcludeMissing
    fun _heldTransactionId(): JsonField<String> = heldTransactionId

    /**
     * Returns the raw JSON value of [pendingTransactionId].
     *
     * Unlike [pendingTransactionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pending_transaction_id")
    @ExcludeMissing
    fun _pendingTransactionId(): JsonField<String> = pendingTransactionId

    /**
     * Returns the raw JSON value of [releasedAt].
     *
     * Unlike [releasedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("released_at")
    @ExcludeMissing
    fun _releasedAt(): JsonField<OffsetDateTime> = releasedAt

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundFundsHoldReleaseResponse].
         *
         * The following fields are required:
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
        @JvmStatic fun builder() = Builder()
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
                additionalProperties =
                    inboundFundsHoldReleaseResponse.additionalProperties.toMutableMap()
            }

        /** The Inbound Funds Hold identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The held amount in the minor unit of the account's currency. For dollars, for example,
         * this is cents.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * When the hold will be released automatically. Certain conditions may cause it to be
         * released before this time.
         */
        fun automaticallyReleasesAt(automaticallyReleasesAt: OffsetDateTime) =
            automaticallyReleasesAt(JsonField.of(automaticallyReleasesAt))

        /**
         * Sets [Builder.automaticallyReleasesAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.automaticallyReleasesAt] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
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
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The ID of the Transaction for which funds were held. */
        fun heldTransactionId(heldTransactionId: String?) =
            heldTransactionId(JsonField.ofNullable(heldTransactionId))

        /** Alias for calling [Builder.heldTransactionId] with `heldTransactionId.orElse(null)`. */
        fun heldTransactionId(heldTransactionId: Optional<String>) =
            heldTransactionId(heldTransactionId.getOrNull())

        /**
         * Sets [Builder.heldTransactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.heldTransactionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun heldTransactionId(heldTransactionId: JsonField<String>) = apply {
            this.heldTransactionId = heldTransactionId
        }

        /** The ID of the Pending Transaction representing the held funds. */
        fun pendingTransactionId(pendingTransactionId: String?) =
            pendingTransactionId(JsonField.ofNullable(pendingTransactionId))

        /**
         * Alias for calling [Builder.pendingTransactionId] with
         * `pendingTransactionId.orElse(null)`.
         */
        fun pendingTransactionId(pendingTransactionId: Optional<String>) =
            pendingTransactionId(pendingTransactionId.getOrNull())

        /**
         * Sets [Builder.pendingTransactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pendingTransactionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
            this.pendingTransactionId = pendingTransactionId
        }

        /** When the hold was released (if it has been released). */
        fun releasedAt(releasedAt: OffsetDateTime?) = releasedAt(JsonField.ofNullable(releasedAt))

        /** Alias for calling [Builder.releasedAt] with `releasedAt.orElse(null)`. */
        fun releasedAt(releasedAt: Optional<OffsetDateTime>) = releasedAt(releasedAt.getOrNull())

        /**
         * Sets [Builder.releasedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.releasedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun releasedAt(releasedAt: JsonField<OffsetDateTime>) = apply {
            this.releasedAt = releasedAt
        }

        /** The status of the hold. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_funds_hold`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAlladditional_properties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAlladditional_properties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [InboundFundsHoldReleaseResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
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
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InboundFundsHoldReleaseResponse =
            InboundFundsHoldReleaseResponse(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("automaticallyReleasesAt", automaticallyReleasesAt),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("heldTransactionId", heldTransactionId),
                checkRequired("pendingTransactionId", pendingTransactionId),
                checkRequired("releasedAt", releasedAt),
                checkRequired("status", status),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InboundFundsHoldReleaseResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        automaticallyReleasesAt()
        createdAt()
        currency().validate()
        heldTransactionId()
        pendingTransactionId()
        releasedAt()
        status().validate()
        type().validate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: IncreaseInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (automaticallyReleasesAt.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (heldTransactionId.asKnown().isPresent) 1 else 0) +
            (if (pendingTransactionId.asKnown().isPresent) 1 else 0) +
            (if (releasedAt.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency. */
    class Currency @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
            /** An enum member indicating that [Currency] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                IncreaseInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Currency = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Currency && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The status of the hold. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                IncreaseInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_funds_hold`.
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val INBOUND_FUNDS_HOLD = of("inbound_funds_hold")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INBOUND_FUNDS_HOLD
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INBOUND_FUNDS_HOLD,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                INBOUND_FUNDS_HOLD -> Value.INBOUND_FUNDS_HOLD
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                INBOUND_FUNDS_HOLD -> Known.INBOUND_FUNDS_HOLD
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                IncreaseInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundFundsHoldReleaseResponse &&
            id == other.id &&
            amount == other.amount &&
            automaticallyReleasesAt == other.automaticallyReleasesAt &&
            createdAt == other.createdAt &&
            currency == other.currency &&
            heldTransactionId == other.heldTransactionId &&
            pendingTransactionId == other.pendingTransactionId &&
            releasedAt == other.releasedAt &&
            status == other.status &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            amount,
            automaticallyReleasesAt,
            createdAt,
            currency,
            heldTransactionId,
            pendingTransactionId,
            releasedAt,
            status,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundFundsHoldReleaseResponse{id=$id, amount=$amount, automaticallyReleasesAt=$automaticallyReleasesAt, createdAt=$createdAt, currency=$currency, heldTransactionId=$heldTransactionId, pendingTransactionId=$pendingTransactionId, releasedAt=$releasedAt, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
