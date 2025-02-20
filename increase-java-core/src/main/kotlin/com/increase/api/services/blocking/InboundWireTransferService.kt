// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundWireTransfer
import com.increase.api.models.InboundWireTransferListPage
import com.increase.api.models.InboundWireTransferListParams
import com.increase.api.models.InboundWireTransferRetrieveParams

interface InboundWireTransferService {

    /** Retrieve an Inbound Wire Transfer */
    @JvmOverloads
    fun retrieve(
        params: InboundWireTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireTransfer

    /** List Inbound Wire Transfers */
    @JvmOverloads
    fun list(
        params: InboundWireTransferListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireTransferListPage
}
