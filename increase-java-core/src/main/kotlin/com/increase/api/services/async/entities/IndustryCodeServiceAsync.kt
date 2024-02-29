// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.entities

import com.increase.api.core.RequestOptions
import com.increase.api.models.Entity
import com.increase.api.models.EntityIndustryCodeCreateParams
import java.util.concurrent.CompletableFuture

interface IndustryCodeServiceAsync {

    /** Update a Corporation Entity's industry code */
    @JvmOverloads
    fun create(
        params: EntityIndustryCodeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Entity>
}
