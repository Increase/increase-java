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
import org.apache.hc.core5.http.ContentType
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
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.MultipartFormValue
import com.increase.api.core.toUnmodifiable
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Enum
import com.increase.api.core.ContentTypes
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*

class SupplementalDocumentListParams constructor(
  private val entityId: String,
  private val cursor: String?,
  private val idempotencyKey: String?,
  private val limit: Long?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,

) {

    fun entityId(): String = entityId

    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun idempotencyKey(): Optional<String> = Optional.ofNullable(idempotencyKey)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
      val params = mutableMapOf<String, List<String>>()
      this.entityId.let {
          params.put("entity_id", listOf(it.toString()))
      }
      this.cursor?.let {
          params.put("cursor", listOf(it.toString()))
      }
      this.idempotencyKey?.let {
          params.put("idempotency_key", listOf(it.toString()))
      }
      this.limit?.let {
          params.put("limit", listOf(it.toString()))
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

      return other is SupplementalDocumentListParams &&
          this.entityId == other.entityId &&
          this.cursor == other.cursor &&
          this.idempotencyKey == other.idempotencyKey &&
          this.limit == other.limit &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
      return Objects.hash(
          entityId,
          cursor,
          idempotencyKey,
          limit,
          additionalQueryParams,
          additionalHeaders,
      )
    }

    override fun toString() = "SupplementalDocumentListParams{entityId=$entityId, cursor=$cursor, idempotencyKey=$idempotencyKey, limit=$limit, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var entityId: String? = null
        private var cursor: String? = null
        private var idempotencyKey: String? = null
        private var limit: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(supplementalDocumentListParams: SupplementalDocumentListParams) = apply {
            this.entityId = supplementalDocumentListParams.entityId
            this.cursor = supplementalDocumentListParams.cursor
            this.idempotencyKey = supplementalDocumentListParams.idempotencyKey
            this.limit = supplementalDocumentListParams.limit
            additionalQueryParams(supplementalDocumentListParams.additionalQueryParams)
            additionalHeaders(supplementalDocumentListParams.additionalHeaders)
        }

        /** The identifier of the Entity to list supplemental documents for. */
        fun entityId(entityId: String) = apply {
            this.entityId = entityId
        }

        /** Return the page of entries after this one. */
        fun cursor(cursor: String) = apply {
            this.cursor = cursor
        }

        /**
         * Filter records to the one with the specified `idempotency_key` you chose for
         * that object. This value is unique across Increase and is used to ensure that a
         * request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100
         * objects.
         */
        fun limit(limit: Long) = apply {
            this.limit = limit
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

        fun build(): SupplementalDocumentListParams = SupplementalDocumentListParams(
            checkNotNull(entityId) {
                "`entityId` is required but was not set"
            },
            cursor,
            idempotencyKey,
            limit,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
        )
    }
}
