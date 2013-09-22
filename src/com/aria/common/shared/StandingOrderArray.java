package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "standing_order_array", propOrder = {
    "standingOrderRow"
})
public class StandingOrderArray {

    @XmlElement(name = "standing_order_row")
    protected List<StandingOrderRow> standingOrderRow;

    public List<StandingOrderRow> getStandingOrderRow() {
        if (this.standingOrderRow == null) {
            this.standingOrderRow = new ArrayList<StandingOrderRow>();
        }
        return this.standingOrderRow;
    }

}
