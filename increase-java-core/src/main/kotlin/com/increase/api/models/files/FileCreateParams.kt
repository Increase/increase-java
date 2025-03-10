// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.files

import com.fasterxml.jackson.annotation.JsonCreator
import com.increase.api.core.Enum
import com.increase.api.core.JsonField
import com.increase.api.core.MultipartField
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.io.ByteArrayInputStream
import java.io.InputStream
import java.nio.file.Path
import java.util.Objects
import java.util.Optional
import kotlin.io.path.inputStream
import kotlin.io.path.name

/**
 * To upload a file to Increase, you'll need to send a request of Content-Type
 * `multipart/form-data`. The request should contain the file you would like to upload, as well as
 * the parameters for creating a file.
 */
class FileCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The file contents. This should follow the specifications of
     * [RFC 7578](https://datatracker.ietf.org/doc/html/rfc7578) which defines file transfers for
     * the multipart/form-data protocol.
     */
    fun file(): InputStream = body.file()

    /** What the File will be used for in Increase's systems. */
    fun purpose(): Purpose = body.purpose()

    /** The description you choose to give the File. */
    fun description(): Optional<String> = body.description()

    /**
     * The file contents. This should follow the specifications of
     * [RFC 7578](https://datatracker.ietf.org/doc/html/rfc7578) which defines file transfers for
     * the multipart/form-data protocol.
     */
    fun _file(): MultipartField<InputStream> = body._file()

    /** What the File will be used for in Increase's systems. */
    fun _purpose(): MultipartField<Purpose> = body._purpose()

    /** The description you choose to give the File. */
    fun _description(): MultipartField<String> = body._description()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic
    internal fun _body(): Map<String, MultipartField<*>> =
        mapOf("file" to _file(), "purpose" to _purpose(), "description" to _description())
            .toImmutable()

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        private val file: MultipartField<InputStream>,
        private val purpose: MultipartField<Purpose>,
        private val description: MultipartField<String>,
    ) {

        /**
         * The file contents. This should follow the specifications of
         * [RFC 7578](https://datatracker.ietf.org/doc/html/rfc7578) which defines file transfers
         * for the multipart/form-data protocol.
         */
        fun file(): InputStream = file.value.getRequired("file")

        /** What the File will be used for in Increase's systems. */
        fun purpose(): Purpose = purpose.value.getRequired("purpose")

        /** The description you choose to give the File. */
        fun description(): Optional<String> =
            Optional.ofNullable(description.value.getNullable("description"))

        /**
         * The file contents. This should follow the specifications of
         * [RFC 7578](https://datatracker.ietf.org/doc/html/rfc7578) which defines file transfers
         * for the multipart/form-data protocol.
         */
        fun _file(): MultipartField<InputStream> = file

        /** What the File will be used for in Increase's systems. */
        fun _purpose(): MultipartField<Purpose> = purpose

        /** The description you choose to give the File. */
        fun _description(): MultipartField<String> = description

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            file()
            purpose()
            description()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .file()
             * .purpose()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var file: MultipartField<InputStream>? = null
            private var purpose: MultipartField<Purpose>? = null
            private var description: MultipartField<String> = MultipartField.of(null)

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                file = body.file
                purpose = body.purpose
                description = body.description
            }

            /**
             * The file contents. This should follow the specifications of
             * [RFC 7578](https://datatracker.ietf.org/doc/html/rfc7578) which defines file
             * transfers for the multipart/form-data protocol.
             */
            fun file(file: InputStream) = file(MultipartField.of(file))

            /**
             * The file contents. This should follow the specifications of
             * [RFC 7578](https://datatracker.ietf.org/doc/html/rfc7578) which defines file
             * transfers for the multipart/form-data protocol.
             */
            fun file(file: MultipartField<InputStream>) = apply { this.file = file }

            /**
             * The file contents. This should follow the specifications of
             * [RFC 7578](https://datatracker.ietf.org/doc/html/rfc7578) which defines file
             * transfers for the multipart/form-data protocol.
             */
            fun file(file: ByteArray) = file(ByteArrayInputStream(file))

            /**
             * The file contents. This should follow the specifications of
             * [RFC 7578](https://datatracker.ietf.org/doc/html/rfc7578) which defines file
             * transfers for the multipart/form-data protocol.
             */
            fun file(file: Path) =
                file(
                    MultipartField.builder<InputStream>()
                        .value(file.inputStream())
                        .filename(file.name)
                        .build()
                )

            /** What the File will be used for in Increase's systems. */
            fun purpose(purpose: Purpose) = purpose(MultipartField.of(purpose))

            /** What the File will be used for in Increase's systems. */
            fun purpose(purpose: MultipartField<Purpose>) = apply { this.purpose = purpose }

            /** The description you choose to give the File. */
            fun description(description: String) = description(MultipartField.of(description))

            /** The description you choose to give the File. */
            fun description(description: MultipartField<String>) = apply {
                this.description = description
            }

            fun build(): Body =
                Body(checkRequired("file", file), checkRequired("purpose", purpose), description)
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && file == other.file && purpose == other.purpose && description == other.description /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(file, purpose, description) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{file=$file, purpose=$purpose, description=$description}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FileCreateParams].
         *
         * The following fields are required:
         * ```java
         * .file()
         * .purpose()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(fileCreateParams: FileCreateParams) = apply {
            body = fileCreateParams.body.toBuilder()
            additionalHeaders = fileCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = fileCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * The file contents. This should follow the specifications of
         * [RFC 7578](https://datatracker.ietf.org/doc/html/rfc7578) which defines file transfers
         * for the multipart/form-data protocol.
         */
        fun file(file: InputStream) = apply { body.file(file) }

        /**
         * The file contents. This should follow the specifications of
         * [RFC 7578](https://datatracker.ietf.org/doc/html/rfc7578) which defines file transfers
         * for the multipart/form-data protocol.
         */
        fun file(file: MultipartField<InputStream>) = apply { body.file(file) }

        /**
         * The file contents. This should follow the specifications of
         * [RFC 7578](https://datatracker.ietf.org/doc/html/rfc7578) which defines file transfers
         * for the multipart/form-data protocol.
         */
        fun file(file: ByteArray) = apply { body.file(file) }

        /**
         * The file contents. This should follow the specifications of
         * [RFC 7578](https://datatracker.ietf.org/doc/html/rfc7578) which defines file transfers
         * for the multipart/form-data protocol.
         */
        fun file(file: Path) = apply { body.file(file) }

        /** What the File will be used for in Increase's systems. */
        fun purpose(purpose: Purpose) = apply { body.purpose(purpose) }

        /** What the File will be used for in Increase's systems. */
        fun purpose(purpose: MultipartField<Purpose>) = apply { body.purpose(purpose) }

        /** The description you choose to give the File. */
        fun description(description: String) = apply { body.description(description) }

        /** The description you choose to give the File. */
        fun description(description: MultipartField<String>) = apply {
            body.description(description)
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
            FileCreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    /** What the File will be used for in Increase's systems. */
    class Purpose @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /** An image of the front of a check, used for check deposits. */
            @JvmField val CHECK_IMAGE_FRONT = of("check_image_front")

            /** An image of the back of a check, used for check deposits. */
            @JvmField val CHECK_IMAGE_BACK = of("check_image_back")

            /** An image of a check that was mailed to a recipient. */
            @JvmField val MAILED_CHECK_IMAGE = of("mailed_check_image")

            /**
             * An image to be printed on the bottom or voucher of a check that you've requested
             * Increase print.
             */
            @JvmField val CHECK_VOUCHER_IMAGE = of("check_voucher_image")

            /**
             * An image to be printed on an additional page and mailed with a check that you've
             * requested Increase print.
             */
            @JvmField val CHECK_ATTACHMENT_IMAGE = of("check_attachment_image")

            /** IRS Form SS-4. */
            @JvmField val FORM_SS_4 = of("form_ss_4")

            /** An image of a government-issued ID. */
            @JvmField val IDENTITY_DOCUMENT = of("identity_document")

            /** A file purpose not covered by any of the other cases. */
            @JvmField val OTHER = of("other")

            /** A legal document forming a trust. */
            @JvmField val TRUST_FORMATION_DOCUMENT = of("trust_formation_document")

            /**
             * A card image to be rendered inside digital wallet apps. This must be a 1536x969 pixel
             * PNG.
             */
            @JvmField val DIGITAL_WALLET_ARTWORK = of("digital_wallet_artwork")

            /**
             * An icon for you app to be rendered inside digital wallet apps. This must be a 100x100
             * pixel PNG.
             */
            @JvmField val DIGITAL_WALLET_APP_ICON = of("digital_wallet_app_icon")

            /**
             * A card image to be printed on the front of a physical card. This must be a 2100x1340
             * pixel PNG with no other color but black.
             */
            @JvmField val PHYSICAL_CARD_FRONT = of("physical_card_front")

            /**
             * An image representing the entirety of the carrier used for a physical card. This must
             * be a 2550x3300 pixel PNG with no other color but black.
             */
            @JvmField val PHYSICAL_CARD_CARRIER = of("physical_card_carrier")

            /** A document requested by Increase. */
            @JvmField val DOCUMENT_REQUEST = of("document_request")

            /** A supplemental document associated an an Entity. */
            @JvmField val ENTITY_SUPPLEMENTAL_DOCUMENT = of("entity_supplemental_document")

            /** An attachment to an Unusual Activity Report. */
            @JvmField
            val UNUSUAL_ACTIVITY_REPORT_ATTACHMENT = of("unusual_activity_report_attachment")

            @JvmStatic fun of(value: String) = Purpose(JsonField.of(value))
        }

        /** An enum containing [Purpose]'s known values. */
        enum class Known {
            /** An image of the front of a check, used for check deposits. */
            CHECK_IMAGE_FRONT,
            /** An image of the back of a check, used for check deposits. */
            CHECK_IMAGE_BACK,
            /** An image of a check that was mailed to a recipient. */
            MAILED_CHECK_IMAGE,
            /**
             * An image to be printed on the bottom or voucher of a check that you've requested
             * Increase print.
             */
            CHECK_VOUCHER_IMAGE,
            /**
             * An image to be printed on an additional page and mailed with a check that you've
             * requested Increase print.
             */
            CHECK_ATTACHMENT_IMAGE,
            /** IRS Form SS-4. */
            FORM_SS_4,
            /** An image of a government-issued ID. */
            IDENTITY_DOCUMENT,
            /** A file purpose not covered by any of the other cases. */
            OTHER,
            /** A legal document forming a trust. */
            TRUST_FORMATION_DOCUMENT,
            /**
             * A card image to be rendered inside digital wallet apps. This must be a 1536x969 pixel
             * PNG.
             */
            DIGITAL_WALLET_ARTWORK,
            /**
             * An icon for you app to be rendered inside digital wallet apps. This must be a 100x100
             * pixel PNG.
             */
            DIGITAL_WALLET_APP_ICON,
            /**
             * A card image to be printed on the front of a physical card. This must be a 2100x1340
             * pixel PNG with no other color but black.
             */
            PHYSICAL_CARD_FRONT,
            /**
             * An image representing the entirety of the carrier used for a physical card. This must
             * be a 2550x3300 pixel PNG with no other color but black.
             */
            PHYSICAL_CARD_CARRIER,
            /** A document requested by Increase. */
            DOCUMENT_REQUEST,
            /** A supplemental document associated an an Entity. */
            ENTITY_SUPPLEMENTAL_DOCUMENT,
            /** An attachment to an Unusual Activity Report. */
            UNUSUAL_ACTIVITY_REPORT_ATTACHMENT,
        }

        /**
         * An enum containing [Purpose]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Purpose] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** An image of the front of a check, used for check deposits. */
            CHECK_IMAGE_FRONT,
            /** An image of the back of a check, used for check deposits. */
            CHECK_IMAGE_BACK,
            /** An image of a check that was mailed to a recipient. */
            MAILED_CHECK_IMAGE,
            /**
             * An image to be printed on the bottom or voucher of a check that you've requested
             * Increase print.
             */
            CHECK_VOUCHER_IMAGE,
            /**
             * An image to be printed on an additional page and mailed with a check that you've
             * requested Increase print.
             */
            CHECK_ATTACHMENT_IMAGE,
            /** IRS Form SS-4. */
            FORM_SS_4,
            /** An image of a government-issued ID. */
            IDENTITY_DOCUMENT,
            /** A file purpose not covered by any of the other cases. */
            OTHER,
            /** A legal document forming a trust. */
            TRUST_FORMATION_DOCUMENT,
            /**
             * A card image to be rendered inside digital wallet apps. This must be a 1536x969 pixel
             * PNG.
             */
            DIGITAL_WALLET_ARTWORK,
            /**
             * An icon for you app to be rendered inside digital wallet apps. This must be a 100x100
             * pixel PNG.
             */
            DIGITAL_WALLET_APP_ICON,
            /**
             * A card image to be printed on the front of a physical card. This must be a 2100x1340
             * pixel PNG with no other color but black.
             */
            PHYSICAL_CARD_FRONT,
            /**
             * An image representing the entirety of the carrier used for a physical card. This must
             * be a 2550x3300 pixel PNG with no other color but black.
             */
            PHYSICAL_CARD_CARRIER,
            /** A document requested by Increase. */
            DOCUMENT_REQUEST,
            /** A supplemental document associated an an Entity. */
            ENTITY_SUPPLEMENTAL_DOCUMENT,
            /** An attachment to an Unusual Activity Report. */
            UNUSUAL_ACTIVITY_REPORT_ATTACHMENT,
            /** An enum member indicating that [Purpose] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CHECK_IMAGE_FRONT -> Value.CHECK_IMAGE_FRONT
                CHECK_IMAGE_BACK -> Value.CHECK_IMAGE_BACK
                MAILED_CHECK_IMAGE -> Value.MAILED_CHECK_IMAGE
                CHECK_VOUCHER_IMAGE -> Value.CHECK_VOUCHER_IMAGE
                CHECK_ATTACHMENT_IMAGE -> Value.CHECK_ATTACHMENT_IMAGE
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

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CHECK_IMAGE_FRONT -> Known.CHECK_IMAGE_FRONT
                CHECK_IMAGE_BACK -> Known.CHECK_IMAGE_BACK
                MAILED_CHECK_IMAGE -> Known.MAILED_CHECK_IMAGE
                CHECK_VOUCHER_IMAGE -> Known.CHECK_VOUCHER_IMAGE
                CHECK_ATTACHMENT_IMAGE -> Known.CHECK_ATTACHMENT_IMAGE
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

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                IncreaseInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Purpose && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FileCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "FileCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
