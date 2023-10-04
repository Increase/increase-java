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

/**
 * Programs determine the compliance and commercial terms of Accounts. By default, you have a
 * Commercial Banking program for managing your own funds. If you are lending or managing funds on
 * behalf of your customers, or otherwise engaged in regulated activity, we will work together to
 * create additional Programs for you.
 */
@JsonDeserialize(builder = Program.Builder::class)
@NoAutoDetect
class Program
private constructor(
    private val name: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The name of the Program. */
    fun name(): String = name.getRequired("name")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was last
     * updated.
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** The Program identifier. */
    fun id(): String = id.getRequired("id")

    /** A constant representing the object's type. For this resource it will always be `program`. */
    fun type(): Type = type.getRequired("type")

    /** The name of the Program. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was last
     * updated.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /** The Program identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** A constant representing the object's type. For this resource it will always be `program`. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Program = apply {
        if (!validated) {
            name()
            createdAt()
            updatedAt()
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

        return other is Program &&
            this.name == other.name &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.id == other.id &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    name,
                    createdAt,
                    updatedAt,
                    id,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Program{name=$name, createdAt=$createdAt, updatedAt=$updatedAt, id=$id, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var name: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(program: Program) = apply {
            this.name = program.name
            this.createdAt = program.createdAt
            this.updatedAt = program.updatedAt
            this.id = program.id
            this.type = program.type
            additionalProperties(program.additionalProperties)
        }

        /** The name of the Program. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the Program. */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was
         * created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was
         * created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was last
         * updated.
         */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Program was last
         * updated.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The Program identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Program identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * A constant representing the object's type. For this resource it will always be `program`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be `program`.
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

        fun build(): Program =
            Program(
                name,
                createdAt,
                updatedAt,
                id,
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

            @JvmField val PROGRAM = Type(JsonField.of("program"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            PROGRAM,
        }

        enum class Value {
            PROGRAM,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PROGRAM -> Value.PROGRAM
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PROGRAM -> Known.PROGRAM
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
