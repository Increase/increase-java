// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentrysets

import com.increase.api.core.Params
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List Bookkeeping Entry Sets */
class BookkeepingEntrySetListParams
private constructor(
    private val cursor: String?,
    private val idempotencyKey: String?,
    private val limit: Long?,
    private val transactionId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Return the page of entries after this one. */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /**
     * Filter records to the one with the specified `idempotency_key` you chose for that object.
     * This value is unique across Increase and is used to ensure that a request is only processed
     * once. Learn more about [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> = Optional.ofNullable(idempotencyKey)

    /** Limit the size of the list that is returned. The default (and maximum) is 100 objects. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Filter to the Bookkeeping Entry Set that maps to this Transaction. */
    fun transactionId(): Optional<String> = Optional.ofNullable(transactionId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BookkeepingEntrySetListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [BookkeepingEntrySetListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BookkeepingEntrySetListParams]. */
    class Builder internal constructor() {

        private var cursor: String? = null
        private var idempotencyKey: String? = null
        private var limit: Long? = null
        private var transactionId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(bookkeepingEntrySetListParams: BookkeepingEntrySetListParams) = apply {
            cursor = bookkeepingEntrySetListParams.cursor
            idempotencyKey = bookkeepingEntrySetListParams.idempotencyKey
            limit = bookkeepingEntrySetListParams.limit
            transactionId = bookkeepingEntrySetListParams.transactionId
            additionalHeaders = bookkeepingEntrySetListParams.additionalHeaders.toBuilder()
            additionalQueryParams = bookkeepingEntrySetListParams.additionalQueryParams.toBuilder()
        }

        /** Return the page of entries after this one. */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /**
         * Filter records to the one with the specified `idempotency_key` you chose for that object.
         * This value is unique across Increase and is used to ensure that a request is only
         * processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) = apply { this.idempotencyKey = idempotencyKey }

        /** Alias for calling [Builder.idempotencyKey] with `idempotencyKey.orElse(null)`. */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.getOrNull())

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100 objects.
         */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Filter to the Bookkeeping Entry Set that maps to this Transaction. */
        fun transactionId(transactionId: String?) = apply { this.transactionId = transactionId }

        /** Alias for calling [Builder.transactionId] with `transactionId.orElse(null)`. */
        fun transactionId(transactionId: Optional<String>) =
            transactionId(transactionId.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [BookkeepingEntrySetListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BookkeepingEntrySetListParams =
            BookkeepingEntrySetListParams(
                cursor,
                idempotencyKey,
                limit,
                transactionId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                cursor?.let { put("cursor", it) }
                idempotencyKey?.let { put("idempotency_key", it) }
                limit?.let { put("limit", it.toString()) }
                transactionId?.let { put("transaction_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BookkeepingEntrySetListParams &&
            cursor == other.cursor &&
            idempotencyKey == other.idempotencyKey &&
            limit == other.limit &&
            transactionId == other.transactionId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            cursor,
            idempotencyKey,
            limit,
            transactionId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BookkeepingEntrySetListParams{cursor=$cursor, idempotencyKey=$idempotencyKey, limit=$limit, transactionId=$transactionId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
