// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.IntrafiExclusion
import com.increase.api.models.IntrafiExclusionArchiveParams
import com.increase.api.models.IntrafiExclusionCreateParams
import com.increase.api.models.IntrafiExclusionListPageAsync
import com.increase.api.models.IntrafiExclusionListParams
import com.increase.api.models.IntrafiExclusionRetrieveParams
import java.util.concurrent.CompletableFuture

interface IntrafiExclusionServiceAsync {

    /** Create an IntraFi Exclusion */
    @JvmOverloads
    fun create(
        params: IntrafiExclusionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<IntrafiExclusion>

    /** Get an IntraFi Exclusion */
    @JvmOverloads
    fun retrieve(
        params: IntrafiExclusionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<IntrafiExclusion>

    /** List IntraFi Exclusions */
    @JvmOverloads
    fun list(
        params: IntrafiExclusionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<IntrafiExclusionListPageAsync>

    /** Archive an IntraFi Exclusion */
    @JvmOverloads
    fun archive(
        params: IntrafiExclusionArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<IntrafiExclusion>
}
