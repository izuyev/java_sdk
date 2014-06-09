package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parent_plans_ReturnElement", propOrder = {"parentPlan"})
public class ParentPlansReturnElement {

    @XmlElement(name = "parent_plan")
    protected Long parentPlan;
    
    public Long getParentPlan() {
        return parentPlan;
    }

    public void setParentPlan(Long value) {
        this.parentPlan = value;
    }

    
}
