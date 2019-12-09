package com.global.api.network.enums;

import com.global.api.entities.enums.IStringConstant;

/// DE 63 Unit of Measure
public enum UnitOfMeasure implements IStringConstant {
    CaseOrCarton("C"),
    Gallons("G"),
    Kilograms("K"),
    Liters("L"),
    OtherOrUnknown("O"),
    Pounds("P"),
    Quarts("Q"),
    Units("U"),
    Ounces("Z");

    private final String value;
    UnitOfMeasure(String value) { this.value = value; }
    public String getValue() {
        return value;
    }
    public byte[] getBytes() {
        return value.getBytes();
    }
}
