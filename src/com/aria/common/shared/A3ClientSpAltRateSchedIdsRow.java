package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_client_sp_alt_rate_sched_ids_row", propOrder = {
    "a3ClientSpAltRateSchedIds"
    })
public class A3ClientSpAltRateSchedIdsRow {

    @XmlElement(name = "a3_client_sp_alt_rate_sched_ids")
    protected String a3ClientSpAltRateSchedIds;
    public String getA3ClientSpAltRateSchedIds() {
        return a3ClientSpAltRateSchedIds;
    }

    public void setA3ClientSpAltRateSchedIds(String value) {
        this.a3ClientSpAltRateSchedIds = value;
    }

    
}
