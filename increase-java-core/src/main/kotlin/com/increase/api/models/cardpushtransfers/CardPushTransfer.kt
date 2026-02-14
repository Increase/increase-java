// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpushtransfers

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

/** Card Push Transfers send funds to a recipient's payment card in real-time. */
class CardPushTransfer
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val acceptance: JsonField<Acceptance>,
    private val accountId: JsonField<String>,
    private val approval: JsonField<Approval>,
    private val businessApplicationIdentifier: JsonField<BusinessApplicationIdentifier>,
    private val cancellation: JsonField<Cancellation>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<CreatedBy>,
    private val decline: JsonField<Decline>,
    private val idempotencyKey: JsonField<String>,
    private val merchantCategoryCode: JsonField<String>,
    private val merchantCityName: JsonField<String>,
    private val merchantName: JsonField<String>,
    private val merchantNamePrefix: JsonField<String>,
    private val merchantPostalCode: JsonField<String>,
    private val merchantState: JsonField<String>,
    private val presentmentAmount: JsonField<PresentmentAmount>,
    private val recipientName: JsonField<String>,
    private val senderAddressCity: JsonField<String>,
    private val senderAddressLine1: JsonField<String>,
    private val senderAddressPostalCode: JsonField<String>,
    private val senderAddressState: JsonField<String>,
    private val senderName: JsonField<String>,
    private val sourceAccountNumberId: JsonField<String>,
    private val status: JsonField<Status>,
    private val submission: JsonField<Submission>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("acceptance")
        @ExcludeMissing
        acceptance: JsonField<Acceptance> = JsonMissing.of(),
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("approval") @ExcludeMissing approval: JsonField<Approval> = JsonMissing.of(),
        @JsonProperty("business_application_identifier")
        @ExcludeMissing
        businessApplicationIdentifier: JsonField<BusinessApplicationIdentifier> = JsonMissing.of(),
        @JsonProperty("cancellation")
        @ExcludeMissing
        cancellation: JsonField<Cancellation> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_by")
        @ExcludeMissing
        createdBy: JsonField<CreatedBy> = JsonMissing.of(),
        @JsonProperty("decline") @ExcludeMissing decline: JsonField<Decline> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_category_code")
        @ExcludeMissing
        merchantCategoryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_city_name")
        @ExcludeMissing
        merchantCityName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_name")
        @ExcludeMissing
        merchantName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_name_prefix")
        @ExcludeMissing
        merchantNamePrefix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_postal_code")
        @ExcludeMissing
        merchantPostalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_state")
        @ExcludeMissing
        merchantState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("presentment_amount")
        @ExcludeMissing
        presentmentAmount: JsonField<PresentmentAmount> = JsonMissing.of(),
        @JsonProperty("recipient_name")
        @ExcludeMissing
        recipientName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sender_address_city")
        @ExcludeMissing
        senderAddressCity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sender_address_line1")
        @ExcludeMissing
        senderAddressLine1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sender_address_postal_code")
        @ExcludeMissing
        senderAddressPostalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sender_address_state")
        @ExcludeMissing
        senderAddressState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sender_name")
        @ExcludeMissing
        senderName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_account_number_id")
        @ExcludeMissing
        sourceAccountNumberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("submission")
        @ExcludeMissing
        submission: JsonField<Submission> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        acceptance,
        accountId,
        approval,
        businessApplicationIdentifier,
        cancellation,
        createdAt,
        createdBy,
        decline,
        idempotencyKey,
        merchantCategoryCode,
        merchantCityName,
        merchantName,
        merchantNamePrefix,
        merchantPostalCode,
        merchantState,
        presentmentAmount,
        recipientName,
        senderAddressCity,
        senderAddressLine1,
        senderAddressPostalCode,
        senderAddressState,
        senderName,
        sourceAccountNumberId,
        status,
        submission,
        type,
        mutableMapOf(),
    )

    /**
     * The Card Push Transfer's identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * If the transfer is accepted by the recipient bank, this will contain supplemental details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun acceptance(): Optional<Acceptance> = acceptance.getOptional("acceptance")

    /**
     * The Account from which the transfer was sent.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * If your account requires approvals for transfers and the transfer was approved, this will
     * contain details of the approval.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun approval(): Optional<Approval> = approval.getOptional("approval")

    /**
     * The Business Application Identifier describes the type of transaction being performed. Your
     * program must be approved for the specified Business Application Identifier in order to use
     * it.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessApplicationIdentifier(): BusinessApplicationIdentifier =
        businessApplicationIdentifier.getRequired("business_application_identifier")

    /**
     * If your account requires approvals for transfers and the transfer was not approved, this will
     * contain details of the cancellation.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cancellation(): Optional<Cancellation> = cancellation.getOptional("cancellation")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * What object created the transfer, either via the API or the dashboard.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<CreatedBy> = createdBy.getOptional("created_by")

    /**
     * If the transfer is rejected by the card network or the destination financial institution,
     * this will contain supplemental details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun decline(): Optional<Decline> = decline.getOptional("decline")

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
     * The merchant category code (MCC) of the merchant (generally your business) sending the
     * transfer. This is a four-digit code that describes the type of business or service provided
     * by the merchant. Your program must be approved for the specified MCC in order to use it.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantCategoryCode(): String = merchantCategoryCode.getRequired("merchant_category_code")

    /**
     * The city name of the merchant (generally your business) sending the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantCityName(): String = merchantCityName.getRequired("merchant_city_name")

    /**
     * The merchant name shows up as the statement descriptor for the transfer. This is typically
     * the name of your business or organization.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantName(): String = merchantName.getRequired("merchant_name")

    /**
     * For certain Business Application Identifiers, the statement descriptor is
     * `merchant_name_prefix*sender_name`, where the `merchant_name_prefix` is a one to four
     * character prefix that identifies the merchant.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantNamePrefix(): String = merchantNamePrefix.getRequired("merchant_name_prefix")

    /**
     * The postal code of the merchant (generally your business) sending the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantPostalCode(): String = merchantPostalCode.getRequired("merchant_postal_code")

    /**
     * The state of the merchant (generally your business) sending the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantState(): String = merchantState.getRequired("merchant_state")

    /**
     * The amount that was transferred. The receiving bank will have converted this to the
     * cardholder's currency. The amount that is applied to your Increase account matches the
     * currency of your account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun presentmentAmount(): PresentmentAmount = presentmentAmount.getRequired("presentment_amount")

    /**
     * The name of the funds recipient.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipientName(): String = recipientName.getRequired("recipient_name")

    /**
     * The city of the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun senderAddressCity(): String = senderAddressCity.getRequired("sender_address_city")

    /**
     * The address line 1 of the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun senderAddressLine1(): String = senderAddressLine1.getRequired("sender_address_line1")

    /**
     * The postal code of the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun senderAddressPostalCode(): String =
        senderAddressPostalCode.getRequired("sender_address_postal_code")

    /**
     * The state of the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun senderAddressState(): String = senderAddressState.getRequired("sender_address_state")

    /**
     * The name of the funds originator.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun senderName(): String = senderName.getRequired("sender_name")

    /**
     * The Account Number the recipient will see as having sent the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceAccountNumberId(): String =
        sourceAccountNumberId.getRequired("source_account_number_id")

    /**
     * The lifecycle status of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * After the transfer is submitted to the card network, this will contain supplemental details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun submission(): Optional<Submission> = submission.getOptional("submission")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_push_transfer`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [acceptance].
     *
     * Unlike [acceptance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("acceptance")
    @ExcludeMissing
    fun _acceptance(): JsonField<Acceptance> = acceptance

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [approval].
     *
     * Unlike [approval], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("approval") @ExcludeMissing fun _approval(): JsonField<Approval> = approval

    /**
     * Returns the raw JSON value of [businessApplicationIdentifier].
     *
     * Unlike [businessApplicationIdentifier], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("business_application_identifier")
    @ExcludeMissing
    fun _businessApplicationIdentifier(): JsonField<BusinessApplicationIdentifier> =
        businessApplicationIdentifier

    /**
     * Returns the raw JSON value of [cancellation].
     *
     * Unlike [cancellation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cancellation")
    @ExcludeMissing
    fun _cancellation(): JsonField<Cancellation> = cancellation

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_by") @ExcludeMissing fun _createdBy(): JsonField<CreatedBy> = createdBy

    /**
     * Returns the raw JSON value of [decline].
     *
     * Unlike [decline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decline") @ExcludeMissing fun _decline(): JsonField<Decline> = decline

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [merchantCategoryCode].
     *
     * Unlike [merchantCategoryCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("merchant_category_code")
    @ExcludeMissing
    fun _merchantCategoryCode(): JsonField<String> = merchantCategoryCode

    /**
     * Returns the raw JSON value of [merchantCityName].
     *
     * Unlike [merchantCityName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("merchant_city_name")
    @ExcludeMissing
    fun _merchantCityName(): JsonField<String> = merchantCityName

    /**
     * Returns the raw JSON value of [merchantName].
     *
     * Unlike [merchantName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("merchant_name")
    @ExcludeMissing
    fun _merchantName(): JsonField<String> = merchantName

    /**
     * Returns the raw JSON value of [merchantNamePrefix].
     *
     * Unlike [merchantNamePrefix], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("merchant_name_prefix")
    @ExcludeMissing
    fun _merchantNamePrefix(): JsonField<String> = merchantNamePrefix

    /**
     * Returns the raw JSON value of [merchantPostalCode].
     *
     * Unlike [merchantPostalCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("merchant_postal_code")
    @ExcludeMissing
    fun _merchantPostalCode(): JsonField<String> = merchantPostalCode

    /**
     * Returns the raw JSON value of [merchantState].
     *
     * Unlike [merchantState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("merchant_state")
    @ExcludeMissing
    fun _merchantState(): JsonField<String> = merchantState

    /**
     * Returns the raw JSON value of [presentmentAmount].
     *
     * Unlike [presentmentAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("presentment_amount")
    @ExcludeMissing
    fun _presentmentAmount(): JsonField<PresentmentAmount> = presentmentAmount

    /**
     * Returns the raw JSON value of [recipientName].
     *
     * Unlike [recipientName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recipient_name")
    @ExcludeMissing
    fun _recipientName(): JsonField<String> = recipientName

    /**
     * Returns the raw JSON value of [senderAddressCity].
     *
     * Unlike [senderAddressCity], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sender_address_city")
    @ExcludeMissing
    fun _senderAddressCity(): JsonField<String> = senderAddressCity

    /**
     * Returns the raw JSON value of [senderAddressLine1].
     *
     * Unlike [senderAddressLine1], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sender_address_line1")
    @ExcludeMissing
    fun _senderAddressLine1(): JsonField<String> = senderAddressLine1

    /**
     * Returns the raw JSON value of [senderAddressPostalCode].
     *
     * Unlike [senderAddressPostalCode], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("sender_address_postal_code")
    @ExcludeMissing
    fun _senderAddressPostalCode(): JsonField<String> = senderAddressPostalCode

    /**
     * Returns the raw JSON value of [senderAddressState].
     *
     * Unlike [senderAddressState], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sender_address_state")
    @ExcludeMissing
    fun _senderAddressState(): JsonField<String> = senderAddressState

    /**
     * Returns the raw JSON value of [senderName].
     *
     * Unlike [senderName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sender_name") @ExcludeMissing fun _senderName(): JsonField<String> = senderName

    /**
     * Returns the raw JSON value of [sourceAccountNumberId].
     *
     * Unlike [sourceAccountNumberId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("source_account_number_id")
    @ExcludeMissing
    fun _sourceAccountNumberId(): JsonField<String> = sourceAccountNumberId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [submission].
     *
     * Unlike [submission], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("submission")
    @ExcludeMissing
    fun _submission(): JsonField<Submission> = submission

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [CardPushTransfer].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .acceptance()
         * .accountId()
         * .approval()
         * .businessApplicationIdentifier()
         * .cancellation()
         * .createdAt()
         * .createdBy()
         * .decline()
         * .idempotencyKey()
         * .merchantCategoryCode()
         * .merchantCityName()
         * .merchantName()
         * .merchantNamePrefix()
         * .merchantPostalCode()
         * .merchantState()
         * .presentmentAmount()
         * .recipientName()
         * .senderAddressCity()
         * .senderAddressLine1()
         * .senderAddressPostalCode()
         * .senderAddressState()
         * .senderName()
         * .sourceAccountNumberId()
         * .status()
         * .submission()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardPushTransfer]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var acceptance: JsonField<Acceptance>? = null
        private var accountId: JsonField<String>? = null
        private var approval: JsonField<Approval>? = null
        private var businessApplicationIdentifier: JsonField<BusinessApplicationIdentifier>? = null
        private var cancellation: JsonField<Cancellation>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var createdBy: JsonField<CreatedBy>? = null
        private var decline: JsonField<Decline>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var merchantCategoryCode: JsonField<String>? = null
        private var merchantCityName: JsonField<String>? = null
        private var merchantName: JsonField<String>? = null
        private var merchantNamePrefix: JsonField<String>? = null
        private var merchantPostalCode: JsonField<String>? = null
        private var merchantState: JsonField<String>? = null
        private var presentmentAmount: JsonField<PresentmentAmount>? = null
        private var recipientName: JsonField<String>? = null
        private var senderAddressCity: JsonField<String>? = null
        private var senderAddressLine1: JsonField<String>? = null
        private var senderAddressPostalCode: JsonField<String>? = null
        private var senderAddressState: JsonField<String>? = null
        private var senderName: JsonField<String>? = null
        private var sourceAccountNumberId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var submission: JsonField<Submission>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardPushTransfer: CardPushTransfer) = apply {
            id = cardPushTransfer.id
            acceptance = cardPushTransfer.acceptance
            accountId = cardPushTransfer.accountId
            approval = cardPushTransfer.approval
            businessApplicationIdentifier = cardPushTransfer.businessApplicationIdentifier
            cancellation = cardPushTransfer.cancellation
            createdAt = cardPushTransfer.createdAt
            createdBy = cardPushTransfer.createdBy
            decline = cardPushTransfer.decline
            idempotencyKey = cardPushTransfer.idempotencyKey
            merchantCategoryCode = cardPushTransfer.merchantCategoryCode
            merchantCityName = cardPushTransfer.merchantCityName
            merchantName = cardPushTransfer.merchantName
            merchantNamePrefix = cardPushTransfer.merchantNamePrefix
            merchantPostalCode = cardPushTransfer.merchantPostalCode
            merchantState = cardPushTransfer.merchantState
            presentmentAmount = cardPushTransfer.presentmentAmount
            recipientName = cardPushTransfer.recipientName
            senderAddressCity = cardPushTransfer.senderAddressCity
            senderAddressLine1 = cardPushTransfer.senderAddressLine1
            senderAddressPostalCode = cardPushTransfer.senderAddressPostalCode
            senderAddressState = cardPushTransfer.senderAddressState
            senderName = cardPushTransfer.senderName
            sourceAccountNumberId = cardPushTransfer.sourceAccountNumberId
            status = cardPushTransfer.status
            submission = cardPushTransfer.submission
            type = cardPushTransfer.type
            additionalProperties = cardPushTransfer.additionalProperties.toMutableMap()
        }

        /** The Card Push Transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * If the transfer is accepted by the recipient bank, this will contain supplemental
         * details.
         */
        fun acceptance(acceptance: Acceptance?) = acceptance(JsonField.ofNullable(acceptance))

        /** Alias for calling [Builder.acceptance] with `acceptance.orElse(null)`. */
        fun acceptance(acceptance: Optional<Acceptance>) = acceptance(acceptance.getOrNull())

        /**
         * Sets [Builder.acceptance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptance] with a well-typed [Acceptance] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun acceptance(acceptance: JsonField<Acceptance>) = apply { this.acceptance = acceptance }

        /** The Account from which the transfer was sent. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * If your account requires approvals for transfers and the transfer was approved, this will
         * contain details of the approval.
         */
        fun approval(approval: Approval?) = approval(JsonField.ofNullable(approval))

        /** Alias for calling [Builder.approval] with `approval.orElse(null)`. */
        fun approval(approval: Optional<Approval>) = approval(approval.getOrNull())

        /**
         * Sets [Builder.approval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approval] with a well-typed [Approval] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun approval(approval: JsonField<Approval>) = apply { this.approval = approval }

        /**
         * The Business Application Identifier describes the type of transaction being performed.
         * Your program must be approved for the specified Business Application Identifier in order
         * to use it.
         */
        fun businessApplicationIdentifier(
            businessApplicationIdentifier: BusinessApplicationIdentifier
        ) = businessApplicationIdentifier(JsonField.of(businessApplicationIdentifier))

        /**
         * Sets [Builder.businessApplicationIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessApplicationIdentifier] with a well-typed
         * [BusinessApplicationIdentifier] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun businessApplicationIdentifier(
            businessApplicationIdentifier: JsonField<BusinessApplicationIdentifier>
        ) = apply { this.businessApplicationIdentifier = businessApplicationIdentifier }

        /**
         * If your account requires approvals for transfers and the transfer was not approved, this
         * will contain details of the cancellation.
         */
        fun cancellation(cancellation: Cancellation?) =
            cancellation(JsonField.ofNullable(cancellation))

        /** Alias for calling [Builder.cancellation] with `cancellation.orElse(null)`. */
        fun cancellation(cancellation: Optional<Cancellation>) =
            cancellation(cancellation.getOrNull())

        /**
         * Sets [Builder.cancellation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancellation] with a well-typed [Cancellation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cancellation(cancellation: JsonField<Cancellation>) = apply {
            this.cancellation = cancellation
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** What object created the transfer, either via the API or the dashboard. */
        fun createdBy(createdBy: CreatedBy?) = createdBy(JsonField.ofNullable(createdBy))

        /** Alias for calling [Builder.createdBy] with `createdBy.orElse(null)`. */
        fun createdBy(createdBy: Optional<CreatedBy>) = createdBy(createdBy.getOrNull())

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [CreatedBy] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<CreatedBy>) = apply { this.createdBy = createdBy }

        /**
         * If the transfer is rejected by the card network or the destination financial institution,
         * this will contain supplemental details.
         */
        fun decline(decline: Decline?) = decline(JsonField.ofNullable(decline))

        /** Alias for calling [Builder.decline] with `decline.orElse(null)`. */
        fun decline(decline: Optional<Decline>) = decline(decline.getOrNull())

        /**
         * Sets [Builder.decline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decline] with a well-typed [Decline] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun decline(decline: JsonField<Decline>) = apply { this.decline = decline }

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
         * The merchant category code (MCC) of the merchant (generally your business) sending the
         * transfer. This is a four-digit code that describes the type of business or service
         * provided by the merchant. Your program must be approved for the specified MCC in order to
         * use it.
         */
        fun merchantCategoryCode(merchantCategoryCode: String) =
            merchantCategoryCode(JsonField.of(merchantCategoryCode))

        /**
         * Sets [Builder.merchantCategoryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantCategoryCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
            this.merchantCategoryCode = merchantCategoryCode
        }

        /** The city name of the merchant (generally your business) sending the transfer. */
        fun merchantCityName(merchantCityName: String) =
            merchantCityName(JsonField.of(merchantCityName))

        /**
         * Sets [Builder.merchantCityName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantCityName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun merchantCityName(merchantCityName: JsonField<String>) = apply {
            this.merchantCityName = merchantCityName
        }

        /**
         * The merchant name shows up as the statement descriptor for the transfer. This is
         * typically the name of your business or organization.
         */
        fun merchantName(merchantName: String) = merchantName(JsonField.of(merchantName))

        /**
         * Sets [Builder.merchantName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun merchantName(merchantName: JsonField<String>) = apply {
            this.merchantName = merchantName
        }

        /**
         * For certain Business Application Identifiers, the statement descriptor is
         * `merchant_name_prefix*sender_name`, where the `merchant_name_prefix` is a one to four
         * character prefix that identifies the merchant.
         */
        fun merchantNamePrefix(merchantNamePrefix: String) =
            merchantNamePrefix(JsonField.of(merchantNamePrefix))

        /**
         * Sets [Builder.merchantNamePrefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantNamePrefix] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun merchantNamePrefix(merchantNamePrefix: JsonField<String>) = apply {
            this.merchantNamePrefix = merchantNamePrefix
        }

        /** The postal code of the merchant (generally your business) sending the transfer. */
        fun merchantPostalCode(merchantPostalCode: String) =
            merchantPostalCode(JsonField.of(merchantPostalCode))

        /**
         * Sets [Builder.merchantPostalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantPostalCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun merchantPostalCode(merchantPostalCode: JsonField<String>) = apply {
            this.merchantPostalCode = merchantPostalCode
        }

        /** The state of the merchant (generally your business) sending the transfer. */
        fun merchantState(merchantState: String) = merchantState(JsonField.of(merchantState))

        /**
         * Sets [Builder.merchantState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun merchantState(merchantState: JsonField<String>) = apply {
            this.merchantState = merchantState
        }

        /**
         * The amount that was transferred. The receiving bank will have converted this to the
         * cardholder's currency. The amount that is applied to your Increase account matches the
         * currency of your account.
         */
        fun presentmentAmount(presentmentAmount: PresentmentAmount) =
            presentmentAmount(JsonField.of(presentmentAmount))

        /**
         * Sets [Builder.presentmentAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.presentmentAmount] with a well-typed [PresentmentAmount]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun presentmentAmount(presentmentAmount: JsonField<PresentmentAmount>) = apply {
            this.presentmentAmount = presentmentAmount
        }

        /** The name of the funds recipient. */
        fun recipientName(recipientName: String) = recipientName(JsonField.of(recipientName))

        /**
         * Sets [Builder.recipientName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recipientName(recipientName: JsonField<String>) = apply {
            this.recipientName = recipientName
        }

        /** The city of the sender. */
        fun senderAddressCity(senderAddressCity: String) =
            senderAddressCity(JsonField.of(senderAddressCity))

        /**
         * Sets [Builder.senderAddressCity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderAddressCity] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun senderAddressCity(senderAddressCity: JsonField<String>) = apply {
            this.senderAddressCity = senderAddressCity
        }

        /** The address line 1 of the sender. */
        fun senderAddressLine1(senderAddressLine1: String) =
            senderAddressLine1(JsonField.of(senderAddressLine1))

        /**
         * Sets [Builder.senderAddressLine1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderAddressLine1] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun senderAddressLine1(senderAddressLine1: JsonField<String>) = apply {
            this.senderAddressLine1 = senderAddressLine1
        }

        /** The postal code of the sender. */
        fun senderAddressPostalCode(senderAddressPostalCode: String) =
            senderAddressPostalCode(JsonField.of(senderAddressPostalCode))

        /**
         * Sets [Builder.senderAddressPostalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderAddressPostalCode] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun senderAddressPostalCode(senderAddressPostalCode: JsonField<String>) = apply {
            this.senderAddressPostalCode = senderAddressPostalCode
        }

        /** The state of the sender. */
        fun senderAddressState(senderAddressState: String) =
            senderAddressState(JsonField.of(senderAddressState))

        /**
         * Sets [Builder.senderAddressState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderAddressState] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun senderAddressState(senderAddressState: JsonField<String>) = apply {
            this.senderAddressState = senderAddressState
        }

        /** The name of the funds originator. */
        fun senderName(senderName: String) = senderName(JsonField.of(senderName))

        /**
         * Sets [Builder.senderName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun senderName(senderName: JsonField<String>) = apply { this.senderName = senderName }

        /** The Account Number the recipient will see as having sent the transfer. */
        fun sourceAccountNumberId(sourceAccountNumberId: String) =
            sourceAccountNumberId(JsonField.of(sourceAccountNumberId))

        /**
         * Sets [Builder.sourceAccountNumberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceAccountNumberId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceAccountNumberId(sourceAccountNumberId: JsonField<String>) = apply {
            this.sourceAccountNumberId = sourceAccountNumberId
        }

        /** The lifecycle status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * After the transfer is submitted to the card network, this will contain supplemental
         * details.
         */
        fun submission(submission: Submission?) = submission(JsonField.ofNullable(submission))

        /** Alias for calling [Builder.submission] with `submission.orElse(null)`. */
        fun submission(submission: Optional<Submission>) = submission(submission.getOrNull())

        /**
         * Sets [Builder.submission] to an arbitrary JSON value.
         *
         * You should usually call [Builder.submission] with a well-typed [Submission] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun submission(submission: JsonField<Submission>) = apply { this.submission = submission }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `card_push_transfer`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [CardPushTransfer].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .acceptance()
         * .accountId()
         * .approval()
         * .businessApplicationIdentifier()
         * .cancellation()
         * .createdAt()
         * .createdBy()
         * .decline()
         * .idempotencyKey()
         * .merchantCategoryCode()
         * .merchantCityName()
         * .merchantName()
         * .merchantNamePrefix()
         * .merchantPostalCode()
         * .merchantState()
         * .presentmentAmount()
         * .recipientName()
         * .senderAddressCity()
         * .senderAddressLine1()
         * .senderAddressPostalCode()
         * .senderAddressState()
         * .senderName()
         * .sourceAccountNumberId()
         * .status()
         * .submission()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardPushTransfer =
            CardPushTransfer(
                checkRequired("id", id),
                checkRequired("acceptance", acceptance),
                checkRequired("accountId", accountId),
                checkRequired("approval", approval),
                checkRequired("businessApplicationIdentifier", businessApplicationIdentifier),
                checkRequired("cancellation", cancellation),
                checkRequired("createdAt", createdAt),
                checkRequired("createdBy", createdBy),
                checkRequired("decline", decline),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("merchantCategoryCode", merchantCategoryCode),
                checkRequired("merchantCityName", merchantCityName),
                checkRequired("merchantName", merchantName),
                checkRequired("merchantNamePrefix", merchantNamePrefix),
                checkRequired("merchantPostalCode", merchantPostalCode),
                checkRequired("merchantState", merchantState),
                checkRequired("presentmentAmount", presentmentAmount),
                checkRequired("recipientName", recipientName),
                checkRequired("senderAddressCity", senderAddressCity),
                checkRequired("senderAddressLine1", senderAddressLine1),
                checkRequired("senderAddressPostalCode", senderAddressPostalCode),
                checkRequired("senderAddressState", senderAddressState),
                checkRequired("senderName", senderName),
                checkRequired("sourceAccountNumberId", sourceAccountNumberId),
                checkRequired("status", status),
                checkRequired("submission", submission),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CardPushTransfer = apply {
        if (validated) {
            return@apply
        }

        id()
        acceptance().ifPresent { it.validate() }
        accountId()
        approval().ifPresent { it.validate() }
        businessApplicationIdentifier().validate()
        cancellation().ifPresent { it.validate() }
        createdAt()
        createdBy().ifPresent { it.validate() }
        decline().ifPresent { it.validate() }
        idempotencyKey()
        merchantCategoryCode()
        merchantCityName()
        merchantName()
        merchantNamePrefix()
        merchantPostalCode()
        merchantState()
        presentmentAmount().validate()
        recipientName()
        senderAddressCity()
        senderAddressLine1()
        senderAddressPostalCode()
        senderAddressState()
        senderName()
        sourceAccountNumberId()
        status().validate()
        submission().ifPresent { it.validate() }
        type().validate()
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
            (acceptance.asKnown().getOrNull()?.validity() ?: 0) +
            (if (accountId.asKnown().isPresent) 1 else 0) +
            (approval.asKnown().getOrNull()?.validity() ?: 0) +
            (businessApplicationIdentifier.asKnown().getOrNull()?.validity() ?: 0) +
            (cancellation.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (createdBy.asKnown().getOrNull()?.validity() ?: 0) +
            (decline.asKnown().getOrNull()?.validity() ?: 0) +
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
            (if (merchantCategoryCode.asKnown().isPresent) 1 else 0) +
            (if (merchantCityName.asKnown().isPresent) 1 else 0) +
            (if (merchantName.asKnown().isPresent) 1 else 0) +
            (if (merchantNamePrefix.asKnown().isPresent) 1 else 0) +
            (if (merchantPostalCode.asKnown().isPresent) 1 else 0) +
            (if (merchantState.asKnown().isPresent) 1 else 0) +
            (presentmentAmount.asKnown().getOrNull()?.validity() ?: 0) +
            (if (recipientName.asKnown().isPresent) 1 else 0) +
            (if (senderAddressCity.asKnown().isPresent) 1 else 0) +
            (if (senderAddressLine1.asKnown().isPresent) 1 else 0) +
            (if (senderAddressPostalCode.asKnown().isPresent) 1 else 0) +
            (if (senderAddressState.asKnown().isPresent) 1 else 0) +
            (if (senderName.asKnown().isPresent) 1 else 0) +
            (if (sourceAccountNumberId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (submission.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * If the transfer is accepted by the recipient bank, this will contain supplemental details.
     */
    class Acceptance
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val acceptedAt: JsonField<OffsetDateTime>,
        private val authorizationIdentificationResponse: JsonField<String>,
        private val cardVerificationValue2Result: JsonField<CardVerificationValue2Result>,
        private val networkTransactionIdentifier: JsonField<String>,
        private val settlementAmount: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accepted_at")
            @ExcludeMissing
            acceptedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("authorization_identification_response")
            @ExcludeMissing
            authorizationIdentificationResponse: JsonField<String> = JsonMissing.of(),
            @JsonProperty("card_verification_value2_result")
            @ExcludeMissing
            cardVerificationValue2Result: JsonField<CardVerificationValue2Result> =
                JsonMissing.of(),
            @JsonProperty("network_transaction_identifier")
            @ExcludeMissing
            networkTransactionIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("settlement_amount")
            @ExcludeMissing
            settlementAmount: JsonField<Long> = JsonMissing.of(),
        ) : this(
            acceptedAt,
            authorizationIdentificationResponse,
            cardVerificationValue2Result,
            networkTransactionIdentifier,
            settlementAmount,
            mutableMapOf(),
        )

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was accepted by the issuing bank.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun acceptedAt(): OffsetDateTime = acceptedAt.getRequired("accepted_at")

        /**
         * The authorization identification response from the issuing bank.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun authorizationIdentificationResponse(): String =
            authorizationIdentificationResponse.getRequired("authorization_identification_response")

        /**
         * The result of the Card Verification Value 2 match.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cardVerificationValue2Result(): Optional<CardVerificationValue2Result> =
            cardVerificationValue2Result.getOptional("card_verification_value2_result")

        /**
         * A unique identifier for the transaction on the card network.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun networkTransactionIdentifier(): Optional<String> =
            networkTransactionIdentifier.getOptional("network_transaction_identifier")

        /**
         * The transfer amount in USD cents.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun settlementAmount(): Long = settlementAmount.getRequired("settlement_amount")

        /**
         * Returns the raw JSON value of [acceptedAt].
         *
         * Unlike [acceptedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accepted_at")
        @ExcludeMissing
        fun _acceptedAt(): JsonField<OffsetDateTime> = acceptedAt

        /**
         * Returns the raw JSON value of [authorizationIdentificationResponse].
         *
         * Unlike [authorizationIdentificationResponse], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("authorization_identification_response")
        @ExcludeMissing
        fun _authorizationIdentificationResponse(): JsonField<String> =
            authorizationIdentificationResponse

        /**
         * Returns the raw JSON value of [cardVerificationValue2Result].
         *
         * Unlike [cardVerificationValue2Result], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("card_verification_value2_result")
        @ExcludeMissing
        fun _cardVerificationValue2Result(): JsonField<CardVerificationValue2Result> =
            cardVerificationValue2Result

        /**
         * Returns the raw JSON value of [networkTransactionIdentifier].
         *
         * Unlike [networkTransactionIdentifier], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("network_transaction_identifier")
        @ExcludeMissing
        fun _networkTransactionIdentifier(): JsonField<String> = networkTransactionIdentifier

        /**
         * Returns the raw JSON value of [settlementAmount].
         *
         * Unlike [settlementAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("settlement_amount")
        @ExcludeMissing
        fun _settlementAmount(): JsonField<Long> = settlementAmount

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
             * Returns a mutable builder for constructing an instance of [Acceptance].
             *
             * The following fields are required:
             * ```java
             * .acceptedAt()
             * .authorizationIdentificationResponse()
             * .cardVerificationValue2Result()
             * .networkTransactionIdentifier()
             * .settlementAmount()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Acceptance]. */
        class Builder internal constructor() {

            private var acceptedAt: JsonField<OffsetDateTime>? = null
            private var authorizationIdentificationResponse: JsonField<String>? = null
            private var cardVerificationValue2Result: JsonField<CardVerificationValue2Result>? =
                null
            private var networkTransactionIdentifier: JsonField<String>? = null
            private var settlementAmount: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(acceptance: Acceptance) = apply {
                acceptedAt = acceptance.acceptedAt
                authorizationIdentificationResponse = acceptance.authorizationIdentificationResponse
                cardVerificationValue2Result = acceptance.cardVerificationValue2Result
                networkTransactionIdentifier = acceptance.networkTransactionIdentifier
                settlementAmount = acceptance.settlementAmount
                additionalProperties = acceptance.additionalProperties.toMutableMap()
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was accepted by the issuing bank.
             */
            fun acceptedAt(acceptedAt: OffsetDateTime) = acceptedAt(JsonField.of(acceptedAt))

            /**
             * Sets [Builder.acceptedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acceptedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun acceptedAt(acceptedAt: JsonField<OffsetDateTime>) = apply {
                this.acceptedAt = acceptedAt
            }

            /** The authorization identification response from the issuing bank. */
            fun authorizationIdentificationResponse(authorizationIdentificationResponse: String) =
                authorizationIdentificationResponse(
                    JsonField.of(authorizationIdentificationResponse)
                )

            /**
             * Sets [Builder.authorizationIdentificationResponse] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authorizationIdentificationResponse] with a
             * well-typed [String] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun authorizationIdentificationResponse(
                authorizationIdentificationResponse: JsonField<String>
            ) = apply {
                this.authorizationIdentificationResponse = authorizationIdentificationResponse
            }

            /** The result of the Card Verification Value 2 match. */
            fun cardVerificationValue2Result(
                cardVerificationValue2Result: CardVerificationValue2Result?
            ) = cardVerificationValue2Result(JsonField.ofNullable(cardVerificationValue2Result))

            /**
             * Alias for calling [Builder.cardVerificationValue2Result] with
             * `cardVerificationValue2Result.orElse(null)`.
             */
            fun cardVerificationValue2Result(
                cardVerificationValue2Result: Optional<CardVerificationValue2Result>
            ) = cardVerificationValue2Result(cardVerificationValue2Result.getOrNull())

            /**
             * Sets [Builder.cardVerificationValue2Result] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardVerificationValue2Result] with a well-typed
             * [CardVerificationValue2Result] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun cardVerificationValue2Result(
                cardVerificationValue2Result: JsonField<CardVerificationValue2Result>
            ) = apply { this.cardVerificationValue2Result = cardVerificationValue2Result }

            /** A unique identifier for the transaction on the card network. */
            fun networkTransactionIdentifier(networkTransactionIdentifier: String?) =
                networkTransactionIdentifier(JsonField.ofNullable(networkTransactionIdentifier))

            /**
             * Alias for calling [Builder.networkTransactionIdentifier] with
             * `networkTransactionIdentifier.orElse(null)`.
             */
            fun networkTransactionIdentifier(networkTransactionIdentifier: Optional<String>) =
                networkTransactionIdentifier(networkTransactionIdentifier.getOrNull())

            /**
             * Sets [Builder.networkTransactionIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.networkTransactionIdentifier] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun networkTransactionIdentifier(networkTransactionIdentifier: JsonField<String>) =
                apply {
                    this.networkTransactionIdentifier = networkTransactionIdentifier
                }

            /** The transfer amount in USD cents. */
            fun settlementAmount(settlementAmount: Long) =
                settlementAmount(JsonField.of(settlementAmount))

            /**
             * Sets [Builder.settlementAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settlementAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun settlementAmount(settlementAmount: JsonField<Long>) = apply {
                this.settlementAmount = settlementAmount
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

            /**
             * Returns an immutable instance of [Acceptance].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .acceptedAt()
             * .authorizationIdentificationResponse()
             * .cardVerificationValue2Result()
             * .networkTransactionIdentifier()
             * .settlementAmount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Acceptance =
                Acceptance(
                    checkRequired("acceptedAt", acceptedAt),
                    checkRequired(
                        "authorizationIdentificationResponse",
                        authorizationIdentificationResponse,
                    ),
                    checkRequired("cardVerificationValue2Result", cardVerificationValue2Result),
                    checkRequired("networkTransactionIdentifier", networkTransactionIdentifier),
                    checkRequired("settlementAmount", settlementAmount),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Acceptance = apply {
            if (validated) {
                return@apply
            }

            acceptedAt()
            authorizationIdentificationResponse()
            cardVerificationValue2Result().ifPresent { it.validate() }
            networkTransactionIdentifier()
            settlementAmount()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (acceptedAt.asKnown().isPresent) 1 else 0) +
                (if (authorizationIdentificationResponse.asKnown().isPresent) 1 else 0) +
                (cardVerificationValue2Result.asKnown().getOrNull()?.validity() ?: 0) +
                (if (networkTransactionIdentifier.asKnown().isPresent) 1 else 0) +
                (if (settlementAmount.asKnown().isPresent) 1 else 0)

        /** The result of the Card Verification Value 2 match. */
        class CardVerificationValue2Result
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** The Card Verification Value 2 (CVV2) matches the expected value. */
                @JvmField val MATCH = of("match")

                /** The Card Verification Value 2 (CVV2) does not match the expected value. */
                @JvmField val NO_MATCH = of("no_match")

                @JvmStatic fun of(value: String) = CardVerificationValue2Result(JsonField.of(value))
            }

            /** An enum containing [CardVerificationValue2Result]'s known values. */
            enum class Known {
                /** The Card Verification Value 2 (CVV2) matches the expected value. */
                MATCH,
                /** The Card Verification Value 2 (CVV2) does not match the expected value. */
                NO_MATCH,
            }

            /**
             * An enum containing [CardVerificationValue2Result]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [CardVerificationValue2Result] can contain an unknown value in a
             * couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The Card Verification Value 2 (CVV2) matches the expected value. */
                MATCH,
                /** The Card Verification Value 2 (CVV2) does not match the expected value. */
                NO_MATCH,
                /**
                 * An enum member indicating that [CardVerificationValue2Result] was instantiated
                 * with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    MATCH -> Value.MATCH
                    NO_MATCH -> Value.NO_MATCH
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    MATCH -> Known.MATCH
                    NO_MATCH -> Known.NO_MATCH
                    else ->
                        throw IncreaseInvalidDataException(
                            "Unknown CardVerificationValue2Result: $value"
                        )
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): CardVerificationValue2Result = apply {
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

                return other is CardVerificationValue2Result && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Acceptance &&
                acceptedAt == other.acceptedAt &&
                authorizationIdentificationResponse == other.authorizationIdentificationResponse &&
                cardVerificationValue2Result == other.cardVerificationValue2Result &&
                networkTransactionIdentifier == other.networkTransactionIdentifier &&
                settlementAmount == other.settlementAmount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                acceptedAt,
                authorizationIdentificationResponse,
                cardVerificationValue2Result,
                networkTransactionIdentifier,
                settlementAmount,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Acceptance{acceptedAt=$acceptedAt, authorizationIdentificationResponse=$authorizationIdentificationResponse, cardVerificationValue2Result=$cardVerificationValue2Result, networkTransactionIdentifier=$networkTransactionIdentifier, settlementAmount=$settlementAmount, additionalProperties=$additionalProperties}"
    }

    /**
     * If your account requires approvals for transfers and the transfer was approved, this will
     * contain details of the approval.
     */
    class Approval
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val approvedAt: JsonField<OffsetDateTime>,
        private val approvedBy: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("approved_at")
            @ExcludeMissing
            approvedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("approved_by")
            @ExcludeMissing
            approvedBy: JsonField<String> = JsonMissing.of(),
        ) : this(approvedAt, approvedBy, mutableMapOf())

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was approved.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun approvedAt(): OffsetDateTime = approvedAt.getRequired("approved_at")

        /**
         * If the Transfer was approved by a user in the dashboard, the email address of that user.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun approvedBy(): Optional<String> = approvedBy.getOptional("approved_by")

        /**
         * Returns the raw JSON value of [approvedAt].
         *
         * Unlike [approvedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("approved_at")
        @ExcludeMissing
        fun _approvedAt(): JsonField<OffsetDateTime> = approvedAt

        /**
         * Returns the raw JSON value of [approvedBy].
         *
         * Unlike [approvedBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("approved_by")
        @ExcludeMissing
        fun _approvedBy(): JsonField<String> = approvedBy

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
             * Returns a mutable builder for constructing an instance of [Approval].
             *
             * The following fields are required:
             * ```java
             * .approvedAt()
             * .approvedBy()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Approval]. */
        class Builder internal constructor() {

            private var approvedAt: JsonField<OffsetDateTime>? = null
            private var approvedBy: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(approval: Approval) = apply {
                approvedAt = approval.approvedAt
                approvedBy = approval.approvedBy
                additionalProperties = approval.additionalProperties.toMutableMap()
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was approved.
             */
            fun approvedAt(approvedAt: OffsetDateTime) = approvedAt(JsonField.of(approvedAt))

            /**
             * Sets [Builder.approvedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.approvedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun approvedAt(approvedAt: JsonField<OffsetDateTime>) = apply {
                this.approvedAt = approvedAt
            }

            /**
             * If the Transfer was approved by a user in the dashboard, the email address of that
             * user.
             */
            fun approvedBy(approvedBy: String?) = approvedBy(JsonField.ofNullable(approvedBy))

            /** Alias for calling [Builder.approvedBy] with `approvedBy.orElse(null)`. */
            fun approvedBy(approvedBy: Optional<String>) = approvedBy(approvedBy.getOrNull())

            /**
             * Sets [Builder.approvedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.approvedBy] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun approvedBy(approvedBy: JsonField<String>) = apply { this.approvedBy = approvedBy }

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
             * Returns an immutable instance of [Approval].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .approvedAt()
             * .approvedBy()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Approval =
                Approval(
                    checkRequired("approvedAt", approvedAt),
                    checkRequired("approvedBy", approvedBy),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Approval = apply {
            if (validated) {
                return@apply
            }

            approvedAt()
            approvedBy()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (approvedAt.asKnown().isPresent) 1 else 0) +
                (if (approvedBy.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Approval &&
                approvedAt == other.approvedAt &&
                approvedBy == other.approvedBy &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(approvedAt, approvedBy, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Approval{approvedAt=$approvedAt, approvedBy=$approvedBy, additionalProperties=$additionalProperties}"
    }

    /**
     * The Business Application Identifier describes the type of transaction being performed. Your
     * program must be approved for the specified Business Application Identifier in order to use
     * it.
     */
    class BusinessApplicationIdentifier
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

            /** Account to Account */
            @JvmField val ACCOUNT_TO_ACCOUNT = of("account_to_account")

            /** Business to Business */
            @JvmField val BUSINESS_TO_BUSINESS = of("business_to_business")

            /** Money Transfer Bank Initiated */
            @JvmField val MONEY_TRANSFER_BANK_INITIATED = of("money_transfer_bank_initiated")

            /** Non-Card Bill Payment */
            @JvmField val NON_CARD_BILL_PAYMENT = of("non_card_bill_payment")

            /** Consumer Bill Payment */
            @JvmField val CONSUMER_BILL_PAYMENT = of("consumer_bill_payment")

            /** Card Bill Payment */
            @JvmField val CARD_BILL_PAYMENT = of("card_bill_payment")

            /** Funds Disbursement */
            @JvmField val FUNDS_DISBURSEMENT = of("funds_disbursement")

            /** Funds Transfer */
            @JvmField val FUNDS_TRANSFER = of("funds_transfer")

            /** Loyalty and Offers */
            @JvmField val LOYALTY_AND_OFFERS = of("loyalty_and_offers")

            /** Merchant Disbursement */
            @JvmField val MERCHANT_DISBURSEMENT = of("merchant_disbursement")

            /** Merchant Payment */
            @JvmField val MERCHANT_PAYMENT = of("merchant_payment")

            /** Person to Person */
            @JvmField val PERSON_TO_PERSON = of("person_to_person")

            /** Top Up */
            @JvmField val TOP_UP = of("top_up")

            /** Wallet Transfer */
            @JvmField val WALLET_TRANSFER = of("wallet_transfer")

            @JvmStatic fun of(value: String) = BusinessApplicationIdentifier(JsonField.of(value))
        }

        /** An enum containing [BusinessApplicationIdentifier]'s known values. */
        enum class Known {
            /** Account to Account */
            ACCOUNT_TO_ACCOUNT,
            /** Business to Business */
            BUSINESS_TO_BUSINESS,
            /** Money Transfer Bank Initiated */
            MONEY_TRANSFER_BANK_INITIATED,
            /** Non-Card Bill Payment */
            NON_CARD_BILL_PAYMENT,
            /** Consumer Bill Payment */
            CONSUMER_BILL_PAYMENT,
            /** Card Bill Payment */
            CARD_BILL_PAYMENT,
            /** Funds Disbursement */
            FUNDS_DISBURSEMENT,
            /** Funds Transfer */
            FUNDS_TRANSFER,
            /** Loyalty and Offers */
            LOYALTY_AND_OFFERS,
            /** Merchant Disbursement */
            MERCHANT_DISBURSEMENT,
            /** Merchant Payment */
            MERCHANT_PAYMENT,
            /** Person to Person */
            PERSON_TO_PERSON,
            /** Top Up */
            TOP_UP,
            /** Wallet Transfer */
            WALLET_TRANSFER,
        }

        /**
         * An enum containing [BusinessApplicationIdentifier]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [BusinessApplicationIdentifier] can contain an unknown value in a couple
         * of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Account to Account */
            ACCOUNT_TO_ACCOUNT,
            /** Business to Business */
            BUSINESS_TO_BUSINESS,
            /** Money Transfer Bank Initiated */
            MONEY_TRANSFER_BANK_INITIATED,
            /** Non-Card Bill Payment */
            NON_CARD_BILL_PAYMENT,
            /** Consumer Bill Payment */
            CONSUMER_BILL_PAYMENT,
            /** Card Bill Payment */
            CARD_BILL_PAYMENT,
            /** Funds Disbursement */
            FUNDS_DISBURSEMENT,
            /** Funds Transfer */
            FUNDS_TRANSFER,
            /** Loyalty and Offers */
            LOYALTY_AND_OFFERS,
            /** Merchant Disbursement */
            MERCHANT_DISBURSEMENT,
            /** Merchant Payment */
            MERCHANT_PAYMENT,
            /** Person to Person */
            PERSON_TO_PERSON,
            /** Top Up */
            TOP_UP,
            /** Wallet Transfer */
            WALLET_TRANSFER,
            /**
             * An enum member indicating that [BusinessApplicationIdentifier] was instantiated with
             * an unknown value.
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
                ACCOUNT_TO_ACCOUNT -> Value.ACCOUNT_TO_ACCOUNT
                BUSINESS_TO_BUSINESS -> Value.BUSINESS_TO_BUSINESS
                MONEY_TRANSFER_BANK_INITIATED -> Value.MONEY_TRANSFER_BANK_INITIATED
                NON_CARD_BILL_PAYMENT -> Value.NON_CARD_BILL_PAYMENT
                CONSUMER_BILL_PAYMENT -> Value.CONSUMER_BILL_PAYMENT
                CARD_BILL_PAYMENT -> Value.CARD_BILL_PAYMENT
                FUNDS_DISBURSEMENT -> Value.FUNDS_DISBURSEMENT
                FUNDS_TRANSFER -> Value.FUNDS_TRANSFER
                LOYALTY_AND_OFFERS -> Value.LOYALTY_AND_OFFERS
                MERCHANT_DISBURSEMENT -> Value.MERCHANT_DISBURSEMENT
                MERCHANT_PAYMENT -> Value.MERCHANT_PAYMENT
                PERSON_TO_PERSON -> Value.PERSON_TO_PERSON
                TOP_UP -> Value.TOP_UP
                WALLET_TRANSFER -> Value.WALLET_TRANSFER
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
                ACCOUNT_TO_ACCOUNT -> Known.ACCOUNT_TO_ACCOUNT
                BUSINESS_TO_BUSINESS -> Known.BUSINESS_TO_BUSINESS
                MONEY_TRANSFER_BANK_INITIATED -> Known.MONEY_TRANSFER_BANK_INITIATED
                NON_CARD_BILL_PAYMENT -> Known.NON_CARD_BILL_PAYMENT
                CONSUMER_BILL_PAYMENT -> Known.CONSUMER_BILL_PAYMENT
                CARD_BILL_PAYMENT -> Known.CARD_BILL_PAYMENT
                FUNDS_DISBURSEMENT -> Known.FUNDS_DISBURSEMENT
                FUNDS_TRANSFER -> Known.FUNDS_TRANSFER
                LOYALTY_AND_OFFERS -> Known.LOYALTY_AND_OFFERS
                MERCHANT_DISBURSEMENT -> Known.MERCHANT_DISBURSEMENT
                MERCHANT_PAYMENT -> Known.MERCHANT_PAYMENT
                PERSON_TO_PERSON -> Known.PERSON_TO_PERSON
                TOP_UP -> Known.TOP_UP
                WALLET_TRANSFER -> Known.WALLET_TRANSFER
                else ->
                    throw IncreaseInvalidDataException(
                        "Unknown BusinessApplicationIdentifier: $value"
                    )
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

        fun validate(): BusinessApplicationIdentifier = apply {
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

            return other is BusinessApplicationIdentifier && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * If your account requires approvals for transfers and the transfer was not approved, this will
     * contain details of the cancellation.
     */
    class Cancellation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val canceledAt: JsonField<OffsetDateTime>,
        private val canceledBy: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("canceled_at")
            @ExcludeMissing
            canceledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("canceled_by")
            @ExcludeMissing
            canceledBy: JsonField<String> = JsonMissing.of(),
        ) : this(canceledAt, canceledBy, mutableMapOf())

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * Transfer was canceled.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun canceledAt(): OffsetDateTime = canceledAt.getRequired("canceled_at")

        /**
         * If the Transfer was canceled by a user in the dashboard, the email address of that user.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun canceledBy(): Optional<String> = canceledBy.getOptional("canceled_by")

        /**
         * Returns the raw JSON value of [canceledAt].
         *
         * Unlike [canceledAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("canceled_at")
        @ExcludeMissing
        fun _canceledAt(): JsonField<OffsetDateTime> = canceledAt

        /**
         * Returns the raw JSON value of [canceledBy].
         *
         * Unlike [canceledBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("canceled_by")
        @ExcludeMissing
        fun _canceledBy(): JsonField<String> = canceledBy

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
             * Returns a mutable builder for constructing an instance of [Cancellation].
             *
             * The following fields are required:
             * ```java
             * .canceledAt()
             * .canceledBy()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Cancellation]. */
        class Builder internal constructor() {

            private var canceledAt: JsonField<OffsetDateTime>? = null
            private var canceledBy: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cancellation: Cancellation) = apply {
                canceledAt = cancellation.canceledAt
                canceledBy = cancellation.canceledBy
                additionalProperties = cancellation.additionalProperties.toMutableMap()
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Transfer was canceled.
             */
            fun canceledAt(canceledAt: OffsetDateTime) = canceledAt(JsonField.of(canceledAt))

            /**
             * Sets [Builder.canceledAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.canceledAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun canceledAt(canceledAt: JsonField<OffsetDateTime>) = apply {
                this.canceledAt = canceledAt
            }

            /**
             * If the Transfer was canceled by a user in the dashboard, the email address of that
             * user.
             */
            fun canceledBy(canceledBy: String?) = canceledBy(JsonField.ofNullable(canceledBy))

            /** Alias for calling [Builder.canceledBy] with `canceledBy.orElse(null)`. */
            fun canceledBy(canceledBy: Optional<String>) = canceledBy(canceledBy.getOrNull())

            /**
             * Sets [Builder.canceledBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.canceledBy] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun canceledBy(canceledBy: JsonField<String>) = apply { this.canceledBy = canceledBy }

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
             * Returns an immutable instance of [Cancellation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .canceledAt()
             * .canceledBy()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Cancellation =
                Cancellation(
                    checkRequired("canceledAt", canceledAt),
                    checkRequired("canceledBy", canceledBy),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Cancellation = apply {
            if (validated) {
                return@apply
            }

            canceledAt()
            canceledBy()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (canceledAt.asKnown().isPresent) 1 else 0) +
                (if (canceledBy.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Cancellation &&
                canceledAt == other.canceledAt &&
                canceledBy == other.canceledBy &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(canceledAt, canceledBy, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Cancellation{canceledAt=$canceledAt, canceledBy=$canceledBy, additionalProperties=$additionalProperties}"
    }

    /** What object created the transfer, either via the API or the dashboard. */
    class CreatedBy
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val category: JsonField<Category>,
        private val apiKey: JsonField<ApiKey>,
        private val oauthApplication: JsonField<OAuthApplication>,
        private val user: JsonField<User>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<ApiKey> = JsonMissing.of(),
            @JsonProperty("oauth_application")
            @ExcludeMissing
            oauthApplication: JsonField<OAuthApplication> = JsonMissing.of(),
            @JsonProperty("user") @ExcludeMissing user: JsonField<User> = JsonMissing.of(),
        ) : this(category, apiKey, oauthApplication, user, mutableMapOf())

        /**
         * The type of object that created this transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * If present, details about the API key that created the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun apiKey(): Optional<ApiKey> = apiKey.getOptional("api_key")

        /**
         * If present, details about the OAuth Application that created the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun oauthApplication(): Optional<OAuthApplication> =
            oauthApplication.getOptional("oauth_application")

        /**
         * If present, details about the User that created the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun user(): Optional<User> = user.getOptional("user")

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [apiKey].
         *
         * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<ApiKey> = apiKey

        /**
         * Returns the raw JSON value of [oauthApplication].
         *
         * Unlike [oauthApplication], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("oauth_application")
        @ExcludeMissing
        fun _oauthApplication(): JsonField<OAuthApplication> = oauthApplication

        /**
         * Returns the raw JSON value of [user].
         *
         * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<User> = user

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
             * Returns a mutable builder for constructing an instance of [CreatedBy].
             *
             * The following fields are required:
             * ```java
             * .category()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreatedBy]. */
        class Builder internal constructor() {

            private var category: JsonField<Category>? = null
            private var apiKey: JsonField<ApiKey> = JsonMissing.of()
            private var oauthApplication: JsonField<OAuthApplication> = JsonMissing.of()
            private var user: JsonField<User> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(createdBy: CreatedBy) = apply {
                category = createdBy.category
                apiKey = createdBy.apiKey
                oauthApplication = createdBy.oauthApplication
                user = createdBy.user
                additionalProperties = createdBy.additionalProperties.toMutableMap()
            }

            /** The type of object that created this transfer. */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** If present, details about the API key that created the transfer. */
            fun apiKey(apiKey: ApiKey?) = apiKey(JsonField.ofNullable(apiKey))

            /** Alias for calling [Builder.apiKey] with `apiKey.orElse(null)`. */
            fun apiKey(apiKey: Optional<ApiKey>) = apiKey(apiKey.getOrNull())

            /**
             * Sets [Builder.apiKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiKey] with a well-typed [ApiKey] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiKey(apiKey: JsonField<ApiKey>) = apply { this.apiKey = apiKey }

            /** If present, details about the OAuth Application that created the transfer. */
            fun oauthApplication(oauthApplication: OAuthApplication?) =
                oauthApplication(JsonField.ofNullable(oauthApplication))

            /**
             * Alias for calling [Builder.oauthApplication] with `oauthApplication.orElse(null)`.
             */
            fun oauthApplication(oauthApplication: Optional<OAuthApplication>) =
                oauthApplication(oauthApplication.getOrNull())

            /**
             * Sets [Builder.oauthApplication] to an arbitrary JSON value.
             *
             * You should usually call [Builder.oauthApplication] with a well-typed
             * [OAuthApplication] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun oauthApplication(oauthApplication: JsonField<OAuthApplication>) = apply {
                this.oauthApplication = oauthApplication
            }

            /** If present, details about the User that created the transfer. */
            fun user(user: User?) = user(JsonField.ofNullable(user))

            /** Alias for calling [Builder.user] with `user.orElse(null)`. */
            fun user(user: Optional<User>) = user(user.getOrNull())

            /**
             * Sets [Builder.user] to an arbitrary JSON value.
             *
             * You should usually call [Builder.user] with a well-typed [User] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun user(user: JsonField<User>) = apply { this.user = user }

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
             * Returns an immutable instance of [CreatedBy].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .category()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreatedBy =
                CreatedBy(
                    checkRequired("category", category),
                    apiKey,
                    oauthApplication,
                    user,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CreatedBy = apply {
            if (validated) {
                return@apply
            }

            category().validate()
            apiKey().ifPresent { it.validate() }
            oauthApplication().ifPresent { it.validate() }
            user().ifPresent { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (category.asKnown().getOrNull()?.validity() ?: 0) +
                (apiKey.asKnown().getOrNull()?.validity() ?: 0) +
                (oauthApplication.asKnown().getOrNull()?.validity() ?: 0) +
                (user.asKnown().getOrNull()?.validity() ?: 0)

        /** The type of object that created this transfer. */
        class Category @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** An API key. Details will be under the `api_key` object. */
                @JvmField val API_KEY = of("api_key")

                /**
                 * An OAuth application you connected to Increase. Details will be under the
                 * `oauth_application` object.
                 */
                @JvmField val OAUTH_APPLICATION = of("oauth_application")

                /** A User in the Increase dashboard. Details will be under the `user` object. */
                @JvmField val USER = of("user")

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                /** An API key. Details will be under the `api_key` object. */
                API_KEY,
                /**
                 * An OAuth application you connected to Increase. Details will be under the
                 * `oauth_application` object.
                 */
                OAUTH_APPLICATION,
                /** A User in the Increase dashboard. Details will be under the `user` object. */
                USER,
            }

            /**
             * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Category] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** An API key. Details will be under the `api_key` object. */
                API_KEY,
                /**
                 * An OAuth application you connected to Increase. Details will be under the
                 * `oauth_application` object.
                 */
                OAUTH_APPLICATION,
                /** A User in the Increase dashboard. Details will be under the `user` object. */
                USER,
                /**
                 * An enum member indicating that [Category] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    API_KEY -> Value.API_KEY
                    OAUTH_APPLICATION -> Value.OAUTH_APPLICATION
                    USER -> Value.USER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    API_KEY -> Known.API_KEY
                    OAUTH_APPLICATION -> Known.OAUTH_APPLICATION
                    USER -> Known.USER
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Category = apply {
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

                return other is Category && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** If present, details about the API key that created the transfer. */
        class ApiKey
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val description: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of()
            ) : this(description, mutableMapOf())

            /**
             * The description set for the API key when it was created.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

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
                 * Returns a mutable builder for constructing an instance of [ApiKey].
                 *
                 * The following fields are required:
                 * ```java
                 * .description()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ApiKey]. */
            class Builder internal constructor() {

                private var description: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(apiKey: ApiKey) = apply {
                    description = apiKey.description
                    additionalProperties = apiKey.additionalProperties.toMutableMap()
                }

                /** The description set for the API key when it was created. */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /** Alias for calling [Builder.description] with `description.orElse(null)`. */
                fun description(description: Optional<String>) =
                    description(description.getOrNull())

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ApiKey].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .description()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ApiKey =
                    ApiKey(
                        checkRequired("description", description),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ApiKey = apply {
                if (validated) {
                    return@apply
                }

                description()
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
            @JvmSynthetic
            internal fun validity(): Int = (if (description.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ApiKey &&
                    description == other.description &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(description, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ApiKey{description=$description, additionalProperties=$additionalProperties}"
        }

        /** If present, details about the OAuth Application that created the transfer. */
        class OAuthApplication
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of()
            ) : this(name, mutableMapOf())

            /**
             * The name of the OAuth Application.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                 * Returns a mutable builder for constructing an instance of [OAuthApplication].
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OAuthApplication]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(oauthApplication: OAuthApplication) = apply {
                    name = oauthApplication.name
                    additionalProperties = oauthApplication.additionalProperties.toMutableMap()
                }

                /** The name of the OAuth Application. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [OAuthApplication].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): OAuthApplication =
                    OAuthApplication(
                        checkRequired("name", name),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): OAuthApplication = apply {
                if (validated) {
                    return@apply
                }

                name()
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
            @JvmSynthetic internal fun validity(): Int = (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OAuthApplication &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OAuthApplication{name=$name, additionalProperties=$additionalProperties}"
        }

        /** If present, details about the User that created the transfer. */
        class User
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val email: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of()
            ) : this(email, mutableMapOf())

            /**
             * The email address of the User.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun email(): String = email.getRequired("email")

            /**
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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
                 * Returns a mutable builder for constructing an instance of [User].
                 *
                 * The following fields are required:
                 * ```java
                 * .email()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [User]. */
            class Builder internal constructor() {

                private var email: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(user: User) = apply {
                    email = user.email
                    additionalProperties = user.additionalProperties.toMutableMap()
                }

                /** The email address of the User. */
                fun email(email: String) = email(JsonField.of(email))

                /**
                 * Sets [Builder.email] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.email] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun email(email: JsonField<String>) = apply { this.email = email }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [User].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .email()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): User =
                    User(checkRequired("email", email), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): User = apply {
                if (validated) {
                    return@apply
                }

                email()
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
            @JvmSynthetic internal fun validity(): Int = (if (email.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is User &&
                    email == other.email &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(email, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "User{email=$email, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreatedBy &&
                category == other.category &&
                apiKey == other.apiKey &&
                oauthApplication == other.oauthApplication &&
                user == other.user &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(category, apiKey, oauthApplication, user, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreatedBy{category=$category, apiKey=$apiKey, oauthApplication=$oauthApplication, user=$user, additionalProperties=$additionalProperties}"
    }

    /**
     * If the transfer is rejected by the card network or the destination financial institution,
     * this will contain supplemental details.
     */
    class Decline
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val declinedAt: JsonField<OffsetDateTime>,
        private val networkTransactionIdentifier: JsonField<String>,
        private val reason: JsonField<Reason>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("declined_at")
            @ExcludeMissing
            declinedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("network_transaction_identifier")
            @ExcludeMissing
            networkTransactionIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
        ) : this(declinedAt, networkTransactionIdentifier, reason, mutableMapOf())

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer declined.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun declinedAt(): OffsetDateTime = declinedAt.getRequired("declined_at")

        /**
         * A unique identifier for the transaction on the card network.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun networkTransactionIdentifier(): Optional<String> =
            networkTransactionIdentifier.getOptional("network_transaction_identifier")

        /**
         * The reason why the transfer was declined.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * Returns the raw JSON value of [declinedAt].
         *
         * Unlike [declinedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("declined_at")
        @ExcludeMissing
        fun _declinedAt(): JsonField<OffsetDateTime> = declinedAt

        /**
         * Returns the raw JSON value of [networkTransactionIdentifier].
         *
         * Unlike [networkTransactionIdentifier], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("network_transaction_identifier")
        @ExcludeMissing
        fun _networkTransactionIdentifier(): JsonField<String> = networkTransactionIdentifier

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

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
             * Returns a mutable builder for constructing an instance of [Decline].
             *
             * The following fields are required:
             * ```java
             * .declinedAt()
             * .networkTransactionIdentifier()
             * .reason()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Decline]. */
        class Builder internal constructor() {

            private var declinedAt: JsonField<OffsetDateTime>? = null
            private var networkTransactionIdentifier: JsonField<String>? = null
            private var reason: JsonField<Reason>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(decline: Decline) = apply {
                declinedAt = decline.declinedAt
                networkTransactionIdentifier = decline.networkTransactionIdentifier
                reason = decline.reason
                additionalProperties = decline.additionalProperties.toMutableMap()
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer declined.
             */
            fun declinedAt(declinedAt: OffsetDateTime) = declinedAt(JsonField.of(declinedAt))

            /**
             * Sets [Builder.declinedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.declinedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun declinedAt(declinedAt: JsonField<OffsetDateTime>) = apply {
                this.declinedAt = declinedAt
            }

            /** A unique identifier for the transaction on the card network. */
            fun networkTransactionIdentifier(networkTransactionIdentifier: String?) =
                networkTransactionIdentifier(JsonField.ofNullable(networkTransactionIdentifier))

            /**
             * Alias for calling [Builder.networkTransactionIdentifier] with
             * `networkTransactionIdentifier.orElse(null)`.
             */
            fun networkTransactionIdentifier(networkTransactionIdentifier: Optional<String>) =
                networkTransactionIdentifier(networkTransactionIdentifier.getOrNull())

            /**
             * Sets [Builder.networkTransactionIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.networkTransactionIdentifier] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun networkTransactionIdentifier(networkTransactionIdentifier: JsonField<String>) =
                apply {
                    this.networkTransactionIdentifier = networkTransactionIdentifier
                }

            /** The reason why the transfer was declined. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [Reason] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

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
             * Returns an immutable instance of [Decline].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .declinedAt()
             * .networkTransactionIdentifier()
             * .reason()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Decline =
                Decline(
                    checkRequired("declinedAt", declinedAt),
                    checkRequired("networkTransactionIdentifier", networkTransactionIdentifier),
                    checkRequired("reason", reason),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Decline = apply {
            if (validated) {
                return@apply
            }

            declinedAt()
            networkTransactionIdentifier()
            reason().validate()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (declinedAt.asKnown().isPresent) 1 else 0) +
                (if (networkTransactionIdentifier.asKnown().isPresent) 1 else 0) +
                (reason.asKnown().getOrNull()?.validity() ?: 0)

        /** The reason why the transfer was declined. */
        class Reason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /**
                 * The card issuer has declined the transaction without providing a specific reason.
                 */
                @JvmField val DO_NOT_HONOR = of("do_not_honor")

                /**
                 * The number of transactions for the card has exceeded the limit set by the issuer.
                 */
                @JvmField val ACTIVITY_COUNT_LIMIT_EXCEEDED = of("activity_count_limit_exceeded")

                /**
                 * The card issuer requires the cardholder to contact them for further information
                 * regarding the transaction.
                 */
                @JvmField val REFER_TO_CARD_ISSUER = of("refer_to_card_issuer")

                /**
                 * The card issuer requires the cardholder to contact them due to a special
                 * condition related to the transaction.
                 */
                @JvmField
                val REFER_TO_CARD_ISSUER_SPECIAL_CONDITION =
                    of("refer_to_card_issuer_special_condition")

                /** The merchant is not valid for this transaction. */
                @JvmField val INVALID_MERCHANT = of("invalid_merchant")

                /** The card should be retained by the terminal. */
                @JvmField val PICK_UP_CARD = of("pick_up_card")

                /** An error occurred during processing of the transaction. */
                @JvmField val ERROR = of("error")

                /** The card should be retained by the terminal due to a special condition. */
                @JvmField val PICK_UP_CARD_SPECIAL = of("pick_up_card_special")

                /** The transaction is invalid and cannot be processed. */
                @JvmField val INVALID_TRANSACTION = of("invalid_transaction")

                /** The amount of the transaction is invalid. */
                @JvmField val INVALID_AMOUNT = of("invalid_amount")

                /** The account number provided is invalid. */
                @JvmField val INVALID_ACCOUNT_NUMBER = of("invalid_account_number")

                /** The issuer of the card could not be found. */
                @JvmField val NO_SUCH_ISSUER = of("no_such_issuer")

                /** The transaction should be re-entered for processing. */
                @JvmField val RE_ENTER_TRANSACTION = of("re_enter_transaction")

                /** There is no credit account associated with the card. */
                @JvmField val NO_CREDIT_ACCOUNT = of("no_credit_account")

                /**
                 * The card should be retained by the terminal because it has been reported lost.
                 */
                @JvmField val PICK_UP_CARD_LOST = of("pick_up_card_lost")

                /**
                 * The card should be retained by the terminal because it has been reported stolen.
                 */
                @JvmField val PICK_UP_CARD_STOLEN = of("pick_up_card_stolen")

                /** The account associated with the card has been closed. */
                @JvmField val CLOSED_ACCOUNT = of("closed_account")

                /** There are insufficient funds in the account to complete the transaction. */
                @JvmField val INSUFFICIENT_FUNDS = of("insufficient_funds")

                /** There is no checking account associated with the card. */
                @JvmField val NO_CHECKING_ACCOUNT = of("no_checking_account")

                /** There is no savings account associated with the card. */
                @JvmField val NO_SAVINGS_ACCOUNT = of("no_savings_account")

                /** The card has expired and cannot be used for transactions. */
                @JvmField val EXPIRED_CARD = of("expired_card")

                /** The transaction is not permitted for this cardholder. */
                @JvmField
                val TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER =
                    of("transaction_not_permitted_to_cardholder")

                /** The transaction is not allowed at this terminal. */
                @JvmField
                val TRANSACTION_NOT_ALLOWED_AT_TERMINAL = of("transaction_not_allowed_at_terminal")

                /** The transaction has been flagged as suspected fraud and cannot be processed. */
                @JvmField val SUSPECTED_FRAUD = of("suspected_fraud")

                /** The amount of activity on the card has exceeded the limit set by the issuer. */
                @JvmField val ACTIVITY_AMOUNT_LIMIT_EXCEEDED = of("activity_amount_limit_exceeded")

                /**
                 * The card has restrictions that prevent it from being used for this transaction.
                 */
                @JvmField val RESTRICTED_CARD = of("restricted_card")

                /**
                 * A security violation has occurred, preventing the transaction from being
                 * processed.
                 */
                @JvmField val SECURITY_VIOLATION = of("security_violation")

                /**
                 * The transaction does not meet the anti-money laundering requirements set by the
                 * issuer.
                 */
                @JvmField
                val TRANSACTION_DOES_NOT_FULFILL_ANTI_MONEY_LAUNDERING_REQUIREMENT =
                    of("transaction_does_not_fulfill_anti_money_laundering_requirement")

                /** The first use of the card has been blocked by the issuer. */
                @JvmField val BLOCKED_FIRST_USE = of("blocked_first_use")

                /** The credit issuer is currently unavailable to process the transaction. */
                @JvmField val CREDIT_ISSUER_UNAVAILABLE = of("credit_issuer_unavailable")

                /**
                 * The card verification value (CVV) results were negative, indicating a potential
                 * issue with the card.
                 */
                @JvmField
                val NEGATIVE_CARD_VERIFICATION_VALUE_RESULTS =
                    of("negative_card_verification_value_results")

                /** The issuer of the card is currently unavailable to process the transaction. */
                @JvmField val ISSUER_UNAVAILABLE = of("issuer_unavailable")

                /** The financial institution associated with the card could not be found. */
                @JvmField
                val FINANCIAL_INSTITUTION_CANNOT_BE_FOUND =
                    of("financial_institution_cannot_be_found")

                /** The transaction cannot be completed due to an unspecified reason. */
                @JvmField
                val TRANSACTION_CANNOT_BE_COMPLETED = of("transaction_cannot_be_completed")

                /**
                 * The transaction is a duplicate of a previous transaction and cannot be processed
                 * again.
                 */
                @JvmField val DUPLICATE_TRANSACTION = of("duplicate_transaction")

                /**
                 * A system malfunction occurred, preventing the transaction from being processed.
                 */
                @JvmField val SYSTEM_MALFUNCTION = of("system_malfunction")

                /** Additional customer authentication is required to complete the transaction. */
                @JvmField
                val ADDITIONAL_CUSTOMER_AUTHENTICATION_REQUIRED =
                    of("additional_customer_authentication_required")

                /**
                 * The surcharge amount applied to the transaction is not permitted by the issuer.
                 */
                @JvmField val SURCHARGE_AMOUNT_NOT_PERMITTED = of("surcharge_amount_not_permitted")

                /** The transaction was declined due to a failure in verifying the CVV2 code. */
                @JvmField val DECLINE_FOR_CVV2_FAILURE = of("decline_for_cvv2_failure")

                /** A stop payment order has been placed on this transaction. */
                @JvmField val STOP_PAYMENT_ORDER = of("stop_payment_order")

                /** An order has been placed to revoke authorization for this transaction. */
                @JvmField
                val REVOCATION_OF_AUTHORIZATION_ORDER = of("revocation_of_authorization_order")

                /** An order has been placed to revoke all authorizations for this cardholder. */
                @JvmField
                val REVOCATION_OF_ALL_AUTHORIZATIONS_ORDER =
                    of("revocation_of_all_authorizations_order")

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                /**
                 * The card issuer has declined the transaction without providing a specific reason.
                 */
                DO_NOT_HONOR,
                /**
                 * The number of transactions for the card has exceeded the limit set by the issuer.
                 */
                ACTIVITY_COUNT_LIMIT_EXCEEDED,
                /**
                 * The card issuer requires the cardholder to contact them for further information
                 * regarding the transaction.
                 */
                REFER_TO_CARD_ISSUER,
                /**
                 * The card issuer requires the cardholder to contact them due to a special
                 * condition related to the transaction.
                 */
                REFER_TO_CARD_ISSUER_SPECIAL_CONDITION,
                /** The merchant is not valid for this transaction. */
                INVALID_MERCHANT,
                /** The card should be retained by the terminal. */
                PICK_UP_CARD,
                /** An error occurred during processing of the transaction. */
                ERROR,
                /** The card should be retained by the terminal due to a special condition. */
                PICK_UP_CARD_SPECIAL,
                /** The transaction is invalid and cannot be processed. */
                INVALID_TRANSACTION,
                /** The amount of the transaction is invalid. */
                INVALID_AMOUNT,
                /** The account number provided is invalid. */
                INVALID_ACCOUNT_NUMBER,
                /** The issuer of the card could not be found. */
                NO_SUCH_ISSUER,
                /** The transaction should be re-entered for processing. */
                RE_ENTER_TRANSACTION,
                /** There is no credit account associated with the card. */
                NO_CREDIT_ACCOUNT,
                /**
                 * The card should be retained by the terminal because it has been reported lost.
                 */
                PICK_UP_CARD_LOST,
                /**
                 * The card should be retained by the terminal because it has been reported stolen.
                 */
                PICK_UP_CARD_STOLEN,
                /** The account associated with the card has been closed. */
                CLOSED_ACCOUNT,
                /** There are insufficient funds in the account to complete the transaction. */
                INSUFFICIENT_FUNDS,
                /** There is no checking account associated with the card. */
                NO_CHECKING_ACCOUNT,
                /** There is no savings account associated with the card. */
                NO_SAVINGS_ACCOUNT,
                /** The card has expired and cannot be used for transactions. */
                EXPIRED_CARD,
                /** The transaction is not permitted for this cardholder. */
                TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER,
                /** The transaction is not allowed at this terminal. */
                TRANSACTION_NOT_ALLOWED_AT_TERMINAL,
                /** The transaction has been flagged as suspected fraud and cannot be processed. */
                SUSPECTED_FRAUD,
                /** The amount of activity on the card has exceeded the limit set by the issuer. */
                ACTIVITY_AMOUNT_LIMIT_EXCEEDED,
                /**
                 * The card has restrictions that prevent it from being used for this transaction.
                 */
                RESTRICTED_CARD,
                /**
                 * A security violation has occurred, preventing the transaction from being
                 * processed.
                 */
                SECURITY_VIOLATION,
                /**
                 * The transaction does not meet the anti-money laundering requirements set by the
                 * issuer.
                 */
                TRANSACTION_DOES_NOT_FULFILL_ANTI_MONEY_LAUNDERING_REQUIREMENT,
                /** The first use of the card has been blocked by the issuer. */
                BLOCKED_FIRST_USE,
                /** The credit issuer is currently unavailable to process the transaction. */
                CREDIT_ISSUER_UNAVAILABLE,
                /**
                 * The card verification value (CVV) results were negative, indicating a potential
                 * issue with the card.
                 */
                NEGATIVE_CARD_VERIFICATION_VALUE_RESULTS,
                /** The issuer of the card is currently unavailable to process the transaction. */
                ISSUER_UNAVAILABLE,
                /** The financial institution associated with the card could not be found. */
                FINANCIAL_INSTITUTION_CANNOT_BE_FOUND,
                /** The transaction cannot be completed due to an unspecified reason. */
                TRANSACTION_CANNOT_BE_COMPLETED,
                /**
                 * The transaction is a duplicate of a previous transaction and cannot be processed
                 * again.
                 */
                DUPLICATE_TRANSACTION,
                /**
                 * A system malfunction occurred, preventing the transaction from being processed.
                 */
                SYSTEM_MALFUNCTION,
                /** Additional customer authentication is required to complete the transaction. */
                ADDITIONAL_CUSTOMER_AUTHENTICATION_REQUIRED,
                /**
                 * The surcharge amount applied to the transaction is not permitted by the issuer.
                 */
                SURCHARGE_AMOUNT_NOT_PERMITTED,
                /** The transaction was declined due to a failure in verifying the CVV2 code. */
                DECLINE_FOR_CVV2_FAILURE,
                /** A stop payment order has been placed on this transaction. */
                STOP_PAYMENT_ORDER,
                /** An order has been placed to revoke authorization for this transaction. */
                REVOCATION_OF_AUTHORIZATION_ORDER,
                /** An order has been placed to revoke all authorizations for this cardholder. */
                REVOCATION_OF_ALL_AUTHORIZATIONS_ORDER,
            }

            /**
             * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Reason] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * The card issuer has declined the transaction without providing a specific reason.
                 */
                DO_NOT_HONOR,
                /**
                 * The number of transactions for the card has exceeded the limit set by the issuer.
                 */
                ACTIVITY_COUNT_LIMIT_EXCEEDED,
                /**
                 * The card issuer requires the cardholder to contact them for further information
                 * regarding the transaction.
                 */
                REFER_TO_CARD_ISSUER,
                /**
                 * The card issuer requires the cardholder to contact them due to a special
                 * condition related to the transaction.
                 */
                REFER_TO_CARD_ISSUER_SPECIAL_CONDITION,
                /** The merchant is not valid for this transaction. */
                INVALID_MERCHANT,
                /** The card should be retained by the terminal. */
                PICK_UP_CARD,
                /** An error occurred during processing of the transaction. */
                ERROR,
                /** The card should be retained by the terminal due to a special condition. */
                PICK_UP_CARD_SPECIAL,
                /** The transaction is invalid and cannot be processed. */
                INVALID_TRANSACTION,
                /** The amount of the transaction is invalid. */
                INVALID_AMOUNT,
                /** The account number provided is invalid. */
                INVALID_ACCOUNT_NUMBER,
                /** The issuer of the card could not be found. */
                NO_SUCH_ISSUER,
                /** The transaction should be re-entered for processing. */
                RE_ENTER_TRANSACTION,
                /** There is no credit account associated with the card. */
                NO_CREDIT_ACCOUNT,
                /**
                 * The card should be retained by the terminal because it has been reported lost.
                 */
                PICK_UP_CARD_LOST,
                /**
                 * The card should be retained by the terminal because it has been reported stolen.
                 */
                PICK_UP_CARD_STOLEN,
                /** The account associated with the card has been closed. */
                CLOSED_ACCOUNT,
                /** There are insufficient funds in the account to complete the transaction. */
                INSUFFICIENT_FUNDS,
                /** There is no checking account associated with the card. */
                NO_CHECKING_ACCOUNT,
                /** There is no savings account associated with the card. */
                NO_SAVINGS_ACCOUNT,
                /** The card has expired and cannot be used for transactions. */
                EXPIRED_CARD,
                /** The transaction is not permitted for this cardholder. */
                TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER,
                /** The transaction is not allowed at this terminal. */
                TRANSACTION_NOT_ALLOWED_AT_TERMINAL,
                /** The transaction has been flagged as suspected fraud and cannot be processed. */
                SUSPECTED_FRAUD,
                /** The amount of activity on the card has exceeded the limit set by the issuer. */
                ACTIVITY_AMOUNT_LIMIT_EXCEEDED,
                /**
                 * The card has restrictions that prevent it from being used for this transaction.
                 */
                RESTRICTED_CARD,
                /**
                 * A security violation has occurred, preventing the transaction from being
                 * processed.
                 */
                SECURITY_VIOLATION,
                /**
                 * The transaction does not meet the anti-money laundering requirements set by the
                 * issuer.
                 */
                TRANSACTION_DOES_NOT_FULFILL_ANTI_MONEY_LAUNDERING_REQUIREMENT,
                /** The first use of the card has been blocked by the issuer. */
                BLOCKED_FIRST_USE,
                /** The credit issuer is currently unavailable to process the transaction. */
                CREDIT_ISSUER_UNAVAILABLE,
                /**
                 * The card verification value (CVV) results were negative, indicating a potential
                 * issue with the card.
                 */
                NEGATIVE_CARD_VERIFICATION_VALUE_RESULTS,
                /** The issuer of the card is currently unavailable to process the transaction. */
                ISSUER_UNAVAILABLE,
                /** The financial institution associated with the card could not be found. */
                FINANCIAL_INSTITUTION_CANNOT_BE_FOUND,
                /** The transaction cannot be completed due to an unspecified reason. */
                TRANSACTION_CANNOT_BE_COMPLETED,
                /**
                 * The transaction is a duplicate of a previous transaction and cannot be processed
                 * again.
                 */
                DUPLICATE_TRANSACTION,
                /**
                 * A system malfunction occurred, preventing the transaction from being processed.
                 */
                SYSTEM_MALFUNCTION,
                /** Additional customer authentication is required to complete the transaction. */
                ADDITIONAL_CUSTOMER_AUTHENTICATION_REQUIRED,
                /**
                 * The surcharge amount applied to the transaction is not permitted by the issuer.
                 */
                SURCHARGE_AMOUNT_NOT_PERMITTED,
                /** The transaction was declined due to a failure in verifying the CVV2 code. */
                DECLINE_FOR_CVV2_FAILURE,
                /** A stop payment order has been placed on this transaction. */
                STOP_PAYMENT_ORDER,
                /** An order has been placed to revoke authorization for this transaction. */
                REVOCATION_OF_AUTHORIZATION_ORDER,
                /** An order has been placed to revoke all authorizations for this cardholder. */
                REVOCATION_OF_ALL_AUTHORIZATIONS_ORDER,
                /**
                 * An enum member indicating that [Reason] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DO_NOT_HONOR -> Value.DO_NOT_HONOR
                    ACTIVITY_COUNT_LIMIT_EXCEEDED -> Value.ACTIVITY_COUNT_LIMIT_EXCEEDED
                    REFER_TO_CARD_ISSUER -> Value.REFER_TO_CARD_ISSUER
                    REFER_TO_CARD_ISSUER_SPECIAL_CONDITION ->
                        Value.REFER_TO_CARD_ISSUER_SPECIAL_CONDITION
                    INVALID_MERCHANT -> Value.INVALID_MERCHANT
                    PICK_UP_CARD -> Value.PICK_UP_CARD
                    ERROR -> Value.ERROR
                    PICK_UP_CARD_SPECIAL -> Value.PICK_UP_CARD_SPECIAL
                    INVALID_TRANSACTION -> Value.INVALID_TRANSACTION
                    INVALID_AMOUNT -> Value.INVALID_AMOUNT
                    INVALID_ACCOUNT_NUMBER -> Value.INVALID_ACCOUNT_NUMBER
                    NO_SUCH_ISSUER -> Value.NO_SUCH_ISSUER
                    RE_ENTER_TRANSACTION -> Value.RE_ENTER_TRANSACTION
                    NO_CREDIT_ACCOUNT -> Value.NO_CREDIT_ACCOUNT
                    PICK_UP_CARD_LOST -> Value.PICK_UP_CARD_LOST
                    PICK_UP_CARD_STOLEN -> Value.PICK_UP_CARD_STOLEN
                    CLOSED_ACCOUNT -> Value.CLOSED_ACCOUNT
                    INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                    NO_CHECKING_ACCOUNT -> Value.NO_CHECKING_ACCOUNT
                    NO_SAVINGS_ACCOUNT -> Value.NO_SAVINGS_ACCOUNT
                    EXPIRED_CARD -> Value.EXPIRED_CARD
                    TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER ->
                        Value.TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER
                    TRANSACTION_NOT_ALLOWED_AT_TERMINAL -> Value.TRANSACTION_NOT_ALLOWED_AT_TERMINAL
                    SUSPECTED_FRAUD -> Value.SUSPECTED_FRAUD
                    ACTIVITY_AMOUNT_LIMIT_EXCEEDED -> Value.ACTIVITY_AMOUNT_LIMIT_EXCEEDED
                    RESTRICTED_CARD -> Value.RESTRICTED_CARD
                    SECURITY_VIOLATION -> Value.SECURITY_VIOLATION
                    TRANSACTION_DOES_NOT_FULFILL_ANTI_MONEY_LAUNDERING_REQUIREMENT ->
                        Value.TRANSACTION_DOES_NOT_FULFILL_ANTI_MONEY_LAUNDERING_REQUIREMENT
                    BLOCKED_FIRST_USE -> Value.BLOCKED_FIRST_USE
                    CREDIT_ISSUER_UNAVAILABLE -> Value.CREDIT_ISSUER_UNAVAILABLE
                    NEGATIVE_CARD_VERIFICATION_VALUE_RESULTS ->
                        Value.NEGATIVE_CARD_VERIFICATION_VALUE_RESULTS
                    ISSUER_UNAVAILABLE -> Value.ISSUER_UNAVAILABLE
                    FINANCIAL_INSTITUTION_CANNOT_BE_FOUND ->
                        Value.FINANCIAL_INSTITUTION_CANNOT_BE_FOUND
                    TRANSACTION_CANNOT_BE_COMPLETED -> Value.TRANSACTION_CANNOT_BE_COMPLETED
                    DUPLICATE_TRANSACTION -> Value.DUPLICATE_TRANSACTION
                    SYSTEM_MALFUNCTION -> Value.SYSTEM_MALFUNCTION
                    ADDITIONAL_CUSTOMER_AUTHENTICATION_REQUIRED ->
                        Value.ADDITIONAL_CUSTOMER_AUTHENTICATION_REQUIRED
                    SURCHARGE_AMOUNT_NOT_PERMITTED -> Value.SURCHARGE_AMOUNT_NOT_PERMITTED
                    DECLINE_FOR_CVV2_FAILURE -> Value.DECLINE_FOR_CVV2_FAILURE
                    STOP_PAYMENT_ORDER -> Value.STOP_PAYMENT_ORDER
                    REVOCATION_OF_AUTHORIZATION_ORDER -> Value.REVOCATION_OF_AUTHORIZATION_ORDER
                    REVOCATION_OF_ALL_AUTHORIZATIONS_ORDER ->
                        Value.REVOCATION_OF_ALL_AUTHORIZATIONS_ORDER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DO_NOT_HONOR -> Known.DO_NOT_HONOR
                    ACTIVITY_COUNT_LIMIT_EXCEEDED -> Known.ACTIVITY_COUNT_LIMIT_EXCEEDED
                    REFER_TO_CARD_ISSUER -> Known.REFER_TO_CARD_ISSUER
                    REFER_TO_CARD_ISSUER_SPECIAL_CONDITION ->
                        Known.REFER_TO_CARD_ISSUER_SPECIAL_CONDITION
                    INVALID_MERCHANT -> Known.INVALID_MERCHANT
                    PICK_UP_CARD -> Known.PICK_UP_CARD
                    ERROR -> Known.ERROR
                    PICK_UP_CARD_SPECIAL -> Known.PICK_UP_CARD_SPECIAL
                    INVALID_TRANSACTION -> Known.INVALID_TRANSACTION
                    INVALID_AMOUNT -> Known.INVALID_AMOUNT
                    INVALID_ACCOUNT_NUMBER -> Known.INVALID_ACCOUNT_NUMBER
                    NO_SUCH_ISSUER -> Known.NO_SUCH_ISSUER
                    RE_ENTER_TRANSACTION -> Known.RE_ENTER_TRANSACTION
                    NO_CREDIT_ACCOUNT -> Known.NO_CREDIT_ACCOUNT
                    PICK_UP_CARD_LOST -> Known.PICK_UP_CARD_LOST
                    PICK_UP_CARD_STOLEN -> Known.PICK_UP_CARD_STOLEN
                    CLOSED_ACCOUNT -> Known.CLOSED_ACCOUNT
                    INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                    NO_CHECKING_ACCOUNT -> Known.NO_CHECKING_ACCOUNT
                    NO_SAVINGS_ACCOUNT -> Known.NO_SAVINGS_ACCOUNT
                    EXPIRED_CARD -> Known.EXPIRED_CARD
                    TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER ->
                        Known.TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER
                    TRANSACTION_NOT_ALLOWED_AT_TERMINAL -> Known.TRANSACTION_NOT_ALLOWED_AT_TERMINAL
                    SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                    ACTIVITY_AMOUNT_LIMIT_EXCEEDED -> Known.ACTIVITY_AMOUNT_LIMIT_EXCEEDED
                    RESTRICTED_CARD -> Known.RESTRICTED_CARD
                    SECURITY_VIOLATION -> Known.SECURITY_VIOLATION
                    TRANSACTION_DOES_NOT_FULFILL_ANTI_MONEY_LAUNDERING_REQUIREMENT ->
                        Known.TRANSACTION_DOES_NOT_FULFILL_ANTI_MONEY_LAUNDERING_REQUIREMENT
                    BLOCKED_FIRST_USE -> Known.BLOCKED_FIRST_USE
                    CREDIT_ISSUER_UNAVAILABLE -> Known.CREDIT_ISSUER_UNAVAILABLE
                    NEGATIVE_CARD_VERIFICATION_VALUE_RESULTS ->
                        Known.NEGATIVE_CARD_VERIFICATION_VALUE_RESULTS
                    ISSUER_UNAVAILABLE -> Known.ISSUER_UNAVAILABLE
                    FINANCIAL_INSTITUTION_CANNOT_BE_FOUND ->
                        Known.FINANCIAL_INSTITUTION_CANNOT_BE_FOUND
                    TRANSACTION_CANNOT_BE_COMPLETED -> Known.TRANSACTION_CANNOT_BE_COMPLETED
                    DUPLICATE_TRANSACTION -> Known.DUPLICATE_TRANSACTION
                    SYSTEM_MALFUNCTION -> Known.SYSTEM_MALFUNCTION
                    ADDITIONAL_CUSTOMER_AUTHENTICATION_REQUIRED ->
                        Known.ADDITIONAL_CUSTOMER_AUTHENTICATION_REQUIRED
                    SURCHARGE_AMOUNT_NOT_PERMITTED -> Known.SURCHARGE_AMOUNT_NOT_PERMITTED
                    DECLINE_FOR_CVV2_FAILURE -> Known.DECLINE_FOR_CVV2_FAILURE
                    STOP_PAYMENT_ORDER -> Known.STOP_PAYMENT_ORDER
                    REVOCATION_OF_AUTHORIZATION_ORDER -> Known.REVOCATION_OF_AUTHORIZATION_ORDER
                    REVOCATION_OF_ALL_AUTHORIZATIONS_ORDER ->
                        Known.REVOCATION_OF_ALL_AUTHORIZATIONS_ORDER
                    else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Reason = apply {
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

                return other is Reason && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Decline &&
                declinedAt == other.declinedAt &&
                networkTransactionIdentifier == other.networkTransactionIdentifier &&
                reason == other.reason &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(declinedAt, networkTransactionIdentifier, reason, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Decline{declinedAt=$declinedAt, networkTransactionIdentifier=$networkTransactionIdentifier, reason=$reason, additionalProperties=$additionalProperties}"
    }

    /**
     * The amount that was transferred. The receiving bank will have converted this to the
     * cardholder's currency. The amount that is applied to your Increase account matches the
     * currency of your account.
     */
    class PresentmentAmount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val currency: JsonField<Currency>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(currency, value, mutableMapOf())

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * The amount value represented as a string containing a decimal number in major units (so
         * e.g., "12.34" for $12.34).
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): String = value.getRequired("value")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
             * Returns a mutable builder for constructing an instance of [PresentmentAmount].
             *
             * The following fields are required:
             * ```java
             * .currency()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PresentmentAmount]. */
        class Builder internal constructor() {

            private var currency: JsonField<Currency>? = null
            private var value: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(presentmentAmount: PresentmentAmount) = apply {
                currency = presentmentAmount.currency
                value = presentmentAmount.value
                additionalProperties = presentmentAmount.additionalProperties.toMutableMap()
            }

            /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code. */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /**
             * The amount value represented as a string containing a decimal number in major units
             * (so e.g., "12.34" for $12.34).
             */
            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

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
             * Returns an immutable instance of [PresentmentAmount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .currency()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PresentmentAmount =
                PresentmentAmount(
                    checkRequired("currency", currency),
                    checkRequired("value", value),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PresentmentAmount = apply {
            if (validated) {
                return@apply
            }

            currency().validate()
            value()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (value.asKnown().isPresent) 1 else 0)

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code. */
        class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** AFN */
                @JvmField val AFN = of("AFN")

                /** EUR */
                @JvmField val EUR = of("EUR")

                /** ALL */
                @JvmField val ALL = of("ALL")

                /** DZD */
                @JvmField val DZD = of("DZD")

                /** USD */
                @JvmField val USD = of("USD")

                /** AOA */
                @JvmField val AOA = of("AOA")

                /** ARS */
                @JvmField val ARS = of("ARS")

                /** AMD */
                @JvmField val AMD = of("AMD")

                /** AWG */
                @JvmField val AWG = of("AWG")

                /** AUD */
                @JvmField val AUD = of("AUD")

                /** AZN */
                @JvmField val AZN = of("AZN")

                /** BSD */
                @JvmField val BSD = of("BSD")

                /** BHD */
                @JvmField val BHD = of("BHD")

                /** BDT */
                @JvmField val BDT = of("BDT")

                /** BBD */
                @JvmField val BBD = of("BBD")

                /** BYN */
                @JvmField val BYN = of("BYN")

                /** BZD */
                @JvmField val BZD = of("BZD")

                /** BMD */
                @JvmField val BMD = of("BMD")

                /** INR */
                @JvmField val INR = of("INR")

                /** BTN */
                @JvmField val BTN = of("BTN")

                /** BOB */
                @JvmField val BOB = of("BOB")

                /** BOV */
                @JvmField val BOV = of("BOV")

                /** BAM */
                @JvmField val BAM = of("BAM")

                /** BWP */
                @JvmField val BWP = of("BWP")

                /** NOK */
                @JvmField val NOK = of("NOK")

                /** BRL */
                @JvmField val BRL = of("BRL")

                /** BND */
                @JvmField val BND = of("BND")

                /** BGN */
                @JvmField val BGN = of("BGN")

                /** BIF */
                @JvmField val BIF = of("BIF")

                /** CVE */
                @JvmField val CVE = of("CVE")

                /** KHR */
                @JvmField val KHR = of("KHR")

                /** CAD */
                @JvmField val CAD = of("CAD")

                /** KYD */
                @JvmField val KYD = of("KYD")

                /** CLP */
                @JvmField val CLP = of("CLP")

                /** CLF */
                @JvmField val CLF = of("CLF")

                /** CNY */
                @JvmField val CNY = of("CNY")

                /** COP */
                @JvmField val COP = of("COP")

                /** COU */
                @JvmField val COU = of("COU")

                /** KMF */
                @JvmField val KMF = of("KMF")

                /** CDF */
                @JvmField val CDF = of("CDF")

                /** NZD */
                @JvmField val NZD = of("NZD")

                /** CRC */
                @JvmField val CRC = of("CRC")

                /** CUP */
                @JvmField val CUP = of("CUP")

                /** CZK */
                @JvmField val CZK = of("CZK")

                /** DKK */
                @JvmField val DKK = of("DKK")

                /** DJF */
                @JvmField val DJF = of("DJF")

                /** DOP */
                @JvmField val DOP = of("DOP")

                /** EGP */
                @JvmField val EGP = of("EGP")

                /** SVC */
                @JvmField val SVC = of("SVC")

                /** ERN */
                @JvmField val ERN = of("ERN")

                /** SZL */
                @JvmField val SZL = of("SZL")

                /** ETB */
                @JvmField val ETB = of("ETB")

                /** FKP */
                @JvmField val FKP = of("FKP")

                /** FJD */
                @JvmField val FJD = of("FJD")

                /** GMD */
                @JvmField val GMD = of("GMD")

                /** GEL */
                @JvmField val GEL = of("GEL")

                /** GHS */
                @JvmField val GHS = of("GHS")

                /** GIP */
                @JvmField val GIP = of("GIP")

                /** GTQ */
                @JvmField val GTQ = of("GTQ")

                /** GBP */
                @JvmField val GBP = of("GBP")

                /** GNF */
                @JvmField val GNF = of("GNF")

                /** GYD */
                @JvmField val GYD = of("GYD")

                /** HTG */
                @JvmField val HTG = of("HTG")

                /** HNL */
                @JvmField val HNL = of("HNL")

                /** HKD */
                @JvmField val HKD = of("HKD")

                /** HUF */
                @JvmField val HUF = of("HUF")

                /** ISK */
                @JvmField val ISK = of("ISK")

                /** IDR */
                @JvmField val IDR = of("IDR")

                /** IRR */
                @JvmField val IRR = of("IRR")

                /** IQD */
                @JvmField val IQD = of("IQD")

                /** ILS */
                @JvmField val ILS = of("ILS")

                /** JMD */
                @JvmField val JMD = of("JMD")

                /** JPY */
                @JvmField val JPY = of("JPY")

                /** JOD */
                @JvmField val JOD = of("JOD")

                /** KZT */
                @JvmField val KZT = of("KZT")

                /** KES */
                @JvmField val KES = of("KES")

                /** KPW */
                @JvmField val KPW = of("KPW")

                /** KRW */
                @JvmField val KRW = of("KRW")

                /** KWD */
                @JvmField val KWD = of("KWD")

                /** KGS */
                @JvmField val KGS = of("KGS")

                /** LAK */
                @JvmField val LAK = of("LAK")

                /** LBP */
                @JvmField val LBP = of("LBP")

                /** LSL */
                @JvmField val LSL = of("LSL")

                /** ZAR */
                @JvmField val ZAR = of("ZAR")

                /** LRD */
                @JvmField val LRD = of("LRD")

                /** LYD */
                @JvmField val LYD = of("LYD")

                /** CHF */
                @JvmField val CHF = of("CHF")

                /** MOP */
                @JvmField val MOP = of("MOP")

                /** MKD */
                @JvmField val MKD = of("MKD")

                /** MGA */
                @JvmField val MGA = of("MGA")

                /** MWK */
                @JvmField val MWK = of("MWK")

                /** MYR */
                @JvmField val MYR = of("MYR")

                /** MVR */
                @JvmField val MVR = of("MVR")

                /** MRU */
                @JvmField val MRU = of("MRU")

                /** MUR */
                @JvmField val MUR = of("MUR")

                /** MXN */
                @JvmField val MXN = of("MXN")

                /** MXV */
                @JvmField val MXV = of("MXV")

                /** MDL */
                @JvmField val MDL = of("MDL")

                /** MNT */
                @JvmField val MNT = of("MNT")

                /** MAD */
                @JvmField val MAD = of("MAD")

                /** MZN */
                @JvmField val MZN = of("MZN")

                /** MMK */
                @JvmField val MMK = of("MMK")

                /** NAD */
                @JvmField val NAD = of("NAD")

                /** NPR */
                @JvmField val NPR = of("NPR")

                /** NIO */
                @JvmField val NIO = of("NIO")

                /** NGN */
                @JvmField val NGN = of("NGN")

                /** OMR */
                @JvmField val OMR = of("OMR")

                /** PKR */
                @JvmField val PKR = of("PKR")

                /** PAB */
                @JvmField val PAB = of("PAB")

                /** PGK */
                @JvmField val PGK = of("PGK")

                /** PYG */
                @JvmField val PYG = of("PYG")

                /** PEN */
                @JvmField val PEN = of("PEN")

                /** PHP */
                @JvmField val PHP = of("PHP")

                /** PLN */
                @JvmField val PLN = of("PLN")

                /** QAR */
                @JvmField val QAR = of("QAR")

                /** RON */
                @JvmField val RON = of("RON")

                /** RUB */
                @JvmField val RUB = of("RUB")

                /** RWF */
                @JvmField val RWF = of("RWF")

                /** SHP */
                @JvmField val SHP = of("SHP")

                /** WST */
                @JvmField val WST = of("WST")

                /** STN */
                @JvmField val STN = of("STN")

                /** SAR */
                @JvmField val SAR = of("SAR")

                /** RSD */
                @JvmField val RSD = of("RSD")

                /** SCR */
                @JvmField val SCR = of("SCR")

                /** SLE */
                @JvmField val SLE = of("SLE")

                /** SGD */
                @JvmField val SGD = of("SGD")

                /** SBD */
                @JvmField val SBD = of("SBD")

                /** SOS */
                @JvmField val SOS = of("SOS")

                /** SSP */
                @JvmField val SSP = of("SSP")

                /** LKR */
                @JvmField val LKR = of("LKR")

                /** SDG */
                @JvmField val SDG = of("SDG")

                /** SRD */
                @JvmField val SRD = of("SRD")

                /** SEK */
                @JvmField val SEK = of("SEK")

                /** CHE */
                @JvmField val CHE = of("CHE")

                /** CHW */
                @JvmField val CHW = of("CHW")

                /** SYP */
                @JvmField val SYP = of("SYP")

                /** TWD */
                @JvmField val TWD = of("TWD")

                /** TJS */
                @JvmField val TJS = of("TJS")

                /** TZS */
                @JvmField val TZS = of("TZS")

                /** THB */
                @JvmField val THB = of("THB")

                /** TOP */
                @JvmField val TOP = of("TOP")

                /** TTD */
                @JvmField val TTD = of("TTD")

                /** TND */
                @JvmField val TND = of("TND")

                /** TRY */
                @JvmField val TRY = of("TRY")

                /** TMT */
                @JvmField val TMT = of("TMT")

                /** UGX */
                @JvmField val UGX = of("UGX")

                /** UAH */
                @JvmField val UAH = of("UAH")

                /** AED */
                @JvmField val AED = of("AED")

                /** USN */
                @JvmField val USN = of("USN")

                /** UYU */
                @JvmField val UYU = of("UYU")

                /** UYI */
                @JvmField val UYI = of("UYI")

                /** UYW */
                @JvmField val UYW = of("UYW")

                /** UZS */
                @JvmField val UZS = of("UZS")

                /** VUV */
                @JvmField val VUV = of("VUV")

                /** VES */
                @JvmField val VES = of("VES")

                /** VED */
                @JvmField val VED = of("VED")

                /** VND */
                @JvmField val VND = of("VND")

                /** YER */
                @JvmField val YER = of("YER")

                /** ZMW */
                @JvmField val ZMW = of("ZMW")

                /** ZWG */
                @JvmField val ZWG = of("ZWG")

                @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
            }

            /** An enum containing [Currency]'s known values. */
            enum class Known {
                /** AFN */
                AFN,
                /** EUR */
                EUR,
                /** ALL */
                ALL,
                /** DZD */
                DZD,
                /** USD */
                USD,
                /** AOA */
                AOA,
                /** ARS */
                ARS,
                /** AMD */
                AMD,
                /** AWG */
                AWG,
                /** AUD */
                AUD,
                /** AZN */
                AZN,
                /** BSD */
                BSD,
                /** BHD */
                BHD,
                /** BDT */
                BDT,
                /** BBD */
                BBD,
                /** BYN */
                BYN,
                /** BZD */
                BZD,
                /** BMD */
                BMD,
                /** INR */
                INR,
                /** BTN */
                BTN,
                /** BOB */
                BOB,
                /** BOV */
                BOV,
                /** BAM */
                BAM,
                /** BWP */
                BWP,
                /** NOK */
                NOK,
                /** BRL */
                BRL,
                /** BND */
                BND,
                /** BGN */
                BGN,
                /** BIF */
                BIF,
                /** CVE */
                CVE,
                /** KHR */
                KHR,
                /** CAD */
                CAD,
                /** KYD */
                KYD,
                /** CLP */
                CLP,
                /** CLF */
                CLF,
                /** CNY */
                CNY,
                /** COP */
                COP,
                /** COU */
                COU,
                /** KMF */
                KMF,
                /** CDF */
                CDF,
                /** NZD */
                NZD,
                /** CRC */
                CRC,
                /** CUP */
                CUP,
                /** CZK */
                CZK,
                /** DKK */
                DKK,
                /** DJF */
                DJF,
                /** DOP */
                DOP,
                /** EGP */
                EGP,
                /** SVC */
                SVC,
                /** ERN */
                ERN,
                /** SZL */
                SZL,
                /** ETB */
                ETB,
                /** FKP */
                FKP,
                /** FJD */
                FJD,
                /** GMD */
                GMD,
                /** GEL */
                GEL,
                /** GHS */
                GHS,
                /** GIP */
                GIP,
                /** GTQ */
                GTQ,
                /** GBP */
                GBP,
                /** GNF */
                GNF,
                /** GYD */
                GYD,
                /** HTG */
                HTG,
                /** HNL */
                HNL,
                /** HKD */
                HKD,
                /** HUF */
                HUF,
                /** ISK */
                ISK,
                /** IDR */
                IDR,
                /** IRR */
                IRR,
                /** IQD */
                IQD,
                /** ILS */
                ILS,
                /** JMD */
                JMD,
                /** JPY */
                JPY,
                /** JOD */
                JOD,
                /** KZT */
                KZT,
                /** KES */
                KES,
                /** KPW */
                KPW,
                /** KRW */
                KRW,
                /** KWD */
                KWD,
                /** KGS */
                KGS,
                /** LAK */
                LAK,
                /** LBP */
                LBP,
                /** LSL */
                LSL,
                /** ZAR */
                ZAR,
                /** LRD */
                LRD,
                /** LYD */
                LYD,
                /** CHF */
                CHF,
                /** MOP */
                MOP,
                /** MKD */
                MKD,
                /** MGA */
                MGA,
                /** MWK */
                MWK,
                /** MYR */
                MYR,
                /** MVR */
                MVR,
                /** MRU */
                MRU,
                /** MUR */
                MUR,
                /** MXN */
                MXN,
                /** MXV */
                MXV,
                /** MDL */
                MDL,
                /** MNT */
                MNT,
                /** MAD */
                MAD,
                /** MZN */
                MZN,
                /** MMK */
                MMK,
                /** NAD */
                NAD,
                /** NPR */
                NPR,
                /** NIO */
                NIO,
                /** NGN */
                NGN,
                /** OMR */
                OMR,
                /** PKR */
                PKR,
                /** PAB */
                PAB,
                /** PGK */
                PGK,
                /** PYG */
                PYG,
                /** PEN */
                PEN,
                /** PHP */
                PHP,
                /** PLN */
                PLN,
                /** QAR */
                QAR,
                /** RON */
                RON,
                /** RUB */
                RUB,
                /** RWF */
                RWF,
                /** SHP */
                SHP,
                /** WST */
                WST,
                /** STN */
                STN,
                /** SAR */
                SAR,
                /** RSD */
                RSD,
                /** SCR */
                SCR,
                /** SLE */
                SLE,
                /** SGD */
                SGD,
                /** SBD */
                SBD,
                /** SOS */
                SOS,
                /** SSP */
                SSP,
                /** LKR */
                LKR,
                /** SDG */
                SDG,
                /** SRD */
                SRD,
                /** SEK */
                SEK,
                /** CHE */
                CHE,
                /** CHW */
                CHW,
                /** SYP */
                SYP,
                /** TWD */
                TWD,
                /** TJS */
                TJS,
                /** TZS */
                TZS,
                /** THB */
                THB,
                /** TOP */
                TOP,
                /** TTD */
                TTD,
                /** TND */
                TND,
                /** TRY */
                TRY,
                /** TMT */
                TMT,
                /** UGX */
                UGX,
                /** UAH */
                UAH,
                /** AED */
                AED,
                /** USN */
                USN,
                /** UYU */
                UYU,
                /** UYI */
                UYI,
                /** UYW */
                UYW,
                /** UZS */
                UZS,
                /** VUV */
                VUV,
                /** VES */
                VES,
                /** VED */
                VED,
                /** VND */
                VND,
                /** YER */
                YER,
                /** ZMW */
                ZMW,
                /** ZWG */
                ZWG,
            }

            /**
             * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Currency] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** AFN */
                AFN,
                /** EUR */
                EUR,
                /** ALL */
                ALL,
                /** DZD */
                DZD,
                /** USD */
                USD,
                /** AOA */
                AOA,
                /** ARS */
                ARS,
                /** AMD */
                AMD,
                /** AWG */
                AWG,
                /** AUD */
                AUD,
                /** AZN */
                AZN,
                /** BSD */
                BSD,
                /** BHD */
                BHD,
                /** BDT */
                BDT,
                /** BBD */
                BBD,
                /** BYN */
                BYN,
                /** BZD */
                BZD,
                /** BMD */
                BMD,
                /** INR */
                INR,
                /** BTN */
                BTN,
                /** BOB */
                BOB,
                /** BOV */
                BOV,
                /** BAM */
                BAM,
                /** BWP */
                BWP,
                /** NOK */
                NOK,
                /** BRL */
                BRL,
                /** BND */
                BND,
                /** BGN */
                BGN,
                /** BIF */
                BIF,
                /** CVE */
                CVE,
                /** KHR */
                KHR,
                /** CAD */
                CAD,
                /** KYD */
                KYD,
                /** CLP */
                CLP,
                /** CLF */
                CLF,
                /** CNY */
                CNY,
                /** COP */
                COP,
                /** COU */
                COU,
                /** KMF */
                KMF,
                /** CDF */
                CDF,
                /** NZD */
                NZD,
                /** CRC */
                CRC,
                /** CUP */
                CUP,
                /** CZK */
                CZK,
                /** DKK */
                DKK,
                /** DJF */
                DJF,
                /** DOP */
                DOP,
                /** EGP */
                EGP,
                /** SVC */
                SVC,
                /** ERN */
                ERN,
                /** SZL */
                SZL,
                /** ETB */
                ETB,
                /** FKP */
                FKP,
                /** FJD */
                FJD,
                /** GMD */
                GMD,
                /** GEL */
                GEL,
                /** GHS */
                GHS,
                /** GIP */
                GIP,
                /** GTQ */
                GTQ,
                /** GBP */
                GBP,
                /** GNF */
                GNF,
                /** GYD */
                GYD,
                /** HTG */
                HTG,
                /** HNL */
                HNL,
                /** HKD */
                HKD,
                /** HUF */
                HUF,
                /** ISK */
                ISK,
                /** IDR */
                IDR,
                /** IRR */
                IRR,
                /** IQD */
                IQD,
                /** ILS */
                ILS,
                /** JMD */
                JMD,
                /** JPY */
                JPY,
                /** JOD */
                JOD,
                /** KZT */
                KZT,
                /** KES */
                KES,
                /** KPW */
                KPW,
                /** KRW */
                KRW,
                /** KWD */
                KWD,
                /** KGS */
                KGS,
                /** LAK */
                LAK,
                /** LBP */
                LBP,
                /** LSL */
                LSL,
                /** ZAR */
                ZAR,
                /** LRD */
                LRD,
                /** LYD */
                LYD,
                /** CHF */
                CHF,
                /** MOP */
                MOP,
                /** MKD */
                MKD,
                /** MGA */
                MGA,
                /** MWK */
                MWK,
                /** MYR */
                MYR,
                /** MVR */
                MVR,
                /** MRU */
                MRU,
                /** MUR */
                MUR,
                /** MXN */
                MXN,
                /** MXV */
                MXV,
                /** MDL */
                MDL,
                /** MNT */
                MNT,
                /** MAD */
                MAD,
                /** MZN */
                MZN,
                /** MMK */
                MMK,
                /** NAD */
                NAD,
                /** NPR */
                NPR,
                /** NIO */
                NIO,
                /** NGN */
                NGN,
                /** OMR */
                OMR,
                /** PKR */
                PKR,
                /** PAB */
                PAB,
                /** PGK */
                PGK,
                /** PYG */
                PYG,
                /** PEN */
                PEN,
                /** PHP */
                PHP,
                /** PLN */
                PLN,
                /** QAR */
                QAR,
                /** RON */
                RON,
                /** RUB */
                RUB,
                /** RWF */
                RWF,
                /** SHP */
                SHP,
                /** WST */
                WST,
                /** STN */
                STN,
                /** SAR */
                SAR,
                /** RSD */
                RSD,
                /** SCR */
                SCR,
                /** SLE */
                SLE,
                /** SGD */
                SGD,
                /** SBD */
                SBD,
                /** SOS */
                SOS,
                /** SSP */
                SSP,
                /** LKR */
                LKR,
                /** SDG */
                SDG,
                /** SRD */
                SRD,
                /** SEK */
                SEK,
                /** CHE */
                CHE,
                /** CHW */
                CHW,
                /** SYP */
                SYP,
                /** TWD */
                TWD,
                /** TJS */
                TJS,
                /** TZS */
                TZS,
                /** THB */
                THB,
                /** TOP */
                TOP,
                /** TTD */
                TTD,
                /** TND */
                TND,
                /** TRY */
                TRY,
                /** TMT */
                TMT,
                /** UGX */
                UGX,
                /** UAH */
                UAH,
                /** AED */
                AED,
                /** USN */
                USN,
                /** UYU */
                UYU,
                /** UYI */
                UYI,
                /** UYW */
                UYW,
                /** UZS */
                UZS,
                /** VUV */
                VUV,
                /** VES */
                VES,
                /** VED */
                VED,
                /** VND */
                VND,
                /** YER */
                YER,
                /** ZMW */
                ZMW,
                /** ZWG */
                ZWG,
                /**
                 * An enum member indicating that [Currency] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AFN -> Value.AFN
                    EUR -> Value.EUR
                    ALL -> Value.ALL
                    DZD -> Value.DZD
                    USD -> Value.USD
                    AOA -> Value.AOA
                    ARS -> Value.ARS
                    AMD -> Value.AMD
                    AWG -> Value.AWG
                    AUD -> Value.AUD
                    AZN -> Value.AZN
                    BSD -> Value.BSD
                    BHD -> Value.BHD
                    BDT -> Value.BDT
                    BBD -> Value.BBD
                    BYN -> Value.BYN
                    BZD -> Value.BZD
                    BMD -> Value.BMD
                    INR -> Value.INR
                    BTN -> Value.BTN
                    BOB -> Value.BOB
                    BOV -> Value.BOV
                    BAM -> Value.BAM
                    BWP -> Value.BWP
                    NOK -> Value.NOK
                    BRL -> Value.BRL
                    BND -> Value.BND
                    BGN -> Value.BGN
                    BIF -> Value.BIF
                    CVE -> Value.CVE
                    KHR -> Value.KHR
                    CAD -> Value.CAD
                    KYD -> Value.KYD
                    CLP -> Value.CLP
                    CLF -> Value.CLF
                    CNY -> Value.CNY
                    COP -> Value.COP
                    COU -> Value.COU
                    KMF -> Value.KMF
                    CDF -> Value.CDF
                    NZD -> Value.NZD
                    CRC -> Value.CRC
                    CUP -> Value.CUP
                    CZK -> Value.CZK
                    DKK -> Value.DKK
                    DJF -> Value.DJF
                    DOP -> Value.DOP
                    EGP -> Value.EGP
                    SVC -> Value.SVC
                    ERN -> Value.ERN
                    SZL -> Value.SZL
                    ETB -> Value.ETB
                    FKP -> Value.FKP
                    FJD -> Value.FJD
                    GMD -> Value.GMD
                    GEL -> Value.GEL
                    GHS -> Value.GHS
                    GIP -> Value.GIP
                    GTQ -> Value.GTQ
                    GBP -> Value.GBP
                    GNF -> Value.GNF
                    GYD -> Value.GYD
                    HTG -> Value.HTG
                    HNL -> Value.HNL
                    HKD -> Value.HKD
                    HUF -> Value.HUF
                    ISK -> Value.ISK
                    IDR -> Value.IDR
                    IRR -> Value.IRR
                    IQD -> Value.IQD
                    ILS -> Value.ILS
                    JMD -> Value.JMD
                    JPY -> Value.JPY
                    JOD -> Value.JOD
                    KZT -> Value.KZT
                    KES -> Value.KES
                    KPW -> Value.KPW
                    KRW -> Value.KRW
                    KWD -> Value.KWD
                    KGS -> Value.KGS
                    LAK -> Value.LAK
                    LBP -> Value.LBP
                    LSL -> Value.LSL
                    ZAR -> Value.ZAR
                    LRD -> Value.LRD
                    LYD -> Value.LYD
                    CHF -> Value.CHF
                    MOP -> Value.MOP
                    MKD -> Value.MKD
                    MGA -> Value.MGA
                    MWK -> Value.MWK
                    MYR -> Value.MYR
                    MVR -> Value.MVR
                    MRU -> Value.MRU
                    MUR -> Value.MUR
                    MXN -> Value.MXN
                    MXV -> Value.MXV
                    MDL -> Value.MDL
                    MNT -> Value.MNT
                    MAD -> Value.MAD
                    MZN -> Value.MZN
                    MMK -> Value.MMK
                    NAD -> Value.NAD
                    NPR -> Value.NPR
                    NIO -> Value.NIO
                    NGN -> Value.NGN
                    OMR -> Value.OMR
                    PKR -> Value.PKR
                    PAB -> Value.PAB
                    PGK -> Value.PGK
                    PYG -> Value.PYG
                    PEN -> Value.PEN
                    PHP -> Value.PHP
                    PLN -> Value.PLN
                    QAR -> Value.QAR
                    RON -> Value.RON
                    RUB -> Value.RUB
                    RWF -> Value.RWF
                    SHP -> Value.SHP
                    WST -> Value.WST
                    STN -> Value.STN
                    SAR -> Value.SAR
                    RSD -> Value.RSD
                    SCR -> Value.SCR
                    SLE -> Value.SLE
                    SGD -> Value.SGD
                    SBD -> Value.SBD
                    SOS -> Value.SOS
                    SSP -> Value.SSP
                    LKR -> Value.LKR
                    SDG -> Value.SDG
                    SRD -> Value.SRD
                    SEK -> Value.SEK
                    CHE -> Value.CHE
                    CHW -> Value.CHW
                    SYP -> Value.SYP
                    TWD -> Value.TWD
                    TJS -> Value.TJS
                    TZS -> Value.TZS
                    THB -> Value.THB
                    TOP -> Value.TOP
                    TTD -> Value.TTD
                    TND -> Value.TND
                    TRY -> Value.TRY
                    TMT -> Value.TMT
                    UGX -> Value.UGX
                    UAH -> Value.UAH
                    AED -> Value.AED
                    USN -> Value.USN
                    UYU -> Value.UYU
                    UYI -> Value.UYI
                    UYW -> Value.UYW
                    UZS -> Value.UZS
                    VUV -> Value.VUV
                    VES -> Value.VES
                    VED -> Value.VED
                    VND -> Value.VND
                    YER -> Value.YER
                    ZMW -> Value.ZMW
                    ZWG -> Value.ZWG
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    AFN -> Known.AFN
                    EUR -> Known.EUR
                    ALL -> Known.ALL
                    DZD -> Known.DZD
                    USD -> Known.USD
                    AOA -> Known.AOA
                    ARS -> Known.ARS
                    AMD -> Known.AMD
                    AWG -> Known.AWG
                    AUD -> Known.AUD
                    AZN -> Known.AZN
                    BSD -> Known.BSD
                    BHD -> Known.BHD
                    BDT -> Known.BDT
                    BBD -> Known.BBD
                    BYN -> Known.BYN
                    BZD -> Known.BZD
                    BMD -> Known.BMD
                    INR -> Known.INR
                    BTN -> Known.BTN
                    BOB -> Known.BOB
                    BOV -> Known.BOV
                    BAM -> Known.BAM
                    BWP -> Known.BWP
                    NOK -> Known.NOK
                    BRL -> Known.BRL
                    BND -> Known.BND
                    BGN -> Known.BGN
                    BIF -> Known.BIF
                    CVE -> Known.CVE
                    KHR -> Known.KHR
                    CAD -> Known.CAD
                    KYD -> Known.KYD
                    CLP -> Known.CLP
                    CLF -> Known.CLF
                    CNY -> Known.CNY
                    COP -> Known.COP
                    COU -> Known.COU
                    KMF -> Known.KMF
                    CDF -> Known.CDF
                    NZD -> Known.NZD
                    CRC -> Known.CRC
                    CUP -> Known.CUP
                    CZK -> Known.CZK
                    DKK -> Known.DKK
                    DJF -> Known.DJF
                    DOP -> Known.DOP
                    EGP -> Known.EGP
                    SVC -> Known.SVC
                    ERN -> Known.ERN
                    SZL -> Known.SZL
                    ETB -> Known.ETB
                    FKP -> Known.FKP
                    FJD -> Known.FJD
                    GMD -> Known.GMD
                    GEL -> Known.GEL
                    GHS -> Known.GHS
                    GIP -> Known.GIP
                    GTQ -> Known.GTQ
                    GBP -> Known.GBP
                    GNF -> Known.GNF
                    GYD -> Known.GYD
                    HTG -> Known.HTG
                    HNL -> Known.HNL
                    HKD -> Known.HKD
                    HUF -> Known.HUF
                    ISK -> Known.ISK
                    IDR -> Known.IDR
                    IRR -> Known.IRR
                    IQD -> Known.IQD
                    ILS -> Known.ILS
                    JMD -> Known.JMD
                    JPY -> Known.JPY
                    JOD -> Known.JOD
                    KZT -> Known.KZT
                    KES -> Known.KES
                    KPW -> Known.KPW
                    KRW -> Known.KRW
                    KWD -> Known.KWD
                    KGS -> Known.KGS
                    LAK -> Known.LAK
                    LBP -> Known.LBP
                    LSL -> Known.LSL
                    ZAR -> Known.ZAR
                    LRD -> Known.LRD
                    LYD -> Known.LYD
                    CHF -> Known.CHF
                    MOP -> Known.MOP
                    MKD -> Known.MKD
                    MGA -> Known.MGA
                    MWK -> Known.MWK
                    MYR -> Known.MYR
                    MVR -> Known.MVR
                    MRU -> Known.MRU
                    MUR -> Known.MUR
                    MXN -> Known.MXN
                    MXV -> Known.MXV
                    MDL -> Known.MDL
                    MNT -> Known.MNT
                    MAD -> Known.MAD
                    MZN -> Known.MZN
                    MMK -> Known.MMK
                    NAD -> Known.NAD
                    NPR -> Known.NPR
                    NIO -> Known.NIO
                    NGN -> Known.NGN
                    OMR -> Known.OMR
                    PKR -> Known.PKR
                    PAB -> Known.PAB
                    PGK -> Known.PGK
                    PYG -> Known.PYG
                    PEN -> Known.PEN
                    PHP -> Known.PHP
                    PLN -> Known.PLN
                    QAR -> Known.QAR
                    RON -> Known.RON
                    RUB -> Known.RUB
                    RWF -> Known.RWF
                    SHP -> Known.SHP
                    WST -> Known.WST
                    STN -> Known.STN
                    SAR -> Known.SAR
                    RSD -> Known.RSD
                    SCR -> Known.SCR
                    SLE -> Known.SLE
                    SGD -> Known.SGD
                    SBD -> Known.SBD
                    SOS -> Known.SOS
                    SSP -> Known.SSP
                    LKR -> Known.LKR
                    SDG -> Known.SDG
                    SRD -> Known.SRD
                    SEK -> Known.SEK
                    CHE -> Known.CHE
                    CHW -> Known.CHW
                    SYP -> Known.SYP
                    TWD -> Known.TWD
                    TJS -> Known.TJS
                    TZS -> Known.TZS
                    THB -> Known.THB
                    TOP -> Known.TOP
                    TTD -> Known.TTD
                    TND -> Known.TND
                    TRY -> Known.TRY
                    TMT -> Known.TMT
                    UGX -> Known.UGX
                    UAH -> Known.UAH
                    AED -> Known.AED
                    USN -> Known.USN
                    UYU -> Known.UYU
                    UYI -> Known.UYI
                    UYW -> Known.UYW
                    UZS -> Known.UZS
                    VUV -> Known.VUV
                    VES -> Known.VES
                    VED -> Known.VED
                    VND -> Known.VND
                    YER -> Known.YER
                    ZMW -> Known.ZMW
                    ZWG -> Known.ZWG
                    else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Currency = apply {
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

                return other is Currency && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PresentmentAmount &&
                currency == other.currency &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(currency, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PresentmentAmount{currency=$currency, value=$value, additionalProperties=$additionalProperties}"
    }

    /** The lifecycle status of the transfer. */
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

            /** The transfer is pending approval. */
            @JvmField val PENDING_APPROVAL = of("pending_approval")

            /** The transfer has been canceled. */
            @JvmField val CANCELED = of("canceled")

            /** The transfer is pending review by Increase. */
            @JvmField val PENDING_REVIEWING = of("pending_reviewing")

            /** The transfer requires attention from an Increase operator. */
            @JvmField val REQUIRES_ATTENTION = of("requires_attention")

            /** The transfer is queued to be submitted to the card network. */
            @JvmField val PENDING_SUBMISSION = of("pending_submission")

            /** The transfer has been submitted and is pending a response from the card network. */
            @JvmField val SUBMITTED = of("submitted")

            /** The transfer has been sent successfully and is complete. */
            @JvmField val COMPLETE = of("complete")

            /** The transfer was declined by the network or the recipient's bank. */
            @JvmField val DECLINED = of("declined")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The transfer is pending approval. */
            PENDING_APPROVAL,
            /** The transfer has been canceled. */
            CANCELED,
            /** The transfer is pending review by Increase. */
            PENDING_REVIEWING,
            /** The transfer requires attention from an Increase operator. */
            REQUIRES_ATTENTION,
            /** The transfer is queued to be submitted to the card network. */
            PENDING_SUBMISSION,
            /** The transfer has been submitted and is pending a response from the card network. */
            SUBMITTED,
            /** The transfer has been sent successfully and is complete. */
            COMPLETE,
            /** The transfer was declined by the network or the recipient's bank. */
            DECLINED,
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
            /** The transfer is pending approval. */
            PENDING_APPROVAL,
            /** The transfer has been canceled. */
            CANCELED,
            /** The transfer is pending review by Increase. */
            PENDING_REVIEWING,
            /** The transfer requires attention from an Increase operator. */
            REQUIRES_ATTENTION,
            /** The transfer is queued to be submitted to the card network. */
            PENDING_SUBMISSION,
            /** The transfer has been submitted and is pending a response from the card network. */
            SUBMITTED,
            /** The transfer has been sent successfully and is complete. */
            COMPLETE,
            /** The transfer was declined by the network or the recipient's bank. */
            DECLINED,
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
                PENDING_APPROVAL -> Value.PENDING_APPROVAL
                CANCELED -> Value.CANCELED
                PENDING_REVIEWING -> Value.PENDING_REVIEWING
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
                PENDING_SUBMISSION -> Value.PENDING_SUBMISSION
                SUBMITTED -> Value.SUBMITTED
                COMPLETE -> Value.COMPLETE
                DECLINED -> Value.DECLINED
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
                PENDING_APPROVAL -> Known.PENDING_APPROVAL
                CANCELED -> Known.CANCELED
                PENDING_REVIEWING -> Known.PENDING_REVIEWING
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
                PENDING_SUBMISSION -> Known.PENDING_SUBMISSION
                SUBMITTED -> Known.SUBMITTED
                COMPLETE -> Known.COMPLETE
                DECLINED -> Known.DECLINED
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
     * After the transfer is submitted to the card network, this will contain supplemental details.
     */
    class Submission
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val retrievalReferenceNumber: JsonField<String>,
        private val senderReference: JsonField<String>,
        private val submittedAt: JsonField<OffsetDateTime>,
        private val traceNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("retrieval_reference_number")
            @ExcludeMissing
            retrievalReferenceNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sender_reference")
            @ExcludeMissing
            senderReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("submitted_at")
            @ExcludeMissing
            submittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("trace_number")
            @ExcludeMissing
            traceNumber: JsonField<String> = JsonMissing.of(),
        ) : this(
            retrievalReferenceNumber,
            senderReference,
            submittedAt,
            traceNumber,
            mutableMapOf(),
        )

        /**
         * A 12-digit retrieval reference number that identifies the transfer. Usually a combination
         * of a timestamp and the trace number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun retrievalReferenceNumber(): String =
            retrievalReferenceNumber.getRequired("retrieval_reference_number")

        /**
         * A unique reference for the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun senderReference(): String = senderReference.getRequired("sender_reference")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was submitted to the card network.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun submittedAt(): OffsetDateTime = submittedAt.getRequired("submitted_at")

        /**
         * A 6-digit trace number that identifies the transfer within a small window of time.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun traceNumber(): String = traceNumber.getRequired("trace_number")

        /**
         * Returns the raw JSON value of [retrievalReferenceNumber].
         *
         * Unlike [retrievalReferenceNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("retrieval_reference_number")
        @ExcludeMissing
        fun _retrievalReferenceNumber(): JsonField<String> = retrievalReferenceNumber

        /**
         * Returns the raw JSON value of [senderReference].
         *
         * Unlike [senderReference], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sender_reference")
        @ExcludeMissing
        fun _senderReference(): JsonField<String> = senderReference

        /**
         * Returns the raw JSON value of [submittedAt].
         *
         * Unlike [submittedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("submitted_at")
        @ExcludeMissing
        fun _submittedAt(): JsonField<OffsetDateTime> = submittedAt

        /**
         * Returns the raw JSON value of [traceNumber].
         *
         * Unlike [traceNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trace_number")
        @ExcludeMissing
        fun _traceNumber(): JsonField<String> = traceNumber

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
             * Returns a mutable builder for constructing an instance of [Submission].
             *
             * The following fields are required:
             * ```java
             * .retrievalReferenceNumber()
             * .senderReference()
             * .submittedAt()
             * .traceNumber()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Submission]. */
        class Builder internal constructor() {

            private var retrievalReferenceNumber: JsonField<String>? = null
            private var senderReference: JsonField<String>? = null
            private var submittedAt: JsonField<OffsetDateTime>? = null
            private var traceNumber: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(submission: Submission) = apply {
                retrievalReferenceNumber = submission.retrievalReferenceNumber
                senderReference = submission.senderReference
                submittedAt = submission.submittedAt
                traceNumber = submission.traceNumber
                additionalProperties = submission.additionalProperties.toMutableMap()
            }

            /**
             * A 12-digit retrieval reference number that identifies the transfer. Usually a
             * combination of a timestamp and the trace number.
             */
            fun retrievalReferenceNumber(retrievalReferenceNumber: String) =
                retrievalReferenceNumber(JsonField.of(retrievalReferenceNumber))

            /**
             * Sets [Builder.retrievalReferenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.retrievalReferenceNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun retrievalReferenceNumber(retrievalReferenceNumber: JsonField<String>) = apply {
                this.retrievalReferenceNumber = retrievalReferenceNumber
            }

            /** A unique reference for the transfer. */
            fun senderReference(senderReference: String) =
                senderReference(JsonField.of(senderReference))

            /**
             * Sets [Builder.senderReference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senderReference] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun senderReference(senderReference: JsonField<String>) = apply {
                this.senderReference = senderReference
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was submitted to the card network.
             */
            fun submittedAt(submittedAt: OffsetDateTime) = submittedAt(JsonField.of(submittedAt))

            /**
             * Sets [Builder.submittedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.submittedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun submittedAt(submittedAt: JsonField<OffsetDateTime>) = apply {
                this.submittedAt = submittedAt
            }

            /**
             * A 6-digit trace number that identifies the transfer within a small window of time.
             */
            fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

            /**
             * Sets [Builder.traceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.traceNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun traceNumber(traceNumber: JsonField<String>) = apply {
                this.traceNumber = traceNumber
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

            /**
             * Returns an immutable instance of [Submission].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .retrievalReferenceNumber()
             * .senderReference()
             * .submittedAt()
             * .traceNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Submission =
                Submission(
                    checkRequired("retrievalReferenceNumber", retrievalReferenceNumber),
                    checkRequired("senderReference", senderReference),
                    checkRequired("submittedAt", submittedAt),
                    checkRequired("traceNumber", traceNumber),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Submission = apply {
            if (validated) {
                return@apply
            }

            retrievalReferenceNumber()
            senderReference()
            submittedAt()
            traceNumber()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (retrievalReferenceNumber.asKnown().isPresent) 1 else 0) +
                (if (senderReference.asKnown().isPresent) 1 else 0) +
                (if (submittedAt.asKnown().isPresent) 1 else 0) +
                (if (traceNumber.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Submission &&
                retrievalReferenceNumber == other.retrievalReferenceNumber &&
                senderReference == other.senderReference &&
                submittedAt == other.submittedAt &&
                traceNumber == other.traceNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                retrievalReferenceNumber,
                senderReference,
                submittedAt,
                traceNumber,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Submission{retrievalReferenceNumber=$retrievalReferenceNumber, senderReference=$senderReference, submittedAt=$submittedAt, traceNumber=$traceNumber, additionalProperties=$additionalProperties}"
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_push_transfer`.
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

            @JvmField val CARD_PUSH_TRANSFER = of("card_push_transfer")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CARD_PUSH_TRANSFER
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
            CARD_PUSH_TRANSFER,
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
                CARD_PUSH_TRANSFER -> Value.CARD_PUSH_TRANSFER
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
                CARD_PUSH_TRANSFER -> Known.CARD_PUSH_TRANSFER
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

        return other is CardPushTransfer &&
            id == other.id &&
            acceptance == other.acceptance &&
            accountId == other.accountId &&
            approval == other.approval &&
            businessApplicationIdentifier == other.businessApplicationIdentifier &&
            cancellation == other.cancellation &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            decline == other.decline &&
            idempotencyKey == other.idempotencyKey &&
            merchantCategoryCode == other.merchantCategoryCode &&
            merchantCityName == other.merchantCityName &&
            merchantName == other.merchantName &&
            merchantNamePrefix == other.merchantNamePrefix &&
            merchantPostalCode == other.merchantPostalCode &&
            merchantState == other.merchantState &&
            presentmentAmount == other.presentmentAmount &&
            recipientName == other.recipientName &&
            senderAddressCity == other.senderAddressCity &&
            senderAddressLine1 == other.senderAddressLine1 &&
            senderAddressPostalCode == other.senderAddressPostalCode &&
            senderAddressState == other.senderAddressState &&
            senderName == other.senderName &&
            sourceAccountNumberId == other.sourceAccountNumberId &&
            status == other.status &&
            submission == other.submission &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            acceptance,
            accountId,
            approval,
            businessApplicationIdentifier,
            cancellation,
            createdAt,
            createdBy,
            decline,
            idempotencyKey,
            merchantCategoryCode,
            merchantCityName,
            merchantName,
            merchantNamePrefix,
            merchantPostalCode,
            merchantState,
            presentmentAmount,
            recipientName,
            senderAddressCity,
            senderAddressLine1,
            senderAddressPostalCode,
            senderAddressState,
            senderName,
            sourceAccountNumberId,
            status,
            submission,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardPushTransfer{id=$id, acceptance=$acceptance, accountId=$accountId, approval=$approval, businessApplicationIdentifier=$businessApplicationIdentifier, cancellation=$cancellation, createdAt=$createdAt, createdBy=$createdBy, decline=$decline, idempotencyKey=$idempotencyKey, merchantCategoryCode=$merchantCategoryCode, merchantCityName=$merchantCityName, merchantName=$merchantName, merchantNamePrefix=$merchantNamePrefix, merchantPostalCode=$merchantPostalCode, merchantState=$merchantState, presentmentAmount=$presentmentAmount, recipientName=$recipientName, senderAddressCity=$senderAddressCity, senderAddressLine1=$senderAddressLine1, senderAddressPostalCode=$senderAddressPostalCode, senderAddressState=$senderAddressState, senderName=$senderName, sourceAccountNumberId=$sourceAccountNumberId, status=$status, submission=$submission, type=$type, additionalProperties=$additionalProperties}"
}
