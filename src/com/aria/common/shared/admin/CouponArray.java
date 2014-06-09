package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coupon_array", propOrder = {
    "couponRow"
})
public class CouponArray {

    @XmlElement(name = "coupon_row")
    protected List<CouponRow> couponRow;

    public List<CouponRow> getCouponRow() {
        if (this.couponRow == null) {
            this.couponRow = new ArrayList<CouponRow>();
        }
        return this.couponRow;
    }

}
