package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_supp_plans_row", propOrder = {
    "a1SuppPlans"
    })
public class A1SuppPlansRow {

    @XmlElement(name = "a1_supp_plans")
    protected Long a1SuppPlans;
    public Long getA1SuppPlans() {
        return a1SuppPlans;
    }

    public void setA1SuppPlans(Long value) {
        this.a1SuppPlans = value;
    }

    
}
