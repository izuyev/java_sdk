package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_surcharge_no_array", propOrder = {
    "a1SurchargeNoRow"
})
public class A1SurchargeNoArray {

    @XmlElement(name = "a1_surcharge_no_row")
    protected List<A1SurchargeNoRow> a1SurchargeNoRow;

    public List<A1SurchargeNoRow> getA1SurchargeNoRow() {
        if (this.a1SurchargeNoRow == null) {
            this.a1SurchargeNoRow = new ArrayList<A1SurchargeNoRow>();
        }
        return this.a1SurchargeNoRow;
    }

}
