package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_supp_plans_row", propOrder = {
    "a4SuppPlans"
    })
public class A4SuppPlansRow {

    @XmlElement(name = "a4_supp_plans")
    protected Long a4SuppPlans;
    public Long getA4SuppPlans() {
        return a4SuppPlans;
    }

    public void setA4SuppPlans(Long value) {
        this.a4SuppPlans = value;
    }

    
}
