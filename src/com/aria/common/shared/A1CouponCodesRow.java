package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_coupon_codes_row", propOrder = {
    "a1CouponCodes"
    })
public class A1CouponCodesRow {

    @XmlElement(name = "a1_coupon_codes")
    protected String a1CouponCodes;
    public String getA1CouponCodes() {
        return a1CouponCodes;
    }

    public void setA1CouponCodes(String value) {
        this.a1CouponCodes = value;
    }

    
}
