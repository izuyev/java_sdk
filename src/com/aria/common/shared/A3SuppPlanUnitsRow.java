package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_supp_plan_units_row", propOrder = {
    "a3SuppPlanUnits"
    })
public class A3SuppPlanUnitsRow {

    @XmlElement(name = "a3_supp_plan_units")
    protected Long a3SuppPlanUnits;
    public Long getA3SuppPlanUnits() {
        return a3SuppPlanUnits;
    }

    public void setA3SuppPlanUnits(Long value) {
        this.a3SuppPlanUnits = value;
    }

    
}
