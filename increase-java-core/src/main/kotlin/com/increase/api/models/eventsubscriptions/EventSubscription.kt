// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.eventsubscriptions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.checkRequired
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Webhooks are event notifications we send to you by HTTPS POST requests. Event Subscriptions are
 * how you configure your application to listen for them. You can create an Event Subscription
 * through your [developer dashboard](https://dashboard.increase.com/developers/webhooks) or the
 * API. For more information, see our [webhooks guide](https://increase.com/documentation/webhooks).
 */
class EventSubscription
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val idempotencyKey: JsonField<String>,
    private val oauthConnectionId: JsonField<String>,
    private val selectedEventCategory: JsonField<SelectedEventCategory>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("oauth_connection_id")
        @ExcludeMissing
        oauthConnectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("selected_event_category")
        @ExcludeMissing
        selectedEventCategory: JsonField<SelectedEventCategory> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        idempotencyKey,
        oauthConnectionId,
        selectedEventCategory,
        status,
        type,
        url,
        mutableMapOf(),
    )

    /**
     * The event subscription identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The time the event subscription was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idempotencyKey(): Optional<String> = idempotencyKey.getOptional("idempotency_key")

    /**
     * If specified, this subscription will only receive webhooks for Events associated with this
     * OAuth Connection.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun oauthConnectionId(): Optional<String> = oauthConnectionId.getOptional("oauth_connection_id")

    /**
     * If specified, this subscription will only receive webhooks for Events with the specified
     * `category`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun selectedEventCategory(): Optional<SelectedEventCategory> =
        selectedEventCategory.getOptional("selected_event_category")

    /**
     * This indicates if we'll send notifications to this subscription.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `event_subscription`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The webhook url where we'll send notifications.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [oauthConnectionId].
     *
     * Unlike [oauthConnectionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("oauth_connection_id")
    @ExcludeMissing
    fun _oauthConnectionId(): JsonField<String> = oauthConnectionId

    /**
     * Returns the raw JSON value of [selectedEventCategory].
     *
     * Unlike [selectedEventCategory], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("selected_event_category")
    @ExcludeMissing
    fun _selectedEventCategory(): JsonField<SelectedEventCategory> = selectedEventCategory

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventSubscription].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .idempotencyKey()
         * .oauthConnectionId()
         * .selectedEventCategory()
         * .status()
         * .type()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventSubscription]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var oauthConnectionId: JsonField<String>? = null
        private var selectedEventCategory: JsonField<SelectedEventCategory>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var url: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventSubscription: EventSubscription) = apply {
            id = eventSubscription.id
            createdAt = eventSubscription.createdAt
            idempotencyKey = eventSubscription.idempotencyKey
            oauthConnectionId = eventSubscription.oauthConnectionId
            selectedEventCategory = eventSubscription.selectedEventCategory
            status = eventSubscription.status
            type = eventSubscription.type
            url = eventSubscription.url
            additionalProperties = eventSubscription.additionalProperties.toMutableMap()
        }

        /** The event subscription identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The time the event subscription was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) =
            idempotencyKey(JsonField.ofNullable(idempotencyKey))

        /** Alias for calling [Builder.idempotencyKey] with `idempotencyKey.orElse(null)`. */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.getOrNull())

        /**
         * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /**
         * If specified, this subscription will only receive webhooks for Events associated with
         * this OAuth Connection.
         */
        fun oauthConnectionId(oauthConnectionId: String?) =
            oauthConnectionId(JsonField.ofNullable(oauthConnectionId))

        /** Alias for calling [Builder.oauthConnectionId] with `oauthConnectionId.orElse(null)`. */
        fun oauthConnectionId(oauthConnectionId: Optional<String>) =
            oauthConnectionId(oauthConnectionId.getOrNull())

        /**
         * Sets [Builder.oauthConnectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oauthConnectionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun oauthConnectionId(oauthConnectionId: JsonField<String>) = apply {
            this.oauthConnectionId = oauthConnectionId
        }

        /**
         * If specified, this subscription will only receive webhooks for Events with the specified
         * `category`.
         */
        fun selectedEventCategory(selectedEventCategory: SelectedEventCategory?) =
            selectedEventCategory(JsonField.ofNullable(selectedEventCategory))

        /**
         * Alias for calling [Builder.selectedEventCategory] with
         * `selectedEventCategory.orElse(null)`.
         */
        fun selectedEventCategory(selectedEventCategory: Optional<SelectedEventCategory>) =
            selectedEventCategory(selectedEventCategory.getOrNull())

        /**
         * Sets [Builder.selectedEventCategory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.selectedEventCategory] with a well-typed
         * [SelectedEventCategory] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun selectedEventCategory(selectedEventCategory: JsonField<SelectedEventCategory>) = apply {
            this.selectedEventCategory = selectedEventCategory
        }

        /** This indicates if we'll send notifications to this subscription. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `event_subscription`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The webhook url where we'll send notifications. */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

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

        /**
         * Returns an immutable instance of [EventSubscription].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .idempotencyKey()
         * .oauthConnectionId()
         * .selectedEventCategory()
         * .status()
         * .type()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventSubscription =
            EventSubscription(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("oauthConnectionId", oauthConnectionId),
                checkRequired("selectedEventCategory", selectedEventCategory),
                checkRequired("status", status),
                checkRequired("type", type),
                checkRequired("url", url),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EventSubscription = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        idempotencyKey()
        oauthConnectionId()
        selectedEventCategory().ifPresent { it.validate() }
        status().validate()
        type().validate()
        url()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: IncreaseInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
            (if (oauthConnectionId.asKnown().isPresent) 1 else 0) +
            (selectedEventCategory.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (url.asKnown().isPresent) 1 else 0)

    /**
     * If specified, this subscription will only receive webhooks for Events with the specified
     * `category`.
     */
    class SelectedEventCategory
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
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

            /** Occurs whenever a Legacy Card Dispute is created. */
            @JvmField val LEGACY_CARD_DISPUTE_CREATED = of("legacy_card_dispute.created")

            /** Occurs whenever a Legacy Card Dispute is updated. */
            @JvmField val LEGACY_CARD_DISPUTE_UPDATED = of("legacy_card_dispute.updated")

            /** Occurs whenever a Lockbox is created. */
            @JvmField val LOCKBOX_CREATED = of("lockbox.created")

            /** Occurs whenever a Lockbox is updated. */
            @JvmField val LOCKBOX_UPDATED = of("lockbox.updated")

            /** Occurs whenever an OAuth Connection is created. */
            @JvmField val OAUTH_CONNECTION_CREATED = of("oauth_connection.created")

            /** Occurs whenever an OAuth Connection is deactivated. */
            @JvmField val OAUTH_CONNECTION_DEACTIVATED = of("oauth_connection.deactivated")

            /** Occurs whenever a Card Push Transfer is created. */
            @JvmField
            val OUTBOUND_CARD_PUSH_TRANSFER_CREATED = of("outbound_card_push_transfer.created")

            /** Occurs whenever a Card Push Transfer is updated. */
            @JvmField
            val OUTBOUND_CARD_PUSH_TRANSFER_UPDATED = of("outbound_card_push_transfer.updated")

            /** Occurs whenever a Card Validation is created. */
            @JvmField val OUTBOUND_CARD_VALIDATION_CREATED = of("outbound_card_validation.created")

            /** Occurs whenever a Card Validation is updated. */
            @JvmField val OUTBOUND_CARD_VALIDATION_UPDATED = of("outbound_card_validation.updated")

            /** Occurs whenever a Card Push Transfer is created. */
            @JvmField val CARD_PUSH_TRANSFER_CREATED = of("card_push_transfer.created")

            /** Occurs whenever a Card Push Transfer is updated. */
            @JvmField val CARD_PUSH_TRANSFER_UPDATED = of("card_push_transfer.updated")

            /** Occurs whenever a Card Validation is created. */
            @JvmField val CARD_VALIDATION_CREATED = of("card_validation.created")

            /** Occurs whenever a Card Validation is updated. */
            @JvmField val CARD_VALIDATION_UPDATED = of("card_validation.updated")

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

            /** Occurs whenever a Program is created. */
            @JvmField val PROGRAM_CREATED = of("program.created")

            /** Occurs whenever a Program is updated. */
            @JvmField val PROGRAM_UPDATED = of("program.updated")

            /** Occurs whenever a Proof of Authorization Request is created. */
            @JvmField
            val PROOF_OF_AUTHORIZATION_REQUEST_CREATED =
                of("proof_of_authorization_request.created")

            /** Occurs whenever a Proof of Authorization Request is updated. */
            @JvmField
            val PROOF_OF_AUTHORIZATION_REQUEST_UPDATED =
                of("proof_of_authorization_request.updated")

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

            /** Occurs whenever a Swift Transfer is created. */
            @JvmField val SWIFT_TRANSFER_CREATED = of("swift_transfer.created")

            /** Occurs whenever a Swift Transfer is updated. */
            @JvmField val SWIFT_TRANSFER_UPDATED = of("swift_transfer.updated")

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

        /** An enum containing [SelectedEventCategory]'s known values. */
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
            /** Occurs whenever a Legacy Card Dispute is created. */
            LEGACY_CARD_DISPUTE_CREATED,
            /** Occurs whenever a Legacy Card Dispute is updated. */
            LEGACY_CARD_DISPUTE_UPDATED,
            /** Occurs whenever a Lockbox is created. */
            LOCKBOX_CREATED,
            /** Occurs whenever a Lockbox is updated. */
            LOCKBOX_UPDATED,
            /** Occurs whenever an OAuth Connection is created. */
            OAUTH_CONNECTION_CREATED,
            /** Occurs whenever an OAuth Connection is deactivated. */
            OAUTH_CONNECTION_DEACTIVATED,
            /** Occurs whenever a Card Push Transfer is created. */
            OUTBOUND_CARD_PUSH_TRANSFER_CREATED,
            /** Occurs whenever a Card Push Transfer is updated. */
            OUTBOUND_CARD_PUSH_TRANSFER_UPDATED,
            /** Occurs whenever a Card Validation is created. */
            OUTBOUND_CARD_VALIDATION_CREATED,
            /** Occurs whenever a Card Validation is updated. */
            OUTBOUND_CARD_VALIDATION_UPDATED,
            /** Occurs whenever a Card Push Transfer is created. */
            CARD_PUSH_TRANSFER_CREATED,
            /** Occurs whenever a Card Push Transfer is updated. */
            CARD_PUSH_TRANSFER_UPDATED,
            /** Occurs whenever a Card Validation is created. */
            CARD_VALIDATION_CREATED,
            /** Occurs whenever a Card Validation is updated. */
            CARD_VALIDATION_UPDATED,
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
            /** Occurs whenever a Program is created. */
            PROGRAM_CREATED,
            /** Occurs whenever a Program is updated. */
            PROGRAM_UPDATED,
            /** Occurs whenever a Proof of Authorization Request is created. */
            PROOF_OF_AUTHORIZATION_REQUEST_CREATED,
            /** Occurs whenever a Proof of Authorization Request is updated. */
            PROOF_OF_AUTHORIZATION_REQUEST_UPDATED,
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
            /** Occurs whenever a Swift Transfer is created. */
            SWIFT_TRANSFER_CREATED,
            /** Occurs whenever a Swift Transfer is updated. */
            SWIFT_TRANSFER_UPDATED,
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

        /**
         * An enum containing [SelectedEventCategory]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [SelectedEventCategory] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
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
            /** Occurs whenever a Legacy Card Dispute is created. */
            LEGACY_CARD_DISPUTE_CREATED,
            /** Occurs whenever a Legacy Card Dispute is updated. */
            LEGACY_CARD_DISPUTE_UPDATED,
            /** Occurs whenever a Lockbox is created. */
            LOCKBOX_CREATED,
            /** Occurs whenever a Lockbox is updated. */
            LOCKBOX_UPDATED,
            /** Occurs whenever an OAuth Connection is created. */
            OAUTH_CONNECTION_CREATED,
            /** Occurs whenever an OAuth Connection is deactivated. */
            OAUTH_CONNECTION_DEACTIVATED,
            /** Occurs whenever a Card Push Transfer is created. */
            OUTBOUND_CARD_PUSH_TRANSFER_CREATED,
            /** Occurs whenever a Card Push Transfer is updated. */
            OUTBOUND_CARD_PUSH_TRANSFER_UPDATED,
            /** Occurs whenever a Card Validation is created. */
            OUTBOUND_CARD_VALIDATION_CREATED,
            /** Occurs whenever a Card Validation is updated. */
            OUTBOUND_CARD_VALIDATION_UPDATED,
            /** Occurs whenever a Card Push Transfer is created. */
            CARD_PUSH_TRANSFER_CREATED,
            /** Occurs whenever a Card Push Transfer is updated. */
            CARD_PUSH_TRANSFER_UPDATED,
            /** Occurs whenever a Card Validation is created. */
            CARD_VALIDATION_CREATED,
            /** Occurs whenever a Card Validation is updated. */
            CARD_VALIDATION_UPDATED,
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
            /** Occurs whenever a Program is created. */
            PROGRAM_CREATED,
            /** Occurs whenever a Program is updated. */
            PROGRAM_UPDATED,
            /** Occurs whenever a Proof of Authorization Request is created. */
            PROOF_OF_AUTHORIZATION_REQUEST_CREATED,
            /** Occurs whenever a Proof of Authorization Request is updated. */
            PROOF_OF_AUTHORIZATION_REQUEST_UPDATED,
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
            /** Occurs whenever a Swift Transfer is created. */
            SWIFT_TRANSFER_CREATED,
            /** Occurs whenever a Swift Transfer is updated. */
            SWIFT_TRANSFER_UPDATED,
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
            /**
             * An enum member indicating that [SelectedEventCategory] was instantiated with an
             * unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
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
                LEGACY_CARD_DISPUTE_CREATED -> Value.LEGACY_CARD_DISPUTE_CREATED
                LEGACY_CARD_DISPUTE_UPDATED -> Value.LEGACY_CARD_DISPUTE_UPDATED
                LOCKBOX_CREATED -> Value.LOCKBOX_CREATED
                LOCKBOX_UPDATED -> Value.LOCKBOX_UPDATED
                OAUTH_CONNECTION_CREATED -> Value.OAUTH_CONNECTION_CREATED
                OAUTH_CONNECTION_DEACTIVATED -> Value.OAUTH_CONNECTION_DEACTIVATED
                OUTBOUND_CARD_PUSH_TRANSFER_CREATED -> Value.OUTBOUND_CARD_PUSH_TRANSFER_CREATED
                OUTBOUND_CARD_PUSH_TRANSFER_UPDATED -> Value.OUTBOUND_CARD_PUSH_TRANSFER_UPDATED
                OUTBOUND_CARD_VALIDATION_CREATED -> Value.OUTBOUND_CARD_VALIDATION_CREATED
                OUTBOUND_CARD_VALIDATION_UPDATED -> Value.OUTBOUND_CARD_VALIDATION_UPDATED
                CARD_PUSH_TRANSFER_CREATED -> Value.CARD_PUSH_TRANSFER_CREATED
                CARD_PUSH_TRANSFER_UPDATED -> Value.CARD_PUSH_TRANSFER_UPDATED
                CARD_VALIDATION_CREATED -> Value.CARD_VALIDATION_CREATED
                CARD_VALIDATION_UPDATED -> Value.CARD_VALIDATION_UPDATED
                PENDING_TRANSACTION_CREATED -> Value.PENDING_TRANSACTION_CREATED
                PENDING_TRANSACTION_UPDATED -> Value.PENDING_TRANSACTION_UPDATED
                PHYSICAL_CARD_CREATED -> Value.PHYSICAL_CARD_CREATED
                PHYSICAL_CARD_UPDATED -> Value.PHYSICAL_CARD_UPDATED
                PHYSICAL_CARD_PROFILE_CREATED -> Value.PHYSICAL_CARD_PROFILE_CREATED
                PHYSICAL_CARD_PROFILE_UPDATED -> Value.PHYSICAL_CARD_PROFILE_UPDATED
                PROGRAM_CREATED -> Value.PROGRAM_CREATED
                PROGRAM_UPDATED -> Value.PROGRAM_UPDATED
                PROOF_OF_AUTHORIZATION_REQUEST_CREATED ->
                    Value.PROOF_OF_AUTHORIZATION_REQUEST_CREATED
                PROOF_OF_AUTHORIZATION_REQUEST_UPDATED ->
                    Value.PROOF_OF_AUTHORIZATION_REQUEST_UPDATED
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
                SWIFT_TRANSFER_CREATED -> Value.SWIFT_TRANSFER_CREATED
                SWIFT_TRANSFER_UPDATED -> Value.SWIFT_TRANSFER_UPDATED
                TRANSACTION_CREATED -> Value.TRANSACTION_CREATED
                WIRE_DRAWDOWN_REQUEST_CREATED -> Value.WIRE_DRAWDOWN_REQUEST_CREATED
                WIRE_DRAWDOWN_REQUEST_UPDATED -> Value.WIRE_DRAWDOWN_REQUEST_UPDATED
                WIRE_TRANSFER_CREATED -> Value.WIRE_TRANSFER_CREATED
                WIRE_TRANSFER_UPDATED -> Value.WIRE_TRANSFER_UPDATED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
         */
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
                LEGACY_CARD_DISPUTE_CREATED -> Known.LEGACY_CARD_DISPUTE_CREATED
                LEGACY_CARD_DISPUTE_UPDATED -> Known.LEGACY_CARD_DISPUTE_UPDATED
                LOCKBOX_CREATED -> Known.LOCKBOX_CREATED
                LOCKBOX_UPDATED -> Known.LOCKBOX_UPDATED
                OAUTH_CONNECTION_CREATED -> Known.OAUTH_CONNECTION_CREATED
                OAUTH_CONNECTION_DEACTIVATED -> Known.OAUTH_CONNECTION_DEACTIVATED
                OUTBOUND_CARD_PUSH_TRANSFER_CREATED -> Known.OUTBOUND_CARD_PUSH_TRANSFER_CREATED
                OUTBOUND_CARD_PUSH_TRANSFER_UPDATED -> Known.OUTBOUND_CARD_PUSH_TRANSFER_UPDATED
                OUTBOUND_CARD_VALIDATION_CREATED -> Known.OUTBOUND_CARD_VALIDATION_CREATED
                OUTBOUND_CARD_VALIDATION_UPDATED -> Known.OUTBOUND_CARD_VALIDATION_UPDATED
                CARD_PUSH_TRANSFER_CREATED -> Known.CARD_PUSH_TRANSFER_CREATED
                CARD_PUSH_TRANSFER_UPDATED -> Known.CARD_PUSH_TRANSFER_UPDATED
                CARD_VALIDATION_CREATED -> Known.CARD_VALIDATION_CREATED
                CARD_VALIDATION_UPDATED -> Known.CARD_VALIDATION_UPDATED
                PENDING_TRANSACTION_CREATED -> Known.PENDING_TRANSACTION_CREATED
                PENDING_TRANSACTION_UPDATED -> Known.PENDING_TRANSACTION_UPDATED
                PHYSICAL_CARD_CREATED -> Known.PHYSICAL_CARD_CREATED
                PHYSICAL_CARD_UPDATED -> Known.PHYSICAL_CARD_UPDATED
                PHYSICAL_CARD_PROFILE_CREATED -> Known.PHYSICAL_CARD_PROFILE_CREATED
                PHYSICAL_CARD_PROFILE_UPDATED -> Known.PHYSICAL_CARD_PROFILE_UPDATED
                PROGRAM_CREATED -> Known.PROGRAM_CREATED
                PROGRAM_UPDATED -> Known.PROGRAM_UPDATED
                PROOF_OF_AUTHORIZATION_REQUEST_CREATED ->
                    Known.PROOF_OF_AUTHORIZATION_REQUEST_CREATED
                PROOF_OF_AUTHORIZATION_REQUEST_UPDATED ->
                    Known.PROOF_OF_AUTHORIZATION_REQUEST_UPDATED
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
                SWIFT_TRANSFER_CREATED -> Known.SWIFT_TRANSFER_CREATED
                SWIFT_TRANSFER_UPDATED -> Known.SWIFT_TRANSFER_UPDATED
                TRANSACTION_CREATED -> Known.TRANSACTION_CREATED
                WIRE_DRAWDOWN_REQUEST_CREATED -> Known.WIRE_DRAWDOWN_REQUEST_CREATED
                WIRE_DRAWDOWN_REQUEST_UPDATED -> Known.WIRE_DRAWDOWN_REQUEST_UPDATED
                WIRE_TRANSFER_CREATED -> Known.WIRE_TRANSFER_CREATED
                WIRE_TRANSFER_UPDATED -> Known.WIRE_TRANSFER_UPDATED
                else -> throw IncreaseInvalidDataException("Unknown SelectedEventCategory: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                IncreaseInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): SelectedEventCategory = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SelectedEventCategory && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** This indicates if we'll send notifications to this subscription. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /** The subscription is active and Events will be delivered normally. */
            @JvmField val ACTIVE = of("active")

            /** The subscription is temporarily disabled and Events will not be delivered. */
            @JvmField val DISABLED = of("disabled")

            /** The subscription is permanently disabled and Events will not be delivered. */
            @JvmField val DELETED = of("deleted")

            /**
             * The subscription is temporarily disabled due to delivery errors and Events will not
             * be delivered.
             */
            @JvmField val REQUIRES_ATTENTION = of("requires_attention")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The subscription is active and Events will be delivered normally. */
            ACTIVE,
            /** The subscription is temporarily disabled and Events will not be delivered. */
            DISABLED,
            /** The subscription is permanently disabled and Events will not be delivered. */
            DELETED,
            /**
             * The subscription is temporarily disabled due to delivery errors and Events will not
             * be delivered.
             */
            REQUIRES_ATTENTION,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The subscription is active and Events will be delivered normally. */
            ACTIVE,
            /** The subscription is temporarily disabled and Events will not be delivered. */
            DISABLED,
            /** The subscription is permanently disabled and Events will not be delivered. */
            DELETED,
            /**
             * The subscription is temporarily disabled due to delivery errors and Events will not
             * be delivered.
             */
            REQUIRES_ATTENTION,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                DISABLED -> Value.DISABLED
                DELETED -> Value.DELETED
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                DISABLED -> Known.DISABLED
                DELETED -> Known.DELETED
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                IncreaseInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `event_subscription`.
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val EVENT_SUBSCRIPTION = of("event_subscription")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            EVENT_SUBSCRIPTION
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EVENT_SUBSCRIPTION,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                EVENT_SUBSCRIPTION -> Value.EVENT_SUBSCRIPTION
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                EVENT_SUBSCRIPTION -> Known.EVENT_SUBSCRIPTION
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                IncreaseInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventSubscription &&
            id == other.id &&
            createdAt == other.createdAt &&
            idempotencyKey == other.idempotencyKey &&
            oauthConnectionId == other.oauthConnectionId &&
            selectedEventCategory == other.selectedEventCategory &&
            status == other.status &&
            type == other.type &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            idempotencyKey,
            oauthConnectionId,
            selectedEventCategory,
            status,
            type,
            url,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventSubscription{id=$id, createdAt=$createdAt, idempotencyKey=$idempotencyKey, oauthConnectionId=$oauthConnectionId, selectedEventCategory=$selectedEventCategory, status=$status, type=$type, url=$url, additionalProperties=$additionalProperties}"
}
