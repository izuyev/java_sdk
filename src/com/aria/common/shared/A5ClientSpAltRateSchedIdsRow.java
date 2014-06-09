package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_client_sp_alt_rate_sched_ids_row", propOrder = {
    "a5ClientSpAltRateSchedIds"
    })
public class A5ClientSpAltRateSchedIdsRow {

    @XmlElement(name = "a5_client_sp_alt_rate_sched_ids")
    protected String a5ClientSpAltRateSchedIds;
    public String getA5ClientSpAltRateSchedIds() {
        return a5ClientSpAltRateSchedIds;
    }

    public void setA5ClientSpAltRateSchedIds(String value) {
        this.a5ClientSpAltRateSchedIds = value;
    }

    
}
