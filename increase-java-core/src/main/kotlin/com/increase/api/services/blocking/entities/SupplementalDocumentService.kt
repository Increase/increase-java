@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.entities

import com.increase.api.core.RequestOptions
import com.increase.api.models.EntitiesSupplementalDocumentCreateParams
import com.increase.api.models.Entity

interface SupplementalDocumentService {

    /** Create a supplemental document for an Entity */
    @JvmOverloads
    fun create(
        params: EntitiesSupplementalDocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity
}
