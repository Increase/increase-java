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

/**
 * Webhooks are event notifications we send to you by HTTPS POST requests. Event Subscriptions are
 * how you configure your application to listen for them. You can create an Event Subscription
 * through your [developer dashboard](https://dashboard.increase.com/developers/webhooks) or the
 * API. For more information, see our [webhooks guide](https://increase.com/documentation/webhooks).
 */
@JsonDeserialize(builder = EventSubscription.Builder::class)
@NoAutoDetect
class EventSubscription
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val selectedEventCategory: JsonField<SelectedEventCategory>,
    private val url: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The event subscription identifier. */
    fun id(): String = id.getRequired("id")

    /** The time the event subscription was created. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** This indicates if we'll send notifications to this subscription. */
    fun status(): Status = status.getRequired("status")

    /**
     * If specified, this subscription will only receive webhooks for Events with the specified
     * `category`.
     */
    fun selectedEventCategory(): Optional<SelectedEventCategory> =
        Optional.ofNullable(selectedEventCategory.getNullable("selected_event_category"))

    /** The webhook url where we'll send notifications. */
    fun url(): String = url.getRequired("url")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `event_subscription`.
     */
    fun type(): Type = type.getRequired("type")

    /** The event subscription identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The time the event subscription was created. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** This indicates if we'll send notifications to this subscription. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * If specified, this subscription will only receive webhooks for Events with the specified
     * `category`.
     */
    @JsonProperty("selected_event_category")
    @ExcludeMissing
    fun _selectedEventCategory() = selectedEventCategory

    /** The webhook url where we'll send notifications. */
    @JsonProperty("url") @ExcludeMissing fun _url() = url

    /**
     * A constant representing the object's type. For this resource it will always be
     * `event_subscription`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): EventSubscription = apply {
        if (!validated) {
            id()
            createdAt()
            status()
            selectedEventCategory()
            url()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventSubscription &&
            this.id == other.id &&
            this.createdAt == other.createdAt &&
            this.status == other.status &&
            this.selectedEventCategory == other.selectedEventCategory &&
            this.url == other.url &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    createdAt,
                    status,
                    selectedEventCategory,
                    url,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "EventSubscription{id=$id, createdAt=$createdAt, status=$status, selectedEventCategory=$selectedEventCategory, url=$url, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var selectedEventCategory: JsonField<SelectedEventCategory> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventSubscription: EventSubscription) = apply {
            this.id = eventSubscription.id
            this.createdAt = eventSubscription.createdAt
            this.status = eventSubscription.status
            this.selectedEventCategory = eventSubscription.selectedEventCategory
            this.url = eventSubscription.url
            this.type = eventSubscription.type
            additionalProperties(eventSubscription.additionalProperties)
        }

        /** The event subscription identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The event subscription identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The time the event subscription was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The time the event subscription was created. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** This indicates if we'll send notifications to this subscription. */
        fun status(status: Status) = status(JsonField.of(status))

        /** This indicates if we'll send notifications to this subscription. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * If specified, this subscription will only receive webhooks for Events with the specified
         * `category`.
         */
        fun selectedEventCategory(selectedEventCategory: SelectedEventCategory) =
            selectedEventCategory(JsonField.of(selectedEventCategory))

        /**
         * If specified, this subscription will only receive webhooks for Events with the specified
         * `category`.
         */
        @JsonProperty("selected_event_category")
        @ExcludeMissing
        fun selectedEventCategory(selectedEventCategory: JsonField<SelectedEventCategory>) = apply {
            this.selectedEventCategory = selectedEventCategory
        }

        /** The webhook url where we'll send notifications. */
        fun url(url: String) = url(JsonField.of(url))

        /** The webhook url where we'll send notifications. */
        @JsonProperty("url")
        @ExcludeMissing
        fun url(url: JsonField<String>) = apply { this.url = url }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `event_subscription`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `event_subscription`.
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

        fun build(): EventSubscription =
            EventSubscription(
                id,
                createdAt,
                status,
                selectedEventCategory,
                url,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    class SelectedEventCategory
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SelectedEventCategory && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACCOUNT_CREATED = SelectedEventCategory(JsonField.of("account.created"))

            @JvmField val ACCOUNT_UPDATED = SelectedEventCategory(JsonField.of("account.updated"))

            @JvmField
            val ACCOUNT_NUMBER_CREATED =
                SelectedEventCategory(JsonField.of("account_number.created"))

            @JvmField
            val ACCOUNT_NUMBER_UPDATED =
                SelectedEventCategory(JsonField.of("account_number.updated"))

            @JvmField
            val ACCOUNT_STATEMENT_CREATED =
                SelectedEventCategory(JsonField.of("account_statement.created"))

            @JvmField
            val ACCOUNT_TRANSFER_CREATED =
                SelectedEventCategory(JsonField.of("account_transfer.created"))

            @JvmField
            val ACCOUNT_TRANSFER_UPDATED =
                SelectedEventCategory(JsonField.of("account_transfer.updated"))

            @JvmField
            val ACH_PRENOTIFICATION_CREATED =
                SelectedEventCategory(JsonField.of("ach_prenotification.created"))

            @JvmField
            val ACH_PRENOTIFICATION_UPDATED =
                SelectedEventCategory(JsonField.of("ach_prenotification.updated"))

            @JvmField
            val ACH_TRANSFER_CREATED = SelectedEventCategory(JsonField.of("ach_transfer.created"))

            @JvmField
            val ACH_TRANSFER_UPDATED = SelectedEventCategory(JsonField.of("ach_transfer.updated"))

            @JvmField val CARD_CREATED = SelectedEventCategory(JsonField.of("card.created"))

            @JvmField val CARD_UPDATED = SelectedEventCategory(JsonField.of("card.updated"))

            @JvmField
            val CARD_PAYMENT_CREATED = SelectedEventCategory(JsonField.of("card_payment.created"))

            @JvmField
            val CARD_PAYMENT_UPDATED = SelectedEventCategory(JsonField.of("card_payment.updated"))

            @JvmField
            val CARD_DISPUTE_CREATED = SelectedEventCategory(JsonField.of("card_dispute.created"))

            @JvmField
            val CARD_DISPUTE_UPDATED = SelectedEventCategory(JsonField.of("card_dispute.updated"))

            @JvmField
            val CHECK_DEPOSIT_CREATED = SelectedEventCategory(JsonField.of("check_deposit.created"))

            @JvmField
            val CHECK_DEPOSIT_UPDATED = SelectedEventCategory(JsonField.of("check_deposit.updated"))

            @JvmField
            val CHECK_TRANSFER_CREATED =
                SelectedEventCategory(JsonField.of("check_transfer.created"))

            @JvmField
            val CHECK_TRANSFER_UPDATED =
                SelectedEventCategory(JsonField.of("check_transfer.updated"))

            @JvmField
            val DECLINED_TRANSACTION_CREATED =
                SelectedEventCategory(JsonField.of("declined_transaction.created"))

            @JvmField
            val DIGITAL_WALLET_TOKEN_CREATED =
                SelectedEventCategory(JsonField.of("digital_wallet_token.created"))

            @JvmField
            val DIGITAL_WALLET_TOKEN_UPDATED =
                SelectedEventCategory(JsonField.of("digital_wallet_token.updated"))

            @JvmField val DOCUMENT_CREATED = SelectedEventCategory(JsonField.of("document.created"))

            @JvmField val ENTITY_CREATED = SelectedEventCategory(JsonField.of("entity.created"))

            @JvmField val ENTITY_UPDATED = SelectedEventCategory(JsonField.of("entity.updated"))

            @JvmField
            val EXTERNAL_ACCOUNT_CREATED =
                SelectedEventCategory(JsonField.of("external_account.created"))

            @JvmField val FILE_CREATED = SelectedEventCategory(JsonField.of("file.created"))

            @JvmField val GROUP_UPDATED = SelectedEventCategory(JsonField.of("group.updated"))

            @JvmField val GROUP_HEARTBEAT = SelectedEventCategory(JsonField.of("group.heartbeat"))

            @JvmField
            val INBOUND_ACH_TRANSFER_RETURN_CREATED =
                SelectedEventCategory(JsonField.of("inbound_ach_transfer_return.created"))

            @JvmField
            val INBOUND_ACH_TRANSFER_RETURN_UPDATED =
                SelectedEventCategory(JsonField.of("inbound_ach_transfer_return.updated"))

            @JvmField
            val INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED =
                SelectedEventCategory(JsonField.of("inbound_wire_drawdown_request.created"))

            @JvmField
            val OAUTH_CONNECTION_CREATED =
                SelectedEventCategory(JsonField.of("oauth_connection.created"))

            @JvmField
            val OAUTH_CONNECTION_DEACTIVATED =
                SelectedEventCategory(JsonField.of("oauth_connection.deactivated"))

            @JvmField
            val PENDING_TRANSACTION_CREATED =
                SelectedEventCategory(JsonField.of("pending_transaction.created"))

            @JvmField
            val PENDING_TRANSACTION_UPDATED =
                SelectedEventCategory(JsonField.of("pending_transaction.updated"))

            @JvmField
            val REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED =
                SelectedEventCategory(
                    JsonField.of("real_time_decision.card_authorization_requested")
                )

            @JvmField
            val REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED =
                SelectedEventCategory(
                    JsonField.of("real_time_decision.digital_wallet_token_requested")
                )

            @JvmField
            val REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED =
                SelectedEventCategory(
                    JsonField.of("real_time_decision.digital_wallet_authentication_requested")
                )

            @JvmField
            val REAL_TIME_PAYMENTS_TRANSFER_CREATED =
                SelectedEventCategory(JsonField.of("real_time_payments_transfer.created"))

            @JvmField
            val REAL_TIME_PAYMENTS_TRANSFER_UPDATED =
                SelectedEventCategory(JsonField.of("real_time_payments_transfer.updated"))

            @JvmField
            val REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED =
                SelectedEventCategory(
                    JsonField.of("real_time_payments_request_for_payment.created")
                )

            @JvmField
            val REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED =
                SelectedEventCategory(
                    JsonField.of("real_time_payments_request_for_payment.updated")
                )

            @JvmField
            val TRANSACTION_CREATED = SelectedEventCategory(JsonField.of("transaction.created"))

            @JvmField
            val WIRE_DRAWDOWN_REQUEST_CREATED =
                SelectedEventCategory(JsonField.of("wire_drawdown_request.created"))

            @JvmField
            val WIRE_DRAWDOWN_REQUEST_UPDATED =
                SelectedEventCategory(JsonField.of("wire_drawdown_request.updated"))

            @JvmField
            val WIRE_TRANSFER_CREATED = SelectedEventCategory(JsonField.of("wire_transfer.created"))

            @JvmField
            val WIRE_TRANSFER_UPDATED = SelectedEventCategory(JsonField.of("wire_transfer.updated"))

            @JvmStatic fun of(value: String) = SelectedEventCategory(JsonField.of(value))
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
            CARD_CREATED,
            CARD_UPDATED,
            CARD_PAYMENT_CREATED,
            CARD_PAYMENT_UPDATED,
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
            EXTERNAL_ACCOUNT_CREATED,
            FILE_CREATED,
            GROUP_UPDATED,
            GROUP_HEARTBEAT,
            INBOUND_ACH_TRANSFER_RETURN_CREATED,
            INBOUND_ACH_TRANSFER_RETURN_UPDATED,
            INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED,
            OAUTH_CONNECTION_CREATED,
            OAUTH_CONNECTION_DEACTIVATED,
            PENDING_TRANSACTION_CREATED,
            PENDING_TRANSACTION_UPDATED,
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
            CARD_CREATED,
            CARD_UPDATED,
            CARD_PAYMENT_CREATED,
            CARD_PAYMENT_UPDATED,
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
            EXTERNAL_ACCOUNT_CREATED,
            FILE_CREATED,
            GROUP_UPDATED,
            GROUP_HEARTBEAT,
            INBOUND_ACH_TRANSFER_RETURN_CREATED,
            INBOUND_ACH_TRANSFER_RETURN_UPDATED,
            INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED,
            OAUTH_CONNECTION_CREATED,
            OAUTH_CONNECTION_DEACTIVATED,
            PENDING_TRANSACTION_CREATED,
            PENDING_TRANSACTION_UPDATED,
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
                CARD_CREATED -> Value.CARD_CREATED
                CARD_UPDATED -> Value.CARD_UPDATED
                CARD_PAYMENT_CREATED -> Value.CARD_PAYMENT_CREATED
                CARD_PAYMENT_UPDATED -> Value.CARD_PAYMENT_UPDATED
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
                EXTERNAL_ACCOUNT_CREATED -> Value.EXTERNAL_ACCOUNT_CREATED
                FILE_CREATED -> Value.FILE_CREATED
                GROUP_UPDATED -> Value.GROUP_UPDATED
                GROUP_HEARTBEAT -> Value.GROUP_HEARTBEAT
                INBOUND_ACH_TRANSFER_RETURN_CREATED -> Value.INBOUND_ACH_TRANSFER_RETURN_CREATED
                INBOUND_ACH_TRANSFER_RETURN_UPDATED -> Value.INBOUND_ACH_TRANSFER_RETURN_UPDATED
                INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED -> Value.INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED
                OAUTH_CONNECTION_CREATED -> Value.OAUTH_CONNECTION_CREATED
                OAUTH_CONNECTION_DEACTIVATED -> Value.OAUTH_CONNECTION_DEACTIVATED
                PENDING_TRANSACTION_CREATED -> Value.PENDING_TRANSACTION_CREATED
                PENDING_TRANSACTION_UPDATED -> Value.PENDING_TRANSACTION_UPDATED
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
                CARD_CREATED -> Known.CARD_CREATED
                CARD_UPDATED -> Known.CARD_UPDATED
                CARD_PAYMENT_CREATED -> Known.CARD_PAYMENT_CREATED
                CARD_PAYMENT_UPDATED -> Known.CARD_PAYMENT_UPDATED
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
                EXTERNAL_ACCOUNT_CREATED -> Known.EXTERNAL_ACCOUNT_CREATED
                FILE_CREATED -> Known.FILE_CREATED
                GROUP_UPDATED -> Known.GROUP_UPDATED
                GROUP_HEARTBEAT -> Known.GROUP_HEARTBEAT
                INBOUND_ACH_TRANSFER_RETURN_CREATED -> Known.INBOUND_ACH_TRANSFER_RETURN_CREATED
                INBOUND_ACH_TRANSFER_RETURN_UPDATED -> Known.INBOUND_ACH_TRANSFER_RETURN_UPDATED
                INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED -> Known.INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED
                OAUTH_CONNECTION_CREATED -> Known.OAUTH_CONNECTION_CREATED
                OAUTH_CONNECTION_DEACTIVATED -> Known.OAUTH_CONNECTION_DEACTIVATED
                PENDING_TRANSACTION_CREATED -> Known.PENDING_TRANSACTION_CREATED
                PENDING_TRANSACTION_UPDATED -> Known.PENDING_TRANSACTION_UPDATED
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
                else -> throw IncreaseInvalidDataException("Unknown SelectedEventCategory: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACTIVE = Status(JsonField.of("active"))

            @JvmField val DISABLED = Status(JsonField.of("disabled"))

            @JvmField val DELETED = Status(JsonField.of("deleted"))

            @JvmField val REQUIRES_ATTENTION = Status(JsonField.of("requires_attention"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            DISABLED,
            DELETED,
            REQUIRES_ATTENTION,
        }

        enum class Value {
            ACTIVE,
            DISABLED,
            DELETED,
            REQUIRES_ATTENTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                DISABLED -> Value.DISABLED
                DELETED -> Value.DELETED
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                DISABLED -> Known.DISABLED
                DELETED -> Known.DELETED
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
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

            @JvmField val EVENT_SUBSCRIPTION = Type(JsonField.of("event_subscription"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            EVENT_SUBSCRIPTION,
        }

        enum class Value {
            EVENT_SUBSCRIPTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EVENT_SUBSCRIPTION -> Value.EVENT_SUBSCRIPTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EVENT_SUBSCRIPTION -> Known.EVENT_SUBSCRIPTION
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
