package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_supp_plan_units_row", propOrder = {
    "a5SuppPlanUnits"
    })
public class A5SuppPlanUnitsRow {

    @XmlElement(name = "a5_supp_plan_units")
    protected Long a5SuppPlanUnits;
    public Long getA5SuppPlanUnits() {
        return a5SuppPlanUnits;
    }

    public void setA5SuppPlanUnits(Long value) {
        this.a5SuppPlanUnits = value;
    }

    
}
