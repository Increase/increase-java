// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.Group
import com.increase.api.models.GroupRetrieveParams

interface GroupService {

    /** Returns details for the currently authenticated Group. */
    @JvmOverloads
    fun retrieve(
        params: GroupRetrieveParams = GroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Group

    /** Returns details for the currently authenticated Group. */
    fun retrieve(requestOptions: RequestOptions): Group =
        retrieve(GroupRetrieveParams.none(), requestOptions)
}
