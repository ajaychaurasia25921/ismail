package com.supergreen.cooperate.bank.domain.ismail;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CREDIT_LIMIT", schema = "CREDIT")
public class CreditLimit {

    @Id
    @Column(name = "REQUEST_ID")
    private String requestId;

    @Column(name = "ORDER_ID")
    private String orderId;

    @Column(name = "CUSTOMER_NUMBER")
    private String custNum;

    @Enumerated(EnumType.STRING)
    @Column(name = "INSTRUMENT_TYPE")
    private InstrumentType instrumentType;

    @Enumerated(EnumType.STRING)
    @Column(name = "ORDER_TYPE")
    private OrderType orderType;

    @Column(name = "INVESTMENT_ACCT_NUM")
    private String investmentAcctNum;

    @Column(name = "SETTLEMENT_ACCT_NUM")
    private String settlementAcctNum;

    @Column(name = "SETTLEMENT_ACCT_CURRENCY")
    private String settlementAcctCurrency;

    @Column(name = "TRANSACTION_TYPE")
    private String transactionType;

    @Column(name = "QUANTITY")
    private Double quantity;

    @Column(name = "EXCHANGE_MARKET")
    private String exchangeMarket;

    @Column(name = "SECURITY_IDENTIFIER")
    private Set<SecurityIdentifier> securityIdentifier;

    @Column(name = "SECURITY_IDENTIFIER2")
    private Set<SecurityIdentifier> securityIdentifier2;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "PRICE_CURRENCY_CD")
    private String priceCurrencyCd;

    @Column(name = "AMOUNT")
    private Double amount;

    @Column(name = "AMOUNT_CURRENCY_CD")
    private String amountCurrencyCd;

    @Enumerated(EnumType.STRING)
    @Column(name = "ORDER_STATUS")
    private OrderStatus orderStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "AMENDMENT")
    private Amendment amendment;

}
