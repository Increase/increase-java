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
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The time the File was created. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** A description of the File. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** Whether the File was generated by Increase or by you and sent to Increase. */
    @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

    /**
     * A URL from where the File can be downloaded at this point in time. The location of this URL
     * may change over time.
     */
    @JsonProperty("download_url") @ExcludeMissing fun _downloadUrl() = downloadUrl

    /** The filename that was provided upon upload or generated by Increase. */
    @JsonProperty("filename") @ExcludeMissing fun _filename() = filename

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /** The MIME type of the file. */
    @JsonProperty("mime_type") @ExcludeMissing fun _mimeType() = mimeType

    /**
     * What the File will be used for. We may add additional possible values for this enum over
     * time; your application should be able to handle such additions gracefully.
     */
    @JsonProperty("purpose") @ExcludeMissing fun _purpose() = purpose

    /** A constant representing the object's type. For this resource it will always be `file`. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): File = apply {
        if (!validated) {
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
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var direction: JsonField<Direction> = JsonMissing.of()
        private var downloadUrl: JsonField<String> = JsonMissing.of()
        private var filename: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var mimeType: JsonField<String> = JsonMissing.of()
        private var purpose: JsonField<Purpose> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
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
        fun description(description: String) = description(JsonField.of(description))

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
        fun downloadUrl(downloadUrl: String) = downloadUrl(JsonField.of(downloadUrl))

        /**
         * A URL from where the File can be downloaded at this point in time. The location of this
         * URL may change over time.
         */
        fun downloadUrl(downloadUrl: JsonField<String>) = apply { this.downloadUrl = downloadUrl }

        /** The filename that was provided upon upload or generated by Increase. */
        fun filename(filename: String) = filename(JsonField.of(filename))

        /** The filename that was provided upon upload or generated by Increase. */
        fun filename(filename: JsonField<String>) = apply { this.filename = filename }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String) = idempotencyKey(JsonField.of(idempotencyKey))

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
                id,
                createdAt,
                description,
                direction,
                downloadUrl,
                filename,
                idempotencyKey,
                mimeType,
                purpose,
                type,
                additionalProperties.toImmutable(),
            )
    }

    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val TO_INCREASE = of("to_increase")

            @JvmField val FROM_INCREASE = of("from_increase")

            @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
        }

        enum class Known {
            TO_INCREASE,
            FROM_INCREASE,
        }

        enum class Value {
            TO_INCREASE,
            FROM_INCREASE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                TO_INCREASE -> Value.TO_INCREASE
                FROM_INCREASE -> Value.FROM_INCREASE
                else -> Value._UNKNOWN
            }

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

    class Purpose
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CHECK_IMAGE_FRONT = of("check_image_front")

            @JvmField val CHECK_IMAGE_BACK = of("check_image_back")

            @JvmField val PROCESSED_CHECK_IMAGE_FRONT = of("processed_check_image_front")

            @JvmField val PROCESSED_CHECK_IMAGE_BACK = of("processed_check_image_back")

            @JvmField val MAILED_CHECK_IMAGE = of("mailed_check_image")

            @JvmField val CHECK_VOUCHER_IMAGE = of("check_voucher_image")

            @JvmField val INBOUND_MAIL_ITEM = of("inbound_mail_item")

            @JvmField val FORM_1099_INT = of("form_1099_int")

            @JvmField val FORM_SS_4 = of("form_ss_4")

            @JvmField val IDENTITY_DOCUMENT = of("identity_document")

            @JvmField val INCREASE_STATEMENT = of("increase_statement")

            @JvmField val OTHER = of("other")

            @JvmField val TRUST_FORMATION_DOCUMENT = of("trust_formation_document")

            @JvmField val DIGITAL_WALLET_ARTWORK = of("digital_wallet_artwork")

            @JvmField val DIGITAL_WALLET_APP_ICON = of("digital_wallet_app_icon")

            @JvmField val PHYSICAL_CARD_FRONT = of("physical_card_front")

            @JvmField val PHYSICAL_CARD_BACK = of("physical_card_back")

            @JvmField val PHYSICAL_CARD_CARRIER = of("physical_card_carrier")

            @JvmField val DOCUMENT_REQUEST = of("document_request")

            @JvmField val ENTITY_SUPPLEMENTAL_DOCUMENT = of("entity_supplemental_document")

            @JvmField val EXPORT = of("export")

            @JvmField
            val UNUSUAL_ACTIVITY_REPORT_ATTACHMENT = of("unusual_activity_report_attachment")

            @JvmField
            val DEPOSIT_ACCOUNT_CONTROL_AGREEMENT = of("deposit_account_control_agreement")

            @JvmStatic fun of(value: String) = Purpose(JsonField.of(value))
        }

        enum class Known {
            CHECK_IMAGE_FRONT,
            CHECK_IMAGE_BACK,
            PROCESSED_CHECK_IMAGE_FRONT,
            PROCESSED_CHECK_IMAGE_BACK,
            MAILED_CHECK_IMAGE,
            CHECK_VOUCHER_IMAGE,
            INBOUND_MAIL_ITEM,
            FORM_1099_INT,
            FORM_SS_4,
            IDENTITY_DOCUMENT,
            INCREASE_STATEMENT,
            OTHER,
            TRUST_FORMATION_DOCUMENT,
            DIGITAL_WALLET_ARTWORK,
            DIGITAL_WALLET_APP_ICON,
            PHYSICAL_CARD_FRONT,
            PHYSICAL_CARD_BACK,
            PHYSICAL_CARD_CARRIER,
            DOCUMENT_REQUEST,
            ENTITY_SUPPLEMENTAL_DOCUMENT,
            EXPORT,
            UNUSUAL_ACTIVITY_REPORT_ATTACHMENT,
            DEPOSIT_ACCOUNT_CONTROL_AGREEMENT,
        }

        enum class Value {
            CHECK_IMAGE_FRONT,
            CHECK_IMAGE_BACK,
            PROCESSED_CHECK_IMAGE_FRONT,
            PROCESSED_CHECK_IMAGE_BACK,
            MAILED_CHECK_IMAGE,
            CHECK_VOUCHER_IMAGE,
            INBOUND_MAIL_ITEM,
            FORM_1099_INT,
            FORM_SS_4,
            IDENTITY_DOCUMENT,
            INCREASE_STATEMENT,
            OTHER,
            TRUST_FORMATION_DOCUMENT,
            DIGITAL_WALLET_ARTWORK,
            DIGITAL_WALLET_APP_ICON,
            PHYSICAL_CARD_FRONT,
            PHYSICAL_CARD_BACK,
            PHYSICAL_CARD_CARRIER,
            DOCUMENT_REQUEST,
            ENTITY_SUPPLEMENTAL_DOCUMENT,
            EXPORT,
            UNUSUAL_ACTIVITY_REPORT_ATTACHMENT,
            DEPOSIT_ACCOUNT_CONTROL_AGREEMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CHECK_IMAGE_FRONT -> Value.CHECK_IMAGE_FRONT
                CHECK_IMAGE_BACK -> Value.CHECK_IMAGE_BACK
                PROCESSED_CHECK_IMAGE_FRONT -> Value.PROCESSED_CHECK_IMAGE_FRONT
                PROCESSED_CHECK_IMAGE_BACK -> Value.PROCESSED_CHECK_IMAGE_BACK
                MAILED_CHECK_IMAGE -> Value.MAILED_CHECK_IMAGE
                CHECK_VOUCHER_IMAGE -> Value.CHECK_VOUCHER_IMAGE
                INBOUND_MAIL_ITEM -> Value.INBOUND_MAIL_ITEM
                FORM_1099_INT -> Value.FORM_1099_INT
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

        fun known(): Known =
            when (this) {
                CHECK_IMAGE_FRONT -> Known.CHECK_IMAGE_FRONT
                CHECK_IMAGE_BACK -> Known.CHECK_IMAGE_BACK
                PROCESSED_CHECK_IMAGE_FRONT -> Known.PROCESSED_CHECK_IMAGE_FRONT
                PROCESSED_CHECK_IMAGE_BACK -> Known.PROCESSED_CHECK_IMAGE_BACK
                MAILED_CHECK_IMAGE -> Known.MAILED_CHECK_IMAGE
                CHECK_VOUCHER_IMAGE -> Known.CHECK_VOUCHER_IMAGE
                INBOUND_MAIL_ITEM -> Known.INBOUND_MAIL_ITEM
                FORM_1099_INT -> Known.FORM_1099_INT
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

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val FILE = of("file")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            FILE,
        }

        enum class Value {
            FILE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                FILE -> Value.FILE
                else -> Value._UNKNOWN
            }

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
