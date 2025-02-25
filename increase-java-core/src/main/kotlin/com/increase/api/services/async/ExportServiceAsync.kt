// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.Export
import com.increase.api.models.ExportCreateParams
import com.increase.api.models.ExportListPageAsync
import com.increase.api.models.ExportListParams
import com.increase.api.models.ExportRetrieveParams
import java.util.concurrent.CompletableFuture

interface ExportServiceAsync {

    /** Create an Export */
    @JvmOverloads
    fun create(
        params: ExportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Export>

    /** Retrieve an Export */
    @JvmOverloads
    fun retrieve(
        params: ExportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Export>

    /** List Exports */
    @JvmOverloads
    fun list(
        params: ExportListParams = ExportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExportListPageAsync>

    /** List Exports */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExportListPageAsync> =
        list(ExportListParams.none(), requestOptions)
}
