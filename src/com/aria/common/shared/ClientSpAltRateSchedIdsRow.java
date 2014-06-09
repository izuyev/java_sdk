package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_sp_alt_rate_sched_ids_row", propOrder = {
    "clientSpAltRateSchedIds"
    })
public class ClientSpAltRateSchedIdsRow {

    @XmlElement(name = "client_sp_alt_rate_sched_ids")
    protected String clientSpAltRateSchedIds;
    public String getClientSpAltRateSchedIds() {
        return clientSpAltRateSchedIds;
    }

    public void setClientSpAltRateSchedIds(String value) {
        this.clientSpAltRateSchedIds = value;
    }

    
}
