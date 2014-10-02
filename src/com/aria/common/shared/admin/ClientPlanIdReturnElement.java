package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_plan_id_ReturnElement", propOrder = {"clientPlanIds"})
public class ClientPlanIdReturnElement {

    @XmlElement(name = "client_plan_ids")
    protected Long clientPlanIds;
    
    public Long getClientPlanIds() {
        return clientPlanIds;
    }

    public void setClientPlanIds(Long value) {
        this.clientPlanIds = value;
    }

    
}
