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

/** Supplemental Documents are uploaded files connected to an Entity during onboarding. */
@NoAutoDetect
class EntitySupplementalDocument
@JsonCreator
private constructor(
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("entity_id")
    @ExcludeMissing
    private val entityId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("file_id")
    @ExcludeMissing
    private val fileId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Supplemental
     * Document was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The Entity the supplemental document is attached to. */
    fun entityId(): String = entityId.getRequired("entity_id")

    /** The File containing the document. */
    fun fileId(): String = fileId.getRequired("file_id")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `entity_supplemental_document`.
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Supplemental
     * Document was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The Entity the supplemental document is attached to. */
    @JsonProperty("entity_id") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

    /** The File containing the document. */
    @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * A constant representing the object's type. For this resource it will always be
     * `entity_supplemental_document`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EntitySupplementalDocument = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        entityId()
        fileId()
        idempotencyKey()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var entityId: JsonField<String>? = null
        private var fileId: JsonField<String>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(entitySupplementalDocument: EntitySupplementalDocument) = apply {
            createdAt = entitySupplementalDocument.createdAt
            entityId = entitySupplementalDocument.entityId
            fileId = entitySupplementalDocument.fileId
            idempotencyKey = entitySupplementalDocument.idempotencyKey
            type = entitySupplementalDocument.type
            additionalProperties = entitySupplementalDocument.additionalProperties.toMutableMap()
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Supplemental
         * Document was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Supplemental
         * Document was created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The Entity the supplemental document is attached to. */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /** The Entity the supplemental document is attached to. */
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        /** The File containing the document. */
        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

        /** The File containing the document. */
        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

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

        /**
         * A constant representing the object's type. For this resource it will always be
         * `entity_supplemental_document`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `entity_supplemental_document`.
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

        fun build(): EntitySupplementalDocument =
            EntitySupplementalDocument(
                checkRequired("createdAt", createdAt),
                checkRequired("entityId", entityId),
                checkRequired("fileId", fileId),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ENTITY_SUPPLEMENTAL_DOCUMENT = of("entity_supplemental_document")

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

        return /* spotless:off */ other is EntitySupplementalDocument && createdAt == other.createdAt && entityId == other.entityId && fileId == other.fileId && idempotencyKey == other.idempotencyKey && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(createdAt, entityId, fileId, idempotencyKey, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EntitySupplementalDocument{createdAt=$createdAt, entityId=$entityId, fileId=$fileId, idempotencyKey=$idempotencyKey, type=$type, additionalProperties=$additionalProperties}"
}
