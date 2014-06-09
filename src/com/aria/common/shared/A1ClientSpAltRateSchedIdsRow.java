package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_client_sp_alt_rate_sched_ids_row", propOrder = {
    "a1ClientSpAltRateSchedIds"
    })
public class A1ClientSpAltRateSchedIdsRow {

    @XmlElement(name = "a1_client_sp_alt_rate_sched_ids")
    protected String a1ClientSpAltRateSchedIds;
    public String getA1ClientSpAltRateSchedIds() {
        return a1ClientSpAltRateSchedIds;
    }

    public void setA1ClientSpAltRateSchedIds(String value) {
        this.a1ClientSpAltRateSchedIds = value;
    }

    
}
