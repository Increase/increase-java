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
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.increase.api.core.BaseDeserializer
import com.increase.api.core.BaseSerializer
import com.increase.api.core.getOrThrow
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.JsonField
import com.increase.api.core.toUnmodifiable
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException

/**
 * You can set limits at the Account, Account Number, or Card level. Limits applied
 * to Accounts will apply to all Account Numbers and Cards in the Account. You can
 * specify any number of Limits and they will all be applied to inbound debits and
 * card authorizations. Volume and count Limits are designed to prevent
 * unauthorized debits.
 */
@JsonDeserialize(builder = Limit.Builder::class)
@NoAutoDetect
class Limit private constructor(private val id: JsonField<String>,private val interval: JsonField<Interval>,private val metric: JsonField<Metric>,private val modelId: JsonField<String>,private val modelType: JsonField<ModelType>,private val status: JsonField<Status>,private val type: JsonField<Type>,private val value: JsonField<Long>,private val additionalProperties: Map<String, JsonValue>,) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The Limit identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The interval for the metric. This is required if `metric` is `count` or
     * `volume`.
     */
    fun interval(): Optional<Interval> = Optional.ofNullable(interval.getNullable("interval"))

    /** The metric for the Limit. */
    fun metric(): Metric = metric.getRequired("metric")

    /** The identifier of the Account Number, Account, or Card the Limit applies to. */
    fun modelId(): String = modelId.getRequired("model_id")

    /** The type of the model you wish to associate the Limit with. */
    fun modelType(): ModelType = modelType.getRequired("model_type")

    /** The current status of the Limit. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `limit`.
     */
    fun type(): Type = type.getRequired("type")

    /** The value to evaluate the Limit against. */
    fun value(): Long = value.getRequired("value")

    /** The Limit identifier. */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id() = id

    /**
     * The interval for the metric. This is required if `metric` is `count` or
     * `volume`.
     */
    @JsonProperty("interval")
    @ExcludeMissing
    fun _interval() = interval

    /** The metric for the Limit. */
    @JsonProperty("metric")
    @ExcludeMissing
    fun _metric() = metric

    /** The identifier of the Account Number, Account, or Card the Limit applies to. */
    @JsonProperty("model_id")
    @ExcludeMissing
    fun _modelId() = modelId

    /** The type of the model you wish to associate the Limit with. */
    @JsonProperty("model_type")
    @ExcludeMissing
    fun _modelType() = modelType

    /** The current status of the Limit. */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status() = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `limit`.
     */
    @JsonProperty("type")
    @ExcludeMissing
    fun _type() = type

    /** The value to evaluate the Limit against. */
    @JsonProperty("value")
    @ExcludeMissing
    fun _value() = value

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
          id()
          interval()
          metric()
          modelId()
          modelType()
          status()
          type()
          value()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is Limit &&
          this.id == other.id &&
          this.interval == other.interval &&
          this.metric == other.metric &&
          this.modelId == other.modelId &&
          this.modelType == other.modelType &&
          this.status == other.status &&
          this.type == other.type &&
          this.value == other.value &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            id,
            interval,
            metric,
            modelId,
            modelType,
            status,
            type,
            value,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "Limit{id=$id, interval=$interval, metric=$metric, modelId=$modelId, modelType=$modelType, status=$status, type=$type, value=$value, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var interval: JsonField<Interval> = JsonMissing.of()
        private var metric: JsonField<Metric> = JsonMissing.of()
        private var modelId: JsonField<String> = JsonMissing.of()
        private var modelType: JsonField<ModelType> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var value: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(limit: Limit) = apply {
            this.id = limit.id
            this.interval = limit.interval
            this.metric = limit.metric
            this.modelId = limit.modelId
            this.modelType = limit.modelType
            this.status = limit.status
            this.type = limit.type
            this.value = limit.value
            additionalProperties(limit.additionalProperties)
        }

        /** The Limit identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Limit identifier. */
        @JsonProperty("id")
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply {
            this.id = id
        }

        /**
         * The interval for the metric. This is required if `metric` is `count` or
         * `volume`.
         */
        fun interval(interval: Interval) = interval(JsonField.of(interval))

        /**
         * The interval for the metric. This is required if `metric` is `count` or
         * `volume`.
         */
        @JsonProperty("interval")
        @ExcludeMissing
        fun interval(interval: JsonField<Interval>) = apply {
            this.interval = interval
        }

        /** The metric for the Limit. */
        fun metric(metric: Metric) = metric(JsonField.of(metric))

        /** The metric for the Limit. */
        @JsonProperty("metric")
        @ExcludeMissing
        fun metric(metric: JsonField<Metric>) = apply {
            this.metric = metric
        }

        /** The identifier of the Account Number, Account, or Card the Limit applies to. */
        fun modelId(modelId: String) = modelId(JsonField.of(modelId))

        /** The identifier of the Account Number, Account, or Card the Limit applies to. */
        @JsonProperty("model_id")
        @ExcludeMissing
        fun modelId(modelId: JsonField<String>) = apply {
            this.modelId = modelId
        }

        /** The type of the model you wish to associate the Limit with. */
        fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

        /** The type of the model you wish to associate the Limit with. */
        @JsonProperty("model_type")
        @ExcludeMissing
        fun modelType(modelType: JsonField<ModelType>) = apply {
            this.modelType = modelType
        }

        /** The current status of the Limit. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The current status of the Limit. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply {
            this.status = status
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `limit`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `limit`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply {
            this.type = type
        }

        /** The value to evaluate the Limit against. */
        fun value(value: Long) = value(JsonField.of(value))

        /** The value to evaluate the Limit against. */
        @JsonProperty("value")
        @ExcludeMissing
        fun value(value: JsonField<Long>) = apply {
            this.value = value
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

        fun build(): Limit = Limit(
            id,
            interval,
            metric,
            modelId,
            modelType,
            status,
            type,
            value,
            additionalProperties.toUnmodifiable(),
        )
    }

    class Interval @JsonCreator private constructor(private val value: JsonField<String>,) {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Interval &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val TRANSACTION = Interval(JsonField.of("transaction"))

            @JvmField val DAY = Interval(JsonField.of("day"))

            @JvmField val WEEK = Interval(JsonField.of("week"))

            @JvmField val MONTH = Interval(JsonField.of("month"))

            @JvmField val YEAR = Interval(JsonField.of("year"))

            @JvmField val ALL_TIME = Interval(JsonField.of("all_time"))

            @JvmStatic fun of(value: String) = Interval(JsonField.of(value))
        }

        enum class Known {
            TRANSACTION,
            DAY,
            WEEK,
            MONTH,
            YEAR,
            ALL_TIME,
        }

        enum class Value {
            TRANSACTION,
            DAY,
            WEEK,
            MONTH,
            YEAR,
            ALL_TIME,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            TRANSACTION -> Value.TRANSACTION
            DAY -> Value.DAY
            WEEK -> Value.WEEK
            MONTH -> Value.MONTH
            YEAR -> Value.YEAR
            ALL_TIME -> Value.ALL_TIME
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            TRANSACTION -> Known.TRANSACTION
            DAY -> Known.DAY
            WEEK -> Known.WEEK
            MONTH -> Known.MONTH
            YEAR -> Known.YEAR
            ALL_TIME -> Known.ALL_TIME
            else -> throw IncreaseInvalidDataException("Unknown Interval: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Metric @JsonCreator private constructor(private val value: JsonField<String>,) {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Metric &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val COUNT = Metric(JsonField.of("count"))

            @JvmField val VOLUME = Metric(JsonField.of("volume"))

            @JvmStatic fun of(value: String) = Metric(JsonField.of(value))
        }

        enum class Known {
            COUNT,
            VOLUME,
        }

        enum class Value {
            COUNT,
            VOLUME,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            COUNT -> Value.COUNT
            VOLUME -> Value.VOLUME
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            COUNT -> Known.COUNT
            VOLUME -> Known.VOLUME
            else -> throw IncreaseInvalidDataException("Unknown Metric: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    class ModelType @JsonCreator private constructor(private val value: JsonField<String>,) {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is ModelType &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACCOUNT = ModelType(JsonField.of("account"))

            @JvmField val ACCOUNT_NUMBER = ModelType(JsonField.of("account_number"))

            @JvmField val CARD = ModelType(JsonField.of("card"))

            @JvmStatic fun of(value: String) = ModelType(JsonField.of(value))
        }

        enum class Known {
            ACCOUNT,
            ACCOUNT_NUMBER,
            CARD,
        }

        enum class Value {
            ACCOUNT,
            ACCOUNT_NUMBER,
            CARD,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            ACCOUNT -> Value.ACCOUNT
            ACCOUNT_NUMBER -> Value.ACCOUNT_NUMBER
            CARD -> Value.CARD
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            ACCOUNT -> Known.ACCOUNT
            ACCOUNT_NUMBER -> Known.ACCOUNT_NUMBER
            CARD -> Known.CARD
            else -> throw IncreaseInvalidDataException("Unknown ModelType: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>,) {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Status &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACTIVE = Status(JsonField.of("active"))

            @JvmField val INACTIVE = Status(JsonField.of("inactive"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            INACTIVE,
        }

        enum class Value {
            ACTIVE,
            INACTIVE,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            ACTIVE -> Value.ACTIVE
            INACTIVE -> Value.INACTIVE
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            ACTIVE -> Known.ACTIVE
            INACTIVE -> Known.INACTIVE
            else -> throw IncreaseInvalidDataException("Unknown Status: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>,) {

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

            @JvmField val LIMIT = Type(JsonField.of("limit"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            LIMIT,
        }

        enum class Value {
            LIMIT,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            LIMIT -> Value.LIMIT
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            LIMIT -> Known.LIMIT
            else -> throw IncreaseInvalidDataException("Unknown Type: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
