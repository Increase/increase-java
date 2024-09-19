// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

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
import com.increase.api.services.async.simulations.AccountTransferServiceAsync
import com.increase.api.services.async.simulations.AccountTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundAchTransferServiceAsync
import com.increase.api.services.async.simulations.InboundAchTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.AchTransferServiceAsync
import com.increase.api.services.async.simulations.AchTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.CheckTransferServiceAsync
import com.increase.api.services.async.simulations.CheckTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundCheckDepositServiceAsync
import com.increase.api.services.async.simulations.InboundCheckDepositServiceAsyncImpl
import com.increase.api.services.async.simulations.CheckDepositServiceAsync
import com.increase.api.services.async.simulations.CheckDepositServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundWireTransferServiceAsync
import com.increase.api.services.async.simulations.InboundWireTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.WireTransferServiceAsync
import com.increase.api.services.async.simulations.WireTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundWireDrawdownRequestServiceAsync
import com.increase.api.services.async.simulations.InboundWireDrawdownRequestServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundRealTimePaymentsTransferServiceAsync
import com.increase.api.services.async.simulations.InboundRealTimePaymentsTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundFundsHoldServiceAsync
import com.increase.api.services.async.simulations.InboundFundsHoldServiceAsyncImpl
import com.increase.api.services.async.simulations.RealTimePaymentsTransferServiceAsync
import com.increase.api.services.async.simulations.RealTimePaymentsTransferServiceAsyncImpl
import com.increase.api.services.async.simulations.CardAuthorizationServiceAsync
import com.increase.api.services.async.simulations.CardAuthorizationServiceAsyncImpl
import com.increase.api.services.async.simulations.CardSettlementServiceAsync
import com.increase.api.services.async.simulations.CardSettlementServiceAsyncImpl
import com.increase.api.services.async.simulations.CardReversalServiceAsync
import com.increase.api.services.async.simulations.CardReversalServiceAsyncImpl
import com.increase.api.services.async.simulations.CardIncrementServiceAsync
import com.increase.api.services.async.simulations.CardIncrementServiceAsyncImpl
import com.increase.api.services.async.simulations.CardAuthorizationExpirationServiceAsync
import com.increase.api.services.async.simulations.CardAuthorizationExpirationServiceAsyncImpl
import com.increase.api.services.async.simulations.CardFuelConfirmationServiceAsync
import com.increase.api.services.async.simulations.CardFuelConfirmationServiceAsyncImpl
import com.increase.api.services.async.simulations.CardRefundServiceAsync
import com.increase.api.services.async.simulations.CardRefundServiceAsyncImpl
import com.increase.api.services.async.simulations.CardDisputeServiceAsync
import com.increase.api.services.async.simulations.CardDisputeServiceAsyncImpl
import com.increase.api.services.async.simulations.DigitalWalletTokenRequestServiceAsync
import com.increase.api.services.async.simulations.DigitalWalletTokenRequestServiceAsyncImpl
import com.increase.api.services.async.simulations.PhysicalCardServiceAsync
import com.increase.api.services.async.simulations.PhysicalCardServiceAsyncImpl
import com.increase.api.services.async.simulations.InterestPaymentServiceAsync
import com.increase.api.services.async.simulations.InterestPaymentServiceAsyncImpl
import com.increase.api.services.async.simulations.AccountStatementServiceAsync
import com.increase.api.services.async.simulations.AccountStatementServiceAsyncImpl
import com.increase.api.services.async.simulations.DocumentServiceAsync
import com.increase.api.services.async.simulations.DocumentServiceAsyncImpl
import com.increase.api.services.async.simulations.InboundMailItemServiceAsync
import com.increase.api.services.async.simulations.InboundMailItemServiceAsyncImpl
import com.increase.api.services.async.simulations.ProgramServiceAsync
import com.increase.api.services.async.simulations.ProgramServiceAsyncImpl

interface SimulationServiceAsync {

    fun accountTransfers(): AccountTransferServiceAsync

    fun inboundAchTransfers(): InboundAchTransferServiceAsync

    fun achTransfers(): AchTransferServiceAsync

    fun checkTransfers(): CheckTransferServiceAsync

    fun inboundCheckDeposits(): InboundCheckDepositServiceAsync

    fun checkDeposits(): CheckDepositServiceAsync

    fun inboundWireTransfers(): InboundWireTransferServiceAsync

    fun wireTransfers(): WireTransferServiceAsync

    fun inboundWireDrawdownRequests(): InboundWireDrawdownRequestServiceAsync

    fun inboundRealTimePaymentsTransfers(): InboundRealTimePaymentsTransferServiceAsync

    fun inboundFundsHolds(): InboundFundsHoldServiceAsync

    fun realTimePaymentsTransfers(): RealTimePaymentsTransferServiceAsync

    fun cardAuthorizations(): CardAuthorizationServiceAsync

    fun cardSettlements(): CardSettlementServiceAsync

    fun cardReversals(): CardReversalServiceAsync

    fun cardIncrements(): CardIncrementServiceAsync

    fun cardAuthorizationExpirations(): CardAuthorizationExpirationServiceAsync

    fun cardFuelConfirmations(): CardFuelConfirmationServiceAsync

    fun cardRefunds(): CardRefundServiceAsync

    fun cardDisputes(): CardDisputeServiceAsync

    fun digitalWalletTokenRequests(): DigitalWalletTokenRequestServiceAsync

    fun physicalCards(): PhysicalCardServiceAsync

    fun interestPayments(): InterestPaymentServiceAsync

    fun accountStatements(): AccountStatementServiceAsync

    fun documents(): DocumentServiceAsync

    fun inboundMailItems(): InboundMailItemServiceAsync

    fun programs(): ProgramServiceAsync
}
