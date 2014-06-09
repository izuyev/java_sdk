package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_client_sp_alt_rate_sched_ids_array", propOrder = {
    "a3ClientSpAltRateSchedIdsRow"
})
public class A3ClientSpAltRateSchedIdsArray {

    @XmlElement(name = "a3_client_sp_alt_rate_sched_ids_row")
    protected List<A3ClientSpAltRateSchedIdsRow> a3ClientSpAltRateSchedIdsRow;

    public List<A3ClientSpAltRateSchedIdsRow> getA3ClientSpAltRateSchedIdsRow() {
        if (this.a3ClientSpAltRateSchedIdsRow == null) {
            this.a3ClientSpAltRateSchedIdsRow = new ArrayList<A3ClientSpAltRateSchedIdsRow>();
        }
        return this.a3ClientSpAltRateSchedIdsRow;
    }

}
