package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_supp_plans_row", propOrder = {
    "a3SuppPlans"
    })
public class A3SuppPlansRow {

    @XmlElement(name = "a3_supp_plans")
    protected Long a3SuppPlans;
    public Long getA3SuppPlans() {
        return a3SuppPlans;
    }

    public void setA3SuppPlans(Long value) {
        this.a3SuppPlans = value;
    }

    
}
