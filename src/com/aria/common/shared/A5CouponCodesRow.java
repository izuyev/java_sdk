package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_coupon_codes_row", propOrder = {
    "a5CouponCodes"
    })
public class A5CouponCodesRow {

    @XmlElement(name = "a5_coupon_codes")
    protected String a5CouponCodes;
    public String getA5CouponCodes() {
        return a5CouponCodes;
    }

    public void setA5CouponCodes(String value) {
        this.a5CouponCodes = value;
    }

    
}
