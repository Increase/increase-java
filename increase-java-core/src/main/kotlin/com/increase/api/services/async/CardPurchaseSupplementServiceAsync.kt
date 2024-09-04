// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardPurchaseSupplement
import com.increase.api.models.CardPurchaseSupplementListPageAsync
import com.increase.api.models.CardPurchaseSupplementListParams
import com.increase.api.models.CardPurchaseSupplementRetrieveParams
import java.util.concurrent.CompletableFuture

interface CardPurchaseSupplementServiceAsync {

    /** Retrieve a Card Purchase Supplement */
    @JvmOverloads
    fun retrieve(
        params: CardPurchaseSupplementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardPurchaseSupplement>

    /** List Card Purchase Supplements */
    @JvmOverloads
    fun list(
        params: CardPurchaseSupplementListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardPurchaseSupplementListPageAsync>
}
