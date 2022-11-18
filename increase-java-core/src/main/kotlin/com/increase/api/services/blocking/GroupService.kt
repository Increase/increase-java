@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.Group
import com.increase.api.models.GroupRetrieveDetailsParams

interface GroupService {

    /** Returns details for the currently authenticated Group. */
    @JvmOverloads
    fun retrieveDetails(
        params: GroupRetrieveDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Group
}
