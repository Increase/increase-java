// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.programs

import com.increase.api.services.blocking.ProgramService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Programs */
class ProgramListPage
private constructor(
    private val programsService: ProgramService,
    private val params: ProgramListParams,
    private val response: ProgramListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ProgramListPageResponse = response

    /**
     * Delegates to [ProgramListPageResponse], but gracefully handles missing data.
     *
     * @see [ProgramListPageResponse.data]
     */
    fun data(): List<Program> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ProgramListPageResponse], but gracefully handles missing data.
     *
     * @see [ProgramListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProgramListPage && programsService == other.programsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(programsService, params, response) /* spotless:on */

    override fun toString() =
        "ProgramListPage{programsService=$programsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<ProgramListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<ProgramListPage> {
        return getNextPageParams().map { programsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            programsService: ProgramService,
            params: ProgramListParams,
            response: ProgramListPageResponse,
        ) = ProgramListPage(programsService, params, response)
    }

    class AutoPager(private val firstPage: ProgramListPage) : Iterable<Program> {

        override fun iterator(): Iterator<Program> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<Program> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
