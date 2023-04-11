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

class AccountListParams constructor(private val cursor: String?,private val limit: Long?,private val entityId: String?,private val status: Status?,private val additionalQueryParams: Map<String, List<String>>,private val additionalHeaders: Map<String, List<String>>,) {

    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun entityId(): Optional<String> = Optional.ofNullable(entityId)

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
      this.entityId?.let {
          params.put("entity_id", listOf(it.toString()))
      }
      this.status?.let {
          params.put("status", listOf(it.toString()))
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

      return other is AccountListParams &&
          this.cursor == other.cursor &&
          this.limit == other.limit &&
          this.entityId == other.entityId &&
          this.status == other.status &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
      return Objects.hash(
          cursor,
          limit,
          entityId,
          status,
          additionalQueryParams,
          additionalHeaders,
      )
    }

    override fun toString() = "AccountListParams{cursor=$cursor, limit=$limit, entityId=$entityId, status=$status, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cursor: String? = null
        private var limit: Long? = null
        private var entityId: String? = null
        private var status: Status? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountListParams: AccountListParams) = apply {
            this.cursor = accountListParams.cursor
            this.limit = accountListParams.limit
            this.entityId = accountListParams.entityId
            this.status = accountListParams.status
            additionalQueryParams(accountListParams.additionalQueryParams)
            additionalHeaders(accountListParams.additionalHeaders)
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

        /** Filter Accounts for those belonging to the specified Entity. */
        fun entityId(entityId: String) = apply {
            this.entityId = entityId
        }

        /** Filter Accounts for those with the specified status. */
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

        fun build(): AccountListParams = AccountListParams(
            cursor,
            limit,
            entityId,
            status,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
        )
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

            @JvmField val OPEN = Status(JsonField.of("open"))

            @JvmField val CLOSED = Status(JsonField.of("closed"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            OPEN,
            CLOSED,
        }

        enum class Value {
            OPEN,
            CLOSED,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            OPEN -> Value.OPEN
            CLOSED -> Value.CLOSED
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            OPEN -> Known.OPEN
            CLOSED -> Known.CLOSED
            else -> throw IncreaseInvalidDataException("Unknown Status: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
