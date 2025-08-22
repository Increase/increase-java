// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiretransfers

import com.increase.api.core.Params
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve an Inbound Wire Transfer */
class InboundWireTransferRetrieveParams
private constructor(
    private val inboundWireTransferId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the Inbound Wire Transfer to get details for. */
    fun inboundWireTransferId(): Optional<String> = Optional.ofNullable(inboundWireTransferId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): InboundWireTransferRetrieveParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundWireTransferRetrieveParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundWireTransferRetrieveParams]. */
    class Builder internal constructor() {

        private var inboundWireTransferId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(inboundWireTransferRetrieveParams: InboundWireTransferRetrieveParams) =
            apply {
                inboundWireTransferId = inboundWireTransferRetrieveParams.inboundWireTransferId
                additionalHeaders = inboundWireTransferRetrieveParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    inboundWireTransferRetrieveParams.additionalQueryParams.toBuilder()
            }

        /** The identifier of the Inbound Wire Transfer to get details for. */
        fun inboundWireTransferId(inboundWireTransferId: String?) = apply {
            this.inboundWireTransferId = inboundWireTransferId
        }

        /**
         * Alias for calling [Builder.inboundWireTransferId] with
         * `inboundWireTransferId.orElse(null)`.
         */
        fun inboundWireTransferId(inboundWireTransferId: Optional<String>) =
            inboundWireTransferId(inboundWireTransferId.getOrNull())

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
         * Returns an immutable instance of [InboundWireTransferRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InboundWireTransferRetrieveParams =
            InboundWireTransferRetrieveParams(
                inboundWireTransferId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> inboundWireTransferId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundWireTransferRetrieveParams &&
            inboundWireTransferId == other.inboundWireTransferId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(inboundWireTransferId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InboundWireTransferRetrieveParams{inboundWireTransferId=$inboundWireTransferId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
