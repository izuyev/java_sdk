package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_surcharge_no_array", propOrder = {
    "a3SurchargeNoRow"
})
public class A3SurchargeNoArray {

    @XmlElement(name = "a3_surcharge_no_row")
    protected List<A3SurchargeNoRow> a3SurchargeNoRow;

    public List<A3SurchargeNoRow> getA3SurchargeNoRow() {
        if (this.a3SurchargeNoRow == null) {
            this.a3SurchargeNoRow = new ArrayList<A3SurchargeNoRow>();
        }
        return this.a3SurchargeNoRow;
    }

}
