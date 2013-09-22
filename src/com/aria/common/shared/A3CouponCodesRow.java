package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_coupon_codes_row", propOrder = {
    "a3CouponCodes"
    })
public class A3CouponCodesRow {

    @XmlElement(name = "a3_coupon_codes")
    protected String a3CouponCodes;
    public String getA3CouponCodes() {
        return a3CouponCodes;
    }

    public void setA3CouponCodes(String value) {
        this.a3CouponCodes = value;
    }

    
}
