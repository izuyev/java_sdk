package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_client_sp_alt_rate_sched_ids_array", propOrder = {
    "a5ClientSpAltRateSchedIdsRow"
})
public class A5ClientSpAltRateSchedIdsArray {

    @XmlElement(name = "a5_client_sp_alt_rate_sched_ids_row")
    protected List<A5ClientSpAltRateSchedIdsRow> a5ClientSpAltRateSchedIdsRow;

    public List<A5ClientSpAltRateSchedIdsRow> getA5ClientSpAltRateSchedIdsRow() {
        if (this.a5ClientSpAltRateSchedIdsRow == null) {
            this.a5ClientSpAltRateSchedIdsRow = new ArrayList<A5ClientSpAltRateSchedIdsRow>();
        }
        return this.a5ClientSpAltRateSchedIdsRow;
    }

}
