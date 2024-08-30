// File generated from our OpenAPI spec by Stainless.

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

class SimulationServiceImpl constructor(private val clientOptions: ClientOptions, ) : SimulationService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val accountTransfers: AccountTransferService by lazy { AccountTransferServiceImpl(clientOptions) }

    private val inboundAchTransfers: InboundAchTransferService by lazy { InboundAchTransferServiceImpl(clientOptions) }

    private val achTransfers: AchTransferService by lazy { AchTransferServiceImpl(clientOptions) }

    private val checkTransfers: CheckTransferService by lazy { CheckTransferServiceImpl(clientOptions) }

    private val inboundCheckDeposits: InboundCheckDepositService by lazy { InboundCheckDepositServiceImpl(clientOptions) }

    private val checkDeposits: CheckDepositService by lazy { CheckDepositServiceImpl(clientOptions) }

    private val inboundWireTransfers: InboundWireTransferService by lazy { InboundWireTransferServiceImpl(clientOptions) }

    private val wireTransfers: WireTransferService by lazy { WireTransferServiceImpl(clientOptions) }

    private val inboundWireDrawdownRequests: InboundWireDrawdownRequestService by lazy { InboundWireDrawdownRequestServiceImpl(clientOptions) }

    private val inboundRealTimePaymentsTransfers: InboundRealTimePaymentsTransferService by lazy { InboundRealTimePaymentsTransferServiceImpl(clientOptions) }

    private val inboundFundsHolds: InboundFundsHoldService by lazy { InboundFundsHoldServiceImpl(clientOptions) }

    private val realTimePaymentsTransfers: RealTimePaymentsTransferService by lazy { RealTimePaymentsTransferServiceImpl(clientOptions) }

    private val cardAuthorizations: CardAuthorizationService by lazy { CardAuthorizationServiceImpl(clientOptions) }

    private val cardSettlements: CardSettlementService by lazy { CardSettlementServiceImpl(clientOptions) }

    private val cardReversals: CardReversalService by lazy { CardReversalServiceImpl(clientOptions) }

    private val cardIncrements: CardIncrementService by lazy { CardIncrementServiceImpl(clientOptions) }

    private val cardAuthorizationExpirations: CardAuthorizationExpirationService by lazy { CardAuthorizationExpirationServiceImpl(clientOptions) }

    private val cardFuelConfirmations: CardFuelConfirmationService by lazy { CardFuelConfirmationServiceImpl(clientOptions) }

    private val cardRefunds: CardRefundService by lazy { CardRefundServiceImpl(clientOptions) }

    private val cardDisputes: CardDisputeService by lazy { CardDisputeServiceImpl(clientOptions) }

    private val digitalWalletTokenRequests: DigitalWalletTokenRequestService by lazy { DigitalWalletTokenRequestServiceImpl(clientOptions) }

    private val physicalCards: PhysicalCardService by lazy { PhysicalCardServiceImpl(clientOptions) }

    private val interestPayments: InterestPaymentService by lazy { InterestPaymentServiceImpl(clientOptions) }

    private val accountStatements: AccountStatementService by lazy { AccountStatementServiceImpl(clientOptions) }

    private val documents: DocumentService by lazy { DocumentServiceImpl(clientOptions) }

    private val inboundMailItems: InboundMailItemService by lazy { InboundMailItemServiceImpl(clientOptions) }

    private val programs: ProgramService by lazy { ProgramServiceImpl(clientOptions) }

    override fun accountTransfers(): AccountTransferService = accountTransfers

    override fun inboundAchTransfers(): InboundAchTransferService = inboundAchTransfers

    override fun achTransfers(): AchTransferService = achTransfers

    override fun checkTransfers(): CheckTransferService = checkTransfers

    override fun inboundCheckDeposits(): InboundCheckDepositService = inboundCheckDeposits

    override fun checkDeposits(): CheckDepositService = checkDeposits

    override fun inboundWireTransfers(): InboundWireTransferService = inboundWireTransfers

    override fun wireTransfers(): WireTransferService = wireTransfers

    override fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestService = inboundWireDrawdownRequests

    override fun inboundRealTimePaymentsTransfers(): InboundRealTimePaymentsTransferService = inboundRealTimePaymentsTransfers

    override fun inboundFundsHolds(): InboundFundsHoldService = inboundFundsHolds

    override fun realTimePaymentsTransfers(): RealTimePaymentsTransferService = realTimePaymentsTransfers

    override fun cardAuthorizations(): CardAuthorizationService = cardAuthorizations

    override fun cardSettlements(): CardSettlementService = cardSettlements

    override fun cardReversals(): CardReversalService = cardReversals

    override fun cardIncrements(): CardIncrementService = cardIncrements

    override fun cardAuthorizationExpirations(): CardAuthorizationExpirationService = cardAuthorizationExpirations

    override fun cardFuelConfirmations(): CardFuelConfirmationService = cardFuelConfirmations

    override fun cardRefunds(): CardRefundService = cardRefunds

    override fun cardDisputes(): CardDisputeService = cardDisputes

    override fun digitalWalletTokenRequests(): DigitalWalletTokenRequestService = digitalWalletTokenRequests

    override fun physicalCards(): PhysicalCardService = physicalCards

    override fun interestPayments(): InterestPaymentService = interestPayments

    override fun accountStatements(): AccountStatementService = accountStatements

    override fun documents(): DocumentService = documents

    override fun inboundMailItems(): InboundMailItemService = inboundMailItems

    override fun programs(): ProgramService = programs
}
