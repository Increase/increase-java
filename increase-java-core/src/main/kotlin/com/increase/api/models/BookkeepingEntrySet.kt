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

/**
 * Entry Sets are accounting entries that are transactionally applied. Your compliance setup might
 * require annotating money movements using this API. Learn more in our
 * [guide to Bookkeeping](https://increase.com/documentation/bookkeeping#bookkeeping).
 */
@NoAutoDetect
class BookkeepingEntrySet
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("date")
    @ExcludeMissing
    private val date: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("entries")
    @ExcludeMissing
    private val entries: JsonField<List<Entry>> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("transaction_id")
    @ExcludeMissing
    private val transactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The entry set identifier. */
    fun id(): String = id.getRequired("id")

    /** When the entry set was created. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The timestamp of the entry set. */
    fun date(): OffsetDateTime = date.getRequired("date")

    /** The entries. */
    fun entries(): List<Entry> = entries.getRequired("entries")

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

    /** The entry set identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** When the entry set was created. */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The timestamp of the entry set. */
    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<OffsetDateTime> = date

    /** The entries. */
    @JsonProperty("entries") @ExcludeMissing fun _entries(): JsonField<List<Entry>> = entries

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /** The transaction identifier, if any. */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * A constant representing the object's type. For this resource it will always be
     * `bookkeeping_entry_set`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BookkeepingEntrySet = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        date()
        entries().forEach { it.validate() }
        idempotencyKey()
        transactionId()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var date: JsonField<OffsetDateTime>? = null
        private var entries: JsonField<MutableList<Entry>>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var transactionId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bookkeepingEntrySet: BookkeepingEntrySet) = apply {
            id = bookkeepingEntrySet.id
            createdAt = bookkeepingEntrySet.createdAt
            date = bookkeepingEntrySet.date
            entries = bookkeepingEntrySet.entries.map { it.toMutableList() }
            idempotencyKey = bookkeepingEntrySet.idempotencyKey
            transactionId = bookkeepingEntrySet.transactionId
            type = bookkeepingEntrySet.type
            additionalProperties = bookkeepingEntrySet.additionalProperties.toMutableMap()
        }

        /** The entry set identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The entry set identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

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
        fun entries(entries: JsonField<List<Entry>>) = apply {
            this.entries = entries.map { it.toMutableList() }
        }

        /** The entries. */
        fun addEntry(entry: Entry) = apply {
            entries =
                (entries ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(entry)
                }
        }

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

        /** The transaction identifier, if any. */
        fun transactionId(transactionId: String?) =
            transactionId(JsonField.ofNullable(transactionId))

        /** The transaction identifier, if any. */
        fun transactionId(transactionId: Optional<String>) =
            transactionId(transactionId.orElse(null))

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
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("date", date),
                checkRequired("entries", entries).map { it.toImmutable() },
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("transactionId", transactionId),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Entry
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_id")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The entry identifier. */
        fun id(): String = id.getRequired("id")

        /** The bookkeeping account impacted by the entry. */
        fun accountId(): String = accountId.getRequired("account_id")

        /** The amount of the entry in minor units. */
        fun amount(): Long = amount.getRequired("amount")

        /** The entry identifier. */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** The bookkeeping account impacted by the entry. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /** The amount of the entry in minor units. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Entry = apply {
            if (validated) {
                return@apply
            }

            id()
            accountId()
            amount()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String>? = null
            private var accountId: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entry: Entry) = apply {
                id = entry.id
                accountId = entry.accountId
                amount = entry.amount
                additionalProperties = entry.additionalProperties.toMutableMap()
            }

            /** The entry identifier. */
            fun id(id: String) = id(JsonField.of(id))

            /** The entry identifier. */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The bookkeeping account impacted by the entry. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The bookkeeping account impacted by the entry. */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The amount of the entry in minor units. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The amount of the entry in minor units. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

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
                    checkRequired("id", id),
                    checkRequired("accountId", accountId),
                    checkRequired("amount", amount),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Entry && id == other.id && accountId == other.accountId && amount == other.amount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, accountId, amount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Entry{id=$id, accountId=$accountId, amount=$amount, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is BookkeepingEntrySet && id == other.id && createdAt == other.createdAt && date == other.date && entries == other.entries && idempotencyKey == other.idempotencyKey && transactionId == other.transactionId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, date, entries, idempotencyKey, transactionId, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BookkeepingEntrySet{id=$id, createdAt=$createdAt, date=$date, entries=$entries, idempotencyKey=$idempotencyKey, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"
}
