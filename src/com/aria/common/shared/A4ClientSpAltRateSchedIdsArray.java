package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_client_sp_alt_rate_sched_ids_array", propOrder = {
    "a4ClientSpAltRateSchedIdsRow"
})
public class A4ClientSpAltRateSchedIdsArray {

    @XmlElement(name = "a4_client_sp_alt_rate_sched_ids_row")
    protected List<A4ClientSpAltRateSchedIdsRow> a4ClientSpAltRateSchedIdsRow;

    public List<A4ClientSpAltRateSchedIdsRow> getA4ClientSpAltRateSchedIdsRow() {
        if (this.a4ClientSpAltRateSchedIdsRow == null) {
            this.a4ClientSpAltRateSchedIdsRow = new ArrayList<A4ClientSpAltRateSchedIdsRow>();
        }
        return this.a4ClientSpAltRateSchedIdsRow;
    }

}
