package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_supp_plan_units_row", propOrder = {
    "a2SuppPlanUnits"
    })
public class A2SuppPlanUnitsRow {

    @XmlElement(name = "a2_supp_plan_units")
    protected Long a2SuppPlanUnits;
    public Long getA2SuppPlanUnits() {
        return a2SuppPlanUnits;
    }

    public void setA2SuppPlanUnits(Long value) {
        this.a2SuppPlanUnits = value;
    }

    
}
