package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_plan_units_row", propOrder = {
    "suppPlanUnits"
    })
public class SuppPlanUnitsRow {

    @XmlElement(name = "supp_plan_units")
    protected Long suppPlanUnits;
    public Long getSuppPlanUnits() {
        return suppPlanUnits;
    }

    public void setSuppPlanUnits(Long value) {
        this.suppPlanUnits = value;
    }

    
}
