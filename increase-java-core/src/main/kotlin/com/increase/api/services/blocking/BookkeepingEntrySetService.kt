// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.BookkeepingEntrySet
import com.increase.api.models.BookkeepingEntrySetCreateParams
import com.increase.api.models.BookkeepingEntrySetListPage
import com.increase.api.models.BookkeepingEntrySetListParams
import com.increase.api.models.BookkeepingEntrySetRetrieveParams

interface BookkeepingEntrySetService {

    /** Create a Bookkeeping Entry Set */
    @JvmOverloads
    fun create(
        params: BookkeepingEntrySetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntrySet

    /** Retrieve a Bookkeeping Entry Set */
    @JvmOverloads
    fun retrieve(
        params: BookkeepingEntrySetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntrySet

    /** List Bookkeeping Entry Sets */
    @JvmOverloads
    fun list(
        params: BookkeepingEntrySetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntrySetListPage
}
