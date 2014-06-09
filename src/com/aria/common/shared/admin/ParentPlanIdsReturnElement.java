package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parent_plan_ids_ReturnElement", propOrder = {"parentPlanId"})
public class ParentPlanIdsReturnElement {

    @XmlElement(name = "parent_plan_id")
    protected String parentPlanId;
    
    public String getParentPlanId() {
        return parentPlanId;
    }

    public void setParentPlanId(String value) {
        this.parentPlanId = value;
    }

    
}
