// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardProfile
import com.increase.api.models.CardProfileArchiveParams
import com.increase.api.models.CardProfileCreateParams
import com.increase.api.models.CardProfileListPage
import com.increase.api.models.CardProfileListParams
import com.increase.api.models.CardProfileRetrieveParams

interface CardProfileService {

    /** Create a Card Profile */
    @JvmOverloads
    fun create(
        params: CardProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardProfile

    /** Retrieve a Card Profile */
    @JvmOverloads
    fun retrieve(
        params: CardProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardProfile

    /** List Card Profiles */
    @JvmOverloads
    fun list(
        params: CardProfileListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardProfileListPage

    /** Archive an Card Profile */
    @JvmOverloads
    fun archive(
        params: CardProfileArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardProfile
}
