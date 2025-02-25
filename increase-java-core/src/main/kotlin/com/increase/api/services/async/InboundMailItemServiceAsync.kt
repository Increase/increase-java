// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundMailItem
import com.increase.api.models.InboundMailItemListPageAsync
import com.increase.api.models.InboundMailItemListParams
import com.increase.api.models.InboundMailItemRetrieveParams
import java.util.concurrent.CompletableFuture

interface InboundMailItemServiceAsync {

    /** Retrieve an Inbound Mail Item */
    @JvmOverloads
    fun retrieve(
        params: InboundMailItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundMailItem>

    /** List Inbound Mail Items */
    @JvmOverloads
    fun list(
        params: InboundMailItemListParams = InboundMailItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundMailItemListPageAsync>

    /** List Inbound Mail Items */
    fun list(requestOptions: RequestOptions): CompletableFuture<InboundMailItemListPageAsync> =
        list(InboundMailItemListParams.none(), requestOptions)
}
