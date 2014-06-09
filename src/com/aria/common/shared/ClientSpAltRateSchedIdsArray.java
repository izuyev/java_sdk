package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_sp_alt_rate_sched_ids_array", propOrder = {
    "clientSpAltRateSchedIdsRow"
})
public class ClientSpAltRateSchedIdsArray {

    @XmlElement(name = "client_sp_alt_rate_sched_ids_row")
    protected List<ClientSpAltRateSchedIdsRow> clientSpAltRateSchedIdsRow;

    public List<ClientSpAltRateSchedIdsRow> getClientSpAltRateSchedIdsRow() {
        if (this.clientSpAltRateSchedIdsRow == null) {
            this.clientSpAltRateSchedIdsRow = new ArrayList<ClientSpAltRateSchedIdsRow>();
        }
        return this.clientSpAltRateSchedIdsRow;
    }

}
