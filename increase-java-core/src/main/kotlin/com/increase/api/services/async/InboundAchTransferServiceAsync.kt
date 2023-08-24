@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundAchTransfer
import com.increase.api.models.InboundAchTransferListPageAsync
import com.increase.api.models.InboundAchTransferListParams
import com.increase.api.models.InboundAchTransferRetrieveParams
import java.util.concurrent.CompletableFuture

interface InboundAchTransferServiceAsync {

    /** Retrieve an Inbound ACH Transfer */
    @JvmOverloads
    fun retrieve(
        params: InboundAchTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InboundAchTransfer>

    /** List Inbound ACH Transfers */
    @JvmOverloads
    fun list(
        params: InboundAchTransferListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InboundAchTransferListPageAsync>
}
