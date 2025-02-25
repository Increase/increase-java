// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundRealTimePaymentsTransfer
import com.increase.api.models.InboundRealTimePaymentsTransferListPage
import com.increase.api.models.InboundRealTimePaymentsTransferListParams
import com.increase.api.models.InboundRealTimePaymentsTransferRetrieveParams

interface InboundRealTimePaymentsTransferService {

    /** Retrieve an Inbound Real-Time Payments Transfer */
    @JvmOverloads
    fun retrieve(
        params: InboundRealTimePaymentsTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundRealTimePaymentsTransfer

    /** List Inbound Real-Time Payments Transfers */
    @JvmOverloads
    fun list(
        params: InboundRealTimePaymentsTransferListParams =
            InboundRealTimePaymentsTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundRealTimePaymentsTransferListPage

    /** List Inbound Real-Time Payments Transfers */
    fun list(requestOptions: RequestOptions): InboundRealTimePaymentsTransferListPage =
        list(InboundRealTimePaymentsTransferListParams.none(), requestOptions)
}
