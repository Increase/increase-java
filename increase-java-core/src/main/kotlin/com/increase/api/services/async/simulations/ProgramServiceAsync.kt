// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.programs.Program
import com.increase.api.models.simulations.programs.ProgramCreateParams
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

    /**
     * Simulates a [Program](#programs) being created in your group. By default, your group has one
     * program called Commercial Banking. Note that when your group operates more than one program,
     * `program_id` is a required field when creating accounts.
     */
    fun create(params: ProgramCreateParams): CompletableFuture<Program> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ProgramCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Program>

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
         * Returns a raw HTTP response for `post /simulations/programs`, but is otherwise the same
         * as [ProgramServiceAsync.create].
         */
        fun create(params: ProgramCreateParams): CompletableFuture<HttpResponseFor<Program>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: ProgramCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Program>>
    }
}
