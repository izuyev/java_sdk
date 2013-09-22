package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plans_to_get_outage_array", propOrder = {
    "plansToGetOutageRow"
})
public class PlansToGetOutageArray {

    @XmlElement(name = "plans_to_get_outage_row")
    protected List<PlansToGetOutageRow> plansToGetOutageRow;

    public List<PlansToGetOutageRow> getPlansToGetOutageRow() {
        if (this.plansToGetOutageRow == null) {
            this.plansToGetOutageRow = new ArrayList<PlansToGetOutageRow>();
        }
        return this.plansToGetOutageRow;
    }

}
