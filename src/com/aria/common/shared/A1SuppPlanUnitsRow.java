package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_supp_plan_units_row", propOrder = {
    "a1SuppPlanUnits"
    })
public class A1SuppPlanUnitsRow {

    @XmlElement(name = "a1_supp_plan_units")
    protected Long a1SuppPlanUnits;
    public Long getA1SuppPlanUnits() {
        return a1SuppPlanUnits;
    }

    public void setA1SuppPlanUnits(Long value) {
        this.a1SuppPlanUnits = value;
    }

    
}
