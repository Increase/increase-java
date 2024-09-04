// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.increase.api.core.Enum
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.core.ClientOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.BinaryResponseContent
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.errors.IncreaseError
import com.increase.api.services.emptyHandler
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.multipartFormData
import com.increase.api.services.stringHandler
import com.increase.api.services.binaryHandler
import com.increase.api.services.withErrorHandler
import com.increase.api.services.blocking.simulations.AccountTransferService
import com.increase.api.services.blocking.simulations.AccountTransferServiceImpl
import com.increase.api.services.blocking.simulations.InboundAchTransferService
import com.increase.api.services.blocking.simulations.InboundAchTransferServiceImpl
import com.increase.api.services.blocking.simulations.AchTransferService
import com.increase.api.services.blocking.simulations.AchTransferServiceImpl
import com.increase.api.services.blocking.simulations.CheckTransferService
import com.increase.api.services.blocking.simulations.CheckTransferServiceImpl
import com.increase.api.services.blocking.simulations.InboundCheckDepositService
import com.increase.api.services.blocking.simulations.InboundCheckDepositServiceImpl
import com.increase.api.services.blocking.simulations.CheckDepositService
import com.increase.api.services.blocking.simulations.CheckDepositServiceImpl
import com.increase.api.services.blocking.simulations.InboundWireTransferService
import com.increase.api.services.blocking.simulations.InboundWireTransferServiceImpl
import com.increase.api.services.blocking.simulations.WireTransferService
import com.increase.api.services.blocking.simulations.WireTransferServiceImpl
import com.increase.api.services.blocking.simulations.InboundWireDrawdownRequestService
import com.increase.api.services.blocking.simulations.InboundWireDrawdownRequestServiceImpl
import com.increase.api.services.blocking.simulations.InboundRealTimePaymentsTransferService
import com.increase.api.services.blocking.simulations.InboundRealTimePaymentsTransferServiceImpl
import com.increase.api.services.blocking.simulations.InboundFundsHoldService
import com.increase.api.services.blocking.simulations.InboundFundsHoldServiceImpl
import com.increase.api.services.blocking.simulations.RealTimePaymentsTransferService
import com.increase.api.services.blocking.simulations.RealTimePaymentsTransferServiceImpl
import com.increase.api.services.blocking.simulations.CardAuthorizationService
import com.increase.api.services.blocking.simulations.CardAuthorizationServiceImpl
import com.increase.api.services.blocking.simulations.CardSettlementService
import com.increase.api.services.blocking.simulations.CardSettlementServiceImpl
import com.increase.api.services.blocking.simulations.CardReversalService
import com.increase.api.services.blocking.simulations.CardReversalServiceImpl
import com.increase.api.services.blocking.simulations.CardIncrementService
import com.increase.api.services.blocking.simulations.CardIncrementServiceImpl
import com.increase.api.services.blocking.simulations.CardAuthorizationExpirationService
import com.increase.api.services.blocking.simulations.CardAuthorizationExpirationServiceImpl
import com.increase.api.services.blocking.simulations.CardFuelConfirmationService
import com.increase.api.services.blocking.simulations.CardFuelConfirmationServiceImpl
import com.increase.api.services.blocking.simulations.CardRefundService
import com.increase.api.services.blocking.simulations.CardRefundServiceImpl
import com.increase.api.services.blocking.simulations.CardDisputeService
import com.increase.api.services.blocking.simulations.CardDisputeServiceImpl
import com.increase.api.services.blocking.simulations.DigitalWalletTokenRequestService
import com.increase.api.services.blocking.simulations.DigitalWalletTokenRequestServiceImpl
import com.increase.api.services.blocking.simulations.PhysicalCardService
import com.increase.api.services.blocking.simulations.PhysicalCardServiceImpl
import com.increase.api.services.blocking.simulations.InterestPaymentService
import com.increase.api.services.blocking.simulations.InterestPaymentServiceImpl
import com.increase.api.services.blocking.simulations.AccountStatementService
import com.increase.api.services.blocking.simulations.AccountStatementServiceImpl
import com.increase.api.services.blocking.simulations.DocumentService
import com.increase.api.services.blocking.simulations.DocumentServiceImpl
import com.increase.api.services.blocking.simulations.InboundMailItemService
import com.increase.api.services.blocking.simulations.InboundMailItemServiceImpl
import com.increase.api.services.blocking.simulations.ProgramService
import com.increase.api.services.blocking.simulations.ProgramServiceImpl

interface SimulationService {

    fun accountTransfers(): AccountTransferService

    fun inboundAchTransfers(): InboundAchTransferService

    fun achTransfers(): AchTransferService

    fun checkTransfers(): CheckTransferService

    fun inboundCheckDeposits(): InboundCheckDepositService

    fun checkDeposits(): CheckDepositService

    fun inboundWireTransfers(): InboundWireTransferService

    fun wireTransfers(): WireTransferService

    fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestService

    fun inboundRealTimePaymentsTransfers(): InboundRealTimePaymentsTransferService

    fun inboundFundsHolds(): InboundFundsHoldService

    fun realTimePaymentsTransfers(): RealTimePaymentsTransferService

    fun cardAuthorizations(): CardAuthorizationService

    fun cardSettlements(): CardSettlementService

    fun cardReversals(): CardReversalService

    fun cardIncrements(): CardIncrementService

    fun cardAuthorizationExpirations(): CardAuthorizationExpirationService

    fun cardFuelConfirmations(): CardFuelConfirmationService

    fun cardRefunds(): CardRefundService

    fun cardDisputes(): CardDisputeService

    fun digitalWalletTokenRequests(): DigitalWalletTokenRequestService

    fun physicalCards(): PhysicalCardService

    fun interestPayments(): InterestPaymentService

    fun accountStatements(): AccountStatementService

    fun documents(): DocumentService

    fun inboundMailItems(): InboundMailItemService

    fun programs(): ProgramService
}
