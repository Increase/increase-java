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
 * Account Statements are generated monthly for every active Account. You can access the statement's
 * data via the API or retrieve a PDF with its details via its associated File.
 */
@JsonDeserialize(builder = AccountStatement.Builder::class)
@NoAutoDetect
class AccountStatement
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val fileId: JsonField<String>,
    private val statementPeriodStart: JsonField<OffsetDateTime>,
    private val statementPeriodEnd: JsonField<OffsetDateTime>,
    private val startingBalance: JsonField<Long>,
    private val endingBalance: JsonField<Long>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The Account Statement identifier. */
    fun id(): String = id.getRequired("id")

    /** The identifier for the Account this Account Statement belongs to. */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account Statement
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The identifier of the File containing a PDF of the statement. */
    fun fileId(): String = fileId.getRequired("file_id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time representing the start of the
     * period the Account Statement covers.
     */
    fun statementPeriodStart(): OffsetDateTime =
        statementPeriodStart.getRequired("statement_period_start")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time representing the end of the
     * period the Account Statement covers.
     */
    fun statementPeriodEnd(): OffsetDateTime =
        statementPeriodEnd.getRequired("statement_period_end")

    /** The Account's balance at the start of its statement period. */
    fun startingBalance(): Long = startingBalance.getRequired("starting_balance")

    /** The Account's balance at the start of its statement period. */
    fun endingBalance(): Long = endingBalance.getRequired("ending_balance")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `account_statement`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Account Statement identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The identifier for the Account this Account Statement belongs to. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account Statement
     * was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The identifier of the File containing a PDF of the statement. */
    @JsonProperty("file_id") @ExcludeMissing fun _fileId() = fileId

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time representing the start of the
     * period the Account Statement covers.
     */
    @JsonProperty("statement_period_start")
    @ExcludeMissing
    fun _statementPeriodStart() = statementPeriodStart

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time representing the end of the
     * period the Account Statement covers.
     */
    @JsonProperty("statement_period_end")
    @ExcludeMissing
    fun _statementPeriodEnd() = statementPeriodEnd

    /** The Account's balance at the start of its statement period. */
    @JsonProperty("starting_balance") @ExcludeMissing fun _startingBalance() = startingBalance

    /** The Account's balance at the start of its statement period. */
    @JsonProperty("ending_balance") @ExcludeMissing fun _endingBalance() = endingBalance

    /**
     * A constant representing the object's type. For this resource it will always be
     * `account_statement`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            id()
            accountId()
            createdAt()
            fileId()
            statementPeriodStart()
            statementPeriodEnd()
            startingBalance()
            endingBalance()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountStatement &&
            this.id == other.id &&
            this.accountId == other.accountId &&
            this.createdAt == other.createdAt &&
            this.fileId == other.fileId &&
            this.statementPeriodStart == other.statementPeriodStart &&
            this.statementPeriodEnd == other.statementPeriodEnd &&
            this.startingBalance == other.startingBalance &&
            this.endingBalance == other.endingBalance &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    accountId,
                    createdAt,
                    fileId,
                    statementPeriodStart,
                    statementPeriodEnd,
                    startingBalance,
                    endingBalance,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "AccountStatement{id=$id, accountId=$accountId, createdAt=$createdAt, fileId=$fileId, statementPeriodStart=$statementPeriodStart, statementPeriodEnd=$statementPeriodEnd, startingBalance=$startingBalance, endingBalance=$endingBalance, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var fileId: JsonField<String> = JsonMissing.of()
        private var statementPeriodStart: JsonField<OffsetDateTime> = JsonMissing.of()
        private var statementPeriodEnd: JsonField<OffsetDateTime> = JsonMissing.of()
        private var startingBalance: JsonField<Long> = JsonMissing.of()
        private var endingBalance: JsonField<Long> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountStatement: AccountStatement) = apply {
            this.id = accountStatement.id
            this.accountId = accountStatement.accountId
            this.createdAt = accountStatement.createdAt
            this.fileId = accountStatement.fileId
            this.statementPeriodStart = accountStatement.statementPeriodStart
            this.statementPeriodEnd = accountStatement.statementPeriodEnd
            this.startingBalance = accountStatement.startingBalance
            this.endingBalance = accountStatement.endingBalance
            this.type = accountStatement.type
            additionalProperties(accountStatement.additionalProperties)
        }

        /** The Account Statement identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Account Statement identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier for the Account this Account Statement belongs to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier for the Account this Account Statement belongs to. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account
         * Statement was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account
         * Statement was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The identifier of the File containing a PDF of the statement. */
        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

        /** The identifier of the File containing a PDF of the statement. */
        @JsonProperty("file_id")
        @ExcludeMissing
        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time representing the start of the
         * period the Account Statement covers.
         */
        fun statementPeriodStart(statementPeriodStart: OffsetDateTime) =
            statementPeriodStart(JsonField.of(statementPeriodStart))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time representing the start of the
         * period the Account Statement covers.
         */
        @JsonProperty("statement_period_start")
        @ExcludeMissing
        fun statementPeriodStart(statementPeriodStart: JsonField<OffsetDateTime>) = apply {
            this.statementPeriodStart = statementPeriodStart
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time representing the end of the
         * period the Account Statement covers.
         */
        fun statementPeriodEnd(statementPeriodEnd: OffsetDateTime) =
            statementPeriodEnd(JsonField.of(statementPeriodEnd))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time representing the end of the
         * period the Account Statement covers.
         */
        @JsonProperty("statement_period_end")
        @ExcludeMissing
        fun statementPeriodEnd(statementPeriodEnd: JsonField<OffsetDateTime>) = apply {
            this.statementPeriodEnd = statementPeriodEnd
        }

        /** The Account's balance at the start of its statement period. */
        fun startingBalance(startingBalance: Long) = startingBalance(JsonField.of(startingBalance))

        /** The Account's balance at the start of its statement period. */
        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun startingBalance(startingBalance: JsonField<Long>) = apply {
            this.startingBalance = startingBalance
        }

        /** The Account's balance at the start of its statement period. */
        fun endingBalance(endingBalance: Long) = endingBalance(JsonField.of(endingBalance))

        /** The Account's balance at the start of its statement period. */
        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun endingBalance(endingBalance: JsonField<Long>) = apply {
            this.endingBalance = endingBalance
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `account_statement`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `account_statement`.
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

        fun build(): AccountStatement =
            AccountStatement(
                id,
                accountId,
                createdAt,
                fileId,
                statementPeriodStart,
                statementPeriodEnd,
                startingBalance,
                endingBalance,
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

            @JvmField val ACCOUNT_STATEMENT = Type(JsonField.of("account_statement"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            ACCOUNT_STATEMENT,
        }

        enum class Value {
            ACCOUNT_STATEMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCOUNT_STATEMENT -> Value.ACCOUNT_STATEMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCOUNT_STATEMENT -> Known.ACCOUNT_STATEMENT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
