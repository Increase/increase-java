@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.WireDrawdownRequest
import com.increase.api.models.WireDrawdownRequestCreateParams
import com.increase.api.models.WireDrawdownRequestListPageAsync
import com.increase.api.models.WireDrawdownRequestListParams
import com.increase.api.models.WireDrawdownRequestRetrieveParams
import java.util.concurrent.CompletableFuture

interface WireDrawdownRequestServiceAsync {

    /** Create a Wire Drawdown Request */
    @JvmOverloads
    fun create(
        params: WireDrawdownRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<WireDrawdownRequest>

    /** Retrieve a Wire Drawdown Request */
    @JvmOverloads
    fun retrieve(
        params: WireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<WireDrawdownRequest>

    /** List Wire Drawdown Requests */
    @JvmOverloads
    fun list(
        params: WireDrawdownRequestListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<WireDrawdownRequestListPageAsync>
}
