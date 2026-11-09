// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkbookchecks

import com.increase.api.core.Params
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List Checkbook Checks */
class CheckbookCheckListParams
private constructor(
    private val accountNumberId: String?,
    private val checkNumber: Long?,
    private val checkbookId: String?,
    private val cursor: String?,
    private val limit: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter Checkbook Checks to those drawn on the specified Account Number. */
    fun accountNumberId(): Optional<String> = Optional.ofNullable(accountNumberId)

    /** Filter Checkbook Checks to the one with the specified check number. */
    fun checkNumber(): Optional<Long> = Optional.ofNullable(checkNumber)

    /** Filter Checkbook Checks to those belonging to the specified Checkbook. */
    fun checkbookId(): Optional<String> = Optional.ofNullable(checkbookId)

    /** Return the page of entries after this one. */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /**
     * Limit the size of the list that is returned. The default (and maximum) is 100 objects.
     *
     * Defaults to `100`.
     */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CheckbookCheckListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CheckbookCheckListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CheckbookCheckListParams]. */
    class Builder internal constructor() {

        private var accountNumberId: String? = null
        private var checkNumber: Long? = null
        private var checkbookId: String? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(checkbookCheckListParams: CheckbookCheckListParams) = apply {
            accountNumberId = checkbookCheckListParams.accountNumberId
            checkNumber = checkbookCheckListParams.checkNumber
            checkbookId = checkbookCheckListParams.checkbookId
            cursor = checkbookCheckListParams.cursor
            limit = checkbookCheckListParams.limit
            additionalHeaders = checkbookCheckListParams.additionalHeaders.toBuilder()
            additionalQueryParams = checkbookCheckListParams.additionalQueryParams.toBuilder()
        }

        /** Filter Checkbook Checks to those drawn on the specified Account Number. */
        fun accountNumberId(accountNumberId: String?) = apply {
            this.accountNumberId = accountNumberId
        }

        /** Alias for calling [Builder.accountNumberId] with `accountNumberId.orElse(null)`. */
        fun accountNumberId(accountNumberId: Optional<String>) =
            accountNumberId(accountNumberId.getOrNull())

        /** Filter Checkbook Checks to the one with the specified check number. */
        fun checkNumber(checkNumber: Long?) = apply { this.checkNumber = checkNumber }

        /**
         * Alias for [Builder.checkNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun checkNumber(checkNumber: Long) = checkNumber(checkNumber as Long?)

        /** Alias for calling [Builder.checkNumber] with `checkNumber.orElse(null)`. */
        fun checkNumber(checkNumber: Optional<Long>) = checkNumber(checkNumber.getOrNull())

        /** Filter Checkbook Checks to those belonging to the specified Checkbook. */
        fun checkbookId(checkbookId: String?) = apply { this.checkbookId = checkbookId }

        /** Alias for calling [Builder.checkbookId] with `checkbookId.orElse(null)`. */
        fun checkbookId(checkbookId: Optional<String>) = checkbookId(checkbookId.getOrNull())

        /** Return the page of entries after this one. */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100 objects.
         *
         * Defaults to `100`.
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
         * Returns an immutable instance of [CheckbookCheckListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CheckbookCheckListParams =
            CheckbookCheckListParams(
                accountNumberId,
                checkNumber,
                checkbookId,
                cursor,
                limit,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                accountNumberId?.let { put("account_number_id", it) }
                checkNumber?.let { put("check_number", it.toString()) }
                checkbookId?.let { put("checkbook_id", it) }
                cursor?.let { put("cursor", it) }
                limit?.let { put("limit", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CheckbookCheckListParams &&
            accountNumberId == other.accountNumberId &&
            checkNumber == other.checkNumber &&
            checkbookId == other.checkbookId &&
            cursor == other.cursor &&
            limit == other.limit &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            accountNumberId,
            checkNumber,
            checkbookId,
            cursor,
            limit,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CheckbookCheckListParams{accountNumberId=$accountNumberId, checkNumber=$checkNumber, checkbookId=$checkbookId, cursor=$cursor, limit=$limit, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
