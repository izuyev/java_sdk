package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surcharge_no_array", propOrder = {
    "surchargeNoRow"
})
public class SurchargeNoArray {

    @XmlElement(name = "surcharge_no_row")
    protected List<SurchargeNoRow> surchargeNoRow;

    public List<SurchargeNoRow> getSurchargeNoRow() {
        if (this.surchargeNoRow == null) {
            this.surchargeNoRow = new ArrayList<SurchargeNoRow>();
        }
        return this.surchargeNoRow;
    }

}
