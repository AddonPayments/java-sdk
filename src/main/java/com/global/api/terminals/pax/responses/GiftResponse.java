package com.global.api.terminals.pax.responses;

import com.global.api.entities.enums.ControlCodes;
import com.global.api.entities.enums.PaxMsgId;
import com.global.api.entities.exceptions.MessageException;
import com.global.api.terminals.pax.subgroups.*;
import com.global.api.utils.MessageReader;

public class GiftResponse extends PaxDeviceResponse {
    public GiftResponse(byte[] buffer) throws MessageException {
        super(buffer, PaxMsgId.T07_RSP_DO_GIFT, PaxMsgId.T09_RSP_DO_LOYALTY);
    }

    @Override
    protected void parseResponse(MessageReader br) throws MessageException {
        super.parseResponse(br);

        if (deviceResponseCode.equals("000000")) {
            hostResponse = new HostResponse(br);
            transactionType = br.readToCode(ControlCodes.FS);
            amountResponse = new AmountResponse(br);
            accountResponse = new AccountResponse(br);
            traceResponse = new TraceResponse(br);
            extDataResponse = new ExtDataSubGroup(br);

            mapResponse();
        }
    }
}