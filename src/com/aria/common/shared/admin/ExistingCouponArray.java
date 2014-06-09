package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "existing_coupon_array", propOrder = {
    "existingCouponRow"
})
public class ExistingCouponArray {

    @XmlElement(name = "existing_coupon_row")
    protected List<ExistingCouponRow> existingCouponRow;

    public List<ExistingCouponRow> getExistingCouponRow() {
        if (this.existingCouponRow == null) {
            this.existingCouponRow = new ArrayList<ExistingCouponRow>();
        }
        return this.existingCouponRow;
    }

}
