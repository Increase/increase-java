// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiaccountenrollments

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.services.async.IntrafiAccountEnrollmentServiceAsync
import java.util.Collections
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** List IntraFi Account Enrollments */
class IntrafiAccountEnrollmentListPageAsync
private constructor(
    private val intrafiAccountEnrollmentsService: IntrafiAccountEnrollmentServiceAsync,
    private val params: IntrafiAccountEnrollmentListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<IntrafiAccountEnrollment> = response().data()

    fun nextCursor(): Optional<String> = response().nextCursor()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IntrafiAccountEnrollmentListPageAsync && intrafiAccountEnrollmentsService == other.intrafiAccountEnrollmentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(intrafiAccountEnrollmentsService, params, response) /* spotless:on */

    override fun toString() =
        "IntrafiAccountEnrollmentListPageAsync{intrafiAccountEnrollmentsService=$intrafiAccountEnrollmentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextCursor().isPresent
    }

    fun getNextPageParams(): Optional<IntrafiAccountEnrollmentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            IntrafiAccountEnrollmentListParams.builder()
                .from(params)
                .apply { nextCursor().ifPresent { this.cursor(it) } }
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<IntrafiAccountEnrollmentListPageAsync>> {
        return getNextPageParams()
            .map { intrafiAccountEnrollmentsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            intrafiAccountEnrollmentsService: IntrafiAccountEnrollmentServiceAsync,
            params: IntrafiAccountEnrollmentListParams,
            response: Response,
        ) =
            IntrafiAccountEnrollmentListPageAsync(
                intrafiAccountEnrollmentsService,
                params,
                response,
            )
    }

    class Response(
        private val data: JsonField<List<IntrafiAccountEnrollment>>,
        private val nextCursor: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            data: JsonField<List<IntrafiAccountEnrollment>> = JsonMissing.of(),
            @JsonProperty("next_cursor") nextCursor: JsonField<String> = JsonMissing.of(),
        ) : this(data, nextCursor, mutableMapOf())

        fun data(): List<IntrafiAccountEnrollment> = data.getNullable("data") ?: listOf()

        fun nextCursor(): Optional<String> =
            Optional.ofNullable(nextCursor.getNullable("next_cursor"))

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<IntrafiAccountEnrollment>>> = Optional.ofNullable(data)

        @JsonProperty("next_cursor")
        fun _nextCursor(): Optional<JsonField<String>> = Optional.ofNullable(nextCursor)

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            data().map { it.validate() }
            nextCursor()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && data == other.data && nextCursor == other.nextCursor && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(data, nextCursor, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{data=$data, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [IntrafiAccountEnrollmentListPageAsync].
             */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<IntrafiAccountEnrollment>> = JsonMissing.of()
            private var nextCursor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextCursor = page.nextCursor
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<IntrafiAccountEnrollment>) = data(JsonField.of(data))

            fun data(data: JsonField<List<IntrafiAccountEnrollment>>) = apply { this.data = data }

            fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

            fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            /**
             * Returns an immutable instance of [Response].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Response = Response(data, nextCursor, additionalProperties.toMutableMap())
        }
    }

    class AutoPager(private val firstPage: IntrafiAccountEnrollmentListPageAsync) {

        fun forEach(
            action: Predicate<IntrafiAccountEnrollment>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<IntrafiAccountEnrollmentListPageAsync>>.forEach(
                action: (IntrafiAccountEnrollment) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<IntrafiAccountEnrollment>> {
            val values = mutableListOf<IntrafiAccountEnrollment>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
