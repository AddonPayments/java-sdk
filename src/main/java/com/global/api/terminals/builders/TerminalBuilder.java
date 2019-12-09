package com.global.api.terminals.builders;

import com.global.api.builders.TransactionBuilder;
import com.global.api.entities.enums.PaymentMethodType;
import com.global.api.entities.enums.TransactionType;
import com.global.api.terminals.TerminalResponse;

public abstract class TerminalBuilder<T extends TerminalBuilder<T>> extends TransactionBuilder<TerminalResponse> {
    protected PaymentMethodType paymentMethodType;
    protected Integer requestId;

    public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType;
    }
    public Integer getRequestId() {
        return requestId;
    }

    public T withRequestId(Integer value) {
        requestId = value;
        return (T)this;
    }

    TerminalBuilder(TransactionType type, PaymentMethodType paymentType) {
        super(type);
        paymentMethodType = paymentType;
    }
}
