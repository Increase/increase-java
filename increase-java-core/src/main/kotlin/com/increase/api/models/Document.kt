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
 * Increase generates certain documents / forms automatically for your application; they can be
 * listed here. Currently the only supported document type is IRS Form 1099-INT.
 */
@JsonDeserialize(builder = Document.Builder::class)
@NoAutoDetect
class Document
private constructor(
    private val id: JsonField<String>,
    private val category: JsonField<Category>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val entityId: JsonField<String>,
    private val fileId: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The Document identifier. */
    fun id(): String = id.getRequired("id")

    /** The type of document. */
    fun category(): Category = category.getRequired("category")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Document was
     * created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The identifier of the Entity the document was generated for. */
    fun entityId(): Optional<String> = Optional.ofNullable(entityId.getNullable("entity_id"))

    /** The identifier of the File containing the Document's contents. */
    fun fileId(): String = fileId.getRequired("file_id")

    /**
     * A constant representing the object's type. For this resource it will always be `document`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Document identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The type of document. */
    @JsonProperty("category") @ExcludeMissing fun _category() = category

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Document was
     * created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The identifier of the Entity the document was generated for. */
    @JsonProperty("entity_id") @ExcludeMissing fun _entityId() = entityId

    /** The identifier of the File containing the Document's contents. */
    @JsonProperty("file_id") @ExcludeMissing fun _fileId() = fileId

    /**
     * A constant representing the object's type. For this resource it will always be `document`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            id()
            category()
            createdAt()
            entityId()
            fileId()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Document &&
            this.id == other.id &&
            this.category == other.category &&
            this.createdAt == other.createdAt &&
            this.entityId == other.entityId &&
            this.fileId == other.fileId &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    category,
                    createdAt,
                    entityId,
                    fileId,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Document{id=$id, category=$category, createdAt=$createdAt, entityId=$entityId, fileId=$fileId, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var category: JsonField<Category> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var entityId: JsonField<String> = JsonMissing.of()
        private var fileId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(document: Document) = apply {
            this.id = document.id
            this.category = document.category
            this.createdAt = document.createdAt
            this.entityId = document.entityId
            this.fileId = document.fileId
            this.type = document.type
            additionalProperties(document.additionalProperties)
        }

        /** The Document identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Document identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The type of document. */
        fun category(category: Category) = category(JsonField.of(category))

        /** The type of document. */
        @JsonProperty("category")
        @ExcludeMissing
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Document was
         * created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Document was
         * created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The identifier of the Entity the document was generated for. */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /** The identifier of the Entity the document was generated for. */
        @JsonProperty("entity_id")
        @ExcludeMissing
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        /** The identifier of the File containing the Document's contents. */
        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

        /** The identifier of the File containing the Document's contents. */
        @JsonProperty("file_id")
        @ExcludeMissing
        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `document`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `document`.
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

        fun build(): Document =
            Document(
                id,
                category,
                createdAt,
                entityId,
                fileId,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Category
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Category && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val ACCOUNT_OPENING_DISCLOSURES = Category(JsonField.of("account_opening_disclosures"))

            @JvmField
            val ANTI_MONEY_LAUNDERING_POLICY =
                Category(JsonField.of("anti_money_laundering_policy"))

            @JvmField
            val ANTI_MONEY_LAUNDERING_PROCEDURES =
                Category(JsonField.of("anti_money_laundering_procedures"))

            @JvmField val AUDIT_REPORT = Category(JsonField.of("audit_report"))

            @JvmField val BACKGROUND_CHECKS = Category(JsonField.of("background_checks"))

            @JvmField
            val BUSINESS_CONTINUITY_PLAN = Category(JsonField.of("business_continuity_plan"))

            @JvmField val COLLECTIONS_POLICY = Category(JsonField.of("collections_policy"))

            @JvmField val COMPLAINTS_POLICY = Category(JsonField.of("complaints_policy"))

            @JvmField val COMPLAINT_REPORT = Category(JsonField.of("complaint_report"))

            @JvmField val COMPLIANCE_REPORT = Category(JsonField.of("compliance_report"))

            @JvmField
            val COMPLIANCE_STAFFING_PLAN = Category(JsonField.of("compliance_staffing_plan"))

            @JvmField
            val COMPLIANCE_MANAGEMENT_SYSTEM_POLICY =
                Category(JsonField.of("compliance_management_system_policy"))

            @JvmField
            val CONSUMER_PRIVACY_NOTICE = Category(JsonField.of("consumer_privacy_notice"))

            @JvmField
            val CONSUMER_PROTECTION_POLICY = Category(JsonField.of("consumer_protection_policy"))

            @JvmField
            val CORPORATE_FORMATION_DOCUMENT =
                Category(JsonField.of("corporate_formation_document"))

            @JvmField
            val CREDIT_MONITORING_REPORT = Category(JsonField.of("credit_monitoring_report"))

            @JvmField
            val CUSTOMER_INFORMATION_PROGRAM_POLICY =
                Category(JsonField.of("customer_information_program_policy"))

            @JvmField
            val ELECTRONIC_FUNDS_TRANFER_ACT_POLICY =
                Category(JsonField.of("electronic_funds_tranfer_act_policy"))

            @JvmField val EMPLOYEE_OVERVIEW = Category(JsonField.of("employee_overview"))

            @JvmField
            val END_USER_TERMS_OF_SERVICE = Category(JsonField.of("end_user_terms_of_service"))

            @JvmField val E_SIGN_POLICY = Category(JsonField.of("e_sign_policy"))

            @JvmField val FINANCIAL_STATEMENT = Category(JsonField.of("financial_statement"))

            @JvmField val FORM_1099_INT = Category(JsonField.of("form_1099_int"))

            @JvmField
            val FRAUD_PREVENTION_POLICY = Category(JsonField.of("fraud_prevention_policy"))

            @JvmField
            val FUNDS_AVAILABILITY_POLICY = Category(JsonField.of("funds_availability_policy"))

            @JvmField
            val FUNDS_AVAILABILITY_DISCLOSURE =
                Category(JsonField.of("funds_availability_disclosure"))

            @JvmField val FUNDS_FLOW_DIAGRAM = Category(JsonField.of("funds_flow_diagram"))

            @JvmField
            val GRAMM_LEACH_BLILEY_ACT_POLICY =
                Category(JsonField.of("gramm_leach_bliley_act_policy"))

            @JvmField
            val INFORMATION_SECURITY_POLICY = Category(JsonField.of("information_security_policy"))

            @JvmField val INSURANCE_POLICY = Category(JsonField.of("insurance_policy"))

            @JvmField val INVESTOR_PRESENTATION = Category(JsonField.of("investor_presentation"))

            @JvmField
            val LOAN_APPLICATION_PROCESSING_POLICY =
                Category(JsonField.of("loan_application_processing_policy"))

            @JvmField val MANAGEMENT_BIOGRAPHY = Category(JsonField.of("management_biography"))

            @JvmField
            val MARKETING_AND_ADVERTISING_POLICY =
                Category(JsonField.of("marketing_and_advertising_policy"))

            @JvmField
            val NETWORK_SECURITY_DIAGRAM = Category(JsonField.of("network_security_diagram"))

            @JvmField
            val ONBOARDING_QUESTIONNAIRE = Category(JsonField.of("onboarding_questionnaire"))

            @JvmField
            val PENETRATION_TEST_REPORT = Category(JsonField.of("penetration_test_report"))

            @JvmField
            val PROGRAM_RISK_ASSESSMENT = Category(JsonField.of("program_risk_assessment"))

            @JvmField val SECURITY_AUDIT_REPORT = Category(JsonField.of("security_audit_report"))

            @JvmField val SERVICING_POLICY = Category(JsonField.of("servicing_policy"))

            @JvmField
            val TRANSACTION_MONITORING_REPORT =
                Category(JsonField.of("transaction_monitoring_report"))

            @JvmField
            val TRUTH_IN_SAVINGS_ACT_POLICY = Category(JsonField.of("truth_in_savings_act_policy"))

            @JvmField val UNDERWRITING_POLICY = Category(JsonField.of("underwriting_policy"))

            @JvmField val VENDOR_LIST = Category(JsonField.of("vendor_list"))

            @JvmField
            val VENDOR_MANAGEMENT_POLICY = Category(JsonField.of("vendor_management_policy"))

            @JvmField
            val VENDOR_RISK_MANAGEMENT_REPORT =
                Category(JsonField.of("vendor_risk_management_report"))

            @JvmField val VOLUME_FORECAST = Category(JsonField.of("volume_forecast"))

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
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
                else -> throw IncreaseInvalidDataException("Unknown Category: $value")
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

            @JvmField val DOCUMENT = Type(JsonField.of("document"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            DOCUMENT,
        }

        enum class Value {
            DOCUMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DOCUMENT -> Value.DOCUMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DOCUMENT -> Known.DOCUMENT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
