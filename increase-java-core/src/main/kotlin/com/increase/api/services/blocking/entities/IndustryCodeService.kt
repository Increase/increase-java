// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.entities

import com.increase.api.core.RequestOptions
import com.increase.api.models.Entity
import com.increase.api.models.EntityIndustryCodeCreateParams

interface IndustryCodeService {

    /** Update the industry code for a corporate Entity */
    @JvmOverloads
    fun create(
        params: EntityIndustryCodeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity
}
