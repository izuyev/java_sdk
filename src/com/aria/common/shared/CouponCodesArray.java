package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coupon_codes_array", propOrder = {
    "couponCodesRow"
})
public class CouponCodesArray {

    @XmlElement(name = "coupon_codes_row")
    protected List<CouponCodesRow> couponCodesRow;

    public List<CouponCodesRow> getCouponCodesRow() {
        if (this.couponCodesRow == null) {
            this.couponCodesRow = new ArrayList<CouponCodesRow>();
        }
        return this.couponCodesRow;
    }

}
