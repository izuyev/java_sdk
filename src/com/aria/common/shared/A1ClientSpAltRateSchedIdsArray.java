package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_client_sp_alt_rate_sched_ids_array", propOrder = {
    "a1ClientSpAltRateSchedIdsRow"
})
public class A1ClientSpAltRateSchedIdsArray {

    @XmlElement(name = "a1_client_sp_alt_rate_sched_ids_row")
    protected List<A1ClientSpAltRateSchedIdsRow> a1ClientSpAltRateSchedIdsRow;

    public List<A1ClientSpAltRateSchedIdsRow> getA1ClientSpAltRateSchedIdsRow() {
        if (this.a1ClientSpAltRateSchedIdsRow == null) {
            this.a1ClientSpAltRateSchedIdsRow = new ArrayList<A1ClientSpAltRateSchedIdsRow>();
        }
        return this.a1ClientSpAltRateSchedIdsRow;
    }

}
