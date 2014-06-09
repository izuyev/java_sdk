package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_surcharge_no_array", propOrder = {
    "a5SurchargeNoRow"
})
public class A5SurchargeNoArray {

    @XmlElement(name = "a5_surcharge_no_row")
    protected List<A5SurchargeNoRow> a5SurchargeNoRow;

    public List<A5SurchargeNoRow> getA5SurchargeNoRow() {
        if (this.a5SurchargeNoRow == null) {
            this.a5SurchargeNoRow = new ArrayList<A5SurchargeNoRow>();
        }
        return this.a5SurchargeNoRow;
    }

}
