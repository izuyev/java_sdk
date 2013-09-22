package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_coupon_codes_row", propOrder = {
    "a2CouponCodes"
    })
public class A2CouponCodesRow {

    @XmlElement(name = "a2_coupon_codes")
    protected String a2CouponCodes;
    public String getA2CouponCodes() {
        return a2CouponCodes;
    }

    public void setA2CouponCodes(String value) {
        this.a2CouponCodes = value;
    }

    
}
