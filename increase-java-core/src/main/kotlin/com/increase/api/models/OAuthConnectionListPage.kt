// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.services.blocking.OAuthConnectionService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport

class OAuthConnectionListPage
private constructor(
    private val oauthConnectionsService: OAuthConnectionService,
    private val params: OAuthConnectionListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<OAuthConnection> = response().data()

    fun nextCursor(): Optional<String> = response().nextCursor()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OAuthConnectionListPage &&
            this.oauthConnectionsService == other.oauthConnectionsService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            oauthConnectionsService,
            params,
            response,
        )
    }

    override fun toString() =
        "OAuthConnectionListPage{oauthConnectionsService=$oauthConnectionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextCursor().isPresent()
    }

    fun getNextPageParams(): Optional<OAuthConnectionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            OAuthConnectionListParams.builder()
                .from(params)
                .apply { nextCursor().ifPresent { this.cursor(it) } }
                .build()
        )
    }

    fun getNextPage(): Optional<OAuthConnectionListPage> {
        return getNextPageParams().map { oauthConnectionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            oauthConnectionsService: OAuthConnectionService,
            params: OAuthConnectionListParams,
            response: Response
        ) =
            OAuthConnectionListPage(
                oauthConnectionsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val data: JsonField<List<OAuthConnection>>,
        private val nextCursor: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun data(): List<OAuthConnection> = data.getNullable("data") ?: listOf()

        fun nextCursor(): Optional<String> =
            Optional.ofNullable(nextCursor.getNullable("next_cursor"))

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<OAuthConnection>>> = Optional.ofNullable(data)

        @JsonProperty("next_cursor")
        fun _nextCursor(): Optional<JsonField<String>> = Optional.ofNullable(nextCursor)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                data().map { it.validate() }
                nextCursor()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                this.data == other.data &&
                this.nextCursor == other.nextCursor &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(
                data,
                nextCursor,
                additionalProperties,
            )
        }

        override fun toString() =
            "OAuthConnectionListPage.Response{data=$data, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<OAuthConnection>> = JsonMissing.of()
            private var nextCursor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextCursor = page.nextCursor
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<OAuthConnection>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<OAuthConnection>>) = apply { this.data = data }

            fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

            @JsonProperty("next_cursor")
            fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    data,
                    nextCursor,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: OAuthConnectionListPage,
    ) : Iterable<OAuthConnection> {

        override fun iterator(): Iterator<OAuthConnection> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().orElse(null) ?: break
                index = 0
            }
        }

        fun stream(): Stream<OAuthConnection> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
