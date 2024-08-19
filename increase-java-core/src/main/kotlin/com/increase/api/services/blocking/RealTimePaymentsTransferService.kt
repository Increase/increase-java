// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.RealTimePaymentsTransfer
import com.increase.api.models.RealTimePaymentsTransferCreateParams
import com.increase.api.models.RealTimePaymentsTransferListPage
import com.increase.api.models.RealTimePaymentsTransferListParams
import com.increase.api.models.RealTimePaymentsTransferRetrieveParams

interface RealTimePaymentsTransferService {

    /** Create a Real-Time Payments Transfer */
    @JvmOverloads
    fun create(
        params: RealTimePaymentsTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RealTimePaymentsTransfer

    /** Retrieve a Real-Time Payments Transfer */
    @JvmOverloads
    fun retrieve(
        params: RealTimePaymentsTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RealTimePaymentsTransfer

    /** List Real-Time Payments Transfers */
    @JvmOverloads
    fun list(
        params: RealTimePaymentsTransferListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RealTimePaymentsTransferListPage
}
