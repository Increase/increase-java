// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.Card
import com.increase.api.models.CardCreateParams
import com.increase.api.models.CardDetails
import com.increase.api.models.CardDetailsParams
import com.increase.api.models.CardListPage
import com.increase.api.models.CardListParams
import com.increase.api.models.CardRetrieveParams
import com.increase.api.models.CardUpdateParams

interface CardService {

    /** Create a Card */
    @JvmOverloads
    fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /** Retrieve a Card */
    @JvmOverloads
    fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /** Update a Card */
    @JvmOverloads
    fun update(
        params: CardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /** List Cards */
    @JvmOverloads
    fun list(
        params: CardListParams = CardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardListPage

    /** List Cards */
    fun list(requestOptions: RequestOptions): CardListPage =
        list(CardListParams.none(), requestOptions)

    /** Retrieve sensitive details for a Card */
    @JvmOverloads
    fun details(
        params: CardDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDetails
}
