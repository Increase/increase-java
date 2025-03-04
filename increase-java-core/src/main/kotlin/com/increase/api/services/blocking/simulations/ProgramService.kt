// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.Program
import com.increase.api.models.SimulationProgramCreateParams

interface ProgramService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates a [Program](#programs) being created in your group. By default, your group has one
     * program called Commercial Banking. Note that when your group operates more than one program,
     * `program_id` is a required field when creating accounts.
     */
    @JvmOverloads
    fun create(
        params: SimulationProgramCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Program

    /** A view of [ProgramService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/programs`, but is otherwise the same
         * as [ProgramService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: SimulationProgramCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Program>
    }
}
