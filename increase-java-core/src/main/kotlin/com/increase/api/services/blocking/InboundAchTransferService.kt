// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundAchTransfer
import com.increase.api.models.InboundAchTransferDeclineParams
import com.increase.api.models.InboundAchTransferListPage
import com.increase.api.models.InboundAchTransferListParams
import com.increase.api.models.InboundAchTransferNotificationOfChangeParams
import com.increase.api.models.InboundAchTransferRetrieveParams
import com.increase.api.models.InboundAchTransferTransferReturnParams

interface InboundAchTransferService {

    /** Retrieve an Inbound ACH Transfer */
    @JvmOverloads
    fun retrieve(
        params: InboundAchTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundAchTransfer

    /** List Inbound ACH Transfers */
    @JvmOverloads
    fun list(
        params: InboundAchTransferListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundAchTransferListPage

    /** Decline an Inbound ACH Transfer */
    @JvmOverloads
    fun decline(
        params: InboundAchTransferDeclineParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundAchTransfer

    /** Create a notification of change for an Inbound ACH Transfer */
    @JvmOverloads
    fun notificationOfChange(
        params: InboundAchTransferNotificationOfChangeParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundAchTransfer

    /** Return an Inbound ACH Transfer */
    @JvmOverloads
    fun transferReturn(
        params: InboundAchTransferTransferReturnParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundAchTransfer
}
