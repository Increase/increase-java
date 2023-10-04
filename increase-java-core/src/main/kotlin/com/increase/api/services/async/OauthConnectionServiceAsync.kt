// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.OauthConnection
import com.increase.api.models.OauthConnectionListPageAsync
import com.increase.api.models.OauthConnectionListParams
import com.increase.api.models.OauthConnectionRetrieveParams
import java.util.concurrent.CompletableFuture

interface OauthConnectionServiceAsync {

    /** Retrieve an OAuth Connection */
    @JvmOverloads
    fun retrieve(
        params: OauthConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<OauthConnection>

    /** List OAuth Connections */
    @JvmOverloads
    fun list(
        params: OauthConnectionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<OauthConnectionListPageAsync>
}
