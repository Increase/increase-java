@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundWireDrawdownRequest
import com.increase.api.models.InboundWireDrawdownRequestListPage
import com.increase.api.models.InboundWireDrawdownRequestListParams
import com.increase.api.models.InboundWireDrawdownRequestRetrieveParams

interface InboundWireDrawdownRequestService {

    /** Retrieve an Inbound Wire Drawdown Request */
    @JvmOverloads
    fun retrieve(
        params: InboundWireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundWireDrawdownRequest

    /** List Inbound Wire Drawdown Requests */
    @JvmOverloads
    fun list(
        params: InboundWireDrawdownRequestListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundWireDrawdownRequestListPage
}
