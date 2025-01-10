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
 * An OAuth Application lets you build an application for others to use with their Increase data.
 * You can create an OAuth Application via the Dashboard and read information about it with the API.
 * Learn more about OAuth [here](https://increase.com/documentation/oauth).
 */
@NoAutoDetect
class OAuthApplication
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("client_id")
    @ExcludeMissing
    private val clientId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("deleted_at")
    @ExcludeMissing
    private val deletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The OAuth Application's identifier. */
    fun id(): String = id.getRequired("id")

    /** The OAuth Application's client_id. Use this to authenticate with the OAuth Application. */
    fun clientId(): String = clientId.getRequired("client_id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth Application
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth Application
     * was deleted.
     */
    fun deletedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(deletedAt.getNullable("deleted_at"))

    /** The name you chose for this OAuth Application. */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** Whether the application is active. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `oauth_application`.
     */
    fun type(): Type = type.getRequired("type")

    /** The OAuth Application's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The OAuth Application's client_id. Use this to authenticate with the OAuth Application. */
    @JsonProperty("client_id") @ExcludeMissing fun _clientId(): JsonField<String> = clientId

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth Application
     * was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth Application
     * was deleted.
     */
    @JsonProperty("deleted_at")
    @ExcludeMissing
    fun _deletedAt(): JsonField<OffsetDateTime> = deletedAt

    /** The name you chose for this OAuth Application. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** Whether the application is active. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `oauth_application`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): OAuthApplication = apply {
        if (validated) {
            return@apply
        }

        id()
        clientId()
        createdAt()
        deletedAt()
        name()
        status()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var clientId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var deletedAt: JsonField<OffsetDateTime>? = null
        private var name: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(oauthApplication: OAuthApplication) = apply {
            id = oauthApplication.id
            clientId = oauthApplication.clientId
            createdAt = oauthApplication.createdAt
            deletedAt = oauthApplication.deletedAt
            name = oauthApplication.name
            status = oauthApplication.status
            type = oauthApplication.type
            additionalProperties = oauthApplication.additionalProperties.toMutableMap()
        }

        /** The OAuth Application's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The OAuth Application's identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The OAuth Application's client_id. Use this to authenticate with the OAuth Application.
         */
        fun clientId(clientId: String) = clientId(JsonField.of(clientId))

        /**
         * The OAuth Application's client_id. Use this to authenticate with the OAuth Application.
         */
        fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth
         * Application was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth
         * Application was created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth
         * Application was deleted.
         */
        fun deletedAt(deletedAt: OffsetDateTime?) = deletedAt(JsonField.ofNullable(deletedAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth
         * Application was deleted.
         */
        fun deletedAt(deletedAt: Optional<OffsetDateTime>) = deletedAt(deletedAt.orElse(null))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp when the OAuth
         * Application was deleted.
         */
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

        /** The name you chose for this OAuth Application. */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** The name you chose for this OAuth Application. */
        fun name(name: Optional<String>) = name(name.orElse(null))

        /** The name you chose for this OAuth Application. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Whether the application is active. */
        fun status(status: Status) = status(JsonField.of(status))

        /** Whether the application is active. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `oauth_application`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `oauth_application`.
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

        fun build(): OAuthApplication =
            OAuthApplication(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(clientId) { "`clientId` is required but was not set" },
                checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                checkNotNull(deletedAt) { "`deletedAt` is required but was not set" },
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(status) { "`status` is required but was not set" },
                checkNotNull(type) { "`type` is required but was not set" },
                additionalProperties.toImmutable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACTIVE = of("active")

            @JvmField val DELETED = of("deleted")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            DELETED,
        }

        enum class Value {
            ACTIVE,
            DELETED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                DELETED -> Value.DELETED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                DELETED -> Known.DELETED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
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

            @JvmField val OAUTH_APPLICATION = of("oauth_application")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            OAUTH_APPLICATION,
        }

        enum class Value {
            OAUTH_APPLICATION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                OAUTH_APPLICATION -> Value.OAUTH_APPLICATION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                OAUTH_APPLICATION -> Known.OAUTH_APPLICATION
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

        return /* spotless:off */ other is OAuthApplication && id == other.id && clientId == other.clientId && createdAt == other.createdAt && deletedAt == other.deletedAt && name == other.name && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, clientId, createdAt, deletedAt, name, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OAuthApplication{id=$id, clientId=$clientId, createdAt=$createdAt, deletedAt=$deletedAt, name=$name, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
