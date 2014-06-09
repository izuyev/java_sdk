package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parent_plans_row", propOrder = {
    "parentPlan"
    })
public class ParentPlansRow {

    @XmlElement(name = "parent_plan")
    protected Long parentPlan;
    public Long getParentPlan() {
        return parentPlan;
    }

    public void setParentPlan(Long value) {
        this.parentPlan = value;
    }

    
}
