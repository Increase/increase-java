// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.programs.Program
import com.increase.api.models.programs.ProgramListParams
import com.increase.api.models.programs.ProgramListResponse
import com.increase.api.models.programs.ProgramRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ProgramServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProgramServiceAsync

    /** Retrieve a Program */
    fun retrieve(programId: String): CompletableFuture<Program> =
        retrieve(programId, ProgramRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        programId: String,
        params: ProgramRetrieveParams = ProgramRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Program> =
        retrieve(params.toBuilder().programId(programId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        programId: String,
        params: ProgramRetrieveParams = ProgramRetrieveParams.none(),
    ): CompletableFuture<Program> = retrieve(programId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ProgramRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Program>

    /** @see retrieve */
    fun retrieve(params: ProgramRetrieveParams): CompletableFuture<Program> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(programId: String, requestOptions: RequestOptions): CompletableFuture<Program> =
        retrieve(programId, ProgramRetrieveParams.none(), requestOptions)

    /** List Programs */
    fun list(): CompletableFuture<ProgramListResponse> = list(ProgramListParams.none())

    /** @see list */
    fun list(
        params: ProgramListParams = ProgramListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProgramListResponse>

    /** @see list */
    fun list(
        params: ProgramListParams = ProgramListParams.none()
    ): CompletableFuture<ProgramListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ProgramListResponse> =
        list(ProgramListParams.none(), requestOptions)

    /**
     * A view of [ProgramServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProgramServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /programs/{program_id}`, but is otherwise the same
         * as [ProgramServiceAsync.retrieve].
         */
        fun retrieve(programId: String): CompletableFuture<HttpResponseFor<Program>> =
            retrieve(programId, ProgramRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            programId: String,
            params: ProgramRetrieveParams = ProgramRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Program>> =
            retrieve(params.toBuilder().programId(programId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            programId: String,
            params: ProgramRetrieveParams = ProgramRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Program>> =
            retrieve(programId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ProgramRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Program>>

        /** @see retrieve */
        fun retrieve(params: ProgramRetrieveParams): CompletableFuture<HttpResponseFor<Program>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            programId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Program>> =
            retrieve(programId, ProgramRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /programs`, but is otherwise the same as
         * [ProgramServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ProgramListResponse>> =
            list(ProgramListParams.none())

        /** @see list */
        fun list(
            params: ProgramListParams = ProgramListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProgramListResponse>>

        /** @see list */
        fun list(
            params: ProgramListParams = ProgramListParams.none()
        ): CompletableFuture<HttpResponseFor<ProgramListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProgramListResponse>> =
            list(ProgramListParams.none(), requestOptions)
    }
}
