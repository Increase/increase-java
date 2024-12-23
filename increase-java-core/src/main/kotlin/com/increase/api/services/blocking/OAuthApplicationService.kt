// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.OAuthApplication
import com.increase.api.models.OAuthApplicationListPage
import com.increase.api.models.OAuthApplicationListParams
import com.increase.api.models.OAuthApplicationRetrieveParams

interface OAuthApplicationService {

    /** Retrieve an OAuth Application */
    @JvmOverloads
    fun retrieve(
        params: OAuthApplicationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): OAuthApplication

    /** List OAuth Applications */
    @JvmOverloads
    fun list(
        params: OAuthApplicationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): OAuthApplicationListPage
}
