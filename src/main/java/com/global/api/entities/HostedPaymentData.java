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
