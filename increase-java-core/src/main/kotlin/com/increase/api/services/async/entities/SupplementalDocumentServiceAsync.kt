@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.entities

import com.increase.api.core.RequestOptions
import com.increase.api.models.Entity
import com.increase.api.models.EntitySupplementalDocumentCreateParams
import java.util.concurrent.CompletableFuture

interface SupplementalDocumentServiceAsync {

    /** Create a supplemental document for an Entity */
    @JvmOverloads
    fun create(
        params: EntitySupplementalDocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Entity>
}
