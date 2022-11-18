@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundAchTransferReturn
import com.increase.api.models.InboundAchTransferReturnCreateParams
import com.increase.api.models.InboundAchTransferReturnListPage
import com.increase.api.models.InboundAchTransferReturnListParams
import com.increase.api.models.InboundAchTransferReturnRetrieveParams

interface InboundAchTransferReturnService {

    /** Create an ACH Return */
    @JvmOverloads
    fun create(
        params: InboundAchTransferReturnCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundAchTransferReturn

    /** Retrieve an Inbound ACH Transfer Return */
    @JvmOverloads
    fun retrieve(
        params: InboundAchTransferReturnRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundAchTransferReturn

    /** List Inbound ACH Transfer Returns */
    @JvmOverloads
    fun list(
        params: InboundAchTransferReturnListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundAchTransferReturnListPage
}
