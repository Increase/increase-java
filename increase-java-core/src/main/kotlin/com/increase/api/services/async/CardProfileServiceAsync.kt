@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardProfile
import com.increase.api.models.CardProfileArchiveParams
import com.increase.api.models.CardProfileCreateParams
import com.increase.api.models.CardProfileListPageAsync
import com.increase.api.models.CardProfileListParams
import com.increase.api.models.CardProfileRetrieveParams
import java.util.concurrent.CompletableFuture

interface CardProfileServiceAsync {

    /** Create a Card Profile */
    @JvmOverloads
    fun create(
        params: CardProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardProfile>

    /** Retrieve a Card Profile */
    @JvmOverloads
    fun retrieve(
        params: CardProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardProfile>

    /** List Card Profiles */
    @JvmOverloads
    fun list(
        params: CardProfileListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardProfileListPageAsync>

    /** Archive an Card Profile */
    @JvmOverloads
    fun archive(
        params: CardProfileArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardProfile>
}
