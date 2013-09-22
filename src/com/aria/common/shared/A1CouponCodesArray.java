package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_coupon_codes_array", propOrder = {
    "a1CouponCodesRow"
})
public class A1CouponCodesArray {

    @XmlElement(name = "a1_coupon_codes_row")
    protected List<A1CouponCodesRow> a1CouponCodesRow;

    public List<A1CouponCodesRow> getA1CouponCodesRow() {
        if (this.a1CouponCodesRow == null) {
            this.a1CouponCodesRow = new ArrayList<A1CouponCodesRow>();
        }
        return this.a1CouponCodesRow;
    }

}
