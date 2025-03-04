// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.Program
import com.increase.api.models.ProgramListPageAsync
import com.increase.api.models.ProgramListParams
import com.increase.api.models.ProgramRetrieveParams
import java.util.concurrent.CompletableFuture

interface ProgramServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Program */
    @JvmOverloads
    fun retrieve(
        params: ProgramRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Program>

    /** List Programs */
    @JvmOverloads
    fun list(
        params: ProgramListParams = ProgramListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProgramListPageAsync>

    /** List Programs */
    fun list(requestOptions: RequestOptions): CompletableFuture<ProgramListPageAsync> =
        list(ProgramListParams.none(), requestOptions)

    /**
     * A view of [ProgramServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /programs/{program_id}`, but is otherwise the same
         * as [ProgramServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ProgramRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Program>>

        /**
         * Returns a raw HTTP response for `get /programs`, but is otherwise the same as
         * [ProgramServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ProgramListParams = ProgramListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProgramListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /programs`, but is otherwise the same as
         * [ProgramServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProgramListPageAsync>> =
            list(ProgramListParams.none(), requestOptions)
    }
}
