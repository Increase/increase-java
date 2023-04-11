@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundAchTransferReturn
import com.increase.api.models.InboundAchTransferReturnCreateParams
import com.increase.api.models.InboundAchTransferReturnListPageAsync
import com.increase.api.models.InboundAchTransferReturnListParams
import com.increase.api.models.InboundAchTransferReturnRetrieveParams
import java.util.concurrent.CompletableFuture

interface InboundAchTransferReturnServiceAsync {

    /** Create an ACH Return */
    @JvmOverloads
    fun create(
        params: InboundAchTransferReturnCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InboundAchTransferReturn>

    /** Retrieve an Inbound ACH Transfer Return */
    @JvmOverloads
    fun retrieve(
        params: InboundAchTransferReturnRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InboundAchTransferReturn>

    /** List Inbound ACH Transfer Returns */
    @JvmOverloads
    fun list(
        params: InboundAchTransferReturnListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InboundAchTransferReturnListPageAsync>
}
