// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

class BookkeepingAccountBalanceParams
constructor(
    private val bookkeepingAccountId: String,
    private val atTime: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun bookkeepingAccountId(): String = bookkeepingAccountId

    fun atTime(): Optional<OffsetDateTime> = Optional.ofNullable(atTime)

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.atTime?.let {
            queryParams.put("at_time", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> bookkeepingAccountId
            else -> ""
        }
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookkeepingAccountBalanceParams && this.bookkeepingAccountId == other.bookkeepingAccountId && this.atTime == other.atTime && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(bookkeepingAccountId, atTime, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "BookkeepingAccountBalanceParams{bookkeepingAccountId=$bookkeepingAccountId, atTime=$atTime, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var bookkeepingAccountId: String? = null
        private var atTime: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(bookkeepingAccountBalanceParams: BookkeepingAccountBalanceParams) =
            apply {
                this.bookkeepingAccountId = bookkeepingAccountBalanceParams.bookkeepingAccountId
                this.atTime = bookkeepingAccountBalanceParams.atTime
                additionalHeaders(bookkeepingAccountBalanceParams.additionalHeaders)
                additionalQueryParams(bookkeepingAccountBalanceParams.additionalQueryParams)
            }

        /** The identifier of the Bookkeeping Account to retrieve. */
        fun bookkeepingAccountId(bookkeepingAccountId: String) = apply {
            this.bookkeepingAccountId = bookkeepingAccountId
        }

        /** The moment to query the balance at. If not set, returns the current balances. */
        fun atTime(atTime: OffsetDateTime) = apply { this.atTime = atTime }

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

        fun build(): BookkeepingAccountBalanceParams =
            BookkeepingAccountBalanceParams(
                checkNotNull(bookkeepingAccountId) {
                    "`bookkeepingAccountId` is required but was not set"
                },
                atTime,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }
}
