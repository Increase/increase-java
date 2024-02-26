// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Files are objects that represent a file hosted on Increase's servers. The file may have been
 * uploaded by you (for example, when uploading a check image) or it may have been created by
 * Increase (for example, an autogenerated statement PDF).
 */
@JsonDeserialize(builder = File.Builder::class)
@NoAutoDetect
class File
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val purpose: JsonField<Purpose>,
    private val description: JsonField<String>,
    private val direction: JsonField<Direction>,
    private val mimeType: JsonField<String>,
    private val filename: JsonField<String>,
    private val downloadUrl: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The time the File was created. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The File's identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * What the File will be used for. We may add additional possible values for this enum over
     * time; your application should be able to handle such additions gracefully.
     */
    fun purpose(): Purpose = purpose.getRequired("purpose")

    /** A description of the File. */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** Whether the File was generated by Increase or by you and sent to Increase. */
    fun direction(): Direction = direction.getRequired("direction")

    /** The MIME type of the file. */
    fun mimeType(): String = mimeType.getRequired("mime_type")

    /** The filename that was provided upon upload or generated by Increase. */
    fun filename(): Optional<String> = Optional.ofNullable(filename.getNullable("filename"))

    /**
     * A URL from where the File can be downloaded at this point in time. The location of this URL
     * may change over time.
     */
    fun downloadUrl(): Optional<String> =
        Optional.ofNullable(downloadUrl.getNullable("download_url"))

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /** A constant representing the object's type. For this resource it will always be `file`. */
    fun type(): Type = type.getRequired("type")

    /** The time the File was created. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The File's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * What the File will be used for. We may add additional possible values for this enum over
     * time; your application should be able to handle such additions gracefully.
     */
    @JsonProperty("purpose") @ExcludeMissing fun _purpose() = purpose

    /** A description of the File. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** Whether the File was generated by Increase or by you and sent to Increase. */
    @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

    /** The MIME type of the file. */
    @JsonProperty("mime_type") @ExcludeMissing fun _mimeType() = mimeType

    /** The filename that was provided upon upload or generated by Increase. */
    @JsonProperty("filename") @ExcludeMissing fun _filename() = filename

    /**
     * A URL from where the File can be downloaded at this point in time. The location of this URL
     * may change over time.
     */
    @JsonProperty("download_url") @ExcludeMissing fun _downloadUrl() = downloadUrl

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /** A constant representing the object's type. For this resource it will always be `file`. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): File = apply {
        if (!validated) {
            createdAt()
            id()
            purpose()
            description()
            direction()
            mimeType()
            filename()
            downloadUrl()
            idempotencyKey()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is File &&
            this.createdAt == other.createdAt &&
            this.id == other.id &&
            this.purpose == other.purpose &&
            this.description == other.description &&
            this.direction == other.direction &&
            this.mimeType == other.mimeType &&
            this.filename == other.filename &&
            this.downloadUrl == other.downloadUrl &&
            this.idempotencyKey == other.idempotencyKey &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    createdAt,
                    id,
                    purpose,
                    description,
                    direction,
                    mimeType,
                    filename,
                    downloadUrl,
                    idempotencyKey,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "File{createdAt=$createdAt, id=$id, purpose=$purpose, description=$description, direction=$direction, mimeType=$mimeType, filename=$filename, downloadUrl=$downloadUrl, idempotencyKey=$idempotencyKey, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var purpose: JsonField<Purpose> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var direction: JsonField<Direction> = JsonMissing.of()
        private var mimeType: JsonField<String> = JsonMissing.of()
        private var filename: JsonField<String> = JsonMissing.of()
        private var downloadUrl: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(file: File) = apply {
            this.createdAt = file.createdAt
            this.id = file.id
            this.purpose = file.purpose
            this.description = file.description
            this.direction = file.direction
            this.mimeType = file.mimeType
            this.filename = file.filename
            this.downloadUrl = file.downloadUrl
            this.idempotencyKey = file.idempotencyKey
            this.type = file.type
            additionalProperties(file.additionalProperties)
        }

        /** The time the File was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The time the File was created. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The File's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The File's identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * What the File will be used for. We may add additional possible values for this enum over
         * time; your application should be able to handle such additions gracefully.
         */
        fun purpose(purpose: Purpose) = purpose(JsonField.of(purpose))

        /**
         * What the File will be used for. We may add additional possible values for this enum over
         * time; your application should be able to handle such additions gracefully.
         */
        @JsonProperty("purpose")
        @ExcludeMissing
        fun purpose(purpose: JsonField<Purpose>) = apply { this.purpose = purpose }

        /** A description of the File. */
        fun description(description: String) = description(JsonField.of(description))

        /** A description of the File. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Whether the File was generated by Increase or by you and sent to Increase. */
        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /** Whether the File was generated by Increase or by you and sent to Increase. */
        @JsonProperty("direction")
        @ExcludeMissing
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /** The MIME type of the file. */
        fun mimeType(mimeType: String) = mimeType(JsonField.of(mimeType))

        /** The MIME type of the file. */
        @JsonProperty("mime_type")
        @ExcludeMissing
        fun mimeType(mimeType: JsonField<String>) = apply { this.mimeType = mimeType }

        /** The filename that was provided upon upload or generated by Increase. */
        fun filename(filename: String) = filename(JsonField.of(filename))

        /** The filename that was provided upon upload or generated by Increase. */
        @JsonProperty("filename")
        @ExcludeMissing
        fun filename(filename: JsonField<String>) = apply { this.filename = filename }

        /**
         * A URL from where the File can be downloaded at this point in time. The location of this
         * URL may change over time.
         */
        fun downloadUrl(downloadUrl: String) = downloadUrl(JsonField.of(downloadUrl))

        /**
         * A URL from where the File can be downloaded at this point in time. The location of this
         * URL may change over time.
         */
        @JsonProperty("download_url")
        @ExcludeMissing
        fun downloadUrl(downloadUrl: JsonField<String>) = apply { this.downloadUrl = downloadUrl }

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
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /**
         * A constant representing the object's type. For this resource it will always be `file`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be `file`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): File =
            File(
                createdAt,
                id,
                purpose,
                description,
                direction,
                mimeType,
                filename,
                downloadUrl,
                idempotencyKey,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Direction && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val TO_INCREASE = Direction(JsonField.of("to_increase"))

            @JvmField val FROM_INCREASE = Direction(JsonField.of("from_increase"))

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
    }

    class Purpose
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Purpose && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CHECK_IMAGE_FRONT = Purpose(JsonField.of("check_image_front"))

            @JvmField val CHECK_IMAGE_BACK = Purpose(JsonField.of("check_image_back"))

            @JvmField val MAILED_CHECK_IMAGE = Purpose(JsonField.of("mailed_check_image"))

            @JvmField val FORM_1099_INT = Purpose(JsonField.of("form_1099_int"))

            @JvmField val FORM_SS_4 = Purpose(JsonField.of("form_ss_4"))

            @JvmField val IDENTITY_DOCUMENT = Purpose(JsonField.of("identity_document"))

            @JvmField val INCREASE_STATEMENT = Purpose(JsonField.of("increase_statement"))

            @JvmField val OTHER = Purpose(JsonField.of("other"))

            @JvmField
            val TRUST_FORMATION_DOCUMENT = Purpose(JsonField.of("trust_formation_document"))

            @JvmField val DIGITAL_WALLET_ARTWORK = Purpose(JsonField.of("digital_wallet_artwork"))

            @JvmField val DIGITAL_WALLET_APP_ICON = Purpose(JsonField.of("digital_wallet_app_icon"))

            @JvmField val PHYSICAL_CARD_FRONT = Purpose(JsonField.of("physical_card_front"))

            @JvmField val PHYSICAL_CARD_BACK = Purpose(JsonField.of("physical_card_back"))

            @JvmField val PHYSICAL_CARD_CARRIER = Purpose(JsonField.of("physical_card_carrier"))

            @JvmField val DOCUMENT_REQUEST = Purpose(JsonField.of("document_request"))

            @JvmField
            val ENTITY_SUPPLEMENTAL_DOCUMENT = Purpose(JsonField.of("entity_supplemental_document"))

            @JvmField val EXPORT = Purpose(JsonField.of("export"))

            @JvmField
            val UNUSUAL_ACTIVITY_REPORT_ATTACHMENT =
                Purpose(JsonField.of("unusual_activity_report_attachment"))

            @JvmStatic fun of(value: String) = Purpose(JsonField.of(value))
        }

        enum class Known {
            CHECK_IMAGE_FRONT,
            CHECK_IMAGE_BACK,
            MAILED_CHECK_IMAGE,
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
        }

        enum class Value {
            CHECK_IMAGE_FRONT,
            CHECK_IMAGE_BACK,
            MAILED_CHECK_IMAGE,
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
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CHECK_IMAGE_FRONT -> Value.CHECK_IMAGE_FRONT
                CHECK_IMAGE_BACK -> Value.CHECK_IMAGE_BACK
                MAILED_CHECK_IMAGE -> Value.MAILED_CHECK_IMAGE
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
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CHECK_IMAGE_FRONT -> Known.CHECK_IMAGE_FRONT
                CHECK_IMAGE_BACK -> Known.CHECK_IMAGE_BACK
                MAILED_CHECK_IMAGE -> Known.MAILED_CHECK_IMAGE
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
                else -> throw IncreaseInvalidDataException("Unknown Purpose: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val FILE = Type(JsonField.of("file"))

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
    }
}
