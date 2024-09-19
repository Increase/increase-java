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
 * When a user authorizes your OAuth application, an OAuth Connection object is
 * created. Learn more about OAuth
 * [here](https://increase.com/documentation/oauth).
 */
@JsonDeserialize(builder = OAuthConnection.Builder::class)
@NoAutoDetect
class OAuthConnection private constructor(
  private val createdAt: JsonField<OffsetDateTime>,
  private val deletedAt: JsonField<OffsetDateTime>,
  private val groupId: JsonField<String>,
  private val id: JsonField<String>,
  private val status: JsonField<Status>,
  private val type: JsonField<Type>,
  private val additionalProperties: Map<String, JsonValue>,

) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth
     * Connection was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth
     * Connection was deleted.
     */
    fun deletedAt(): Optional<OffsetDateTime> = Optional.ofNullable(deletedAt.getNullable("deleted_at"))

    /** The identifier of the Group that has authorized your OAuth application. */
    fun groupId(): String = groupId.getRequired("group_id")

    /** The OAuth Connection's identifier. */
    fun id(): String = id.getRequired("id")

    /** Whether the connection is active. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `oauth_connection`.
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth
     * Connection was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt() = createdAt

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth
     * Connection was deleted.
     */
    @JsonProperty("deleted_at")
    @ExcludeMissing
    fun _deletedAt() = deletedAt

    /** The identifier of the Group that has authorized your OAuth application. */
    @JsonProperty("group_id")
    @ExcludeMissing
    fun _groupId() = groupId

    /** The OAuth Connection's identifier. */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id() = id

    /** Whether the connection is active. */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status() = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `oauth_connection`.
     */
    @JsonProperty("type")
    @ExcludeMissing
    fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): OAuthConnection = apply {
        if (!validated) {
          createdAt()
          deletedAt()
          groupId()
          id()
          status()
          type()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is OAuthConnection &&
          this.createdAt == other.createdAt &&
          this.deletedAt == other.deletedAt &&
          this.groupId == other.groupId &&
          this.id == other.id &&
          this.status == other.status &&
          this.type == other.type &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            createdAt,
            deletedAt,
            groupId,
            id,
            status,
            type,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "OAuthConnection{createdAt=$createdAt, deletedAt=$deletedAt, groupId=$groupId, id=$id, status=$status, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var groupId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(oauthConnection: OAuthConnection) = apply {
            this.createdAt = oauthConnection.createdAt
            this.deletedAt = oauthConnection.deletedAt
            this.groupId = oauthConnection.groupId
            this.id = oauthConnection.id
            this.status = oauthConnection.status
            this.type = oauthConnection.type
            additionalProperties(oauthConnection.additionalProperties)
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth
         * Connection was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth
         * Connection was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
            this.createdAt = createdAt
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth
         * Connection was deleted.
         */
        fun deletedAt(deletedAt: OffsetDateTime) = deletedAt(JsonField.of(deletedAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth
         * Connection was deleted.
         */
        @JsonProperty("deleted_at")
        @ExcludeMissing
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply {
            this.deletedAt = deletedAt
        }

        /** The identifier of the Group that has authorized your OAuth application. */
        fun groupId(groupId: String) = groupId(JsonField.of(groupId))

        /** The identifier of the Group that has authorized your OAuth application. */
        @JsonProperty("group_id")
        @ExcludeMissing
        fun groupId(groupId: JsonField<String>) = apply {
            this.groupId = groupId
        }

        /** The OAuth Connection's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The OAuth Connection's identifier. */
        @JsonProperty("id")
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply {
            this.id = id
        }

        /** Whether the connection is active. */
        fun status(status: Status) = status(JsonField.of(status))

        /** Whether the connection is active. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply {
            this.status = status
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `oauth_connection`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `oauth_connection`.
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

        fun build(): OAuthConnection = OAuthConnection(
            createdAt,
            deletedAt,
            groupId,
            id,
            status,
            type,
            additionalProperties.toUnmodifiable(),
        )
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Status &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACTIVE = Status(JsonField.of("active"))

            @JvmField val INACTIVE = Status(JsonField.of("inactive"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            INACTIVE,
        }

        enum class Value {
            ACTIVE,
            INACTIVE,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            ACTIVE -> Value.ACTIVE
            INACTIVE -> Value.INACTIVE
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            ACTIVE -> Known.ACTIVE
            INACTIVE -> Known.INACTIVE
            else -> throw IncreaseInvalidDataException("Unknown Status: $value")
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

            @JvmField val OAUTH_CONNECTION = Type(JsonField.of("oauth_connection"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            OAUTH_CONNECTION,
        }

        enum class Value {
            OAUTH_CONNECTION,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            OAUTH_CONNECTION -> Value.OAUTH_CONNECTION
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            OAUTH_CONNECTION -> Known.OAUTH_CONNECTION
            else -> throw IncreaseInvalidDataException("Unknown Type: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
