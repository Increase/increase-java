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
 * Entry Sets are accounting entries that are transactionally applied. Your compliance setup might
 * require annotating money movements using this API. Learn more in our
 * [guide to Bookkeeping](https://increase.com/documentation/bookkeeping#bookkeeping).
 */
@NoAutoDetect
class BookkeepingEntrySet
@JsonCreator
private constructor(
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("date")
    @ExcludeMissing
    private val date: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("entries")
    @ExcludeMissing
    private val entries: JsonField<List<Entry>> = JsonMissing.of(),
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("transaction_id")
    @ExcludeMissing
    private val transactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** When the entry set was created. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The timestamp of the entry set. */
    fun date(): OffsetDateTime = date.getRequired("date")

    /** The entries. */
    fun entries(): List<Entry> = entries.getRequired("entries")

    /** The entry set identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /** The transaction identifier, if any. */
    fun transactionId(): Optional<String> =
        Optional.ofNullable(transactionId.getNullable("transaction_id"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `bookkeeping_entry_set`.
     */
    fun type(): Type = type.getRequired("type")

    /** When the entry set was created. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The timestamp of the entry set. */
    @JsonProperty("date") @ExcludeMissing fun _date() = date

    /** The entries. */
    @JsonProperty("entries") @ExcludeMissing fun _entries() = entries

    /** The entry set identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /** The transaction identifier, if any. */
    @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

    /**
     * A constant representing the object's type. For this resource it will always be
     * `bookkeeping_entry_set`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BookkeepingEntrySet = apply {
        if (!validated) {
            createdAt()
            date()
            entries().forEach { it.validate() }
            id()
            idempotencyKey()
            transactionId()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var date: JsonField<OffsetDateTime> = JsonMissing.of()
        private var entries: JsonField<List<Entry>> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bookkeepingEntrySet: BookkeepingEntrySet) = apply {
            createdAt = bookkeepingEntrySet.createdAt
            date = bookkeepingEntrySet.date
            entries = bookkeepingEntrySet.entries
            id = bookkeepingEntrySet.id
            idempotencyKey = bookkeepingEntrySet.idempotencyKey
            transactionId = bookkeepingEntrySet.transactionId
            type = bookkeepingEntrySet.type
            additionalProperties = bookkeepingEntrySet.additionalProperties.toMutableMap()
        }

        /** When the entry set was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** When the entry set was created. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The timestamp of the entry set. */
        fun date(date: OffsetDateTime) = date(JsonField.of(date))

        /** The timestamp of the entry set. */
        fun date(date: JsonField<OffsetDateTime>) = apply { this.date = date }

        /** The entries. */
        fun entries(entries: List<Entry>) = entries(JsonField.of(entries))

        /** The entries. */
        fun entries(entries: JsonField<List<Entry>>) = apply { this.entries = entries }

        /** The entry set identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The entry set identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

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
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /** The transaction identifier, if any. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** The transaction identifier, if any. */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `bookkeeping_entry_set`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `bookkeeping_entry_set`.
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

        fun build(): BookkeepingEntrySet =
            BookkeepingEntrySet(
                createdAt,
                date,
                entries.map { it.toImmutable() },
                id,
                idempotencyKey,
                transactionId,
                type,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Entry
    @JsonCreator
    private constructor(
        @JsonProperty("account_id")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The bookkeeping account impacted by the entry. */
        fun accountId(): String = accountId.getRequired("account_id")

        /** The amount of the entry in minor units. */
        fun amount(): Long = amount.getRequired("amount")

        /** The entry identifier. */
        fun id(): String = id.getRequired("id")

        /** The bookkeeping account impacted by the entry. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

        /** The amount of the entry in minor units. */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** The entry identifier. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Entry = apply {
            if (!validated) {
                accountId()
                amount()
                id()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<Long> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entry: Entry) = apply {
                accountId = entry.accountId
                amount = entry.amount
                id = entry.id
                additionalProperties = entry.additionalProperties.toMutableMap()
            }

            /** The bookkeeping account impacted by the entry. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The bookkeeping account impacted by the entry. */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The amount of the entry in minor units. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The amount of the entry in minor units. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The entry identifier. */
            fun id(id: String) = id(JsonField.of(id))

            /** The entry identifier. */
            fun id(id: JsonField<String>) = apply { this.id = id }

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

            fun build(): Entry =
                Entry(
                    accountId,
                    amount,
                    id,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Entry && accountId == other.accountId && amount == other.amount && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, amount, id, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Entry{accountId=$accountId, amount=$amount, id=$id, additionalProperties=$additionalProperties}"
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BOOKKEEPING_ENTRY_SET = of("bookkeeping_entry_set")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            BOOKKEEPING_ENTRY_SET,
        }

        enum class Value {
            BOOKKEEPING_ENTRY_SET,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BOOKKEEPING_ENTRY_SET -> Value.BOOKKEEPING_ENTRY_SET
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BOOKKEEPING_ENTRY_SET -> Known.BOOKKEEPING_ENTRY_SET
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

        return /* spotless:off */ other is BookkeepingEntrySet && createdAt == other.createdAt && date == other.date && entries == other.entries && id == other.id && idempotencyKey == other.idempotencyKey && transactionId == other.transactionId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(createdAt, date, entries, id, idempotencyKey, transactionId, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BookkeepingEntrySet{createdAt=$createdAt, date=$date, entries=$entries, id=$id, idempotencyKey=$idempotencyKey, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"
}
