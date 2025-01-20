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
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects
import java.util.Optional

/** Create an Event Subscription */
class EventSubscriptionCreateParams
constructor(
    private val body: EventSubscriptionCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The URL you'd like us to send webhooks to. */
    fun url(): String = body.url()

    /**
     * If specified, this subscription will only receive webhooks for Events associated with the
     * specified OAuth Connection.
     */
    fun oauthConnectionId(): Optional<String> = body.oauthConnectionId()

    /**
     * If specified, this subscription will only receive webhooks for Events with the specified
     * `category`.
     */
    fun selectedEventCategory(): Optional<SelectedEventCategory> = body.selectedEventCategory()

    /**
     * The key that will be used to sign webhooks. If no value is passed, a random string will be
     * used as default.
     */
    fun sharedSecret(): Optional<String> = body.sharedSecret()

    /** The URL you'd like us to send webhooks to. */
    fun _url(): JsonField<String> = body._url()

    /**
     * If specified, this subscription will only receive webhooks for Events associated with the
     * specified OAuth Connection.
     */
    fun _oauthConnectionId(): JsonField<String> = body._oauthConnectionId()

    /**
     * If specified, this subscription will only receive webhooks for Events with the specified
     * `category`.
     */
    fun _selectedEventCategory(): JsonField<SelectedEventCategory> = body._selectedEventCategory()

    /**
     * The key that will be used to sign webhooks. If no value is passed, a random string will be
     * used as default.
     */
    fun _sharedSecret(): JsonField<String> = body._sharedSecret()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): EventSubscriptionCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class EventSubscriptionCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("oauth_connection_id")
        @ExcludeMissing
        private val oauthConnectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("selected_event_category")
        @ExcludeMissing
        private val selectedEventCategory: JsonField<SelectedEventCategory> = JsonMissing.of(),
        @JsonProperty("shared_secret")
        @ExcludeMissing
        private val sharedSecret: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The URL you'd like us to send webhooks to. */
        fun url(): String = url.getRequired("url")

        /**
         * If specified, this subscription will only receive webhooks for Events associated with the
         * specified OAuth Connection.
         */
        fun oauthConnectionId(): Optional<String> =
            Optional.ofNullable(oauthConnectionId.getNullable("oauth_connection_id"))

        /**
         * If specified, this subscription will only receive webhooks for Events with the specified
         * `category`.
         */
        fun selectedEventCategory(): Optional<SelectedEventCategory> =
            Optional.ofNullable(selectedEventCategory.getNullable("selected_event_category"))

        /**
         * The key that will be used to sign webhooks. If no value is passed, a random string will
         * be used as default.
         */
        fun sharedSecret(): Optional<String> =
            Optional.ofNullable(sharedSecret.getNullable("shared_secret"))

        /** The URL you'd like us to send webhooks to. */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * If specified, this subscription will only receive webhooks for Events associated with the
         * specified OAuth Connection.
         */
        @JsonProperty("oauth_connection_id")
        @ExcludeMissing
        fun _oauthConnectionId(): JsonField<String> = oauthConnectionId

        /**
         * If specified, this subscription will only receive webhooks for Events with the specified
         * `category`.
         */
        @JsonProperty("selected_event_category")
        @ExcludeMissing
        fun _selectedEventCategory(): JsonField<SelectedEventCategory> = selectedEventCategory

        /**
         * The key that will be used to sign webhooks. If no value is passed, a random string will
         * be used as default.
         */
        @JsonProperty("shared_secret")
        @ExcludeMissing
        fun _sharedSecret(): JsonField<String> = sharedSecret

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): EventSubscriptionCreateBody = apply {
            if (validated) {
                return@apply
            }

            url()
            oauthConnectionId()
            selectedEventCategory()
            sharedSecret()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var url: JsonField<String>? = null
            private var oauthConnectionId: JsonField<String> = JsonMissing.of()
            private var selectedEventCategory: JsonField<SelectedEventCategory> = JsonMissing.of()
            private var sharedSecret: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(eventSubscriptionCreateBody: EventSubscriptionCreateBody) = apply {
                url = eventSubscriptionCreateBody.url
                oauthConnectionId = eventSubscriptionCreateBody.oauthConnectionId
                selectedEventCategory = eventSubscriptionCreateBody.selectedEventCategory
                sharedSecret = eventSubscriptionCreateBody.sharedSecret
                additionalProperties =
                    eventSubscriptionCreateBody.additionalProperties.toMutableMap()
            }

            /** The URL you'd like us to send webhooks to. */
            fun url(url: String) = url(JsonField.of(url))

            /** The URL you'd like us to send webhooks to. */
            fun url(url: JsonField<String>) = apply { this.url = url }

            /**
             * If specified, this subscription will only receive webhooks for Events associated with
             * the specified OAuth Connection.
             */
            fun oauthConnectionId(oauthConnectionId: String) =
                oauthConnectionId(JsonField.of(oauthConnectionId))

            /**
             * If specified, this subscription will only receive webhooks for Events associated with
             * the specified OAuth Connection.
             */
            fun oauthConnectionId(oauthConnectionId: JsonField<String>) = apply {
                this.oauthConnectionId = oauthConnectionId
            }

            /**
             * If specified, this subscription will only receive webhooks for Events with the
             * specified `category`.
             */
            fun selectedEventCategory(selectedEventCategory: SelectedEventCategory) =
                selectedEventCategory(JsonField.of(selectedEventCategory))

            /**
             * If specified, this subscription will only receive webhooks for Events with the
             * specified `category`.
             */
            fun selectedEventCategory(selectedEventCategory: JsonField<SelectedEventCategory>) =
                apply {
                    this.selectedEventCategory = selectedEventCategory
                }

            /**
             * The key that will be used to sign webhooks. If no value is passed, a random string
             * will be used as default.
             */
            fun sharedSecret(sharedSecret: String) = sharedSecret(JsonField.of(sharedSecret))

            /**
             * The key that will be used to sign webhooks. If no value is passed, a random string
             * will be used as default.
             */
            fun sharedSecret(sharedSecret: JsonField<String>) = apply {
                this.sharedSecret = sharedSecret
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

            fun build(): EventSubscriptionCreateBody =
                EventSubscriptionCreateBody(
                    checkRequired("url", url),
                    oauthConnectionId,
                    selectedEventCategory,
                    sharedSecret,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EventSubscriptionCreateBody && url == other.url && oauthConnectionId == other.oauthConnectionId && selectedEventCategory == other.selectedEventCategory && sharedSecret == other.sharedSecret && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(url, oauthConnectionId, selectedEventCategory, sharedSecret, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EventSubscriptionCreateBody{url=$url, oauthConnectionId=$oauthConnectionId, selectedEventCategory=$selectedEventCategory, sharedSecret=$sharedSecret, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: EventSubscriptionCreateBody.Builder =
            EventSubscriptionCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(eventSubscriptionCreateParams: EventSubscriptionCreateParams) = apply {
            body = eventSubscriptionCreateParams.body.toBuilder()
            additionalHeaders = eventSubscriptionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = eventSubscriptionCreateParams.additionalQueryParams.toBuilder()
        }

        /** The URL you'd like us to send webhooks to. */
        fun url(url: String) = apply { body.url(url) }

        /** The URL you'd like us to send webhooks to. */
        fun url(url: JsonField<String>) = apply { body.url(url) }

        /**
         * If specified, this subscription will only receive webhooks for Events associated with the
         * specified OAuth Connection.
         */
        fun oauthConnectionId(oauthConnectionId: String) = apply {
            body.oauthConnectionId(oauthConnectionId)
        }

        /**
         * If specified, this subscription will only receive webhooks for Events associated with the
         * specified OAuth Connection.
         */
        fun oauthConnectionId(oauthConnectionId: JsonField<String>) = apply {
            body.oauthConnectionId(oauthConnectionId)
        }

        /**
         * If specified, this subscription will only receive webhooks for Events with the specified
         * `category`.
         */
        fun selectedEventCategory(selectedEventCategory: SelectedEventCategory) = apply {
            body.selectedEventCategory(selectedEventCategory)
        }

        /**
         * If specified, this subscription will only receive webhooks for Events with the specified
         * `category`.
         */
        fun selectedEventCategory(selectedEventCategory: JsonField<SelectedEventCategory>) = apply {
            body.selectedEventCategory(selectedEventCategory)
        }

        /**
         * The key that will be used to sign webhooks. If no value is passed, a random string will
         * be used as default.
         */
        fun sharedSecret(sharedSecret: String) = apply { body.sharedSecret(sharedSecret) }

        /**
         * The key that will be used to sign webhooks. If no value is passed, a random string will
         * be used as default.
         */
        fun sharedSecret(sharedSecret: JsonField<String>) = apply {
            body.sharedSecret(sharedSecret)
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

        fun build(): EventSubscriptionCreateParams =
            EventSubscriptionCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * If specified, this subscription will only receive webhooks for Events with the specified
     * `category`.
     */
    class SelectedEventCategory
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /** Occurs whenever an Account is created. */
            @JvmField val ACCOUNT_CREATED = of("account.created")

            /** Occurs whenever an Account is updated. */
            @JvmField val ACCOUNT_UPDATED = of("account.updated")

            /** Occurs whenever an Account Number is created. */
            @JvmField val ACCOUNT_NUMBER_CREATED = of("account_number.created")

            /** Occurs whenever an Account Number is updated. */
            @JvmField val ACCOUNT_NUMBER_UPDATED = of("account_number.updated")

            /** Occurs whenever an Account Statement is created. */
            @JvmField val ACCOUNT_STATEMENT_CREATED = of("account_statement.created")

            /** Occurs whenever an Account Transfer is created. */
            @JvmField val ACCOUNT_TRANSFER_CREATED = of("account_transfer.created")

            /** Occurs whenever an Account Transfer is updated. */
            @JvmField val ACCOUNT_TRANSFER_UPDATED = of("account_transfer.updated")

            /** Occurs whenever an ACH Prenotification is created. */
            @JvmField val ACH_PRENOTIFICATION_CREATED = of("ach_prenotification.created")

            /** Occurs whenever an ACH Prenotification is updated. */
            @JvmField val ACH_PRENOTIFICATION_UPDATED = of("ach_prenotification.updated")

            /** Occurs whenever an ACH Transfer is created. */
            @JvmField val ACH_TRANSFER_CREATED = of("ach_transfer.created")

            /** Occurs whenever an ACH Transfer is updated. */
            @JvmField val ACH_TRANSFER_UPDATED = of("ach_transfer.updated")

            /** Occurs whenever a Bookkeeping Account is created. */
            @JvmField val BOOKKEEPING_ACCOUNT_CREATED = of("bookkeeping_account.created")

            /** Occurs whenever a Bookkeeping Account is updated. */
            @JvmField val BOOKKEEPING_ACCOUNT_UPDATED = of("bookkeeping_account.updated")

            /** Occurs whenever a Bookkeeping Entry Set is created. */
            @JvmField val BOOKKEEPING_ENTRY_SET_UPDATED = of("bookkeeping_entry_set.updated")

            /** Occurs whenever a Card is created. */
            @JvmField val CARD_CREATED = of("card.created")

            /** Occurs whenever a Card is updated. */
            @JvmField val CARD_UPDATED = of("card.updated")

            /** Occurs whenever a Card Payment is created. */
            @JvmField val CARD_PAYMENT_CREATED = of("card_payment.created")

            /** Occurs whenever a Card Payment is updated. */
            @JvmField val CARD_PAYMENT_UPDATED = of("card_payment.updated")

            /** Occurs whenever a Card Profile is created. */
            @JvmField val CARD_PROFILE_CREATED = of("card_profile.created")

            /** Occurs whenever a Card Profile is updated. */
            @JvmField val CARD_PROFILE_UPDATED = of("card_profile.updated")

            /** Occurs whenever a Card Dispute is created. */
            @JvmField val CARD_DISPUTE_CREATED = of("card_dispute.created")

            /** Occurs whenever a Card Dispute is updated. */
            @JvmField val CARD_DISPUTE_UPDATED = of("card_dispute.updated")

            /** Occurs whenever a Check Deposit is created. */
            @JvmField val CHECK_DEPOSIT_CREATED = of("check_deposit.created")

            /** Occurs whenever a Check Deposit is updated. */
            @JvmField val CHECK_DEPOSIT_UPDATED = of("check_deposit.updated")

            /** Occurs whenever a Check Transfer is created. */
            @JvmField val CHECK_TRANSFER_CREATED = of("check_transfer.created")

            /** Occurs whenever a Check Transfer is updated. */
            @JvmField val CHECK_TRANSFER_UPDATED = of("check_transfer.updated")

            /** Occurs whenever a Declined Transaction is created. */
            @JvmField val DECLINED_TRANSACTION_CREATED = of("declined_transaction.created")

            /** Occurs whenever a Digital Card Profile is created. */
            @JvmField val DIGITAL_CARD_PROFILE_CREATED = of("digital_card_profile.created")

            /** Occurs whenever a Digital Card Profile is updated. */
            @JvmField val DIGITAL_CARD_PROFILE_UPDATED = of("digital_card_profile.updated")

            /** Occurs whenever a Digital Wallet Token is created. */
            @JvmField val DIGITAL_WALLET_TOKEN_CREATED = of("digital_wallet_token.created")

            /** Occurs whenever a Digital Wallet Token is updated. */
            @JvmField val DIGITAL_WALLET_TOKEN_UPDATED = of("digital_wallet_token.updated")

            /** Occurs whenever a Document is created. */
            @JvmField val DOCUMENT_CREATED = of("document.created")

            /** Occurs whenever an Entity is created. */
            @JvmField val ENTITY_CREATED = of("entity.created")

            /** Occurs whenever an Entity is updated. */
            @JvmField val ENTITY_UPDATED = of("entity.updated")

            /** Occurs whenever an Event Subscription is created. */
            @JvmField val EVENT_SUBSCRIPTION_CREATED = of("event_subscription.created")

            /** Occurs whenever an Event Subscription is updated. */
            @JvmField val EVENT_SUBSCRIPTION_UPDATED = of("event_subscription.updated")

            /** Occurs whenever an Export is created. */
            @JvmField val EXPORT_CREATED = of("export.created")

            /** Occurs whenever an Export is updated. */
            @JvmField val EXPORT_UPDATED = of("export.updated")

            /** Occurs whenever an External Account is created. */
            @JvmField val EXTERNAL_ACCOUNT_CREATED = of("external_account.created")

            /** Occurs whenever an External Account is updated. */
            @JvmField val EXTERNAL_ACCOUNT_UPDATED = of("external_account.updated")

            /** Occurs whenever a File is created. */
            @JvmField val FILE_CREATED = of("file.created")

            /** Occurs whenever a Group is updated. */
            @JvmField val GROUP_UPDATED = of("group.updated")

            /**
             * Increase may send webhooks with this category to see if a webhook endpoint is working
             * properly.
             */
            @JvmField val GROUP_HEARTBEAT = of("group.heartbeat")

            /** Occurs whenever an Inbound ACH Transfer is created. */
            @JvmField val INBOUND_ACH_TRANSFER_CREATED = of("inbound_ach_transfer.created")

            /** Occurs whenever an Inbound ACH Transfer is updated. */
            @JvmField val INBOUND_ACH_TRANSFER_UPDATED = of("inbound_ach_transfer.updated")

            /** Occurs whenever an Inbound ACH Transfer Return is created. */
            @JvmField
            val INBOUND_ACH_TRANSFER_RETURN_CREATED = of("inbound_ach_transfer_return.created")

            /** Occurs whenever an Inbound ACH Transfer Return is updated. */
            @JvmField
            val INBOUND_ACH_TRANSFER_RETURN_UPDATED = of("inbound_ach_transfer_return.updated")

            /** Occurs whenever an Inbound Check Deposit is created. */
            @JvmField val INBOUND_CHECK_DEPOSIT_CREATED = of("inbound_check_deposit.created")

            /** Occurs whenever an Inbound Check Deposit is updated. */
            @JvmField val INBOUND_CHECK_DEPOSIT_UPDATED = of("inbound_check_deposit.updated")

            /** Occurs whenever an Inbound Mail Item is created. */
            @JvmField val INBOUND_MAIL_ITEM_CREATED = of("inbound_mail_item.created")

            /** Occurs whenever an Inbound Mail Item is updated. */
            @JvmField val INBOUND_MAIL_ITEM_UPDATED = of("inbound_mail_item.updated")

            /** Occurs whenever an Inbound Real-Time Payments Transfer is created. */
            @JvmField
            val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CREATED =
                of("inbound_real_time_payments_transfer.created")

            /** Occurs whenever an Inbound Real-Time Payments Transfer is updated. */
            @JvmField
            val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_UPDATED =
                of("inbound_real_time_payments_transfer.updated")

            /** Occurs whenever an Inbound Wire Drawdown Request is created. */
            @JvmField
            val INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED = of("inbound_wire_drawdown_request.created")

            /** Occurs whenever an Inbound Wire Transfer is created. */
            @JvmField val INBOUND_WIRE_TRANSFER_CREATED = of("inbound_wire_transfer.created")

            /** Occurs whenever an Inbound Wire Transfer is updated. */
            @JvmField val INBOUND_WIRE_TRANSFER_UPDATED = of("inbound_wire_transfer.updated")

            /** Occurs whenever an IntraFi Account Enrollment is created. */
            @JvmField
            val INTRAFI_ACCOUNT_ENROLLMENT_CREATED = of("intrafi_account_enrollment.created")

            /** Occurs whenever an IntraFi Account Enrollment is updated. */
            @JvmField
            val INTRAFI_ACCOUNT_ENROLLMENT_UPDATED = of("intrafi_account_enrollment.updated")

            /** Occurs whenever an IntraFi Exclusion is created. */
            @JvmField val INTRAFI_EXCLUSION_CREATED = of("intrafi_exclusion.created")

            /** Occurs whenever an IntraFi Exclusion is updated. */
            @JvmField val INTRAFI_EXCLUSION_UPDATED = of("intrafi_exclusion.updated")

            /** Occurs whenever a Lockbox is created. */
            @JvmField val LOCKBOX_CREATED = of("lockbox.created")

            /** Occurs whenever a Lockbox is updated. */
            @JvmField val LOCKBOX_UPDATED = of("lockbox.updated")

            /** Occurs whenever an OAuth Connection is created. */
            @JvmField val OAUTH_CONNECTION_CREATED = of("oauth_connection.created")

            /** Occurs whenever an OAuth Connection is deactivated. */
            @JvmField val OAUTH_CONNECTION_DEACTIVATED = of("oauth_connection.deactivated")

            /** Occurs whenever a Pending Transaction is created. */
            @JvmField val PENDING_TRANSACTION_CREATED = of("pending_transaction.created")

            /** Occurs whenever a Pending Transaction is updated. */
            @JvmField val PENDING_TRANSACTION_UPDATED = of("pending_transaction.updated")

            /** Occurs whenever a Physical Card is created. */
            @JvmField val PHYSICAL_CARD_CREATED = of("physical_card.created")

            /** Occurs whenever a Physical Card is updated. */
            @JvmField val PHYSICAL_CARD_UPDATED = of("physical_card.updated")

            /** Occurs whenever a Physical Card Profile is created. */
            @JvmField val PHYSICAL_CARD_PROFILE_CREATED = of("physical_card_profile.created")

            /** Occurs whenever a Physical Card Profile is updated. */
            @JvmField val PHYSICAL_CARD_PROFILE_UPDATED = of("physical_card_profile.updated")

            /** Occurs whenever a Proof of Authorization Request is created. */
            @JvmField
            val PROOF_OF_AUTHORIZATION_REQUEST_CREATED =
                of("proof_of_authorization_request.created")

            /** Occurs whenever a Proof of Authorization Request is updated. */
            @JvmField
            val PROOF_OF_AUTHORIZATION_REQUEST_UPDATED =
                of("proof_of_authorization_request.updated")

            /** Occurs whenever a Proof of Authorization Request Submission is created. */
            @JvmField
            val PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_CREATED =
                of("proof_of_authorization_request_submission.created")

            /** Occurs whenever a Proof of Authorization Request Submission is updated. */
            @JvmField
            val PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_UPDATED =
                of("proof_of_authorization_request_submission.updated")

            /**
             * Occurs whenever a Real-Time Decision is created in response to a card authorization.
             */
            @JvmField
            val REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED =
                of("real_time_decision.card_authorization_requested")

            /**
             * Occurs whenever a Real-Time Decision is created in response to a digital wallet
             * provisioning attempt.
             */
            @JvmField
            val REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED =
                of("real_time_decision.digital_wallet_token_requested")

            /**
             * Occurs whenever a Real-Time Decision is created in response to a digital wallet
             * requiring two-factor authentication.
             */
            @JvmField
            val REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED =
                of("real_time_decision.digital_wallet_authentication_requested")

            /**
             * Occurs whenever a Real-Time Decision is created in response to 3DS authentication.
             */
            @JvmField
            val REAL_TIME_DECISION_CARD_AUTHENTICATION_REQUESTED =
                of("real_time_decision.card_authentication_requested")

            /**
             * Occurs whenever a Real-Time Decision is created in response to 3DS authentication
             * challenges.
             */
            @JvmField
            val REAL_TIME_DECISION_CARD_AUTHENTICATION_CHALLENGE_REQUESTED =
                of("real_time_decision.card_authentication_challenge_requested")

            /** Occurs whenever a Real-Time Payments Transfer is created. */
            @JvmField
            val REAL_TIME_PAYMENTS_TRANSFER_CREATED = of("real_time_payments_transfer.created")

            /** Occurs whenever a Real-Time Payments Transfer is updated. */
            @JvmField
            val REAL_TIME_PAYMENTS_TRANSFER_UPDATED = of("real_time_payments_transfer.updated")

            /** Occurs whenever a Real-Time Payments Request for Payment is created. */
            @JvmField
            val REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED =
                of("real_time_payments_request_for_payment.created")

            /** Occurs whenever a Real-Time Payments Request for Payment is updated. */
            @JvmField
            val REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED =
                of("real_time_payments_request_for_payment.updated")

            /** Occurs whenever a Transaction is created. */
            @JvmField val TRANSACTION_CREATED = of("transaction.created")

            /** Occurs whenever a Wire Drawdown Request is created. */
            @JvmField val WIRE_DRAWDOWN_REQUEST_CREATED = of("wire_drawdown_request.created")

            /** Occurs whenever a Wire Drawdown Request is updated. */
            @JvmField val WIRE_DRAWDOWN_REQUEST_UPDATED = of("wire_drawdown_request.updated")

            /** Occurs whenever a Wire Transfer is created. */
            @JvmField val WIRE_TRANSFER_CREATED = of("wire_transfer.created")

            /** Occurs whenever a Wire Transfer is updated. */
            @JvmField val WIRE_TRANSFER_UPDATED = of("wire_transfer.updated")

            @JvmStatic fun of(value: String) = SelectedEventCategory(JsonField.of(value))
        }

        enum class Known {
            /** Occurs whenever an Account is created. */
            ACCOUNT_CREATED,
            /** Occurs whenever an Account is updated. */
            ACCOUNT_UPDATED,
            /** Occurs whenever an Account Number is created. */
            ACCOUNT_NUMBER_CREATED,
            /** Occurs whenever an Account Number is updated. */
            ACCOUNT_NUMBER_UPDATED,
            /** Occurs whenever an Account Statement is created. */
            ACCOUNT_STATEMENT_CREATED,
            /** Occurs whenever an Account Transfer is created. */
            ACCOUNT_TRANSFER_CREATED,
            /** Occurs whenever an Account Transfer is updated. */
            ACCOUNT_TRANSFER_UPDATED,
            /** Occurs whenever an ACH Prenotification is created. */
            ACH_PRENOTIFICATION_CREATED,
            /** Occurs whenever an ACH Prenotification is updated. */
            ACH_PRENOTIFICATION_UPDATED,
            /** Occurs whenever an ACH Transfer is created. */
            ACH_TRANSFER_CREATED,
            /** Occurs whenever an ACH Transfer is updated. */
            ACH_TRANSFER_UPDATED,
            /** Occurs whenever a Bookkeeping Account is created. */
            BOOKKEEPING_ACCOUNT_CREATED,
            /** Occurs whenever a Bookkeeping Account is updated. */
            BOOKKEEPING_ACCOUNT_UPDATED,
            /** Occurs whenever a Bookkeeping Entry Set is created. */
            BOOKKEEPING_ENTRY_SET_UPDATED,
            /** Occurs whenever a Card is created. */
            CARD_CREATED,
            /** Occurs whenever a Card is updated. */
            CARD_UPDATED,
            /** Occurs whenever a Card Payment is created. */
            CARD_PAYMENT_CREATED,
            /** Occurs whenever a Card Payment is updated. */
            CARD_PAYMENT_UPDATED,
            /** Occurs whenever a Card Profile is created. */
            CARD_PROFILE_CREATED,
            /** Occurs whenever a Card Profile is updated. */
            CARD_PROFILE_UPDATED,
            /** Occurs whenever a Card Dispute is created. */
            CARD_DISPUTE_CREATED,
            /** Occurs whenever a Card Dispute is updated. */
            CARD_DISPUTE_UPDATED,
            /** Occurs whenever a Check Deposit is created. */
            CHECK_DEPOSIT_CREATED,
            /** Occurs whenever a Check Deposit is updated. */
            CHECK_DEPOSIT_UPDATED,
            /** Occurs whenever a Check Transfer is created. */
            CHECK_TRANSFER_CREATED,
            /** Occurs whenever a Check Transfer is updated. */
            CHECK_TRANSFER_UPDATED,
            /** Occurs whenever a Declined Transaction is created. */
            DECLINED_TRANSACTION_CREATED,
            /** Occurs whenever a Digital Card Profile is created. */
            DIGITAL_CARD_PROFILE_CREATED,
            /** Occurs whenever a Digital Card Profile is updated. */
            DIGITAL_CARD_PROFILE_UPDATED,
            /** Occurs whenever a Digital Wallet Token is created. */
            DIGITAL_WALLET_TOKEN_CREATED,
            /** Occurs whenever a Digital Wallet Token is updated. */
            DIGITAL_WALLET_TOKEN_UPDATED,
            /** Occurs whenever a Document is created. */
            DOCUMENT_CREATED,
            /** Occurs whenever an Entity is created. */
            ENTITY_CREATED,
            /** Occurs whenever an Entity is updated. */
            ENTITY_UPDATED,
            /** Occurs whenever an Event Subscription is created. */
            EVENT_SUBSCRIPTION_CREATED,
            /** Occurs whenever an Event Subscription is updated. */
            EVENT_SUBSCRIPTION_UPDATED,
            /** Occurs whenever an Export is created. */
            EXPORT_CREATED,
            /** Occurs whenever an Export is updated. */
            EXPORT_UPDATED,
            /** Occurs whenever an External Account is created. */
            EXTERNAL_ACCOUNT_CREATED,
            /** Occurs whenever an External Account is updated. */
            EXTERNAL_ACCOUNT_UPDATED,
            /** Occurs whenever a File is created. */
            FILE_CREATED,
            /** Occurs whenever a Group is updated. */
            GROUP_UPDATED,
            /**
             * Increase may send webhooks with this category to see if a webhook endpoint is working
             * properly.
             */
            GROUP_HEARTBEAT,
            /** Occurs whenever an Inbound ACH Transfer is created. */
            INBOUND_ACH_TRANSFER_CREATED,
            /** Occurs whenever an Inbound ACH Transfer is updated. */
            INBOUND_ACH_TRANSFER_UPDATED,
            /** Occurs whenever an Inbound ACH Transfer Return is created. */
            INBOUND_ACH_TRANSFER_RETURN_CREATED,
            /** Occurs whenever an Inbound ACH Transfer Return is updated. */
            INBOUND_ACH_TRANSFER_RETURN_UPDATED,
            /** Occurs whenever an Inbound Check Deposit is created. */
            INBOUND_CHECK_DEPOSIT_CREATED,
            /** Occurs whenever an Inbound Check Deposit is updated. */
            INBOUND_CHECK_DEPOSIT_UPDATED,
            /** Occurs whenever an Inbound Mail Item is created. */
            INBOUND_MAIL_ITEM_CREATED,
            /** Occurs whenever an Inbound Mail Item is updated. */
            INBOUND_MAIL_ITEM_UPDATED,
            /** Occurs whenever an Inbound Real-Time Payments Transfer is created. */
            INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CREATED,
            /** Occurs whenever an Inbound Real-Time Payments Transfer is updated. */
            INBOUND_REAL_TIME_PAYMENTS_TRANSFER_UPDATED,
            /** Occurs whenever an Inbound Wire Drawdown Request is created. */
            INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED,
            /** Occurs whenever an Inbound Wire Transfer is created. */
            INBOUND_WIRE_TRANSFER_CREATED,
            /** Occurs whenever an Inbound Wire Transfer is updated. */
            INBOUND_WIRE_TRANSFER_UPDATED,
            /** Occurs whenever an IntraFi Account Enrollment is created. */
            INTRAFI_ACCOUNT_ENROLLMENT_CREATED,
            /** Occurs whenever an IntraFi Account Enrollment is updated. */
            INTRAFI_ACCOUNT_ENROLLMENT_UPDATED,
            /** Occurs whenever an IntraFi Exclusion is created. */
            INTRAFI_EXCLUSION_CREATED,
            /** Occurs whenever an IntraFi Exclusion is updated. */
            INTRAFI_EXCLUSION_UPDATED,
            /** Occurs whenever a Lockbox is created. */
            LOCKBOX_CREATED,
            /** Occurs whenever a Lockbox is updated. */
            LOCKBOX_UPDATED,
            /** Occurs whenever an OAuth Connection is created. */
            OAUTH_CONNECTION_CREATED,
            /** Occurs whenever an OAuth Connection is deactivated. */
            OAUTH_CONNECTION_DEACTIVATED,
            /** Occurs whenever a Pending Transaction is created. */
            PENDING_TRANSACTION_CREATED,
            /** Occurs whenever a Pending Transaction is updated. */
            PENDING_TRANSACTION_UPDATED,
            /** Occurs whenever a Physical Card is created. */
            PHYSICAL_CARD_CREATED,
            /** Occurs whenever a Physical Card is updated. */
            PHYSICAL_CARD_UPDATED,
            /** Occurs whenever a Physical Card Profile is created. */
            PHYSICAL_CARD_PROFILE_CREATED,
            /** Occurs whenever a Physical Card Profile is updated. */
            PHYSICAL_CARD_PROFILE_UPDATED,
            /** Occurs whenever a Proof of Authorization Request is created. */
            PROOF_OF_AUTHORIZATION_REQUEST_CREATED,
            /** Occurs whenever a Proof of Authorization Request is updated. */
            PROOF_OF_AUTHORIZATION_REQUEST_UPDATED,
            /** Occurs whenever a Proof of Authorization Request Submission is created. */
            PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_CREATED,
            /** Occurs whenever a Proof of Authorization Request Submission is updated. */
            PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_UPDATED,
            /**
             * Occurs whenever a Real-Time Decision is created in response to a card authorization.
             */
            REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED,
            /**
             * Occurs whenever a Real-Time Decision is created in response to a digital wallet
             * provisioning attempt.
             */
            REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED,
            /**
             * Occurs whenever a Real-Time Decision is created in response to a digital wallet
             * requiring two-factor authentication.
             */
            REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED,
            /**
             * Occurs whenever a Real-Time Decision is created in response to 3DS authentication.
             */
            REAL_TIME_DECISION_CARD_AUTHENTICATION_REQUESTED,
            /**
             * Occurs whenever a Real-Time Decision is created in response to 3DS authentication
             * challenges.
             */
            REAL_TIME_DECISION_CARD_AUTHENTICATION_CHALLENGE_REQUESTED,
            /** Occurs whenever a Real-Time Payments Transfer is created. */
            REAL_TIME_PAYMENTS_TRANSFER_CREATED,
            /** Occurs whenever a Real-Time Payments Transfer is updated. */
            REAL_TIME_PAYMENTS_TRANSFER_UPDATED,
            /** Occurs whenever a Real-Time Payments Request for Payment is created. */
            REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED,
            /** Occurs whenever a Real-Time Payments Request for Payment is updated. */
            REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED,
            /** Occurs whenever a Transaction is created. */
            TRANSACTION_CREATED,
            /** Occurs whenever a Wire Drawdown Request is created. */
            WIRE_DRAWDOWN_REQUEST_CREATED,
            /** Occurs whenever a Wire Drawdown Request is updated. */
            WIRE_DRAWDOWN_REQUEST_UPDATED,
            /** Occurs whenever a Wire Transfer is created. */
            WIRE_TRANSFER_CREATED,
            /** Occurs whenever a Wire Transfer is updated. */
            WIRE_TRANSFER_UPDATED,
        }

        enum class Value {
            /** Occurs whenever an Account is created. */
            ACCOUNT_CREATED,
            /** Occurs whenever an Account is updated. */
            ACCOUNT_UPDATED,
            /** Occurs whenever an Account Number is created. */
            ACCOUNT_NUMBER_CREATED,
            /** Occurs whenever an Account Number is updated. */
            ACCOUNT_NUMBER_UPDATED,
            /** Occurs whenever an Account Statement is created. */
            ACCOUNT_STATEMENT_CREATED,
            /** Occurs whenever an Account Transfer is created. */
            ACCOUNT_TRANSFER_CREATED,
            /** Occurs whenever an Account Transfer is updated. */
            ACCOUNT_TRANSFER_UPDATED,
            /** Occurs whenever an ACH Prenotification is created. */
            ACH_PRENOTIFICATION_CREATED,
            /** Occurs whenever an ACH Prenotification is updated. */
            ACH_PRENOTIFICATION_UPDATED,
            /** Occurs whenever an ACH Transfer is created. */
            ACH_TRANSFER_CREATED,
            /** Occurs whenever an ACH Transfer is updated. */
            ACH_TRANSFER_UPDATED,
            /** Occurs whenever a Bookkeeping Account is created. */
            BOOKKEEPING_ACCOUNT_CREATED,
            /** Occurs whenever a Bookkeeping Account is updated. */
            BOOKKEEPING_ACCOUNT_UPDATED,
            /** Occurs whenever a Bookkeeping Entry Set is created. */
            BOOKKEEPING_ENTRY_SET_UPDATED,
            /** Occurs whenever a Card is created. */
            CARD_CREATED,
            /** Occurs whenever a Card is updated. */
            CARD_UPDATED,
            /** Occurs whenever a Card Payment is created. */
            CARD_PAYMENT_CREATED,
            /** Occurs whenever a Card Payment is updated. */
            CARD_PAYMENT_UPDATED,
            /** Occurs whenever a Card Profile is created. */
            CARD_PROFILE_CREATED,
            /** Occurs whenever a Card Profile is updated. */
            CARD_PROFILE_UPDATED,
            /** Occurs whenever a Card Dispute is created. */
            CARD_DISPUTE_CREATED,
            /** Occurs whenever a Card Dispute is updated. */
            CARD_DISPUTE_UPDATED,
            /** Occurs whenever a Check Deposit is created. */
            CHECK_DEPOSIT_CREATED,
            /** Occurs whenever a Check Deposit is updated. */
            CHECK_DEPOSIT_UPDATED,
            /** Occurs whenever a Check Transfer is created. */
            CHECK_TRANSFER_CREATED,
            /** Occurs whenever a Check Transfer is updated. */
            CHECK_TRANSFER_UPDATED,
            /** Occurs whenever a Declined Transaction is created. */
            DECLINED_TRANSACTION_CREATED,
            /** Occurs whenever a Digital Card Profile is created. */
            DIGITAL_CARD_PROFILE_CREATED,
            /** Occurs whenever a Digital Card Profile is updated. */
            DIGITAL_CARD_PROFILE_UPDATED,
            /** Occurs whenever a Digital Wallet Token is created. */
            DIGITAL_WALLET_TOKEN_CREATED,
            /** Occurs whenever a Digital Wallet Token is updated. */
            DIGITAL_WALLET_TOKEN_UPDATED,
            /** Occurs whenever a Document is created. */
            DOCUMENT_CREATED,
            /** Occurs whenever an Entity is created. */
            ENTITY_CREATED,
            /** Occurs whenever an Entity is updated. */
            ENTITY_UPDATED,
            /** Occurs whenever an Event Subscription is created. */
            EVENT_SUBSCRIPTION_CREATED,
            /** Occurs whenever an Event Subscription is updated. */
            EVENT_SUBSCRIPTION_UPDATED,
            /** Occurs whenever an Export is created. */
            EXPORT_CREATED,
            /** Occurs whenever an Export is updated. */
            EXPORT_UPDATED,
            /** Occurs whenever an External Account is created. */
            EXTERNAL_ACCOUNT_CREATED,
            /** Occurs whenever an External Account is updated. */
            EXTERNAL_ACCOUNT_UPDATED,
            /** Occurs whenever a File is created. */
            FILE_CREATED,
            /** Occurs whenever a Group is updated. */
            GROUP_UPDATED,
            /**
             * Increase may send webhooks with this category to see if a webhook endpoint is working
             * properly.
             */
            GROUP_HEARTBEAT,
            /** Occurs whenever an Inbound ACH Transfer is created. */
            INBOUND_ACH_TRANSFER_CREATED,
            /** Occurs whenever an Inbound ACH Transfer is updated. */
            INBOUND_ACH_TRANSFER_UPDATED,
            /** Occurs whenever an Inbound ACH Transfer Return is created. */
            INBOUND_ACH_TRANSFER_RETURN_CREATED,
            /** Occurs whenever an Inbound ACH Transfer Return is updated. */
            INBOUND_ACH_TRANSFER_RETURN_UPDATED,
            /** Occurs whenever an Inbound Check Deposit is created. */
            INBOUND_CHECK_DEPOSIT_CREATED,
            /** Occurs whenever an Inbound Check Deposit is updated. */
            INBOUND_CHECK_DEPOSIT_UPDATED,
            /** Occurs whenever an Inbound Mail Item is created. */
            INBOUND_MAIL_ITEM_CREATED,
            /** Occurs whenever an Inbound Mail Item is updated. */
            INBOUND_MAIL_ITEM_UPDATED,
            /** Occurs whenever an Inbound Real-Time Payments Transfer is created. */
            INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CREATED,
            /** Occurs whenever an Inbound Real-Time Payments Transfer is updated. */
            INBOUND_REAL_TIME_PAYMENTS_TRANSFER_UPDATED,
            /** Occurs whenever an Inbound Wire Drawdown Request is created. */
            INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED,
            /** Occurs whenever an Inbound Wire Transfer is created. */
            INBOUND_WIRE_TRANSFER_CREATED,
            /** Occurs whenever an Inbound Wire Transfer is updated. */
            INBOUND_WIRE_TRANSFER_UPDATED,
            /** Occurs whenever an IntraFi Account Enrollment is created. */
            INTRAFI_ACCOUNT_ENROLLMENT_CREATED,
            /** Occurs whenever an IntraFi Account Enrollment is updated. */
            INTRAFI_ACCOUNT_ENROLLMENT_UPDATED,
            /** Occurs whenever an IntraFi Exclusion is created. */
            INTRAFI_EXCLUSION_CREATED,
            /** Occurs whenever an IntraFi Exclusion is updated. */
            INTRAFI_EXCLUSION_UPDATED,
            /** Occurs whenever a Lockbox is created. */
            LOCKBOX_CREATED,
            /** Occurs whenever a Lockbox is updated. */
            LOCKBOX_UPDATED,
            /** Occurs whenever an OAuth Connection is created. */
            OAUTH_CONNECTION_CREATED,
            /** Occurs whenever an OAuth Connection is deactivated. */
            OAUTH_CONNECTION_DEACTIVATED,
            /** Occurs whenever a Pending Transaction is created. */
            PENDING_TRANSACTION_CREATED,
            /** Occurs whenever a Pending Transaction is updated. */
            PENDING_TRANSACTION_UPDATED,
            /** Occurs whenever a Physical Card is created. */
            PHYSICAL_CARD_CREATED,
            /** Occurs whenever a Physical Card is updated. */
            PHYSICAL_CARD_UPDATED,
            /** Occurs whenever a Physical Card Profile is created. */
            PHYSICAL_CARD_PROFILE_CREATED,
            /** Occurs whenever a Physical Card Profile is updated. */
            PHYSICAL_CARD_PROFILE_UPDATED,
            /** Occurs whenever a Proof of Authorization Request is created. */
            PROOF_OF_AUTHORIZATION_REQUEST_CREATED,
            /** Occurs whenever a Proof of Authorization Request is updated. */
            PROOF_OF_AUTHORIZATION_REQUEST_UPDATED,
            /** Occurs whenever a Proof of Authorization Request Submission is created. */
            PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_CREATED,
            /** Occurs whenever a Proof of Authorization Request Submission is updated. */
            PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_UPDATED,
            /**
             * Occurs whenever a Real-Time Decision is created in response to a card authorization.
             */
            REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED,
            /**
             * Occurs whenever a Real-Time Decision is created in response to a digital wallet
             * provisioning attempt.
             */
            REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED,
            /**
             * Occurs whenever a Real-Time Decision is created in response to a digital wallet
             * requiring two-factor authentication.
             */
            REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED,
            /**
             * Occurs whenever a Real-Time Decision is created in response to 3DS authentication.
             */
            REAL_TIME_DECISION_CARD_AUTHENTICATION_REQUESTED,
            /**
             * Occurs whenever a Real-Time Decision is created in response to 3DS authentication
             * challenges.
             */
            REAL_TIME_DECISION_CARD_AUTHENTICATION_CHALLENGE_REQUESTED,
            /** Occurs whenever a Real-Time Payments Transfer is created. */
            REAL_TIME_PAYMENTS_TRANSFER_CREATED,
            /** Occurs whenever a Real-Time Payments Transfer is updated. */
            REAL_TIME_PAYMENTS_TRANSFER_UPDATED,
            /** Occurs whenever a Real-Time Payments Request for Payment is created. */
            REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_CREATED,
            /** Occurs whenever a Real-Time Payments Request for Payment is updated. */
            REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT_UPDATED,
            /** Occurs whenever a Transaction is created. */
            TRANSACTION_CREATED,
            /** Occurs whenever a Wire Drawdown Request is created. */
            WIRE_DRAWDOWN_REQUEST_CREATED,
            /** Occurs whenever a Wire Drawdown Request is updated. */
            WIRE_DRAWDOWN_REQUEST_UPDATED,
            /** Occurs whenever a Wire Transfer is created. */
            WIRE_TRANSFER_CREATED,
            /** Occurs whenever a Wire Transfer is updated. */
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
                BOOKKEEPING_ACCOUNT_UPDATED -> Value.BOOKKEEPING_ACCOUNT_UPDATED
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
                DIGITAL_CARD_PROFILE_CREATED -> Value.DIGITAL_CARD_PROFILE_CREATED
                DIGITAL_CARD_PROFILE_UPDATED -> Value.DIGITAL_CARD_PROFILE_UPDATED
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
                INBOUND_CHECK_DEPOSIT_CREATED -> Value.INBOUND_CHECK_DEPOSIT_CREATED
                INBOUND_CHECK_DEPOSIT_UPDATED -> Value.INBOUND_CHECK_DEPOSIT_UPDATED
                INBOUND_MAIL_ITEM_CREATED -> Value.INBOUND_MAIL_ITEM_CREATED
                INBOUND_MAIL_ITEM_UPDATED -> Value.INBOUND_MAIL_ITEM_UPDATED
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CREATED ->
                    Value.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CREATED
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_UPDATED ->
                    Value.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_UPDATED
                INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED -> Value.INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED
                INBOUND_WIRE_TRANSFER_CREATED -> Value.INBOUND_WIRE_TRANSFER_CREATED
                INBOUND_WIRE_TRANSFER_UPDATED -> Value.INBOUND_WIRE_TRANSFER_UPDATED
                INTRAFI_ACCOUNT_ENROLLMENT_CREATED -> Value.INTRAFI_ACCOUNT_ENROLLMENT_CREATED
                INTRAFI_ACCOUNT_ENROLLMENT_UPDATED -> Value.INTRAFI_ACCOUNT_ENROLLMENT_UPDATED
                INTRAFI_EXCLUSION_CREATED -> Value.INTRAFI_EXCLUSION_CREATED
                INTRAFI_EXCLUSION_UPDATED -> Value.INTRAFI_EXCLUSION_UPDATED
                LOCKBOX_CREATED -> Value.LOCKBOX_CREATED
                LOCKBOX_UPDATED -> Value.LOCKBOX_UPDATED
                OAUTH_CONNECTION_CREATED -> Value.OAUTH_CONNECTION_CREATED
                OAUTH_CONNECTION_DEACTIVATED -> Value.OAUTH_CONNECTION_DEACTIVATED
                PENDING_TRANSACTION_CREATED -> Value.PENDING_TRANSACTION_CREATED
                PENDING_TRANSACTION_UPDATED -> Value.PENDING_TRANSACTION_UPDATED
                PHYSICAL_CARD_CREATED -> Value.PHYSICAL_CARD_CREATED
                PHYSICAL_CARD_UPDATED -> Value.PHYSICAL_CARD_UPDATED
                PHYSICAL_CARD_PROFILE_CREATED -> Value.PHYSICAL_CARD_PROFILE_CREATED
                PHYSICAL_CARD_PROFILE_UPDATED -> Value.PHYSICAL_CARD_PROFILE_UPDATED
                PROOF_OF_AUTHORIZATION_REQUEST_CREATED ->
                    Value.PROOF_OF_AUTHORIZATION_REQUEST_CREATED
                PROOF_OF_AUTHORIZATION_REQUEST_UPDATED ->
                    Value.PROOF_OF_AUTHORIZATION_REQUEST_UPDATED
                PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_CREATED ->
                    Value.PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_CREATED
                PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_UPDATED ->
                    Value.PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_UPDATED
                REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED ->
                    Value.REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED
                REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED ->
                    Value.REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED
                REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED ->
                    Value.REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED
                REAL_TIME_DECISION_CARD_AUTHENTICATION_REQUESTED ->
                    Value.REAL_TIME_DECISION_CARD_AUTHENTICATION_REQUESTED
                REAL_TIME_DECISION_CARD_AUTHENTICATION_CHALLENGE_REQUESTED ->
                    Value.REAL_TIME_DECISION_CARD_AUTHENTICATION_CHALLENGE_REQUESTED
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
                BOOKKEEPING_ACCOUNT_UPDATED -> Known.BOOKKEEPING_ACCOUNT_UPDATED
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
                DIGITAL_CARD_PROFILE_CREATED -> Known.DIGITAL_CARD_PROFILE_CREATED
                DIGITAL_CARD_PROFILE_UPDATED -> Known.DIGITAL_CARD_PROFILE_UPDATED
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
                INBOUND_CHECK_DEPOSIT_CREATED -> Known.INBOUND_CHECK_DEPOSIT_CREATED
                INBOUND_CHECK_DEPOSIT_UPDATED -> Known.INBOUND_CHECK_DEPOSIT_UPDATED
                INBOUND_MAIL_ITEM_CREATED -> Known.INBOUND_MAIL_ITEM_CREATED
                INBOUND_MAIL_ITEM_UPDATED -> Known.INBOUND_MAIL_ITEM_UPDATED
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CREATED ->
                    Known.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CREATED
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_UPDATED ->
                    Known.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_UPDATED
                INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED -> Known.INBOUND_WIRE_DRAWDOWN_REQUEST_CREATED
                INBOUND_WIRE_TRANSFER_CREATED -> Known.INBOUND_WIRE_TRANSFER_CREATED
                INBOUND_WIRE_TRANSFER_UPDATED -> Known.INBOUND_WIRE_TRANSFER_UPDATED
                INTRAFI_ACCOUNT_ENROLLMENT_CREATED -> Known.INTRAFI_ACCOUNT_ENROLLMENT_CREATED
                INTRAFI_ACCOUNT_ENROLLMENT_UPDATED -> Known.INTRAFI_ACCOUNT_ENROLLMENT_UPDATED
                INTRAFI_EXCLUSION_CREATED -> Known.INTRAFI_EXCLUSION_CREATED
                INTRAFI_EXCLUSION_UPDATED -> Known.INTRAFI_EXCLUSION_UPDATED
                LOCKBOX_CREATED -> Known.LOCKBOX_CREATED
                LOCKBOX_UPDATED -> Known.LOCKBOX_UPDATED
                OAUTH_CONNECTION_CREATED -> Known.OAUTH_CONNECTION_CREATED
                OAUTH_CONNECTION_DEACTIVATED -> Known.OAUTH_CONNECTION_DEACTIVATED
                PENDING_TRANSACTION_CREATED -> Known.PENDING_TRANSACTION_CREATED
                PENDING_TRANSACTION_UPDATED -> Known.PENDING_TRANSACTION_UPDATED
                PHYSICAL_CARD_CREATED -> Known.PHYSICAL_CARD_CREATED
                PHYSICAL_CARD_UPDATED -> Known.PHYSICAL_CARD_UPDATED
                PHYSICAL_CARD_PROFILE_CREATED -> Known.PHYSICAL_CARD_PROFILE_CREATED
                PHYSICAL_CARD_PROFILE_UPDATED -> Known.PHYSICAL_CARD_PROFILE_UPDATED
                PROOF_OF_AUTHORIZATION_REQUEST_CREATED ->
                    Known.PROOF_OF_AUTHORIZATION_REQUEST_CREATED
                PROOF_OF_AUTHORIZATION_REQUEST_UPDATED ->
                    Known.PROOF_OF_AUTHORIZATION_REQUEST_UPDATED
                PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_CREATED ->
                    Known.PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_CREATED
                PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_UPDATED ->
                    Known.PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION_UPDATED
                REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED ->
                    Known.REAL_TIME_DECISION_CARD_AUTHORIZATION_REQUESTED
                REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED ->
                    Known.REAL_TIME_DECISION_DIGITAL_WALLET_TOKEN_REQUESTED
                REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED ->
                    Known.REAL_TIME_DECISION_DIGITAL_WALLET_AUTHENTICATION_REQUESTED
                REAL_TIME_DECISION_CARD_AUTHENTICATION_REQUESTED ->
                    Known.REAL_TIME_DECISION_CARD_AUTHENTICATION_REQUESTED
                REAL_TIME_DECISION_CARD_AUTHENTICATION_CHALLENGE_REQUESTED ->
                    Known.REAL_TIME_DECISION_CARD_AUTHENTICATION_CHALLENGE_REQUESTED
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SelectedEventCategory && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventSubscriptionCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EventSubscriptionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
