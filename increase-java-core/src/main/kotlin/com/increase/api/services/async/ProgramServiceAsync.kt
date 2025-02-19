// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.Program
import com.increase.api.models.ProgramListPageAsync
import com.increase.api.models.ProgramListParams
import com.increase.api.models.ProgramRetrieveParams
import java.util.concurrent.CompletableFuture

interface ProgramServiceAsync {

    /** Retrieve a Program */
    @JvmOverloads
    fun retrieve(
        params: ProgramRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Program>

    /** List Programs */
    @JvmOverloads
    fun list(
        params: ProgramListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProgramListPageAsync>
}
