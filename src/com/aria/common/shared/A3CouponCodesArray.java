package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_coupon_codes_array", propOrder = {
    "a3CouponCodesRow"
})
public class A3CouponCodesArray {

    @XmlElement(name = "a3_coupon_codes_row")
    protected List<A3CouponCodesRow> a3CouponCodesRow;

    public List<A3CouponCodesRow> getA3CouponCodesRow() {
        if (this.a3CouponCodesRow == null) {
            this.a3CouponCodesRow = new ArrayList<A3CouponCodesRow>();
        }
        return this.a3CouponCodesRow;
    }

}
