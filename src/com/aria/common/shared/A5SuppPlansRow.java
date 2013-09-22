package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_supp_plans_row", propOrder = {
    "a5SuppPlans"
    })
public class A5SuppPlansRow {

    @XmlElement(name = "a5_supp_plans")
    protected Long a5SuppPlans;
    public Long getA5SuppPlans() {
        return a5SuppPlans;
    }

    public void setA5SuppPlans(Long value) {
        this.a5SuppPlans = value;
    }

    
}
