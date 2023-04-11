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

class PendingTransactionListParams constructor(private val cursor: String?,private val limit: Long?,private val accountId: String?,private val routeId: String?,private val sourceId: String?,private val status: Status?,private val additionalQueryParams: Map<String, List<String>>,private val additionalHeaders: Map<String, List<String>>,) {

    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun accountId(): Optional<String> = Optional.ofNullable(accountId)

    fun routeId(): Optional<String> = Optional.ofNullable(routeId)

    fun sourceId(): Optional<String> = Optional.ofNullable(sourceId)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
      val params = mutableMapOf<String, List<String>>()
      this.cursor?.let {
          params.put("cursor", listOf(it.toString()))
      }
      this.limit?.let {
          params.put("limit", listOf(it.toString()))
      }
      this.accountId?.let {
          params.put("account_id", listOf(it.toString()))
      }
      this.routeId?.let {
          params.put("route_id", listOf(it.toString()))
      }
      this.sourceId?.let {
          params.put("source_id", listOf(it.toString()))
      }
      this.status?.forEachQueryParam { key, values -> 
          params.put("status.$key", values)
      }
      params.putAll(additionalQueryParams)
      return params.toUnmodifiable()
    }

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is PendingTransactionListParams &&
          this.cursor == other.cursor &&
          this.limit == other.limit &&
          this.accountId == other.accountId &&
          this.routeId == other.routeId &&
          this.sourceId == other.sourceId &&
          this.status == other.status &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
      return Objects.hash(
          cursor,
          limit,
          accountId,
          routeId,
          sourceId,
          status,
          additionalQueryParams,
          additionalHeaders,
      )
    }

    override fun toString() = "PendingTransactionListParams{cursor=$cursor, limit=$limit, accountId=$accountId, routeId=$routeId, sourceId=$sourceId, status=$status, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cursor: String? = null
        private var limit: Long? = null
        private var accountId: String? = null
        private var routeId: String? = null
        private var sourceId: String? = null
        private var status: Status? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pendingTransactionListParams: PendingTransactionListParams) = apply {
            this.cursor = pendingTransactionListParams.cursor
            this.limit = pendingTransactionListParams.limit
            this.accountId = pendingTransactionListParams.accountId
            this.routeId = pendingTransactionListParams.routeId
            this.sourceId = pendingTransactionListParams.sourceId
            this.status = pendingTransactionListParams.status
            additionalQueryParams(pendingTransactionListParams.additionalQueryParams)
            additionalHeaders(pendingTransactionListParams.additionalHeaders)
        }

        /** Return the page of entries after this one. */
        fun cursor(cursor: String) = apply {
            this.cursor = cursor
        }

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100
         * objects.
         */
        fun limit(limit: Long) = apply {
            this.limit = limit
        }

        /** Filter pending transactions to those belonging to the specified Account. */
        fun accountId(accountId: String) = apply {
            this.accountId = accountId
        }

        /** Filter pending transactions to those belonging to the specified Route. */
        fun routeId(routeId: String) = apply {
            this.routeId = routeId
        }

        /** Filter pending transactions to those caused by the specified source. */
        fun sourceId(sourceId: String) = apply {
            this.sourceId = sourceId
        }

        fun status(status: Status) = apply {
            this.status = status
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

        fun build(): PendingTransactionListParams = PendingTransactionListParams(
            cursor,
            limit,
            accountId,
            routeId,
            sourceId,
            status,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
        )
    }

    @JsonDeserialize(builder = Status.Builder::class)
    @NoAutoDetect
    class Status private constructor(private val in_: List<In>?,private val additionalProperties: Map<String, List<String>>,) {

        private var hashCode: Int = 0

        /**
         * Return results whose value is in the provided list. For GET requests, this
         * should be encoded as a comma-delimited string, such as `?in=one,two,three`.
         */
        fun in_(): List<In>? = in_

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
          this.in_?.let {
              putParam("in", listOf(it.joinToString(separator = ",")))
          }
          this.additionalProperties.forEach { key, values -> 
              putParam(key, values)
          }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Status &&
              this.in_ == other.in_ &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(in_, additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "Status{in_=$in_, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var in_: List<In>? = null
            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            @JvmSynthetic
            internal fun from(status: Status) = apply {
                this.in_ = status.in_
                additionalProperties(status.additionalProperties)
            }

            /**
             * Return results whose value is in the provided list. For GET requests, this
             * should be encoded as a comma-delimited string, such as `?in=one,two,three`.
             */
            fun in_(in_: List<In>) = apply {
                this.in_ = in_
            }

            fun additionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: List<String>) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Status = Status(in_?.toUnmodifiable(), additionalProperties.toUnmodifiable())
        }

        class In @JsonCreator private constructor(private val value: JsonField<String>,) {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is In &&
                  this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val PENDING = In(JsonField.of("pending"))

                @JvmField val COMPLETE = In(JsonField.of("complete"))

                @JvmStatic fun of(value: String) = In(JsonField.of(value))
            }

            enum class Known {
                PENDING,
                COMPLETE,
            }

            enum class Value {
                PENDING,
                COMPLETE,
                _UNKNOWN,
            }

            fun value(): Value = when (this) {
                PENDING -> Value.PENDING
                COMPLETE -> Value.COMPLETE
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                PENDING -> Known.PENDING
                COMPLETE -> Known.COMPLETE
                else -> throw IncreaseInvalidDataException("Unknown In: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
