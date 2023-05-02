@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.Document
import com.increase.api.models.SimulationDocumentCreateParams
import java.util.concurrent.CompletableFuture

interface DocumentServiceAsync {

    /** Simulates an tax document being created for an account. */
    @JvmOverloads
    fun create(
        params: SimulationDocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Document>
}
