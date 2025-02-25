// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardPurchaseSupplement
import com.increase.api.models.CardPurchaseSupplementListPage
import com.increase.api.models.CardPurchaseSupplementListParams
import com.increase.api.models.CardPurchaseSupplementRetrieveParams

interface CardPurchaseSupplementService {

    /** Retrieve a Card Purchase Supplement */
    @JvmOverloads
    fun retrieve(
        params: CardPurchaseSupplementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPurchaseSupplement

    /** List Card Purchase Supplements */
    @JvmOverloads
    fun list(
        params: CardPurchaseSupplementListParams = CardPurchaseSupplementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPurchaseSupplementListPage

    /** List Card Purchase Supplements */
    fun list(requestOptions: RequestOptions): CardPurchaseSupplementListPage =
        list(CardPurchaseSupplementListParams.none(), requestOptions)
}
