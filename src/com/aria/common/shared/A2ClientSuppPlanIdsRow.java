package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_client_supp_plan_ids_row", propOrder = {
    "a2ClientSuppPlanIds"
    })
public class A2ClientSuppPlanIdsRow {

    @XmlElement(name = "a2_client_supp_plan_ids")
    protected String a2ClientSuppPlanIds;
    public String getA2ClientSuppPlanIds() {
        return a2ClientSuppPlanIds;
    }

    public void setA2ClientSuppPlanIds(String value) {
        this.a2ClientSuppPlanIds = value;
    }

    
}
