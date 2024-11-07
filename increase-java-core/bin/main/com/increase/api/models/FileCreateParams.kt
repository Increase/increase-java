// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ContentTypes
import com.increase.api.core.Enum
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.MultipartFormValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional
import org.apache.hc.core5.http.ContentType

class FileCreateParams
constructor(
    private val file: MultipartFormValue<ByteArray>,
    private val purpose: MultipartFormValue<Purpose>,
    private val description: MultipartFormValue<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun file(): MultipartFormValue<ByteArray> = file

    fun purpose(): MultipartFormValue<Purpose> = purpose

    fun description(): Optional<MultipartFormValue<String>> = Optional.ofNullable(description)

    @JvmSynthetic
    internal fun getBody(): Array<MultipartFormValue<*>?> {
        return arrayOf(
            file,
            purpose,
            description,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = FileCreateBody.Builder::class)
    @NoAutoDetect
    class FileCreateBody
    internal constructor(
        private val file: ByteArray?,
        private val purpose: Purpose?,
        private val description: String?,
    ) {

        /**
         * The file contents. This should follow the specifications of
         * [RFC 7578](https://datatracker.ietf.org/doc/html/rfc7578) which defines file transfers
         * for the multipart/form-data protocol.
         */
        fun file(): ByteArray? = file

        /** What the File will be used for in Increase's systems. */
        fun purpose(): Purpose? = purpose

        /** The description you choose to give the File. */
        fun description(): String? = description

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var file: ByteArray? = null
            private var purpose: Purpose? = null
            private var description: String? = null

            @JvmSynthetic
            internal fun from(fileCreateBody: FileCreateBody) = apply {
                this.file = fileCreateBody.file
                this.purpose = fileCreateBody.purpose
                this.description = fileCreateBody.description
            }

            /**
             * The file contents. This should follow the specifications of
             * [RFC 7578](https://datatracker.ietf.org/doc/html/rfc7578) which defines file
             * transfers for the multipart/form-data protocol.
             */
            fun file(file: ByteArray) = apply { this.file = file }

            /** What the File will be used for in Increase's systems. */
            fun purpose(purpose: Purpose) = apply { this.purpose = purpose }

            /** The description you choose to give the File. */
            fun description(description: String) = apply { this.description = description }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FileCreateBody && this.file == other.file && this.purpose == other.purpose && this.description == other.description /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(file, purpose, description) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "FileCreateBody{file=$file, purpose=$purpose, description=$description}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FileCreateParams && this.file == other.file && this.purpose == other.purpose && this.description == other.description && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(file, purpose, description, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "FileCreateParams{file=$file, purpose=$purpose, description=$description, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var file: MultipartFormValue<ByteArray>? = null
        private var purpose: MultipartFormValue<Purpose>? = null
        private var description: MultipartFormValue<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(fileCreateParams: FileCreateParams) = apply {
            this.file = fileCreateParams.file
            this.purpose = fileCreateParams.purpose
            this.description = fileCreateParams.description
            additionalHeaders(fileCreateParams.additionalHeaders)
            additionalQueryParams(fileCreateParams.additionalQueryParams)
        }

        /**
         * The file contents. This should follow the specifications of
         * [RFC 7578](https://datatracker.ietf.org/doc/html/rfc7578) which defines file transfers
         * for the multipart/form-data protocol.
         */
        fun file(
            content: ByteArray,
            filename: String? = null,
            contentType: ContentType = ContentTypes.DefaultBinary
        ) = apply {
            this.file = MultipartFormValue.fromByteArray("file", content, contentType, filename)
        }

        /** What the File will be used for in Increase's systems. */
        fun purpose(purpose: Purpose, contentType: ContentType = ContentTypes.DefaultText) = apply {
            this.purpose = MultipartFormValue.fromEnum("purpose", purpose, contentType)
        }

        /** The description you choose to give the File. */
        fun description(description: String, contentType: ContentType = ContentTypes.DefaultText) =
            apply {
                this.description =
                    MultipartFormValue.fromString("description", description, contentType)
            }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): FileCreateParams =
            FileCreateParams(
                checkNotNull(file) { "`file` is required but was not set" },
                checkNotNull(purpose) { "`purpose` is required but was not set" },
                description,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Purpose
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Purpose && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CHECK_IMAGE_FRONT = Purpose(JsonField.of("check_image_front"))

            @JvmField val CHECK_IMAGE_BACK = Purpose(JsonField.of("check_image_back"))

            @JvmField val MAILED_CHECK_IMAGE = Purpose(JsonField.of("mailed_check_image"))

            @JvmField val FORM_SS_4 = Purpose(JsonField.of("form_ss_4"))

            @JvmField val IDENTITY_DOCUMENT = Purpose(JsonField.of("identity_document"))

            @JvmField val OTHER = Purpose(JsonField.of("other"))

            @JvmField
            val TRUST_FORMATION_DOCUMENT = Purpose(JsonField.of("trust_formation_document"))

            @JvmField val DIGITAL_WALLET_ARTWORK = Purpose(JsonField.of("digital_wallet_artwork"))

            @JvmField val DIGITAL_WALLET_APP_ICON = Purpose(JsonField.of("digital_wallet_app_icon"))

            @JvmField val PHYSICAL_CARD_FRONT = Purpose(JsonField.of("physical_card_front"))

            @JvmField val PHYSICAL_CARD_CARRIER = Purpose(JsonField.of("physical_card_carrier"))

            @JvmField val DOCUMENT_REQUEST = Purpose(JsonField.of("document_request"))

            @JvmField
            val ENTITY_SUPPLEMENTAL_DOCUMENT = Purpose(JsonField.of("entity_supplemental_document"))

            @JvmField
            val UNUSUAL_ACTIVITY_REPORT_ATTACHMENT =
                Purpose(JsonField.of("unusual_activity_report_attachment"))

            @JvmStatic fun of(value: String) = Purpose(JsonField.of(value))
        }

        enum class Known {
            CHECK_IMAGE_FRONT,
            CHECK_IMAGE_BACK,
            MAILED_CHECK_IMAGE,
            FORM_SS_4,
            IDENTITY_DOCUMENT,
            OTHER,
            TRUST_FORMATION_DOCUMENT,
            DIGITAL_WALLET_ARTWORK,
            DIGITAL_WALLET_APP_ICON,
            PHYSICAL_CARD_FRONT,
            PHYSICAL_CARD_CARRIER,
            DOCUMENT_REQUEST,
            ENTITY_SUPPLEMENTAL_DOCUMENT,
            UNUSUAL_ACTIVITY_REPORT_ATTACHMENT,
        }

        enum class Value {
            CHECK_IMAGE_FRONT,
            CHECK_IMAGE_BACK,
            MAILED_CHECK_IMAGE,
            FORM_SS_4,
            IDENTITY_DOCUMENT,
            OTHER,
            TRUST_FORMATION_DOCUMENT,
            DIGITAL_WALLET_ARTWORK,
            DIGITAL_WALLET_APP_ICON,
            PHYSICAL_CARD_FRONT,
            PHYSICAL_CARD_CARRIER,
            DOCUMENT_REQUEST,
            ENTITY_SUPPLEMENTAL_DOCUMENT,
            UNUSUAL_ACTIVITY_REPORT_ATTACHMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CHECK_IMAGE_FRONT -> Value.CHECK_IMAGE_FRONT
                CHECK_IMAGE_BACK -> Value.CHECK_IMAGE_BACK
                MAILED_CHECK_IMAGE -> Value.MAILED_CHECK_IMAGE
                FORM_SS_4 -> Value.FORM_SS_4
                IDENTITY_DOCUMENT -> Value.IDENTITY_DOCUMENT
                OTHER -> Value.OTHER
                TRUST_FORMATION_DOCUMENT -> Value.TRUST_FORMATION_DOCUMENT
                DIGITAL_WALLET_ARTWORK -> Value.DIGITAL_WALLET_ARTWORK
                DIGITAL_WALLET_APP_ICON -> Value.DIGITAL_WALLET_APP_ICON
                PHYSICAL_CARD_FRONT -> Value.PHYSICAL_CARD_FRONT
                PHYSICAL_CARD_CARRIER -> Value.PHYSICAL_CARD_CARRIER
                DOCUMENT_REQUEST -> Value.DOCUMENT_REQUEST
                ENTITY_SUPPLEMENTAL_DOCUMENT -> Value.ENTITY_SUPPLEMENTAL_DOCUMENT
                UNUSUAL_ACTIVITY_REPORT_ATTACHMENT -> Value.UNUSUAL_ACTIVITY_REPORT_ATTACHMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CHECK_IMAGE_FRONT -> Known.CHECK_IMAGE_FRONT
                CHECK_IMAGE_BACK -> Known.CHECK_IMAGE_BACK
                MAILED_CHECK_IMAGE -> Known.MAILED_CHECK_IMAGE
                FORM_SS_4 -> Known.FORM_SS_4
                IDENTITY_DOCUMENT -> Known.IDENTITY_DOCUMENT
                OTHER -> Known.OTHER
                TRUST_FORMATION_DOCUMENT -> Known.TRUST_FORMATION_DOCUMENT
                DIGITAL_WALLET_ARTWORK -> Known.DIGITAL_WALLET_ARTWORK
                DIGITAL_WALLET_APP_ICON -> Known.DIGITAL_WALLET_APP_ICON
                PHYSICAL_CARD_FRONT -> Known.PHYSICAL_CARD_FRONT
                PHYSICAL_CARD_CARRIER -> Known.PHYSICAL_CARD_CARRIER
                DOCUMENT_REQUEST -> Known.DOCUMENT_REQUEST
                ENTITY_SUPPLEMENTAL_DOCUMENT -> Known.ENTITY_SUPPLEMENTAL_DOCUMENT
                UNUSUAL_ACTIVITY_REPORT_ATTACHMENT -> Known.UNUSUAL_ACTIVITY_REPORT_ATTACHMENT
                else -> throw IncreaseInvalidDataException("Unknown Purpose: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
