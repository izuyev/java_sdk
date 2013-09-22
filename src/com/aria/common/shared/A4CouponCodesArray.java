package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_coupon_codes_array", propOrder = {
    "a4CouponCodesRow"
})
public class A4CouponCodesArray {

    @XmlElement(name = "a4_coupon_codes_row")
    protected List<A4CouponCodesRow> a4CouponCodesRow;

    public List<A4CouponCodesRow> getA4CouponCodesRow() {
        if (this.a4CouponCodesRow == null) {
            this.a4CouponCodesRow = new ArrayList<A4CouponCodesRow>();
        }
        return this.a4CouponCodesRow;
    }

}
