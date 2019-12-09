package com.global.api.network.elements;

import com.global.api.network.enums.DE127_ForwardingDataTag;
import com.global.api.network.enums.EncryptionType;

public class DE127_ForwardingDataEntry {
    private DE127_ForwardingDataTag tag;

    private String recordId;
    private String recordType;
    private String keyBlockDataType;
    private String encryptedFieldMatrix;
    private EncryptionType tepType;
    private String cardSecurityCode;
    private String etbBlock;
    private String entryData;

    public DE127_ForwardingDataTag getTag() {
        return tag;
    }
    public void setTag(DE127_ForwardingDataTag tag) {
        this.tag = tag;
    }
    public String getRecordId() {
        return recordId;
    }
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }
    public String getRecordType() {
        return recordType;
    }
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }
    public String getKeyBlockDataType() {
        return keyBlockDataType;
    }
    public void setKeyBlockDataType(String keyBlockDataType) {
        this.keyBlockDataType = keyBlockDataType;
    }
    public String getEncryptedFieldMatrix() {
        return encryptedFieldMatrix;
    }
    public void setEncryptedFieldMatrix(String encryptedFieldMatrix) {
        this.encryptedFieldMatrix = encryptedFieldMatrix;
    }
    public EncryptionType getTepType() {
        return tepType;
    }
    public void setTepType(EncryptionType tepType) {
        this.tepType = tepType;
    }
    public String getCardSecurityCode() {
        return cardSecurityCode;
    }
    public void setCardSecurityCode(String cardSecurityCode) {
        this.cardSecurityCode = cardSecurityCode;
    }
    public String getEtbBlock() {
        return etbBlock;
    }
    public void setEtbBlock(String etbBlock) {
        this.etbBlock = etbBlock;
    }
    public String getEntryData() {
        return entryData;
    }
    public void setEntryData(String entryData) {
        this.entryData = entryData;
    }
}
