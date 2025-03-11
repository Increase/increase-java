// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiexclusions

import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Params
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List IntraFi Exclusions */
class IntrafiExclusionListParams private constructor(
    private val cursor: String?,
    private val entityId: String?,
    private val idempotencyKey: String?,
    private val limit: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,

) : Params {

    /** Return the page of entries after this one. */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** Filter IntraFi Exclusions for those belonging to the specified Entity. */
    fun entityId(): Optional<String> = Optional.ofNullable(entityId)

    /**
     * Filter records to the one with the specified `idempotency_key` you chose for
     * that object. This value is unique across Increase and is used to ensure that a
     * request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> = Optional.ofNullable(idempotencyKey)

    /**
     * Limit the size of the list that is returned. The default (and maximum) is 100
     * objects.
     */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
      val queryParams = QueryParams.builder()
      this.cursor?.let {
          queryParams.put(
            "cursor", listOf(it.toString())
          )
      }
      this.entityId?.let {
          queryParams.put(
            "entity_id", listOf(it.toString())
          )
      }
      this.idempotencyKey?.let {
          queryParams.put(
            "idempotency_key", listOf(it.toString())
          )
      }
      this.limit?.let {
          queryParams.put(
            "limit", listOf(it.toString())
          )
      }
      queryParams.putAll(additionalQueryParams)
      return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun none(): IntrafiExclusionListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [IntrafiExclusionListParams].
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [IntrafiExclusionListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var cursor: String? = null
        private var entityId: String? = null
        private var idempotencyKey: String? = null
        private var limit: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(intrafiExclusionListParams: IntrafiExclusionListParams) =
            apply {
                cursor = intrafiExclusionListParams.cursor
                entityId = intrafiExclusionListParams.entityId
                idempotencyKey = intrafiExclusionListParams.idempotencyKey
                limit = intrafiExclusionListParams.limit
                additionalHeaders = intrafiExclusionListParams.additionalHeaders.toBuilder()
                additionalQueryParams = intrafiExclusionListParams.additionalQueryParams.toBuilder()
            }

        /** Return the page of entries after this one. */
        fun cursor(cursor: String?) =
            apply {
                this.cursor = cursor
            }

        /** Return the page of entries after this one. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /** Filter IntraFi Exclusions for those belonging to the specified Entity. */
        fun entityId(entityId: String?) =
            apply {
                this.entityId = entityId
            }

        /** Filter IntraFi Exclusions for those belonging to the specified Entity. */
        fun entityId(entityId: Optional<String>) = entityId(entityId.getOrNull())

        /**
         * Filter records to the one with the specified `idempotency_key` you chose for
         * that object. This value is unique across Increase and is used to ensure that a
         * request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) =
            apply {
                this.idempotencyKey = idempotencyKey
            }

        /**
         * Filter records to the one with the specified `idempotency_key` you chose for
         * that object. This value is unique across Increase and is used to ensure that a
         * request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: Optional<String>) = idempotencyKey(idempotencyKey.getOrNull())

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100
         * objects.
         */
        fun limit(limit: Long?) =
            apply {
                this.limit = limit
            }

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100
         * objects.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100
         * objects.
         */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

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

        fun build(): IntrafiExclusionListParams =
            IntrafiExclusionListParams(
              cursor,
              entityId,
              idempotencyKey,
              limit,
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is IntrafiExclusionListParams && cursor == other.cursor && entityId == other.entityId && idempotencyKey == other.idempotencyKey && limit == other.limit && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cursor, entityId, idempotencyKey, limit, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() = "IntrafiExclusionListParams{cursor=$cursor, entityId=$entityId, idempotencyKey=$idempotencyKey, limit=$limit, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
