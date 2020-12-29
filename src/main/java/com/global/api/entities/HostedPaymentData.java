package com.global.api.entities;

import java.util.HashMap;

import com.global.api.entities.enums.AlternativePaymentType;
import com.global.api.entities.enums.ChallengeRequest;

public class HostedPaymentData {
    private Boolean addressesMatch;
    private ChallengeRequest challengeRequest;
    private Boolean customerExists;
    private String customerEmail;
    private String customerKey;
    private String customerNumber;
    private String customerCountry;
    private String customerFirstName;
    private String customerLastName;
    private String customerPhoneMobile;
    private String merchantResponseUrl;
    private Boolean offerToSaveCard;
    private String paymentKey;
    private String productId;
    private AlternativePaymentType[] presetPaymentMethods;
    private HashMap<String, String> supplementaryData;
    private String transactionStatusUrl;
    
    // Optional fields for 3DS2
    private String customerWorkNumber;
    private String customerHomeNumber;
    private String accountAgeDate; 
    private String accountAgeIndicator;
    private String accountChangeDate;
    private String accountChangeIndicator;
    private String accountPassChangeDate;
    private String accountPassChangeIndicator;
    private String accountPurchaseCount;
    private String transactionType;
    private String cardholderAccountIdentifier;
    private String suspiciousActivity;
    private String provisionAttemptsDay;
    private String paymentAccountAge;
    private String paymentAccountAgeIndicator;
    private String deliveryEmail;
    private String deliveryTimeframe;
    private String shipIndicator;
    private String shippingAddressUsage;
    private String shippingAddressUsageIndicator;
    private String shippingNameIndicator;
    private String preorderDate;
    private String preorderPurchaseIndicator;
    private String reorderItemIndicator;
    private String transactionActivityDay;
    private String transactionActivityYear;
    private String giftCardAmount;
    private String giftCardCount;
    private String giftCardCurrency;
    private String recurringMaxInstallments;
    private String recurringExpiry;
    private String recurringFrequency;
    private String priorTransAuthMethod;
    private String priorTransAuthIdentifier;
    private String priorTransAuthTimestamp;
    private String priorTransAuthData;
    private String cardLoginAuthType;
    private String cardLoginAuthTimestamp;
    private String cardLoginAuthData;
    private String whiteListStatus;
    
