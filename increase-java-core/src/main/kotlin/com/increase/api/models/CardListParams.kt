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

class CardListParams constructor(private val cursor: String?,private val limit: Long?,private val accountId: String?,private val createdAt: CreatedAt?,private val additionalQueryParams: Map<String, List<String>>,private val additionalHeaders: Map<String, List<String>>,) {

    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun accountId(): Optional<String> = Optional.ofNullable(accountId)

    fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

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
      this.createdAt?.forEachQueryParam { key, values -> 
          params.put("created_at.$key", values)
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

      return other is CardListParams &&
          this.cursor == other.cursor &&
          this.limit == other.limit &&
          this.accountId == other.accountId &&
          this.createdAt == other.createdAt &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
      return Objects.hash(
          cursor,
          limit,
          accountId,
          createdAt,
          additionalQueryParams,
          additionalHeaders,
      )
    }

    override fun toString() = "CardListParams{cursor=$cursor, limit=$limit, accountId=$accountId, createdAt=$createdAt, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

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
        private var createdAt: CreatedAt? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardListParams: CardListParams) = apply {
            this.cursor = cardListParams.cursor
            this.limit = cardListParams.limit
            this.accountId = cardListParams.accountId
            this.createdAt = cardListParams.createdAt
            additionalQueryParams(cardListParams.additionalQueryParams)
            additionalHeaders(cardListParams.additionalHeaders)
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

        /** Filter Cards to ones belonging to the specified Account. */
        fun accountId(accountId: String) = apply {
            this.accountId = accountId
        }

        fun createdAt(createdAt: CreatedAt) = apply {
            this.createdAt = createdAt
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

        fun build(): CardListParams = CardListParams(
            cursor,
            limit,
            accountId,
            createdAt,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
        )
    }

    @JsonDeserialize(builder = CreatedAt.Builder::class)
    @NoAutoDetect
    class CreatedAt private constructor(private val after: OffsetDateTime?,private val before: OffsetDateTime?,private val onOrAfter: OffsetDateTime?,private val onOrBefore: OffsetDateTime?,private val additionalProperties: Map<String, List<String>>,) {

        private var hashCode: Int = 0

        /**
         * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
         * timestamp.
         */
        fun after(): OffsetDateTime? = after

        /**
         * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
         * timestamp.
         */
        fun before(): OffsetDateTime? = before

        /**
         * Return results on or after this
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
         */
        fun onOrAfter(): OffsetDateTime? = onOrAfter

        /**
         * Return results on or before this
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
         */
        fun onOrBefore(): OffsetDateTime? = onOrBefore

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
          this.after?.let {
              putParam("after", listOf(it.toString()))
          }
          this.before?.let {
              putParam("before", listOf(it.toString()))
          }
          this.onOrAfter?.let {
              putParam("on_or_after", listOf(it.toString()))
          }
          this.onOrBefore?.let {
              putParam("on_or_before", listOf(it.toString()))
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

          return other is CreatedAt &&
              this.after == other.after &&
              this.before == other.before &&
              this.onOrAfter == other.onOrAfter &&
              this.onOrBefore == other.onOrBefore &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                after,
                before,
                onOrAfter,
                onOrBefore,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "CreatedAt{after=$after, before=$before, onOrAfter=$onOrAfter, onOrBefore=$onOrBefore, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var after: OffsetDateTime? = null
            private var before: OffsetDateTime? = null
            private var onOrAfter: OffsetDateTime? = null
            private var onOrBefore: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            @JvmSynthetic
            internal fun from(createdAt: CreatedAt) = apply {
                this.after = createdAt.after
                this.before = createdAt.before
                this.onOrAfter = createdAt.onOrAfter
                this.onOrBefore = createdAt.onOrBefore
                additionalProperties(createdAt.additionalProperties)
            }

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun after(after: OffsetDateTime) = apply {
                this.after = after
            }

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun before(before: OffsetDateTime) = apply {
                this.before = before
            }

            /**
             * Return results on or after this
             * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
             */
            fun onOrAfter(onOrAfter: OffsetDateTime) = apply {
                this.onOrAfter = onOrAfter
            }

            /**
             * Return results on or before this
             * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
             */
            fun onOrBefore(onOrBefore: OffsetDateTime) = apply {
                this.onOrBefore = onOrBefore
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

            fun build(): CreatedAt = CreatedAt(
                after,
                before,
                onOrAfter,
                onOrBefore,
                additionalProperties.toUnmodifiable(),
            )
        }
    }
}
