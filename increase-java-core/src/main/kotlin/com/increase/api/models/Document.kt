// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.increase.api.core.BaseDeserializer
import com.increase.api.core.BaseSerializer
import com.increase.api.core.getOrThrow
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonField
import com.increase.api.core.Enum
import com.increase.api.core.toUnmodifiable
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException

/**
 * Increase generates certain documents / forms automatically for your application;
 * they can be listed here.
 */
@JsonDeserialize(builder = Document.Builder::class)
@NoAutoDetect
class Document private constructor(
  private val category: JsonField<Category>,
  private val createdAt: JsonField<OffsetDateTime>,
  private val entityId: JsonField<String>,
  private val fileId: JsonField<String>,
  private val id: JsonField<String>,
  private val type: JsonField<Type>,
  private val additionalProperties: Map<String, JsonValue>,

) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The type of document. */
    fun category(): Category = category.getRequired("category")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the
     * Document was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The identifier of the Entity the document was generated for. */
    fun entityId(): Optional<String> = Optional.ofNullable(entityId.getNullable("entity_id"))

    /** The identifier of the File containing the Document's contents. */
    fun fileId(): String = fileId.getRequired("file_id")

    /** The Document identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `document`.
     */
    fun type(): Type = type.getRequired("type")

    /** The type of document. */
    @JsonProperty("category")
    @ExcludeMissing
    fun _category() = category

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the
     * Document was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt() = createdAt

    /** The identifier of the Entity the document was generated for. */
    @JsonProperty("entity_id")
    @ExcludeMissing
    fun _entityId() = entityId

    /** The identifier of the File containing the Document's contents. */
    @JsonProperty("file_id")
    @ExcludeMissing
    fun _fileId() = fileId

    /** The Document identifier. */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id() = id

    /**
     * A constant representing the object's type. For this resource it will always be
     * `document`.
     */
    @JsonProperty("type")
    @ExcludeMissing
    fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Document = apply {
        if (!validated) {
          category()
          createdAt()
          entityId()
          fileId()
          id()
          type()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is Document &&
          this.category == other.category &&
          this.createdAt == other.createdAt &&
          this.entityId == other.entityId &&
          this.fileId == other.fileId &&
          this.id == other.id &&
          this.type == other.type &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            category,
            createdAt,
            entityId,
            fileId,
            id,
            type,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "Document{category=$category, createdAt=$createdAt, entityId=$entityId, fileId=$fileId, id=$id, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var category: JsonField<Category> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var entityId: JsonField<String> = JsonMissing.of()
        private var fileId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(document: Document) = apply {
            this.category = document.category
            this.createdAt = document.createdAt
            this.entityId = document.entityId
            this.fileId = document.fileId
            this.id = document.id
            this.type = document.type
            additionalProperties(document.additionalProperties)
        }

        /** The type of document. */
        fun category(category: Category) = category(JsonField.of(category))

        /** The type of document. */
        @JsonProperty("category")
        @ExcludeMissing
        fun category(category: JsonField<Category>) = apply {
            this.category = category
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the
         * Document was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the
         * Document was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
            this.createdAt = createdAt
        }

        /** The identifier of the Entity the document was generated for. */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /** The identifier of the Entity the document was generated for. */
        @JsonProperty("entity_id")
        @ExcludeMissing
        fun entityId(entityId: JsonField<String>) = apply {
            this.entityId = entityId
        }

        /** The identifier of the File containing the Document's contents. */
        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

        /** The identifier of the File containing the Document's contents. */
        @JsonProperty("file_id")
        @ExcludeMissing
        fun fileId(fileId: JsonField<String>) = apply {
            this.fileId = fileId
        }

        /** The Document identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Document identifier. */
        @JsonProperty("id")
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply {
            this.id = id
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `document`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `document`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply {
            this.type = type
        }

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

        fun build(): Document = Document(
            category,
            createdAt,
            entityId,
            fileId,
            id,
            type,
            additionalProperties.toUnmodifiable(),
        )
    }

    class Category @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Category &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val FORM_1099_INT = Category(JsonField.of("form_1099_int"))

            @JvmField val PROOF_OF_AUTHORIZATION = Category(JsonField.of("proof_of_authorization"))

            @JvmField val COMPANY_INFORMATION = Category(JsonField.of("company_information"))

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        enum class Known {
            FORM_1099_INT,
            PROOF_OF_AUTHORIZATION,
            COMPANY_INFORMATION,
        }

        enum class Value {
            FORM_1099_INT,
            PROOF_OF_AUTHORIZATION,
            COMPANY_INFORMATION,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            FORM_1099_INT -> Value.FORM_1099_INT
            PROOF_OF_AUTHORIZATION -> Value.PROOF_OF_AUTHORIZATION
            COMPANY_INFORMATION -> Value.COMPANY_INFORMATION
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            FORM_1099_INT -> Known.FORM_1099_INT
            PROOF_OF_AUTHORIZATION -> Known.PROOF_OF_AUTHORIZATION
            COMPANY_INFORMATION -> Known.COMPANY_INFORMATION
            else -> throw IncreaseInvalidDataException("Unknown Category: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Type &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val DOCUMENT = Type(JsonField.of("document"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            DOCUMENT,
        }

        enum class Value {
            DOCUMENT,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            DOCUMENT -> Value.DOCUMENT
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            DOCUMENT -> Known.DOCUMENT
            else -> throw IncreaseInvalidDataException("Unknown Type: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
