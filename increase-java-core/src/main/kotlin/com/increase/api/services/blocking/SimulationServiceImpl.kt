package com.increase.api.services.blocking

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.core.ClientOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.JsonField
import com.increase.api.core.RequestOptions
import com.increase.api.errors.IncreaseError
import com.increase.api.services.emptyHandler
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.stringHandler
import com.increase.api.services.withErrorHandler
import com.increase.api.services.blocking.simulations.AccountTransferService
import com.increase.api.services.blocking.simulations.AccountTransferServiceImpl
import com.increase.api.services.blocking.simulations.AccountStatementService
import com.increase.api.services.blocking.simulations.AccountStatementServiceImpl
import com.increase.api.services.blocking.simulations.AchTransferService
import com.increase.api.services.blocking.simulations.AchTransferServiceImpl
import com.increase.api.services.blocking.simulations.CardDisputeService
import com.increase.api.services.blocking.simulations.CardDisputeServiceImpl
import com.increase.api.services.blocking.simulations.CardRefundService
import com.increase.api.services.blocking.simulations.CardRefundServiceImpl
import com.increase.api.services.blocking.simulations.CheckTransferService
import com.increase.api.services.blocking.simulations.CheckTransferServiceImpl
import com.increase.api.services.blocking.simulations.DocumentService
import com.increase.api.services.blocking.simulations.DocumentServiceImpl
import com.increase.api.services.blocking.simulations.DigitalWalletTokenRequestService
import com.increase.api.services.blocking.simulations.DigitalWalletTokenRequestServiceImpl
import com.increase.api.services.blocking.simulations.CheckDepositService
import com.increase.api.services.blocking.simulations.CheckDepositServiceImpl
import com.increase.api.services.blocking.simulations.InboundWireDrawdownRequestService
import com.increase.api.services.blocking.simulations.InboundWireDrawdownRequestServiceImpl
import com.increase.api.services.blocking.simulations.WireTransferService
import com.increase.api.services.blocking.simulations.WireTransferServiceImpl
import com.increase.api.services.blocking.simulations.CardService
import com.increase.api.services.blocking.simulations.CardServiceImpl
import com.increase.api.services.blocking.simulations.RealTimePaymentsTransferService
import com.increase.api.services.blocking.simulations.RealTimePaymentsTransferServiceImpl

class SimulationServiceImpl constructor(private val clientOptions: ClientOptions,) : SimulationService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val accountTransfers: AccountTransferService by lazy { AccountTransferServiceImpl(clientOptions) }

    private val accountStatements: AccountStatementService by lazy { AccountStatementServiceImpl(clientOptions) }

    private val achTransfers: AchTransferService by lazy { AchTransferServiceImpl(clientOptions) }

    private val cardDisputes: CardDisputeService by lazy { CardDisputeServiceImpl(clientOptions) }

    private val cardRefunds: CardRefundService by lazy { CardRefundServiceImpl(clientOptions) }

    private val checkTransfers: CheckTransferService by lazy { CheckTransferServiceImpl(clientOptions) }

    private val documents: DocumentService by lazy { DocumentServiceImpl(clientOptions) }

    private val digitalWalletTokenRequests: DigitalWalletTokenRequestService by lazy { DigitalWalletTokenRequestServiceImpl(clientOptions) }

    private val checkDeposits: CheckDepositService by lazy { CheckDepositServiceImpl(clientOptions) }

    private val inboundWireDrawdownRequests: InboundWireDrawdownRequestService by lazy { InboundWireDrawdownRequestServiceImpl(clientOptions) }

    private val wireTransfers: WireTransferService by lazy { WireTransferServiceImpl(clientOptions) }

    private val cards: CardService by lazy { CardServiceImpl(clientOptions) }

    private val realTimePaymentsTransfers: RealTimePaymentsTransferService by lazy { RealTimePaymentsTransferServiceImpl(clientOptions) }

    override fun accountTransfers(): AccountTransferService = accountTransfers

    override fun accountStatements(): AccountStatementService = accountStatements

    override fun achTransfers(): AchTransferService = achTransfers

    override fun cardDisputes(): CardDisputeService = cardDisputes

    override fun cardRefunds(): CardRefundService = cardRefunds

    override fun checkTransfers(): CheckTransferService = checkTransfers

    override fun documents(): DocumentService = documents

    override fun digitalWalletTokenRequests(): DigitalWalletTokenRequestService = digitalWalletTokenRequests

    override fun checkDeposits(): CheckDepositService = checkDeposits

    override fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestService = inboundWireDrawdownRequests

    override fun wireTransfers(): WireTransferService = wireTransfers

    override fun cards(): CardService = cards

    override fun realTimePaymentsTransfers(): RealTimePaymentsTransferService = realTimePaymentsTransfers
}
