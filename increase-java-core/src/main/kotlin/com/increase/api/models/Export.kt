// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Exports are batch summaries of your Increase data. You can make them from the API or dashboard.
 * Since they can take a while, they are generated asynchronously. We send a webhook when they are
 * ready. For more information, please read our
 * [Exports documentation](https://increase.com/documentation/exports).
 */
@JsonDeserialize(builder = Export.Builder::class)
@NoAutoDetect
class Export
private constructor(
    private val category: JsonField<Category>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val fileDownloadUrl: JsonField<String>,
    private val fileId: JsonField<String>,
    private val id: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /**
     * The category of the Export. We may add additional possible values for this enum over time;
     * your application should be able to handle that gracefully.
     */
    fun category(): Category = category.getRequired("category")

    /** The time the Export was created. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * A URL at which the Export's file can be downloaded. This will be present when the Export's
     * status transitions to `complete`.
     */
    fun fileDownloadUrl(): Optional<String> =
        Optional.ofNullable(fileDownloadUrl.getNullable("file_download_url"))

    /**
     * The File containing the contents of the Export. This will be present when the Export's status
     * transitions to `complete`.
     */
    fun fileId(): Optional<String> = Optional.ofNullable(fileId.getNullable("file_id"))

    /** The Export identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /** The status of the Export. */
    fun status(): Status = status.getRequired("status")

    /** A constant representing the object's type. For this resource it will always be `export`. */
    fun type(): Type = type.getRequired("type")

    /**
     * The category of the Export. We may add additional possible values for this enum over time;
     * your application should be able to handle that gracefully.
     */
    @JsonProperty("category") @ExcludeMissing fun _category() = category

    /** The time the Export was created. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /**
     * A URL at which the Export's file can be downloaded. This will be present when the Export's
     * status transitions to `complete`.
     */
    @JsonProperty("file_download_url") @ExcludeMissing fun _fileDownloadUrl() = fileDownloadUrl

    /**
     * The File containing the contents of the Export. This will be present when the Export's status
     * transitions to `complete`.
     */
    @JsonProperty("file_id") @ExcludeMissing fun _fileId() = fileId

    /** The Export identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /** The status of the Export. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** A constant representing the object's type. For this resource it will always be `export`. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Export = apply {
        if (!validated) {
            category()
            createdAt()
            fileDownloadUrl()
            fileId()
            id()
            idempotencyKey()
            status()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var category: JsonField<Category> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var fileDownloadUrl: JsonField<String> = JsonMissing.of()
        private var fileId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(export: Export) = apply {
            this.category = export.category
            this.createdAt = export.createdAt
            this.fileDownloadUrl = export.fileDownloadUrl
            this.fileId = export.fileId
            this.id = export.id
            this.idempotencyKey = export.idempotencyKey
            this.status = export.status
            this.type = export.type
            additionalProperties(export.additionalProperties)
        }

        /**
         * The category of the Export. We may add additional possible values for this enum over
         * time; your application should be able to handle that gracefully.
         */
        fun category(category: Category) = category(JsonField.of(category))

        /**
         * The category of the Export. We may add additional possible values for this enum over
         * time; your application should be able to handle that gracefully.
         */
        @JsonProperty("category")
        @ExcludeMissing
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /** The time the Export was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The time the Export was created. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * A URL at which the Export's file can be downloaded. This will be present when the
         * Export's status transitions to `complete`.
         */
        fun fileDownloadUrl(fileDownloadUrl: String) =
            fileDownloadUrl(JsonField.of(fileDownloadUrl))

        /**
         * A URL at which the Export's file can be downloaded. This will be present when the
         * Export's status transitions to `complete`.
         */
        @JsonProperty("file_download_url")
        @ExcludeMissing
        fun fileDownloadUrl(fileDownloadUrl: JsonField<String>) = apply {
            this.fileDownloadUrl = fileDownloadUrl
        }

        /**
         * The File containing the contents of the Export. This will be present when the Export's
         * status transitions to `complete`.
         */
        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

        /**
         * The File containing the contents of the Export. This will be present when the Export's
         * status transitions to `complete`.
         */
        @JsonProperty("file_id")
        @ExcludeMissing
        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

        /** The Export identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Export identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

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

        /** The status of the Export. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Export. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be `export`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be `export`.
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

        fun build(): Export =
            Export(
                category,
                createdAt,
                fileDownloadUrl,
                fileId,
                id,
                idempotencyKey,
                status,
                type,
                additionalProperties.toImmutable(),
            )
    }

    class Category
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACCOUNT_STATEMENT_OFX = of("account_statement_ofx")

            @JvmField val TRANSACTION_CSV = of("transaction_csv")

            @JvmField val BALANCE_CSV = of("balance_csv")

            @JvmField val BOOKKEEPING_ACCOUNT_BALANCE_CSV = of("bookkeeping_account_balance_csv")

            @JvmField val ENTITY_CSV = of("entity_csv")

            @JvmField val VENDOR_CSV = of("vendor_csv")

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        enum class Known {
            ACCOUNT_STATEMENT_OFX,
            TRANSACTION_CSV,
            BALANCE_CSV,
            BOOKKEEPING_ACCOUNT_BALANCE_CSV,
            ENTITY_CSV,
            VENDOR_CSV,
        }

        enum class Value {
            ACCOUNT_STATEMENT_OFX,
            TRANSACTION_CSV,
            BALANCE_CSV,
            BOOKKEEPING_ACCOUNT_BALANCE_CSV,
            ENTITY_CSV,
            VENDOR_CSV,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCOUNT_STATEMENT_OFX -> Value.ACCOUNT_STATEMENT_OFX
                TRANSACTION_CSV -> Value.TRANSACTION_CSV
                BALANCE_CSV -> Value.BALANCE_CSV
                BOOKKEEPING_ACCOUNT_BALANCE_CSV -> Value.BOOKKEEPING_ACCOUNT_BALANCE_CSV
                ENTITY_CSV -> Value.ENTITY_CSV
                VENDOR_CSV -> Value.VENDOR_CSV
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCOUNT_STATEMENT_OFX -> Known.ACCOUNT_STATEMENT_OFX
                TRANSACTION_CSV -> Known.TRANSACTION_CSV
                BALANCE_CSV -> Known.BALANCE_CSV
                BOOKKEEPING_ACCOUNT_BALANCE_CSV -> Known.BOOKKEEPING_ACCOUNT_BALANCE_CSV
                ENTITY_CSV -> Known.ENTITY_CSV
                VENDOR_CSV -> Known.VENDOR_CSV
                else -> throw IncreaseInvalidDataException("Unknown Category: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Category && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PENDING = of("pending")

            @JvmField val COMPLETE = of("complete")

            @JvmField val FAILED = of("failed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            COMPLETE,
            FAILED,
        }

        enum class Value {
            PENDING,
            COMPLETE,
            FAILED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                COMPLETE -> Value.COMPLETE
                FAILED -> Value.FAILED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                COMPLETE -> Known.COMPLETE
                FAILED -> Known.FAILED
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

            @JvmField val EXPORT = of("export")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            EXPORT,
        }

        enum class Value {
            EXPORT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EXPORT -> Value.EXPORT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EXPORT -> Known.EXPORT
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

        return /* spotless:off */ other is Export && category == other.category && createdAt == other.createdAt && fileDownloadUrl == other.fileDownloadUrl && fileId == other.fileId && id == other.id && idempotencyKey == other.idempotencyKey && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(category, createdAt, fileDownloadUrl, fileId, id, idempotencyKey, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Export{category=$category, createdAt=$createdAt, fileDownloadUrl=$fileDownloadUrl, fileId=$fileId, id=$id, idempotencyKey=$idempotencyKey, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
