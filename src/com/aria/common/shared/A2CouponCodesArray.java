package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_coupon_codes_array", propOrder = {
    "a2CouponCodesRow"
})
public class A2CouponCodesArray {

    @XmlElement(name = "a2_coupon_codes_row")
    protected List<A2CouponCodesRow> a2CouponCodesRow;

    public List<A2CouponCodesRow> getA2CouponCodesRow() {
        if (this.a2CouponCodesRow == null) {
            this.a2CouponCodesRow = new ArrayList<A2CouponCodesRow>();
        }
        return this.a2CouponCodesRow;
    }

}
