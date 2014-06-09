package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exclusion_plans_ReturnElement", propOrder = {"exclusionPlan"})
public class ExclusionPlansReturnElement {

    @XmlElement(name = "exclusion_plan")
    protected Long exclusionPlan;
    
    public Long getExclusionPlan() {
        return exclusionPlan;
    }

    public void setExclusionPlan(Long value) {
        this.exclusionPlan = value;
    }

    
}
