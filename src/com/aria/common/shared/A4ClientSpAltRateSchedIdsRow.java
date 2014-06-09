package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_client_sp_alt_rate_sched_ids_row", propOrder = {
    "a4ClientSpAltRateSchedIds"
    })
public class A4ClientSpAltRateSchedIdsRow {

    @XmlElement(name = "a4_client_sp_alt_rate_sched_ids")
    protected String a4ClientSpAltRateSchedIds;
    public String getA4ClientSpAltRateSchedIds() {
        return a4ClientSpAltRateSchedIds;
    }

    public void setA4ClientSpAltRateSchedIds(String value) {
        this.a4ClientSpAltRateSchedIds = value;
    }

    
}
