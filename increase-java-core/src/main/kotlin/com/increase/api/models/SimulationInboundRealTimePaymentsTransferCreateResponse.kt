// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.increase.api.core.BaseDeserializer
import com.increase.api.core.BaseSerializer
import com.increase.api.core.getOrThrow
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonField
import com.increase.api.core.Enum
import com.increase.api.core.toUnmodifiable
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException

/** The results of an inbound Real-Time Payments Transfer simulation. */
@JsonDeserialize(builder = SimulationInboundRealTimePaymentsTransferCreateResponse.Builder::class)
@NoAutoDetect
class SimulationInboundRealTimePaymentsTransferCreateResponse private constructor(
  private val declinedTransaction: JsonField<DeclinedTransaction>,
  private val transaction: JsonField<Transaction>,
  private val type: JsonField<Type>,
  private val additionalProperties: Map<String, JsonValue>,

) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * If the Real-Time Payments Transfer attempt fails, this will contain the
     * resulting [Declined Transaction](#declined-transactions) object. The Declined
     * Transaction's `source` will be of
     * `category: inbound_real_time_payments_transfer_decline`.
     */
    fun declinedTransaction(): Optional<DeclinedTransaction> = Optional.ofNullable(declinedTransaction.getNullable("declined_transaction"))

    /**
     * If the Real-Time Payments Transfer attempt succeeds, this will contain the
     * resulting [Transaction](#transactions) object. The Transaction's `source` will
     * be of `category: inbound_real_time_payments_transfer_confirmation`.
     */
    fun transaction(): Optional<Transaction> = Optional.ofNullable(transaction.getNullable("transaction"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_real_time_payments_transfer_simulation_result`.
     */
    fun type(): Type = type.getRequired("type")

    /**
     * If the Real-Time Payments Transfer attempt fails, this will contain the
     * resulting [Declined Transaction](#declined-transactions) object. The Declined
     * Transaction's `source` will be of
     * `category: inbound_real_time_payments_transfer_decline`.
     */
    @JsonProperty("declined_transaction")
    @ExcludeMissing
    fun _declinedTransaction() = declinedTransaction

    /**
     * If the Real-Time Payments Transfer attempt succeeds, this will contain the
     * resulting [Transaction](#transactions) object. The Transaction's `source` will
     * be of `category: inbound_real_time_payments_transfer_confirmation`.
     */
    @JsonProperty("transaction")
    @ExcludeMissing
    fun _transaction() = transaction

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_real_time_payments_transfer_simulation_result`.
     */
    @JsonProperty("type")
    @ExcludeMissing
    fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SimulationInboundRealTimePaymentsTransferCreateResponse = apply {
        if (!validated) {
          declinedTransaction().map { it.validate() }
          transaction().map { it.validate() }
          type()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is SimulationInboundRealTimePaymentsTransferCreateResponse &&
          this.declinedTransaction == other.declinedTransaction &&
          this.transaction == other.transaction &&
          this.type == other.type &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            declinedTransaction,
            transaction,
            type,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "SimulationInboundRealTimePaymentsTransferCreateResponse{declinedTransaction=$declinedTransaction, transaction=$transaction, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var declinedTransaction: JsonField<DeclinedTransaction> = JsonMissing.of()
        private var transaction: JsonField<Transaction> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(simulationInboundRealTimePaymentsTransferCreateResponse: SimulationInboundRealTimePaymentsTransferCreateResponse) = apply {
            this.declinedTransaction = simulationInboundRealTimePaymentsTransferCreateResponse.declinedTransaction
            this.transaction = simulationInboundRealTimePaymentsTransferCreateResponse.transaction
            this.type = simulationInboundRealTimePaymentsTransferCreateResponse.type
            additionalProperties(simulationInboundRealTimePaymentsTransferCreateResponse.additionalProperties)
        }

        /**
         * If the Real-Time Payments Transfer attempt fails, this will contain the
         * resulting [Declined Transaction](#declined-transactions) object. The Declined
         * Transaction's `source` will be of
         * `category: inbound_real_time_payments_transfer_decline`.
         */
        fun declinedTransaction(declinedTransaction: DeclinedTransaction) = declinedTransaction(JsonField.of(declinedTransaction))

        /**
         * If the Real-Time Payments Transfer attempt fails, this will contain the
         * resulting [Declined Transaction](#declined-transactions) object. The Declined
         * Transaction's `source` will be of
         * `category: inbound_real_time_payments_transfer_decline`.
         */
        @JsonProperty("declined_transaction")
        @ExcludeMissing
        fun declinedTransaction(declinedTransaction: JsonField<DeclinedTransaction>) = apply {
            this.declinedTransaction = declinedTransaction
        }

        /**
         * If the Real-Time Payments Transfer attempt succeeds, this will contain the
         * resulting [Transaction](#transactions) object. The Transaction's `source` will
         * be of `category: inbound_real_time_payments_transfer_confirmation`.
         */
        fun transaction(transaction: Transaction) = transaction(JsonField.of(transaction))

        /**
         * If the Real-Time Payments Transfer attempt succeeds, this will contain the
         * resulting [Transaction](#transactions) object. The Transaction's `source` will
         * be of `category: inbound_real_time_payments_transfer_confirmation`.
         */
        @JsonProperty("transaction")
        @ExcludeMissing
        fun transaction(transaction: JsonField<Transaction>) = apply {
            this.transaction = transaction
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_real_time_payments_transfer_simulation_result`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_real_time_payments_transfer_simulation_result`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply {
            this.type = type
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

        fun build(): SimulationInboundRealTimePaymentsTransferCreateResponse = SimulationInboundRealTimePaymentsTransferCreateResponse(
            declinedTransaction,
            transaction,
            type,
            additionalProperties.toUnmodifiable(),
        )
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Type &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_SIMULATION_RESULT = Type(JsonField.of("inbound_real_time_payments_transfer_simulation_result"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INBOUND_REAL_TIME_PAYMENTS_TRANSFER_SIMULATION_RESULT,
        }

        enum class Value {
            INBOUND_REAL_TIME_PAYMENTS_TRANSFER_SIMULATION_RESULT,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            INBOUND_REAL_TIME_PAYMENTS_TRANSFER_SIMULATION_RESULT -> Value.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_SIMULATION_RESULT
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            INBOUND_REAL_TIME_PAYMENTS_TRANSFER_SIMULATION_RESULT -> Known.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_SIMULATION_RESULT
            else -> throw IncreaseInvalidDataException("Unknown Type: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
