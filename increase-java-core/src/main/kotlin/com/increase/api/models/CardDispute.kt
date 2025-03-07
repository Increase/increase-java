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
import kotlin.jvm.optionals.getOrNull

/**
 * If unauthorized activity occurs on a card, you can create a Card Dispute and we'll return the
 * funds if appropriate.
 */
@NoAutoDetect
class CardDispute
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("acceptance")
    @ExcludeMissing
    private val acceptance: JsonField<Acceptance> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("disputed_transaction_id")
    @ExcludeMissing
    private val disputedTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("explanation")
    @ExcludeMissing
    private val explanation: JsonField<String> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("loss") @ExcludeMissing private val loss: JsonField<Loss> = JsonMissing.of(),
    @JsonProperty("rejection")
    @ExcludeMissing
    private val rejection: JsonField<Rejection> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("win") @ExcludeMissing private val win: JsonField<Win> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The Card Dispute identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * If the Card Dispute's status is `accepted`, this will contain details of the successful
     * dispute.
     */
    fun acceptance(): Optional<Acceptance> =
        Optional.ofNullable(acceptance.getNullable("acceptance"))

    /** The amount of the dispute, if provided, or the transaction amount otherwise. */
    fun amount(): Optional<Long> = Optional.ofNullable(amount.getNullable("amount"))

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
     * Dispute was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The identifier of the Transaction that was disputed. */
    fun disputedTransactionId(): String =
        disputedTransactionId.getRequired("disputed_transaction_id")

    /** Why you disputed the Transaction in question. */
    fun explanation(): String = explanation.getRequired("explanation")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /** If the Card Dispute's status is `lost`, this will contain details of the lost dispute. */
    fun loss(): Optional<Loss> = Optional.ofNullable(loss.getNullable("loss"))

    /**
     * If the Card Dispute's status is `rejected`, this will contain details of the unsuccessful
     * dispute.
     */
    fun rejection(): Optional<Rejection> = Optional.ofNullable(rejection.getNullable("rejection"))

    /** The results of the Dispute investigation. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_dispute`.
     */
    fun type(): Type = type.getRequired("type")

    /** If the Card Dispute's status is `won`, this will contain details of the won dispute. */
    fun win(): Optional<Win> = Optional.ofNullable(win.getNullable("win"))

    /** The Card Dispute identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * If the Card Dispute's status is `accepted`, this will contain details of the successful
     * dispute.
     */
    @JsonProperty("acceptance")
    @ExcludeMissing
    fun _acceptance(): JsonField<Acceptance> = acceptance

    /** The amount of the dispute, if provided, or the transaction amount otherwise. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
     * Dispute was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The identifier of the Transaction that was disputed. */
    @JsonProperty("disputed_transaction_id")
    @ExcludeMissing
    fun _disputedTransactionId(): JsonField<String> = disputedTransactionId

    /** Why you disputed the Transaction in question. */
    @JsonProperty("explanation") @ExcludeMissing fun _explanation(): JsonField<String> = explanation

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /** If the Card Dispute's status is `lost`, this will contain details of the lost dispute. */
    @JsonProperty("loss") @ExcludeMissing fun _loss(): JsonField<Loss> = loss

    /**
     * If the Card Dispute's status is `rejected`, this will contain details of the unsuccessful
     * dispute.
     */
    @JsonProperty("rejection") @ExcludeMissing fun _rejection(): JsonField<Rejection> = rejection

    /** The results of the Dispute investigation. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_dispute`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /** If the Card Dispute's status is `won`, this will contain details of the won dispute. */
    @JsonProperty("win") @ExcludeMissing fun _win(): JsonField<Win> = win

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CardDispute = apply {
        if (validated) {
            return@apply
        }

        id()
        acceptance().ifPresent { it.validate() }
        amount()
        createdAt()
        disputedTransactionId()
        explanation()
        idempotencyKey()
        loss().ifPresent { it.validate() }
        rejection().ifPresent { it.validate() }
        status()
        type()
        win().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardDispute].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .acceptance()
         * .amount()
         * .createdAt()
         * .disputedTransactionId()
         * .explanation()
         * .idempotencyKey()
         * .loss()
         * .rejection()
         * .status()
         * .type()
         * .win()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardDispute]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var acceptance: JsonField<Acceptance>? = null
        private var amount: JsonField<Long>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var disputedTransactionId: JsonField<String>? = null
        private var explanation: JsonField<String>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var loss: JsonField<Loss>? = null
        private var rejection: JsonField<Rejection>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var win: JsonField<Win>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardDispute: CardDispute) = apply {
            id = cardDispute.id
            acceptance = cardDispute.acceptance
            amount = cardDispute.amount
            createdAt = cardDispute.createdAt
            disputedTransactionId = cardDispute.disputedTransactionId
            explanation = cardDispute.explanation
            idempotencyKey = cardDispute.idempotencyKey
            loss = cardDispute.loss
            rejection = cardDispute.rejection
            status = cardDispute.status
            type = cardDispute.type
            win = cardDispute.win
            additionalProperties = cardDispute.additionalProperties.toMutableMap()
        }

        /** The Card Dispute identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Card Dispute identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * If the Card Dispute's status is `accepted`, this will contain details of the successful
         * dispute.
         */
        fun acceptance(acceptance: Acceptance?) = acceptance(JsonField.ofNullable(acceptance))

        /**
         * If the Card Dispute's status is `accepted`, this will contain details of the successful
         * dispute.
         */
        fun acceptance(acceptance: Optional<Acceptance>) = acceptance(acceptance.getOrNull())

        /**
         * If the Card Dispute's status is `accepted`, this will contain details of the successful
         * dispute.
         */
        fun acceptance(acceptance: JsonField<Acceptance>) = apply { this.acceptance = acceptance }

        /** The amount of the dispute, if provided, or the transaction amount otherwise. */
        fun amount(amount: Long?) = amount(JsonField.ofNullable(amount))

        /** The amount of the dispute, if provided, or the transaction amount otherwise. */
        fun amount(amount: Long) = amount(amount as Long?)

        /** The amount of the dispute, if provided, or the transaction amount otherwise. */
        fun amount(amount: Optional<Long>) = amount(amount.getOrNull())

        /** The amount of the dispute, if provided, or the transaction amount otherwise. */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
         * Dispute was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
         * Dispute was created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The identifier of the Transaction that was disputed. */
        fun disputedTransactionId(disputedTransactionId: String) =
            disputedTransactionId(JsonField.of(disputedTransactionId))

        /** The identifier of the Transaction that was disputed. */
        fun disputedTransactionId(disputedTransactionId: JsonField<String>) = apply {
            this.disputedTransactionId = disputedTransactionId
        }

        /** Why you disputed the Transaction in question. */
        fun explanation(explanation: String) = explanation(JsonField.of(explanation))

        /** Why you disputed the Transaction in question. */
        fun explanation(explanation: JsonField<String>) = apply { this.explanation = explanation }

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
            idempotencyKey(idempotencyKey.getOrNull())

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /**
         * If the Card Dispute's status is `lost`, this will contain details of the lost dispute.
         */
        fun loss(loss: Loss?) = loss(JsonField.ofNullable(loss))

        /**
         * If the Card Dispute's status is `lost`, this will contain details of the lost dispute.
         */
        fun loss(loss: Optional<Loss>) = loss(loss.getOrNull())

        /**
         * If the Card Dispute's status is `lost`, this will contain details of the lost dispute.
         */
        fun loss(loss: JsonField<Loss>) = apply { this.loss = loss }

        /**
         * If the Card Dispute's status is `rejected`, this will contain details of the unsuccessful
         * dispute.
         */
        fun rejection(rejection: Rejection?) = rejection(JsonField.ofNullable(rejection))

        /**
         * If the Card Dispute's status is `rejected`, this will contain details of the unsuccessful
         * dispute.
         */
        fun rejection(rejection: Optional<Rejection>) = rejection(rejection.getOrNull())

        /**
         * If the Card Dispute's status is `rejected`, this will contain details of the unsuccessful
         * dispute.
         */
        fun rejection(rejection: JsonField<Rejection>) = apply { this.rejection = rejection }

        /** The results of the Dispute investigation. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The results of the Dispute investigation. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `card_dispute`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `card_dispute`.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** If the Card Dispute's status is `won`, this will contain details of the won dispute. */
        fun win(win: Win?) = win(JsonField.ofNullable(win))

        /** If the Card Dispute's status is `won`, this will contain details of the won dispute. */
        fun win(win: Optional<Win>) = win(win.getOrNull())

        /** If the Card Dispute's status is `won`, this will contain details of the won dispute. */
        fun win(win: JsonField<Win>) = apply { this.win = win }

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

        fun build(): CardDispute =
            CardDispute(
                checkRequired("id", id),
                checkRequired("acceptance", acceptance),
                checkRequired("amount", amount),
                checkRequired("createdAt", createdAt),
                checkRequired("disputedTransactionId", disputedTransactionId),
                checkRequired("explanation", explanation),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("loss", loss),
                checkRequired("rejection", rejection),
                checkRequired("status", status),
                checkRequired("type", type),
                checkRequired("win", win),
                additionalProperties.toImmutable(),
            )
    }

    /**
     * If the Card Dispute's status is `accepted`, this will contain details of the successful
     * dispute.
     */
    @NoAutoDetect
    class Acceptance
    @JsonCreator
    private constructor(
        @JsonProperty("accepted_at")
        @ExcludeMissing
        private val acceptedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("card_dispute_id")
        @ExcludeMissing
        private val cardDisputeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        private val transactionId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
         * Dispute was accepted.
         */
        fun acceptedAt(): OffsetDateTime = acceptedAt.getRequired("accepted_at")

        /** The identifier of the Card Dispute that was accepted. */
        fun cardDisputeId(): String = cardDisputeId.getRequired("card_dispute_id")

        /**
         * The identifier of the Transaction that was created to return the disputed funds to your
         * account.
         */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
         * Dispute was accepted.
         */
        @JsonProperty("accepted_at")
        @ExcludeMissing
        fun _acceptedAt(): JsonField<OffsetDateTime> = acceptedAt

        /** The identifier of the Card Dispute that was accepted. */
        @JsonProperty("card_dispute_id")
        @ExcludeMissing
        fun _cardDisputeId(): JsonField<String> = cardDisputeId

        /**
         * The identifier of the Transaction that was created to return the disputed funds to your
         * account.
         */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun _transactionId(): JsonField<String> = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Acceptance = apply {
            if (validated) {
                return@apply
            }

            acceptedAt()
            cardDisputeId()
            transactionId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Acceptance].
             *
             * The following fields are required:
             * ```java
             * .acceptedAt()
             * .cardDisputeId()
             * .transactionId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Acceptance]. */
        class Builder internal constructor() {

            private var acceptedAt: JsonField<OffsetDateTime>? = null
            private var cardDisputeId: JsonField<String>? = null
            private var transactionId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(acceptance: Acceptance) = apply {
                acceptedAt = acceptance.acceptedAt
                cardDisputeId = acceptance.cardDisputeId
                transactionId = acceptance.transactionId
                additionalProperties = acceptance.additionalProperties.toMutableMap()
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Card Dispute was accepted.
             */
            fun acceptedAt(acceptedAt: OffsetDateTime) = acceptedAt(JsonField.of(acceptedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Card Dispute was accepted.
             */
            fun acceptedAt(acceptedAt: JsonField<OffsetDateTime>) = apply {
                this.acceptedAt = acceptedAt
            }

            /** The identifier of the Card Dispute that was accepted. */
            fun cardDisputeId(cardDisputeId: String) = cardDisputeId(JsonField.of(cardDisputeId))

            /** The identifier of the Card Dispute that was accepted. */
            fun cardDisputeId(cardDisputeId: JsonField<String>) = apply {
                this.cardDisputeId = cardDisputeId
            }

            /**
             * The identifier of the Transaction that was created to return the disputed funds to
             * your account.
             */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /**
             * The identifier of the Transaction that was created to return the disputed funds to
             * your account.
             */
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
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

            fun build(): Acceptance =
                Acceptance(
                    checkRequired("acceptedAt", acceptedAt),
                    checkRequired("cardDisputeId", cardDisputeId),
                    checkRequired("transactionId", transactionId),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Acceptance && acceptedAt == other.acceptedAt && cardDisputeId == other.cardDisputeId && transactionId == other.transactionId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(acceptedAt, cardDisputeId, transactionId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Acceptance{acceptedAt=$acceptedAt, cardDisputeId=$cardDisputeId, transactionId=$transactionId, additionalProperties=$additionalProperties}"
    }

    /** If the Card Dispute's status is `lost`, this will contain details of the lost dispute. */
    @NoAutoDetect
    class Loss
    @JsonCreator
    private constructor(
        @JsonProperty("card_dispute_id")
        @ExcludeMissing
        private val cardDisputeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("explanation")
        @ExcludeMissing
        private val explanation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lost_at")
        @ExcludeMissing
        private val lostAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        private val transactionId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier of the Card Dispute that was lost. */
        fun cardDisputeId(): String = cardDisputeId.getRequired("card_dispute_id")

        /** Why the Card Dispute was lost. */
        fun explanation(): String = explanation.getRequired("explanation")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
         * Dispute was lost.
         */
        fun lostAt(): OffsetDateTime = lostAt.getRequired("lost_at")

        /**
         * The identifier of the Transaction that was created to debit the disputed funds from your
         * account.
         */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /** The identifier of the Card Dispute that was lost. */
        @JsonProperty("card_dispute_id")
        @ExcludeMissing
        fun _cardDisputeId(): JsonField<String> = cardDisputeId

        /** Why the Card Dispute was lost. */
        @JsonProperty("explanation")
        @ExcludeMissing
        fun _explanation(): JsonField<String> = explanation

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
         * Dispute was lost.
         */
        @JsonProperty("lost_at") @ExcludeMissing fun _lostAt(): JsonField<OffsetDateTime> = lostAt

        /**
         * The identifier of the Transaction that was created to debit the disputed funds from your
         * account.
         */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun _transactionId(): JsonField<String> = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Loss = apply {
            if (validated) {
                return@apply
            }

            cardDisputeId()
            explanation()
            lostAt()
            transactionId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Loss].
             *
             * The following fields are required:
             * ```java
             * .cardDisputeId()
             * .explanation()
             * .lostAt()
             * .transactionId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Loss]. */
        class Builder internal constructor() {

            private var cardDisputeId: JsonField<String>? = null
            private var explanation: JsonField<String>? = null
            private var lostAt: JsonField<OffsetDateTime>? = null
            private var transactionId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(loss: Loss) = apply {
                cardDisputeId = loss.cardDisputeId
                explanation = loss.explanation
                lostAt = loss.lostAt
                transactionId = loss.transactionId
                additionalProperties = loss.additionalProperties.toMutableMap()
            }

            /** The identifier of the Card Dispute that was lost. */
            fun cardDisputeId(cardDisputeId: String) = cardDisputeId(JsonField.of(cardDisputeId))

            /** The identifier of the Card Dispute that was lost. */
            fun cardDisputeId(cardDisputeId: JsonField<String>) = apply {
                this.cardDisputeId = cardDisputeId
            }

            /** Why the Card Dispute was lost. */
            fun explanation(explanation: String) = explanation(JsonField.of(explanation))

            /** Why the Card Dispute was lost. */
            fun explanation(explanation: JsonField<String>) = apply {
                this.explanation = explanation
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Card Dispute was lost.
             */
            fun lostAt(lostAt: OffsetDateTime) = lostAt(JsonField.of(lostAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Card Dispute was lost.
             */
            fun lostAt(lostAt: JsonField<OffsetDateTime>) = apply { this.lostAt = lostAt }

            /**
             * The identifier of the Transaction that was created to debit the disputed funds from
             * your account.
             */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /**
             * The identifier of the Transaction that was created to debit the disputed funds from
             * your account.
             */
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
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

            fun build(): Loss =
                Loss(
                    checkRequired("cardDisputeId", cardDisputeId),
                    checkRequired("explanation", explanation),
                    checkRequired("lostAt", lostAt),
                    checkRequired("transactionId", transactionId),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Loss && cardDisputeId == other.cardDisputeId && explanation == other.explanation && lostAt == other.lostAt && transactionId == other.transactionId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cardDisputeId, explanation, lostAt, transactionId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Loss{cardDisputeId=$cardDisputeId, explanation=$explanation, lostAt=$lostAt, transactionId=$transactionId, additionalProperties=$additionalProperties}"
    }

    /**
     * If the Card Dispute's status is `rejected`, this will contain details of the unsuccessful
     * dispute.
     */
    @NoAutoDetect
    class Rejection
    @JsonCreator
    private constructor(
        @JsonProperty("card_dispute_id")
        @ExcludeMissing
        private val cardDisputeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("explanation")
        @ExcludeMissing
        private val explanation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rejected_at")
        @ExcludeMissing
        private val rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier of the Card Dispute that was rejected. */
        fun cardDisputeId(): String = cardDisputeId.getRequired("card_dispute_id")

        /** Why the Card Dispute was rejected. */
        fun explanation(): String = explanation.getRequired("explanation")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
         * Dispute was rejected.
         */
        fun rejectedAt(): OffsetDateTime = rejectedAt.getRequired("rejected_at")

        /** The identifier of the Card Dispute that was rejected. */
        @JsonProperty("card_dispute_id")
        @ExcludeMissing
        fun _cardDisputeId(): JsonField<String> = cardDisputeId

        /** Why the Card Dispute was rejected. */
        @JsonProperty("explanation")
        @ExcludeMissing
        fun _explanation(): JsonField<String> = explanation

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
         * Dispute was rejected.
         */
        @JsonProperty("rejected_at")
        @ExcludeMissing
        fun _rejectedAt(): JsonField<OffsetDateTime> = rejectedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Rejection = apply {
            if (validated) {
                return@apply
            }

            cardDisputeId()
            explanation()
            rejectedAt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Rejection].
             *
             * The following fields are required:
             * ```java
             * .cardDisputeId()
             * .explanation()
             * .rejectedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Rejection]. */
        class Builder internal constructor() {

            private var cardDisputeId: JsonField<String>? = null
            private var explanation: JsonField<String>? = null
            private var rejectedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rejection: Rejection) = apply {
                cardDisputeId = rejection.cardDisputeId
                explanation = rejection.explanation
                rejectedAt = rejection.rejectedAt
                additionalProperties = rejection.additionalProperties.toMutableMap()
            }

            /** The identifier of the Card Dispute that was rejected. */
            fun cardDisputeId(cardDisputeId: String) = cardDisputeId(JsonField.of(cardDisputeId))

            /** The identifier of the Card Dispute that was rejected. */
            fun cardDisputeId(cardDisputeId: JsonField<String>) = apply {
                this.cardDisputeId = cardDisputeId
            }

            /** Why the Card Dispute was rejected. */
            fun explanation(explanation: String) = explanation(JsonField.of(explanation))

            /** Why the Card Dispute was rejected. */
            fun explanation(explanation: JsonField<String>) = apply {
                this.explanation = explanation
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Card Dispute was rejected.
             */
            fun rejectedAt(rejectedAt: OffsetDateTime) = rejectedAt(JsonField.of(rejectedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Card Dispute was rejected.
             */
            fun rejectedAt(rejectedAt: JsonField<OffsetDateTime>) = apply {
                this.rejectedAt = rejectedAt
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

            fun build(): Rejection =
                Rejection(
                    checkRequired("cardDisputeId", cardDisputeId),
                    checkRequired("explanation", explanation),
                    checkRequired("rejectedAt", rejectedAt),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Rejection && cardDisputeId == other.cardDisputeId && explanation == other.explanation && rejectedAt == other.rejectedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cardDisputeId, explanation, rejectedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Rejection{cardDisputeId=$cardDisputeId, explanation=$explanation, rejectedAt=$rejectedAt, additionalProperties=$additionalProperties}"
    }

    /** The results of the Dispute investigation. */
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

            /** The Card Dispute is pending review. */
            @JvmField val PENDING_REVIEWING = of("pending_reviewing")

            /** Increase has requested more information related to the Card Dispute from you. */
            @JvmField val PENDING_USER_INFORMATION = of("pending_user_information")

            /**
             * The Card Dispute has been accepted and your funds have been returned. The card
             * dispute will eventually transition into `won` or `lost` depending on the outcome.
             */
            @JvmField val ACCEPTED = of("accepted")

            /** The Card Dispute has been rejected. */
            @JvmField val REJECTED = of("rejected")

            /**
             * The Card Dispute has been lost and funds previously credited from the acceptance have
             * been debited.
             */
            @JvmField val LOST = of("lost")

            /** The Card Dispute has been won and no further action can be taken. */
            @JvmField val WON = of("won")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The Card Dispute is pending review. */
            PENDING_REVIEWING,
            /** Increase has requested more information related to the Card Dispute from you. */
            PENDING_USER_INFORMATION,
            /**
             * The Card Dispute has been accepted and your funds have been returned. The card
             * dispute will eventually transition into `won` or `lost` depending on the outcome.
             */
            ACCEPTED,
            /** The Card Dispute has been rejected. */
            REJECTED,
            /**
             * The Card Dispute has been lost and funds previously credited from the acceptance have
             * been debited.
             */
            LOST,
            /** The Card Dispute has been won and no further action can be taken. */
            WON,
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
            /** The Card Dispute is pending review. */
            PENDING_REVIEWING,
            /** Increase has requested more information related to the Card Dispute from you. */
            PENDING_USER_INFORMATION,
            /**
             * The Card Dispute has been accepted and your funds have been returned. The card
             * dispute will eventually transition into `won` or `lost` depending on the outcome.
             */
            ACCEPTED,
            /** The Card Dispute has been rejected. */
            REJECTED,
            /**
             * The Card Dispute has been lost and funds previously credited from the acceptance have
             * been debited.
             */
            LOST,
            /** The Card Dispute has been won and no further action can be taken. */
            WON,
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
                PENDING_REVIEWING -> Value.PENDING_REVIEWING
                PENDING_USER_INFORMATION -> Value.PENDING_USER_INFORMATION
                ACCEPTED -> Value.ACCEPTED
                REJECTED -> Value.REJECTED
                LOST -> Value.LOST
                WON -> Value.WON
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
                PENDING_REVIEWING -> Known.PENDING_REVIEWING
                PENDING_USER_INFORMATION -> Known.PENDING_USER_INFORMATION
                ACCEPTED -> Known.ACCEPTED
                REJECTED -> Known.REJECTED
                LOST -> Known.LOST
                WON -> Known.WON
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
     * `card_dispute`.
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

            @JvmField val CARD_DISPUTE = of("card_dispute")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CARD_DISPUTE
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
            CARD_DISPUTE,
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
                CARD_DISPUTE -> Value.CARD_DISPUTE
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
                CARD_DISPUTE -> Known.CARD_DISPUTE
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** If the Card Dispute's status is `won`, this will contain details of the won dispute. */
    @NoAutoDetect
    class Win
    @JsonCreator
    private constructor(
        @JsonProperty("card_dispute_id")
        @ExcludeMissing
        private val cardDisputeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("won_at")
        @ExcludeMissing
        private val wonAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier of the Card Dispute that was won. */
        fun cardDisputeId(): String = cardDisputeId.getRequired("card_dispute_id")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
         * Dispute was won.
         */
        fun wonAt(): OffsetDateTime = wonAt.getRequired("won_at")

        /** The identifier of the Card Dispute that was won. */
        @JsonProperty("card_dispute_id")
        @ExcludeMissing
        fun _cardDisputeId(): JsonField<String> = cardDisputeId

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
         * Dispute was won.
         */
        @JsonProperty("won_at") @ExcludeMissing fun _wonAt(): JsonField<OffsetDateTime> = wonAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Win = apply {
            if (validated) {
                return@apply
            }

            cardDisputeId()
            wonAt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Win].
             *
             * The following fields are required:
             * ```java
             * .cardDisputeId()
             * .wonAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Win]. */
        class Builder internal constructor() {

            private var cardDisputeId: JsonField<String>? = null
            private var wonAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(win: Win) = apply {
                cardDisputeId = win.cardDisputeId
                wonAt = win.wonAt
                additionalProperties = win.additionalProperties.toMutableMap()
            }

            /** The identifier of the Card Dispute that was won. */
            fun cardDisputeId(cardDisputeId: String) = cardDisputeId(JsonField.of(cardDisputeId))

            /** The identifier of the Card Dispute that was won. */
            fun cardDisputeId(cardDisputeId: JsonField<String>) = apply {
                this.cardDisputeId = cardDisputeId
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Card Dispute was won.
             */
            fun wonAt(wonAt: OffsetDateTime) = wonAt(JsonField.of(wonAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Card Dispute was won.
             */
            fun wonAt(wonAt: JsonField<OffsetDateTime>) = apply { this.wonAt = wonAt }

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

            fun build(): Win =
                Win(
                    checkRequired("cardDisputeId", cardDisputeId),
                    checkRequired("wonAt", wonAt),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Win && cardDisputeId == other.cardDisputeId && wonAt == other.wonAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cardDisputeId, wonAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Win{cardDisputeId=$cardDisputeId, wonAt=$wonAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardDispute && id == other.id && acceptance == other.acceptance && amount == other.amount && createdAt == other.createdAt && disputedTransactionId == other.disputedTransactionId && explanation == other.explanation && idempotencyKey == other.idempotencyKey && loss == other.loss && rejection == other.rejection && status == other.status && type == other.type && win == other.win && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, acceptance, amount, createdAt, disputedTransactionId, explanation, idempotencyKey, loss, rejection, status, type, win, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardDispute{id=$id, acceptance=$acceptance, amount=$amount, createdAt=$createdAt, disputedTransactionId=$disputedTransactionId, explanation=$explanation, idempotencyKey=$idempotencyKey, loss=$loss, rejection=$rejection, status=$status, type=$type, win=$win, additionalProperties=$additionalProperties}"
}
