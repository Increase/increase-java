// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.files

import com.increase.api.services.blocking.FileService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Files */
class FileListPage
private constructor(
    private val filesService: FileService,
    private val params: FileListParams,
    private val response: FileListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): FileListPageResponse = response

    /**
     * Delegates to [FileListPageResponse], but gracefully handles missing data.
     *
     * @see [FileListPageResponse.data]
     */
    fun data(): List<File> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FileListPageResponse], but gracefully handles missing data.
     *
     * @see [FileListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FileListPage && filesService == other.filesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(filesService, params, response) /* spotless:on */

    override fun toString() =
        "FileListPage{filesService=$filesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<FileListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<FileListPage> {
        return getNextPageParams().map { filesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(filesService: FileService, params: FileListParams, response: FileListPageResponse) =
            FileListPage(filesService, params, response)
    }

    class AutoPager(private val firstPage: FileListPage) : Iterable<File> {

        override fun iterator(): Iterator<File> = iterator {
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

        fun stream(): Stream<File> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
