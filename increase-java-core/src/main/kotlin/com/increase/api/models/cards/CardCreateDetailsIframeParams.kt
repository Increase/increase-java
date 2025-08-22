// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cards

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.Params
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create an iframe URL for a Card to display the card details. More details about styling and usage
 * can be found in the [documentation](/documentation/embedded-card-component).
 */
class CardCreateDetailsIframeParams
private constructor(
    private val cardId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the Card to retrieve details for. */
    fun cardId(): Optional<String> = Optional.ofNullable(cardId)

    /**
     * The identifier of the Physical Card to retrieve details for.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun physicalCardId(): Optional<String> = body.physicalCardId()

    /**
     * Returns the raw JSON value of [physicalCardId].
     *
     * Unlike [physicalCardId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _physicalCardId(): JsonField<String> = body._physicalCardId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CardCreateDetailsIframeParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [CardCreateDetailsIframeParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardCreateDetailsIframeParams]. */
    class Builder internal constructor() {

        private var cardId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cardCreateDetailsIframeParams: CardCreateDetailsIframeParams) = apply {
            cardId = cardCreateDetailsIframeParams.cardId
            body = cardCreateDetailsIframeParams.body.toBuilder()
            additionalHeaders = cardCreateDetailsIframeParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardCreateDetailsIframeParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the Card to retrieve details for. */
        fun cardId(cardId: String?) = apply { this.cardId = cardId }

        /** Alias for calling [Builder.cardId] with `cardId.orElse(null)`. */
        fun cardId(cardId: Optional<String>) = cardId(cardId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [physicalCardId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The identifier of the Physical Card to retrieve details for. */
        fun physicalCardId(physicalCardId: String) = apply { body.physicalCardId(physicalCardId) }

        /**
         * Sets [Builder.physicalCardId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.physicalCardId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun physicalCardId(physicalCardId: JsonField<String>) = apply {
            body.physicalCardId(physicalCardId)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAlladditional_body_properties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAlladditional_body_properties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAlladditional_body_properties(keys: Set<String>) = apply {
            body.removeAlladditional_body_properties(keys)
        }

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
         * Returns an immutable instance of [CardCreateDetailsIframeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CardCreateDetailsIframeParams =
            CardCreateDetailsIframeParams(
                cardId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> cardId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val physicalCardId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("physical_card_id")
            @ExcludeMissing
            physicalCardId: JsonField<String> = JsonMissing.of()
        ) : this(physicalCardId, mutableMapOf())

        /**
         * The identifier of the Physical Card to retrieve details for.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun physicalCardId(): Optional<String> = physicalCardId.getOptional("physical_card_id")

        /**
         * Returns the raw JSON value of [physicalCardId].
         *
         * Unlike [physicalCardId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("physical_card_id")
        @ExcludeMissing
        fun _physicalCardId(): JsonField<String> = physicalCardId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var physicalCardId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                physicalCardId = body.physicalCardId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The identifier of the Physical Card to retrieve details for. */
            fun physicalCardId(physicalCardId: String) =
                physicalCardId(JsonField.of(physicalCardId))

            /**
             * Sets [Builder.physicalCardId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.physicalCardId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun physicalCardId(physicalCardId: JsonField<String>) = apply {
                this.physicalCardId = physicalCardId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body = Body(physicalCardId, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            physicalCardId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int = (if (physicalCardId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                physicalCardId == other.physicalCardId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(physicalCardId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{physicalCardId=$physicalCardId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardCreateDetailsIframeParams &&
            cardId == other.cardId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(cardId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CardCreateDetailsIframeParams{cardId=$cardId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
