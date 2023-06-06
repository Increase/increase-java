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

/** Supplemental Documents are uploaded files connected to an Entity during onboarding. */
@JsonDeserialize(builder = SupplementalDocument.Builder::class)
@NoAutoDetect
class SupplementalDocument
private constructor(
    private val fileId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The File containing the document. */
    fun fileId(): String = fileId.getRequired("file_id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Supplemental
     * Document was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `entity_supplemental_document`.
     */
    fun type(): Type = type.getRequired("type")

    /** The File containing the document. */
    @JsonProperty("file_id") @ExcludeMissing fun _fileId() = fileId

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Supplemental
     * Document was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /**
     * A constant representing the object's type. For this resource it will always be
     * `entity_supplemental_document`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SupplementalDocument = apply {
        if (!validated) {
            fileId()
            createdAt()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SupplementalDocument &&
            this.fileId == other.fileId &&
            this.createdAt == other.createdAt &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    fileId,
                    createdAt,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "SupplementalDocument{fileId=$fileId, createdAt=$createdAt, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var fileId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(supplementalDocument: SupplementalDocument) = apply {
            this.fileId = supplementalDocument.fileId
            this.createdAt = supplementalDocument.createdAt
            this.type = supplementalDocument.type
            additionalProperties(supplementalDocument.additionalProperties)
        }

        /** The File containing the document. */
        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

        /** The File containing the document. */
        @JsonProperty("file_id")
        @ExcludeMissing
        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Supplemental
         * Document was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Supplemental
         * Document was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `entity_supplemental_document`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `entity_supplemental_document`.
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

        fun build(): SupplementalDocument =
            SupplementalDocument(
                fileId,
                createdAt,
                type,
                additionalProperties.toUnmodifiable(),
            )
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

            @JvmField
            val ENTITY_SUPPLEMENTAL_DOCUMENT = Type(JsonField.of("entity_supplemental_document"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            ENTITY_SUPPLEMENTAL_DOCUMENT,
        }

        enum class Value {
            ENTITY_SUPPLEMENTAL_DOCUMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ENTITY_SUPPLEMENTAL_DOCUMENT -> Value.ENTITY_SUPPLEMENTAL_DOCUMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ENTITY_SUPPLEMENTAL_DOCUMENT -> Known.ENTITY_SUPPLEMENTAL_DOCUMENT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
