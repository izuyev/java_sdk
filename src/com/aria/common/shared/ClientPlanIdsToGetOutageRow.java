package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_plan_ids_to_get_outage_row", propOrder = {
    "clientPlanIdsToGetOutage"
    })
public class ClientPlanIdsToGetOutageRow {

    @XmlElement(name = "client_plan_ids_to_get_outage")
    protected String clientPlanIdsToGetOutage;
    public String getClientPlanIdsToGetOutage() {
        return clientPlanIdsToGetOutage;
    }

    public void setClientPlanIdsToGetOutage(String value) {
        this.clientPlanIdsToGetOutage = value;
    }

    
}
