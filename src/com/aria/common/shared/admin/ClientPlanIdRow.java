package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_plan_id_row", propOrder = {
    "clientPlanIds"
    })
public class ClientPlanIdRow {

    @XmlElement(name = "client_plan_ids")
    protected String clientPlanIds;
    public String getClientPlanIds() {
        return clientPlanIds;
    }

    public void setClientPlanIds(String value) {
        this.clientPlanIds = value;
    }

    
}
