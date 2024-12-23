// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.increase.api.core.Enum
import com.increase.api.core.JsonField
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects
import java.util.Optional

class OAuthConnectionListParams
constructor(
    private val cursor: String?,
    private val limit: Long?,
    private val oauthApplicationId: String?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun oauthApplicationId(): Optional<String> = Optional.ofNullable(oauthApplicationId)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.cursor?.let { queryParams.put("cursor", listOf(it.toString())) }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.oauthApplicationId?.let {
            queryParams.put("oauth_application_id", listOf(it.toString()))
        }
        this.status?.forEachQueryParam { key, values -> queryParams.put("status.$key", values) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cursor: String? = null
        private var limit: Long? = null
        private var oauthApplicationId: String? = null
        private var status: Status? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(oauthConnectionListParams: OAuthConnectionListParams) = apply {
            cursor = oauthConnectionListParams.cursor
            limit = oauthConnectionListParams.limit
            oauthApplicationId = oauthConnectionListParams.oauthApplicationId
            status = oauthConnectionListParams.status
            additionalHeaders = oauthConnectionListParams.additionalHeaders.toBuilder()
            additionalQueryParams = oauthConnectionListParams.additionalQueryParams.toBuilder()
        }

        /** Return the page of entries after this one. */
        fun cursor(cursor: String) = apply { this.cursor = cursor }

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100 objects.
         */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Filter results to only include OAuth Connections for a specific OAuth Application. */
        fun oauthApplicationId(oauthApplicationId: String) = apply {
            this.oauthApplicationId = oauthApplicationId
        }

        fun status(status: Status) = apply { this.status = status }

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

        fun build(): OAuthConnectionListParams =
            OAuthConnectionListParams(
                cursor,
                limit,
                oauthApplicationId,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Status
    private constructor(
        private val in_: List<In>?,
        private val additionalProperties: QueryParams,
    ) {

        /**
         * Filter to OAuth Connections by their status. By default, return only the `active` ones.
         * For GET requests, this should be encoded as a comma-delimited string, such as
         * `?in=one,two,three`.
         */
        fun in_(): Optional<List<In>> = Optional.ofNullable(in_)

        fun _additionalProperties(): QueryParams = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.in_?.let { putParam("in", listOf(it.joinToString(separator = ","))) }
            additionalProperties.keys().forEach { putParam(it, additionalProperties.values(it)) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var in_: List<In>? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(status: Status) = apply {
                in_ = status.in_?.toMutableList()
                additionalProperties = status.additionalProperties.toBuilder()
            }

            /**
             * Filter to OAuth Connections by their status. By default, return only the `active`
             * ones. For GET requests, this should be encoded as a comma-delimited string, such as
             * `?in=one,two,three`.
             */
            fun in_(in_: List<In>) = apply { this.in_ = in_ }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            fun build(): Status = Status(in_?.toImmutable(), additionalProperties.build())
        }

        class In
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ACTIVE = of("active")

                @JvmField val INACTIVE = of("inactive")

                @JvmStatic fun of(value: String) = In(JsonField.of(value))
            }

            enum class Known {
                ACTIVE,
                INACTIVE,
            }

            enum class Value {
                ACTIVE,
                INACTIVE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACTIVE -> Value.ACTIVE
                    INACTIVE -> Value.INACTIVE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACTIVE -> Known.ACTIVE
                    INACTIVE -> Known.INACTIVE
                    else -> throw IncreaseInvalidDataException("Unknown In: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is In && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && in_ == other.in_ && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(in_, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Status{in_=$in_, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OAuthConnectionListParams && cursor == other.cursor && limit == other.limit && oauthApplicationId == other.oauthApplicationId && status == other.status && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cursor, limit, oauthApplicationId, status, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "OAuthConnectionListParams{cursor=$cursor, limit=$limit, oauthApplicationId=$oauthApplicationId, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
