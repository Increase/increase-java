// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentries

import com.increase.api.core.Params
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve a Bookkeeping Entry */
class BookkeepingEntryRetrieveParams
private constructor(
    private val bookkeepingEntryId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the Bookkeeping Entry. */
    fun bookkeepingEntryId(): Optional<String> = Optional.ofNullable(bookkeepingEntryId)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BookkeepingEntryRetrieveParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [BookkeepingEntryRetrieveParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BookkeepingEntryRetrieveParams]. */
    class Builder internal constructor() {

        private var bookkeepingEntryId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(bookkeepingEntryRetrieveParams: BookkeepingEntryRetrieveParams) = apply {
            bookkeepingEntryId = bookkeepingEntryRetrieveParams.bookkeepingEntryId
            additionalHeaders = bookkeepingEntryRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = bookkeepingEntryRetrieveParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the Bookkeeping Entry. */
        fun bookkeepingEntryId(bookkeepingEntryId: String?) = apply {
            this.bookkeepingEntryId = bookkeepingEntryId
        }

        /**
         * Alias for calling [Builder.bookkeepingEntryId] with `bookkeepingEntryId.orElse(null)`.
         */
        fun bookkeepingEntryId(bookkeepingEntryId: Optional<String>) =
            bookkeepingEntryId(bookkeepingEntryId.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [BookkeepingEntryRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BookkeepingEntryRetrieveParams =
            BookkeepingEntryRetrieveParams(
                bookkeepingEntryId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> bookkeepingEntryId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookkeepingEntryRetrieveParams && bookkeepingEntryId == other.bookkeepingEntryId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(bookkeepingEntryId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BookkeepingEntryRetrieveParams{bookkeepingEntryId=$bookkeepingEntryId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
