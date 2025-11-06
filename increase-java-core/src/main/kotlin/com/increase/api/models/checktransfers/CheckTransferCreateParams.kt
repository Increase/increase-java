// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checktransfers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.Params
import com.increase.api.core.checkKnown
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a Check Transfer */
class CheckTransferCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The identifier for the account that will send the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = body.accountId()

    /**
     * The transfer amount in USD cents.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * Whether Increase will print and mail the check or if you will do it yourself.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fulfillmentMethod(): FulfillmentMethod = body.fulfillmentMethod()

    /**
     * The identifier of the Account Number from which to send the transfer and print on the check.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceAccountNumberId(): String = body.sourceAccountNumberId()

    /**
     * How the account's available balance should be checked. If omitted, the default behavior is
     * `balance_check: full`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun balanceCheck(): Optional<BalanceCheck> = body.balanceCheck()

    /**
     * The check number Increase should use for the check. This should not contain leading zeroes
     * and must be unique across the `source_account_number`. If this is omitted, Increase will
     * generate a check number for you.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun checkNumber(): Optional<String> = body.checkNumber()

    /**
     * Details relating to the physical check that Increase will print and mail. This is required if
     * `fulfillment_method` is equal to `physical_check`. It must not be included if any other
     * `fulfillment_method` is provided.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun physicalCheck(): Optional<PhysicalCheck> = body.physicalCheck()

    /**
     * Whether the transfer requires explicit approval via the dashboard or API.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requireApproval(): Optional<Boolean> = body.requireApproval()

    /**
     * Details relating to the custom fulfillment you will perform. This is required if
     * `fulfillment_method` is equal to `third_party`. It must not be included if any other
     * `fulfillment_method` is provided.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun thirdParty(): Optional<ThirdParty> = body.thirdParty()

    /**
     * If provided, the check will be valid on or before this date. After this date, the check
     * transfer will be stopped and deposits will not be accepted. For checks printed by Increase,
     * this date is included on the check as its expiry.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun validUntilDate(): Optional<LocalDate> = body.validUntilDate()

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountId(): JsonField<String> = body._accountId()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * Returns the raw JSON value of [fulfillmentMethod].
     *
     * Unlike [fulfillmentMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _fulfillmentMethod(): JsonField<FulfillmentMethod> = body._fulfillmentMethod()

    /**
     * Returns the raw JSON value of [sourceAccountNumberId].
     *
     * Unlike [sourceAccountNumberId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _sourceAccountNumberId(): JsonField<String> = body._sourceAccountNumberId()

    /**
     * Returns the raw JSON value of [balanceCheck].
     *
     * Unlike [balanceCheck], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _balanceCheck(): JsonField<BalanceCheck> = body._balanceCheck()

    /**
     * Returns the raw JSON value of [checkNumber].
     *
     * Unlike [checkNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _checkNumber(): JsonField<String> = body._checkNumber()

    /**
     * Returns the raw JSON value of [physicalCheck].
     *
     * Unlike [physicalCheck], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _physicalCheck(): JsonField<PhysicalCheck> = body._physicalCheck()

    /**
     * Returns the raw JSON value of [requireApproval].
     *
     * Unlike [requireApproval], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _requireApproval(): JsonField<Boolean> = body._requireApproval()

    /**
     * Returns the raw JSON value of [thirdParty].
     *
     * Unlike [thirdParty], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _thirdParty(): JsonField<ThirdParty> = body._thirdParty()

    /**
     * Returns the raw JSON value of [validUntilDate].
     *
     * Unlike [validUntilDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _validUntilDate(): JsonField<LocalDate> = body._validUntilDate()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CheckTransferCreateParams].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .amount()
         * .fulfillmentMethod()
         * .sourceAccountNumberId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CheckTransferCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(checkTransferCreateParams: CheckTransferCreateParams) = apply {
            body = checkTransferCreateParams.body.toBuilder()
            additionalHeaders = checkTransferCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = checkTransferCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountId]
         * - [amount]
         * - [fulfillmentMethod]
         * - [sourceAccountNumberId]
         * - [balanceCheck]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The identifier for the account that will send the transfer. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /** The transfer amount in USD cents. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** Whether Increase will print and mail the check or if you will do it yourself. */
        fun fulfillmentMethod(fulfillmentMethod: FulfillmentMethod) = apply {
            body.fulfillmentMethod(fulfillmentMethod)
        }

        /**
         * Sets [Builder.fulfillmentMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fulfillmentMethod] with a well-typed [FulfillmentMethod]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun fulfillmentMethod(fulfillmentMethod: JsonField<FulfillmentMethod>) = apply {
            body.fulfillmentMethod(fulfillmentMethod)
        }

        /**
         * The identifier of the Account Number from which to send the transfer and print on the
         * check.
         */
        fun sourceAccountNumberId(sourceAccountNumberId: String) = apply {
            body.sourceAccountNumberId(sourceAccountNumberId)
        }

        /**
         * Sets [Builder.sourceAccountNumberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceAccountNumberId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceAccountNumberId(sourceAccountNumberId: JsonField<String>) = apply {
            body.sourceAccountNumberId(sourceAccountNumberId)
        }

        /**
         * How the account's available balance should be checked. If omitted, the default behavior
         * is `balance_check: full`.
         */
        fun balanceCheck(balanceCheck: BalanceCheck) = apply { body.balanceCheck(balanceCheck) }

        /**
         * Sets [Builder.balanceCheck] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balanceCheck] with a well-typed [BalanceCheck] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun balanceCheck(balanceCheck: JsonField<BalanceCheck>) = apply {
            body.balanceCheck(balanceCheck)
        }

        /**
         * The check number Increase should use for the check. This should not contain leading
         * zeroes and must be unique across the `source_account_number`. If this is omitted,
         * Increase will generate a check number for you.
         */
        fun checkNumber(checkNumber: String) = apply { body.checkNumber(checkNumber) }

        /**
         * Sets [Builder.checkNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checkNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun checkNumber(checkNumber: JsonField<String>) = apply { body.checkNumber(checkNumber) }

        /**
         * Details relating to the physical check that Increase will print and mail. This is
         * required if `fulfillment_method` is equal to `physical_check`. It must not be included if
         * any other `fulfillment_method` is provided.
         */
        fun physicalCheck(physicalCheck: PhysicalCheck) = apply {
            body.physicalCheck(physicalCheck)
        }

        /**
         * Sets [Builder.physicalCheck] to an arbitrary JSON value.
         *
         * You should usually call [Builder.physicalCheck] with a well-typed [PhysicalCheck] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun physicalCheck(physicalCheck: JsonField<PhysicalCheck>) = apply {
            body.physicalCheck(physicalCheck)
        }

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(requireApproval: Boolean) = apply {
            body.requireApproval(requireApproval)
        }

        /**
         * Sets [Builder.requireApproval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requireApproval] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requireApproval(requireApproval: JsonField<Boolean>) = apply {
            body.requireApproval(requireApproval)
        }

        /**
         * Details relating to the custom fulfillment you will perform. This is required if
         * `fulfillment_method` is equal to `third_party`. It must not be included if any other
         * `fulfillment_method` is provided.
         */
        fun thirdParty(thirdParty: ThirdParty) = apply { body.thirdParty(thirdParty) }

        /**
         * Sets [Builder.thirdParty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thirdParty] with a well-typed [ThirdParty] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun thirdParty(thirdParty: JsonField<ThirdParty>) = apply { body.thirdParty(thirdParty) }

        /**
         * If provided, the check will be valid on or before this date. After this date, the check
         * transfer will be stopped and deposits will not be accepted. For checks printed by
         * Increase, this date is included on the check as its expiry.
         */
        fun validUntilDate(validUntilDate: LocalDate) = apply {
            body.validUntilDate(validUntilDate)
        }

        /**
         * Sets [Builder.validUntilDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validUntilDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun validUntilDate(validUntilDate: JsonField<LocalDate>) = apply {
            body.validUntilDate(validUntilDate)
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

        /**
         * Returns an immutable instance of [CheckTransferCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .amount()
         * .fulfillmentMethod()
         * .sourceAccountNumberId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CheckTransferCreateParams =
            CheckTransferCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountId: JsonField<String>,
        private val amount: JsonField<Long>,
        private val fulfillmentMethod: JsonField<FulfillmentMethod>,
        private val sourceAccountNumberId: JsonField<String>,
        private val balanceCheck: JsonField<BalanceCheck>,
        private val checkNumber: JsonField<String>,
        private val physicalCheck: JsonField<PhysicalCheck>,
        private val requireApproval: JsonField<Boolean>,
        private val thirdParty: JsonField<ThirdParty>,
        private val validUntilDate: JsonField<LocalDate>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("fulfillment_method")
            @ExcludeMissing
            fulfillmentMethod: JsonField<FulfillmentMethod> = JsonMissing.of(),
            @JsonProperty("source_account_number_id")
            @ExcludeMissing
            sourceAccountNumberId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("balance_check")
            @ExcludeMissing
            balanceCheck: JsonField<BalanceCheck> = JsonMissing.of(),
            @JsonProperty("check_number")
            @ExcludeMissing
            checkNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("physical_check")
            @ExcludeMissing
            physicalCheck: JsonField<PhysicalCheck> = JsonMissing.of(),
            @JsonProperty("require_approval")
            @ExcludeMissing
            requireApproval: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("third_party")
            @ExcludeMissing
            thirdParty: JsonField<ThirdParty> = JsonMissing.of(),
            @JsonProperty("valid_until_date")
            @ExcludeMissing
            validUntilDate: JsonField<LocalDate> = JsonMissing.of(),
        ) : this(
            accountId,
            amount,
            fulfillmentMethod,
            sourceAccountNumberId,
            balanceCheck,
            checkNumber,
            physicalCheck,
            requireApproval,
            thirdParty,
            validUntilDate,
            mutableMapOf(),
        )

        /**
         * The identifier for the account that will send the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * The transfer amount in USD cents.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * Whether Increase will print and mail the check or if you will do it yourself.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fulfillmentMethod(): FulfillmentMethod =
            fulfillmentMethod.getRequired("fulfillment_method")

        /**
         * The identifier of the Account Number from which to send the transfer and print on the
         * check.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sourceAccountNumberId(): String =
            sourceAccountNumberId.getRequired("source_account_number_id")

        /**
         * How the account's available balance should be checked. If omitted, the default behavior
         * is `balance_check: full`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun balanceCheck(): Optional<BalanceCheck> = balanceCheck.getOptional("balance_check")

        /**
         * The check number Increase should use for the check. This should not contain leading
         * zeroes and must be unique across the `source_account_number`. If this is omitted,
         * Increase will generate a check number for you.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun checkNumber(): Optional<String> = checkNumber.getOptional("check_number")

        /**
         * Details relating to the physical check that Increase will print and mail. This is
         * required if `fulfillment_method` is equal to `physical_check`. It must not be included if
         * any other `fulfillment_method` is provided.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun physicalCheck(): Optional<PhysicalCheck> = physicalCheck.getOptional("physical_check")

        /**
         * Whether the transfer requires explicit approval via the dashboard or API.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun requireApproval(): Optional<Boolean> = requireApproval.getOptional("require_approval")

        /**
         * Details relating to the custom fulfillment you will perform. This is required if
         * `fulfillment_method` is equal to `third_party`. It must not be included if any other
         * `fulfillment_method` is provided.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun thirdParty(): Optional<ThirdParty> = thirdParty.getOptional("third_party")

        /**
         * If provided, the check will be valid on or before this date. After this date, the check
         * transfer will be stopped and deposits will not be accepted. For checks printed by
         * Increase, this date is included on the check as its expiry.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun validUntilDate(): Optional<LocalDate> = validUntilDate.getOptional("valid_until_date")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [fulfillmentMethod].
         *
         * Unlike [fulfillmentMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fulfillment_method")
        @ExcludeMissing
        fun _fulfillmentMethod(): JsonField<FulfillmentMethod> = fulfillmentMethod

        /**
         * Returns the raw JSON value of [sourceAccountNumberId].
         *
         * Unlike [sourceAccountNumberId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("source_account_number_id")
        @ExcludeMissing
        fun _sourceAccountNumberId(): JsonField<String> = sourceAccountNumberId

        /**
         * Returns the raw JSON value of [balanceCheck].
         *
         * Unlike [balanceCheck], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("balance_check")
        @ExcludeMissing
        fun _balanceCheck(): JsonField<BalanceCheck> = balanceCheck

        /**
         * Returns the raw JSON value of [checkNumber].
         *
         * Unlike [checkNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("check_number")
        @ExcludeMissing
        fun _checkNumber(): JsonField<String> = checkNumber

        /**
         * Returns the raw JSON value of [physicalCheck].
         *
         * Unlike [physicalCheck], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("physical_check")
        @ExcludeMissing
        fun _physicalCheck(): JsonField<PhysicalCheck> = physicalCheck

        /**
         * Returns the raw JSON value of [requireApproval].
         *
         * Unlike [requireApproval], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("require_approval")
        @ExcludeMissing
        fun _requireApproval(): JsonField<Boolean> = requireApproval

        /**
         * Returns the raw JSON value of [thirdParty].
         *
         * Unlike [thirdParty], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("third_party")
        @ExcludeMissing
        fun _thirdParty(): JsonField<ThirdParty> = thirdParty

        /**
         * Returns the raw JSON value of [validUntilDate].
         *
         * Unlike [validUntilDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("valid_until_date")
        @ExcludeMissing
        fun _validUntilDate(): JsonField<LocalDate> = validUntilDate

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * .amount()
             * .fulfillmentMethod()
             * .sourceAccountNumberId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var fulfillmentMethod: JsonField<FulfillmentMethod>? = null
            private var sourceAccountNumberId: JsonField<String>? = null
            private var balanceCheck: JsonField<BalanceCheck> = JsonMissing.of()
            private var checkNumber: JsonField<String> = JsonMissing.of()
            private var physicalCheck: JsonField<PhysicalCheck> = JsonMissing.of()
            private var requireApproval: JsonField<Boolean> = JsonMissing.of()
            private var thirdParty: JsonField<ThirdParty> = JsonMissing.of()
            private var validUntilDate: JsonField<LocalDate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountId = body.accountId
                amount = body.amount
                fulfillmentMethod = body.fulfillmentMethod
                sourceAccountNumberId = body.sourceAccountNumberId
                balanceCheck = body.balanceCheck
                checkNumber = body.checkNumber
                physicalCheck = body.physicalCheck
                requireApproval = body.requireApproval
                thirdParty = body.thirdParty
                validUntilDate = body.validUntilDate
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The identifier for the account that will send the transfer. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The transfer amount in USD cents. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** Whether Increase will print and mail the check or if you will do it yourself. */
            fun fulfillmentMethod(fulfillmentMethod: FulfillmentMethod) =
                fulfillmentMethod(JsonField.of(fulfillmentMethod))

            /**
             * Sets [Builder.fulfillmentMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fulfillmentMethod] with a well-typed
             * [FulfillmentMethod] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun fulfillmentMethod(fulfillmentMethod: JsonField<FulfillmentMethod>) = apply {
                this.fulfillmentMethod = fulfillmentMethod
            }

            /**
             * The identifier of the Account Number from which to send the transfer and print on the
             * check.
             */
            fun sourceAccountNumberId(sourceAccountNumberId: String) =
                sourceAccountNumberId(JsonField.of(sourceAccountNumberId))

            /**
             * Sets [Builder.sourceAccountNumberId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceAccountNumberId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sourceAccountNumberId(sourceAccountNumberId: JsonField<String>) = apply {
                this.sourceAccountNumberId = sourceAccountNumberId
            }

            /**
             * How the account's available balance should be checked. If omitted, the default
             * behavior is `balance_check: full`.
             */
            fun balanceCheck(balanceCheck: BalanceCheck) = balanceCheck(JsonField.of(balanceCheck))

            /**
             * Sets [Builder.balanceCheck] to an arbitrary JSON value.
             *
             * You should usually call [Builder.balanceCheck] with a well-typed [BalanceCheck] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun balanceCheck(balanceCheck: JsonField<BalanceCheck>) = apply {
                this.balanceCheck = balanceCheck
            }

            /**
             * The check number Increase should use for the check. This should not contain leading
             * zeroes and must be unique across the `source_account_number`. If this is omitted,
             * Increase will generate a check number for you.
             */
            fun checkNumber(checkNumber: String) = checkNumber(JsonField.of(checkNumber))

            /**
             * Sets [Builder.checkNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.checkNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun checkNumber(checkNumber: JsonField<String>) = apply {
                this.checkNumber = checkNumber
            }

            /**
             * Details relating to the physical check that Increase will print and mail. This is
             * required if `fulfillment_method` is equal to `physical_check`. It must not be
             * included if any other `fulfillment_method` is provided.
             */
            fun physicalCheck(physicalCheck: PhysicalCheck) =
                physicalCheck(JsonField.of(physicalCheck))

            /**
             * Sets [Builder.physicalCheck] to an arbitrary JSON value.
             *
             * You should usually call [Builder.physicalCheck] with a well-typed [PhysicalCheck]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun physicalCheck(physicalCheck: JsonField<PhysicalCheck>) = apply {
                this.physicalCheck = physicalCheck
            }

            /** Whether the transfer requires explicit approval via the dashboard or API. */
            fun requireApproval(requireApproval: Boolean) =
                requireApproval(JsonField.of(requireApproval))

            /**
             * Sets [Builder.requireApproval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requireApproval] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requireApproval(requireApproval: JsonField<Boolean>) = apply {
                this.requireApproval = requireApproval
            }

            /**
             * Details relating to the custom fulfillment you will perform. This is required if
             * `fulfillment_method` is equal to `third_party`. It must not be included if any other
             * `fulfillment_method` is provided.
             */
            fun thirdParty(thirdParty: ThirdParty) = thirdParty(JsonField.of(thirdParty))

            /**
             * Sets [Builder.thirdParty] to an arbitrary JSON value.
             *
             * You should usually call [Builder.thirdParty] with a well-typed [ThirdParty] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun thirdParty(thirdParty: JsonField<ThirdParty>) = apply {
                this.thirdParty = thirdParty
            }

            /**
             * If provided, the check will be valid on or before this date. After this date, the
             * check transfer will be stopped and deposits will not be accepted. For checks printed
             * by Increase, this date is included on the check as its expiry.
             */
            fun validUntilDate(validUntilDate: LocalDate) =
                validUntilDate(JsonField.of(validUntilDate))

            /**
             * Sets [Builder.validUntilDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.validUntilDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun validUntilDate(validUntilDate: JsonField<LocalDate>) = apply {
                this.validUntilDate = validUntilDate
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * .amount()
             * .fulfillmentMethod()
             * .sourceAccountNumberId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountId", accountId),
                    checkRequired("amount", amount),
                    checkRequired("fulfillmentMethod", fulfillmentMethod),
                    checkRequired("sourceAccountNumberId", sourceAccountNumberId),
                    balanceCheck,
                    checkNumber,
                    physicalCheck,
                    requireApproval,
                    thirdParty,
                    validUntilDate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountId()
            amount()
            fulfillmentMethod().validate()
            sourceAccountNumberId()
            balanceCheck().ifPresent { it.validate() }
            checkNumber()
            physicalCheck().ifPresent { it.validate() }
            requireApproval()
            thirdParty().ifPresent { it.validate() }
            validUntilDate()
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
            (if (accountId.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (fulfillmentMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sourceAccountNumberId.asKnown().isPresent) 1 else 0) +
                (balanceCheck.asKnown().getOrNull()?.validity() ?: 0) +
                (if (checkNumber.asKnown().isPresent) 1 else 0) +
                (physicalCheck.asKnown().getOrNull()?.validity() ?: 0) +
                (if (requireApproval.asKnown().isPresent) 1 else 0) +
                (thirdParty.asKnown().getOrNull()?.validity() ?: 0) +
                (if (validUntilDate.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountId == other.accountId &&
                amount == other.amount &&
                fulfillmentMethod == other.fulfillmentMethod &&
                sourceAccountNumberId == other.sourceAccountNumberId &&
                balanceCheck == other.balanceCheck &&
                checkNumber == other.checkNumber &&
                physicalCheck == other.physicalCheck &&
                requireApproval == other.requireApproval &&
                thirdParty == other.thirdParty &&
                validUntilDate == other.validUntilDate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountId,
                amount,
                fulfillmentMethod,
                sourceAccountNumberId,
                balanceCheck,
                checkNumber,
                physicalCheck,
                requireApproval,
                thirdParty,
                validUntilDate,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountId=$accountId, amount=$amount, fulfillmentMethod=$fulfillmentMethod, sourceAccountNumberId=$sourceAccountNumberId, balanceCheck=$balanceCheck, checkNumber=$checkNumber, physicalCheck=$physicalCheck, requireApproval=$requireApproval, thirdParty=$thirdParty, validUntilDate=$validUntilDate, additionalProperties=$additionalProperties}"
    }

    /** Whether Increase will print and mail the check or if you will do it yourself. */
    class FulfillmentMethod @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            /** Increase will print and mail a physical check. */
            @JvmField val PHYSICAL_CHECK = of("physical_check")

            /**
             * Increase will not print a check; you are responsible for printing and mailing a check
             * with the provided account number, routing number, check number, and amount.
             */
            @JvmField val THIRD_PARTY = of("third_party")

            @JvmStatic fun of(value: String) = FulfillmentMethod(JsonField.of(value))
        }

        /** An enum containing [FulfillmentMethod]'s known values. */
        enum class Known {
            /** Increase will print and mail a physical check. */
            PHYSICAL_CHECK,
            /**
             * Increase will not print a check; you are responsible for printing and mailing a check
             * with the provided account number, routing number, check number, and amount.
             */
            THIRD_PARTY,
        }

        /**
         * An enum containing [FulfillmentMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FulfillmentMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Increase will print and mail a physical check. */
            PHYSICAL_CHECK,
            /**
             * Increase will not print a check; you are responsible for printing and mailing a check
             * with the provided account number, routing number, check number, and amount.
             */
            THIRD_PARTY,
            /**
             * An enum member indicating that [FulfillmentMethod] was instantiated with an unknown
             * value.
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
                PHYSICAL_CHECK -> Value.PHYSICAL_CHECK
                THIRD_PARTY -> Value.THIRD_PARTY
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
                PHYSICAL_CHECK -> Known.PHYSICAL_CHECK
                THIRD_PARTY -> Known.THIRD_PARTY
                else -> throw IncreaseInvalidDataException("Unknown FulfillmentMethod: $value")
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

        fun validate(): FulfillmentMethod = apply {
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

            return other is FulfillmentMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * How the account's available balance should be checked. If omitted, the default behavior is
     * `balance_check: full`.
     */
    class BalanceCheck @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            /**
             * The available balance of the account must be at least the amount of the check, and a
             * Pending Transaction will be created for the full amount. This is the default behavior
             * if `balance_check` is omitted.
             */
            @JvmField val FULL = of("full")

            /**
             * No balance check will performed when the check transfer is initiated. A zero-dollar
             * Pending Transaction will be created. The balance will still be checked when the
             * Inbound Check Deposit is created.
             */
            @JvmField val NONE = of("none")

            @JvmStatic fun of(value: String) = BalanceCheck(JsonField.of(value))
        }

        /** An enum containing [BalanceCheck]'s known values. */
        enum class Known {
            /**
             * The available balance of the account must be at least the amount of the check, and a
             * Pending Transaction will be created for the full amount. This is the default behavior
             * if `balance_check` is omitted.
             */
            FULL,
            /**
             * No balance check will performed when the check transfer is initiated. A zero-dollar
             * Pending Transaction will be created. The balance will still be checked when the
             * Inbound Check Deposit is created.
             */
            NONE,
        }

        /**
         * An enum containing [BalanceCheck]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BalanceCheck] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /**
             * The available balance of the account must be at least the amount of the check, and a
             * Pending Transaction will be created for the full amount. This is the default behavior
             * if `balance_check` is omitted.
             */
            FULL,
            /**
             * No balance check will performed when the check transfer is initiated. A zero-dollar
             * Pending Transaction will be created. The balance will still be checked when the
             * Inbound Check Deposit is created.
             */
            NONE,
            /**
             * An enum member indicating that [BalanceCheck] was instantiated with an unknown value.
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
                FULL -> Value.FULL
                NONE -> Value.NONE
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
                FULL -> Known.FULL
                NONE -> Known.NONE
                else -> throw IncreaseInvalidDataException("Unknown BalanceCheck: $value")
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

        fun validate(): BalanceCheck = apply {
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

            return other is BalanceCheck && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Details relating to the physical check that Increase will print and mail. This is required if
     * `fulfillment_method` is equal to `physical_check`. It must not be included if any other
     * `fulfillment_method` is provided.
     */
    class PhysicalCheck
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val mailingAddress: JsonField<MailingAddress>,
        private val memo: JsonField<String>,
        private val recipientName: JsonField<String>,
        private val attachmentFileId: JsonField<String>,
        private val note: JsonField<String>,
        private val payer: JsonField<List<Payer>>,
        private val returnAddress: JsonField<ReturnAddress>,
        private val shippingMethod: JsonField<ShippingMethod>,
        private val signatureText: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("mailing_address")
            @ExcludeMissing
            mailingAddress: JsonField<MailingAddress> = JsonMissing.of(),
            @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recipient_name")
            @ExcludeMissing
            recipientName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("attachment_file_id")
            @ExcludeMissing
            attachmentFileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("note") @ExcludeMissing note: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payer") @ExcludeMissing payer: JsonField<List<Payer>> = JsonMissing.of(),
            @JsonProperty("return_address")
            @ExcludeMissing
            returnAddress: JsonField<ReturnAddress> = JsonMissing.of(),
            @JsonProperty("shipping_method")
            @ExcludeMissing
            shippingMethod: JsonField<ShippingMethod> = JsonMissing.of(),
            @JsonProperty("signature_text")
            @ExcludeMissing
            signatureText: JsonField<String> = JsonMissing.of(),
        ) : this(
            mailingAddress,
            memo,
            recipientName,
            attachmentFileId,
            note,
            payer,
            returnAddress,
            shippingMethod,
            signatureText,
            mutableMapOf(),
        )

        /**
         * Details for where Increase will mail the check.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun mailingAddress(): MailingAddress = mailingAddress.getRequired("mailing_address")

        /**
         * The descriptor that will be printed on the memo field on the check.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun memo(): String = memo.getRequired("memo")

        /**
         * The name that will be printed on the check in the 'To:' field.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recipientName(): String = recipientName.getRequired("recipient_name")

        /**
         * The ID of a File to be attached to the check. This must have `purpose: check_attachment`.
         * For details on pricing and restrictions, see
         * https://increase.com/documentation/originating-checks#printing-checks .
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun attachmentFileId(): Optional<String> =
            attachmentFileId.getOptional("attachment_file_id")

        /**
         * The descriptor that will be printed on the letter included with the check.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun note(): Optional<String> = note.getOptional("note")

        /**
         * The payer of the check. This will be printed on the top-left portion of the check and
         * defaults to the return address if unspecified. This should be an array of up to 4
         * elements, each of which represents a line of the payer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun payer(): Optional<List<Payer>> = payer.getOptional("payer")

        /**
         * The return address to be printed on the check. If omitted this will default to an
         * Increase-owned address that will mark checks as delivery failed and shred them.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun returnAddress(): Optional<ReturnAddress> = returnAddress.getOptional("return_address")

        /**
         * How to ship the check. For details on pricing, timing, and restrictions, see
         * https://increase.com/documentation/originating-checks#printing-checks .
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun shippingMethod(): Optional<ShippingMethod> =
            shippingMethod.getOptional("shipping_method")

        /**
         * The text that will appear as the signature on the check in cursive font. If not provided,
         * the check will be printed with 'No signature required'.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun signatureText(): Optional<String> = signatureText.getOptional("signature_text")

        /**
         * Returns the raw JSON value of [mailingAddress].
         *
         * Unlike [mailingAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("mailing_address")
        @ExcludeMissing
        fun _mailingAddress(): JsonField<MailingAddress> = mailingAddress

        /**
         * Returns the raw JSON value of [memo].
         *
         * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        /**
         * Returns the raw JSON value of [recipientName].
         *
         * Unlike [recipientName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("recipient_name")
        @ExcludeMissing
        fun _recipientName(): JsonField<String> = recipientName

        /**
         * Returns the raw JSON value of [attachmentFileId].
         *
         * Unlike [attachmentFileId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("attachment_file_id")
        @ExcludeMissing
        fun _attachmentFileId(): JsonField<String> = attachmentFileId

        /**
         * Returns the raw JSON value of [note].
         *
         * Unlike [note], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("note") @ExcludeMissing fun _note(): JsonField<String> = note

        /**
         * Returns the raw JSON value of [payer].
         *
         * Unlike [payer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payer") @ExcludeMissing fun _payer(): JsonField<List<Payer>> = payer

        /**
         * Returns the raw JSON value of [returnAddress].
         *
         * Unlike [returnAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("return_address")
        @ExcludeMissing
        fun _returnAddress(): JsonField<ReturnAddress> = returnAddress

        /**
         * Returns the raw JSON value of [shippingMethod].
         *
         * Unlike [shippingMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("shipping_method")
        @ExcludeMissing
        fun _shippingMethod(): JsonField<ShippingMethod> = shippingMethod

        /**
         * Returns the raw JSON value of [signatureText].
         *
         * Unlike [signatureText], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("signature_text")
        @ExcludeMissing
        fun _signatureText(): JsonField<String> = signatureText

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
             * Returns a mutable builder for constructing an instance of [PhysicalCheck].
             *
             * The following fields are required:
             * ```java
             * .mailingAddress()
             * .memo()
             * .recipientName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PhysicalCheck]. */
        class Builder internal constructor() {

            private var mailingAddress: JsonField<MailingAddress>? = null
            private var memo: JsonField<String>? = null
            private var recipientName: JsonField<String>? = null
            private var attachmentFileId: JsonField<String> = JsonMissing.of()
            private var note: JsonField<String> = JsonMissing.of()
            private var payer: JsonField<MutableList<Payer>>? = null
            private var returnAddress: JsonField<ReturnAddress> = JsonMissing.of()
            private var shippingMethod: JsonField<ShippingMethod> = JsonMissing.of()
            private var signatureText: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(physicalCheck: PhysicalCheck) = apply {
                mailingAddress = physicalCheck.mailingAddress
                memo = physicalCheck.memo
                recipientName = physicalCheck.recipientName
                attachmentFileId = physicalCheck.attachmentFileId
                note = physicalCheck.note
                payer = physicalCheck.payer.map { it.toMutableList() }
                returnAddress = physicalCheck.returnAddress
                shippingMethod = physicalCheck.shippingMethod
                signatureText = physicalCheck.signatureText
                additionalProperties = physicalCheck.additionalProperties.toMutableMap()
            }

            /** Details for where Increase will mail the check. */
            fun mailingAddress(mailingAddress: MailingAddress) =
                mailingAddress(JsonField.of(mailingAddress))

            /**
             * Sets [Builder.mailingAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mailingAddress] with a well-typed [MailingAddress]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun mailingAddress(mailingAddress: JsonField<MailingAddress>) = apply {
                this.mailingAddress = mailingAddress
            }

            /** The descriptor that will be printed on the memo field on the check. */
            fun memo(memo: String) = memo(JsonField.of(memo))

            /**
             * Sets [Builder.memo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memo] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            /** The name that will be printed on the check in the 'To:' field. */
            fun recipientName(recipientName: String) = recipientName(JsonField.of(recipientName))

            /**
             * Sets [Builder.recipientName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipientName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recipientName(recipientName: JsonField<String>) = apply {
                this.recipientName = recipientName
            }

            /**
             * The ID of a File to be attached to the check. This must have `purpose:
             * check_attachment`. For details on pricing and restrictions, see
             * https://increase.com/documentation/originating-checks#printing-checks .
             */
            fun attachmentFileId(attachmentFileId: String) =
                attachmentFileId(JsonField.of(attachmentFileId))

            /**
             * Sets [Builder.attachmentFileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attachmentFileId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attachmentFileId(attachmentFileId: JsonField<String>) = apply {
                this.attachmentFileId = attachmentFileId
            }

            /** The descriptor that will be printed on the letter included with the check. */
            fun note(note: String) = note(JsonField.of(note))

            /**
             * Sets [Builder.note] to an arbitrary JSON value.
             *
             * You should usually call [Builder.note] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun note(note: JsonField<String>) = apply { this.note = note }

            /**
             * The payer of the check. This will be printed on the top-left portion of the check and
             * defaults to the return address if unspecified. This should be an array of up to 4
             * elements, each of which represents a line of the payer.
             */
            fun payer(payer: List<Payer>) = payer(JsonField.of(payer))

            /**
             * Sets [Builder.payer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payer] with a well-typed `List<Payer>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payer(payer: JsonField<List<Payer>>) = apply {
                this.payer = payer.map { it.toMutableList() }
            }

            /**
             * Adds a single [Payer] to [Builder.payer].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPayer(payer: Payer) = apply {
                this.payer =
                    (this.payer ?: JsonField.of(mutableListOf())).also {
                        checkKnown("payer", it).add(payer)
                    }
            }

            /**
             * The return address to be printed on the check. If omitted this will default to an
             * Increase-owned address that will mark checks as delivery failed and shred them.
             */
            fun returnAddress(returnAddress: ReturnAddress) =
                returnAddress(JsonField.of(returnAddress))

            /**
             * Sets [Builder.returnAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.returnAddress] with a well-typed [ReturnAddress]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun returnAddress(returnAddress: JsonField<ReturnAddress>) = apply {
                this.returnAddress = returnAddress
            }

            /**
             * How to ship the check. For details on pricing, timing, and restrictions, see
             * https://increase.com/documentation/originating-checks#printing-checks .
             */
            fun shippingMethod(shippingMethod: ShippingMethod) =
                shippingMethod(JsonField.of(shippingMethod))

            /**
             * Sets [Builder.shippingMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shippingMethod] with a well-typed [ShippingMethod]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun shippingMethod(shippingMethod: JsonField<ShippingMethod>) = apply {
                this.shippingMethod = shippingMethod
            }

            /**
             * The text that will appear as the signature on the check in cursive font. If not
             * provided, the check will be printed with 'No signature required'.
             */
            fun signatureText(signatureText: String) = signatureText(JsonField.of(signatureText))

            /**
             * Sets [Builder.signatureText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signatureText] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun signatureText(signatureText: JsonField<String>) = apply {
                this.signatureText = signatureText
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
             * Returns an immutable instance of [PhysicalCheck].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .mailingAddress()
             * .memo()
             * .recipientName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PhysicalCheck =
                PhysicalCheck(
                    checkRequired("mailingAddress", mailingAddress),
                    checkRequired("memo", memo),
                    checkRequired("recipientName", recipientName),
                    attachmentFileId,
                    note,
                    (payer ?: JsonMissing.of()).map { it.toImmutable() },
                    returnAddress,
                    shippingMethod,
                    signatureText,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PhysicalCheck = apply {
            if (validated) {
                return@apply
            }

            mailingAddress().validate()
            memo()
            recipientName()
            attachmentFileId()
            note()
            payer().ifPresent { it.forEach { it.validate() } }
            returnAddress().ifPresent { it.validate() }
            shippingMethod().ifPresent { it.validate() }
            signatureText()
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
            (mailingAddress.asKnown().getOrNull()?.validity() ?: 0) +
                (if (memo.asKnown().isPresent) 1 else 0) +
                (if (recipientName.asKnown().isPresent) 1 else 0) +
                (if (attachmentFileId.asKnown().isPresent) 1 else 0) +
                (if (note.asKnown().isPresent) 1 else 0) +
                (payer.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (returnAddress.asKnown().getOrNull()?.validity() ?: 0) +
                (shippingMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (signatureText.asKnown().isPresent) 1 else 0)

        /** Details for where Increase will mail the check. */
        class MailingAddress
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val city: JsonField<String>,
            private val line1: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val state: JsonField<String>,
            private val line2: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("postal_code")
                @ExcludeMissing
                postalCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
            ) : this(city, line1, postalCode, state, line2, mutableMapOf())

            /**
             * The city component of the check's destination address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun city(): String = city.getRequired("city")

            /**
             * The first line of the address component of the check's destination address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun line1(): String = line1.getRequired("line1")

            /**
             * The postal code component of the check's destination address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun postalCode(): String = postalCode.getRequired("postal_code")

            /**
             * The US state component of the check's destination address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun state(): String = state.getRequired("state")

            /**
             * The second line of the address component of the check's destination address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun line2(): Optional<String> = line2.getOptional("line2")

            /**
             * Returns the raw JSON value of [city].
             *
             * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /**
             * Returns the raw JSON value of [line1].
             *
             * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /**
             * Returns the raw JSON value of [postalCode].
             *
             * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

            /**
             * Returns the raw JSON value of [state].
             *
             * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            /**
             * Returns the raw JSON value of [line2].
             *
             * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
                 * Returns a mutable builder for constructing an instance of [MailingAddress].
                 *
                 * The following fields are required:
                 * ```java
                 * .city()
                 * .line1()
                 * .postalCode()
                 * .state()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [MailingAddress]. */
            class Builder internal constructor() {

                private var city: JsonField<String>? = null
                private var line1: JsonField<String>? = null
                private var postalCode: JsonField<String>? = null
                private var state: JsonField<String>? = null
                private var line2: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(mailingAddress: MailingAddress) = apply {
                    city = mailingAddress.city
                    line1 = mailingAddress.line1
                    postalCode = mailingAddress.postalCode
                    state = mailingAddress.state
                    line2 = mailingAddress.line2
                    additionalProperties = mailingAddress.additionalProperties.toMutableMap()
                }

                /** The city component of the check's destination address. */
                fun city(city: String) = city(JsonField.of(city))

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The first line of the address component of the check's destination address. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /**
                 * Sets [Builder.line1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line1] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The postal code component of the check's destination address. */
                fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                /**
                 * Sets [Builder.postalCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.postalCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /** The US state component of the check's destination address. */
                fun state(state: String) = state(JsonField.of(state))

                /**
                 * Sets [Builder.state] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.state] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The second line of the address component of the check's destination address. */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /**
                 * Sets [Builder.line2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line2] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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
                 * Returns an immutable instance of [MailingAddress].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .city()
                 * .line1()
                 * .postalCode()
                 * .state()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MailingAddress =
                    MailingAddress(
                        checkRequired("city", city),
                        checkRequired("line1", line1),
                        checkRequired("postalCode", postalCode),
                        checkRequired("state", state),
                        line2,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): MailingAddress = apply {
                if (validated) {
                    return@apply
                }

                city()
                line1()
                postalCode()
                state()
                line2()
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
                (if (city.asKnown().isPresent) 1 else 0) +
                    (if (line1.asKnown().isPresent) 1 else 0) +
                    (if (postalCode.asKnown().isPresent) 1 else 0) +
                    (if (state.asKnown().isPresent) 1 else 0) +
                    (if (line2.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MailingAddress &&
                    city == other.city &&
                    line1 == other.line1 &&
                    postalCode == other.postalCode &&
                    state == other.state &&
                    line2 == other.line2 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(city, line1, postalCode, state, line2, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MailingAddress{city=$city, line1=$line1, postalCode=$postalCode, state=$state, line2=$line2, additionalProperties=$additionalProperties}"
        }

        class Payer
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val contents: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("contents")
                @ExcludeMissing
                contents: JsonField<String> = JsonMissing.of()
            ) : this(contents, mutableMapOf())

            /**
             * The contents of the line.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun contents(): String = contents.getRequired("contents")

            /**
             * Returns the raw JSON value of [contents].
             *
             * Unlike [contents], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("contents") @ExcludeMissing fun _contents(): JsonField<String> = contents

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
                 * Returns a mutable builder for constructing an instance of [Payer].
                 *
                 * The following fields are required:
                 * ```java
                 * .contents()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Payer]. */
            class Builder internal constructor() {

                private var contents: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(payer: Payer) = apply {
                    contents = payer.contents
                    additionalProperties = payer.additionalProperties.toMutableMap()
                }

                /** The contents of the line. */
                fun contents(contents: String) = contents(JsonField.of(contents))

                /**
                 * Sets [Builder.contents] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contents] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contents(contents: JsonField<String>) = apply { this.contents = contents }

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
                 * Returns an immutable instance of [Payer].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .contents()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Payer =
                    Payer(checkRequired("contents", contents), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Payer = apply {
                if (validated) {
                    return@apply
                }

                contents()
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
            internal fun validity(): Int = (if (contents.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Payer &&
                    contents == other.contents &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(contents, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Payer{contents=$contents, additionalProperties=$additionalProperties}"
        }

        /**
         * The return address to be printed on the check. If omitted this will default to an
         * Increase-owned address that will mark checks as delivery failed and shred them.
         */
        class ReturnAddress
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val city: JsonField<String>,
            private val line1: JsonField<String>,
            private val name: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val state: JsonField<String>,
            private val line2: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("postal_code")
                @ExcludeMissing
                postalCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
            ) : this(city, line1, name, postalCode, state, line2, mutableMapOf())

            /**
             * The city of the return address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun city(): String = city.getRequired("city")

            /**
             * The first line of the return address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun line1(): String = line1.getRequired("line1")

            /**
             * The name of the return address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * The postal code of the return address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun postalCode(): String = postalCode.getRequired("postal_code")

            /**
             * The US state of the return address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun state(): String = state.getRequired("state")

            /**
             * The second line of the return address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun line2(): Optional<String> = line2.getOptional("line2")

            /**
             * Returns the raw JSON value of [city].
             *
             * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /**
             * Returns the raw JSON value of [line1].
             *
             * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [postalCode].
             *
             * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

            /**
             * Returns the raw JSON value of [state].
             *
             * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            /**
             * Returns the raw JSON value of [line2].
             *
             * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
                 * Returns a mutable builder for constructing an instance of [ReturnAddress].
                 *
                 * The following fields are required:
                 * ```java
                 * .city()
                 * .line1()
                 * .name()
                 * .postalCode()
                 * .state()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ReturnAddress]. */
            class Builder internal constructor() {

                private var city: JsonField<String>? = null
                private var line1: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var postalCode: JsonField<String>? = null
                private var state: JsonField<String>? = null
                private var line2: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(returnAddress: ReturnAddress) = apply {
                    city = returnAddress.city
                    line1 = returnAddress.line1
                    name = returnAddress.name
                    postalCode = returnAddress.postalCode
                    state = returnAddress.state
                    line2 = returnAddress.line2
                    additionalProperties = returnAddress.additionalProperties.toMutableMap()
                }

                /** The city of the return address. */
                fun city(city: String) = city(JsonField.of(city))

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The first line of the return address. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /**
                 * Sets [Builder.line1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line1] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The name of the return address. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The postal code of the return address. */
                fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                /**
                 * Sets [Builder.postalCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.postalCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /** The US state of the return address. */
                fun state(state: String) = state(JsonField.of(state))

                /**
                 * Sets [Builder.state] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.state] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The second line of the return address. */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /**
                 * Sets [Builder.line2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line2] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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
                 * Returns an immutable instance of [ReturnAddress].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .city()
                 * .line1()
                 * .name()
                 * .postalCode()
                 * .state()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ReturnAddress =
                    ReturnAddress(
                        checkRequired("city", city),
                        checkRequired("line1", line1),
                        checkRequired("name", name),
                        checkRequired("postalCode", postalCode),
                        checkRequired("state", state),
                        line2,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ReturnAddress = apply {
                if (validated) {
                    return@apply
                }

                city()
                line1()
                name()
                postalCode()
                state()
                line2()
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
                (if (city.asKnown().isPresent) 1 else 0) +
                    (if (line1.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (postalCode.asKnown().isPresent) 1 else 0) +
                    (if (state.asKnown().isPresent) 1 else 0) +
                    (if (line2.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ReturnAddress &&
                    city == other.city &&
                    line1 == other.line1 &&
                    name == other.name &&
                    postalCode == other.postalCode &&
                    state == other.state &&
                    line2 == other.line2 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(city, line1, name, postalCode, state, line2, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ReturnAddress{city=$city, line1=$line1, name=$name, postalCode=$postalCode, state=$state, line2=$line2, additionalProperties=$additionalProperties}"
        }

        /**
         * How to ship the check. For details on pricing, timing, and restrictions, see
         * https://increase.com/documentation/originating-checks#printing-checks .
         */
        class ShippingMethod
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

                /** USPS First Class */
                @JvmField val USPS_FIRST_CLASS = of("usps_first_class")

                /** FedEx Overnight */
                @JvmField val FEDEX_OVERNIGHT = of("fedex_overnight")

                @JvmStatic fun of(value: String) = ShippingMethod(JsonField.of(value))
            }

            /** An enum containing [ShippingMethod]'s known values. */
            enum class Known {
                /** USPS First Class */
                USPS_FIRST_CLASS,
                /** FedEx Overnight */
                FEDEX_OVERNIGHT,
            }

            /**
             * An enum containing [ShippingMethod]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ShippingMethod] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** USPS First Class */
                USPS_FIRST_CLASS,
                /** FedEx Overnight */
                FEDEX_OVERNIGHT,
                /**
                 * An enum member indicating that [ShippingMethod] was instantiated with an unknown
                 * value.
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
                    USPS_FIRST_CLASS -> Value.USPS_FIRST_CLASS
                    FEDEX_OVERNIGHT -> Value.FEDEX_OVERNIGHT
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
                    USPS_FIRST_CLASS -> Known.USPS_FIRST_CLASS
                    FEDEX_OVERNIGHT -> Known.FEDEX_OVERNIGHT
                    else -> throw IncreaseInvalidDataException("Unknown ShippingMethod: $value")
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

            fun validate(): ShippingMethod = apply {
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

                return other is ShippingMethod && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PhysicalCheck &&
                mailingAddress == other.mailingAddress &&
                memo == other.memo &&
                recipientName == other.recipientName &&
                attachmentFileId == other.attachmentFileId &&
                note == other.note &&
                payer == other.payer &&
                returnAddress == other.returnAddress &&
                shippingMethod == other.shippingMethod &&
                signatureText == other.signatureText &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                mailingAddress,
                memo,
                recipientName,
                attachmentFileId,
                note,
                payer,
                returnAddress,
                shippingMethod,
                signatureText,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PhysicalCheck{mailingAddress=$mailingAddress, memo=$memo, recipientName=$recipientName, attachmentFileId=$attachmentFileId, note=$note, payer=$payer, returnAddress=$returnAddress, shippingMethod=$shippingMethod, signatureText=$signatureText, additionalProperties=$additionalProperties}"
    }

    /**
     * Details relating to the custom fulfillment you will perform. This is required if
     * `fulfillment_method` is equal to `third_party`. It must not be included if any other
     * `fulfillment_method` is provided.
     */
    class ThirdParty
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val recipientName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("recipient_name")
            @ExcludeMissing
            recipientName: JsonField<String> = JsonMissing.of()
        ) : this(recipientName, mutableMapOf())

        /**
         * The pay-to name you will print on the check. If provided, this is used for
         * [Positive Pay](/documentation/positive-pay). If this is omitted, Increase will be unable
         * to validate the payer name when the check is deposited.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun recipientName(): Optional<String> = recipientName.getOptional("recipient_name")

        /**
         * Returns the raw JSON value of [recipientName].
         *
         * Unlike [recipientName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("recipient_name")
        @ExcludeMissing
        fun _recipientName(): JsonField<String> = recipientName

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

            /** Returns a mutable builder for constructing an instance of [ThirdParty]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ThirdParty]. */
        class Builder internal constructor() {

            private var recipientName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(thirdParty: ThirdParty) = apply {
                recipientName = thirdParty.recipientName
                additionalProperties = thirdParty.additionalProperties.toMutableMap()
            }

            /**
             * The pay-to name you will print on the check. If provided, this is used for
             * [Positive Pay](/documentation/positive-pay). If this is omitted, Increase will be
             * unable to validate the payer name when the check is deposited.
             */
            fun recipientName(recipientName: String) = recipientName(JsonField.of(recipientName))

            /**
             * Sets [Builder.recipientName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipientName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recipientName(recipientName: JsonField<String>) = apply {
                this.recipientName = recipientName
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
             * Returns an immutable instance of [ThirdParty].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ThirdParty = ThirdParty(recipientName, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): ThirdParty = apply {
            if (validated) {
                return@apply
            }

            recipientName()
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
        internal fun validity(): Int = (if (recipientName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ThirdParty &&
                recipientName == other.recipientName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(recipientName, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ThirdParty{recipientName=$recipientName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CheckTransferCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CheckTransferCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
