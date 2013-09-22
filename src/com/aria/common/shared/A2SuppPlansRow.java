package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_supp_plans_row", propOrder = {
    "a2SuppPlans"
    })
public class A2SuppPlansRow {

    @XmlElement(name = "a2_supp_plans")
    protected Long a2SuppPlans;
    public Long getA2SuppPlans() {
        return a2SuppPlans;
    }

    public void setA2SuppPlans(Long value) {
        this.a2SuppPlans = value;
    }

    
}
