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

class DocumentListParams
constructor(
    private val cursor: String?,
    private val limit: Long?,
    private val entityId: String?,
    private val category: Category?,
    private val createdAt: CreatedAt?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun entityId(): Optional<String> = Optional.ofNullable(entityId)

    fun category(): Optional<Category> = Optional.ofNullable(category)

    fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.cursor?.let { params.put("cursor", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.entityId?.let { params.put("entity_id", listOf(it.toString())) }
        this.category?.forEachQueryParam { key, values -> params.put("category.$key", values) }
        this.createdAt?.forEachQueryParam { key, values -> params.put("created_at.$key", values) }
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

        return other is DocumentListParams &&
            this.cursor == other.cursor &&
            this.limit == other.limit &&
            this.entityId == other.entityId &&
            this.category == other.category &&
            this.createdAt == other.createdAt &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            cursor,
            limit,
            entityId,
            category,
            createdAt,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "DocumentListParams{cursor=$cursor, limit=$limit, entityId=$entityId, category=$category, createdAt=$createdAt, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cursor: String? = null
        private var limit: Long? = null
        private var entityId: String? = null
        private var category: Category? = null
        private var createdAt: CreatedAt? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(documentListParams: DocumentListParams) = apply {
            this.cursor = documentListParams.cursor
            this.limit = documentListParams.limit
            this.entityId = documentListParams.entityId
            this.category = documentListParams.category
            this.createdAt = documentListParams.createdAt
            additionalQueryParams(documentListParams.additionalQueryParams)
            additionalHeaders(documentListParams.additionalHeaders)
        }

        /** Return the page of entries after this one. */
        fun cursor(cursor: String) = apply { this.cursor = cursor }

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100 objects.
         */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Filter Documents to ones belonging to the specified Entity. */
        fun entityId(entityId: String) = apply { this.entityId = entityId }

        fun category(category: Category) = apply { this.category = category }

        fun createdAt(createdAt: CreatedAt) = apply { this.createdAt = createdAt }

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

        fun build(): DocumentListParams =
            DocumentListParams(
                cursor,
                limit,
                entityId,
                category,
                createdAt,
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
         * Filter Documents for those with the specified category or categories. For GET requests,
         * this should be encoded as a comma-delimited string, such as `?in=one,two,three`.
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
             * Filter Documents for those with the specified category or categories. For GET
             * requests, this should be encoded as a comma-delimited string, such as
             * `?in=one,two,three`.
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

                @JvmField
                val ACCOUNT_OPENING_DISCLOSURES = In(JsonField.of("account_opening_disclosures"))

                @JvmField
                val ANTI_MONEY_LAUNDERING_POLICY = In(JsonField.of("anti_money_laundering_policy"))

                @JvmField
                val ANTI_MONEY_LAUNDERING_PROCEDURES =
                    In(JsonField.of("anti_money_laundering_procedures"))

                @JvmField val AUDIT_REPORT = In(JsonField.of("audit_report"))

                @JvmField val BACKGROUND_CHECKS = In(JsonField.of("background_checks"))

                @JvmField
                val BUSINESS_CONTINUITY_PLAN = In(JsonField.of("business_continuity_plan"))

                @JvmField val COLLECTIONS_POLICY = In(JsonField.of("collections_policy"))

                @JvmField val COMPLAINTS_POLICY = In(JsonField.of("complaints_policy"))

                @JvmField val COMPLAINT_REPORT = In(JsonField.of("complaint_report"))

                @JvmField val COMPLIANCE_REPORT = In(JsonField.of("compliance_report"))

                @JvmField
                val COMPLIANCE_STAFFING_PLAN = In(JsonField.of("compliance_staffing_plan"))

                @JvmField
                val COMPLIANCE_MANAGEMENT_SYSTEM_POLICY =
                    In(JsonField.of("compliance_management_system_policy"))

                @JvmField val CONSUMER_PRIVACY_NOTICE = In(JsonField.of("consumer_privacy_notice"))

                @JvmField
                val CONSUMER_PROTECTION_POLICY = In(JsonField.of("consumer_protection_policy"))

                @JvmField
                val CORPORATE_FORMATION_DOCUMENT = In(JsonField.of("corporate_formation_document"))

                @JvmField
                val CREDIT_MONITORING_REPORT = In(JsonField.of("credit_monitoring_report"))

                @JvmField
                val CUSTOMER_INFORMATION_PROGRAM_POLICY =
                    In(JsonField.of("customer_information_program_policy"))

                @JvmField
                val ELECTRONIC_FUNDS_TRANFER_ACT_POLICY =
                    In(JsonField.of("electronic_funds_tranfer_act_policy"))

                @JvmField val EMPLOYEE_OVERVIEW = In(JsonField.of("employee_overview"))

                @JvmField
                val END_USER_TERMS_OF_SERVICE = In(JsonField.of("end_user_terms_of_service"))

                @JvmField val E_SIGN_POLICY = In(JsonField.of("e_sign_policy"))

                @JvmField val FINANCIAL_STATEMENT = In(JsonField.of("financial_statement"))

                @JvmField val FORM_1099_INT = In(JsonField.of("form_1099_int"))

                @JvmField val FRAUD_PREVENTION_POLICY = In(JsonField.of("fraud_prevention_policy"))

                @JvmField
                val FUNDS_AVAILABILITY_POLICY = In(JsonField.of("funds_availability_policy"))

                @JvmField
                val FUNDS_AVAILABILITY_DISCLOSURE =
                    In(JsonField.of("funds_availability_disclosure"))

                @JvmField val FUNDS_FLOW_DIAGRAM = In(JsonField.of("funds_flow_diagram"))

                @JvmField
                val GRAMM_LEACH_BLILEY_ACT_POLICY =
                    In(JsonField.of("gramm_leach_bliley_act_policy"))

                @JvmField
                val INFORMATION_SECURITY_POLICY = In(JsonField.of("information_security_policy"))

                @JvmField val INSURANCE_POLICY = In(JsonField.of("insurance_policy"))

                @JvmField val INVESTOR_PRESENTATION = In(JsonField.of("investor_presentation"))

                @JvmField
                val LOAN_APPLICATION_PROCESSING_POLICY =
                    In(JsonField.of("loan_application_processing_policy"))

                @JvmField val MANAGEMENT_BIOGRAPHY = In(JsonField.of("management_biography"))

                @JvmField
                val MARKETING_AND_ADVERTISING_POLICY =
                    In(JsonField.of("marketing_and_advertising_policy"))

                @JvmField
                val NETWORK_SECURITY_DIAGRAM = In(JsonField.of("network_security_diagram"))

                @JvmField
                val ONBOARDING_QUESTIONNAIRE = In(JsonField.of("onboarding_questionnaire"))

                @JvmField val PENETRATION_TEST_REPORT = In(JsonField.of("penetration_test_report"))

                @JvmField
                val PLATFORM_COMPLIANCE_METRICS_SUBMISSION =
                    In(JsonField.of("platform_compliance_metrics_submission"))

                @JvmField val PROGRAM_RISK_ASSESSMENT = In(JsonField.of("program_risk_assessment"))

                @JvmField val SECURITY_AUDIT_REPORT = In(JsonField.of("security_audit_report"))

                @JvmField val SERVICING_POLICY = In(JsonField.of("servicing_policy"))

                @JvmField
                val TRANSACTION_MONITORING_REPORT =
                    In(JsonField.of("transaction_monitoring_report"))

                @JvmField
                val TRUTH_IN_SAVINGS_ACT_POLICY = In(JsonField.of("truth_in_savings_act_policy"))

                @JvmField val UNDERWRITING_POLICY = In(JsonField.of("underwriting_policy"))

                @JvmField val VENDOR_LIST = In(JsonField.of("vendor_list"))

                @JvmField
                val VENDOR_MANAGEMENT_POLICY = In(JsonField.of("vendor_management_policy"))

                @JvmField
                val VENDOR_RISK_MANAGEMENT_REPORT =
                    In(JsonField.of("vendor_risk_management_report"))

                @JvmField val VOLUME_FORECAST = In(JsonField.of("volume_forecast"))

                @JvmStatic fun of(value: String) = In(JsonField.of(value))
            }

            enum class Known {
                ACCOUNT_OPENING_DISCLOSURES,
                ANTI_MONEY_LAUNDERING_POLICY,
                ANTI_MONEY_LAUNDERING_PROCEDURES,
                AUDIT_REPORT,
                BACKGROUND_CHECKS,
                BUSINESS_CONTINUITY_PLAN,
                COLLECTIONS_POLICY,
                COMPLAINTS_POLICY,
                COMPLAINT_REPORT,
                COMPLIANCE_REPORT,
                COMPLIANCE_STAFFING_PLAN,
                COMPLIANCE_MANAGEMENT_SYSTEM_POLICY,
                CONSUMER_PRIVACY_NOTICE,
                CONSUMER_PROTECTION_POLICY,
                CORPORATE_FORMATION_DOCUMENT,
                CREDIT_MONITORING_REPORT,
                CUSTOMER_INFORMATION_PROGRAM_POLICY,
                ELECTRONIC_FUNDS_TRANFER_ACT_POLICY,
                EMPLOYEE_OVERVIEW,
                END_USER_TERMS_OF_SERVICE,
                E_SIGN_POLICY,
                FINANCIAL_STATEMENT,
                FORM_1099_INT,
                FRAUD_PREVENTION_POLICY,
                FUNDS_AVAILABILITY_POLICY,
                FUNDS_AVAILABILITY_DISCLOSURE,
                FUNDS_FLOW_DIAGRAM,
                GRAMM_LEACH_BLILEY_ACT_POLICY,
                INFORMATION_SECURITY_POLICY,
                INSURANCE_POLICY,
                INVESTOR_PRESENTATION,
                LOAN_APPLICATION_PROCESSING_POLICY,
                MANAGEMENT_BIOGRAPHY,
                MARKETING_AND_ADVERTISING_POLICY,
                NETWORK_SECURITY_DIAGRAM,
                ONBOARDING_QUESTIONNAIRE,
                PENETRATION_TEST_REPORT,
                PLATFORM_COMPLIANCE_METRICS_SUBMISSION,
                PROGRAM_RISK_ASSESSMENT,
                SECURITY_AUDIT_REPORT,
                SERVICING_POLICY,
                TRANSACTION_MONITORING_REPORT,
                TRUTH_IN_SAVINGS_ACT_POLICY,
                UNDERWRITING_POLICY,
                VENDOR_LIST,
                VENDOR_MANAGEMENT_POLICY,
                VENDOR_RISK_MANAGEMENT_REPORT,
                VOLUME_FORECAST,
            }

            enum class Value {
                ACCOUNT_OPENING_DISCLOSURES,
                ANTI_MONEY_LAUNDERING_POLICY,
                ANTI_MONEY_LAUNDERING_PROCEDURES,
                AUDIT_REPORT,
                BACKGROUND_CHECKS,
                BUSINESS_CONTINUITY_PLAN,
                COLLECTIONS_POLICY,
                COMPLAINTS_POLICY,
                COMPLAINT_REPORT,
                COMPLIANCE_REPORT,
                COMPLIANCE_STAFFING_PLAN,
                COMPLIANCE_MANAGEMENT_SYSTEM_POLICY,
                CONSUMER_PRIVACY_NOTICE,
                CONSUMER_PROTECTION_POLICY,
                CORPORATE_FORMATION_DOCUMENT,
                CREDIT_MONITORING_REPORT,
                CUSTOMER_INFORMATION_PROGRAM_POLICY,
                ELECTRONIC_FUNDS_TRANFER_ACT_POLICY,
                EMPLOYEE_OVERVIEW,
                END_USER_TERMS_OF_SERVICE,
                E_SIGN_POLICY,
                FINANCIAL_STATEMENT,
                FORM_1099_INT,
                FRAUD_PREVENTION_POLICY,
                FUNDS_AVAILABILITY_POLICY,
                FUNDS_AVAILABILITY_DISCLOSURE,
                FUNDS_FLOW_DIAGRAM,
                GRAMM_LEACH_BLILEY_ACT_POLICY,
                INFORMATION_SECURITY_POLICY,
                INSURANCE_POLICY,
                INVESTOR_PRESENTATION,
                LOAN_APPLICATION_PROCESSING_POLICY,
                MANAGEMENT_BIOGRAPHY,
                MARKETING_AND_ADVERTISING_POLICY,
                NETWORK_SECURITY_DIAGRAM,
                ONBOARDING_QUESTIONNAIRE,
                PENETRATION_TEST_REPORT,
                PLATFORM_COMPLIANCE_METRICS_SUBMISSION,
                PROGRAM_RISK_ASSESSMENT,
                SECURITY_AUDIT_REPORT,
                SERVICING_POLICY,
                TRANSACTION_MONITORING_REPORT,
                TRUTH_IN_SAVINGS_ACT_POLICY,
                UNDERWRITING_POLICY,
                VENDOR_LIST,
                VENDOR_MANAGEMENT_POLICY,
                VENDOR_RISK_MANAGEMENT_REPORT,
                VOLUME_FORECAST,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCOUNT_OPENING_DISCLOSURES -> Value.ACCOUNT_OPENING_DISCLOSURES
                    ANTI_MONEY_LAUNDERING_POLICY -> Value.ANTI_MONEY_LAUNDERING_POLICY
                    ANTI_MONEY_LAUNDERING_PROCEDURES -> Value.ANTI_MONEY_LAUNDERING_PROCEDURES
                    AUDIT_REPORT -> Value.AUDIT_REPORT
                    BACKGROUND_CHECKS -> Value.BACKGROUND_CHECKS
                    BUSINESS_CONTINUITY_PLAN -> Value.BUSINESS_CONTINUITY_PLAN
                    COLLECTIONS_POLICY -> Value.COLLECTIONS_POLICY
                    COMPLAINTS_POLICY -> Value.COMPLAINTS_POLICY
                    COMPLAINT_REPORT -> Value.COMPLAINT_REPORT
                    COMPLIANCE_REPORT -> Value.COMPLIANCE_REPORT
                    COMPLIANCE_STAFFING_PLAN -> Value.COMPLIANCE_STAFFING_PLAN
                    COMPLIANCE_MANAGEMENT_SYSTEM_POLICY -> Value.COMPLIANCE_MANAGEMENT_SYSTEM_POLICY
                    CONSUMER_PRIVACY_NOTICE -> Value.CONSUMER_PRIVACY_NOTICE
                    CONSUMER_PROTECTION_POLICY -> Value.CONSUMER_PROTECTION_POLICY
                    CORPORATE_FORMATION_DOCUMENT -> Value.CORPORATE_FORMATION_DOCUMENT
                    CREDIT_MONITORING_REPORT -> Value.CREDIT_MONITORING_REPORT
                    CUSTOMER_INFORMATION_PROGRAM_POLICY -> Value.CUSTOMER_INFORMATION_PROGRAM_POLICY
                    ELECTRONIC_FUNDS_TRANFER_ACT_POLICY -> Value.ELECTRONIC_FUNDS_TRANFER_ACT_POLICY
                    EMPLOYEE_OVERVIEW -> Value.EMPLOYEE_OVERVIEW
                    END_USER_TERMS_OF_SERVICE -> Value.END_USER_TERMS_OF_SERVICE
                    E_SIGN_POLICY -> Value.E_SIGN_POLICY
                    FINANCIAL_STATEMENT -> Value.FINANCIAL_STATEMENT
                    FORM_1099_INT -> Value.FORM_1099_INT
                    FRAUD_PREVENTION_POLICY -> Value.FRAUD_PREVENTION_POLICY
                    FUNDS_AVAILABILITY_POLICY -> Value.FUNDS_AVAILABILITY_POLICY
                    FUNDS_AVAILABILITY_DISCLOSURE -> Value.FUNDS_AVAILABILITY_DISCLOSURE
                    FUNDS_FLOW_DIAGRAM -> Value.FUNDS_FLOW_DIAGRAM
                    GRAMM_LEACH_BLILEY_ACT_POLICY -> Value.GRAMM_LEACH_BLILEY_ACT_POLICY
                    INFORMATION_SECURITY_POLICY -> Value.INFORMATION_SECURITY_POLICY
                    INSURANCE_POLICY -> Value.INSURANCE_POLICY
                    INVESTOR_PRESENTATION -> Value.INVESTOR_PRESENTATION
                    LOAN_APPLICATION_PROCESSING_POLICY -> Value.LOAN_APPLICATION_PROCESSING_POLICY
                    MANAGEMENT_BIOGRAPHY -> Value.MANAGEMENT_BIOGRAPHY
                    MARKETING_AND_ADVERTISING_POLICY -> Value.MARKETING_AND_ADVERTISING_POLICY
                    NETWORK_SECURITY_DIAGRAM -> Value.NETWORK_SECURITY_DIAGRAM
                    ONBOARDING_QUESTIONNAIRE -> Value.ONBOARDING_QUESTIONNAIRE
                    PENETRATION_TEST_REPORT -> Value.PENETRATION_TEST_REPORT
                    PLATFORM_COMPLIANCE_METRICS_SUBMISSION ->
                        Value.PLATFORM_COMPLIANCE_METRICS_SUBMISSION
                    PROGRAM_RISK_ASSESSMENT -> Value.PROGRAM_RISK_ASSESSMENT
                    SECURITY_AUDIT_REPORT -> Value.SECURITY_AUDIT_REPORT
                    SERVICING_POLICY -> Value.SERVICING_POLICY
                    TRANSACTION_MONITORING_REPORT -> Value.TRANSACTION_MONITORING_REPORT
                    TRUTH_IN_SAVINGS_ACT_POLICY -> Value.TRUTH_IN_SAVINGS_ACT_POLICY
                    UNDERWRITING_POLICY -> Value.UNDERWRITING_POLICY
                    VENDOR_LIST -> Value.VENDOR_LIST
                    VENDOR_MANAGEMENT_POLICY -> Value.VENDOR_MANAGEMENT_POLICY
                    VENDOR_RISK_MANAGEMENT_REPORT -> Value.VENDOR_RISK_MANAGEMENT_REPORT
                    VOLUME_FORECAST -> Value.VOLUME_FORECAST
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCOUNT_OPENING_DISCLOSURES -> Known.ACCOUNT_OPENING_DISCLOSURES
                    ANTI_MONEY_LAUNDERING_POLICY -> Known.ANTI_MONEY_LAUNDERING_POLICY
                    ANTI_MONEY_LAUNDERING_PROCEDURES -> Known.ANTI_MONEY_LAUNDERING_PROCEDURES
                    AUDIT_REPORT -> Known.AUDIT_REPORT
                    BACKGROUND_CHECKS -> Known.BACKGROUND_CHECKS
                    BUSINESS_CONTINUITY_PLAN -> Known.BUSINESS_CONTINUITY_PLAN
                    COLLECTIONS_POLICY -> Known.COLLECTIONS_POLICY
                    COMPLAINTS_POLICY -> Known.COMPLAINTS_POLICY
                    COMPLAINT_REPORT -> Known.COMPLAINT_REPORT
                    COMPLIANCE_REPORT -> Known.COMPLIANCE_REPORT
                    COMPLIANCE_STAFFING_PLAN -> Known.COMPLIANCE_STAFFING_PLAN
                    COMPLIANCE_MANAGEMENT_SYSTEM_POLICY -> Known.COMPLIANCE_MANAGEMENT_SYSTEM_POLICY
                    CONSUMER_PRIVACY_NOTICE -> Known.CONSUMER_PRIVACY_NOTICE
                    CONSUMER_PROTECTION_POLICY -> Known.CONSUMER_PROTECTION_POLICY
                    CORPORATE_FORMATION_DOCUMENT -> Known.CORPORATE_FORMATION_DOCUMENT
                    CREDIT_MONITORING_REPORT -> Known.CREDIT_MONITORING_REPORT
                    CUSTOMER_INFORMATION_PROGRAM_POLICY -> Known.CUSTOMER_INFORMATION_PROGRAM_POLICY
                    ELECTRONIC_FUNDS_TRANFER_ACT_POLICY -> Known.ELECTRONIC_FUNDS_TRANFER_ACT_POLICY
                    EMPLOYEE_OVERVIEW -> Known.EMPLOYEE_OVERVIEW
                    END_USER_TERMS_OF_SERVICE -> Known.END_USER_TERMS_OF_SERVICE
                    E_SIGN_POLICY -> Known.E_SIGN_POLICY
                    FINANCIAL_STATEMENT -> Known.FINANCIAL_STATEMENT
                    FORM_1099_INT -> Known.FORM_1099_INT
                    FRAUD_PREVENTION_POLICY -> Known.FRAUD_PREVENTION_POLICY
                    FUNDS_AVAILABILITY_POLICY -> Known.FUNDS_AVAILABILITY_POLICY
                    FUNDS_AVAILABILITY_DISCLOSURE -> Known.FUNDS_AVAILABILITY_DISCLOSURE
                    FUNDS_FLOW_DIAGRAM -> Known.FUNDS_FLOW_DIAGRAM
                    GRAMM_LEACH_BLILEY_ACT_POLICY -> Known.GRAMM_LEACH_BLILEY_ACT_POLICY
                    INFORMATION_SECURITY_POLICY -> Known.INFORMATION_SECURITY_POLICY
                    INSURANCE_POLICY -> Known.INSURANCE_POLICY
                    INVESTOR_PRESENTATION -> Known.INVESTOR_PRESENTATION
                    LOAN_APPLICATION_PROCESSING_POLICY -> Known.LOAN_APPLICATION_PROCESSING_POLICY
                    MANAGEMENT_BIOGRAPHY -> Known.MANAGEMENT_BIOGRAPHY
                    MARKETING_AND_ADVERTISING_POLICY -> Known.MARKETING_AND_ADVERTISING_POLICY
                    NETWORK_SECURITY_DIAGRAM -> Known.NETWORK_SECURITY_DIAGRAM
                    ONBOARDING_QUESTIONNAIRE -> Known.ONBOARDING_QUESTIONNAIRE
                    PENETRATION_TEST_REPORT -> Known.PENETRATION_TEST_REPORT
                    PLATFORM_COMPLIANCE_METRICS_SUBMISSION ->
                        Known.PLATFORM_COMPLIANCE_METRICS_SUBMISSION
                    PROGRAM_RISK_ASSESSMENT -> Known.PROGRAM_RISK_ASSESSMENT
                    SECURITY_AUDIT_REPORT -> Known.SECURITY_AUDIT_REPORT
                    SERVICING_POLICY -> Known.SERVICING_POLICY
                    TRANSACTION_MONITORING_REPORT -> Known.TRANSACTION_MONITORING_REPORT
                    TRUTH_IN_SAVINGS_ACT_POLICY -> Known.TRUTH_IN_SAVINGS_ACT_POLICY
                    UNDERWRITING_POLICY -> Known.UNDERWRITING_POLICY
                    VENDOR_LIST -> Known.VENDOR_LIST
                    VENDOR_MANAGEMENT_POLICY -> Known.VENDOR_MANAGEMENT_POLICY
                    VENDOR_RISK_MANAGEMENT_REPORT -> Known.VENDOR_RISK_MANAGEMENT_REPORT
                    VOLUME_FORECAST -> Known.VOLUME_FORECAST
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