    /* 3DS2 optional fields */
    public String getCustomerHomeNumber() {
        return customerHomeNumber;
    }
    public void setCustomerHomeNumber(String customerHomeNumber) {
        this.customerHomeNumber = customerHomeNumber;
    }
    public String getCustomerWorkNumber() {
        return customerWorkNumber;
    }
    public void setCustomerWorkNumber(String customerWorkNumber) {
        this.customerWorkNumber = customerWorkNumber;
    }
    public String getAccountAgeDate() {
        return accountAgeDate;
    }
    public void setAccountAgeDate(String accountAgeDate) {
        this.accountAgeDate = accountAgeDate;
    }
    public String getAccountAgeIndicator() {
        return accountAgeIndicator;
    }
    public void setAccountAgeIndicator(String accountAgeIndicator) {
        this.accountAgeIndicator = accountAgeIndicator;
    }
    public String getAccountChangeDate() {
        return accountChangeDate;
    }
    public void setAccountChangeDate(String accountChangeDate) {
        this.accountChangeDate = accountChangeDate;
    }
    public String getAccountChangeIndicator() {
        return accountChangeIndicator;
    }
    public void setAccountChangeIndicator(String accountChangeIndicator) {
        this.accountChangeIndicator = accountChangeIndicator;
    }
    public String getAccountPassChangeDate() {
        return accountPassChangeDate;
    }
    public void setAccountPassChangeDate(String accountPassChangeDate) {
        this.accountPassChangeDate = accountPassChangeDate;
    }
    public String getAccountPassChangeIndicator() {
        return accountPassChangeIndicator;
    }
    public void setAccountPassChangeIndicator(String accountPassChangeIndicator) {
        this.accountPassChangeIndicator = accountPassChangeIndicator;
    }
    public String getAccountPurchaseCount() {
        return accountPurchaseCount;
    }
    public void setAccountPurchaseCount(String accountPurchaseCount) {
        this.accountPurchaseCount = accountPurchaseCount;
    }
    public String getTransactionType() {
        return transactionType;
    }
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    public String getCardholderAccountIdentifier() {
        return cardholderAccountIdentifier;
    }
    public void setCardholderAccountIdentifier(String cardholderAccountIdentifier) {
        this.cardholderAccountIdentifier = cardholderAccountIdentifier;
    }
    public String getSuspiciousActivity() {
        return suspiciousActivity;
    }
    public void setSuspiciousActivity(String suspiciousActivity) {
        this.suspiciousActivity = suspiciousActivity;
    }
    public String getProvisionAttemptsDay() {
        return provisionAttemptsDay;
    }
    public void setProvisionAttemptsDay(String provisionAttemptsDay) {
        this.provisionAttemptsDay = provisionAttemptsDay;
    }
    public String getPaymentAccountAge() {
        return paymentAccountAge;
    }
    public void setPaymentAccountAge(String paymentAccountAge) {
        this.paymentAccountAge = paymentAccountAge;
    }
    public String getPaymentAccountAgeIndicator() {
        return paymentAccountAgeIndicator;
    }
    public void setPaymentAccountAgeIndicator(String paymentAccountAgeIndicator) {
        this.paymentAccountAgeIndicator = paymentAccountAgeIndicator;
    }
    public String getDeliveryEmail() {
        return deliveryEmail;
    }
    public void setDeliveryEmail(String deliveryEmail) {
        this.deliveryEmail = deliveryEmail;
    }
    public String getDeliveryTimeframe() {
        return deliveryTimeframe;
    }
    public void setDeliveryTimeframe(String deliveryTimeframe) {
        this.deliveryTimeframe = deliveryTimeframe;
    }
    public String getShipIndicator() {
        return shipIndicator;
    }
    public void setShipIndicator(String shipIndicator) {
        this.shipIndicator = shipIndicator;
    }
    public String getShippingAddressUsage() {
        return shippingAddressUsage;
    }
    public void setShippingAddressUsage(String shippingAddressUsage) {
        this.shippingAddressUsage = shippingAddressUsage;
    }
    public String getShippingAddressUsageIndicator() {
        return shippingAddressUsageIndicator;
    }
    public void setShippingAddressUsageIndicator(String shippingAddressUsageIndicator) {
        this.shippingAddressUsageIndicator = shippingAddressUsageIndicator;
    }
    public String getShippingNameIndicator() {
        return shippingNameIndicator;
    }
    public void setShippingNameIndicator(String shippingNameIndicator) {
        this.shippingNameIndicator = shippingNameIndicator;
    }
    public String getPreorderDate() {
        return preorderDate;
    }
    public void setPreorderDate(String preorderDate) {
        this.preorderDate = preorderDate;
    }
    public String getPreorderPurchaseIndicator() {
        return preorderPurchaseIndicator;
    }
    public void setPreorderPurchaseIndicator(String preorderPurchaseIndicator) {
        this.preorderPurchaseIndicator = preorderPurchaseIndicator;
    }
    public String getReorderItemIndicator() {
        return reorderItemIndicator;
    }
    public void setReorderItemIndicator(String reorderItemIndicator) {
        this.reorderItemIndicator = reorderItemIndicator;
    }
    public String getTransactionActivityDay() {
        return transactionActivityDay;
    }
    public void setTransactionActivityDay(String transactionActivityDay) {
        this.transactionActivityDay = transactionActivityDay;
    }
    public String getTransactionActivityYear() {
        return transactionActivityYear;
    }
    public void setTransactionActivityYear(String transactionActivityYear) {
        this.transactionActivityYear = transactionActivityYear;
    }
    public String getGiftCardAmount() {
        return giftCardAmount;
    }
    public void setGiftCardAmount(String giftCardAmount) {
        this.giftCardAmount = giftCardAmount;
    }
    public String getGiftCardCount() {
        return giftCardCount;
    }
    public void setGiftCardCount(String giftCardCount) {
        this.giftCardCount = giftCardCount;
    }
    public String getGiftCardCurrency() {
        return giftCardCurrency;
    }
    public void setGiftCardCurrency(String giftCardCurrency) {
        this.giftCardCurrency = giftCardCurrency;
    }
    public String getRecurringMaxInstallments() {
        return recurringMaxInstallments;
    }
    public void setRecurringMaxInstallments(String recurringMaxInstallments) {
        this.recurringMaxInstallments = recurringMaxInstallments;
    }
    public String getRecurringExpiry() {
        return recurringExpiry;
    }
    public void setRecurringExpiry(String recurringExpiry) {
        this.recurringExpiry = recurringExpiry;
    }
    public String getRecurringFrequency() {
        return recurringFrequency;
    }
    public void setRecurringFrequency(String recurringFrequency) {
        this.recurringFrequency = recurringFrequency;
    }
    public String getPriorTransAuthMethod() {
        return priorTransAuthMethod;
    }
    public void setPriorTransAuthMethod(String priorTransAuthMethod) {
        this.priorTransAuthMethod = priorTransAuthMethod;
    }
    public String getPriorTransAuthIdentifier() {
        return priorTransAuthIdentifier;
    }
    public void setPriorTransAuthIdentifier(String priorTransAuthIdentifier) {
        this.priorTransAuthIdentifier = priorTransAuthIdentifier;
    }
    public String getPriorTransAuthTimestamp() {
        return priorTransAuthTimestamp;
    }
    public void setPriorTransAuthTimestamp(String priorTransAuthTimestamp) {
        this.priorTransAuthTimestamp = priorTransAuthTimestamp;
    }
    public String getPriorTransAuthData() {
        return priorTransAuthData;
    }
    public void setPriorTransAuthData(String priorTransAuthData) {
        this.priorTransAuthData = priorTransAuthData;
    }
    public String getCardLoginAuthType() {
        return cardLoginAuthType;
    }
    public void setCardLoginAuthType(String cardLoginAuthType) {
        this.cardLoginAuthType = cardLoginAuthType;
    }
    public String getCardLoginAuthTimestamp() {
        return cardLoginAuthTimestamp;
    }
    public void setCardLoginAuthTimestamp(String cardLoginAuthTimestamp) {
        this.cardLoginAuthTimestamp = cardLoginAuthTimestamp;
    }
    public String getCardLoginAuthData() {
        return cardLoginAuthData;
    }
    public void setCardLoginAuthData(String cardLoginAuthData) {
        this.cardLoginAuthData = cardLoginAuthData;
    }
    public String getWhiteListStatus() {
        return whiteListStatus;
    }
    public void setWhiteListStatus(String whiteListStatus) {
        this.whiteListStatus = whiteListStatus;
    }
    /* End of 3DS2 optional fields */

