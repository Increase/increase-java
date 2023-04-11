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

class DocumentListParams constructor(private val cursor: String?,private val limit: Long?,private val entityId: String?,private val category: Category?,private val createdAt: CreatedAt?,private val additionalQueryParams: Map<String, List<String>>,private val additionalHeaders: Map<String, List<String>>,) {

    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun entityId(): Optional<String> = Optional.ofNullable(entityId)

    fun category(): Optional<Category> = Optional.ofNullable(category)

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
      this.entityId?.let {
          params.put("entity_id", listOf(it.toString()))
      }
      this.category?.forEachQueryParam { key, values -> 
          params.put("category.$key", values)
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

      return other is DocumentListParams &&
          this.cursor == other.cursor &&
          this.limit == other.limit &&
          this.entityId == other.entityId &&
          this.category == other.category &&
          this.createdAt == other.createdAt &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
      return Objects.hash(
          cursor,
          limit,
          entityId,
          category,
          createdAt,
          additionalQueryParams,
          additionalHeaders,
      )
    }

    override fun toString() = "DocumentListParams{cursor=$cursor, limit=$limit, entityId=$entityId, category=$category, createdAt=$createdAt, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

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
        private var category: Category? = null
        private var createdAt: CreatedAt? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(documentListParams: DocumentListParams) = apply {
            this.cursor = documentListParams.cursor
            this.limit = documentListParams.limit
            this.entityId = documentListParams.entityId
            this.category = documentListParams.category
            this.createdAt = documentListParams.createdAt
            additionalQueryParams(documentListParams.additionalQueryParams)
            additionalHeaders(documentListParams.additionalHeaders)
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

        /** Filter Documents to ones belonging to the specified Entity. */
        fun entityId(entityId: String) = apply {
            this.entityId = entityId
        }

        fun category(category: Category) = apply {
            this.category = category
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

        fun build(): DocumentListParams = DocumentListParams(
            cursor,
            limit,
            entityId,
            category,
            createdAt,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
        )
    }

    @JsonDeserialize(builder = Category.Builder::class)
    @NoAutoDetect
    class Category private constructor(private val in_: List<In>?,private val additionalProperties: Map<String, List<String>>,) {

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

          return other is Category &&
              this.in_ == other.in_ &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(in_, additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "Category{in_=$in_, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var in_: List<In>? = null
            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            @JvmSynthetic
            internal fun from(category: Category) = apply {
                this.in_ = category.in_
                additionalProperties(category.additionalProperties)
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

            fun build(): Category = Category(in_?.toUnmodifiable(), additionalProperties.toUnmodifiable())
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

                @JvmField val FORM_1099_INT = In(JsonField.of("form_1099_int"))

                @JvmStatic fun of(value: String) = In(JsonField.of(value))
            }

            enum class Known {
                FORM_1099_INT,
            }

            enum class Value {
                FORM_1099_INT,
                _UNKNOWN,
            }

            fun value(): Value = when (this) {
                FORM_1099_INT -> Value.FORM_1099_INT
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                FORM_1099_INT -> Known.FORM_1099_INT
                else -> throw IncreaseInvalidDataException("Unknown In: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }
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
