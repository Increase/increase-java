// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.OAuthConnection
import com.increase.api.models.OAuthConnectionListPageAsync
import com.increase.api.models.OAuthConnectionListParams
import com.increase.api.models.OAuthConnectionRetrieveParams
import java.util.concurrent.CompletableFuture

interface OAuthConnectionServiceAsync {

    /** Retrieve an OAuth Connection */
    @JvmOverloads
    fun retrieve(
        params: OAuthConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthConnection>

    /** List OAuth Connections */
    @JvmOverloads
    fun list(
        params: OAuthConnectionListParams = OAuthConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthConnectionListPageAsync>

    /** List OAuth Connections */
    fun list(requestOptions: RequestOptions): CompletableFuture<OAuthConnectionListPageAsync> =
        list(OAuthConnectionListParams.none(), requestOptions)
}
