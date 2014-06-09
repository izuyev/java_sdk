package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coupon_nos_array", propOrder = {
    "couponNosRow"
})
public class CouponNosArray {

    @XmlElement(name = "coupon_nos_row")
    protected List<CouponNosRow> couponNosRow;

    public List<CouponNosRow> getCouponNosRow() {
        if (this.couponNosRow == null) {
            this.couponNosRow = new ArrayList<CouponNosRow>();
        }
        return this.couponNosRow;
    }

}
