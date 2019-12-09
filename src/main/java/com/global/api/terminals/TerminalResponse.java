package com.global.api.terminals;

import com.global.api.entities.enums.ApplicationCryptogramType;
import com.global.api.terminals.abstractions.IDeviceResponse;

import java.math.BigDecimal;

public abstract class TerminalResponse implements IDeviceResponse {
    // Internal
    protected String status;
    protected String command;
    protected String version;

    // Functional
    protected String deviceResponseCode;
    protected String deviceResponseText;
    protected String responseCode;
    protected String responseText;
    protected String transactionId;
    protected String terminalRefNumber;
    protected String token;
    protected String signatureStatus;
    protected byte[] signatureData;

    // Transactional
    protected String transactionType;
    protected String maskedCardNumber;
    protected String entryMethod;
    protected String authorizationCode;
    protected String approvalCode;
    protected BigDecimal transactionAmount;
    protected BigDecimal amountDue;
    protected BigDecimal balanceAmount;
    protected String cardHolderName;
    protected String cardBIN;
    protected boolean cardPresent;
    protected String expirationDate;
    protected BigDecimal tipAmount;
    protected BigDecimal cashBackAmount;
    protected String avsResponseCode;
    protected String avsResponseText;
    protected String cvvResponseCode;
    protected String cvvResponseText;
    protected boolean taxExempt;
    protected String taxExemptId;
    protected String ticketNumber;
    protected String paymentType;

    // EMV
    protected String applicationPreferredName;
    protected String applicationLabel;
    protected String applicationId;
    protected ApplicationCryptogramType applicationCryptogramType;
    protected String applicationCryptogram;
    protected String customerVerificationMethod;
    protected String terminalVerificationResults;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDeviceResponseCode() {
        return deviceResponseCode;
    }

    public void setDeviceResponseCode(String deviceResponseCode) {
        this.deviceResponseCode = deviceResponseCode;
    }

    public String getDeviceResponseText() {
        return deviceResponseText;
    }

    public void setDeviceResponseText(String deviceResponseText) {
        this.deviceResponseText = deviceResponseText;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseText() {
        return responseText;
    }

    public void setResponseText(String responseText) {
        this.responseText = responseText;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTerminalRefNumber() {
        return terminalRefNumber;
    }

    public void setTerminalRefNumber(String terminalRefNumber) {
        this.terminalRefNumber = terminalRefNumber;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSignatureStatus() {
        return signatureStatus;
    }

    public void setSignatureStatus(String signatureStatus) {
        this.signatureStatus = signatureStatus;
    }

    public byte[] getSignatureData() {
        return signatureData;
    }

    public void setSignatureData(byte[] signatureData) {
        this.signatureData = signatureData;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getMaskedCardNumber() {
        return maskedCardNumber;
    }

    public void setMaskedCardNumber(String maskedCardNumber) {
        this.maskedCardNumber = maskedCardNumber;
    }

    public String getEntryMethod() {
        return entryMethod;
    }

    public void setEntryMethod(String entryMethod) {
        this.entryMethod = entryMethod;
    }

    public String getApprovalCode() {
        return approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public BigDecimal getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(BigDecimal amountDue) {
        this.amountDue = amountDue;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardBIN() {
        return cardBIN;
    }

    public void setCardBIN(String cardBIN) {
        this.cardBIN = cardBIN;
    }

    public boolean isCardPresent() {
        return cardPresent;
    }

    public void setCardPresent(boolean cardPresent) {
        this.cardPresent = cardPresent;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public BigDecimal getTipAmount() {
        return tipAmount;
    }

    public void setTipAmount(BigDecimal tipAmount) {
        this.tipAmount = tipAmount;
    }

    public BigDecimal getCashBackAmount() {
        return cashBackAmount;
    }

    public void setCashBackAmount(BigDecimal cashBackAmount) {
        this.cashBackAmount = cashBackAmount;
    }

    public String getAvsResponseCode() {
        return avsResponseCode;
    }

    public void setAvsResponseCode(String avsResponseCode) {
        this.avsResponseCode = avsResponseCode;
    }

    public String getAvsResponseText() {
        return avsResponseText;
    }

    public void setAvsResponseText(String avsResponseText) {
        this.avsResponseText = avsResponseText;
    }

    public String getCvvResponseCode() {
        return cvvResponseCode;
    }

    public void setCvvResponseCode(String cvvResponseCode) {
        this.cvvResponseCode = cvvResponseCode;
    }

    public String getCvvResponseText() {
        return cvvResponseText;
    }

    public void setCvvResponseText(String cvvResponseText) {
        this.cvvResponseText = cvvResponseText;
    }

    public boolean isTaxExempt() {
        return taxExempt;
    }

    public void setTaxExempt(boolean taxExempt) {
        this.taxExempt = taxExempt;
    }

    public String getTaxExemptId() {
        return taxExemptId;
    }

    public void setTaxExemptId(String taxExemptId) {
        this.taxExemptId = taxExemptId;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getApplicationPreferredName() {
        return applicationPreferredName;
    }

    public void setApplicationPreferredName(String applicationPreferredName) {
        this.applicationPreferredName = applicationPreferredName;
    }

    public String getApplicationLabel() {
        return applicationLabel;
    }

    public void setApplicationLabel(String applicationLabel) {
        this.applicationLabel = applicationLabel;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public ApplicationCryptogramType getApplicationCryptogramType() {
        return applicationCryptogramType;
    }

    public void setApplicationCryptogramType(ApplicationCryptogramType applicationCryptogramType) {
        this.applicationCryptogramType = applicationCryptogramType;
    }

    public String getApplicationCryptogram() {
        return applicationCryptogram;
    }

    public void setApplicationCryptogram(String applicationCryptogram) {
        this.applicationCryptogram = applicationCryptogram;
    }

    public String getCustomerVerificationMethod() {
        return customerVerificationMethod;
    }

    public void setCustomerVerificationMethod(String customerVerificationMethod) {
        this.customerVerificationMethod = customerVerificationMethod;
    }

    public String getTerminalVerificationResults() {
        return terminalVerificationResults;
    }

    public void setTerminalVerificationResults(String terminalVerificationResults) {
        this.terminalVerificationResults = terminalVerificationResults;
    }

    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    public BigDecimal getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(BigDecimal balanceAmount) {
        this.balanceAmount = balanceAmount;
    }
}