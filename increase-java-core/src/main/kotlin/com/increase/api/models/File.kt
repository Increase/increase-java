// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.checkRequired
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Files are objects that represent a file hosted on Increase's servers. The file may have been
 * uploaded by you (for example, when uploading a check image) or it may have been created by
 * Increase (for example, an autogenerated statement PDF).
 */
@NoAutoDetect
class File
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("direction")
    @ExcludeMissing
    private val direction: JsonField<Direction> = JsonMissing.of(),
    @JsonProperty("download_url")
    @ExcludeMissing
    private val downloadUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("filename")
    @ExcludeMissing
    private val filename: JsonField<String> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("mime_type")
    @ExcludeMissing
    private val mimeType: JsonField<String> = JsonMissing.of(),
    @JsonProperty("purpose")
    @ExcludeMissing
    private val purpose: JsonField<Purpose> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The File's identifier. */
    fun id(): String = id.getRequired("id")

    /** The time the File was created. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** A description of the File. */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** Whether the File was generated by Increase or by you and sent to Increase. */
    fun direction(): Direction = direction.getRequired("direction")

    /**
     * A URL from where the File can be downloaded at this point in time. The location of this URL
     * may change over time.
     */
    fun downloadUrl(): Optional<String> =
        Optional.ofNullable(downloadUrl.getNullable("download_url"))

    /** The filename that was provided upon upload or generated by Increase. */
    fun filename(): Optional<String> = Optional.ofNullable(filename.getNullable("filename"))

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /** The MIME type of the file. */
    fun mimeType(): String = mimeType.getRequired("mime_type")

    /**
     * What the File will be used for. We may add additional possible values for this enum over
     * time; your application should be able to handle such additions gracefully.
     */
    fun purpose(): Purpose = purpose.getRequired("purpose")

    /** A constant representing the object's type. For this resource it will always be `file`. */
    fun type(): Type = type.getRequired("type")

    /** The File's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The time the File was created. */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** A description of the File. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /** Whether the File was generated by Increase or by you and sent to Increase. */
    @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<Direction> = direction

    /**
     * A URL from where the File can be downloaded at this point in time. The location of this URL
     * may change over time.
     */
    @JsonProperty("download_url")
    @ExcludeMissing
    fun _downloadUrl(): JsonField<String> = downloadUrl

    /** The filename that was provided upon upload or generated by Increase. */
    @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /** The MIME type of the file. */
    @JsonProperty("mime_type") @ExcludeMissing fun _mimeType(): JsonField<String> = mimeType

    /**
     * What the File will be used for. We may add additional possible values for this enum over
     * time; your application should be able to handle such additions gracefully.
     */
    @JsonProperty("purpose") @ExcludeMissing fun _purpose(): JsonField<Purpose> = purpose

    /** A constant representing the object's type. For this resource it will always be `file`. */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): File = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        description()
        direction()
        downloadUrl()
        filename()
        idempotencyKey()
        mimeType()
        purpose()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [File]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var direction: JsonField<Direction>? = null
        private var downloadUrl: JsonField<String>? = null
        private var filename: JsonField<String>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var mimeType: JsonField<String>? = null
        private var purpose: JsonField<Purpose>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(file: File) = apply {
            id = file.id
            createdAt = file.createdAt
            description = file.description
            direction = file.direction
            downloadUrl = file.downloadUrl
            filename = file.filename
            idempotencyKey = file.idempotencyKey
            mimeType = file.mimeType
            purpose = file.purpose
            type = file.type
            additionalProperties = file.additionalProperties.toMutableMap()
        }

        /** The File's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The File's identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The time the File was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The time the File was created. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** A description of the File. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** A description of the File. */
        fun description(description: Optional<String>) = description(description.orElse(null))

        /** A description of the File. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Whether the File was generated by Increase or by you and sent to Increase. */
        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /** Whether the File was generated by Increase or by you and sent to Increase. */
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /**
         * A URL from where the File can be downloaded at this point in time. The location of this
         * URL may change over time.
         */
        fun downloadUrl(downloadUrl: String?) = downloadUrl(JsonField.ofNullable(downloadUrl))

        /**
         * A URL from where the File can be downloaded at this point in time. The location of this
         * URL may change over time.
         */
        fun downloadUrl(downloadUrl: Optional<String>) = downloadUrl(downloadUrl.orElse(null))

        /**
         * A URL from where the File can be downloaded at this point in time. The location of this
         * URL may change over time.
         */
        fun downloadUrl(downloadUrl: JsonField<String>) = apply { this.downloadUrl = downloadUrl }

        /** The filename that was provided upon upload or generated by Increase. */
        fun filename(filename: String?) = filename(JsonField.ofNullable(filename))

        /** The filename that was provided upon upload or generated by Increase. */
        fun filename(filename: Optional<String>) = filename(filename.orElse(null))

        /** The filename that was provided upon upload or generated by Increase. */
        fun filename(filename: JsonField<String>) = apply { this.filename = filename }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) =
            idempotencyKey(JsonField.ofNullable(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.orElse(null))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /** The MIME type of the file. */
        fun mimeType(mimeType: String) = mimeType(JsonField.of(mimeType))

        /** The MIME type of the file. */
        fun mimeType(mimeType: JsonField<String>) = apply { this.mimeType = mimeType }

        /**
         * What the File will be used for. We may add additional possible values for this enum over
         * time; your application should be able to handle such additions gracefully.
         */
        fun purpose(purpose: Purpose) = purpose(JsonField.of(purpose))

        /**
         * What the File will be used for. We may add additional possible values for this enum over
         * time; your application should be able to handle such additions gracefully.
         */
        fun purpose(purpose: JsonField<Purpose>) = apply { this.purpose = purpose }

        /**
         * A constant representing the object's type. For this resource it will always be `file`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be `file`.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): File =
            File(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("description", description),
                checkRequired("direction", direction),
                checkRequired("downloadUrl", downloadUrl),
                checkRequired("filename", filename),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("mimeType", mimeType),
                checkRequired("purpose", purpose),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /** Whether the File was generated by Increase or by you and sent to Increase. */
    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            /** This File was sent by you to Increase. */
            @JvmField val TO_INCREASE = of("to_increase")

            /** This File was generated by Increase. */
            @JvmField val FROM_INCREASE = of("from_increase")

            @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
        }

        /** An enum containing [Direction]'s known values. */
        enum class Known {
            /** This File was sent by you to Increase. */
            TO_INCREASE,
            /** This File was generated by Increase. */
            FROM_INCREASE,
        }

        /**
         * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Direction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** This File was sent by you to Increase. */
            TO_INCREASE,
            /** This File was generated by Increase. */
            FROM_INCREASE,
            /**
             * An enum member indicating that [Direction] was instantiated with an unknown value.
             */
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
                TO_INCREASE -> Value.TO_INCREASE
                FROM_INCREASE -> Value.FROM_INCREASE
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
                TO_INCREASE -> Known.TO_INCREASE
                FROM_INCREASE -> Known.FROM_INCREASE
                else -> throw IncreaseInvalidDataException("Unknown Direction: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * What the File will be used for. We may add additional possible values for this enum over
     * time; your application should be able to handle such additions gracefully.
     */
    class Purpose
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            /**
             * An image of the front of a deposited check after processing by Increase and
             * submission to the Federal Reserve.
             */
            @JvmField val PROCESSED_CHECK_IMAGE_FRONT = of("processed_check_image_front")

            /**
             * An image of the back of a deposited check after processing by Increase and submission
             * to the Federal Reserve.
             */
            @JvmField val PROCESSED_CHECK_IMAGE_BACK = of("processed_check_image_back")

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

            /** A scanned mail item sent to Increase. */
            @JvmField val INBOUND_MAIL_ITEM = of("inbound_mail_item")

            /** IRS Form 1099-INT. */
            @JvmField val FORM_1099_INT = of("form_1099_int")

            /** IRS Form 1099-MISC. */
            @JvmField val FORM_1099_MISC = of("form_1099_misc")

            /** IRS Form SS-4. */
            @JvmField val FORM_SS_4 = of("form_ss_4")

            /** An image of a government-issued ID. */
            @JvmField val IDENTITY_DOCUMENT = of("identity_document")

            /** A statement generated by Increase. */
            @JvmField val INCREASE_STATEMENT = of("increase_statement")

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

            /** The image to be printed on the back of a physical card. */
            @JvmField val PHYSICAL_CARD_BACK = of("physical_card_back")

            /**
             * An image representing the entirety of the carrier used for a physical card. This must
             * be a 2550x3300 pixel PNG with no other color but black.
             */
            @JvmField val PHYSICAL_CARD_CARRIER = of("physical_card_carrier")

            /** A document requested by Increase. */
            @JvmField val DOCUMENT_REQUEST = of("document_request")

            /** A supplemental document associated an an Entity. */
            @JvmField val ENTITY_SUPPLEMENTAL_DOCUMENT = of("entity_supplemental_document")

            /** The results of an Export you requested via the dashboard or API. */
            @JvmField val EXPORT = of("export")

            /** An attachment to an Unusual Activity Report. */
            @JvmField
            val UNUSUAL_ACTIVITY_REPORT_ATTACHMENT = of("unusual_activity_report_attachment")

            /** A document granting another entity access to the funds into your account. */
            @JvmField
            val DEPOSIT_ACCOUNT_CONTROL_AGREEMENT = of("deposit_account_control_agreement")

            @JvmStatic fun of(value: String) = Purpose(JsonField.of(value))
        }

        /** An enum containing [Purpose]'s known values. */
        enum class Known {
            /** An image of the front of a check, used for check deposits. */
            CHECK_IMAGE_FRONT,
            /** An image of the back of a check, used for check deposits. */
            CHECK_IMAGE_BACK,
            /**
             * An image of the front of a deposited check after processing by Increase and
             * submission to the Federal Reserve.
             */
            PROCESSED_CHECK_IMAGE_FRONT,
            /**
             * An image of the back of a deposited check after processing by Increase and submission
             * to the Federal Reserve.
             */
            PROCESSED_CHECK_IMAGE_BACK,
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
            /** A scanned mail item sent to Increase. */
            INBOUND_MAIL_ITEM,
            /** IRS Form 1099-INT. */
            FORM_1099_INT,
            /** IRS Form 1099-MISC. */
            FORM_1099_MISC,
            /** IRS Form SS-4. */
            FORM_SS_4,
            /** An image of a government-issued ID. */
            IDENTITY_DOCUMENT,
            /** A statement generated by Increase. */
            INCREASE_STATEMENT,
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
            /** The image to be printed on the back of a physical card. */
            PHYSICAL_CARD_BACK,
            /**
             * An image representing the entirety of the carrier used for a physical card. This must
             * be a 2550x3300 pixel PNG with no other color but black.
             */
            PHYSICAL_CARD_CARRIER,
            /** A document requested by Increase. */
            DOCUMENT_REQUEST,
            /** A supplemental document associated an an Entity. */
            ENTITY_SUPPLEMENTAL_DOCUMENT,
            /** The results of an Export you requested via the dashboard or API. */
            EXPORT,
            /** An attachment to an Unusual Activity Report. */
            UNUSUAL_ACTIVITY_REPORT_ATTACHMENT,
            /** A document granting another entity access to the funds into your account. */
            DEPOSIT_ACCOUNT_CONTROL_AGREEMENT,
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
            /**
             * An image of the front of a deposited check after processing by Increase and
             * submission to the Federal Reserve.
             */
            PROCESSED_CHECK_IMAGE_FRONT,
            /**
             * An image of the back of a deposited check after processing by Increase and submission
             * to the Federal Reserve.
             */
            PROCESSED_CHECK_IMAGE_BACK,
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
            /** A scanned mail item sent to Increase. */
            INBOUND_MAIL_ITEM,
            /** IRS Form 1099-INT. */
            FORM_1099_INT,
            /** IRS Form 1099-MISC. */
            FORM_1099_MISC,
            /** IRS Form SS-4. */
            FORM_SS_4,
            /** An image of a government-issued ID. */
            IDENTITY_DOCUMENT,
            /** A statement generated by Increase. */
            INCREASE_STATEMENT,
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
            /** The image to be printed on the back of a physical card. */
            PHYSICAL_CARD_BACK,
            /**
             * An image representing the entirety of the carrier used for a physical card. This must
             * be a 2550x3300 pixel PNG with no other color but black.
             */
            PHYSICAL_CARD_CARRIER,
            /** A document requested by Increase. */
            DOCUMENT_REQUEST,
            /** A supplemental document associated an an Entity. */
            ENTITY_SUPPLEMENTAL_DOCUMENT,
            /** The results of an Export you requested via the dashboard or API. */
            EXPORT,
            /** An attachment to an Unusual Activity Report. */
            UNUSUAL_ACTIVITY_REPORT_ATTACHMENT,
            /** A document granting another entity access to the funds into your account. */
            DEPOSIT_ACCOUNT_CONTROL_AGREEMENT,
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
                PROCESSED_CHECK_IMAGE_FRONT -> Value.PROCESSED_CHECK_IMAGE_FRONT
                PROCESSED_CHECK_IMAGE_BACK -> Value.PROCESSED_CHECK_IMAGE_BACK
                MAILED_CHECK_IMAGE -> Value.MAILED_CHECK_IMAGE
                CHECK_VOUCHER_IMAGE -> Value.CHECK_VOUCHER_IMAGE
                CHECK_ATTACHMENT_IMAGE -> Value.CHECK_ATTACHMENT_IMAGE
                INBOUND_MAIL_ITEM -> Value.INBOUND_MAIL_ITEM
                FORM_1099_INT -> Value.FORM_1099_INT
                FORM_1099_MISC -> Value.FORM_1099_MISC
                FORM_SS_4 -> Value.FORM_SS_4
                IDENTITY_DOCUMENT -> Value.IDENTITY_DOCUMENT
                INCREASE_STATEMENT -> Value.INCREASE_STATEMENT
                OTHER -> Value.OTHER
                TRUST_FORMATION_DOCUMENT -> Value.TRUST_FORMATION_DOCUMENT
                DIGITAL_WALLET_ARTWORK -> Value.DIGITAL_WALLET_ARTWORK
                DIGITAL_WALLET_APP_ICON -> Value.DIGITAL_WALLET_APP_ICON
                PHYSICAL_CARD_FRONT -> Value.PHYSICAL_CARD_FRONT
                PHYSICAL_CARD_BACK -> Value.PHYSICAL_CARD_BACK
                PHYSICAL_CARD_CARRIER -> Value.PHYSICAL_CARD_CARRIER
                DOCUMENT_REQUEST -> Value.DOCUMENT_REQUEST
                ENTITY_SUPPLEMENTAL_DOCUMENT -> Value.ENTITY_SUPPLEMENTAL_DOCUMENT
                EXPORT -> Value.EXPORT
                UNUSUAL_ACTIVITY_REPORT_ATTACHMENT -> Value.UNUSUAL_ACTIVITY_REPORT_ATTACHMENT
                DEPOSIT_ACCOUNT_CONTROL_AGREEMENT -> Value.DEPOSIT_ACCOUNT_CONTROL_AGREEMENT
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
                PROCESSED_CHECK_IMAGE_FRONT -> Known.PROCESSED_CHECK_IMAGE_FRONT
                PROCESSED_CHECK_IMAGE_BACK -> Known.PROCESSED_CHECK_IMAGE_BACK
                MAILED_CHECK_IMAGE -> Known.MAILED_CHECK_IMAGE
                CHECK_VOUCHER_IMAGE -> Known.CHECK_VOUCHER_IMAGE
                CHECK_ATTACHMENT_IMAGE -> Known.CHECK_ATTACHMENT_IMAGE
                INBOUND_MAIL_ITEM -> Known.INBOUND_MAIL_ITEM
                FORM_1099_INT -> Known.FORM_1099_INT
                FORM_1099_MISC -> Known.FORM_1099_MISC
                FORM_SS_4 -> Known.FORM_SS_4
                IDENTITY_DOCUMENT -> Known.IDENTITY_DOCUMENT
                INCREASE_STATEMENT -> Known.INCREASE_STATEMENT
                OTHER -> Known.OTHER
                TRUST_FORMATION_DOCUMENT -> Known.TRUST_FORMATION_DOCUMENT
                DIGITAL_WALLET_ARTWORK -> Known.DIGITAL_WALLET_ARTWORK
                DIGITAL_WALLET_APP_ICON -> Known.DIGITAL_WALLET_APP_ICON
                PHYSICAL_CARD_FRONT -> Known.PHYSICAL_CARD_FRONT
                PHYSICAL_CARD_BACK -> Known.PHYSICAL_CARD_BACK
                PHYSICAL_CARD_CARRIER -> Known.PHYSICAL_CARD_CARRIER
                DOCUMENT_REQUEST -> Known.DOCUMENT_REQUEST
                ENTITY_SUPPLEMENTAL_DOCUMENT -> Known.ENTITY_SUPPLEMENTAL_DOCUMENT
                EXPORT -> Known.EXPORT
                UNUSUAL_ACTIVITY_REPORT_ATTACHMENT -> Known.UNUSUAL_ACTIVITY_REPORT_ATTACHMENT
                DEPOSIT_ACCOUNT_CONTROL_AGREEMENT -> Known.DEPOSIT_ACCOUNT_CONTROL_AGREEMENT
                else -> throw IncreaseInvalidDataException("Unknown Purpose: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Purpose && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** A constant representing the object's type. For this resource it will always be `file`. */
    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            @JvmField val FILE = of("file")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            FILE,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FILE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                FILE -> Value.FILE
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
                FILE -> Known.FILE
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is File && id == other.id && createdAt == other.createdAt && description == other.description && direction == other.direction && downloadUrl == other.downloadUrl && filename == other.filename && idempotencyKey == other.idempotencyKey && mimeType == other.mimeType && purpose == other.purpose && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, description, direction, downloadUrl, filename, idempotencyKey, mimeType, purpose, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "File{id=$id, createdAt=$createdAt, description=$description, direction=$direction, downloadUrl=$downloadUrl, filename=$filename, idempotencyKey=$idempotencyKey, mimeType=$mimeType, purpose=$purpose, type=$type, additionalProperties=$additionalProperties}"
}
