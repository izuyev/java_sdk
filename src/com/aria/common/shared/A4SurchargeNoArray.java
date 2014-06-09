package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_surcharge_no_array", propOrder = {
    "a4SurchargeNoRow"
})
public class A4SurchargeNoArray {

    @XmlElement(name = "a4_surcharge_no_row")
    protected List<A4SurchargeNoRow> a4SurchargeNoRow;

    public List<A4SurchargeNoRow> getA4SurchargeNoRow() {
        if (this.a4SurchargeNoRow == null) {
            this.a4SurchargeNoRow = new ArrayList<A4SurchargeNoRow>();
        }
        return this.a4SurchargeNoRow;
    }

}
