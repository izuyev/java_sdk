package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_client_supp_plan_ids_row", propOrder = {
    "a1ClientSuppPlanIds"
    })
public class A1ClientSuppPlanIdsRow {

    @XmlElement(name = "a1_client_supp_plan_ids")
    protected String a1ClientSuppPlanIds;
    public String getA1ClientSuppPlanIds() {
        return a1ClientSuppPlanIds;
    }

    public void setA1ClientSuppPlanIds(String value) {
        this.a1ClientSuppPlanIds = value;
    }

    
}
