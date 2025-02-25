// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.Program
import com.increase.api.models.ProgramListPage
import com.increase.api.models.ProgramListParams
import com.increase.api.models.ProgramRetrieveParams

interface ProgramService {

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
}
