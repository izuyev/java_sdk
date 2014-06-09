package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_client_sp_alt_rate_sched_ids_array", propOrder = {
    "a2ClientSpAltRateSchedIdsRow"
})
public class A2ClientSpAltRateSchedIdsArray {

    @XmlElement(name = "a2_client_sp_alt_rate_sched_ids_row")
    protected List<A2ClientSpAltRateSchedIdsRow> a2ClientSpAltRateSchedIdsRow;

    public List<A2ClientSpAltRateSchedIdsRow> getA2ClientSpAltRateSchedIdsRow() {
        if (this.a2ClientSpAltRateSchedIdsRow == null) {
            this.a2ClientSpAltRateSchedIdsRow = new ArrayList<A2ClientSpAltRateSchedIdsRow>();
        }
        return this.a2ClientSpAltRateSchedIdsRow;
    }

}
