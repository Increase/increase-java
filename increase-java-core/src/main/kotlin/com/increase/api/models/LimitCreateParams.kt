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
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.toUnmodifiable
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*

class LimitCreateParams constructor(private val metric: Metric,private val interval: Interval?,private val modelId: String,private val value: Long,private val additionalQueryParams: Map<String, List<String>>,private val additionalHeaders: Map<String, List<String>>,private val additionalBodyProperties: Map<String, JsonValue>,) {

    fun metric(): Metric = metric

    fun interval(): Optional<Interval> = Optional.ofNullable(interval)

    fun modelId(): String = modelId

    fun value(): Long = value

    @JvmSynthetic
    internal fun getBody(): LimitCreateBody {
      return LimitCreateBody(
          metric,
          interval,
          modelId,
          value,
          additionalBodyProperties,
      )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = LimitCreateBody.Builder::class)
    @NoAutoDetect
    class LimitCreateBody internal constructor(private val metric: Metric?,private val interval: Interval?,private val modelId: String?,private val value: Long?,private val additionalProperties: Map<String, JsonValue>,) {

        private var hashCode: Int = 0

        /** The metric for the limit. */
        @JsonProperty("metric")
        fun metric(): Metric? = metric

        /** The interval for the metric. Required if `metric` is `count` or `volume`. */
        @JsonProperty("interval")
        fun interval(): Interval? = interval

        /**
         * The identifier of the Account or Account Number you wish to associate the limit
         * with.
         */
        @JsonProperty("model_id")
        fun modelId(): String? = modelId

        /** The value to test the limit against. */
        @JsonProperty("value")
        fun value(): Long? = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is LimitCreateBody &&
              this.metric == other.metric &&
              this.interval == other.interval &&
              this.modelId == other.modelId &&
              this.value == other.value &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                metric,
                interval,
                modelId,
                value,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "LimitCreateBody{metric=$metric, interval=$interval, modelId=$modelId, value=$value, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var metric: Metric? = null
            private var interval: Interval? = null
            private var modelId: String? = null
            private var value: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(limitCreateBody: LimitCreateBody) = apply {
                this.metric = limitCreateBody.metric
                this.interval = limitCreateBody.interval
                this.modelId = limitCreateBody.modelId
                this.value = limitCreateBody.value
                additionalProperties(limitCreateBody.additionalProperties)
            }

            /** The metric for the limit. */
            @JsonProperty("metric")
            fun metric(metric: Metric) = apply {
                this.metric = metric
            }

            /** The interval for the metric. Required if `metric` is `count` or `volume`. */
            @JsonProperty("interval")
            fun interval(interval: Interval) = apply {
                this.interval = interval
            }

            /**
             * The identifier of the Account or Account Number you wish to associate the limit
             * with.
             */
            @JsonProperty("model_id")
            fun modelId(modelId: String) = apply {
                this.modelId = modelId
            }

            /** The value to test the limit against. */
            @JsonProperty("value")
            fun value(value: Long) = apply {
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

            fun build(): LimitCreateBody = LimitCreateBody(
                checkNotNull(metric) {
                    "`metric` is required but was not set"
                },
                interval,
                checkNotNull(modelId) {
                    "`modelId` is required but was not set"
                },
                checkNotNull(value) {
                    "`value` is required but was not set"
                },
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is LimitCreateParams &&
          this.metric == other.metric &&
          this.interval == other.interval &&
          this.modelId == other.modelId &&
          this.value == other.value &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          metric,
          interval,
          modelId,
          value,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "LimitCreateParams{metric=$metric, interval=$interval, modelId=$modelId, value=$value, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var metric: Metric? = null
        private var interval: Interval? = null
        private var modelId: String? = null
        private var value: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(limitCreateParams: LimitCreateParams) = apply {
            this.metric = limitCreateParams.metric
            this.interval = limitCreateParams.interval
            this.modelId = limitCreateParams.modelId
            this.value = limitCreateParams.value
            additionalQueryParams(limitCreateParams.additionalQueryParams)
            additionalHeaders(limitCreateParams.additionalHeaders)
            additionalBodyProperties(limitCreateParams.additionalBodyProperties)
        }

        /** The metric for the limit. */
        fun metric(metric: Metric) = apply {
            this.metric = metric
        }

        /** The interval for the metric. Required if `metric` is `count` or `volume`. */
        fun interval(interval: Interval) = apply {
            this.interval = interval
        }

        /**
         * The identifier of the Account or Account Number you wish to associate the limit
         * with.
         */
        fun modelId(modelId: String) = apply {
            this.modelId = modelId
        }

        /** The value to test the limit against. */
        fun value(value: Long) = apply {
            this.value = value
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply {
            this.additionalHeaders.put(name, mutableListOf())
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun build(): LimitCreateParams = LimitCreateParams(
            checkNotNull(metric) {
                "`metric` is required but was not set"
            },
            interval,
            checkNotNull(modelId) {
                "`modelId` is required but was not set"
            },
            checkNotNull(value) {
                "`value` is required but was not set"
            },
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
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
}
