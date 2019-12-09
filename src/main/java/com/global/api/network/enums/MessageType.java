package com.global.api.network.enums;

import com.global.api.entities.enums.IByteConstant;

public enum MessageType implements IByteConstant {
    NoMessage (0x00),
    Heartland_Z01 (0x01),
    Auth_Quick_Credit (0x02),
    Remote_Entry (0x03),
    FDMS_PassThrough (0x04),
    TCOP_AuthType_PassThrough (0x05),
    TCOP_ApplicationType_PassThrough (0x06),
    TCOP_Legacy_Auth_PassThrough (0x07),
    TCOP_Legacy_QuickCredit_PassThrough (0x08),
    Discover_ISO_8583_PassThrough (0x09),
    Combo_KSM_NPC (0x0A),
    Geobridge_3DES_NWS (0x0B),
    HSM_Fixed (0x10),
    KSM_Delimited (0x11),
    WEX_Processing (0x12),
    Site_Configured_Layout (0x1F),
    // 0x84 (0x20),
    DEPS_8583 (0x21),
    Heartland_8583 (0x22),
    Heartland_POS_8583 (0x23),
    BIC_ISO (0x24),
    Heartland_NTS (0x25),
    ATT_Format_III (0x26),
    ATT_Format_IV (0x27),
    CPNI (0x28),
    Heartland_Prepaid_XML (0x29),
    Heartland_Prepaid_Host_to_Host (0x2A),
    NPC_Processing (0x30),
    IFCS_Processing (0x31),
    FedChex_Processing (0x32),
    JCP_Private_Label (0x33),
    SOPUS_8583 (0x34);

    private final byte value;
    MessageType(int value) { this.value = (byte)value; }
    public byte getByte() {
        return this.value;
    }
}
