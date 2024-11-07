// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.OAuthConnection
import com.increase.api.models.OAuthConnectionListPage
import com.increase.api.models.OAuthConnectionListParams
import com.increase.api.models.OAuthConnectionRetrieveParams

interface OAuthConnectionService {

    /** Retrieve an OAuth Connection */
    @JvmOverloads
    fun retrieve(
        params: OAuthConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): OAuthConnection

    /** List OAuth Connections */
    @JvmOverloads
    fun list(
        params: OAuthConnectionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): OAuthConnectionListPage
}
