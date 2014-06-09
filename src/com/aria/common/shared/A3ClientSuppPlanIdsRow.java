package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_client_supp_plan_ids_row", propOrder = {
    "a3ClientSuppPlanIds"
    })
public class A3ClientSuppPlanIdsRow {

    @XmlElement(name = "a3_client_supp_plan_ids")
    protected String a3ClientSuppPlanIds;
    public String getA3ClientSuppPlanIds() {
        return a3ClientSuppPlanIds;
    }

    public void setA3ClientSuppPlanIds(String value) {
        this.a3ClientSuppPlanIds = value;
    }

    
}
