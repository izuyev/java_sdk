package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_coupon_codes_array", propOrder = {
    "a5CouponCodesRow"
})
public class A5CouponCodesArray {

    @XmlElement(name = "a5_coupon_codes_row")
    protected List<A5CouponCodesRow> a5CouponCodesRow;

    public List<A5CouponCodesRow> getA5CouponCodesRow() {
        if (this.a5CouponCodesRow == null) {
            this.a5CouponCodesRow = new ArrayList<A5CouponCodesRow>();
        }
        return this.a5CouponCodesRow;
    }

}
