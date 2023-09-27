@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.PhysicalCard
import com.increase.api.models.PhysicalCardCreateParams
import com.increase.api.models.PhysicalCardListPage
import com.increase.api.models.PhysicalCardListParams
import com.increase.api.models.PhysicalCardRetrieveParams
import com.increase.api.models.PhysicalCardUpdateParams

interface PhysicalCardService {

    /** Create a Physical Card */
    @JvmOverloads
    fun create(
        params: PhysicalCardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PhysicalCard

    /** Retrieve a Physical Card */
    @JvmOverloads
    fun retrieve(
        params: PhysicalCardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PhysicalCard

    /** Update a Physical Card */
    @JvmOverloads
    fun update(
        params: PhysicalCardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PhysicalCard

    /** List Physical Cards */
    @JvmOverloads
    fun list(
        params: PhysicalCardListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PhysicalCardListPage
}
