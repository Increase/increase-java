// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class EventListParams
constructor(
    private val cursor: String?,
    private val limit: Long?,
    private val associatedObjectId: String?,
    private val createdAt: CreatedAt?,
    private val category: Category?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun associatedObjectId(): Optional<String> = Optional.ofNullable(associatedObjectId)

    fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

    fun category(): Optional<Category> = Optional.ofNullable(category)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.cursor?.let { params.put("cursor", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.associatedObjectId?.let { params.put("associated_object_id", listOf(it.toString())) }
        this.createdAt?.forEachQueryParam { key, values -> params.put("created_at.$key", values) }
        this.category?.forEachQueryParam { key, values -> params.put("category.$key", values) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventListParams &&
            this.cursor == other.cursor &&
            this.limit == other.limit &&
            this.associatedObjectId == other.associatedObjectId &&
            this.createdAt == other.createdAt &&
            this.category == other.category &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            cursor,
            limit,
            associatedObjectId,
            createdAt,
            category,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "EventListParams{cursor=$cursor, limit=$limit, associatedObjectId=$associatedObjectId, createdAt=$createdAt, category=$category, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cursor: String? = null
        private var limit: Long? = null
        private var associatedObjectId: String? = null
        private var createdAt: CreatedAt? = null
        private var category: Category? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventListParams: EventListParams) = apply {
            this.cursor = eventListParams.cursor
            this.limit = eventListParams.limit
            this.associatedObjectId = eventListParams.associatedObjectId
            this.createdAt = eventListParams.createdAt
            this.category = eventListParams.category
            additionalQueryParams(eventListParams.additionalQueryParams)
            additionalHeaders(eventListParams.additionalHeaders)
        }

        /** Return the page of entries after this one. */
        fun cursor(cursor: String) = apply { this.cursor = cursor }

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100 objects.
         */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Filter Events to those belonging to the object with the provided identifier. */
        fun associatedObjectId(associatedObjectId: String) = apply {
            this.associatedObjectId = associatedObjectId
        }

        fun createdAt(createdAt: CreatedAt) = apply { this.createdAt = createdAt }

        fun category(category: Category) = apply { this.category = category }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): EventListParams =
            EventListParams(
                cursor,
                limit,
                associatedObjectId,
                createdAt,
                category,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Category.Builder::class)
    @NoAutoDetect
    class Category
    private constructor(
        private val in_: List<In>?,
        private val additionalProperties: Map<String, List<String>>,
    ) {

        private var hashCode: Int = 0

        /**
         * Filter Events for those with the specified category or categories. For GET requests, this
         * should be encoded as a comma-delimited string, such as `?in=one,two,three`.
         */
        fun in_(): List<In>? = in_

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.in_?.let { putParam("in", listOf(it.joinToString(separator = ","))) }
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Category &&
                this.in_ == other.in_ &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(in_, additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Category{in_=$in_, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var in_: List<In>? = null
            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            @JvmSynthetic
            internal fun from(category: Category) = apply {
                this.in_ = category.in_
                additionalProperties(category.additionalProperties)
            }

            /**
             * Filter Events for those with the specified category or categories. For GET requests,
             * this should be encoded as a comma-delimited string, such as `?in=one,two,three`.
             */
            fun in_(in_: List<In>) = apply { this.in_ = in_ }

            fun additionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: List<String>) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, List<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): Category =
                Category(in_?.toUnmodifiable(), additionalProperties.toUnmodifiable())
        }

        class In
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is In && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ACCOUNT_CREATED = In(JsonField.of("account.created"))

                @JvmField val ACCOUNT_UPDATED = In(JsonField.of("account.updated"))

                @JvmField val ACCOUNT_NUMBER_CREATED = In(JsonField.of("account_number.created"))

                @JvmField val ACCOUNT_NUMBER_UPDATED = In(JsonField.of("account_number.updated"))

                @JvmField
                val ACCOUNT_STATEMENT_CREATED = In(JsonField.of("account_statement.created"))

                @JvmField
                val ACCOUNT_TRANSFER_CREATED = In(JsonField.of("account_transfer.created"))

                @JvmField
                val ACCOUNT_TRANSFER_UPDATED = In(JsonField.of("account_transfer.updated"))

                @JvmField
                val ACH_PRENOTIFICATION_CREATED = In(JsonField.of("ach_prenotification.created"))

                @JvmField
                val ACH_PRENOTIFICATION_UPDATED = In(JsonField.of("ach_prenotification.updated"))

                @JvmField val ACH_TRANSFER_CREATED = In(JsonField.of("ach_transfer.created"))

                @JvmField val ACH_TRANSFER_UPDATED = In(JsonField.of("ach_transfer.updated"))

                @JvmField
                val BOOKKEEPING_ACCOUNT_CREATED = In(JsonField.of("bookkeeping_account.created"))

                @JvmField
                val BOOKKEEPING_ENTRY_SET_UPDATED =
                    In(JsonField.of("bookkeeping_entry_set.updated"))

                @JvmField val CARD_CREATED = In(JsonField.of("card.created"))

                @JvmField val CARD_UPDATED = In(JsonField.of("card.updated"))

                @JvmField val CARD_PAYMENT_CREATED = In(JsonField.of("card_payment.created"))

                @JvmField val CARD_PAYMENT_UPDATED = In(JsonField.of("card_payment.updated"))

                @JvmField val CARD_PROFILE_CREATED = In(JsonField.of("card_profile.created"))

                @JvmField val CARD_PROFILE_UPDATED = In(JsonField.of("card_profile.updated"))

                @JvmField val CARD_DISPUTE_CREATED = In(JsonField.of("card_dispute.created"))

                @JvmField val CARD_DISPUTE_UPDATED = In(JsonField.of("card_dispute.updated"))

                @JvmField val CHECK_DEPOSIT_CREATED = In(JsonField.of("check_deposit.created"))

                @JvmField val CHECK_DEPOSIT_UPDATED = In(JsonField.of("check_deposit.updated"))

                @JvmField val CHECK_TRANSFER_CREATED = In(JsonField.of("check_transfer.created"))

                @JvmField val CHECK_TRANSFER_UPDATED = In(JsonField.of("check_transfer.updated"))

                @JvmField
                val DECLINED_TRANSACTION_CREATED = In(JsonField.of("declined_transaction.created"))

                @JvmField
                val DIGITAL_WALLET_TOKEN_CREATED = In(JsonField.of("digital_wallet_token.created"))

                @JvmField
                val DIGITAL_WALLET_TOKEN_UPDATED = In(JsonField.of("digital_wallet_token.updated"))

                @JvmField val DOCUMENT_CREATED = In(JsonField.of("document.created"))

                @JvmField val ENTITY_CREATED = In(JsonField.of("entity.created"))

                @JvmField val ENTITY_UPDATED = In(JsonField.of("entity.updated"))

                @JvmField
                val EVENT_SUBSCRIPTION_CREATED = In(JsonField.of("event_subscription.created"))

                @JvmField
                val EVENT_SUBSCRIPTION_UPDATED = In(JsonField.of("event_subscription.updated"))

                @JvmField val EXPORT_CREATED = In(JsonField.of("export.created"))

                @JvmField val EXPORT_UPDATED = In(JsonField.of("export.updated"))

                @JvmField
                val EXTERNAL_ACCOUNT_CREATED = In(JsonField.of("external_account.created"))

                @JvmField
                val EXTERNAL_ACCOUNT_UPDATED = In(JsonField.of("external_account.updated"))

                @JvmField val FILE_CREATED = In(JsonField.of("file.created"))

                @JvmField val GROUP_UPDATED = In(JsonField.of("group.updated"))

                @JvmField val GROUP_HEARTBEAT = In(JsonField.of("group.heartbeat"))

                @JvmField
                val INBOUND_ACH_TRANSFER_CREATED = In(JsonField.of("inbound_ach_transfer.created"))

                @JvmField
                val INBOUND_ACH_TRANSFER_UPDATED = In(JsonField.of("inbound_ach_transfer.updated"))

                @JvmField
                val INBOUND_ACH_TRANSFER_RETURN_CREATED =
                    In(JsonField.of("inbound_ach_transfer_return.created"))

                @JvmField
                val INBOUND_ACH_TRANSFER_RETURN_UPDATED =
                    In(JsonField.of("inbound_ach_transfer_return.updated"))

                @JvmField
                val INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED =
                    In(JsonField.of("inbound_wire_drawdown_request.created"))

                @JvmField
                val INTRAFI_ACCOUNT_ENROLLMENT_CREATED =
                    In(JsonField.of("intrafi_account_enrollment.created"))

                @JvmField
                val INTRAFI_ACCOUNT_ENROLLMENT_UPDATED =
                    In(JsonField.of("intrafi_account_enrollment.updated"))

                @JvmField
                val INTRAFI_EXCLUSION_CREATED = In(JsonField.of("intrafi_exclusion.created"))

                @JvmField
                val INTRAFI_EXCLUSION_UPDATED = In(JsonField.of("intrafi_exclusion.updated"))

                @JvmField
                val OAUTH_CONNECTION_CREATED = In(JsonField.of("oauth_connection.created"))

                @JvmField
                val OAUTH_CONNECTION_DEACTIVATED = In(JsonField.of("oauth_connection.deactivated"))

                @JvmField
                val PENDING_TRANSACTION_CREATED = In(JsonField.of("pending_transaction.created"))

                @JvmField
                val PENDING_TRANSACTION_UPDATED = In(JsonField.of("pending_transaction.updated"))

                @JvmField val PHYSICAL_CARD_CREATED = In(JsonField.of("physical_card.created"))

                @JvmField val PHYSICAL_CARD_UPDATED = In(JsonField.of("physical_card.updated"))

                @JvmField
                val REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED =
                    In(JsonField.of("real_time_decision.card_authorization_requested"))

                @JvmField
                val REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED =
                    In(JsonField.of("real_time_decision.digital_wallet_token_requested"))

                @JvmField
                val REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED =
                    In(JsonField.of("real_time_decision.digital_wallet_authentication_requested"))

                @JvmField
                val REAL_TIME_PAYMENTS_TRANSFER_CREATED =
                    In(JsonField.of("real_time_payments_transfer.created"))

                @JvmField
                val REAL_TIME_PAYMENTS_TRANSFER_UPDATED =
                    In(JsonField.of("real_time_payments_transfer.updated"))

                @JvmField
                val REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED =
                    In(JsonField.of("real_time_payments_request_for_payment.created"))

                @JvmField
                val REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED =
                    In(JsonField.of("real_time_payments_request_for_payment.updated"))

                @JvmField val TRANSACTION_CREATED = In(JsonField.of("transaction.created"))

                @JvmField
                val WIRE_DRAWDOWN_REQUEST_CREATED =
                    In(JsonField.of("wire_drawdown_request.created"))

                @JvmField
                val WIRE_DRAWDOWN_REQUEST_UPDATED =
                    In(JsonField.of("wire_drawdown_request.updated"))

                @JvmField val WIRE_TRANSFER_CREATED = In(JsonField.of("wire_transfer.created"))

                @JvmField val WIRE_TRANSFER_UPDATED = In(JsonField.of("wire_transfer.updated"))

                @JvmStatic fun of(value: String) = In(JsonField.of(value))
            }

            enum class Known {
                ACCOUNT_CREATED,
                ACCOUNT_UPDATED,
                ACCOUNT_NUMBER_CREATED,
                ACCOUNT_NUMBER_UPDATED,
                ACCOUNT_STATEMENT_CREATED,
                ACCOUNT_TRANSFER_CREATED,
                ACCOUNT_TRANSFER_UPDATED,
                ACH_PRENOTIFICATION_CREATED,
                ACH_PRENOTIFICATION_UPDATED,
                ACH_TRANSFER_CREATED,
                ACH_TRANSFER_UPDATED,
                BOOKKEEPING_ACCOUNT_CREATED,
                BOOKKEEPING_ENTRY_SET_UPDATED,
                CARD_CREATED,
                CARD_UPDATED,
                CARD_PAYMENT_CREATED,
                CARD_PAYMENT_UPDATED,
                CARD_PROFILE_CREATED,
                CARD_PROFILE_UPDATED,
                CARD_DISPUTE_CREATED,
                CARD_DISPUTE_UPDATED,
                CHECK_DEPOSIT_CREATED,
                CHECK_DEPOSIT_UPDATED,
                CHECK_TRANSFER_CREATED,
                CHECK_TRANSFER_UPDATED,
                DECLINED_TRANSACTION_CREATED,
                DIGITAL_WALLET_TOKEN_CREATED,
                DIGITAL_WALLET_TOKEN_UPDATED,
                DOCUMENT_CREATED,
                ENTITY_CREATED,
                ENTITY_UPDATED,
                EVENT_SUBSCRIPTION_CREATED,
                EVENT_SUBSCRIPTION_UPDATED,
                EXPORT_CREATED,
                EXPORT_UPDATED,
                EXTERNAL_ACCOUNT_CREATED,
                EXTERNAL_ACCOUNT_UPDATED,
                FILE_CREATED,
                GROUP_UPDATED,
                GROUP_HEARTBEAT,
                INBOUND_ACH_TRANSFER_CREATED,
                INBOUND_ACH_TRANSFER_UPDATED,
                INBOUND_ACH_TRANSFER_RETURN_CREATED,
                INBOUND_ACH_TRANSFER_RETURN_UPDATED,
                INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED,
                INTRAFI_ACCOUNT_ENROLLMENT_CREATED,
                INTRAFI_ACCOUNT_ENROLLMENT_UPDATED,
                INTRAFI_EXCLUSION_CREATED,
                INTRAFI_EXCLUSION_UPDATED,
                OAUTH_CONNECTION_CREATED,
                OAUTH_CONNECTION_DEACTIVATED,
                PENDING_TRANSACTION_CREATED,
                PENDING_TRANSACTION_UPDATED,
                PHYSICAL_CARD_CREATED,
                PHYSICAL_CARD_UPDATED,
                REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED,
                REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED,
                REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED,
                REAL_TIME_PAYMENTS_TRANSFER_CREATED,
                REAL_TIME_PAYMENTS_TRANSFER_UPDATED,
                REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED,
                REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED,
                TRANSACTION_CREATED,
                WIRE_DRAWDOWN_REQUEST_CREATED,
                WIRE_DRAWDOWN_REQUEST_UPDATED,
                WIRE_TRANSFER_CREATED,
                WIRE_TRANSFER_UPDATED,
            }

            enum class Value {
                ACCOUNT_CREATED,
                ACCOUNT_UPDATED,
                ACCOUNT_NUMBER_CREATED,
                ACCOUNT_NUMBER_UPDATED,
                ACCOUNT_STATEMENT_CREATED,
                ACCOUNT_TRANSFER_CREATED,
                ACCOUNT_TRANSFER_UPDATED,
                ACH_PRENOTIFICATION_CREATED,
                ACH_PRENOTIFICATION_UPDATED,
                ACH_TRANSFER_CREATED,
                ACH_TRANSFER_UPDATED,
                BOOKKEEPING_ACCOUNT_CREATED,
                BOOKKEEPING_ENTRY_SET_UPDATED,
                CARD_CREATED,
                CARD_UPDATED,
                CARD_PAYMENT_CREATED,
                CARD_PAYMENT_UPDATED,
                CARD_PROFILE_CREATED,
                CARD_PROFILE_UPDATED,
                CARD_DISPUTE_CREATED,
                CARD_DISPUTE_UPDATED,
                CHECK_DEPOSIT_CREATED,
                CHECK_DEPOSIT_UPDATED,
                CHECK_TRANSFER_CREATED,
                CHECK_TRANSFER_UPDATED,
                DECLINED_TRANSACTION_CREATED,
                DIGITAL_WALLET_TOKEN_CREATED,
                DIGITAL_WALLET_TOKEN_UPDATED,
                DOCUMENT_CREATED,
                ENTITY_CREATED,
                ENTITY_UPDATED,
                EVENT_SUBSCRIPTION_CREATED,
                EVENT_SUBSCRIPTION_UPDATED,
                EXPORT_CREATED,
                EXPORT_UPDATED,
                EXTERNAL_ACCOUNT_CREATED,
                EXTERNAL_ACCOUNT_UPDATED,
                FILE_CREATED,
                GROUP_UPDATED,
                GROUP_HEARTBEAT,
                INBOUND_ACH_TRANSFER_CREATED,
                INBOUND_ACH_TRANSFER_UPDATED,
                INBOUND_ACH_TRANSFER_RETURN_CREATED,
                INBOUND_ACH_TRANSFER_RETURN_UPDATED,
                INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED,
                INTRAFI_ACCOUNT_ENROLLMENT_CREATED,
                INTRAFI_ACCOUNT_ENROLLMENT_UPDATED,
                INTRAFI_EXCLUSION_CREATED,
                INTRAFI_EXCLUSION_UPDATED,
                OAUTH_CONNECTION_CREATED,
                OAUTH_CONNECTION_DEACTIVATED,
                PENDING_TRANSACTION_CREATED,
                PENDING_TRANSACTION_UPDATED,
                PHYSICAL_CARD_CREATED,
                PHYSICAL_CARD_UPDATED,
                REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED,
                REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED,
                REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED,
                REAL_TIME_PAYMENTS_TRANSFER_CREATED,
                REAL_TIME_PAYMENTS_TRANSFER_UPDATED,
                REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED,
                REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED,
                TRANSACTION_CREATED,
                WIRE_DRAWDOWN_REQUEST_CREATED,
                WIRE_DRAWDOWN_REQUEST_UPDATED,
                WIRE_TRANSFER_CREATED,
                WIRE_TRANSFER_UPDATED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCOUNT_CREATED -> Value.ACCOUNT_CREATED
                    ACCOUNT_UPDATED -> Value.ACCOUNT_UPDATED
                    ACCOUNT_NUMBER_CREATED -> Value.ACCOUNT_NUMBER_CREATED
                    ACCOUNT_NUMBER_UPDATED -> Value.ACCOUNT_NUMBER_UPDATED
                    ACCOUNT_STATEMENT_CREATED -> Value.ACCOUNT_STATEMENT_CREATED
                    ACCOUNT_TRANSFER_CREATED -> Value.ACCOUNT_TRANSFER_CREATED
                    ACCOUNT_TRANSFER_UPDATED -> Value.ACCOUNT_TRANSFER_UPDATED
                    ACH_PRENOTIFICATION_CREATED -> Value.ACH_PRENOTIFICATION_CREATED
                    ACH_PRENOTIFICATION_UPDATED -> Value.ACH_PRENOTIFICATION_UPDATED
                    ACH_TRANSFER_CREATED -> Value.ACH_TRANSFER_CREATED
                    ACH_TRANSFER_UPDATED -> Value.ACH_TRANSFER_UPDATED
                    BOOKKEEPING_ACCOUNT_CREATED -> Value.BOOKKEEPING_ACCOUNT_CREATED
                    BOOKKEEPING_ENTRY_SET_UPDATED -> Value.BOOKKEEPING_ENTRY_SET_UPDATED
                    CARD_CREATED -> Value.CARD_CREATED
                    CARD_UPDATED -> Value.CARD_UPDATED
                    CARD_PAYMENT_CREATED -> Value.CARD_PAYMENT_CREATED
                    CARD_PAYMENT_UPDATED -> Value.CARD_PAYMENT_UPDATED
                    CARD_PROFILE_CREATED -> Value.CARD_PROFILE_CREATED
                    CARD_PROFILE_UPDATED -> Value.CARD_PROFILE_UPDATED
                    CARD_DISPUTE_CREATED -> Value.CARD_DISPUTE_CREATED
                    CARD_DISPUTE_UPDATED -> Value.CARD_DISPUTE_UPDATED
                    CHECK_DEPOSIT_CREATED -> Value.CHECK_DEPOSIT_CREATED
                    CHECK_DEPOSIT_UPDATED -> Value.CHECK_DEPOSIT_UPDATED
                    CHECK_TRANSFER_CREATED -> Value.CHECK_TRANSFER_CREATED
                    CHECK_TRANSFER_UPDATED -> Value.CHECK_TRANSFER_UPDATED
                    DECLINED_TRANSACTION_CREATED -> Value.DECLINED_TRANSACTION_CREATED
                    DIGITAL_WALLET_TOKEN_CREATED -> Value.DIGITAL_WALLET_TOKEN_CREATED
                    DIGITAL_WALLET_TOKEN_UPDATED -> Value.DIGITAL_WALLET_TOKEN_UPDATED
                    DOCUMENT_CREATED -> Value.DOCUMENT_CREATED
                    ENTITY_CREATED -> Value.ENTITY_CREATED
                    ENTITY_UPDATED -> Value.ENTITY_UPDATED
                    EVENT_SUBSCRIPTION_CREATED -> Value.EVENT_SUBSCRIPTION_CREATED
                    EVENT_SUBSCRIPTION_UPDATED -> Value.EVENT_SUBSCRIPTION_UPDATED
                    EXPORT_CREATED -> Value.EXPORT_CREATED
                    EXPORT_UPDATED -> Value.EXPORT_UPDATED
                    EXTERNAL_ACCOUNT_CREATED -> Value.EXTERNAL_ACCOUNT_CREATED
                    EXTERNAL_ACCOUNT_UPDATED -> Value.EXTERNAL_ACCOUNT_UPDATED
                    FILE_CREATED -> Value.FILE_CREATED
                    GROUP_UPDATED -> Value.GROUP_UPDATED
                    GROUP_HEARTBEAT -> Value.GROUP_HEARTBEAT
                    INBOUND_ACH_TRANSFER_CREATED -> Value.INBOUND_ACH_TRANSFER_CREATED
                    INBOUND_ACH_TRANSFER_UPDATED -> Value.INBOUND_ACH_TRANSFER_UPDATED
                    INBOUND_ACH_TRANSFER_RETURN_CREATED -> Value.INBOUND_ACH_TRANSFER_RETURN_CREATED
                    INBOUND_ACH_TRANSFER_RETURN_UPDATED -> Value.INBOUND_ACH_TRANSFER_RETURN_UPDATED
                    INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED ->
                        Value.INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED
                    INTRAFI_ACCOUNT_ENROLLMENT_CREATED -> Value.INTRAFI_ACCOUNT_ENROLLMENT_CREATED
                    INTRAFI_ACCOUNT_ENROLLMENT_UPDATED -> Value.INTRAFI_ACCOUNT_ENROLLMENT_UPDATED
                    INTRAFI_EXCLUSION_CREATED -> Value.INTRAFI_EXCLUSION_CREATED
                    INTRAFI_EXCLUSION_UPDATED -> Value.INTRAFI_EXCLUSION_UPDATED
                    OAUTH_CONNECTION_CREATED -> Value.OAUTH_CONNECTION_CREATED
                    OAUTH_CONNECTION_DEACTIVATED -> Value.OAUTH_CONNECTION_DEACTIVATED
                    PENDING_TRANSACTION_CREATED -> Value.PENDING_TRANSACTION_CREATED
                    PENDING_TRANSACTION_UPDATED -> Value.PENDING_TRANSACTION_UPDATED
                    PHYSICAL_CARD_CREATED -> Value.PHYSICAL_CARD_CREATED
                    PHYSICAL_CARD_UPDATED -> Value.PHYSICAL_CARD_UPDATED
                    REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED ->
                        Value.REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED
                    REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED ->
                        Value.REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED
                    REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED ->
                        Value.REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED
                    REAL_TIME_PAYMENTS_TRANSFER_CREATED -> Value.REAL_TIME_PAYMENTS_TRANSFER_CREATED
                    REAL_TIME_PAYMENTS_TRANSFER_UPDATED -> Value.REAL_TIME_PAYMENTS_TRANSFER_UPDATED
                    REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED ->
                        Value.REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED
                    REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED ->
                        Value.REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED
                    TRANSACTION_CREATED -> Value.TRANSACTION_CREATED
                    WIRE_DRAWDOWN_REQUEST_CREATED -> Value.WIRE_DRAWDOWN_REQUEST_CREATED
                    WIRE_DRAWDOWN_REQUEST_UPDATED -> Value.WIRE_DRAWDOWN_REQUEST_UPDATED
                    WIRE_TRANSFER_CREATED -> Value.WIRE_TRANSFER_CREATED
                    WIRE_TRANSFER_UPDATED -> Value.WIRE_TRANSFER_UPDATED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCOUNT_CREATED -> Known.ACCOUNT_CREATED
                    ACCOUNT_UPDATED -> Known.ACCOUNT_UPDATED
                    ACCOUNT_NUMBER_CREATED -> Known.ACCOUNT_NUMBER_CREATED
                    ACCOUNT_NUMBER_UPDATED -> Known.ACCOUNT_NUMBER_UPDATED
                    ACCOUNT_STATEMENT_CREATED -> Known.ACCOUNT_STATEMENT_CREATED
                    ACCOUNT_TRANSFER_CREATED -> Known.ACCOUNT_TRANSFER_CREATED
                    ACCOUNT_TRANSFER_UPDATED -> Known.ACCOUNT_TRANSFER_UPDATED
                    ACH_PRENOTIFICATION_CREATED -> Known.ACH_PRENOTIFICATION_CREATED
                    ACH_PRENOTIFICATION_UPDATED -> Known.ACH_PRENOTIFICATION_UPDATED
                    ACH_TRANSFER_CREATED -> Known.ACH_TRANSFER_CREATED
                    ACH_TRANSFER_UPDATED -> Known.ACH_TRANSFER_UPDATED
                    BOOKKEEPING_ACCOUNT_CREATED -> Known.BOOKKEEPING_ACCOUNT_CREATED
                    BOOKKEEPING_ENTRY_SET_UPDATED -> Known.BOOKKEEPING_ENTRY_SET_UPDATED
                    CARD_CREATED -> Known.CARD_CREATED
                    CARD_UPDATED -> Known.CARD_UPDATED
                    CARD_PAYMENT_CREATED -> Known.CARD_PAYMENT_CREATED
                    CARD_PAYMENT_UPDATED -> Known.CARD_PAYMENT_UPDATED
                    CARD_PROFILE_CREATED -> Known.CARD_PROFILE_CREATED
                    CARD_PROFILE_UPDATED -> Known.CARD_PROFILE_UPDATED
                    CARD_DISPUTE_CREATED -> Known.CARD_DISPUTE_CREATED
                    CARD_DISPUTE_UPDATED -> Known.CARD_DISPUTE_UPDATED
                    CHECK_DEPOSIT_CREATED -> Known.CHECK_DEPOSIT_CREATED
                    CHECK_DEPOSIT_UPDATED -> Known.CHECK_DEPOSIT_UPDATED
                    CHECK_TRANSFER_CREATED -> Known.CHECK_TRANSFER_CREATED
                    CHECK_TRANSFER_UPDATED -> Known.CHECK_TRANSFER_UPDATED
                    DECLINED_TRANSACTION_CREATED -> Known.DECLINED_TRANSACTION_CREATED
                    DIGITAL_WALLET_TOKEN_CREATED -> Known.DIGITAL_WALLET_TOKEN_CREATED
                    DIGITAL_WALLET_TOKEN_UPDATED -> Known.DIGITAL_WALLET_TOKEN_UPDATED
                    DOCUMENT_CREATED -> Known.DOCUMENT_CREATED
                    ENTITY_CREATED -> Known.ENTITY_CREATED
                    ENTITY_UPDATED -> Known.ENTITY_UPDATED
                    EVENT_SUBSCRIPTION_CREATED -> Known.EVENT_SUBSCRIPTION_CREATED
                    EVENT_SUBSCRIPTION_UPDATED -> Known.EVENT_SUBSCRIPTION_UPDATED
                    EXPORT_CREATED -> Known.EXPORT_CREATED
                    EXPORT_UPDATED -> Known.EXPORT_UPDATED
                    EXTERNAL_ACCOUNT_CREATED -> Known.EXTERNAL_ACCOUNT_CREATED
                    EXTERNAL_ACCOUNT_UPDATED -> Known.EXTERNAL_ACCOUNT_UPDATED
                    FILE_CREATED -> Known.FILE_CREATED
                    GROUP_UPDATED -> Known.GROUP_UPDATED
                    GROUP_HEARTBEAT -> Known.GROUP_HEARTBEAT
                    INBOUND_ACH_TRANSFER_CREATED -> Known.INBOUND_ACH_TRANSFER_CREATED
                    INBOUND_ACH_TRANSFER_UPDATED -> Known.INBOUND_ACH_TRANSFER_UPDATED
                    INBOUND_ACH_TRANSFER_RETURN_CREATED -> Known.INBOUND_ACH_TRANSFER_RETURN_CREATED
                    INBOUND_ACH_TRANSFER_RETURN_UPDATED -> Known.INBOUND_ACH_TRANSFER_RETURN_UPDATED
                    INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED ->
                        Known.INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED
                    INTRAFI_ACCOUNT_ENROLLMENT_CREATED -> Known.INTRAFI_ACCOUNT_ENROLLMENT_CREATED
                    INTRAFI_ACCOUNT_ENROLLMENT_UPDATED -> Known.INTRAFI_ACCOUNT_ENROLLMENT_UPDATED
                    INTRAFI_EXCLUSION_CREATED -> Known.INTRAFI_EXCLUSION_CREATED
                    INTRAFI_EXCLUSION_UPDATED -> Known.INTRAFI_EXCLUSION_UPDATED
                    OAUTH_CONNECTION_CREATED -> Known.OAUTH_CONNECTION_CREATED
                    OAUTH_CONNECTION_DEACTIVATED -> Known.OAUTH_CONNECTION_DEACTIVATED
                    PENDING_TRANSACTION_CREATED -> Known.PENDING_TRANSACTION_CREATED
                    PENDING_TRANSACTION_UPDATED -> Known.PENDING_TRANSACTION_UPDATED
                    PHYSICAL_CARD_CREATED -> Known.PHYSICAL_CARD_CREATED
                    PHYSICAL_CARD_UPDATED -> Known.PHYSICAL_CARD_UPDATED
                    REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED ->
                        Known.REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED
                    REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED ->
                        Known.REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED
                    REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED ->
                        Known.REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED
                    REAL_TIME_PAYMENTS_TRANSFER_CREATED -> Known.REAL_TIME_PAYMENTS_TRANSFER_CREATED
                    REAL_TIME_PAYMENTS_TRANSFER_UPDATED -> Known.REAL_TIME_PAYMENTS_TRANSFER_UPDATED
                    REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED ->
                        Known.REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED
                    REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED ->
                        Known.REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED
                    TRANSACTION_CREATED -> Known.TRANSACTION_CREATED
                    WIRE_DRAWDOWN_REQUEST_CREATED -> Known.WIRE_DRAWDOWN_REQUEST_CREATED
                    WIRE_DRAWDOWN_REQUEST_UPDATED -> Known.WIRE_DRAWDOWN_REQUEST_UPDATED
                    WIRE_TRANSFER_CREATED -> Known.WIRE_TRANSFER_CREATED
                    WIRE_TRANSFER_UPDATED -> Known.WIRE_TRANSFER_UPDATED
                    else -> throw IncreaseInvalidDataException("Unknown In: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @JsonDeserialize(builder = CreatedAt.Builder::class)
    @NoAutoDetect
    class CreatedAt
    private constructor(
        private val after: OffsetDateTime?,
        private val before: OffsetDateTime?,
        private val onOrAfter: OffsetDateTime?,
        private val onOrBefore: OffsetDateTime?,
        private val additionalProperties: Map<String, List<String>>,
    ) {

        private var hashCode: Int = 0

        /**
         * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
         */
        fun after(): OffsetDateTime? = after

        /**
         * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
         */
        fun before(): OffsetDateTime? = before

        /**
         * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
         * timestamp.
         */
        fun onOrAfter(): OffsetDateTime? = onOrAfter

        /**
         * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
         * timestamp.
         */
        fun onOrBefore(): OffsetDateTime? = onOrBefore

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.after?.let { putParam("after", listOf(it.toString())) }
            this.before?.let { putParam("before", listOf(it.toString())) }
            this.onOrAfter?.let { putParam("on_or_after", listOf(it.toString())) }
            this.onOrBefore?.let { putParam("on_or_before", listOf(it.toString())) }
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreatedAt &&
                this.after == other.after &&
                this.before == other.before &&
                this.onOrAfter == other.onOrAfter &&
                this.onOrBefore == other.onOrBefore &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        after,
                        before,
                        onOrAfter,
                        onOrBefore,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CreatedAt{after=$after, before=$before, onOrAfter=$onOrAfter, onOrBefore=$onOrBefore, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var after: OffsetDateTime? = null
            private var before: OffsetDateTime? = null
            private var onOrAfter: OffsetDateTime? = null
            private var onOrBefore: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            @JvmSynthetic
            internal fun from(createdAt: CreatedAt) = apply {
                this.after = createdAt.after
                this.before = createdAt.before
                this.onOrAfter = createdAt.onOrAfter
                this.onOrBefore = createdAt.onOrBefore
                additionalProperties(createdAt.additionalProperties)
            }

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun after(after: OffsetDateTime) = apply { this.after = after }

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun before(before: OffsetDateTime) = apply { this.before = before }

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrAfter(onOrAfter: OffsetDateTime) = apply { this.onOrAfter = onOrAfter }

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrBefore(onOrBefore: OffsetDateTime) = apply { this.onOrBefore = onOrBefore }

            fun additionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: List<String>) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, List<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): CreatedAt =
                CreatedAt(
                    after,
                    before,
                    onOrAfter,
                    onOrBefore,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
