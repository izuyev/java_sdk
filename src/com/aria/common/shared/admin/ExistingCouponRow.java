package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "existing_coupon_row", propOrder = {
    "existingCoupons"
    })
public class ExistingCouponRow {

    @XmlElement(name = "existing_coupons")
    protected Long existingCoupons;
    public Long getExistingCoupons() {
        return existingCoupons;
    }

    public void setExistingCoupons(Long value) {
        this.existingCoupons = value;
    }

    
}
