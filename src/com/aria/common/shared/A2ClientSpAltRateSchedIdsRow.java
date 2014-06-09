package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_client_sp_alt_rate_sched_ids_row", propOrder = {
    "a2ClientSpAltRateSchedIds"
    })
public class A2ClientSpAltRateSchedIdsRow {

    @XmlElement(name = "a2_client_sp_alt_rate_sched_ids")
    protected String a2ClientSpAltRateSchedIds;
    public String getA2ClientSpAltRateSchedIds() {
        return a2ClientSpAltRateSchedIds;
    }

    public void setA2ClientSpAltRateSchedIds(String value) {
        this.a2ClientSpAltRateSchedIds = value;
    }

    
}
