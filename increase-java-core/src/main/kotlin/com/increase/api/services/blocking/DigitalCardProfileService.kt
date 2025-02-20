// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.DigitalCardProfile
import com.increase.api.models.DigitalCardProfileArchiveParams
import com.increase.api.models.DigitalCardProfileCloneParams
import com.increase.api.models.DigitalCardProfileCreateParams
import com.increase.api.models.DigitalCardProfileListPage
import com.increase.api.models.DigitalCardProfileListParams
import com.increase.api.models.DigitalCardProfileRetrieveParams

interface DigitalCardProfileService {

    /** Create a Digital Card Profile */
    @JvmOverloads
    fun create(
        params: DigitalCardProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfile

    /** Retrieve a Digital Card Profile */
    @JvmOverloads
    fun retrieve(
        params: DigitalCardProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfile

    /** List Card Profiles */
    @JvmOverloads
    fun list(
        params: DigitalCardProfileListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfileListPage

    /** Archive a Digital Card Profile */
    @JvmOverloads
    fun archive(
        params: DigitalCardProfileArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfile

    /** Clones a Digital Card Profile */
    @JvmOverloads
    fun clone(
        params: DigitalCardProfileCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardProfile
}
