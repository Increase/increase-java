@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.entities

import com.increase.api.core.RequestOptions
import com.increase.api.models.Entity
import com.increase.api.models.EntityBeneficialOwnerArchiveParams
import com.increase.api.models.EntityBeneficialOwnerCreateParams
import java.util.concurrent.CompletableFuture

interface BeneficialOwnerServiceAsync {

    /** Create a beneficial owner for a corporate Entity */
    @JvmOverloads
    fun create(
        params: EntityBeneficialOwnerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Entity>

    /** Archive a beneficial owner belonging to a corporate Entity */
    @JvmOverloads
    fun archive(
        params: EntityBeneficialOwnerArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Entity>
}
