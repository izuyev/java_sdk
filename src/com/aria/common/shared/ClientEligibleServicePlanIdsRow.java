package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_eligible_service_plan_ids_row", propOrder = {
    "clientPlanId",
    "clientServiceId"
    })
public class ClientEligibleServicePlanIdsRow {

    @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
    @XmlElement(name = "client_service_id")
    protected String clientServiceId;
    public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String value) {
        this.clientPlanId = value;
    }

    public String getClientServiceId() {
        return clientServiceId;
    }

    public void setClientServiceId(String value) {
        this.clientServiceId = value;
    }

    
}
