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
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.increase.api.core.BaseDeserializer
import com.increase.api.core.BaseSerializer
import com.increase.api.core.getOrThrow
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.JsonField
import com.increase.api.core.toUnmodifiable
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException

/**
 * Groups represent organizations using Increase. You can retrieve information
 * about your own organization via the API, or (more commonly) OAuth platforms can
 * retrieve information about the organizations that have granted them access.
 */
@JsonDeserialize(builder = Group.Builder::class)
@NoAutoDetect
class Group private constructor(private val activationStatus: JsonField<ActivationStatus>,private val achDebitStatus: JsonField<AchDebitStatus>,private val createdAt: JsonField<OffsetDateTime>,private val id: JsonField<String>,private val type: JsonField<Type>,private val additionalProperties: Map<String, JsonValue>,) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** If the Group is activated or not. */
    fun activationStatus(): ActivationStatus = activationStatus.getRequired("activation_status")

    /** If the Group is allowed to create ACH debits. */
    fun achDebitStatus(): AchDebitStatus = achDebitStatus.getRequired("ach_debit_status")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Group
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The Group identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `group`.
     */
    fun type(): Type = type.getRequired("type")

    /** If the Group is activated or not. */
    @JsonProperty("activation_status")
    @ExcludeMissing
    fun _activationStatus() = activationStatus

    /** If the Group is allowed to create ACH debits. */
    @JsonProperty("ach_debit_status")
    @ExcludeMissing
    fun _achDebitStatus() = achDebitStatus

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Group
     * was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt() = createdAt

    /** The Group identifier. */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id() = id

    /**
     * A constant representing the object's type. For this resource it will always be
     * `group`.
     */
    @JsonProperty("type")
    @ExcludeMissing
    fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
          activationStatus()
          achDebitStatus()
          createdAt()
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

      return other is Group &&
          this.activationStatus == other.activationStatus &&
          this.achDebitStatus == other.achDebitStatus &&
          this.createdAt == other.createdAt &&
          this.id == other.id &&
          this.type == other.type &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            activationStatus,
            achDebitStatus,
            createdAt,
            id,
            type,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "Group{activationStatus=$activationStatus, achDebitStatus=$achDebitStatus, createdAt=$createdAt, id=$id, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var activationStatus: JsonField<ActivationStatus> = JsonMissing.of()
        private var achDebitStatus: JsonField<AchDebitStatus> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(group: Group) = apply {
            this.activationStatus = group.activationStatus
            this.achDebitStatus = group.achDebitStatus
            this.createdAt = group.createdAt
            this.id = group.id
            this.type = group.type
            additionalProperties(group.additionalProperties)
        }

        /** If the Group is activated or not. */
        fun activationStatus(activationStatus: ActivationStatus) = activationStatus(JsonField.of(activationStatus))

        /** If the Group is activated or not. */
        @JsonProperty("activation_status")
        @ExcludeMissing
        fun activationStatus(activationStatus: JsonField<ActivationStatus>) = apply {
            this.activationStatus = activationStatus
        }

        /** If the Group is allowed to create ACH debits. */
        fun achDebitStatus(achDebitStatus: AchDebitStatus) = achDebitStatus(JsonField.of(achDebitStatus))

        /** If the Group is allowed to create ACH debits. */
        @JsonProperty("ach_debit_status")
        @ExcludeMissing
        fun achDebitStatus(achDebitStatus: JsonField<AchDebitStatus>) = apply {
            this.achDebitStatus = achDebitStatus
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Group
         * was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Group
         * was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
            this.createdAt = createdAt
        }

        /** The Group identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Group identifier. */
        @JsonProperty("id")
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply {
            this.id = id
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `group`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `group`.
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

        fun build(): Group = Group(
            activationStatus,
            achDebitStatus,
            createdAt,
            id,
            type,
            additionalProperties.toUnmodifiable(),
        )
    }

    class ActivationStatus @JsonCreator private constructor(private val value: JsonField<String>,) {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is ActivationStatus &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val UNACTIVATED = ActivationStatus(JsonField.of("unactivated"))

            @JvmField val ACTIVATED = ActivationStatus(JsonField.of("activated"))

            @JvmStatic fun of(value: String) = ActivationStatus(JsonField.of(value))
        }

        enum class Known {
            UNACTIVATED,
            ACTIVATED,
        }

        enum class Value {
            UNACTIVATED,
            ACTIVATED,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            UNACTIVATED -> Value.UNACTIVATED
            ACTIVATED -> Value.ACTIVATED
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            UNACTIVATED -> Known.UNACTIVATED
            ACTIVATED -> Known.ACTIVATED
            else -> throw IncreaseInvalidDataException("Unknown ActivationStatus: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    class AchDebitStatus @JsonCreator private constructor(private val value: JsonField<String>,) {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is AchDebitStatus &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val DISABLED = AchDebitStatus(JsonField.of("disabled"))

            @JvmField val ENABLED = AchDebitStatus(JsonField.of("enabled"))

            @JvmStatic fun of(value: String) = AchDebitStatus(JsonField.of(value))
        }

        enum class Known {
            DISABLED,
            ENABLED,
        }

        enum class Value {
            DISABLED,
            ENABLED,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            DISABLED -> Value.DISABLED
            ENABLED -> Value.ENABLED
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            DISABLED -> Known.DISABLED
            ENABLED -> Known.ENABLED
            else -> throw IncreaseInvalidDataException("Unknown AchDebitStatus: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>,) {

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

            @JvmField val GROUP = Type(JsonField.of("group"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            GROUP,
        }

        enum class Value {
            GROUP,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            GROUP -> Value.GROUP
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            GROUP -> Known.GROUP
            else -> throw IncreaseInvalidDataException("Unknown Type: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
