// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequestsubmissions

import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Params
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List Proof of Authorization Request Submissions */
class ProofOfAuthorizationRequestSubmissionListParams
private constructor(
    private val cursor: String?,
    private val idempotencyKey: String?,
    private val limit: Long?,
    private val proofOfAuthorizationRequestId: String?,
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

    /** ID of the proof of authorization request. */
    fun proofOfAuthorizationRequestId(): Optional<String> =
        Optional.ofNullable(proofOfAuthorizationRequestId)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.cursor?.let { queryParams.put("cursor", listOf(it.toString())) }
        this.idempotencyKey?.let { queryParams.put("idempotency_key", listOf(it.toString())) }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.proofOfAuthorizationRequestId?.let {
            queryParams.put("proof_of_authorization_request_id", listOf(it.toString()))
        }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ProofOfAuthorizationRequestSubmissionListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ProofOfAuthorizationRequestSubmissionListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProofOfAuthorizationRequestSubmissionListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var cursor: String? = null
        private var idempotencyKey: String? = null
        private var limit: Long? = null
        private var proofOfAuthorizationRequestId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            proofOfAuthorizationRequestSubmissionListParams:
                ProofOfAuthorizationRequestSubmissionListParams
        ) = apply {
            cursor = proofOfAuthorizationRequestSubmissionListParams.cursor
            idempotencyKey = proofOfAuthorizationRequestSubmissionListParams.idempotencyKey
            limit = proofOfAuthorizationRequestSubmissionListParams.limit
            proofOfAuthorizationRequestId =
                proofOfAuthorizationRequestSubmissionListParams.proofOfAuthorizationRequestId
            additionalHeaders =
                proofOfAuthorizationRequestSubmissionListParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                proofOfAuthorizationRequestSubmissionListParams.additionalQueryParams.toBuilder()
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

        /** ID of the proof of authorization request. */
        fun proofOfAuthorizationRequestId(proofOfAuthorizationRequestId: String?) = apply {
            this.proofOfAuthorizationRequestId = proofOfAuthorizationRequestId
        }

        /**
         * Alias for calling [Builder.proofOfAuthorizationRequestId] with
         * `proofOfAuthorizationRequestId.orElse(null)`.
         */
        fun proofOfAuthorizationRequestId(proofOfAuthorizationRequestId: Optional<String>) =
            proofOfAuthorizationRequestId(proofOfAuthorizationRequestId.getOrNull())

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

        fun build(): ProofOfAuthorizationRequestSubmissionListParams =
            ProofOfAuthorizationRequestSubmissionListParams(
                cursor,
                idempotencyKey,
                limit,
                proofOfAuthorizationRequestId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProofOfAuthorizationRequestSubmissionListParams && cursor == other.cursor && idempotencyKey == other.idempotencyKey && limit == other.limit && proofOfAuthorizationRequestId == other.proofOfAuthorizationRequestId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cursor, idempotencyKey, limit, proofOfAuthorizationRequestId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ProofOfAuthorizationRequestSubmissionListParams{cursor=$cursor, idempotencyKey=$idempotencyKey, limit=$limit, proofOfAuthorizationRequestId=$proofOfAuthorizationRequestId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
