// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.Program
import com.increase.api.models.ProgramListPage
import com.increase.api.models.ProgramListParams
import com.increase.api.models.ProgramRetrieveParams

interface ProgramService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Program */
    @JvmOverloads
    fun retrieve(
        params: ProgramRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Program

    /** List Programs */
    @JvmOverloads
    fun list(
        params: ProgramListParams = ProgramListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProgramListPage

    /** List Programs */
    fun list(requestOptions: RequestOptions): ProgramListPage =
        list(ProgramListParams.none(), requestOptions)

    /** A view of [ProgramService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /programs/{program_id}`, but is otherwise the same
         * as [ProgramService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ProgramRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Program>

        /**
         * Returns a raw HTTP response for `get /programs`, but is otherwise the same as
         * [ProgramService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ProgramListParams = ProgramListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProgramListPage>

        /**
         * Returns a raw HTTP response for `get /programs`, but is otherwise the same as
         * [ProgramService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProgramListPage> =
            list(ProgramListParams.none(), requestOptions)
    }
}
