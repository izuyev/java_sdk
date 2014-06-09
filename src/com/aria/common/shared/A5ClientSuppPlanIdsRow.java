package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_client_supp_plan_ids_row", propOrder = {
    "a5ClientSuppPlanIds"
    })
public class A5ClientSuppPlanIdsRow {

    @XmlElement(name = "a5_client_supp_plan_ids")
    protected String a5ClientSuppPlanIds;
    public String getA5ClientSuppPlanIds() {
        return a5ClientSuppPlanIds;
    }

    public void setA5ClientSuppPlanIds(String value) {
        this.a5ClientSuppPlanIds = value;
    }

    
}
