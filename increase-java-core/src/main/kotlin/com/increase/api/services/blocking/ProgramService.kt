// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.programs.Program
import com.increase.api.models.programs.ProgramListParams
import com.increase.api.models.programs.ProgramListResponse
import com.increase.api.models.programs.ProgramRetrieveParams
import java.util.function.Consumer

interface ProgramService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProgramService

    /** Retrieve a Program */
    fun retrieve(programId: String): Program = retrieve(programId, ProgramRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        programId: String,
        params: ProgramRetrieveParams = ProgramRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Program = retrieve(params.toBuilder().programId(programId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        programId: String,
        params: ProgramRetrieveParams = ProgramRetrieveParams.none(),
    ): Program = retrieve(programId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ProgramRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Program

    /** @see retrieve */
    fun retrieve(params: ProgramRetrieveParams): Program = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(programId: String, requestOptions: RequestOptions): Program =
        retrieve(programId, ProgramRetrieveParams.none(), requestOptions)

    /** List Programs */
    fun list(): ProgramListResponse = list(ProgramListParams.none())

    /** @see list */
    fun list(
        params: ProgramListParams = ProgramListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProgramListResponse

    /** @see list */
    fun list(params: ProgramListParams = ProgramListParams.none()): ProgramListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ProgramListResponse =
        list(ProgramListParams.none(), requestOptions)

    /** A view of [ProgramService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProgramService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /programs/{program_id}`, but is otherwise the same
         * as [ProgramService.retrieve].
         */
        @MustBeClosed
        fun retrieve(programId: String): HttpResponseFor<Program> =
            retrieve(programId, ProgramRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            programId: String,
            params: ProgramRetrieveParams = ProgramRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Program> =
            retrieve(params.toBuilder().programId(programId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            programId: String,
            params: ProgramRetrieveParams = ProgramRetrieveParams.none(),
        ): HttpResponseFor<Program> = retrieve(programId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ProgramRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Program>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ProgramRetrieveParams): HttpResponseFor<Program> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(programId: String, requestOptions: RequestOptions): HttpResponseFor<Program> =
            retrieve(programId, ProgramRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /programs`, but is otherwise the same as
         * [ProgramService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ProgramListResponse> = list(ProgramListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProgramListParams = ProgramListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProgramListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProgramListParams = ProgramListParams.none()
        ): HttpResponseFor<ProgramListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProgramListResponse> =
            list(ProgramListParams.none(), requestOptions)
    }
}
