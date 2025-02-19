// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.File
import com.increase.api.models.FileCreateParams
import com.increase.api.models.FileListPage
import com.increase.api.models.FileListParams
import com.increase.api.models.FileRetrieveParams

interface FileService {

    /**
     * To upload a file to Increase, you'll need to send a request of Content-Type
     * `multipart/form-data`. The request should contain the file you would like to upload, as well
     * as the parameters for creating a file.
     */
    @JvmOverloads
    fun create(
        params: FileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** Retrieve a File */
    @JvmOverloads
    fun retrieve(
        params: FileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** List Files */
    @JvmOverloads
    fun list(
        params: FileListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileListPage
}
