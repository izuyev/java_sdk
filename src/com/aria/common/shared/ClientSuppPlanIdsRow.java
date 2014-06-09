package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_supp_plan_ids_row", propOrder = {
    "clientSuppPlanIds"
    })
public class ClientSuppPlanIdsRow {

    @XmlElement(name = "client_supp_plan_ids")
    protected String clientSuppPlanIds;
    public String getClientSuppPlanIds() {
        return clientSuppPlanIds;
    }

    public void setClientSuppPlanIds(String value) {
        this.clientSuppPlanIds = value;
    }

    
}
