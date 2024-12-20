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
 * If unauthorized activity occurs on a card, you can create a Card Dispute and we'll return the
 * funds if appropriate.
 */
@JsonDeserialize(builder = CardDispute.Builder::class)
@NoAutoDetect
class CardDispute
private constructor(
    private val acceptance: JsonField<Acceptance>,
    private val amount: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val disputedTransactionId: JsonField<String>,
    private val explanation: JsonField<String>,
    private val id: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val loss: JsonField<Loss>,
    private val rejection: JsonField<Rejection>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val win: JsonField<Win>,
    private val additionalProperties: Map<String, JsonValue>,
) {

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

    /** The Card Dispute identifier. */
    fun id(): String = id.getRequired("id")

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

    /**
     * If the Card Dispute's status is `accepted`, this will contain details of the successful
     * dispute.
     */
    @JsonProperty("acceptance") @ExcludeMissing fun _acceptance() = acceptance

    /** The amount of the dispute, if provided, or the transaction amount otherwise. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
     * Dispute was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The identifier of the Transaction that was disputed. */
    @JsonProperty("disputed_transaction_id")
    @ExcludeMissing
    fun _disputedTransactionId() = disputedTransactionId

    /** Why you disputed the Transaction in question. */
    @JsonProperty("explanation") @ExcludeMissing fun _explanation() = explanation

    /** The Card Dispute identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /** If the Card Dispute's status is `lost`, this will contain details of the lost dispute. */
    @JsonProperty("loss") @ExcludeMissing fun _loss() = loss

    /**
     * If the Card Dispute's status is `rejected`, this will contain details of the unsuccessful
     * dispute.
     */
    @JsonProperty("rejection") @ExcludeMissing fun _rejection() = rejection

    /** The results of the Dispute investigation. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_dispute`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /** If the Card Dispute's status is `won`, this will contain details of the won dispute. */
    @JsonProperty("win") @ExcludeMissing fun _win() = win

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CardDispute = apply {
        if (!validated) {
            acceptance().map { it.validate() }
            amount()
            createdAt()
            disputedTransactionId()
            explanation()
            id()
            idempotencyKey()
            loss().map { it.validate() }
            rejection().map { it.validate() }
            status()
            type()
            win().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var acceptance: JsonField<Acceptance> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var disputedTransactionId: JsonField<String> = JsonMissing.of()
        private var explanation: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var loss: JsonField<Loss> = JsonMissing.of()
        private var rejection: JsonField<Rejection> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var win: JsonField<Win> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardDispute: CardDispute) = apply {
            acceptance = cardDispute.acceptance
            amount = cardDispute.amount
            createdAt = cardDispute.createdAt
            disputedTransactionId = cardDispute.disputedTransactionId
            explanation = cardDispute.explanation
            id = cardDispute.id
            idempotencyKey = cardDispute.idempotencyKey
            loss = cardDispute.loss
            rejection = cardDispute.rejection
            status = cardDispute.status
            type = cardDispute.type
            win = cardDispute.win
            additionalProperties = cardDispute.additionalProperties.toMutableMap()
        }

        /**
         * If the Card Dispute's status is `accepted`, this will contain details of the successful
         * dispute.
         */
        fun acceptance(acceptance: Acceptance) = acceptance(JsonField.of(acceptance))

        /**
         * If the Card Dispute's status is `accepted`, this will contain details of the successful
         * dispute.
         */
        @JsonProperty("acceptance")
        @ExcludeMissing
        fun acceptance(acceptance: JsonField<Acceptance>) = apply { this.acceptance = acceptance }

        /** The amount of the dispute, if provided, or the transaction amount otherwise. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The amount of the dispute, if provided, or the transaction amount otherwise. */
        @JsonProperty("amount")
        @ExcludeMissing
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
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The identifier of the Transaction that was disputed. */
        fun disputedTransactionId(disputedTransactionId: String) =
            disputedTransactionId(JsonField.of(disputedTransactionId))

        /** The identifier of the Transaction that was disputed. */
        @JsonProperty("disputed_transaction_id")
        @ExcludeMissing
        fun disputedTransactionId(disputedTransactionId: JsonField<String>) = apply {
            this.disputedTransactionId = disputedTransactionId
        }

        /** Why you disputed the Transaction in question. */
        fun explanation(explanation: String) = explanation(JsonField.of(explanation))

        /** Why you disputed the Transaction in question. */
        @JsonProperty("explanation")
        @ExcludeMissing
        fun explanation(explanation: JsonField<String>) = apply { this.explanation = explanation }

        /** The Card Dispute identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Card Dispute identifier. */
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

        /**
         * If the Card Dispute's status is `lost`, this will contain details of the lost dispute.
         */
        fun loss(loss: Loss) = loss(JsonField.of(loss))

        /**
         * If the Card Dispute's status is `lost`, this will contain details of the lost dispute.
         */
        @JsonProperty("loss")
        @ExcludeMissing
        fun loss(loss: JsonField<Loss>) = apply { this.loss = loss }

        /**
         * If the Card Dispute's status is `rejected`, this will contain details of the unsuccessful
         * dispute.
         */
        fun rejection(rejection: Rejection) = rejection(JsonField.of(rejection))

        /**
         * If the Card Dispute's status is `rejected`, this will contain details of the unsuccessful
         * dispute.
         */
        @JsonProperty("rejection")
        @ExcludeMissing
        fun rejection(rejection: JsonField<Rejection>) = apply { this.rejection = rejection }

        /** The results of the Dispute investigation. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The results of the Dispute investigation. */
        @JsonProperty("status")
        @ExcludeMissing
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
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** If the Card Dispute's status is `won`, this will contain details of the won dispute. */
        fun win(win: Win) = win(JsonField.of(win))

        /** If the Card Dispute's status is `won`, this will contain details of the won dispute. */
        @JsonProperty("win") @ExcludeMissing fun win(win: JsonField<Win>) = apply { this.win = win }

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

        fun build(): CardDispute =
            CardDispute(
                acceptance,
                amount,
                createdAt,
                disputedTransactionId,
                explanation,
                id,
                idempotencyKey,
                loss,
                rejection,
                status,
                type,
                win,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * If the Card Dispute's status is `accepted`, this will contain details of the successful
     * dispute.
     */
    @JsonDeserialize(builder = Acceptance.Builder::class)
    @NoAutoDetect
    class Acceptance
    private constructor(
        private val acceptedAt: JsonField<OffsetDateTime>,
        private val cardDisputeId: JsonField<String>,
        private val transactionId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("accepted_at") @ExcludeMissing fun _acceptedAt() = acceptedAt

        /** The identifier of the Card Dispute that was accepted. */
        @JsonProperty("card_dispute_id") @ExcludeMissing fun _cardDisputeId() = cardDisputeId

        /**
         * The identifier of the Transaction that was created to return the disputed funds to your
         * account.
         */
        @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Acceptance = apply {
            if (!validated) {
                acceptedAt()
                cardDisputeId()
                transactionId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var acceptedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cardDisputeId: JsonField<String> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
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
            @JsonProperty("accepted_at")
            @ExcludeMissing
            fun acceptedAt(acceptedAt: JsonField<OffsetDateTime>) = apply {
                this.acceptedAt = acceptedAt
            }

            /** The identifier of the Card Dispute that was accepted. */
            fun cardDisputeId(cardDisputeId: String) = cardDisputeId(JsonField.of(cardDisputeId))

            /** The identifier of the Card Dispute that was accepted. */
            @JsonProperty("card_dispute_id")
            @ExcludeMissing
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
            @JsonProperty("transaction_id")
            @ExcludeMissing
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
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

            fun build(): Acceptance =
                Acceptance(
                    acceptedAt,
                    cardDisputeId,
                    transactionId,
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
    @JsonDeserialize(builder = Loss.Builder::class)
    @NoAutoDetect
    class Loss
    private constructor(
        private val cardDisputeId: JsonField<String>,
        private val explanation: JsonField<String>,
        private val lostAt: JsonField<OffsetDateTime>,
        private val transactionId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("card_dispute_id") @ExcludeMissing fun _cardDisputeId() = cardDisputeId

        /** Why the Card Dispute was lost. */
        @JsonProperty("explanation") @ExcludeMissing fun _explanation() = explanation

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
         * Dispute was lost.
         */
        @JsonProperty("lost_at") @ExcludeMissing fun _lostAt() = lostAt

        /**
         * The identifier of the Transaction that was created to debit the disputed funds from your
         * account.
         */
        @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Loss = apply {
            if (!validated) {
                cardDisputeId()
                explanation()
                lostAt()
                transactionId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var cardDisputeId: JsonField<String> = JsonMissing.of()
            private var explanation: JsonField<String> = JsonMissing.of()
            private var lostAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
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
            @JsonProperty("card_dispute_id")
            @ExcludeMissing
            fun cardDisputeId(cardDisputeId: JsonField<String>) = apply {
                this.cardDisputeId = cardDisputeId
            }

            /** Why the Card Dispute was lost. */
            fun explanation(explanation: String) = explanation(JsonField.of(explanation))

            /** Why the Card Dispute was lost. */
            @JsonProperty("explanation")
            @ExcludeMissing
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
            @JsonProperty("lost_at")
            @ExcludeMissing
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
            @JsonProperty("transaction_id")
            @ExcludeMissing
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
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

            fun build(): Loss =
                Loss(
                    cardDisputeId,
                    explanation,
                    lostAt,
                    transactionId,
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
    @JsonDeserialize(builder = Rejection.Builder::class)
    @NoAutoDetect
    class Rejection
    private constructor(
        private val cardDisputeId: JsonField<String>,
        private val explanation: JsonField<String>,
        private val rejectedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("card_dispute_id") @ExcludeMissing fun _cardDisputeId() = cardDisputeId

        /** Why the Card Dispute was rejected. */
        @JsonProperty("explanation") @ExcludeMissing fun _explanation() = explanation

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
         * Dispute was rejected.
         */
        @JsonProperty("rejected_at") @ExcludeMissing fun _rejectedAt() = rejectedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Rejection = apply {
            if (!validated) {
                cardDisputeId()
                explanation()
                rejectedAt()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var cardDisputeId: JsonField<String> = JsonMissing.of()
            private var explanation: JsonField<String> = JsonMissing.of()
            private var rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of()
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
            @JsonProperty("card_dispute_id")
            @ExcludeMissing
            fun cardDisputeId(cardDisputeId: JsonField<String>) = apply {
                this.cardDisputeId = cardDisputeId
            }

            /** Why the Card Dispute was rejected. */
            fun explanation(explanation: String) = explanation(JsonField.of(explanation))

            /** Why the Card Dispute was rejected. */
            @JsonProperty("explanation")
            @ExcludeMissing
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
            @JsonProperty("rejected_at")
            @ExcludeMissing
            fun rejectedAt(rejectedAt: JsonField<OffsetDateTime>) = apply {
                this.rejectedAt = rejectedAt
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

            fun build(): Rejection =
                Rejection(
                    cardDisputeId,
                    explanation,
                    rejectedAt,
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

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PENDING_REVIEWING = of("pending_reviewing")

            @JvmField val PENDING_USER_INFORMATION = of("pending_user_information")

            @JvmField val ACCEPTED = of("accepted")

            @JvmField val REJECTED = of("rejected")

            @JvmField val LOST = of("lost")

            @JvmField val WON = of("won")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING_REVIEWING,
            PENDING_USER_INFORMATION,
            ACCEPTED,
            REJECTED,
            LOST,
            WON,
        }

        enum class Value {
            PENDING_REVIEWING,
            PENDING_USER_INFORMATION,
            ACCEPTED,
            REJECTED,
            LOST,
            WON,
            _UNKNOWN,
        }

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

            @JvmField val CARD_DISPUTE = of("card_dispute")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            CARD_DISPUTE,
        }

        enum class Value {
            CARD_DISPUTE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CARD_DISPUTE -> Value.CARD_DISPUTE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CARD_DISPUTE -> Known.CARD_DISPUTE
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

    /** If the Card Dispute's status is `won`, this will contain details of the won dispute. */
    @JsonDeserialize(builder = Win.Builder::class)
    @NoAutoDetect
    class Win
    private constructor(
        private val cardDisputeId: JsonField<String>,
        private val wonAt: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The identifier of the Card Dispute that was won. */
        fun cardDisputeId(): String = cardDisputeId.getRequired("card_dispute_id")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
         * Dispute was won.
         */
        fun wonAt(): OffsetDateTime = wonAt.getRequired("won_at")

        /** The identifier of the Card Dispute that was won. */
        @JsonProperty("card_dispute_id") @ExcludeMissing fun _cardDisputeId() = cardDisputeId

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
         * Dispute was won.
         */
        @JsonProperty("won_at") @ExcludeMissing fun _wonAt() = wonAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Win = apply {
            if (!validated) {
                cardDisputeId()
                wonAt()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var cardDisputeId: JsonField<String> = JsonMissing.of()
            private var wonAt: JsonField<OffsetDateTime> = JsonMissing.of()
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
            @JsonProperty("card_dispute_id")
            @ExcludeMissing
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
            @JsonProperty("won_at")
            @ExcludeMissing
            fun wonAt(wonAt: JsonField<OffsetDateTime>) = apply { this.wonAt = wonAt }

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

            fun build(): Win =
                Win(
                    cardDisputeId,
                    wonAt,
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

        return /* spotless:off */ other is CardDispute && acceptance == other.acceptance && amount == other.amount && createdAt == other.createdAt && disputedTransactionId == other.disputedTransactionId && explanation == other.explanation && id == other.id && idempotencyKey == other.idempotencyKey && loss == other.loss && rejection == other.rejection && status == other.status && type == other.type && win == other.win && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(acceptance, amount, createdAt, disputedTransactionId, explanation, id, idempotencyKey, loss, rejection, status, type, win, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardDispute{acceptance=$acceptance, amount=$amount, createdAt=$createdAt, disputedTransactionId=$disputedTransactionId, explanation=$explanation, id=$id, idempotencyKey=$idempotencyKey, loss=$loss, rejection=$rejection, status=$status, type=$type, win=$win, additionalProperties=$additionalProperties}"
}
