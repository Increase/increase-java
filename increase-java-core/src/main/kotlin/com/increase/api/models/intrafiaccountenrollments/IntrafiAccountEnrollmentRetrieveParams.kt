// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiaccountenrollments

import com.increase.api.core.Params
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get an IntraFi Account Enrollment */
class IntrafiAccountEnrollmentRetrieveParams
private constructor(
    private val intrafiAccountEnrollmentId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the IntraFi Account Enrollment to retrieve. */
    fun intrafiAccountEnrollmentId(): Optional<String> =
        Optional.ofNullable(intrafiAccountEnrollmentId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): IntrafiAccountEnrollmentRetrieveParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [IntrafiAccountEnrollmentRetrieveParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IntrafiAccountEnrollmentRetrieveParams]. */
    class Builder internal constructor() {

        private var intrafiAccountEnrollmentId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            intrafiAccountEnrollmentRetrieveParams: IntrafiAccountEnrollmentRetrieveParams
        ) = apply {
            intrafiAccountEnrollmentId =
                intrafiAccountEnrollmentRetrieveParams.intrafiAccountEnrollmentId
            additionalHeaders = intrafiAccountEnrollmentRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                intrafiAccountEnrollmentRetrieveParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the IntraFi Account Enrollment to retrieve. */
        fun intrafiAccountEnrollmentId(intrafiAccountEnrollmentId: String?) = apply {
            this.intrafiAccountEnrollmentId = intrafiAccountEnrollmentId
        }

        /**
         * Alias for calling [Builder.intrafiAccountEnrollmentId] with
         * `intrafiAccountEnrollmentId.orElse(null)`.
         */
        fun intrafiAccountEnrollmentId(intrafiAccountEnrollmentId: Optional<String>) =
            intrafiAccountEnrollmentId(intrafiAccountEnrollmentId.getOrNull())

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
         * Returns an immutable instance of [IntrafiAccountEnrollmentRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): IntrafiAccountEnrollmentRetrieveParams =
            IntrafiAccountEnrollmentRetrieveParams(
                intrafiAccountEnrollmentId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> intrafiAccountEnrollmentId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IntrafiAccountEnrollmentRetrieveParams &&
            intrafiAccountEnrollmentId == other.intrafiAccountEnrollmentId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(intrafiAccountEnrollmentId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "IntrafiAccountEnrollmentRetrieveParams{intrafiAccountEnrollmentId=$intrafiAccountEnrollmentId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
