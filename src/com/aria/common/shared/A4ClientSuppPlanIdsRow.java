package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_client_supp_plan_ids_row", propOrder = {
    "a4ClientSuppPlanIds"
    })
public class A4ClientSuppPlanIdsRow {

    @XmlElement(name = "a4_client_supp_plan_ids")
    protected String a4ClientSuppPlanIds;
    public String getA4ClientSuppPlanIds() {
        return a4ClientSuppPlanIds;
    }

    public void setA4ClientSuppPlanIds(String value) {
        this.a4ClientSuppPlanIds = value;
    }

    
}
