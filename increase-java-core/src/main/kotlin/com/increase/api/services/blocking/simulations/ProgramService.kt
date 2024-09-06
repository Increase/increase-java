// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.Program
import com.increase.api.models.SimulationProgramCreateParams

interface ProgramService {

    /**
     * Simulates a program being created in your group. By default, your group has one program
     * called Commercial Banking. Note that when your group operates more than one program,
     * `program_id` is a required field when creating accounts.
     */
    @JvmOverloads
    fun create(
        params: SimulationProgramCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Program
}
