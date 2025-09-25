// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.cardauthorizations

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
import com.increase.api.models.declinedtransactions.DeclinedTransaction
import com.increase.api.models.pendingtransactions.PendingTransaction
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The results of a Card Authorization simulation. */
class CardAuthorizationCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val declinedTransaction: JsonField<DeclinedTransaction>,
    private val pendingTransaction: JsonField<PendingTransaction>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("declined_transaction")
        @ExcludeMissing
        declinedTransaction: JsonField<DeclinedTransaction> = JsonMissing.of(),
        @JsonProperty("pending_transaction")
        @ExcludeMissing
        pendingTransaction: JsonField<PendingTransaction> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(declinedTransaction, pendingTransaction, type, mutableMapOf())

    /**
     * If the authorization attempt fails, this will contain the resulting
     * [Declined Transaction](#declined-transactions) object. The Declined Transaction's `source`
     * will be of `category: card_decline`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun declinedTransaction(): Optional<DeclinedTransaction> =
        declinedTransaction.getOptional("declined_transaction")

    /**
     * If the authorization attempt succeeds, this will contain the resulting Pending Transaction
     * object. The Pending Transaction's `source` will be of `category: card_authorization`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pendingTransaction(): Optional<PendingTransaction> =
        pendingTransaction.getOptional("pending_transaction")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_card_authorization_simulation_result`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [declinedTransaction].
     *
     * Unlike [declinedTransaction], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("declined_transaction")
    @ExcludeMissing
    fun _declinedTransaction(): JsonField<DeclinedTransaction> = declinedTransaction

    /**
     * Returns the raw JSON value of [pendingTransaction].
     *
     * Unlike [pendingTransaction], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pending_transaction")
    @ExcludeMissing
    fun _pendingTransaction(): JsonField<PendingTransaction> = pendingTransaction

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
         * [CardAuthorizationCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .declinedTransaction()
         * .pendingTransaction()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardAuthorizationCreateResponse]. */
    class Builder internal constructor() {

        private var declinedTransaction: JsonField<DeclinedTransaction>? = null
        private var pendingTransaction: JsonField<PendingTransaction>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardAuthorizationCreateResponse: CardAuthorizationCreateResponse) =
            apply {
                declinedTransaction = cardAuthorizationCreateResponse.declinedTransaction
                pendingTransaction = cardAuthorizationCreateResponse.pendingTransaction
                type = cardAuthorizationCreateResponse.type
                additionalProperties =
                    cardAuthorizationCreateResponse.additionalProperties.toMutableMap()
            }

        /**
         * If the authorization attempt fails, this will contain the resulting
         * [Declined Transaction](#declined-transactions) object. The Declined Transaction's
         * `source` will be of `category: card_decline`.
         */
        fun declinedTransaction(declinedTransaction: DeclinedTransaction?) =
            declinedTransaction(JsonField.ofNullable(declinedTransaction))

        /**
         * Alias for calling [Builder.declinedTransaction] with `declinedTransaction.orElse(null)`.
         */
        fun declinedTransaction(declinedTransaction: Optional<DeclinedTransaction>) =
            declinedTransaction(declinedTransaction.getOrNull())

        /**
         * Sets [Builder.declinedTransaction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.declinedTransaction] with a well-typed
         * [DeclinedTransaction] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun declinedTransaction(declinedTransaction: JsonField<DeclinedTransaction>) = apply {
            this.declinedTransaction = declinedTransaction
        }

        /**
         * If the authorization attempt succeeds, this will contain the resulting Pending
         * Transaction object. The Pending Transaction's `source` will be of `category:
         * card_authorization`.
         */
        fun pendingTransaction(pendingTransaction: PendingTransaction?) =
            pendingTransaction(JsonField.ofNullable(pendingTransaction))

        /**
         * Alias for calling [Builder.pendingTransaction] with `pendingTransaction.orElse(null)`.
         */
        fun pendingTransaction(pendingTransaction: Optional<PendingTransaction>) =
            pendingTransaction(pendingTransaction.getOrNull())

        /**
         * Sets [Builder.pendingTransaction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pendingTransaction] with a well-typed
         * [PendingTransaction] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun pendingTransaction(pendingTransaction: JsonField<PendingTransaction>) = apply {
            this.pendingTransaction = pendingTransaction
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_card_authorization_simulation_result`.
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

        /**
         * Returns an immutable instance of [CardAuthorizationCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .declinedTransaction()
         * .pendingTransaction()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardAuthorizationCreateResponse =
            CardAuthorizationCreateResponse(
                checkRequired("declinedTransaction", declinedTransaction),
                checkRequired("pendingTransaction", pendingTransaction),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CardAuthorizationCreateResponse = apply {
        if (validated) {
            return@apply
        }

        declinedTransaction().ifPresent { it.validate() }
        pendingTransaction().ifPresent { it.validate() }
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
        (declinedTransaction.asKnown().getOrNull()?.validity() ?: 0) +
            (pendingTransaction.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_card_authorization_simulation_result`.
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

            @JvmField
            val INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT =
                of("inbound_card_authorization_simulation_result")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT
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
            INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT,
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
                INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT ->
                    Value.INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT
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
                INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT ->
                    Known.INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT
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

        return other is CardAuthorizationCreateResponse &&
            declinedTransaction == other.declinedTransaction &&
            pendingTransaction == other.pendingTransaction &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(declinedTransaction, pendingTransaction, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardAuthorizationCreateResponse{declinedTransaction=$declinedTransaction, pendingTransaction=$pendingTransaction, type=$type, additionalProperties=$additionalProperties}"
}
