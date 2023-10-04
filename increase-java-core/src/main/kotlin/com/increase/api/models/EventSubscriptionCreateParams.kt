// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class EventSubscriptionCreateParams
constructor(
    private val url: String,
    private val selectedEventCategory: SelectedEventCategory?,
    private val sharedSecret: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun url(): String = url

    fun selectedEventCategory(): Optional<SelectedEventCategory> =
        Optional.ofNullable(selectedEventCategory)

    fun sharedSecret(): Optional<String> = Optional.ofNullable(sharedSecret)

    @JvmSynthetic
    internal fun getBody(): EventSubscriptionCreateBody {
        return EventSubscriptionCreateBody(
            url,
            selectedEventCategory,
            sharedSecret,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = EventSubscriptionCreateBody.Builder::class)
    @NoAutoDetect
    class EventSubscriptionCreateBody
    internal constructor(
        private val url: String?,
        private val selectedEventCategory: SelectedEventCategory?,
        private val sharedSecret: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The URL you'd like us to send webhooks to. */
        @JsonProperty("url") fun url(): String? = url

        /**
         * If specified, this subscription will only receive webhooks for Events with the specified
         * `category`.
         */
        @JsonProperty("selected_event_category")
        fun selectedEventCategory(): SelectedEventCategory? = selectedEventCategory

        /**
         * The key that will be used to sign webhooks. If no value is passed, a random string will
         * be used as default.
         */
        @JsonProperty("shared_secret") fun sharedSecret(): String? = sharedSecret

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EventSubscriptionCreateBody &&
                this.url == other.url &&
                this.selectedEventCategory == other.selectedEventCategory &&
                this.sharedSecret == other.sharedSecret &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        url,
                        selectedEventCategory,
                        sharedSecret,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "EventSubscriptionCreateBody{url=$url, selectedEventCategory=$selectedEventCategory, sharedSecret=$sharedSecret, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var url: String? = null
            private var selectedEventCategory: SelectedEventCategory? = null
            private var sharedSecret: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(eventSubscriptionCreateBody: EventSubscriptionCreateBody) = apply {
                this.url = eventSubscriptionCreateBody.url
                this.selectedEventCategory = eventSubscriptionCreateBody.selectedEventCategory
                this.sharedSecret = eventSubscriptionCreateBody.sharedSecret
                additionalProperties(eventSubscriptionCreateBody.additionalProperties)
            }

            /** The URL you'd like us to send webhooks to. */
            @JsonProperty("url") fun url(url: String) = apply { this.url = url }

            /**
             * If specified, this subscription will only receive webhooks for Events with the
             * specified `category`.
             */
            @JsonProperty("selected_event_category")
            fun selectedEventCategory(selectedEventCategory: SelectedEventCategory) = apply {
                this.selectedEventCategory = selectedEventCategory
            }

            /**
             * The key that will be used to sign webhooks. If no value is passed, a random string
             * will be used as default.
             */
            @JsonProperty("shared_secret")
            fun sharedSecret(sharedSecret: String) = apply { this.sharedSecret = sharedSecret }

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

            fun build(): EventSubscriptionCreateBody =
                EventSubscriptionCreateBody(
                    checkNotNull(url) { "`url` is required but was not set" },
                    selectedEventCategory,
                    sharedSecret,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventSubscriptionCreateParams &&
            this.url == other.url &&
            this.selectedEventCategory == other.selectedEventCategory &&
            this.sharedSecret == other.sharedSecret &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            url,
            selectedEventCategory,
            sharedSecret,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "EventSubscriptionCreateParams{url=$url, selectedEventCategory=$selectedEventCategory, sharedSecret=$sharedSecret, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var url: String? = null
        private var selectedEventCategory: SelectedEventCategory? = null
        private var sharedSecret: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventSubscriptionCreateParams: EventSubscriptionCreateParams) = apply {
            this.url = eventSubscriptionCreateParams.url
            this.selectedEventCategory = eventSubscriptionCreateParams.selectedEventCategory
            this.sharedSecret = eventSubscriptionCreateParams.sharedSecret
            additionalQueryParams(eventSubscriptionCreateParams.additionalQueryParams)
            additionalHeaders(eventSubscriptionCreateParams.additionalHeaders)
            additionalBodyProperties(eventSubscriptionCreateParams.additionalBodyProperties)
        }

        /** The URL you'd like us to send webhooks to. */
        fun url(url: String) = apply { this.url = url }

        /**
         * If specified, this subscription will only receive webhooks for Events with the specified
         * `category`.
         */
        fun selectedEventCategory(selectedEventCategory: SelectedEventCategory) = apply {
            this.selectedEventCategory = selectedEventCategory
        }

        /**
         * The key that will be used to sign webhooks. If no value is passed, a random string will
         * be used as default.
         */
        fun sharedSecret(sharedSecret: String) = apply { this.sharedSecret = sharedSecret }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): EventSubscriptionCreateParams =
            EventSubscriptionCreateParams(
                checkNotNull(url) { "`url` is required but was not set" },
                selectedEventCategory,
                sharedSecret,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
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

            @JvmField
            val BOOKKEEPING_ACCOUNT_CREATED =
                SelectedEventCategory(JsonField.of("bookkeeping_account.created"))

            @JvmField
            val BOOKKEEPING_ENTRY_SET_UPDATED =
                SelectedEventCategory(JsonField.of("bookkeeping_entry_set.updated"))

            @JvmField val CARD_CREATED = SelectedEventCategory(JsonField.of("card.created"))

            @JvmField val CARD_UPDATED = SelectedEventCategory(JsonField.of("card.updated"))

            @JvmField
            val CARD_PAYMENT_CREATED = SelectedEventCategory(JsonField.of("card_payment.created"))

            @JvmField
            val CARD_PAYMENT_UPDATED = SelectedEventCategory(JsonField.of("card_payment.updated"))

            @JvmField
            val CARD_PROFILE_CREATED = SelectedEventCategory(JsonField.of("card_profile.created"))

            @JvmField
            val CARD_PROFILE_UPDATED = SelectedEventCategory(JsonField.of("card_profile.updated"))

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
            val EVENT_SUBSCRIPTION_CREATED =
                SelectedEventCategory(JsonField.of("event_subscription.created"))

            @JvmField
            val EVENT_SUBSCRIPTION_UPDATED =
                SelectedEventCategory(JsonField.of("event_subscription.updated"))

            @JvmField val EXPORT_CREATED = SelectedEventCategory(JsonField.of("export.created"))

            @JvmField val EXPORT_UPDATED = SelectedEventCategory(JsonField.of("export.updated"))

            @JvmField
            val EXTERNAL_ACCOUNT_CREATED =
                SelectedEventCategory(JsonField.of("external_account.created"))

            @JvmField
            val EXTERNAL_ACCOUNT_UPDATED =
                SelectedEventCategory(JsonField.of("external_account.updated"))

            @JvmField val FILE_CREATED = SelectedEventCategory(JsonField.of("file.created"))

            @JvmField val GROUP_UPDATED = SelectedEventCategory(JsonField.of("group.updated"))

            @JvmField val GROUP_HEARTBEAT = SelectedEventCategory(JsonField.of("group.heartbeat"))

            @JvmField
            val INBOUND_ACH_TRANSFER_CREATED =
                SelectedEventCategory(JsonField.of("inbound_ach_transfer.created"))

            @JvmField
            val INBOUND_ACH_TRANSFER_UPDATED =
                SelectedEventCategory(JsonField.of("inbound_ach_transfer.updated"))

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
            val INTRAFI_ACCOUNT_ENROLLMENT_CREATED =
                SelectedEventCategory(JsonField.of("intrafi_account_enrollment.created"))

            @JvmField
            val INTRAFI_ACCOUNT_ENROLLMENT_UPDATED =
                SelectedEventCategory(JsonField.of("intrafi_account_enrollment.updated"))

            @JvmField
            val INTRAFI_EXCLUSION_CREATED =
                SelectedEventCategory(JsonField.of("intrafi_exclusion.created"))

            @JvmField
            val INTRAFI_EXCLUSION_UPDATED =
                SelectedEventCategory(JsonField.of("intrafi_exclusion.updated"))

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
            val PHYSICAL_CARD_CREATED = SelectedEventCategory(JsonField.of("physical_card.created"))

            @JvmField
            val PHYSICAL_CARD_UPDATED = SelectedEventCategory(JsonField.of("physical_card.updated"))

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
                INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED -> Value.INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED
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
                INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED -> Known.INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED
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
                else -> throw IncreaseInvalidDataException("Unknown SelectedEventCategory: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
