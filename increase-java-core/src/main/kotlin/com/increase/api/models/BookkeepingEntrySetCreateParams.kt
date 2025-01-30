// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Create a Bookkeeping Entry Set */
class BookkeepingEntrySetCreateParams
private constructor(
    private val body: BookkeepingEntrySetCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The bookkeeping entries. */
    fun entries(): List<Entry> = body.entries()

    /**
     * The date of the transaction. Optional if `transaction_id` is provided, in which case we use
     * the `date` of that transaction. Required otherwise.
     */
    fun date(): Optional<OffsetDateTime> = body.date()

    /** The identifier of the Transaction related to this entry set, if any. */
    fun transactionId(): Optional<String> = body.transactionId()

    /** The bookkeeping entries. */
    fun _entries(): JsonField<List<Entry>> = body._entries()

    /**
     * The date of the transaction. Optional if `transaction_id` is provided, in which case we use
     * the `date` of that transaction. Required otherwise.
     */
    fun _date(): JsonField<OffsetDateTime> = body._date()

    /** The identifier of the Transaction related to this entry set, if any. */
    fun _transactionId(): JsonField<String> = body._transactionId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): BookkeepingEntrySetCreateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class BookkeepingEntrySetCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("entries")
        @ExcludeMissing
        private val entries: JsonField<List<Entry>> = JsonMissing.of(),
        @JsonProperty("date")
        @ExcludeMissing
        private val date: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        private val transactionId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The bookkeeping entries. */
        fun entries(): List<Entry> = entries.getRequired("entries")

        /**
         * The date of the transaction. Optional if `transaction_id` is provided, in which case we
         * use the `date` of that transaction. Required otherwise.
         */
        fun date(): Optional<OffsetDateTime> = Optional.ofNullable(date.getNullable("date"))

        /** The identifier of the Transaction related to this entry set, if any. */
        fun transactionId(): Optional<String> =
            Optional.ofNullable(transactionId.getNullable("transaction_id"))

        /** The bookkeeping entries. */
        @JsonProperty("entries") @ExcludeMissing fun _entries(): JsonField<List<Entry>> = entries

        /**
         * The date of the transaction. Optional if `transaction_id` is provided, in which case we
         * use the `date` of that transaction. Required otherwise.
         */
        @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<OffsetDateTime> = date

        /** The identifier of the Transaction related to this entry set, if any. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun _transactionId(): JsonField<String> = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BookkeepingEntrySetCreateBody = apply {
            if (validated) {
                return@apply
            }

            entries().forEach { it.validate() }
            date()
            transactionId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BookkeepingEntrySetCreateBody]. */
        class Builder internal constructor() {

            private var entries: JsonField<MutableList<Entry>>? = null
            private var date: JsonField<OffsetDateTime> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(bookkeepingEntrySetCreateBody: BookkeepingEntrySetCreateBody) =
                apply {
                    entries = bookkeepingEntrySetCreateBody.entries.map { it.toMutableList() }
                    date = bookkeepingEntrySetCreateBody.date
                    transactionId = bookkeepingEntrySetCreateBody.transactionId
                    additionalProperties =
                        bookkeepingEntrySetCreateBody.additionalProperties.toMutableMap()
                }

            /** The bookkeeping entries. */
            fun entries(entries: List<Entry>) = entries(JsonField.of(entries))

            /** The bookkeeping entries. */
            fun entries(entries: JsonField<List<Entry>>) = apply {
                this.entries = entries.map { it.toMutableList() }
            }

            /** The bookkeeping entries. */
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
             * The date of the transaction. Optional if `transaction_id` is provided, in which case
             * we use the `date` of that transaction. Required otherwise.
             */
            fun date(date: OffsetDateTime) = date(JsonField.of(date))

            /**
             * The date of the transaction. Optional if `transaction_id` is provided, in which case
             * we use the `date` of that transaction. Required otherwise.
             */
            fun date(date: JsonField<OffsetDateTime>) = apply { this.date = date }

            /** The identifier of the Transaction related to this entry set, if any. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The identifier of the Transaction related to this entry set, if any. */
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
            }

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

            fun build(): BookkeepingEntrySetCreateBody =
                BookkeepingEntrySetCreateBody(
                    checkRequired("entries", entries).map { it.toImmutable() },
                    date,
                    transactionId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BookkeepingEntrySetCreateBody && entries == other.entries && date == other.date && transactionId == other.transactionId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(entries, date, transactionId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BookkeepingEntrySetCreateBody{entries=$entries, date=$date, transactionId=$transactionId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BookkeepingEntrySetCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: BookkeepingEntrySetCreateBody.Builder =
            BookkeepingEntrySetCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(bookkeepingEntrySetCreateParams: BookkeepingEntrySetCreateParams) =
            apply {
                body = bookkeepingEntrySetCreateParams.body.toBuilder()
                additionalHeaders = bookkeepingEntrySetCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    bookkeepingEntrySetCreateParams.additionalQueryParams.toBuilder()
            }

        /** The bookkeeping entries. */
        fun entries(entries: List<Entry>) = apply { body.entries(entries) }

        /** The bookkeeping entries. */
        fun entries(entries: JsonField<List<Entry>>) = apply { body.entries(entries) }

        /** The bookkeeping entries. */
        fun addEntry(entry: Entry) = apply { body.addEntry(entry) }

        /**
         * The date of the transaction. Optional if `transaction_id` is provided, in which case we
         * use the `date` of that transaction. Required otherwise.
         */
        fun date(date: OffsetDateTime) = apply { body.date(date) }

        /**
         * The date of the transaction. Optional if `transaction_id` is provided, in which case we
         * use the `date` of that transaction. Required otherwise.
         */
        fun date(date: JsonField<OffsetDateTime>) = apply { body.date(date) }

        /** The identifier of the Transaction related to this entry set, if any. */
        fun transactionId(transactionId: String) = apply { body.transactionId(transactionId) }

        /** The identifier of the Transaction related to this entry set, if any. */
        fun transactionId(transactionId: JsonField<String>) = apply {
            body.transactionId(transactionId)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): BookkeepingEntrySetCreateParams =
            BookkeepingEntrySetCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier for the Bookkeeping Account impacted by this entry. */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * The entry amount in the minor unit of the account currency. For dollars, for example,
         * this is cents. Debit entries have positive amounts; credit entries have negative amounts.
         */
        fun amount(): Long = amount.getRequired("amount")

        /** The identifier for the Bookkeeping Account impacted by this entry. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * The entry amount in the minor unit of the account currency. For dollars, for example,
         * this is cents. Debit entries have positive amounts; credit entries have negative amounts.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Entry = apply {
            if (validated) {
                return@apply
            }

            accountId()
            amount()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Entry]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entry: Entry) = apply {
                accountId = entry.accountId
                amount = entry.amount
                additionalProperties = entry.additionalProperties.toMutableMap()
            }

            /** The identifier for the Bookkeeping Account impacted by this entry. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The identifier for the Bookkeeping Account impacted by this entry. */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /**
             * The entry amount in the minor unit of the account currency. For dollars, for example,
             * this is cents. Debit entries have positive amounts; credit entries have negative
             * amounts.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * The entry amount in the minor unit of the account currency. For dollars, for example,
             * this is cents. Debit entries have positive amounts; credit entries have negative
             * amounts.
             */
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
                    checkRequired("accountId", accountId),
                    checkRequired("amount", amount),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Entry && accountId == other.accountId && amount == other.amount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, amount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Entry{accountId=$accountId, amount=$amount, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookkeepingEntrySetCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BookkeepingEntrySetCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
