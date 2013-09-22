package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_coupon_codes_row", propOrder = {
    "a4CouponCodes"
    })
public class A4CouponCodesRow {

    @XmlElement(name = "a4_coupon_codes")
    protected String a4CouponCodes;
    public String getA4CouponCodes() {
        return a4CouponCodes;
    }

    public void setA4CouponCodes(String value) {
        this.a4CouponCodes = value;
    }

    
}
