package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "child_plans_row", propOrder = {
    "childPlan"
    })
public class ChildPlansRow {

    @XmlElement(name = "child_plan")
    protected String childPlan;
    public String getChildPlan() {
        return childPlan;
    }

    public void setChildPlan(String value) {
        this.childPlan = value;
    }

    
}
