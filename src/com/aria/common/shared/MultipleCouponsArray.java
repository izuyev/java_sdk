package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiple_coupons_array", propOrder = {
    "multipleCouponsRow"
})
public class MultipleCouponsArray {

    @XmlElement(name = "multiple_coupons_row")
    protected List<MultipleCouponsRow> multipleCouponsRow;

    public List<MultipleCouponsRow> getMultipleCouponsRow() {
        if (this.multipleCouponsRow == null) {
            this.multipleCouponsRow = new ArrayList<MultipleCouponsRow>();
        }
        return this.multipleCouponsRow;
    }

}
