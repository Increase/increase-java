// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundWireTransfer
import com.increase.api.models.InboundWireTransferRetrieveParams
import java.util.concurrent.CompletableFuture

interface InboundWireTransferServiceAsync {

    /** Retrieve an Inbound Wire Transfer */
    @JvmOverloads
    fun retrieve(
        params: InboundWireTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InboundWireTransfer>
}
