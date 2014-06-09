package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_nos_row", propOrder = {
    "planNos"
    })
public class PlanNosRow {

    @XmlElement(name = "plan_nos")
    protected Long planNos;
    public Long getPlanNos() {
        return planNos;
    }

    public void setPlanNos(Long value) {
        this.planNos = value;
    }

    
}
