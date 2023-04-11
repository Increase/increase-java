@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.Document
import com.increase.api.models.SimulationsDocumentCreateParams

interface DocumentService {

    /** Simulates an tax document being created for an account. */
    @JvmOverloads
    fun create(
        params: SimulationsDocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Document
}
