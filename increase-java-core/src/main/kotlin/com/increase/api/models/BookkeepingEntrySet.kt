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
import java.util.Optional

/** Entry Sets are accounting entries that are transactionally applied. */
@JsonDeserialize(builder = BookkeepingEntrySet.Builder::class)
@NoAutoDetect
class BookkeepingEntrySet
private constructor(
    private val id: JsonField<String>,
    private val transactionId: JsonField<String>,
    private val date: JsonField<OffsetDateTime>,
    private val entries: JsonField<List<Entry>>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The entry set identifier. */
    fun id(): String = id.getRequired("id")

    /** The transaction identifier, if any. */
    fun transactionId(): Optional<String> =
        Optional.ofNullable(transactionId.getNullable("transaction_id"))

    /** The timestamp of the entry set. */
    fun date(): OffsetDateTime = date.getRequired("date")

    /** The entries. */
    fun entries(): List<Entry> = entries.getRequired("entries")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `bookkeeping_entry_set`.
     */
    fun type(): Type = type.getRequired("type")

    /** The entry set identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The transaction identifier, if any. */
    @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

    /** The timestamp of the entry set. */
    @JsonProperty("date") @ExcludeMissing fun _date() = date

    /** The entries. */
    @JsonProperty("entries") @ExcludeMissing fun _entries() = entries

    /**
     * A constant representing the object's type. For this resource it will always be
     * `bookkeeping_entry_set`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): BookkeepingEntrySet = apply {
        if (!validated) {
            id()
            transactionId()
            date()
            entries().forEach { it.validate() }
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BookkeepingEntrySet &&
            this.id == other.id &&
            this.transactionId == other.transactionId &&
            this.date == other.date &&
            this.entries == other.entries &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    transactionId,
                    date,
                    entries,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "BookkeepingEntrySet{id=$id, transactionId=$transactionId, date=$date, entries=$entries, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var date: JsonField<OffsetDateTime> = JsonMissing.of()
        private var entries: JsonField<List<Entry>> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bookkeepingEntrySet: BookkeepingEntrySet) = apply {
            this.id = bookkeepingEntrySet.id
            this.transactionId = bookkeepingEntrySet.transactionId
            this.date = bookkeepingEntrySet.date
            this.entries = bookkeepingEntrySet.entries
            this.type = bookkeepingEntrySet.type
            additionalProperties(bookkeepingEntrySet.additionalProperties)
        }

        /** The entry set identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The entry set identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The transaction identifier, if any. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** The transaction identifier, if any. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /** The timestamp of the entry set. */
        fun date(date: OffsetDateTime) = date(JsonField.of(date))

        /** The timestamp of the entry set. */
        @JsonProperty("date")
        @ExcludeMissing
        fun date(date: JsonField<OffsetDateTime>) = apply { this.date = date }

        /** The entries. */
        fun entries(entries: List<Entry>) = entries(JsonField.of(entries))

        /** The entries. */
        @JsonProperty("entries")
        @ExcludeMissing
        fun entries(entries: JsonField<List<Entry>>) = apply { this.entries = entries }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `bookkeeping_entry_set`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `bookkeeping_entry_set`.
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

        fun build(): BookkeepingEntrySet =
            BookkeepingEntrySet(
                id,
                transactionId,
                date,
                entries.map { it.toUnmodifiable() },
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Entry.Builder::class)
    @NoAutoDetect
    class Entry
    private constructor(
        private val accountId: JsonField<String>,
        private val amount: JsonField<Long>,
        private val id: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

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

        fun validate(): Entry = apply {
            if (!validated) {
                accountId()
                amount()
                id()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Entry &&
                this.accountId == other.accountId &&
                this.amount == other.amount &&
                this.id == other.id &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountId,
                        amount,
                        id,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Entry{accountId=$accountId, amount=$amount, id=$id, additionalProperties=$additionalProperties}"

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
                this.accountId = entry.accountId
                this.amount = entry.amount
                this.id = entry.id
                additionalProperties(entry.additionalProperties)
            }

            /** The bookkeeping account impacted by the entry. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The bookkeeping account impacted by the entry. */
            @JsonProperty("account_id")
            @ExcludeMissing
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The amount of the entry in minor units. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The amount of the entry in minor units. */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The entry identifier. */
            fun id(id: String) = id(JsonField.of(id))

            /** The entry identifier. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

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

            fun build(): Entry =
                Entry(
                    accountId,
                    amount,
                    id,
                    additionalProperties.toUnmodifiable(),
                )
        }
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

            @JvmField val BOOKKEEPING_ENTRY_SET = Type(JsonField.of("bookkeeping_entry_set"))

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
    }
}
