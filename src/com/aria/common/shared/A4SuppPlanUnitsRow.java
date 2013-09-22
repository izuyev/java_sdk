package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_supp_plan_units_row", propOrder = {
    "a4SuppPlanUnits"
    })
public class A4SuppPlanUnitsRow {

    @XmlElement(name = "a4_supp_plan_units")
    protected Long a4SuppPlanUnits;
    public Long getA4SuppPlanUnits() {
        return a4SuppPlanUnits;
    }

    public void setA4SuppPlanUnits(Long value) {
        this.a4SuppPlanUnits = value;
    }

    
}
