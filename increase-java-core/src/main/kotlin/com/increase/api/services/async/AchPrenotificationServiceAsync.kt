// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.AchPrenotification
import com.increase.api.models.AchPrenotificationCreateParams
import com.increase.api.models.AchPrenotificationListPageAsync
import com.increase.api.models.AchPrenotificationListParams
import com.increase.api.models.AchPrenotificationRetrieveParams
import java.util.concurrent.CompletableFuture

interface AchPrenotificationServiceAsync {

    /** Create an ACH Prenotification */
    @JvmOverloads
    fun create(
        params: AchPrenotificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchPrenotification>

    /** Retrieve an ACH Prenotification */
    @JvmOverloads
    fun retrieve(
        params: AchPrenotificationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchPrenotification>

    /** List ACH Prenotifications */
    @JvmOverloads
    fun list(
        params: AchPrenotificationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchPrenotificationListPageAsync>
}
