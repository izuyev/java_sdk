package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_plans_row", propOrder = {
    "suppPlans"
    })
public class SuppPlansRow {

    @XmlElement(name = "supp_plans")
    protected Long suppPlans;
    public Long getSuppPlans() {
        return suppPlans;
    }

    public void setSuppPlans(Long value) {
        this.suppPlans = value;
    }

    
}
