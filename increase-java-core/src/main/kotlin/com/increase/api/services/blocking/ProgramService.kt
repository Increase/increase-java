// File generated from our OpenAPI spec by Stainless.

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
    fun retrieve(params: ProgramRetrieveParams): Program = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ProgramRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Program

    /** List Programs */
    fun list(): ProgramListPage = list(ProgramListParams.none())

    /** @see [list] */
    fun list(
        params: ProgramListParams = ProgramListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProgramListPage

    /** @see [list] */
    fun list(params: ProgramListParams = ProgramListParams.none()): ProgramListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ProgramListPage =
        list(ProgramListParams.none(), requestOptions)

    /** A view of [ProgramService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /programs/{program_id}`, but is otherwise the same
         * as [ProgramService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ProgramRetrieveParams): HttpResponseFor<Program> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ProgramRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Program>

        /**
         * Returns a raw HTTP response for `get /programs`, but is otherwise the same as
         * [ProgramService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ProgramListPage> = list(ProgramListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProgramListParams = ProgramListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProgramListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProgramListParams = ProgramListParams.none()
        ): HttpResponseFor<ProgramListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProgramListPage> =
            list(ProgramListParams.none(), requestOptions)
    }
}
