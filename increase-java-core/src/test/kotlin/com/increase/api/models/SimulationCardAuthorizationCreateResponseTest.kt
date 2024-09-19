// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.models.SimulationCardAuthorizationCreateResponse

class SimulationCardAuthorizationCreateResponseTest {

    @Test
    fun createSimulationCardAuthorizationCreateResponse() {
      val simulationCardAuthorizationCreateResponse = SimulationCardAuthorizationCreateResponse.builder()
          .declinedTransaction(DeclinedTransaction.builder()
              .id("id")
              .accountId("account_id")
              .amount(123L)
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency(DeclinedTransaction.Currency.CAD)
              .description("description")
              .routeId("route_id")
              .routeType(DeclinedTransaction.RouteType.ACCOUNT_NUMBER)
              .source(DeclinedTransaction.Source.builder()
                  .achDecline(DeclinedTransaction.Source.AchDecline.builder()
                      .id("id")
                      .amount(123L)
                      .inboundAchTransferId("inbound_ach_transfer_id")
                      .originatorCompanyDescriptiveDate("originator_company_descriptive_date")
                      .originatorCompanyDiscretionaryData("originator_company_discretionary_data")
                      .originatorCompanyId("originator_company_id")
                      .originatorCompanyName("originator_company_name")
                      .reason(DeclinedTransaction.Source.AchDecline.Reason.ACH_ROUTE_CANCELED)
                      .receiverIdNumber("receiver_id_number")
                      .receiverName("receiver_name")
                      .traceNumber("trace_number")
                      .type(DeclinedTransaction.Source.AchDecline.Type.ACH_DECLINE)
                      .build())
                  .cardDecline(DeclinedTransaction.Source.CardDecline.builder()
                      .id("id")
                      .actioner(DeclinedTransaction.Source.CardDecline.Actioner.USER)
                      .amount(123L)
                      .cardPaymentId("card_payment_id")
                      .currency(DeclinedTransaction.Source.CardDecline.Currency.CAD)
                      .declinedTransactionId("declined_transaction_id")
                      .digitalWalletTokenId("digital_wallet_token_id")
                      .merchantAcceptorId("merchant_acceptor_id")
                      .merchantCategoryCode("merchant_category_code")
                      .merchantCity("merchant_city")
                      .merchantCountry("merchant_country")
                      .merchantDescriptor("merchant_descriptor")
                      .merchantPostalCode("merchant_postal_code")
                      .merchantState("merchant_state")
                      .networkDetails(DeclinedTransaction.Source.CardDecline.NetworkDetails.builder()
                          .category(DeclinedTransaction.Source.CardDecline.NetworkDetails.Category.VISA)
                          .visa(DeclinedTransaction.Source.CardDecline.NetworkDetails.Visa.builder()
                              .electronicCommerceIndicator(DeclinedTransaction.Source.CardDecline.NetworkDetails.Visa.ElectronicCommerceIndicator.MAIL_PHONE_ORDER)
                              .pointOfServiceEntryMode(DeclinedTransaction.Source.CardDecline.NetworkDetails.Visa.PointOfServiceEntryMode.UNKNOWN)
                              .build())
                          .build())
                      .networkIdentifiers(DeclinedTransaction.Source.CardDecline.NetworkIdentifiers.builder()
                          .retrievalReferenceNumber("retrieval_reference_number")
                          .traceNumber("trace_number")
                          .transactionId("transaction_id")
                          .build())
                      .networkRiskScore(123L)
                      .physicalCardId("physical_card_id")
                      .presentmentAmount(123L)
                      .presentmentCurrency("presentment_currency")
                      .processingCategory(DeclinedTransaction.Source.CardDecline.ProcessingCategory.ACCOUNT_FUNDING)
                      .realTimeDecisionId("real_time_decision_id")
                      .reason(DeclinedTransaction.Source.CardDecline.Reason.CARD_NOT_ACTIVE)
                      .verification(DeclinedTransaction.Source.CardDecline.Verification.builder()
                          .cardVerificationCode(DeclinedTransaction.Source.CardDecline.Verification.CardVerificationCode.builder()
                              .result(DeclinedTransaction.Source.CardDecline.Verification.CardVerificationCode.Result.NOT_CHECKED)
                              .build())
                          .cardholderAddress(DeclinedTransaction.Source.CardDecline.Verification.CardholderAddress.builder()
                              .actualLine1("actual_line1")
                              .actualPostalCode("actual_postal_code")
                              .providedLine1("provided_line1")
                              .providedPostalCode("provided_postal_code")
                              .result(DeclinedTransaction.Source.CardDecline.Verification.CardholderAddress.Result.NOT_CHECKED)
                              .build())
                          .build())
                      .build())
                  .category(DeclinedTransaction.Source.Category.ACH_DECLINE)
                  .checkDecline(DeclinedTransaction.Source.CheckDecline.builder()
                      .amount(123L)
                      .auxiliaryOnUs("auxiliary_on_us")
                      .backImageFileId("back_image_file_id")
                      .checkTransferId("check_transfer_id")
                      .frontImageFileId("front_image_file_id")
                      .inboundCheckDepositId("inbound_check_deposit_id")
                      .reason(DeclinedTransaction.Source.CheckDecline.Reason.ACH_ROUTE_DISABLED)
                      .build())
                  .checkDepositRejection(DeclinedTransaction.Source.CheckDepositRejection.builder()
                      .amount(123L)
                      .checkDepositId("check_deposit_id")
                      .currency(DeclinedTransaction.Source.CheckDepositRejection.Currency.CAD)
                      .declinedTransactionId("declined_transaction_id")
                      .reason(DeclinedTransaction.Source.CheckDepositRejection.Reason.INCOMPLETE_IMAGE)
                      .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                      .build())
                  .inboundRealTimePaymentsTransferDecline(DeclinedTransaction.Source.InboundRealTimePaymentsTransferDecline.builder()
                      .amount(123L)
                      .creditorName("creditor_name")
                      .currency(DeclinedTransaction.Source.InboundRealTimePaymentsTransferDecline.Currency.CAD)
                      .debtorAccountNumber("debtor_account_number")
                      .debtorName("debtor_name")
                      .debtorRoutingNumber("debtor_routing_number")
                      .reason(DeclinedTransaction.Source.InboundRealTimePaymentsTransferDecline.Reason.ACCOUNT_NUMBER_CANCELED)
                      .remittanceInformation("remittance_information")
                      .transactionIdentification("transaction_identification")
                      .transferId("transfer_id")
                      .build())
                  .other(JsonNull.of())
                  .wireDecline(DeclinedTransaction.Source.WireDecline.builder()
                      .inboundWireTransferId("inbound_wire_transfer_id")
                      .reason(DeclinedTransaction.Source.WireDecline.Reason.ACCOUNT_NUMBER_CANCELED)
                      .build())
                  .build())
              .type(DeclinedTransaction.Type.DECLINED_TRANSACTION)
              .build())
          .pendingTransaction(PendingTransaction.builder()
              .id("id")
              .accountId("account_id")
              .amount(123L)
              .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency(PendingTransaction.Currency.CAD)
              .description("description")
              .routeId("route_id")
              .routeType(PendingTransaction.RouteType.ACCOUNT_NUMBER)
              .source(PendingTransaction.Source.builder()
                  .accountTransferInstruction(PendingTransaction.Source.AccountTransferInstruction.builder()
                      .amount(123L)
                      .currency(PendingTransaction.Source.AccountTransferInstruction.Currency.CAD)
                      .transferId("transfer_id")
                      .build())
                  .achTransferInstruction(PendingTransaction.Source.AchTransferInstruction.builder()
                      .amount(123L)
                      .transferId("transfer_id")
                      .build())
                  .cardAuthorization(PendingTransaction.Source.CardAuthorization.builder()
                      .id("id")
                      .actioner(PendingTransaction.Source.CardAuthorization.Actioner.USER)
                      .amount(123L)
                      .cardPaymentId("card_payment_id")
                      .currency(PendingTransaction.Source.CardAuthorization.Currency.CAD)
                      .digitalWalletTokenId("digital_wallet_token_id")
                      .direction(PendingTransaction.Source.CardAuthorization.Direction.SETTLEMENT)
                      .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                      .merchantAcceptorId("merchant_acceptor_id")
                      .merchantCategoryCode("merchant_category_code")
                      .merchantCity("merchant_city")
                      .merchantCountry("merchant_country")
                      .merchantDescriptor("merchant_descriptor")
                      .merchantPostalCode("merchant_postal_code")
                      .merchantState("merchant_state")
                      .networkDetails(PendingTransaction.Source.CardAuthorization.NetworkDetails.builder()
                          .category(PendingTransaction.Source.CardAuthorization.NetworkDetails.Category.VISA)
                          .visa(PendingTransaction.Source.CardAuthorization.NetworkDetails.Visa.builder()
                              .electronicCommerceIndicator(PendingTransaction.Source.CardAuthorization.NetworkDetails.Visa.ElectronicCommerceIndicator.MAIL_PHONE_ORDER)
                              .pointOfServiceEntryMode(PendingTransaction.Source.CardAuthorization.NetworkDetails.Visa.PointOfServiceEntryMode.UNKNOWN)
                              .build())
                          .build())
                      .networkIdentifiers(PendingTransaction.Source.CardAuthorization.NetworkIdentifiers.builder()
                          .retrievalReferenceNumber("retrieval_reference_number")
                          .traceNumber("trace_number")
                          .transactionId("transaction_id")
                          .build())
                      .networkRiskScore(123L)
                      .pendingTransactionId("pending_transaction_id")
                      .physicalCardId("physical_card_id")
                      .presentmentAmount(123L)
                      .presentmentCurrency("presentment_currency")
                      .processingCategory(PendingTransaction.Source.CardAuthorization.ProcessingCategory.ACCOUNT_FUNDING)
                      .realTimeDecisionId("real_time_decision_id")
                      .type(PendingTransaction.Source.CardAuthorization.Type.CARD_AUTHORIZATION)
                      .verification(PendingTransaction.Source.CardAuthorization.Verification.builder()
                          .cardVerificationCode(PendingTransaction.Source.CardAuthorization.Verification.CardVerificationCode.builder()
                              .result(PendingTransaction.Source.CardAuthorization.Verification.CardVerificationCode.Result.NOT_CHECKED)
                              .build())
                          .cardholderAddress(PendingTransaction.Source.CardAuthorization.Verification.CardholderAddress.builder()
                              .actualLine1("actual_line1")
                              .actualPostalCode("actual_postal_code")
                              .providedLine1("provided_line1")
                              .providedPostalCode("provided_postal_code")
                              .result(PendingTransaction.Source.CardAuthorization.Verification.CardholderAddress.Result.NOT_CHECKED)
                              .build())
                          .build())
                      .build())
                  .category(PendingTransaction.Source.Category.ACCOUNT_TRANSFER_INSTRUCTION)
                  .checkDepositInstruction(PendingTransaction.Source.CheckDepositInstruction.builder()
                      .amount(123L)
                      .backImageFileId("back_image_file_id")
                      .checkDepositId("check_deposit_id")
                      .currency(PendingTransaction.Source.CheckDepositInstruction.Currency.CAD)
                      .frontImageFileId("front_image_file_id")
                      .build())
                  .checkTransferInstruction(PendingTransaction.Source.CheckTransferInstruction.builder()
                      .amount(123L)
                      .currency(PendingTransaction.Source.CheckTransferInstruction.Currency.CAD)
                      .transferId("transfer_id")
                      .build())
                  .inboundFundsHold(PendingTransaction.Source.InboundFundsHold.builder()
                      .id("id")
                      .amount(123L)
                      .automaticallyReleasesAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                      .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                      .currency(PendingTransaction.Source.InboundFundsHold.Currency.CAD)
                      .heldTransactionId("held_transaction_id")
                      .pendingTransactionId("pending_transaction_id")
                      .releasedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                      .status(PendingTransaction.Source.InboundFundsHold.Status.HELD)
                      .type(PendingTransaction.Source.InboundFundsHold.Type.INBOUND_FUNDS_HOLD)
                      .build())
                  .other(JsonNull.of())
                  .realTimePaymentsTransferInstruction(PendingTransaction.Source.RealTimePaymentsTransferInstruction.builder()
                      .amount(123L)
                      .transferId("transfer_id")
                      .build())
                  .wireTransferInstruction(PendingTransaction.Source.WireTransferInstruction.builder()
                      .accountNumber("account_number")
                      .amount(123L)
                      .messageToRecipient("message_to_recipient")
                      .routingNumber("routing_number")
                      .transferId("transfer_id")
                      .build())
                  .build())
              .status(PendingTransaction.Status.PENDING)
              .type(PendingTransaction.Type.PENDING_TRANSACTION)
              .build())
          .type(SimulationCardAuthorizationCreateResponse.Type.INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT)
          .build()
      assertThat(simulationCardAuthorizationCreateResponse).isNotNull
      assertThat(simulationCardAuthorizationCreateResponse.declinedTransaction()).contains(DeclinedTransaction.builder()
          .id("id")
          .accountId("account_id")
          .amount(123L)
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .currency(DeclinedTransaction.Currency.CAD)
          .description("description")
          .routeId("route_id")
          .routeType(DeclinedTransaction.RouteType.ACCOUNT_NUMBER)
          .source(DeclinedTransaction.Source.builder()
              .achDecline(DeclinedTransaction.Source.AchDecline.builder()
                  .id("id")
                  .amount(123L)
                  .inboundAchTransferId("inbound_ach_transfer_id")
                  .originatorCompanyDescriptiveDate("originator_company_descriptive_date")
                  .originatorCompanyDiscretionaryData("originator_company_discretionary_data")
                  .originatorCompanyId("originator_company_id")
                  .originatorCompanyName("originator_company_name")
                  .reason(DeclinedTransaction.Source.AchDecline.Reason.ACH_ROUTE_CANCELED)
                  .receiverIdNumber("receiver_id_number")
                  .receiverName("receiver_name")
                  .traceNumber("trace_number")
                  .type(DeclinedTransaction.Source.AchDecline.Type.ACH_DECLINE)
                  .build())
              .cardDecline(DeclinedTransaction.Source.CardDecline.builder()
                  .id("id")
                  .actioner(DeclinedTransaction.Source.CardDecline.Actioner.USER)
                  .amount(123L)
                  .cardPaymentId("card_payment_id")
                  .currency(DeclinedTransaction.Source.CardDecline.Currency.CAD)
                  .declinedTransactionId("declined_transaction_id")
                  .digitalWalletTokenId("digital_wallet_token_id")
                  .merchantAcceptorId("merchant_acceptor_id")
                  .merchantCategoryCode("merchant_category_code")
                  .merchantCity("merchant_city")
                  .merchantCountry("merchant_country")
                  .merchantDescriptor("merchant_descriptor")
                  .merchantPostalCode("merchant_postal_code")
                  .merchantState("merchant_state")
                  .networkDetails(DeclinedTransaction.Source.CardDecline.NetworkDetails.builder()
                      .category(DeclinedTransaction.Source.CardDecline.NetworkDetails.Category.VISA)
                      .visa(DeclinedTransaction.Source.CardDecline.NetworkDetails.Visa.builder()
                          .electronicCommerceIndicator(DeclinedTransaction.Source.CardDecline.NetworkDetails.Visa.ElectronicCommerceIndicator.MAIL_PHONE_ORDER)
                          .pointOfServiceEntryMode(DeclinedTransaction.Source.CardDecline.NetworkDetails.Visa.PointOfServiceEntryMode.UNKNOWN)
                          .build())
                      .build())
                  .networkIdentifiers(DeclinedTransaction.Source.CardDecline.NetworkIdentifiers.builder()
                      .retrievalReferenceNumber("retrieval_reference_number")
                      .traceNumber("trace_number")
                      .transactionId("transaction_id")
                      .build())
                  .networkRiskScore(123L)
                  .physicalCardId("physical_card_id")
                  .presentmentAmount(123L)
                  .presentmentCurrency("presentment_currency")
                  .processingCategory(DeclinedTransaction.Source.CardDecline.ProcessingCategory.ACCOUNT_FUNDING)
                  .realTimeDecisionId("real_time_decision_id")
                  .reason(DeclinedTransaction.Source.CardDecline.Reason.CARD_NOT_ACTIVE)
                  .verification(DeclinedTransaction.Source.CardDecline.Verification.builder()
                      .cardVerificationCode(DeclinedTransaction.Source.CardDecline.Verification.CardVerificationCode.builder()
                          .result(DeclinedTransaction.Source.CardDecline.Verification.CardVerificationCode.Result.NOT_CHECKED)
                          .build())
                      .cardholderAddress(DeclinedTransaction.Source.CardDecline.Verification.CardholderAddress.builder()
                          .actualLine1("actual_line1")
                          .actualPostalCode("actual_postal_code")
                          .providedLine1("provided_line1")
                          .providedPostalCode("provided_postal_code")
                          .result(DeclinedTransaction.Source.CardDecline.Verification.CardholderAddress.Result.NOT_CHECKED)
                          .build())
                      .build())
                  .build())
              .category(DeclinedTransaction.Source.Category.ACH_DECLINE)
              .checkDecline(DeclinedTransaction.Source.CheckDecline.builder()
                  .amount(123L)
                  .auxiliaryOnUs("auxiliary_on_us")
                  .backImageFileId("back_image_file_id")
                  .checkTransferId("check_transfer_id")
                  .frontImageFileId("front_image_file_id")
                  .inboundCheckDepositId("inbound_check_deposit_id")
                  .reason(DeclinedTransaction.Source.CheckDecline.Reason.ACH_ROUTE_DISABLED)
                  .build())
              .checkDepositRejection(DeclinedTransaction.Source.CheckDepositRejection.builder()
                  .amount(123L)
                  .checkDepositId("check_deposit_id")
                  .currency(DeclinedTransaction.Source.CheckDepositRejection.Currency.CAD)
                  .declinedTransactionId("declined_transaction_id")
                  .reason(DeclinedTransaction.Source.CheckDepositRejection.Reason.INCOMPLETE_IMAGE)
                  .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .build())
              .inboundRealTimePaymentsTransferDecline(DeclinedTransaction.Source.InboundRealTimePaymentsTransferDecline.builder()
                  .amount(123L)
                  .creditorName("creditor_name")
                  .currency(DeclinedTransaction.Source.InboundRealTimePaymentsTransferDecline.Currency.CAD)
                  .debtorAccountNumber("debtor_account_number")
                  .debtorName("debtor_name")
                  .debtorRoutingNumber("debtor_routing_number")
                  .reason(DeclinedTransaction.Source.InboundRealTimePaymentsTransferDecline.Reason.ACCOUNT_NUMBER_CANCELED)
                  .remittanceInformation("remittance_information")
                  .transactionIdentification("transaction_identification")
                  .transferId("transfer_id")
                  .build())
              .other(JsonNull.of())
              .wireDecline(DeclinedTransaction.Source.WireDecline.builder()
                  .inboundWireTransferId("inbound_wire_transfer_id")
                  .reason(DeclinedTransaction.Source.WireDecline.Reason.ACCOUNT_NUMBER_CANCELED)
                  .build())
              .build())
          .type(DeclinedTransaction.Type.DECLINED_TRANSACTION)
          .build())
      assertThat(simulationCardAuthorizationCreateResponse.pendingTransaction()).contains(PendingTransaction.builder()
          .id("id")
          .accountId("account_id")
          .amount(123L)
          .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .currency(PendingTransaction.Currency.CAD)
          .description("description")
          .routeId("route_id")
          .routeType(PendingTransaction.RouteType.ACCOUNT_NUMBER)
          .source(PendingTransaction.Source.builder()
              .accountTransferInstruction(PendingTransaction.Source.AccountTransferInstruction.builder()
                  .amount(123L)
                  .currency(PendingTransaction.Source.AccountTransferInstruction.Currency.CAD)
                  .transferId("transfer_id")
                  .build())
              .achTransferInstruction(PendingTransaction.Source.AchTransferInstruction.builder()
                  .amount(123L)
                  .transferId("transfer_id")
                  .build())
              .cardAuthorization(PendingTransaction.Source.CardAuthorization.builder()
                  .id("id")
                  .actioner(PendingTransaction.Source.CardAuthorization.Actioner.USER)
                  .amount(123L)
                  .cardPaymentId("card_payment_id")
                  .currency(PendingTransaction.Source.CardAuthorization.Currency.CAD)
                  .digitalWalletTokenId("digital_wallet_token_id")
                  .direction(PendingTransaction.Source.CardAuthorization.Direction.SETTLEMENT)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .merchantAcceptorId("merchant_acceptor_id")
                  .merchantCategoryCode("merchant_category_code")
                  .merchantCity("merchant_city")
                  .merchantCountry("merchant_country")
                  .merchantDescriptor("merchant_descriptor")
                  .merchantPostalCode("merchant_postal_code")
                  .merchantState("merchant_state")
                  .networkDetails(PendingTransaction.Source.CardAuthorization.NetworkDetails.builder()
                      .category(PendingTransaction.Source.CardAuthorization.NetworkDetails.Category.VISA)
                      .visa(PendingTransaction.Source.CardAuthorization.NetworkDetails.Visa.builder()
                          .electronicCommerceIndicator(PendingTransaction.Source.CardAuthorization.NetworkDetails.Visa.ElectronicCommerceIndicator.MAIL_PHONE_ORDER)
                          .pointOfServiceEntryMode(PendingTransaction.Source.CardAuthorization.NetworkDetails.Visa.PointOfServiceEntryMode.UNKNOWN)
                          .build())
                      .build())
                  .networkIdentifiers(PendingTransaction.Source.CardAuthorization.NetworkIdentifiers.builder()
                      .retrievalReferenceNumber("retrieval_reference_number")
                      .traceNumber("trace_number")
                      .transactionId("transaction_id")
                      .build())
                  .networkRiskScore(123L)
                  .pendingTransactionId("pending_transaction_id")
                  .physicalCardId("physical_card_id")
                  .presentmentAmount(123L)
                  .presentmentCurrency("presentment_currency")
                  .processingCategory(PendingTransaction.Source.CardAuthorization.ProcessingCategory.ACCOUNT_FUNDING)
                  .realTimeDecisionId("real_time_decision_id")
                  .type(PendingTransaction.Source.CardAuthorization.Type.CARD_AUTHORIZATION)
                  .verification(PendingTransaction.Source.CardAuthorization.Verification.builder()
                      .cardVerificationCode(PendingTransaction.Source.CardAuthorization.Verification.CardVerificationCode.builder()
                          .result(PendingTransaction.Source.CardAuthorization.Verification.CardVerificationCode.Result.NOT_CHECKED)
                          .build())
                      .cardholderAddress(PendingTransaction.Source.CardAuthorization.Verification.CardholderAddress.builder()
                          .actualLine1("actual_line1")
                          .actualPostalCode("actual_postal_code")
                          .providedLine1("provided_line1")
                          .providedPostalCode("provided_postal_code")
                          .result(PendingTransaction.Source.CardAuthorization.Verification.CardholderAddress.Result.NOT_CHECKED)
                          .build())
                      .build())
                  .build())
              .category(PendingTransaction.Source.Category.ACCOUNT_TRANSFER_INSTRUCTION)
              .checkDepositInstruction(PendingTransaction.Source.CheckDepositInstruction.builder()
                  .amount(123L)
                  .backImageFileId("back_image_file_id")
                  .checkDepositId("check_deposit_id")
                  .currency(PendingTransaction.Source.CheckDepositInstruction.Currency.CAD)
                  .frontImageFileId("front_image_file_id")
                  .build())
              .checkTransferInstruction(PendingTransaction.Source.CheckTransferInstruction.builder()
                  .amount(123L)
                  .currency(PendingTransaction.Source.CheckTransferInstruction.Currency.CAD)
                  .transferId("transfer_id")
                  .build())
              .inboundFundsHold(PendingTransaction.Source.InboundFundsHold.builder()
                  .id("id")
                  .amount(123L)
                  .automaticallyReleasesAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .currency(PendingTransaction.Source.InboundFundsHold.Currency.CAD)
                  .heldTransactionId("held_transaction_id")
                  .pendingTransactionId("pending_transaction_id")
                  .releasedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .status(PendingTransaction.Source.InboundFundsHold.Status.HELD)
                  .type(PendingTransaction.Source.InboundFundsHold.Type.INBOUND_FUNDS_HOLD)
                  .build())
              .other(JsonNull.of())
              .realTimePaymentsTransferInstruction(PendingTransaction.Source.RealTimePaymentsTransferInstruction.builder()
                  .amount(123L)
                  .transferId("transfer_id")
                  .build())
              .wireTransferInstruction(PendingTransaction.Source.WireTransferInstruction.builder()
                  .accountNumber("account_number")
                  .amount(123L)
                  .messageToRecipient("message_to_recipient")
                  .routingNumber("routing_number")
                  .transferId("transfer_id")
                  .build())
              .build())
          .status(PendingTransaction.Status.PENDING)
          .type(PendingTransaction.Type.PENDING_TRANSACTION)
          .build())
      assertThat(simulationCardAuthorizationCreateResponse.type()).isEqualTo(SimulationCardAuthorizationCreateResponse.Type.INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT)
    }
}
