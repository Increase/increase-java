@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.entities

import com.increase.api.core.RequestOptions
import com.increase.api.models.Entity
import com.increase.api.models.EntityBeneficialOwnerCreateParams

interface BeneficialOwnerService {

    /** Create a beneficial owner for a corporate Entity */
    @JvmOverloads
    fun create(
        params: EntityBeneficialOwnerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity
}
