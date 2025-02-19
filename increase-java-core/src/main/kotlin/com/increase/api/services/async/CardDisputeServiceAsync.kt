// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardDispute
import com.increase.api.models.CardDisputeCreateParams
import com.increase.api.models.CardDisputeListPageAsync
import com.increase.api.models.CardDisputeListParams
import com.increase.api.models.CardDisputeRetrieveParams
import java.util.concurrent.CompletableFuture

interface CardDisputeServiceAsync {

    /** Create a Card Dispute */
    @JvmOverloads
    fun create(
        params: CardDisputeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDispute>

    /** Retrieve a Card Dispute */
    @JvmOverloads
    fun retrieve(
        params: CardDisputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDispute>

    /** List Card Disputes */
    @JvmOverloads
    fun list(
        params: CardDisputeListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDisputeListPageAsync>
}
