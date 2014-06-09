package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_surcharge_no_array", propOrder = {
    "a2SurchargeNoRow"
})
public class A2SurchargeNoArray {

    @XmlElement(name = "a2_surcharge_no_row")
    protected List<A2SurchargeNoRow> a2SurchargeNoRow;

    public List<A2SurchargeNoRow> getA2SurchargeNoRow() {
        if (this.a2SurchargeNoRow == null) {
            this.a2SurchargeNoRow = new ArrayList<A2SurchargeNoRow>();
        }
        return this.a2SurchargeNoRow;
    }

}
