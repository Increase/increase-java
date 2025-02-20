// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.OAuthApplication
import com.increase.api.models.OAuthApplicationListPageAsync
import com.increase.api.models.OAuthApplicationListParams
import com.increase.api.models.OAuthApplicationRetrieveParams
import java.util.concurrent.CompletableFuture

interface OAuthApplicationServiceAsync {

    /** Retrieve an OAuth Application */
    @JvmOverloads
    fun retrieve(
        params: OAuthApplicationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthApplication>

    /** List OAuth Applications */
    @JvmOverloads
    fun list(
        params: OAuthApplicationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthApplicationListPageAsync>
}