    public Boolean getAddressesMatch() {
        return addressesMatch;
    }
    public void setAddressesMatch(Boolean addressesMatch) {
        this.addressesMatch = addressesMatch;
    }
    public ChallengeRequest getChallengeRequest() {
        return challengeRequest;
    }
    public void setChallengeRequest(ChallengeRequest challengeRequest) {
        this.challengeRequest = challengeRequest;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public Boolean isCustomerExists() {
        return customerExists;
    }
    public void setCustomerExists(boolean customerExists) {
        this.customerExists = customerExists;
    }
    public String getCustomerKey() {
        return customerKey;
    }
    public void setCustomerKey(String customerKey) {
        this.customerKey = customerKey;
    }
    public String getCustomerNumber() {
        return customerNumber;
    }
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
    public String getCustomerCountry() {
		return customerCountry;
	}
	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
    public String getCustomerPhoneMobile() {
        return customerPhoneMobile;
    }
    public void setCustomerPhoneMobile(String customerPhoneMobile) {
        this.customerPhoneMobile = customerPhoneMobile;
    }
    public String getMerchantResponseUrl() {
		return merchantResponseUrl;
	}
	public void setMerchantResponseUrl(String merchantResponseUrl) {
		this.merchantResponseUrl = merchantResponseUrl;
	}
    public Boolean isOfferToSaveCard() {
        return offerToSaveCard;
    }
    public void setOfferToSaveCard(boolean offerToSaveCard) {
        this.offerToSaveCard = offerToSaveCard;
    }
    public String getPaymentKey() {
        return paymentKey;
    }
    public void setPaymentKey(String paymentKey) {
        this.paymentKey = paymentKey;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
	public AlternativePaymentType[] getPresetPaymentMethods() {
		return presetPaymentMethods;
	}
	public void setPresetPaymentMethods(AlternativePaymentType ... paymentTypes) {
		this.presetPaymentMethods = paymentTypes;
	}
	public HashMap<String, String> getSupplementaryData() {
        return supplementaryData;
    }
    public void setSupplimentaryData(HashMap<String, String> supplementaryData) {
        this.supplementaryData = supplementaryData;
    }
    public String getTransactionStatusUrl() {
		return transactionStatusUrl;
	}
	public void setTransactionStatusUrl(String transactionStatusUrl) {
		this.transactionStatusUrl = transactionStatusUrl;
	}
	public HostedPaymentData() {
        supplementaryData = new HashMap<String, String>();
    }
}
