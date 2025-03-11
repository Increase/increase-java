// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.exports

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
import kotlin.jvm.optionals.getOrNull

/**
 * Exports are batch summaries of your Increase data. You can make them from the
 * API or dashboard. Since they can take a while, they are generated
 * asynchronously. We send a webhook when they are ready. For more information,
 * please read our
 * [Exports documentation](https://increase.com/documentation/exports).
 */
@NoAutoDetect
class Export @JsonCreator private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("category") @ExcludeMissing private val category: JsonField<Category> = JsonMissing.of(),
    @JsonProperty("created_at") @ExcludeMissing private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("file_download_url") @ExcludeMissing private val fileDownloadUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("file_id") @ExcludeMissing private val fileId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("idempotency_key") @ExcludeMissing private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status") @ExcludeMissing private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

) {

    /** The Export identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The category of the Export. We may add additional possible values for this enum
     * over time; your application should be able to handle that gracefully.
     */
    fun category(): Category = category.getRequired("category")

    /** The time the Export was created. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * A URL at which the Export's file can be downloaded. This will be present when
     * the Export's status transitions to `complete`.
     */
    fun fileDownloadUrl(): Optional<String> = Optional.ofNullable(fileDownloadUrl.getNullable("file_download_url"))

    /**
     * The File containing the contents of the Export. This will be present when the
     * Export's status transitions to `complete`.
     */
    fun fileId(): Optional<String> = Optional.ofNullable(fileId.getNullable("file_id"))

    /**
     * The idempotency key you chose for this object. This value is unique across
     * Increase and is used to ensure that a request is only processed once. Learn more
     * about [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> = Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /** The status of the Export. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `export`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Export identifier. */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id(): JsonField<String> = id

    /**
     * The category of the Export. We may add additional possible values for this enum
     * over time; your application should be able to handle that gracefully.
     */
    @JsonProperty("category")
    @ExcludeMissing
    fun _category(): JsonField<Category> = category

    /** The time the Export was created. */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * A URL at which the Export's file can be downloaded. This will be present when
     * the Export's status transitions to `complete`.
     */
    @JsonProperty("file_download_url")
    @ExcludeMissing
    fun _fileDownloadUrl(): JsonField<String> = fileDownloadUrl

    /**
     * The File containing the contents of the Export. This will be present when the
     * Export's status transitions to `complete`.
     */
    @JsonProperty("file_id")
    @ExcludeMissing
    fun _fileId(): JsonField<String> = fileId

    /**
     * The idempotency key you chose for this object. This value is unique across
     * Increase and is used to ensure that a request is only processed once. Learn more
     * about [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /** The status of the Export. */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<Status> = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `export`.
     */
    @JsonProperty("type")
    @ExcludeMissing
    fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Export =
        apply {
            if (validated) {
              return@apply
            }

            id()
            category()
            createdAt()
            fileDownloadUrl()
            fileId()
            idempotencyKey()
            status()
            type()
            validated = true
        }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Export].
         *
         * The following fields are required:
         *
         * ```java
         * .id()
         * .category()
         * .createdAt()
         * .fileDownloadUrl()
         * .fileId()
         * .idempotencyKey()
         * .status()
         * .type()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [Export]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var category: JsonField<Category>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var fileDownloadUrl: JsonField<String>? = null
        private var fileId: JsonField<String>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(export: Export) =
            apply {
                id = export.id
                category = export.category
                createdAt = export.createdAt
                fileDownloadUrl = export.fileDownloadUrl
                fileId = export.fileId
                idempotencyKey = export.idempotencyKey
                status = export.status
                type = export.type
                additionalProperties = export.additionalProperties.toMutableMap()
            }

        /** The Export identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Export identifier. */
        fun id(id: JsonField<String>) =
            apply {
                this.id = id
            }

        /**
         * The category of the Export. We may add additional possible values for this enum
         * over time; your application should be able to handle that gracefully.
         */
        fun category(category: Category) = category(JsonField.of(category))

        /**
         * The category of the Export. We may add additional possible values for this enum
         * over time; your application should be able to handle that gracefully.
         */
        fun category(category: JsonField<Category>) =
            apply {
                this.category = category
            }

        /** The time the Export was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The time the Export was created. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) =
            apply {
                this.createdAt = createdAt
            }

        /**
         * A URL at which the Export's file can be downloaded. This will be present when
         * the Export's status transitions to `complete`.
         */
        fun fileDownloadUrl(fileDownloadUrl: String?) = fileDownloadUrl(JsonField.ofNullable(fileDownloadUrl))

        /**
         * A URL at which the Export's file can be downloaded. This will be present when
         * the Export's status transitions to `complete`.
         */
        fun fileDownloadUrl(fileDownloadUrl: Optional<String>) = fileDownloadUrl(fileDownloadUrl.getOrNull())

        /**
         * A URL at which the Export's file can be downloaded. This will be present when
         * the Export's status transitions to `complete`.
         */
        fun fileDownloadUrl(fileDownloadUrl: JsonField<String>) =
            apply {
                this.fileDownloadUrl = fileDownloadUrl
            }

        /**
         * The File containing the contents of the Export. This will be present when the
         * Export's status transitions to `complete`.
         */
        fun fileId(fileId: String?) = fileId(JsonField.ofNullable(fileId))

        /**
         * The File containing the contents of the Export. This will be present when the
         * Export's status transitions to `complete`.
         */
        fun fileId(fileId: Optional<String>) = fileId(fileId.getOrNull())

        /**
         * The File containing the contents of the Export. This will be present when the
         * Export's status transitions to `complete`.
         */
        fun fileId(fileId: JsonField<String>) =
            apply {
                this.fileId = fileId
            }

        /**
         * The idempotency key you chose for this object. This value is unique across
         * Increase and is used to ensure that a request is only processed once. Learn more
         * about [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) = idempotencyKey(JsonField.ofNullable(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across
         * Increase and is used to ensure that a request is only processed once. Learn more
         * about [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: Optional<String>) = idempotencyKey(idempotencyKey.getOrNull())

        /**
         * The idempotency key you chose for this object. This value is unique across
         * Increase and is used to ensure that a request is only processed once. Learn more
         * about [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) =
            apply {
                this.idempotencyKey = idempotencyKey
            }

        /** The status of the Export. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Export. */
        fun status(status: JsonField<Status>) =
            apply {
                this.status = status
            }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `export`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `export`.
         */
        fun type(type: JsonField<Type>) =
            apply {
                this.type = type
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply {
                additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.putAll(additionalProperties)
            }

        fun removeAdditionalProperty(key: String) =
            apply {
                additionalProperties.remove(key)
            }

        fun removeAllAdditionalProperties(keys: Set<String>) =
            apply {
                keys.forEach(::removeAdditionalProperty)
            }

        fun build(): Export =
            Export(
              checkRequired(
                "id", id
              ),
              checkRequired(
                "category", category
              ),
              checkRequired(
                "createdAt", createdAt
              ),
              checkRequired(
                "fileDownloadUrl", fileDownloadUrl
              ),
              checkRequired(
                "fileId", fileId
              ),
              checkRequired(
                "idempotencyKey", idempotencyKey
              ),
              checkRequired(
                "status", status
              ),
              checkRequired(
                "type", type
              ),
              additionalProperties.toImmutable(),
            )
    }

    /**
     * The category of the Export. We may add additional possible values for this enum
     * over time; your application should be able to handle that gracefully.
     */
    class Category @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that
         * doesn't match any known member, and you want to know that value. For example, if
         * the SDK is on an older version than the API, then the API may respond with new
         * members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        companion object {

            /**
             * Export an Open Financial Exchange (OFX) file of transactions and balances for a
             * given time range and Account.
             */
            @JvmField val ACCOUNT_STATEMENT_OFX = of("account_statement_ofx")

            /** Export a CSV of all transactions for a given time range. */
            @JvmField val TRANSACTION_CSV = of("transaction_csv")

            /** Export a CSV of account balances for the dates in a given range. */
            @JvmField val BALANCE_CSV = of("balance_csv")

            /** Export a CSV of bookkeeping account balances for the dates in a given range. */
            @JvmField val BOOKKEEPING_ACCOUNT_BALANCE_CSV = of("bookkeeping_account_balance_csv")

            /** Export a CSV of entities with a given status. */
            @JvmField val ENTITY_CSV = of("entity_csv")

            /** Export a CSV of vendors added to the third-party risk management dashboard. */
            @JvmField val VENDOR_CSV = of("vendor_csv")

            /**
             * Certain dashboard tables are available as CSV exports. This export cannot be
             * created via the API.
             */
            @JvmField val DASHBOARD_TABLE_CSV = of("dashboard_table_csv")

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        /** An enum containing [Category]'s known values. */
        enum class Known {
            /**
             * Export an Open Financial Exchange (OFX) file of transactions and balances for a
             * given time range and Account.
             */
            ACCOUNT_STATEMENT_OFX,
            /** Export a CSV of all transactions for a given time range. */
            TRANSACTION_CSV,
            /** Export a CSV of account balances for the dates in a given range. */
            BALANCE_CSV,
            /** Export a CSV of bookkeeping account balances for the dates in a given range. */
            BOOKKEEPING_ACCOUNT_BALANCE_CSV,
            /** Export a CSV of entities with a given status. */
            ENTITY_CSV,
            /** Export a CSV of vendors added to the third-party risk management dashboard. */
            VENDOR_CSV,
            /**
             * Certain dashboard tables are available as CSV exports. This export cannot be
             * created via the API.
             */
            DASHBOARD_TABLE_CSV,
        }

        /**
         * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Category] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For
         *   example, if the SDK is on an older version than the API, then the API may
         *   respond with new members that the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /**
             * Export an Open Financial Exchange (OFX) file of transactions and balances for a
             * given time range and Account.
             */
            ACCOUNT_STATEMENT_OFX,
            /** Export a CSV of all transactions for a given time range. */
            TRANSACTION_CSV,
            /** Export a CSV of account balances for the dates in a given range. */
            BALANCE_CSV,
            /** Export a CSV of bookkeeping account balances for the dates in a given range. */
            BOOKKEEPING_ACCOUNT_BALANCE_CSV,
            /** Export a CSV of entities with a given status. */
            ENTITY_CSV,
            /** Export a CSV of vendors added to the third-party risk management dashboard. */
            VENDOR_CSV,
            /**
             * Certain dashboard tables are available as CSV exports. This export cannot be
             * created via the API.
             */
            DASHBOARD_TABLE_CSV,
            /**
             * An enum member indicating that [Category] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or
         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if
         * you want to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ACCOUNT_STATEMENT_OFX -> Value.ACCOUNT_STATEMENT_OFX
                TRANSACTION_CSV -> Value.TRANSACTION_CSV
                BALANCE_CSV -> Value.BALANCE_CSV
                BOOKKEEPING_ACCOUNT_BALANCE_CSV -> Value.BOOKKEEPING_ACCOUNT_BALANCE_CSV
                ENTITY_CSV -> Value.ENTITY_CSV
                VENDOR_CSV -> Value.VENDOR_CSV
                DASHBOARD_TABLE_CSV -> Value.DASHBOARD_TABLE_CSV
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and
         * don't want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a
         * known member.
         */
        fun known(): Known =
            when (this) {
                ACCOUNT_STATEMENT_OFX -> Known.ACCOUNT_STATEMENT_OFX
                TRANSACTION_CSV -> Known.TRANSACTION_CSV
                BALANCE_CSV -> Known.BALANCE_CSV
                BOOKKEEPING_ACCOUNT_BALANCE_CSV -> Known.BOOKKEEPING_ACCOUNT_BALANCE_CSV
                ENTITY_CSV -> Known.ENTITY_CSV
                VENDOR_CSV -> Known.VENDOR_CSV
                DASHBOARD_TABLE_CSV -> Known.DASHBOARD_TABLE_CSV
                else -> throw IncreaseInvalidDataException("Unknown Category: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for
         * debugging and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not
         * have the expected primitive type.
         */
        fun asString(): String = _value().asString().orElseThrow { IncreaseInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Category && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The status of the Export. */
    class Status @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that
         * doesn't match any known member, and you want to know that value. For example, if
         * the SDK is on an older version than the API, then the API may respond with new
         * members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        companion object {

            /** Increase is generating the export. */
            @JvmField val PENDING = of("pending")

            /** The export has been successfully generated. */
            @JvmField val COMPLETE = of("complete")

            /**
             * The export failed to generate. Increase will reach out to you to resolve the
             * issue.
             */
            @JvmField val FAILED = of("failed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** Increase is generating the export. */
            PENDING,
            /** The export has been successfully generated. */
            COMPLETE,
            /**
             * The export failed to generate. Increase will reach out to you to resolve the
             * issue.
             */
            FAILED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For
         *   example, if the SDK is on an older version than the API, then the API may
         *   respond with new members that the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Increase is generating the export. */
            PENDING,
            /** The export has been successfully generated. */
            COMPLETE,
            /**
             * The export failed to generate. Increase will reach out to you to resolve the
             * issue.
             */
            FAILED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or
         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if
         * you want to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                COMPLETE -> Value.COMPLETE
                FAILED -> Value.FAILED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and
         * don't want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a
         * known member.
         */
        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                COMPLETE -> Known.COMPLETE
                FAILED -> Known.FAILED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for
         * debugging and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not
         * have the expected primitive type.
         */
        fun asString(): String = _value().asString().orElseThrow { IncreaseInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `export`.
     */
    class Type @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that
         * doesn't match any known member, and you want to know that value. For example, if
         * the SDK is on an older version than the API, then the API may respond with new
         * members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        companion object {

            @JvmField val EXPORT = of("export")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            EXPORT,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For
         *   example, if the SDK is on an older version than the API, then the API may
         *   respond with new members that the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EXPORT,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or
         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if
         * you want to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                EXPORT -> Value.EXPORT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and
         * don't want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a
         * known member.
         */
        fun known(): Known =
            when (this) {
                EXPORT -> Known.EXPORT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for
         * debugging and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not
         * have the expected primitive type.
         */
        fun asString(): String = _value().asString().orElseThrow { IncreaseInvalidDataException("Value is not a String") }

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

      return /* spotless:off */ other is Export && id == other.id && category == other.category && createdAt == other.createdAt && fileDownloadUrl == other.fileDownloadUrl && fileId == other.fileId && idempotencyKey == other.idempotencyKey && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, category, createdAt, fileDownloadUrl, fileId, idempotencyKey, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "Export{id=$id, category=$category, createdAt=$createdAt, fileDownloadUrl=$fileDownloadUrl, fileId=$fileId, idempotencyKey=$idempotencyKey, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
