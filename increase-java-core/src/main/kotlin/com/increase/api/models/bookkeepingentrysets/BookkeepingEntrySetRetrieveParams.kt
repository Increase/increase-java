// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentrysets

import com.increase.api.core.Params
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve a Bookkeeping Entry Set */
class BookkeepingEntrySetRetrieveParams
private constructor(
    private val bookkeepingEntrySetId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the Bookkeeping Entry Set. */
    fun bookkeepingEntrySetId(): Optional<String> = Optional.ofNullable(bookkeepingEntrySetId)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BookkeepingEntrySetRetrieveParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [BookkeepingEntrySetRetrieveParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BookkeepingEntrySetRetrieveParams]. */
    class Builder internal constructor() {

        private var bookkeepingEntrySetId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(bookkeepingEntrySetRetrieveParams: BookkeepingEntrySetRetrieveParams) =
            apply {
                bookkeepingEntrySetId = bookkeepingEntrySetRetrieveParams.bookkeepingEntrySetId
                additionalHeaders = bookkeepingEntrySetRetrieveParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    bookkeepingEntrySetRetrieveParams.additionalQueryParams.toBuilder()
            }

        /** The identifier of the Bookkeeping Entry Set. */
        fun bookkeepingEntrySetId(bookkeepingEntrySetId: String?) = apply {
            this.bookkeepingEntrySetId = bookkeepingEntrySetId
        }

        /**
         * Alias for calling [Builder.bookkeepingEntrySetId] with
         * `bookkeepingEntrySetId.orElse(null)`.
         */
        fun bookkeepingEntrySetId(bookkeepingEntrySetId: Optional<String>) =
            bookkeepingEntrySetId(bookkeepingEntrySetId.getOrNull())

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
         * Returns an immutable instance of [BookkeepingEntrySetRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BookkeepingEntrySetRetrieveParams =
            BookkeepingEntrySetRetrieveParams(
                bookkeepingEntrySetId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> bookkeepingEntrySetId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookkeepingEntrySetRetrieveParams && bookkeepingEntrySetId == other.bookkeepingEntrySetId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(bookkeepingEntrySetId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BookkeepingEntrySetRetrieveParams{bookkeepingEntrySetId=$bookkeepingEntrySetId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
