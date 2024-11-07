// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundMailItem
import com.increase.api.models.InboundMailItemListPage
import com.increase.api.models.InboundMailItemListParams
import com.increase.api.models.InboundMailItemRetrieveParams

interface InboundMailItemService {

    /** Retrieve an Inbound Mail Item */
    @JvmOverloads
    fun retrieve(
        params: InboundMailItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundMailItem

    /** List Inbound Mail Items */
    @JvmOverloads
    fun list(
        params: InboundMailItemListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundMailItemListPage
}
