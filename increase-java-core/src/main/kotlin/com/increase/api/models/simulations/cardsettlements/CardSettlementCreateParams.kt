// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.cardsettlements

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/**
 * Simulates the settlement of an authorization by a card acquirer. After a card
 * authorization is created, the merchant will eventually send a settlement. This
 * simulates that event, which may occur many days after the purchase in
 * production. The amount settled can be different from the amount originally
 * authorized, for example, when adding a tip to a restaurant bill.
 */
class CardSettlementCreateParams private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,

) : Params {

    /** The identifier of the Card to create a settlement on. */
    fun cardId(): String = body.cardId()

    /**
     * The identifier of the Pending Transaction for the Card Authorization you wish to
     * settle.
     */
    fun pendingTransactionId(): String = body.pendingTransactionId()

    /**
     * The amount to be settled. This defaults to the amount of the Pending Transaction
     * being settled.
     */
    fun amount(): Optional<Long> = body.amount()

    /** The identifier of the Card to create a settlement on. */
    fun _cardId(): JsonField<String> = body._cardId()

    /**
     * The identifier of the Pending Transaction for the Card Authorization you wish to
     * settle.
     */
    fun _pendingTransactionId(): JsonField<String> = body._pendingTransactionId()

    /**
     * The amount to be settled. This defaults to the amount of the Pending Transaction
     * being settled.
     */
    fun _amount(): JsonField<Long> = body._amount()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic
    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body @JsonCreator private constructor(
        @JsonProperty("card_id") @ExcludeMissing private val cardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pending_transaction_id") @ExcludeMissing private val pendingTransactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** The identifier of the Card to create a settlement on. */
        fun cardId(): String = cardId.getRequired("card_id")

        /**
         * The identifier of the Pending Transaction for the Card Authorization you wish to
         * settle.
         */
        fun pendingTransactionId(): String = pendingTransactionId.getRequired("pending_transaction_id")

        /**
         * The amount to be settled. This defaults to the amount of the Pending Transaction
         * being settled.
         */
        fun amount(): Optional<Long> = Optional.ofNullable(amount.getNullable("amount"))

        /** The identifier of the Card to create a settlement on. */
        @JsonProperty("card_id")
        @ExcludeMissing
        fun _cardId(): JsonField<String> = cardId

        /**
         * The identifier of the Pending Transaction for the Card Authorization you wish to
         * settle.
         */
        @JsonProperty("pending_transaction_id")
        @ExcludeMissing
        fun _pendingTransactionId(): JsonField<String> = pendingTransactionId

        /**
         * The amount to be settled. This defaults to the amount of the Pending Transaction
         * being settled.
         */
        @JsonProperty("amount")
        @ExcludeMissing
        fun _amount(): JsonField<Long> = amount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body =
            apply {
                if (validated) {
                  return@apply
                }

                cardId()
                pendingTransactionId()
                amount()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             *
             * ```java
             * .cardId()
             * .pendingTransactionId()
             * ```
             */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var cardId: JsonField<String>? = null
            private var pendingTransactionId: JsonField<String>? = null
            private var amount: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) =
                apply {
                    cardId = body.cardId
                    pendingTransactionId = body.pendingTransactionId
                    amount = body.amount
                    additionalProperties = body.additionalProperties.toMutableMap()
                }

            /** The identifier of the Card to create a settlement on. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /** The identifier of the Card to create a settlement on. */
            fun cardId(cardId: JsonField<String>) =
                apply {
                    this.cardId = cardId
                }

            /**
             * The identifier of the Pending Transaction for the Card Authorization you wish to
             * settle.
             */
            fun pendingTransactionId(pendingTransactionId: String) = pendingTransactionId(JsonField.of(pendingTransactionId))

            /**
             * The identifier of the Pending Transaction for the Card Authorization you wish to
             * settle.
             */
            fun pendingTransactionId(pendingTransactionId: JsonField<String>) =
                apply {
                    this.pendingTransactionId = pendingTransactionId
                }

            /**
             * The amount to be settled. This defaults to the amount of the Pending Transaction
             * being settled.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * The amount to be settled. This defaults to the amount of the Pending Transaction
             * being settled.
             */
            fun amount(amount: JsonField<Long>) =
                apply {
                    this.amount = amount
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

            fun build(): Body =
                Body(
                  checkRequired(
                    "cardId", cardId
                  ),
                  checkRequired(
                    "pendingTransactionId", pendingTransactionId
                  ),
                  amount,
                  additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Body && cardId == other.cardId && pendingTransactionId == other.pendingTransactionId && amount == other.amount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cardId, pendingTransactionId, amount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{cardId=$cardId, pendingTransactionId=$pendingTransactionId, amount=$amount, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CardSettlementCreateParams].
         *
         * The following fields are required:
         *
         * ```java
         * .cardId()
         * .pendingTransactionId()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [CardSettlementCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cardSettlementCreateParams: CardSettlementCreateParams) =
            apply {
                body = cardSettlementCreateParams.body.toBuilder()
                additionalHeaders = cardSettlementCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams = cardSettlementCreateParams.additionalQueryParams.toBuilder()
            }

        /** The identifier of the Card to create a settlement on. */
        fun cardId(cardId: String) =
            apply {
                body.cardId(cardId)
            }

        /** The identifier of the Card to create a settlement on. */
        fun cardId(cardId: JsonField<String>) =
            apply {
                body.cardId(cardId)
            }

        /**
         * The identifier of the Pending Transaction for the Card Authorization you wish to
         * settle.
         */
        fun pendingTransactionId(pendingTransactionId: String) =
            apply {
                body.pendingTransactionId(pendingTransactionId)
            }

        /**
         * The identifier of the Pending Transaction for the Card Authorization you wish to
         * settle.
         */
        fun pendingTransactionId(pendingTransactionId: JsonField<String>) =
            apply {
                body.pendingTransactionId(pendingTransactionId)
            }

        /**
         * The amount to be settled. This defaults to the amount of the Pending Transaction
         * being settled.
         */
        fun amount(amount: Long) =
            apply {
                body.amount(amount)
            }

        /**
         * The amount to be settled. This defaults to the amount of the Pending Transaction
         * being settled.
         */
        fun amount(amount: JsonField<Long>) =
            apply {
                body.amount(amount)
            }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.additionalProperties(additionalBodyProperties)
            }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) =
            apply {
                body.putAdditionalProperty(
                  key, value
                )
            }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) =
            apply {
                body.removeAdditionalProperty(key)
            }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) =
            apply {
                body.removeAllAdditionalProperties(keys)
            }

        fun additionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun putAdditionalHeader(name: String, value: String) =
            apply {
                additionalHeaders.put(name, value)
            }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.put(name, values)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun replaceAdditionalHeaders(name: String, value: String) =
            apply {
                additionalHeaders.replace(name, value)
            }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.replace(name, values)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun removeAdditionalHeaders(name: String) =
            apply {
                additionalHeaders.remove(name)
            }

        fun removeAllAdditionalHeaders(names: Set<String>) =
            apply {
                additionalHeaders.removeAll(names)
            }

        fun additionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun putAdditionalQueryParam(key: String, value: String) =
            apply {
                additionalQueryParams.put(key, value)
            }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.put(key, values)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) =
            apply {
                additionalQueryParams.replace(key, value)
            }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.replace(key, values)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) =
            apply {
                additionalQueryParams.remove(key)
            }

        fun removeAllAdditionalQueryParams(keys: Set<String>) =
            apply {
                additionalQueryParams.removeAll(keys)
            }

        fun build(): CardSettlementCreateParams =
            CardSettlementCreateParams(
              body.build(),
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is CardSettlementCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() = "CardSettlementCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
