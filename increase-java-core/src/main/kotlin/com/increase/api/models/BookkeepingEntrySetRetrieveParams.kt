// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.models.*
import java.util.Objects

class BookkeepingEntrySetRetrieveParams
constructor(
    private val bookkeepingEntrySetId: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun bookkeepingEntrySetId(): String = bookkeepingEntrySetId

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> bookkeepingEntrySetId
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BookkeepingEntrySetRetrieveParams &&
            this.bookkeepingEntrySetId == other.bookkeepingEntrySetId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            bookkeepingEntrySetId,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "BookkeepingEntrySetRetrieveParams{bookkeepingEntrySetId=$bookkeepingEntrySetId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var bookkeepingEntrySetId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bookkeepingEntrySetRetrieveParams: BookkeepingEntrySetRetrieveParams) =
            apply {
                this.bookkeepingEntrySetId = bookkeepingEntrySetRetrieveParams.bookkeepingEntrySetId
                additionalQueryParams(bookkeepingEntrySetRetrieveParams.additionalQueryParams)
                additionalHeaders(bookkeepingEntrySetRetrieveParams.additionalHeaders)
            }

        /** The identifier of the Bookkeeping Entry Set. */
        fun bookkeepingEntrySetId(bookkeepingEntrySetId: String) = apply {
            this.bookkeepingEntrySetId = bookkeepingEntrySetId
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

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): BookkeepingEntrySetRetrieveParams =
            BookkeepingEntrySetRetrieveParams(
                checkNotNull(bookkeepingEntrySetId) {
                    "`bookkeepingEntrySetId` is required but was not set"
                },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
